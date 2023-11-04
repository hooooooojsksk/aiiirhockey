package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import androidx.work.WorkRequest;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class zzap implements ServiceConnection {
    final /* synthetic */ BillingClientImpl zza;
    private final Object zzb = new Object();
    private boolean zzc = false;
    private BillingClientStateListener zzd;

    public /* synthetic */ zzap(BillingClientImpl billingClientImpl, BillingClientStateListener billingClientStateListener, zzao zzaoVar) {
        this.zza = billingClientImpl;
        this.zzd = billingClientStateListener;
    }

    private final void zzd(BillingResult billingResult) {
        synchronized (this.zzb) {
            BillingClientStateListener billingClientStateListener = this.zzd;
            if (billingClientStateListener != null) {
                billingClientStateListener.onBillingSetupFinished(billingResult);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Handler zzF;
        Future zzJ;
        BillingResult zzH;
        com.google.android.gms.internal.play_billing.zzb.zzn("BillingClient", "Billing service connected.");
        this.zza.zzf = com.google.android.gms.internal.play_billing.zzd.zzo(iBinder);
        BillingClientImpl billingClientImpl = this.zza;
        Callable callable = new Callable() { // from class: com.android.billingclient.api.zzam
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzap.this.zza();
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.zzan
            @Override // java.lang.Runnable
            public final void run() {
                zzap.this.zzb();
            }
        };
        zzF = billingClientImpl.zzF();
        zzJ = billingClientImpl.zzJ(callable, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, runnable, zzF);
        if (zzJ == null) {
            zzH = this.zza.zzH();
            zzd(zzH);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzb.zzo("BillingClient", "Billing service disconnected.");
        this.zza.zzf = null;
        this.zza.zza = 0;
        synchronized (this.zzb) {
            BillingClientStateListener billingClientStateListener = this.zzd;
            if (billingClientStateListener != null) {
                billingClientStateListener.onBillingServiceDisconnected();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object zza() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzap.zza():java.lang.Object");
    }

    public final /* synthetic */ void zzb() {
        this.zza.zza = 0;
        this.zza.zzf = null;
        zzd(zzbb.zzn);
    }

    public final void zzc() {
        synchronized (this.zzb) {
            this.zzd = null;
            this.zzc = true;
        }
    }
}
