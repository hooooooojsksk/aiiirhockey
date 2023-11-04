package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import cz.msebera.android.httpclient.cookie.SM;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdyg implements zzfcd {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfec zzc;
    private final zzfen zzd;

    public zzdyg(String str, zzfen zzfenVar, zzfec zzfecVar) {
        this.zzb = str;
        this.zzd = zzfenVar;
        this.zzc = zzfecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcd
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        JSONObject jSONObject;
        zzbtq zzbtqVar;
        zzdtf zzdtfVar;
        zzbtq zzbtqVar2;
        zzbtq zzbtqVar3;
        zzbtq zzbtqVar4;
        zzbtq zzbtqVar5;
        zzbtq zzbtqVar6;
        zzbtq zzbtqVar7;
        zzbtq zzbtqVar8;
        JSONObject jSONObject2;
        String str;
        zzdyf zzdyfVar = (zzdyf) obj;
        jSONObject = zzdyfVar.zza;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        zzbtqVar = zzdyfVar.zzb;
        String str2 = "";
        if (zzbtqVar.zza() == -2) {
            HashMap hashMap = new HashMap();
            zzbtqVar2 = zzdyfVar.zzb;
            if (zzbtqVar2.zzh() && !TextUtils.isEmpty(this.zzb)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaI)).booleanValue()) {
                    String str3 = this.zzb;
                    if (TextUtils.isEmpty(str3)) {
                        str = "";
                    } else {
                        Matcher matcher = zza.matcher(str3);
                        str = "";
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null && (group.toLowerCase(Locale.ROOT).startsWith("id=") || group.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat("; ");
                                }
                                str = str.concat(group);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put(SM.COOKIE, str);
                    }
                } else {
                    hashMap.put(SM.COOKIE, this.zzb);
                }
            }
            zzbtqVar3 = zzdyfVar.zzb;
            if (zzbtqVar3.zzi()) {
                jSONObject2 = zzdyfVar.zza;
                zzdyh.zza(hashMap, jSONObject2);
            }
            zzbtqVar4 = zzdyfVar.zzb;
            if (zzbtqVar4 != null) {
                zzbtqVar7 = zzdyfVar.zzb;
                if (!TextUtils.isEmpty(zzbtqVar7.zzd())) {
                    zzbtqVar8 = zzdyfVar.zzb;
                    str2 = zzbtqVar8.zzd();
                }
            }
            zzfen zzfenVar = this.zzd;
            zzfec zzfecVar = this.zzc;
            zzfecVar.zzf(true);
            zzfenVar.zza(zzfecVar);
            zzbtqVar5 = zzdyfVar.zzb;
            String zze = zzbtqVar5.zze();
            byte[] bytes = str2.getBytes(zzfnh.zzc);
            zzbtqVar6 = zzdyfVar.zzb;
            return new zzdyb(zze, optInt, hashMap, bytes, "", zzbtqVar6.zzi());
        }
        if (zzbtqVar.zza() == 1) {
            if (zzbtqVar.zzf() != null) {
                str2 = TextUtils.join(", ", zzbtqVar.zzf());
                zzbza.zzg(str2);
            }
            zzdtfVar = new zzdtf(2, "Error building request URL: ".concat(String.valueOf(str2)));
        } else {
            zzdtfVar = new zzdtf(1);
        }
        zzfen zzfenVar2 = this.zzd;
        zzfec zzfecVar2 = this.zzc;
        zzfecVar2.zzg(zzdtfVar);
        zzfecVar2.zzf(false);
        zzfenVar2.zza(zzfecVar2);
        throw zzdtfVar;
    }
}
