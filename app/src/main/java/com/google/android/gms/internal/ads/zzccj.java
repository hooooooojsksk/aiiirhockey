package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzccj implements zzbhp {
    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcbj zzcbjVar = (zzcbj) obj;
        zzcfe zzq = zzcbjVar.zzq();
        if (zzq == null) {
            try {
                zzcfe zzcfeVar = new zzcfe(zzcbjVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcbjVar.zzC(zzcfeVar);
                zzq = zzcfeVar;
            } catch (NullPointerException e) {
                e = e;
                zzbza.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                zzbza.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i = 0;
        if (parseInt >= 0 && parseInt <= 3) {
            i = parseInt;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            zzbza.zze("Video Meta GMSG: currentTime : " + parseFloat2 + " , duration : " + parseFloat + " , isMuted : " + equals + " , playbackState : " + i + " , aspectRatio : " + str);
        }
        zzq.zzc(parseFloat2, parseFloat, i, equals, parseFloat3);
    }
}
