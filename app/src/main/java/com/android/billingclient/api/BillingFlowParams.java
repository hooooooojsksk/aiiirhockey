package com.android.billingclient.api;

import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public class BillingFlowParams {
    public static final String EXTRA_PARAM_KEY_ACCOUNT_ID = "accountId";
    private boolean zza;
    private String zzb;
    private String zzc;
    private SubscriptionUpdateParams zzd;
    private com.google.android.gms.internal.play_billing.zzu zze;
    private ArrayList zzf;
    private boolean zzg;

    /* compiled from: com.android.billingclient:billing@@5.0.0 */
    /* loaded from: classes.dex */
    public static class Builder {
        private String zza;
        private String zzb;
        private List zzc;
        private ArrayList zzd;
        private boolean zze;
        private SubscriptionUpdateParams.Builder zzf;

        private Builder() {
            SubscriptionUpdateParams.Builder newBuilder = SubscriptionUpdateParams.newBuilder();
            SubscriptionUpdateParams.Builder.zza(newBuilder);
            this.zzf = newBuilder;
        }

        public BillingFlowParams build() {
            com.google.android.gms.internal.play_billing.zzu zzl;
            ArrayList arrayList = this.zzd;
            boolean z = true;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.zzc;
            boolean z3 = (list == null || list.isEmpty()) ? false : true;
            if (z2 || z3) {
                if (!z2 || !z3) {
                    if (!z2) {
                        ProductDetailsParams productDetailsParams = (ProductDetailsParams) this.zzc.get(0);
                        for (int i = 0; i < this.zzc.size(); i++) {
                            ProductDetailsParams productDetailsParams2 = (ProductDetailsParams) this.zzc.get(i);
                            if (productDetailsParams2 != null) {
                                if (i != 0 && !productDetailsParams2.zza().getProductType().equals(productDetailsParams.zza().getProductType()) && !productDetailsParams2.zza().getProductType().equals("play_pass_subs")) {
                                    throw new IllegalArgumentException("All products should have same ProductType.");
                                }
                            } else {
                                throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                            }
                        }
                        String zza = productDetailsParams.zza().zza();
                        for (ProductDetailsParams productDetailsParams3 : this.zzc) {
                            if (!productDetailsParams.zza().getProductType().equals("play_pass_subs") && !productDetailsParams3.zza().getProductType().equals("play_pass_subs") && !zza.equals(productDetailsParams3.zza().zza())) {
                                throw new IllegalArgumentException("All products must have the same package name.");
                            }
                        }
                    } else if (this.zzd.contains(null)) {
                        throw new IllegalArgumentException("SKU cannot be null.");
                    } else {
                        if (this.zzd.size() > 1) {
                            SkuDetails skuDetails = (SkuDetails) this.zzd.get(0);
                            String type = skuDetails.getType();
                            ArrayList arrayList2 = this.zzd;
                            int size = arrayList2.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i2);
                                if (!type.equals("play_pass_subs") && !skuDetails2.getType().equals("play_pass_subs") && !type.equals(skuDetails2.getType())) {
                                    throw new IllegalArgumentException("SKUs should have the same type.");
                                }
                            }
                            String zzd = skuDetails.zzd();
                            ArrayList arrayList3 = this.zzd;
                            int size2 = arrayList3.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i3);
                                if (!type.equals("play_pass_subs") && !skuDetails3.getType().equals("play_pass_subs") && !zzd.equals(skuDetails3.zzd())) {
                                    throw new IllegalArgumentException("All SKUs must have the same package name.");
                                }
                            }
                        }
                    }
                    BillingFlowParams billingFlowParams = new BillingFlowParams(null);
                    if ((!z2 || ((SkuDetails) this.zzd.get(0)).zzd().isEmpty()) && (!z3 || ((ProductDetailsParams) this.zzc.get(0)).zza().zza().isEmpty())) {
                        z = false;
                    }
                    billingFlowParams.zza = z;
                    billingFlowParams.zzb = this.zza;
                    billingFlowParams.zzc = this.zzb;
                    billingFlowParams.zzd = this.zzf.build();
                    ArrayList arrayList4 = this.zzd;
                    billingFlowParams.zzf = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
                    billingFlowParams.zzg = this.zze;
                    List list2 = this.zzc;
                    if (list2 != null) {
                        zzl = com.google.android.gms.internal.play_billing.zzu.zzk(list2);
                    } else {
                        zzl = com.google.android.gms.internal.play_billing.zzu.zzl();
                    }
                    billingFlowParams.zze = zzl;
                    return billingFlowParams;
                }
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            throw new IllegalArgumentException("Details of the products must be provided.");
        }

        public Builder setIsOfferPersonalized(boolean z) {
            this.zze = z;
            return this;
        }

        public Builder setObfuscatedAccountId(String str) {
            this.zza = str;
            return this;
        }

        public Builder setObfuscatedProfileId(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setProductDetailsParamsList(List<ProductDetailsParams> list) {
            this.zzc = new ArrayList(list);
            return this;
        }

        @Deprecated
        public Builder setSkuDetails(SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.zzd = arrayList;
            return this;
        }

        public Builder setSubscriptionUpdateParams(SubscriptionUpdateParams subscriptionUpdateParams) {
            this.zzf = SubscriptionUpdateParams.zzb(subscriptionUpdateParams);
            return this;
        }

        /* synthetic */ Builder(zzau zzauVar) {
            SubscriptionUpdateParams.Builder newBuilder = SubscriptionUpdateParams.newBuilder();
            SubscriptionUpdateParams.Builder.zza(newBuilder);
            this.zzf = newBuilder;
        }
    }

    /* compiled from: com.android.billingclient:billing@@5.0.0 */
    /* loaded from: classes.dex */
    public static final class ProductDetailsParams {
        private final ProductDetails zza;
        private final String zzb;

        /* compiled from: com.android.billingclient:billing@@5.0.0 */
        /* loaded from: classes.dex */
        public static class Builder {
            private ProductDetails zza;
            private String zzb;

            private Builder() {
            }

            /* synthetic */ Builder(zzav zzavVar) {
            }

            public ProductDetailsParams build() {
                com.google.android.gms.internal.play_billing.zzm.zzc(this.zza, "ProductDetails is required for constructing ProductDetailsParams.");
                com.google.android.gms.internal.play_billing.zzm.zzc(this.zzb, "offerToken is required for constructing ProductDetailsParams.");
                return new ProductDetailsParams(this, null);
            }

            public Builder setOfferToken(String str) {
                this.zzb = str;
                return this;
            }

            public Builder setProductDetails(ProductDetails productDetails) {
                this.zza = productDetails;
                if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                    Objects.requireNonNull(productDetails.getOneTimePurchaseOfferDetails());
                    this.zzb = productDetails.getOneTimePurchaseOfferDetails().zza();
                }
                return this;
            }
        }

        /* synthetic */ ProductDetailsParams(Builder builder, zzaw zzawVar) {
            this.zza = builder.zza;
            this.zzb = builder.zzb;
        }

        public static Builder newBuilder() {
            return new Builder(null);
        }

        public final ProductDetails zza() {
            return this.zza;
        }

        public final String zzb() {
            return this.zzb;
        }
    }

    /* compiled from: com.android.billingclient:billing@@5.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ProrationMode {
        public static final int DEFERRED = 4;
        public static final int IMMEDIATE_AND_CHARGE_FULL_PRICE = 5;
        public static final int IMMEDIATE_AND_CHARGE_PRORATED_PRICE = 2;
        public static final int IMMEDIATE_WITHOUT_PRORATION = 3;
        public static final int IMMEDIATE_WITH_TIME_PRORATION = 1;
        public static final int UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = 0;
    }

    /* compiled from: com.android.billingclient:billing@@5.0.0 */
    /* loaded from: classes.dex */
    public static class SubscriptionUpdateParams {
        private String zza;
        private int zzb = 0;

        /* compiled from: com.android.billingclient:billing@@5.0.0 */
        /* loaded from: classes.dex */
        public static class Builder {
            private String zza;
            private boolean zzb;
            private int zzc = 0;

            private Builder() {
            }

            /* synthetic */ Builder(zzax zzaxVar) {
            }

            static /* synthetic */ Builder zza(Builder builder) {
                builder.zzb = true;
                return builder;
            }

            public SubscriptionUpdateParams build() {
                boolean z = (TextUtils.isEmpty(this.zza) && TextUtils.isEmpty(null)) ? false : true;
                boolean isEmpty = true ^ TextUtils.isEmpty(null);
                if (!z || !isEmpty) {
                    if (this.zzb || z || isEmpty) {
                        SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams(null);
                        subscriptionUpdateParams.zza = this.zza;
                        subscriptionUpdateParams.zzb = this.zzc;
                        return subscriptionUpdateParams;
                    }
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
            }

            public Builder setOldPurchaseToken(String str) {
                this.zza = str;
                return this;
            }

            @Deprecated
            public Builder setOldSkuPurchaseToken(String str) {
                this.zza = str;
                return this;
            }

            public Builder setReplaceProrationMode(int i) {
                this.zzc = i;
                return this;
            }

            @Deprecated
            public Builder setReplaceSkusProrationMode(int i) {
                this.zzc = i;
                return this;
            }
        }

        private SubscriptionUpdateParams() {
        }

        /* synthetic */ SubscriptionUpdateParams(zzay zzayVar) {
        }

        public static Builder newBuilder() {
            return new Builder(null);
        }

        static /* bridge */ /* synthetic */ Builder zzb(SubscriptionUpdateParams subscriptionUpdateParams) {
            Builder newBuilder = newBuilder();
            newBuilder.setOldSkuPurchaseToken(subscriptionUpdateParams.zza);
            newBuilder.setReplaceSkusProrationMode(subscriptionUpdateParams.zzb);
            return newBuilder;
        }

        final int zza() {
            return this.zzb;
        }

        final String zzc() {
            return this.zza;
        }
    }

    private BillingFlowParams() {
    }

    /* synthetic */ BillingFlowParams(zzaz zzazVar) {
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd.zzc();
    }

    public final ArrayList zze() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.zzf);
        return arrayList;
    }

    public final List zzf() {
        return this.zze;
    }

    public final boolean zzn() {
        return this.zzg;
    }

    public final boolean zzo() {
        return (this.zzb == null && this.zzc == null && this.zzd.zza() == 0 && !this.zza && !this.zzg) ? false : true;
    }
}
