package com.mobirix.payment;

import com.android.billingclient.api.Purchase;

/* loaded from: classes2.dex */
public interface VerifySignatureListener {
    void onVerifySignatureResponse(boolean z, Purchase purchase);
}
