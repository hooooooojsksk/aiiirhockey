package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbho {
    public static final zzbhp zza = new zzbhp() { // from class: com.google.android.gms.internal.ads.zzbgt
        @Override // com.google.android.gms.internal.ads.zzbhp
        public final void zza(Object obj, Map map) {
            zzcfj zzcfjVar = (zzcfj) obj;
            zzbhp zzbhpVar = zzbho.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                zzbza.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = zzcfjVar.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                boolean z = true;
                if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                hashMap.put(str2, valueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str2 + ";" + valueOf);
            }
            ((zzbki) zzcfjVar).zzd("openableURLs", hashMap);
        }
    };
    public static final zzbhp zzb = new zzbhp() { // from class: com.google.android.gms.internal.ads.zzbgu
        @Override // com.google.android.gms.internal.ads.zzbhp
        public final void zza(Object obj, Map map) {
            zzcfj zzcfjVar = (zzcfj) obj;
            zzbhp zzbhpVar = zzbho.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhC)).booleanValue()) {
                zzbza.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                zzbza.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            Boolean valueOf = Boolean.valueOf(zzcfjVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            hashMap.put(str, valueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + valueOf);
            ((zzbki) zzcfjVar).zzd("openableApp", hashMap);
        }
    };
    public static final zzbhp zzc = new zzbhp() { // from class: com.google.android.gms.internal.ads.zzbgm
        @Override // com.google.android.gms.internal.ads.zzbhp
        public final void zza(Object obj, Map map) {
            zzbho.zzc((zzcfj) obj, map);
        }
    };
    public static final zzbhp zzd = new zzbhg();
    public static final zzbhp zze = new zzbhh();
    public static final zzbhp zzf = new zzbhp() { // from class: com.google.android.gms.internal.ads.zzbgs
        @Override // com.google.android.gms.internal.ads.zzbhp
        public final void zza(Object obj, Map map) {
            zzcfj zzcfjVar = (zzcfj) obj;
            zzbhp zzbhpVar = zzbho.zza;
            String str = (String) map.get("u");
            if (str == null) {
                zzbza.zzj("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzby(zzcfjVar.getContext(), ((zzcfr) zzcfjVar).zzn().zza, str).zzb();
            }
        }
    };
    public static final zzbhp zzg = new zzbhi();
    public static final zzbhp zzh = new zzbhj();
    public static final zzbhp zzi = new zzbhp() { // from class: com.google.android.gms.internal.ads.zzbgr
        @Override // com.google.android.gms.internal.ads.zzbhp
        public final void zza(Object obj, Map map) {
            zzcfq zzcfqVar = (zzcfq) obj;
            zzbhp zzbhpVar = zzbho.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                zzapw zzI = zzcfqVar.zzI();
                if (zzI != null) {
                    zzI.zzc().zzl(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                zzbza.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbhp zzj = new zzbhk();
    public static final zzbhp zzk = new zzbhl();
    public static final zzbhp zzl = new zzcci();
    public static final zzbhp zzm = new zzccj();
    public static final zzbhp zzn = new zzbgl();
    public static final zzbid zzo = new zzbid();
    public static final zzbhp zzp = new zzbhm();
    public static final zzbhp zzq = new zzbhn();
    public static final zzbhp zzr = new zzbgv();
    public static final zzbhp zzs = new zzbgw();
    public static final zzbhp zzt = new zzbgx();
    public static final zzbhp zzu = new zzbgy();
    public static final zzbhp zzv = new zzbgz();
    public static final zzbhp zzw = new zzbha();
    public static final zzbhp zzx = new zzbhb();
    public static final zzbhp zzy = new zzbhc();
    public static final zzbhp zzz = new zzbhd();
    public static final zzbhp zzA = new zzbhe();

    public static zzbhp zza(final zzdcc zzdccVar) {
        return new zzbhp() { // from class: com.google.android.gms.internal.ads.zzbgq
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                zzcei zzceiVar = (zzcei) obj;
                zzbho.zzd(map, zzdcc.this);
                String str = (String) map.get("u");
                if (str == null) {
                    zzbza.zzj("URL missing from click GMSG.");
                } else {
                    zzfuj.zzq(zzbho.zzb(zzceiVar, str), new zzbhf(zzceiVar), zzbzn.zza);
                }
            }
        };
    }

    public static zzfut zzb(zzcei zzceiVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzapw zzI = zzceiVar.zzI();
            if (zzI != null && zzI.zzf(parse)) {
                parse = zzI.zza(parse, zzceiVar.getContext(), zzceiVar.zzF(), zzceiVar.zzi());
            }
        } catch (zzapx unused) {
            zzbza.zzj("Unable to append parameter to URL: ".concat(str));
        }
        final String zzb2 = zzbxh.zzb(parse, zzceiVar.getContext());
        long longValue = ((Long) zzbcj.zze.zze()).longValue();
        if (longValue <= 0 || longValue > 230500000) {
            return zzfuj.zzh(zzb2);
        }
        return zzfuj.zze(zzfuj.zzl(zzfuj.zze(zzfua.zzv(zzceiVar.zzR()), Throwable.class, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzbgn
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbhp zzbhpVar = zzbho.zza;
                if (((Boolean) zzbcj.zzk.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "prepareClickUrl.attestation1");
                    return "failure_click_attok";
                }
                return "failure_click_attok";
            }
        }, zzbzn.zzf), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzbgo
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                String str2 = zzb2;
                String str3 = (String) obj;
                zzbhp zzbhpVar = zzbho.zza;
                if (str3 != null) {
                    if (((Boolean) zzbcj.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str2).getHost();
                        for (int i = 0; i < 3; i++) {
                            if (!host.endsWith(strArr[i])) {
                            }
                        }
                    }
                    String str4 = (String) zzbcj.zza.zze();
                    String str5 = (String) zzbcj.zzb.zze();
                    if (!TextUtils.isEmpty(str4)) {
                        str2 = str2.replace(str4, str3);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        Uri parse2 = Uri.parse(str2);
                        if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                            return parse2.buildUpon().appendQueryParameter(str5, str3).toString();
                        }
                    }
                }
                return str2;
            }
        }, zzbzn.zzf), Throwable.class, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzbgp
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                String str2 = zzb2;
                Throwable th = (Throwable) obj;
                zzbhp zzbhpVar = zzbho.zza;
                if (((Boolean) zzbcj.zzk.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "prepareClickUrl.attestation2");
                }
                return str2;
            }
        }, zzbzn.zzf);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:10|11|12)|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00cb, code lost:
        com.google.android.gms.ads.internal.zzt.zzo().zzu(r0, r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00df, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00e0, code lost:
        com.google.android.gms.internal.ads.zzbza.zzh("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzcfj r16, java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbho.zzc(com.google.android.gms.internal.ads.zzcfj, java.util.Map):void");
    }

    public static void zzd(Map map, zzdcc zzdccVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzje)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdccVar != null) {
            zzdccVar.zzr();
        }
    }
}
