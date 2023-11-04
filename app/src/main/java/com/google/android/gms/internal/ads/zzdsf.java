package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdsf implements zzdtd, zzdrq {
    private final zzdsn zza;
    private final zzdte zzb;
    private final zzdrr zzc;
    private final zzdsa zzd;
    private final zzdrp zze;
    private final zzdsz zzf;
    private final String zzg;
    private JSONObject zzm;
    private boolean zzp;
    private int zzq;
    private boolean zzr;
    private final Map zzi = new HashMap();
    private final Map zzj = new HashMap();
    private final Map zzk = new HashMap();
    private String zzl = "{}";
    private long zzn = LongCompanionObject.MAX_VALUE;
    private zzdsb zzo = zzdsb.NONE;
    private zzdse zzs = zzdse.UNKNOWN;
    private final String zzh = "afma-sdk-a-v22.0.0";

    public zzdsf(zzdsn zzdsnVar, zzdte zzdteVar, zzdrr zzdrrVar, Context context, zzbzg zzbzgVar, zzdsa zzdsaVar, zzdsz zzdszVar) {
        this.zza = zzdsnVar;
        this.zzb = zzdteVar;
        this.zzc = zzdrrVar;
        this.zze = new zzdrp(context);
        this.zzg = zzbzgVar.zza;
        this.zzd = zzdsaVar;
        this.zzf = zzdszVar;
        com.google.android.gms.ads.internal.zzt.zzs().zzg(this);
    }

    private final synchronized JSONObject zzq() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.zzi.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzdrt zzdrtVar : (List) entry.getValue()) {
                if (zzdrtVar.zzg()) {
                    jSONArray.put(zzdrtVar.zzd());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzr() {
        this.zzr = true;
        this.zzd.zzc();
        this.zza.zzh(this);
        this.zzb.zzc(this);
        this.zzc.zzc(this);
        this.zzf.zzf(this);
        zzx(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzo());
    }

    private final void zzs() {
        com.google.android.gms.ads.internal.zzt.zzo().zzh().zzG(zzd());
    }

    private final synchronized void zzt(zzdsb zzdsbVar, boolean z) {
        if (this.zzo == zzdsbVar) {
            return;
        }
        if (zzo()) {
            zzv();
        }
        this.zzo = zzdsbVar;
        if (zzo()) {
            zzw();
        }
        if (z) {
            zzs();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0036 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #0 {, blocks: (B:31:0x0001, B:35:0x0007, B:37:0x000b, B:39:0x001d, B:41:0x0027, B:46:0x0036, B:42:0x002b, B:44:0x0031), top: B:54:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003b A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void zzu(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzp     // Catch: java.lang.Throwable -> L3d
            if (r0 != r2) goto L7
            monitor-exit(r1)
            return
        L7:
            r1.zzp = r2     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L2b
            com.google.android.gms.internal.ads.zzbaj r2 = com.google.android.gms.internal.ads.zzbar.zziu     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.internal.ads.zzbap r0 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r0.zzb(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L27
            com.google.android.gms.ads.internal.util.zzaw r2 = com.google.android.gms.ads.internal.zzt.zzs()     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.zzl()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L2b
        L27:
            r1.zzw()     // Catch: java.lang.Throwable -> L3d
            goto L34
        L2b:
            boolean r2 = r1.zzo()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L34
            r1.zzv()     // Catch: java.lang.Throwable -> L3d
        L34:
            if (r3 == 0) goto L3b
            r1.zzs()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r1)
            return
        L3b:
            monitor-exit(r1)
            return
        L3d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsf.zzu(boolean, boolean):void");
    }

    private final synchronized void zzv() {
        zzdsb zzdsbVar = zzdsb.NONE;
        int ordinal = this.zzo.ordinal();
        if (ordinal == 1) {
            this.zzb.zza();
        } else if (ordinal != 2) {
        } else {
            this.zzc.zza();
        }
    }

    private final synchronized void zzw() {
        zzdsb zzdsbVar = zzdsb.NONE;
        int ordinal = this.zzo.ordinal();
        if (ordinal == 1) {
            this.zzb.zzb();
        } else if (ordinal != 2) {
        } else {
            this.zzc.zzb();
        }
    }

    private final synchronized void zzx(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzu(jSONObject.optBoolean("isTestMode", false), false);
            zzt(zzdsb.zza(jSONObject.optString("gesture", "NONE")), false);
            this.zzl = jSONObject.optString("networkExtras", "{}");
            this.zzn = jSONObject.optLong("networkExtrasExpirationSecs", LongCompanionObject.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    public final zzdsb zza() {
        return this.zzo;
    }

    public final synchronized zzfut zzb(String str) {
        zzbzs zzbzsVar;
        zzbzsVar = new zzbzs();
        if (this.zzj.containsKey(str)) {
            zzbzsVar.zzd((zzdrt) this.zzj.get(str));
        } else {
            if (!this.zzk.containsKey(str)) {
                this.zzk.put(str, new ArrayList());
            }
            ((List) this.zzk.get(str)).add(zzbzsVar);
        }
        return zzbzsVar;
    }

    public final synchronized String zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzif)).booleanValue() && zzo()) {
            if (this.zzn < com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() / 1000) {
                this.zzl = "{}";
                this.zzn = LongCompanionObject.MAX_VALUE;
                return "";
            } else if (this.zzl.equals("{}")) {
                return "";
            } else {
                return this.zzl;
            }
        }
        return "";
    }

    public final synchronized String zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzp);
            jSONObject.put("gesture", this.zzo);
            if (this.zzn > com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzl);
                jSONObject.put("networkExtrasExpirationSecs", this.zzn);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zze() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("sdkVersion", this.zzh);
            jSONObject.put("internalSdkVersion", this.zzg);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.zzd.zza());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziD)).booleanValue()) {
                String zzm = com.google.android.gms.ads.internal.zzt.zzo().zzm();
                if (!TextUtils.isEmpty(zzm)) {
                    jSONObject.put("plugin", zzm);
                }
            }
            if (this.zzn < com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() / 1000) {
                this.zzl = "{}";
            }
            jSONObject.put("networkExtras", this.zzl);
            jSONObject.put("adSlots", zzq());
            jSONObject.put("appInfo", this.zze.zza());
            String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
            if (!TextUtils.isEmpty(zzc)) {
                jSONObject.put("cld", new JSONObject(zzc));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziv)).booleanValue() && (jSONObject2 = this.zzm) != null) {
                String obj = jSONObject2.toString();
                zzbza.zze("Server data: " + obj);
                jSONObject.put("serverData", this.zzm);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziu)).booleanValue()) {
                jSONObject.put("openAction", this.zzs);
                jSONObject.put("gesture", this.zzo);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "Inspector.toJson");
            zzbza.zzk("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    public final synchronized void zzf(String str, zzdrt zzdrtVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzif)).booleanValue() && zzo()) {
            if (this.zzq >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzih)).intValue()) {
                zzbza.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzi.containsKey(str)) {
                this.zzi.put(str, new ArrayList());
            }
            this.zzq++;
            ((List) this.zzi.get(str)).add(zzdrtVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziB)).booleanValue()) {
                String zzc = zzdrtVar.zzc();
                this.zzj.put(zzc, zzdrtVar);
                if (this.zzk.containsKey(zzc)) {
                    List<zzbzs> list = (List) this.zzk.get(zzc);
                    for (zzbzs zzbzsVar : list) {
                        zzbzsVar.zzd(zzdrtVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzif)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziu)).booleanValue() || !com.google.android.gms.ads.internal.zzt.zzo().zzh().zzO()) {
                String zzo = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzo();
                if (TextUtils.isEmpty(zzo)) {
                    return;
                }
                try {
                    if (new JSONObject(zzo).optBoolean("isTestMode", false)) {
                        zzr();
                        return;
                    }
                    return;
                } catch (JSONException unused) {
                    return;
                }
            }
            zzr();
        }
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzda zzdaVar, zzdse zzdseVar) {
        if (!zzo()) {
            try {
                zzdaVar.zze(zzezx.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                zzbza.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzif)).booleanValue()) {
            try {
                zzdaVar.zze(zzezx.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                zzbza.zzj("Ad inspector had an internal error.");
                return;
            }
        }
        this.zzs = zzdseVar;
        this.zza.zzj(zzdaVar, new zzbih(this), new zzbia(this.zzf));
        return;
    }

    public final synchronized void zzi(String str, long j) {
        this.zzl = str;
        this.zzn = j;
        zzs();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x000a, code lost:
        if (r2 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.zzr
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.zzr()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.zzp
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.zzw()
            return
        L15:
            boolean r2 = r1.zzo()
            if (r2 != 0) goto L1e
            r1.zzv()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsf.zzj(boolean):void");
    }

    public final void zzk(zzdsb zzdsbVar) {
        zzt(zzdsbVar, true);
    }

    public final synchronized void zzl(JSONObject jSONObject) {
        this.zzm = jSONObject;
    }

    public final void zzm(boolean z) {
        if (!this.zzr && z) {
            zzr();
        }
        zzu(z, true);
    }

    public final boolean zzn() {
        return this.zzm != null;
    }

    public final synchronized boolean zzo() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziu)).booleanValue()) {
            return this.zzp || com.google.android.gms.ads.internal.zzt.zzs().zzl();
        }
        return this.zzp;
    }

    public final synchronized boolean zzp() {
        return this.zzp;
    }
}
