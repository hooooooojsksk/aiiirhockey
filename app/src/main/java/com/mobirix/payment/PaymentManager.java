package com.mobirix.payment;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.mobirix.payment.PaymentManager;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class PaymentManager implements PurchasesUpdatedListener, BillingClientStateListener, VerifySignatureListener {
    private static final boolean DEBUG_ON = false;
    private static final long RECONNECT_TIMER_MAX_TIME_MILLISECONDS = 900000;
    private static final long RECONNECT_TIMER_START_MILLISECONDS = 1000;
    private static final String TAG = "PaymentManager";
    private static Activity activity = null;
    private static boolean bConnected = false;
    public static boolean bInitialized = false;
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static PaymentManager instance = null;
    private AcknowledgePurchaseResponseListener mAcknowledgePurchaseResponseListener;
    private BillingClient mBillingClient;
    private ConsumeResponseListener mConsumeListener;
    private long reconnectMilliseconds = RECONNECT_TIMER_START_MILLISECONDS;
    public List<ProductDetails> mSkuDetailsList_item = new ArrayList();
    private BillingClientStateListener mBillingClientStateListener = null;
    private ConsumeResponseListener userConsumeListener = null;
    private AcknowledgePurchaseResponseListener userAcknowledgePurchaseResponseListener = null;
    private ProductDetailsResponseListener mSkuDetailsResponselistener = null;
    private PurchaseListener mPurchaseListener = null;
    List<String> mSkuIdList = new ArrayList();
    List<String> mNoConsumeSkuIdList = new ArrayList();
    List<String> mSubscriptionSKUs = new ArrayList();

    public static native int NativeonPurchasedEnd(String str);

    private void retryBillingServiceConnectionWithExponentialBackoff() {
    }

    public BillingClientStateListener getmBillingClientStateListener() {
        return this.mBillingClientStateListener;
    }

    public void setmBillingClientStateListener(BillingClientStateListener billingClientStateListener) {
        this.mBillingClientStateListener = billingClientStateListener;
    }

    public ProductDetailsResponseListener getmSkuDetailsResponselistener() {
        return this.mSkuDetailsResponselistener;
    }

    public void setmSkuDetailsResponselistener(ProductDetailsResponseListener productDetailsResponseListener) {
        this.mSkuDetailsResponselistener = productDetailsResponseListener;
    }

    public PurchaseListener getmPurchaseListener() {
        return this.mPurchaseListener;
    }

    public void setmPurchaseListener(PurchaseListener purchaseListener) {
        this.mPurchaseListener = purchaseListener;
    }

    public ConsumeResponseListener getUserConsumeListener() {
        return this.userConsumeListener;
    }

    public void setUserConsumeListener(ConsumeResponseListener consumeResponseListener) {
        this.userConsumeListener = consumeResponseListener;
    }

    public AcknowledgePurchaseResponseListener getUserAcknowledgePurchaseResponseListener() {
        return this.userAcknowledgePurchaseResponseListener;
    }

    public void setUserAcknowledgePurchaseResponseListener(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        this.userAcknowledgePurchaseResponseListener = acknowledgePurchaseResponseListener;
    }

    public void resetmSkuIdList(List<String> list) {
        if (list == null) {
            return;
        }
        this.mSkuIdList.clear();
        this.mSkuIdList.addAll(list);
    }

    public void resetmNoConsumeSkuIdList(List<String> list) {
        if (list == null) {
            return;
        }
        this.mNoConsumeSkuIdList.clear();
        this.mNoConsumeSkuIdList.addAll(list);
    }

    public void resetmSubscriptionSKUs(List<String> list) {
        if (list == null) {
            return;
        }
        this.mSubscriptionSKUs.clear();
        this.mSubscriptionSKUs.addAll(list);
    }

    private PaymentManager(Activity activity2) {
        activity = activity2;
        this.mBillingClient = BillingClient.newBuilder(activity2).setListener(this).enablePendingPurchases().build();
    }

    public void destroy() {
        if (instance == null || !this.mBillingClient.isReady()) {
            return;
        }
        this.mBillingClient.endConnection();
        bInitialized = false;
        bConnected = false;
    }

    public static synchronized PaymentManager getInstance(Activity activity2) {
        PaymentManager paymentManager;
        synchronized (PaymentManager.class) {
            if (instance == null) {
                instance = new PaymentManager(activity2);
            }
            paymentManager = instance;
        }
        return paymentManager;
    }

    public void initialize(BillingClientStateListener billingClientStateListener, ProductDetailsResponseListener productDetailsResponseListener, PurchaseListener purchaseListener) {
        if (bConnected || bInitialized) {
            return;
        }
        bInitialized = true;
        this.mSkuDetailsList_item.clear();
        this.mSkuIdList.clear();
        this.mNoConsumeSkuIdList.clear();
        this.mSubscriptionSKUs.clear();
        this.mBillingClientStateListener = billingClientStateListener;
        this.mSkuDetailsResponselistener = productDetailsResponseListener;
        this.mPurchaseListener = purchaseListener;
        this.mConsumeListener = new ConsumeResponseListener() { // from class: com.mobirix.payment.PaymentManager.1
            @Override // com.android.billingclient.api.ConsumeResponseListener
            public void onConsumeResponse(BillingResult billingResult, String str) {
                if (PaymentManager.this.userConsumeListener != null) {
                    PaymentManager.this.userConsumeListener.onConsumeResponse(billingResult, str);
                }
                if (billingResult.getResponseCode() == 0 || PaymentManager.this.mPurchaseListener == null) {
                    return;
                }
                PaymentManager.this.mPurchaseListener.onFail();
            }
        };
        this.mAcknowledgePurchaseResponseListener = new AcknowledgePurchaseResponseListener() { // from class: com.mobirix.payment.PaymentManager.2
            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
            public void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                if (PaymentManager.this.userAcknowledgePurchaseResponseListener != null) {
                    PaymentManager.this.userAcknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
                }
                if (billingResult.getResponseCode() == 0 || PaymentManager.this.mPurchaseListener == null) {
                    return;
                }
                PaymentManager.this.mPurchaseListener.onFail();
            }
        };
        connect();
    }

    private void connect() {
        if (bConnected || !bInitialized || this.mBillingClient.isReady()) {
            return;
        }
        this.mBillingClient.startConnection(this);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingSetupFinished(BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            this.reconnectMilliseconds = RECONNECT_TIMER_START_MILLISECONDS;
            bConnected = true;
        }
        BillingClientStateListener billingClientStateListener = this.mBillingClientStateListener;
        if (billingClientStateListener != null) {
            billingClientStateListener.onBillingSetupFinished(billingResult);
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        BillingClientStateListener billingClientStateListener = this.mBillingClientStateListener;
        if (billingClientStateListener != null) {
            billingClientStateListener.onBillingServiceDisconnected();
        }
        bConnected = false;
    }

    public void getSkuDetailsAsync() {
        if (bConnected) {
            List<String> list = this.mSkuIdList;
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (String str : this.mSkuIdList) {
                    arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId(str).setProductType("inapp").build());
                }
                QueryProductDetailsParams.Builder newBuilder = QueryProductDetailsParams.newBuilder();
                newBuilder.setProductList(arrayList);
                this.mBillingClient.queryProductDetailsAsync(newBuilder.build(), new ProductDetailsResponseListener() { // from class: com.mobirix.payment.PaymentManager.3
                    @Override // com.android.billingclient.api.ProductDetailsResponseListener
                    public void onProductDetailsResponse(BillingResult billingResult, List<ProductDetails> list2) {
                        if (PaymentManager.this.mSkuDetailsResponselistener != null) {
                            PaymentManager.this.mSkuDetailsResponselistener.onProductDetailsResponse(billingResult, list2);
                        }
                        if (billingResult == null || billingResult.getResponseCode() != 0 || list2 == null) {
                            return;
                        }
                        PaymentManager.this.mSkuDetailsList_item.addAll(list2);
                    }
                });
            }
            List<String> list2 = this.mSubscriptionSKUs;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : this.mSubscriptionSKUs) {
                arrayList2.add(QueryProductDetailsParams.Product.newBuilder().setProductId(str2).setProductType("subs").build());
            }
            QueryProductDetailsParams.Builder newBuilder2 = QueryProductDetailsParams.newBuilder();
            newBuilder2.setProductList(arrayList2);
            this.mBillingClient.queryProductDetailsAsync(newBuilder2.build(), new ProductDetailsResponseListener() { // from class: com.mobirix.payment.PaymentManager.4
                @Override // com.android.billingclient.api.ProductDetailsResponseListener
                public void onProductDetailsResponse(BillingResult billingResult, List<ProductDetails> list3) {
                    if (PaymentManager.this.mSkuDetailsResponselistener != null) {
                        PaymentManager.this.mSkuDetailsResponselistener.onProductDetailsResponse(billingResult, list3);
                    }
                    if (billingResult == null || billingResult.getResponseCode() != 0 || list3 == null) {
                        return;
                    }
                    PaymentManager.this.mSkuDetailsList_item.addAll(list3);
                }
            });
        }
    }

    public void queryPurchases() {
        if (bConnected) {
            this.mBillingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new PurchasesResponseListener() { // from class: com.mobirix.payment.PaymentManager.5
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
                    if (billingResult == null || billingResult.getResponseCode() != 0 || list == null) {
                        return;
                    }
                    for (int i = 0; i < list.size(); i++) {
                        Purchase purchase = list.get(i);
                        if (purchase.getPurchaseState() == 1) {
                            PaymentManager.this.handlePurchase(purchase);
                        } else {
                            purchase.getPurchaseState();
                        }
                    }
                }
            });
        }
    }

    public void querySubPurchases() {
        if (bConnected) {
            this.mBillingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("subs").build(), new PurchasesResponseListener() { // from class: com.mobirix.payment.PaymentManager.6
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
                    if (billingResult == null || billingResult.getResponseCode() != 0 || list == null) {
                        return;
                    }
                    for (int i = 0; i < list.size(); i++) {
                        Purchase purchase = list.get(i);
                        if (purchase.getPurchaseState() == 1) {
                            PaymentManager.this.handlePurchase(purchase);
                        } else {
                            purchase.getPurchaseState();
                        }
                    }
                }
            });
        }
    }

    public void getQueryPurchasesAsync(final PurchaseAsyncListener purchaseAsyncListener) {
        if (bConnected) {
            this.mBillingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new PurchasesResponseListener() { // from class: com.mobirix.payment.PaymentManager.7
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
                    if (billingResult.getResponseCode() != 0) {
                        return;
                    }
                    purchaseAsyncListener.onResponse(billingResult, list);
                }
            });
        }
    }

    public void getSubQueryPurchasesAsync(final PurchaseAsyncListener purchaseAsyncListener) {
        if (bConnected) {
            this.mBillingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("subs").build(), new PurchasesResponseListener() { // from class: com.mobirix.payment.PaymentManager.8
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    if (billingResult.getResponseCode() != 0) {
                        return;
                    }
                    purchaseAsyncListener.onResponse(billingResult, list);
                }
            });
        }
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        PurchaseListener purchaseListener;
        if (billingResult == null) {
            PurchaseListener purchaseListener2 = this.mPurchaseListener;
            if (purchaseListener2 != null) {
                purchaseListener2.onFail();
            }
        } else if (billingResult.getResponseCode() == 0 && list != null) {
            for (Purchase purchase : list) {
                handlePurchase(purchase);
            }
        } else if (billingResult.getResponseCode() == 1) {
            PurchaseListener purchaseListener3 = this.mPurchaseListener;
            if (purchaseListener3 != null) {
                purchaseListener3.onFail();
            }
        } else if (billingResult.getResponseCode() == -1) {
            PurchaseListener purchaseListener4 = this.mPurchaseListener;
            if (purchaseListener4 != null) {
                purchaseListener4.onFail();
            }
        } else if (billingResult.getResponseCode() != 7 && (purchaseListener = this.mPurchaseListener) != null) {
            purchaseListener.onFail();
        }
    }

    void handlePurchase(final Purchase purchase) {
        if (bConnected) {
            if (purchase.getPurchaseState() == 1) {
                for (String str : purchase.getProducts()) {
                    if ((this.mNoConsumeSkuIdList.contains(str) && purchase.isAcknowledged()) ? false : true) {
                        final VerifySignatureValidAsyncTask verifySignatureValidAsyncTask = new VerifySignatureValidAsyncTask(this, str);
                        handler.postDelayed(new Runnable() { // from class: com.mobirix.payment.PaymentManager$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                PaymentManager.VerifySignatureValidAsyncTask.this.execute(purchase);
                            }
                        }, RECONNECT_TIMER_START_MILLISECONDS);
                    }
                }
                return;
            }
            purchase.getPurchaseState();
        }
    }

    @Override // com.mobirix.payment.VerifySignatureListener
    public void onVerifySignatureResponse(boolean z, Purchase purchase) {
        if (z) {
            PurchaseListener purchaseListener = this.mPurchaseListener;
            if (purchaseListener != null) {
                purchaseListener.onSuccess(purchase);
            }
            for (String str : this.mNoConsumeSkuIdList) {
                for (String str2 : purchase.getProducts()) {
                    if (str2.equals(str)) {
                        if (purchase.isAcknowledged()) {
                            return;
                        }
                        this.mBillingClient.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), this.mAcknowledgePurchaseResponseListener);
                        return;
                    }
                }
            }
            this.mBillingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), this.mConsumeListener);
            return;
        }
        PurchaseListener purchaseListener2 = this.mPurchaseListener;
        if (purchaseListener2 != null) {
            purchaseListener2.onFail();
        }
    }

    public void purchase(String str) {
        purchase(str, activity);
    }

    private void purchase(String str, Activity activity2) {
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails;
        if (bConnected && bInitialized) {
            ProductDetails productDetails = null;
            if (this.mSkuDetailsList_item != null) {
                int i = 0;
                while (true) {
                    if (i >= this.mSkuDetailsList_item.size()) {
                        break;
                    }
                    ProductDetails productDetails2 = this.mSkuDetailsList_item.get(i);
                    if (productDetails2.getProductId().equals(str)) {
                        productDetails = productDetails2;
                        break;
                    }
                    i++;
                }
                if (productDetails != null) {
                    String offerToken = (!this.mSubscriptionSKUs.contains(productDetails.getProductId()) || (subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails()) == null) ? "" : subscriptionOfferDetails.get(0).getOfferToken();
                    ArrayList arrayList = new ArrayList();
                    if (productDetails.getProductType().equals("subs")) {
                        arrayList.add(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).setOfferToken(offerToken).build());
                    } else {
                        arrayList.add(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).build());
                    }
                    this.mBillingClient.launchBillingFlow(activity2, BillingFlowParams.newBuilder().setProductDetailsParamsList(arrayList).build());
                    return;
                }
                Log.d(TAG, "SKU is null. " + str);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class VerifySignatureValidAsyncTask extends AsyncTask<Purchase, Void, Boolean> {
        VerifySignatureListener listener;
        String product;
        Purchase purchase = null;

        VerifySignatureValidAsyncTask(VerifySignatureListener verifySignatureListener, String str) {
            PaymentManager.this = r1;
            this.listener = verifySignatureListener;
            this.product = str;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override // android.os.AsyncTask
        public Boolean doInBackground(Purchase... purchaseArr) {
            String str;
            HttpURLConnection httpURLConnection;
            boolean z = false;
            Purchase purchase = purchaseArr[0];
            this.purchase = purchase;
            if (purchase == null) {
                return false;
            }
            HttpURLConnection httpURLConnection2 = null;
            try {
                String encode = URLEncoder.encode(purchase.getPackageName(), "UTF-8");
                String encode2 = URLEncoder.encode(this.product, "UTF-8");
                String encode3 = URLEncoder.encode(this.purchase.getPurchaseToken(), "UTF-8");
                boolean z2 = false;
                for (String str2 : this.purchase.getProducts()) {
                    if (PaymentManager.this.mSubscriptionSKUs.contains(str2)) {
                        z2 = true;
                    }
                }
                str = "package=" + encode + "&pid=" + encode2 + "&token=" + encode3 + "&inapp=" + URLEncoder.encode(z2 ? "subs" : "normal", "UTF-8");
                httpURLConnection = (HttpURLConnection) new URL("https://newreceipt.mobirix.net/VerifyServer/GoogleVerify.aspx").openConnection();
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDefaultUseCaches(false);
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.write(str.getBytes("UTF-8"));
                dataOutputStream.flush();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                String readLine = bufferedReader.readLine();
                dataOutputStream.close();
                bufferedReader.close();
                if (readLine != null && readLine.equals("OK")) {
                    if (readLine.length() == 2) {
                        z = true;
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Exception unused2) {
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return Boolean.valueOf(z);
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
            return Boolean.valueOf(z);
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            VerifySignatureListener verifySignatureListener = this.listener;
            if (verifySignatureListener != null) {
                verifySignatureListener.onVerifySignatureResponse(bool.booleanValue(), this.purchase);
            }
        }
    }
}
