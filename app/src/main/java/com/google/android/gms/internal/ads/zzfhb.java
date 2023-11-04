package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfhb implements zzfgg {
    private static final zzfhb zza = new zzfhb();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfgx();
    private static final Runnable zze = new zzfgy();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfgu zzk = new zzfgu();
    private final zzfgi zzj = new zzfgi();
    private final zzfgv zzl = new zzfgv(new zzfhe());

    zzfhb() {
    }

    public static zzfhb zzd() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzfhb zzfhbVar) {
        zzfhbVar.zzg = 0;
        zzfhbVar.zzi.clear();
        zzfhbVar.zzh = false;
        for (zzffo zzffoVar : zzffz.zza().zzb()) {
        }
        zzfhbVar.zzm = System.nanoTime();
        zzfhbVar.zzk.zzi();
        long nanoTime = System.nanoTime();
        zzfgh zza2 = zzfhbVar.zzj.zza();
        if (zzfhbVar.zzk.zze().size() > 0) {
            Iterator it = zzfhbVar.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zzfgp.zza(0, 0, 0, 0);
                View zza4 = zzfhbVar.zzk.zza(str);
                zzfgh zzb2 = zzfhbVar.zzj.zzb();
                String zzc2 = zzfhbVar.zzk.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfgp.zzb(zza5, str);
                    zzfgp.zzf(zza5, zzc2);
                    zzfgp.zzc(zza3, zza5);
                }
                zzfgp.zzi(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfhbVar.zzl.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzfhbVar.zzk.zzf().size() > 0) {
            JSONObject zza6 = zzfgp.zza(0, 0, 0, 0);
            zzfhbVar.zzk(null, zza2, zza6, 1, false);
            zzfgp.zzi(zza6);
            zzfhbVar.zzl.zzd(zza6, zzfhbVar.zzk.zzf(), nanoTime);
            boolean z = zzfhbVar.zzh;
        } else {
            zzfhbVar.zzl.zzb();
        }
        zzfhbVar.zzk.zzg();
        long nanoTime2 = System.nanoTime() - zzfhbVar.zzm;
        if (zzfhbVar.zzf.size() > 0) {
            for (zzfha zzfhaVar : zzfhbVar.zzf) {
                int i = zzfhbVar.zzg;
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfhaVar.zzb();
                if (zzfhaVar instanceof zzfgz) {
                    int i2 = zzfhbVar.zzg;
                    ((zzfgz) zzfhaVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfgh zzfghVar, JSONObject jSONObject, int i, boolean z) {
        zzfghVar.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zza(View view, zzfgh zzfghVar, JSONObject jSONObject, boolean z) {
        int zzk;
        boolean z2;
        if (zzfgs.zzb(view) != null || (zzk = this.zzk.zzk(view)) == 3) {
            return;
        }
        JSONObject zza2 = zzfghVar.zza(view);
        zzfgp.zzc(jSONObject, zza2);
        String zzd2 = this.zzk.zzd(view);
        if (zzd2 == null) {
            zzfgt zzb2 = this.zzk.zzb(view);
            if (zzb2 != null) {
                zzfgp.zzd(zza2, zzb2);
                z2 = true;
            } else {
                z2 = false;
            }
            zzk(view, zzfghVar, zza2, zzk, z || z2);
        } else {
            zzfgp.zzb(zza2, zzd2);
            zzfgp.zze(zza2, Boolean.valueOf(this.zzk.zzj(view)));
            this.zzk.zzh();
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfgw(this));
    }
}
