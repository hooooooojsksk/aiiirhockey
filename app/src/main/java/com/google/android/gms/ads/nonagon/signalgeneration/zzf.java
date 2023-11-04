package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzdpd;
import com.google.android.gms.internal.ads.zzdpn;
import com.google.android.gms.internal.ads.zzeyx;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzf {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zza(String str) {
        char c;
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case '\b':
                return "8";
            default:
                return str;
        }
    }

    public static String zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle = zzlVar.zzc;
        return bundle == null ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void zzc(final zzdpn zzdpnVar, final zzdpd zzdpdVar, final String str, final Pair... pairArr) {
        if (((Boolean) zzba.zzc().zzb(zzbar.zzgC)).booleanValue()) {
            zzbzn.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zze
                @Override // java.lang.Runnable
                public final void run() {
                    zzf.zzd(zzdpn.this, zzdpdVar, str, pairArr);
                }
            });
        }
    }

    public static void zzd(zzdpn zzdpnVar, zzdpd zzdpdVar, String str, Pair... pairArr) {
        Map zza;
        if (zzdpdVar == null) {
            zza = zzdpnVar.zzc();
        } else {
            zza = zzdpdVar.zza();
        }
        zzf(zza, "action", str);
        for (Pair pair : pairArr) {
            zzf(zza, (String) pair.first, (String) pair.second);
        }
        zzdpnVar.zze(zza);
    }

    public static int zze(zzeyx zzeyxVar) {
        if (zzeyxVar.zzq) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzeyxVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzlVar.zzs;
        if (zzcVar == null && zzlVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzlVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }

    private static void zzf(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
