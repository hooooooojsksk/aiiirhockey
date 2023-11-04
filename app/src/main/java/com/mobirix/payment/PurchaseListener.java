package com.mobirix.payment;

import com.android.billingclient.api.Purchase;

/* loaded from: classes2.dex */
public interface PurchaseListener {
    void onFail();

    void onSuccess(Purchase purchase);
}
