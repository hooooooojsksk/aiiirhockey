package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbse implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ Thread.UncaughtExceptionHandler zza;
    final /* synthetic */ zzbsf zzb;

    public zzbse(zzbsf zzbsfVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzb = zzbsfVar;
        this.zza = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.zzb.zze(thread, th);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zza;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            } catch (Throwable unused) {
                zzbza.zzg("AdMob exception reporter failed reporting the exception.");
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.zza;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                }
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.zza;
            if (uncaughtExceptionHandler3 != null) {
                uncaughtExceptionHandler3.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
