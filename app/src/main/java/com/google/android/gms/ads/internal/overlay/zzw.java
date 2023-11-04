package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzflp;
import com.google.android.gms.internal.ads.zzflq;
import com.google.android.gms.internal.ads.zzflz;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmd;
import com.google.android.gms.internal.ads.zzfme;
import com.google.android.gms.internal.ads.zzfmy;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzw {
    private zzfmc zzf;
    private zzcei zzc = null;
    private boolean zze = false;
    private String zza = null;
    private zzflp zzd = null;
    private String zzb = null;

    private final zzfme zzl() {
        zzfmd zzc = zzfme.zzc();
        if (!((Boolean) zzba.zzc().zzb(zzbar.zzjD)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zza(this.zzb);
        }
        return zzc.zzc();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new zzv(this);
        }
    }

    public final synchronized void zza(zzcei zzceiVar, Context context) {
        this.zzc = zzceiVar;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        zze("on_play_store_bind", hashMap);
    }

    public final void zzb() {
        zzflp zzflpVar;
        if (!this.zze || (zzflpVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzflpVar.zza(zzl(), this.zzf);
        zzd("onLMDOverlayCollapse");
    }

    public final void zzc() {
        zzflp zzflpVar;
        if (!this.zze || (zzflpVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfln zzc = zzflo.zzc();
        if (((Boolean) zzba.zzc().zzb(zzbar.zzjD)).booleanValue() && !TextUtils.isEmpty(this.zzb)) {
            zzc.zza(this.zzb);
        } else {
            String str = this.zza;
            if (str != null) {
                zzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        }
        zzflpVar.zzb(zzc.zzc(), this.zzf);
    }

    final void zzd(String str) {
        zze(str, new HashMap());
    }

    final void zze(final String str, final Map map) {
        zzbzn.zze.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzu
            @Override // java.lang.Runnable
            public final void run() {
                zzw.this.zzh(str, map);
            }
        });
    }

    final void zzf(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            zze("onError", hashMap);
        }
    }

    public final void zzg() {
        zzflp zzflpVar;
        if (!this.zze || (zzflpVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzflpVar.zzc(zzl(), this.zzf);
        zzd("onLMDOverlayExpand");
    }

    public final /* synthetic */ void zzh(String str, Map map) {
        zzcei zzceiVar = this.zzc;
        if (zzceiVar != null) {
            zzceiVar.zzd(str, map);
        }
    }

    public final void zzi(zzfmb zzfmbVar) {
        if (!TextUtils.isEmpty(zzfmbVar.zzb())) {
            if (!((Boolean) zzba.zzc().zzb(zzbar.zzjD)).booleanValue()) {
                this.zza = zzfmbVar.zzb();
            }
        }
        switch (zzfmbVar.zza()) {
            case 8152:
                zzd("onLMDOverlayOpened");
                return;
            case 8153:
                zzd("onLMDOverlayClicked");
                return;
            case 8154:
            case 8156:
            case 8158:
            case 8159:
            default:
                return;
            case 8155:
                zzd("onLMDOverlayClose");
                return;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(zzfmbVar.zza()));
                zze("onLMDOverlayFailedToOpen", hashMap);
                return;
        }
    }

    public final void zzj(zzcei zzceiVar, zzflz zzflzVar) {
        if (zzceiVar == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzceiVar;
        if (this.zze || zzk(zzceiVar.getContext())) {
            if (((Boolean) zzba.zzc().zzb(zzbar.zzjD)).booleanValue()) {
                this.zzb = zzflzVar.zzg();
            }
            zzm();
            zzflp zzflpVar = this.zzd;
            if (zzflpVar != null) {
                zzflpVar.zzd(zzflzVar, this.zzf);
                return;
            }
            return;
        }
        zzf("LMDOverlay not bound", "on_play_store_bind");
    }

    public final synchronized boolean zzk(Context context) {
        if (zzfmy.zza(context)) {
            try {
                this.zzd = zzflq.zza(context);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
            }
            if (this.zzd == null) {
                this.zze = false;
                return false;
            }
            zzm();
            this.zze = true;
            return true;
        }
        return false;
    }
}
