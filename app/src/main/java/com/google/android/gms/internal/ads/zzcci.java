package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcci implements zzbhp {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzay.zzb();
                i = zzbyt.zzy(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                zzbza.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Parse pixels for " + str + ", got string " + str2 + ", int " + i + ".");
        }
        return i;
    }

    private static void zzc(zzcax zzcaxVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcaxVar.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                zzbza.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzcaxVar.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcaxVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcaxVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcaxVar.zzD(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int min;
        int min2;
        int i;
        Context context;
        String[] split;
        zzcbj zzcbjVar = (zzcbj) obj;
        Integer num = null;
        Integer valueOf = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer zzl = (zzcbjVar.zzo() == null || zzcbjVar.zzo().zza() == null) ? null : zzcbjVar.zzo().zza().zzl();
        if (valueOf == null || zzl == null || valueOf.equals(zzl)) {
            String str = (String) map.get("action");
            if (str == null) {
                zzbza.zzj("Action missing from video GMSG.");
                return;
            }
            if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
                JSONObject jSONObject = new JSONObject(map);
                jSONObject.remove("google.afma.Notify_dt");
                zzbza.zze("Video GMSG: " + str + " " + jSONObject.toString());
            }
            if ("background".equals(str)) {
                String str2 = (String) map.get("color");
                if (TextUtils.isEmpty(str2)) {
                    zzbza.zzj("Color parameter missing from background video GMSG.");
                    return;
                }
                try {
                    zzcbjVar.setBackgroundColor(Color.parseColor(str2));
                    return;
                } catch (IllegalArgumentException unused) {
                    zzbza.zzj("Invalid color parameter in background video GMSG.");
                    return;
                }
            } else if ("playerBackground".equals(str)) {
                String str3 = (String) map.get("color");
                if (TextUtils.isEmpty(str3)) {
                    zzbza.zzj("Color parameter missing from playerBackground video GMSG.");
                    return;
                }
                try {
                    zzcbjVar.zzB(Color.parseColor(str3));
                    return;
                } catch (IllegalArgumentException unused2) {
                    zzbza.zzj("Invalid color parameter in playerBackground video GMSG.");
                    return;
                }
            } else if ("decoderProps".equals(str)) {
                String str4 = (String) map.get("mimeTypes");
                if (str4 == null) {
                    zzbza.zzj("No MIME types specified for decoder properties inspection.");
                    HashMap hashMap = new HashMap();
                    hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                    hashMap.put("error", "missingMimeTypes");
                    zzcbjVar.zzd("onVideoEvent", hashMap);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                for (String str5 : str4.split(",")) {
                    hashMap2.put(str5, com.google.android.gms.ads.internal.util.zzch.zza(str5.trim()));
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                hashMap3.put("mimeTypes", hashMap2);
                zzcbjVar.zzd("onVideoEvent", hashMap3);
                return;
            } else {
                zzcay zzo = zzcbjVar.zzo();
                if (zzo == null) {
                    zzbza.zzj("Could not get underlay container for a video GMSG.");
                    return;
                }
                boolean equals = "new".equals(str);
                boolean equals2 = "position".equals(str);
                if (equals || equals2) {
                    Context context2 = zzcbjVar.getContext();
                    int zzb = zzb(context2, map, "x", 0);
                    int zzb2 = zzb(context2, map, "y", 0);
                    int zzb3 = zzb(context2, map, "w", -1);
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdt)).booleanValue()) {
                        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                            com.google.android.gms.ads.internal.util.zze.zza("Calculate width with original width " + zzb3 + ", videoHost.getVideoBoundingWidth() " + zzcbjVar.zzh() + ", x " + zzb + ".");
                        }
                        min = Math.min(zzb3, zzcbjVar.zzh() - zzb);
                    } else if (zzb3 == -1) {
                        min = zzcbjVar.zzh();
                    } else {
                        min = Math.min(zzb3, zzcbjVar.zzh());
                    }
                    int zzb4 = zzb(context2, map, "h", -1);
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdt)).booleanValue()) {
                        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                            com.google.android.gms.ads.internal.util.zze.zza("Calculate height with original height " + zzb4 + ", videoHost.getVideoBoundingHeight() " + zzcbjVar.zzg() + ", y " + zzb2 + ".");
                        }
                        min2 = Math.min(zzb4, zzcbjVar.zzg() - zzb2);
                    } else if (zzb4 == -1) {
                        min2 = zzcbjVar.zzg();
                    } else {
                        min2 = Math.min(zzb4, zzcbjVar.zzg());
                    }
                    int i2 = min2;
                    try {
                        i = Integer.parseInt((String) map.get("player"));
                    } catch (NumberFormatException unused3) {
                        i = 0;
                    }
                    boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                    if (!equals || zzo.zza() != null) {
                        zzo.zzb(zzb, zzb2, min, i2);
                        return;
                    }
                    zzo.zzc(zzb, zzb2, min, i2, i, parseBoolean, new zzcbi((String) map.get("flags")), valueOf);
                    zzcax zza = zzo.zza();
                    if (zza != null) {
                        zzc(zza, map);
                        return;
                    }
                    return;
                }
                zzcfe zzq = zzcbjVar.zzq();
                if (zzq != null) {
                    if ("timeupdate".equals(str)) {
                        String str6 = (String) map.get("currentTime");
                        if (str6 == null) {
                            zzbza.zzj("currentTime parameter missing from timeupdate video GMSG.");
                            return;
                        }
                        try {
                            zzq.zzt(Float.parseFloat(str6));
                            return;
                        } catch (NumberFormatException unused4) {
                            zzbza.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                            return;
                        }
                    } else if ("skip".equals(str)) {
                        zzq.zzu();
                        return;
                    }
                }
                zzcax zza2 = zzo.zza();
                if (zza2 == null) {
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
                    zzcbjVar.zzd("onVideoEvent", hashMap4);
                    return;
                } else if ("click".equals(str)) {
                    int zzb5 = zzb(zzcbjVar.getContext(), map, "x", 0);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, zzb5, zzb(context, map, "y", 0), 0);
                    zza2.zzx(obtain);
                    obtain.recycle();
                    return;
                } else if ("currentTime".equals(str)) {
                    String str7 = (String) map.get("time");
                    if (str7 == null) {
                        zzbza.zzj("Time parameter missing from currentTime video GMSG.");
                        return;
                    }
                    try {
                        zza2.zzw((int) (Float.parseFloat(str7) * 1000.0f));
                        return;
                    } catch (NumberFormatException unused5) {
                        zzbza.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                        return;
                    }
                } else if ("hide".equals(str)) {
                    zza2.setVisibility(4);
                    return;
                } else if ("load".equals(str)) {
                    zza2.zzr();
                    return;
                } else if ("loadControl".equals(str)) {
                    zzc(zza2, map);
                    return;
                } else if ("muted".equals(str)) {
                    if (Boolean.parseBoolean((String) map.get("muted"))) {
                        zza2.zzs();
                        return;
                    } else {
                        zza2.zzI();
                        return;
                    }
                } else if ("pause".equals(str)) {
                    zza2.zzu();
                    return;
                } else if ("play".equals(str)) {
                    zza2.zzv();
                    return;
                } else if ("show".equals(str)) {
                    zza2.setVisibility(0);
                    return;
                } else if ("src".equals(str)) {
                    String str8 = (String) map.get("src");
                    if (map.containsKey("periodicReportIntervalMs")) {
                        try {
                            num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                        } catch (NumberFormatException unused6) {
                            zzbza.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                        }
                    }
                    String[] strArr = {str8};
                    String str9 = (String) map.get("demuxed");
                    if (str9 != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(str9);
                            String[] strArr2 = new String[jSONArray.length()];
                            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                strArr2[i3] = jSONArray.getString(i3);
                            }
                            strArr = strArr2;
                        } catch (JSONException unused7) {
                            zzbza.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                            strArr = new String[]{str8};
                        }
                    }
                    if (num != null) {
                        zzcbjVar.zzA(num.intValue());
                    }
                    zza2.zzE(str8, strArr);
                    return;
                } else if ("touchMove".equals(str)) {
                    Context context3 = zzcbjVar.getContext();
                    zza2.zzH(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
                    if (this.zza) {
                        return;
                    }
                    zzcbjVar.zzu();
                    this.zza = true;
                    return;
                } else if ("volume".equals(str)) {
                    String str10 = (String) map.get("volume");
                    if (str10 == null) {
                        zzbza.zzj("Level parameter missing from volume video GMSG.");
                        return;
                    }
                    try {
                        zza2.zzG(Float.parseFloat(str10));
                        return;
                    } catch (NumberFormatException unused8) {
                        zzbza.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
                        return;
                    }
                } else if ("watermark".equals(str)) {
                    zza2.zzn();
                    return;
                } else {
                    zzbza.zzj("Unknown video action: ".concat(str));
                    return;
                }
            }
        }
        zzbza.zzi(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", valueOf, zzl));
    }
}
