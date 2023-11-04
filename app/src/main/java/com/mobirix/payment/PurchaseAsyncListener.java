package com.mobirix.payment;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import java.util.List;

/* loaded from: classes2.dex */
public interface PurchaseAsyncListener {
    void onResponse(BillingResult billingResult, List<Purchase> list);
}
