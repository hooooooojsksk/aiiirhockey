package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdxz extends zzbtc {
    private final Context zza;
    private final zzeqv zzb;
    private final zzeqt zzc;
    private final zzdyh zzd;
    private final zzfuu zze;
    private final zzdye zzf;
    private final zzbtz zzg;

    public zzdxz(Context context, zzeqv zzeqvVar, zzeqt zzeqtVar, zzdye zzdyeVar, zzdyh zzdyhVar, zzfuu zzfuuVar, zzbtz zzbtzVar, byte[] bArr) {
        this.zza = context;
        this.zzb = zzeqvVar;
        this.zzc = zzeqtVar;
        this.zzf = zzdyeVar;
        this.zzd = zzdyhVar;
        this.zze = zzfuuVar;
        this.zzg = zzbtzVar;
    }

    private final void zzc(zzfut zzfutVar, zzbtg zzbtgVar) {
        zzfuj.zzq(zzfuj.zzm(zzfua.zzv(zzfutVar), new zzftq() { // from class: com.google.android.gms.internal.ads.zzdxr
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzfuj.zzh(zzezw.zza((InputStream) obj));
            }
        }, zzbzn.zza), new zzdxy(this, zzbtgVar), zzbzn.zzf);
    }

    public final zzfut zzb(zzbsv zzbsvVar, int i) {
        zzfut zzh;
        String str = zzbsvVar.zza;
        int i2 = zzbsvVar.zzb;
        Bundle bundle = zzbsvVar.zzc;
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                String string = bundle.getString(str2);
                if (string != null) {
                    hashMap.put(str2, string);
                }
            }
        }
        final zzdyb zzdybVar = new zzdyb(str, i2, hashMap, zzbsvVar.zzd, "", zzbsvVar.zze);
        zzeqt zzeqtVar = this.zzc;
        zzeqtVar.zza(new zzesa(zzbsvVar));
        zzequ zzb = zzeqtVar.zzb();
        if (zzdybVar.zzf) {
            String str3 = zzbsvVar.zza;
            String str4 = (String) zzbcr.zzc.zze();
            if (!TextUtils.isEmpty(str4)) {
                String host = Uri.parse(str3).getHost();
                if (!TextUtils.isEmpty(host)) {
                    for (String str5 : zzfoh.zzc(zzfng.zzc(';')).zzd(str4)) {
                        if (host.endsWith(str5)) {
                            zzh = zzfuj.zzl(zzb.zza().zza(new JSONObject()), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdxx
                                @Override // com.google.android.gms.internal.ads.zzfnj
                                public final Object apply(Object obj) {
                                    zzdyb zzdybVar2 = zzdyb.this;
                                    zzdyh.zza(zzdybVar2.zzc, (JSONObject) obj);
                                    return zzdybVar2;
                                }
                            }, this.zze);
                            break;
                        }
                    }
                }
            }
        }
        zzh = zzfuj.zzh(zzdybVar);
        zzfda zzb2 = zzb.zzb();
        return zzfuj.zzm(zzb2.zzb(zzfcu.HTTP, zzh).zze(new zzdyd(this.zza, "", this.zzg, i, null)).zza(), new zzftq() { // from class: com.google.android.gms.internal.ads.zzdxt
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                zzdyc zzdycVar = (zzdyc) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", zzdycVar.zza);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str6 : zzdycVar.zzb.keySet()) {
                        if (str6 != null) {
                            JSONArray jSONArray = new JSONArray();
                            for (String str7 : (List) zzdycVar.zzb.get(str6)) {
                                if (str7 != null) {
                                    jSONArray.put(str7);
                                }
                            }
                            jSONObject2.put(str6, jSONArray);
                        }
                    }
                    jSONObject.put("headers", jSONObject2);
                    Object obj2 = zzdycVar.zzc;
                    if (obj2 != null) {
                        jSONObject.put("body", obj2);
                    }
                    jSONObject.put("latency", zzdycVar.zzd);
                    return zzfuj.zzh(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e) {
                    zzbza.zzj("Error converting response to JSONObject: ".concat(String.valueOf(e.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(String.valueOf(e.getCause()))));
                }
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbtd
    public final void zze(zzbsv zzbsvVar, zzbtg zzbtgVar) {
        zzc(zzb(zzbsvVar, Binder.getCallingUid()), zzbtgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtd
    public final void zzf(zzbsr zzbsrVar, zzbtg zzbtgVar) {
        int callingUid = Binder.getCallingUid();
        zzeqv zzeqvVar = this.zzb;
        zzeqvVar.zza(new zzeqk(zzbsrVar, callingUid));
        final zzeqw zzb = zzeqvVar.zzb();
        zzfda zzb2 = zzb.zzb();
        zzfcf zza = zzb2.zzb(zzfcu.GMS_SIGNALS, zzfuj.zzi()).zzf(new zzftq() { // from class: com.google.android.gms.internal.ads.zzdxw
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                Void r2 = (Void) obj;
                return zzeqw.this.zza().zza(new JSONObject());
            }
        }).zze(new zzfcd() { // from class: com.google.android.gms.internal.ads.zzdxv
            @Override // com.google.android.gms.internal.ads.zzfcd
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("GMS AdRequest Signals: ");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zzf(new zzftq() { // from class: com.google.android.gms.internal.ads.zzdxu
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzfuj.zzh(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).zza();
        zzc(zza, zzbtgVar);
        if (((Boolean) zzbck.zzd.zze()).booleanValue()) {
            final zzdyh zzdyhVar = this.zzd;
            zzdyhVar.getClass();
            zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxs
                @Override // java.lang.Runnable
                public final void run() {
                    zzdyh.this.zzb();
                }
            }, this.zze);
        }
    }
}
