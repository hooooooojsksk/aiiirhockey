package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import androidx.core.app.NotificationManagerCompat;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbhz implements zzbhp {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdpi zzb;
    private final zzfdk zzc;
    private final zzbpz zze;
    private final zzeaf zzf;
    private com.google.android.gms.ads.internal.overlay.zzx zzg = null;
    private final zzbzf zzd = new zzbzf(null);

    public zzbhz(com.google.android.gms.ads.internal.zzb zzbVar, zzbpz zzbpzVar, zzeaf zzeafVar, zzdpi zzdpiVar, zzfdk zzfdkVar) {
        this.zza = zzbVar;
        this.zze = zzbpzVar;
        this.zzf = zzeafVar;
        this.zzb = zzdpiVar;
        this.zzc = zzfdkVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return 7;
            }
            if ("l".equalsIgnoreCase(str)) {
                return 6;
            }
            return "c".equalsIgnoreCase(str) ? 14 : -1;
        }
        return -1;
    }

    static Uri zzc(Context context, zzapw zzapwVar, Uri uri, View view, Activity activity) {
        if (zzapwVar == null) {
            return uri;
        }
        try {
            return zzapwVar.zze(uri) ? zzapwVar.zza(uri, context, view, activity) : uri;
        } catch (zzapx unused) {
            return uri;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            zzbza.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0122, code lost:
        r11 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00df, code lost:
        if (com.google.android.gms.internal.ads.zzbhy.zzc(r11, r5, r6, r7) == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzh(com.google.android.gms.ads.internal.client.zza r18, java.util.Map r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhz.zzh(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    private final void zzi(boolean z) {
        zzbpz zzbpzVar = this.zze;
        if (zzbpzVar != null) {
            zzbpzVar.zza(z);
        }
    }

    private final boolean zzj(com.google.android.gms.ads.internal.client.zza zzaVar, Context context, String str, String str2) {
        zzdpi zzdpiVar = this.zzb;
        if (zzdpiVar != null) {
            zzean.zzc(context, zzdpiVar, this.zzc, this.zzf, str2, "offline_open");
        }
        if (com.google.android.gms.ads.internal.zzt.zzo().zzx(context)) {
            this.zzf.zzh(this.zzd, str2);
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzbr zzv = com.google.android.gms.ads.internal.util.zzs.zzv(context);
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean areNotificationsEnabled = NotificationManagerCompat.from(context).areNotificationsEnabled();
        boolean zzh = com.google.android.gms.ads.internal.zzt.zzq().zzh(context, "offline_notification_channel");
        zzcei zzceiVar = (zzcei) zzaVar;
        boolean z = zzceiVar.zzO().zzi() && zzceiVar.zzi() == null;
        if (areNotificationsEnabled && !zzh && zzv != null && !z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhK)).booleanValue()) {
                if (zzceiVar.zzO().zzi()) {
                    zzean.zzh(zzceiVar.zzi(), null, zzv, this.zzf, this.zzb, this.zzc, str2, str);
                } else {
                    ((zzcfn) zzaVar).zzaE(zzv, this.zzf, this.zzb, this.zzc, str2, str, 14);
                }
                zzdpi zzdpiVar2 = this.zzb;
                if (zzdpiVar2 != null) {
                    zzean.zzc(context, zzdpiVar2, this.zzc, this.zzf, str2, "dialog_impression");
                }
                zzaVar.onAdClicked();
                return true;
            }
        }
        this.zzf.zzc(str2);
        if (this.zzb != null) {
            HashMap hashMap = new HashMap();
            if (!areNotificationsEnabled) {
                hashMap.put("dialog_not_shown_reason", "notifications_disabled");
            } else if (zzh) {
                hashMap.put("dialog_not_shown_reason", "notification_channel_disabled");
            } else if (zzv == null) {
                hashMap.put("dialog_not_shown_reason", "work_manager_unavailable");
            } else {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhK)).booleanValue()) {
                    hashMap.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z) {
                    hashMap.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            zzean.zzd(context, this.zzb, this.zzc, this.zzf, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    public final void zzk(int i) {
        if (this.zzb == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhS)).booleanValue()) {
            zzfdk zzfdkVar = this.zzc;
            String zza = zzbbr.zza(i);
            zzfdj zzb = zzfdj.zzb("cct_action");
            zzb.zza("cct_open_status", zza);
            zzfdkVar.zzb(zzb);
            return;
        }
        zzdph zza2 = this.zzb.zza();
        zza2.zzb("action", "cct_action");
        zza2.zzb("cct_open_status", zzbbr.zza(i));
        zza2.zzg();
    }

    /* JADX WARN: Removed duplicated region for block: B:311:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x039f  */
    @Override // com.google.android.gms.internal.ads.zzbhp
    /* renamed from: zze */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.ads.internal.client.zza r33, java.util.Map r34) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhz.zza(com.google.android.gms.ads.internal.client.zza, java.util.Map):void");
    }
}
