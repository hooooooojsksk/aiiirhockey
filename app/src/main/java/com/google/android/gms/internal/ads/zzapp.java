package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzapp implements zzaps {
    private static zzapp zzb;
    private final Context zzc;
    private final zzfje zzd;
    private final zzfjl zze;
    private final zzfjn zzf;
    private final zzaqr zzg;
    private final zzfhp zzh;
    private final Executor zzi;
    private final zzfjk zzj;
    private final zzarh zzl;
    private final zzaqy zzm;
    private final zzaqp zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;
    volatile long zza = 0;
    private final Object zzo = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    zzapp(Context context, zzfhp zzfhpVar, zzfje zzfjeVar, zzfjl zzfjlVar, zzfjn zzfjnVar, zzaqr zzaqrVar, Executor executor, zzfhk zzfhkVar, int i, zzarh zzarhVar, zzaqy zzaqyVar, zzaqp zzaqpVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzfhpVar;
        this.zzd = zzfjeVar;
        this.zze = zzfjlVar;
        this.zzf = zzfjnVar;
        this.zzg = zzaqrVar;
        this.zzi = executor;
        this.zzr = i;
        this.zzl = zzarhVar;
        this.zzm = zzaqyVar;
        this.zzn = zzaqpVar;
        this.zzq = false;
        this.zzj = new zzapn(this, zzfhkVar);
    }

    public static synchronized zzapp zza(String str, Context context, boolean z, boolean z2) {
        zzapp zzb2;
        synchronized (zzapp.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzapp zzb(String str, Context context, Executor executor, boolean z, boolean z2) {
        zzapp zzappVar;
        synchronized (zzapp.class) {
            if (zzb == null) {
                zzfhq zza = zzfhr.zza();
                zza.zza(str);
                zza.zzc(z);
                zzfhr zzd = zza.zzd();
                zzfhp zza2 = zzfhp.zza(context, executor, z2);
                zzaqa zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcT)).booleanValue() ? zzaqa.zzc(context) : null;
                zzarh zzd2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcU)).booleanValue() ? zzarh.zzd(context, executor) : null;
                zzaqy zzaqyVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcl)).booleanValue() ? new zzaqy() : null;
                zzaqp zzaqpVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcn)).booleanValue() ? new zzaqp() : null;
                zzfii zze = zzfii.zze(context, executor, zza2, zzd);
                zzaqq zzaqqVar = new zzaqq(context);
                zzaqr zzaqrVar = new zzaqr(zzd, zze, new zzarf(context, zzaqqVar), zzaqqVar, zzc, zzd2, zzaqyVar, zzaqpVar);
                int zzb2 = zzfir.zzb(context, zza2);
                zzfhk zzfhkVar = new zzfhk();
                zzapp zzappVar2 = new zzapp(context, zza2, new zzfje(context, zzb2), new zzfjl(context, zzb2, new zzapm(zza2), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbU)).booleanValue()), new zzfjn(context, zzaqrVar, zza2, zzfhkVar), zzaqrVar, executor, zzfhkVar, zzb2, zzd2, zzaqyVar, zzaqpVar);
                zzb = zzappVar2;
                zzappVar2.zzm();
                zzb.zzp();
            }
            zzappVar = zzb;
        }
        return zzappVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0099, code lost:
        if (r4.zzd().zzj().equals(r5.zzj()) != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzapp r12) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapp.zzj(com.google.android.gms.internal.ads.zzapp):void");
    }

    private final void zzs() {
        zzarh zzarhVar = this.zzl;
        if (zzarhVar != null) {
            zzarhVar.zzh();
        }
    }

    private final zzfjd zzt(int i) {
        if (zzfir.zza(this.zzr)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbS)).booleanValue()) {
                return this.zze.zzc(1);
            }
            return this.zzd.zzc(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcl)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzfhs zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zza2 = zza.zza(context, null, str, view, activity);
            this.zzh.zzf(5000, System.currentTimeMillis() - currentTimeMillis, zza2, null);
            return zza2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final String zzg(Context context) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcl)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzfhs zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzc = zza.zzc(context, null);
            this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc, null);
            return zzc;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final String zzh(Context context, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcl)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzfhs zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzb2 = zza.zzb(context, null, view, activity);
            this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, null);
            return zzb2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final void zzk(MotionEvent motionEvent) {
        zzfhs zza = this.zzf.zza();
        if (zza != null) {
            try {
                zza.zzd(null, motionEvent);
            } catch (zzfjm e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final void zzl(int i, int i2, int i3) {
    }

    final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfjd zzt = zzt(1);
        if (zzt != null) {
            if (this.zzf.zzc(zzt)) {
                this.zzq = true;
                this.zzk.countDown();
                return;
            }
            return;
        }
        this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzaqp zzaqpVar = this.zzn;
        if (zzaqpVar != null) {
            zzaqpVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (this.zzp) {
            return;
        }
        synchronized (this.zzo) {
            if (!this.zzp) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfjd zzb2 = this.zzf.zzb();
                if ((zzb2 == null || zzb2.zzd(3600L)) && zzfir.zza(this.zzr)) {
                    this.zzi.execute(new zzapo(this));
                }
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}
