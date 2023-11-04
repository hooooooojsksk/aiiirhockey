package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzaco {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0088, code lost:
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzack zza(java.lang.String r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaco.zza(java.lang.String):com.google.android.gms.internal.ads.zzack");
    }

    private static zzfqk zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        zzfqh zzi = zzfqk.zzi();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (zzex.zzc(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String zza2 = zzex.zza(xmlPullParser, concat2);
                String zza3 = zzex.zza(xmlPullParser, concat3);
                String zza4 = zzex.zza(xmlPullParser, concat4);
                String zza5 = zzex.zza(xmlPullParser, concat5);
                if (zza2 != null && zza3 != null) {
                    zzi.zzf(new zzacj(zza2, zza3, zza4 != null ? Long.parseLong(zza4) : 0L, zza5 != null ? Long.parseLong(zza5) : 0L));
                } else {
                    return zzfqk.zzo();
                }
            }
        } while (!zzex.zzb(xmlPullParser, str.concat(":Directory")));
        return zzi.zzi();
    }
}
