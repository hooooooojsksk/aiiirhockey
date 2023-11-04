package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzccv implements zzbhp {
    private static final Integer zzb(Map map, String str) {
        if (map.containsKey(str)) {
            try {
                return Integer.valueOf(Integer.parseInt((String) map.get(str)));
            } catch (NumberFormatException unused) {
                zzbza.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzccu zzccuVar;
        zzccm zza;
        zzcbj zzcbjVar = (zzcbj) obj;
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzbza.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzccn zzy = com.google.android.gms.ads.internal.zzt.zzy();
        if (map.containsKey("abort")) {
            if (zzy.zzd(zzcbjVar)) {
                return;
            }
            zzbza.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer zzb = zzb(map, "periodicReportIntervalMs");
        Integer zzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer zzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcbi zzcbiVar = new zzcbi((String) map.get("flags"));
        boolean z = zzcbiVar.zzl;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    zzbza.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z) {
                Iterator it = zzy.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zza = null;
                        break;
                    }
                    zzccm zzccmVar = (zzccm) it.next();
                    if (zzccmVar.zza == zzcbjVar && str.equals(zzccmVar.zze())) {
                        zza = zzccmVar;
                        break;
                    }
                }
            } else {
                zza = zzy.zza(zzcbjVar);
            }
            if (zza != null) {
                zzbza.zzj("Precache task is already running.");
                return;
            } else if (zzcbjVar.zzj() == null) {
                zzbza.zzj("Precache requires a dependency provider.");
                return;
            } else {
                Integer zzb4 = zzb(map, "player");
                if (zzb4 == null) {
                    zzb4 = 0;
                }
                if (zzb != null) {
                    zzcbjVar.zzA(zzb.intValue());
                }
                if (zzb2 != null) {
                    zzcbjVar.zzy(zzb2.intValue());
                }
                if (zzb3 != null) {
                    zzcbjVar.zzx(zzb3.intValue());
                }
                int intValue = zzb4.intValue();
                zzccg zzccgVar = zzcbjVar.zzj().zzb;
                if (intValue > 0) {
                    int zzu = zzcba.zzu();
                    if (zzu < zzcbiVar.zzh) {
                        zzccuVar = new zzcdd(zzcbjVar, zzcbiVar);
                    } else if (zzu < zzcbiVar.zzb) {
                        zzccuVar = new zzcda(zzcbjVar, zzcbiVar);
                    } else {
                        zzccuVar = new zzccy(zzcbjVar);
                    }
                } else {
                    zzccuVar = new zzccx(zzcbjVar);
                }
                new zzccm(zzcbjVar, zzccuVar, str, strArr).zzb();
            }
        } else {
            zzccm zza2 = zzy.zza(zzcbjVar);
            if (zza2 == null) {
                zzbza.zzj("Precache must specify a source.");
                return;
            }
            zzccuVar = zza2.zzb;
        }
        Integer zzb5 = zzb(map, "minBufferMs");
        if (zzb5 != null) {
            zzccuVar.zzs(zzb5.intValue());
        }
        Integer zzb6 = zzb(map, "maxBufferMs");
        if (zzb6 != null) {
            zzccuVar.zzr(zzb6.intValue());
        }
        Integer zzb7 = zzb(map, "bufferForPlaybackMs");
        if (zzb7 != null) {
            zzccuVar.zzp(zzb7.intValue());
        }
        Integer zzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb8 != null) {
            zzccuVar.zzq(zzb8.intValue());
        }
    }
}
