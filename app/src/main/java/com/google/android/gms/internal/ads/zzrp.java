package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzrp {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();
    private static int zzd = -1;

    public static int zza() throws zzrj {
        int i;
        int i2 = zzd;
        if (i2 == -1) {
            zzqx zzc2 = zzc("video/avc", false, false);
            if (zzc2 != null) {
                int i3 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzc2.zzh()) {
                    int i4 = codecProfileLevel.level;
                    if (i4 == 1 || i4 == 2) {
                        i = 25344;
                    } else {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                continue;
                            case 64:
                                i = 202752;
                                continue;
                            case 128:
                            case 256:
                                i = 414720;
                                continue;
                            case 512:
                                i = 921600;
                                continue;
                            case 1024:
                                i = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                continue;
                            case 8192:
                                i = 2228224;
                                continue;
                            case 16384:
                                i = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                continue;
                            default:
                                i = -1;
                                continue;
                        }
                    }
                    i3 = Math.max(i, i3);
                }
                i2 = Math.max(i3, zzew.zza >= 21 ? 345600 : 172800);
            } else {
                i2 = 0;
            }
            zzd = i2;
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:564:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x02c5 A[Catch: NumberFormatException -> 0x02d5, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x02d5, blocks: (B:648:0x026a, B:650:0x027c, B:661:0x0298, B:677:0x02c5), top: B:987:0x026a }] */
    /* JADX WARN: Removed duplicated region for block: B:862:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:863:0x061f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zzb(com.google.android.gms.internal.ads.zzaf r17) {
        /*
            Method dump skipped, instructions count: 2536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrp.zzb(com.google.android.gms.internal.ads.zzaf):android.util.Pair");
    }

    public static zzqx zzc(String str, boolean z, boolean z2) throws zzrj {
        List zzf = zzf(str, false, false);
        if (zzf.isEmpty()) {
            return null;
        }
        return (zzqx) zzf.get(0);
    }

    public static zzqx zzd() throws zzrj {
        return zzc("audio/raw", false, false);
    }

    public static String zze(zzaf zzafVar) {
        Pair zzb2;
        if ("audio/eac3-joc".equals(zzafVar.zzm)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(zzafVar.zzm) || (zzb2 = zzb(zzafVar)) == null) {
            return null;
        }
        int intValue = ((Integer) zzb2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static synchronized List zzf(String str, boolean z, boolean z2) throws zzrj {
        zzrk zzrmVar;
        int i;
        synchronized (zzrp.class) {
            zzrh zzrhVar = new zzrh(str, z, z2);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzrhVar);
            if (list != null) {
                return list;
            }
            if (zzew.zza >= 21) {
                zzrmVar = new zzrn(z, z2);
            } else {
                zzrmVar = new zzrm(null);
            }
            ArrayList zzh = zzh(zzrhVar, zzrmVar);
            if (z && zzh.isEmpty() && (i = zzew.zza) >= 21 && i <= 23) {
                zzh = zzh(zzrhVar, new zzrm(null));
                if (!zzh.isEmpty()) {
                    String str2 = ((zzqx) zzh.get(0)).zza;
                    zzee.zze("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + str2);
                }
            }
            if ("audio/raw".equals(str)) {
                if (zzew.zza < 26 && zzew.zzb.equals("R9") && zzh.size() == 1 && ((zzqx) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzh.add(zzqx.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzi(zzh, new zzro() { // from class: com.google.android.gms.internal.ads.zzrf
                    @Override // com.google.android.gms.internal.ads.zzro
                    public final int zza(Object obj) {
                        int i2 = zzrp.zza;
                        String str3 = ((zzqx) obj).zza;
                        if (str3.startsWith("OMX.google") || str3.startsWith("c2.android")) {
                            return 1;
                        }
                        return (zzew.zza >= 26 || !str3.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (zzew.zza < 21 && zzh.size() > 1) {
                String str3 = ((zzqx) zzh.get(0)).zza;
                if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                    zzi(zzh, new zzro() { // from class: com.google.android.gms.internal.ads.zzrg
                        @Override // com.google.android.gms.internal.ads.zzro
                        public final int zza(Object obj) {
                            int i2 = zzrp.zza;
                            return ((zzqx) obj).zza.startsWith("OMX.google") ? 1 : 0;
                        }
                    });
                }
            }
            if (zzew.zza < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzqx) zzh.get(0)).zza)) {
                zzh.add((zzqx) zzh.remove(0));
            }
            zzfqk zzm = zzfqk.zzm(zzh);
            hashMap.put(zzrhVar, zzm);
            return zzm;
        }
    }

    public static List zzg(List list, final zzaf zzafVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zzro() { // from class: com.google.android.gms.internal.ads.zzrd
            @Override // com.google.android.gms.internal.ads.zzro
            public final int zza(Object obj) {
                zzaf zzafVar2 = zzaf.this;
                int i = zzrp.zza;
                return ((zzqx) obj).zzd(zzafVar2) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:365:0x0254, code lost:
        if (r1.zzb == false) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:338:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0209 A[Catch: Exception -> 0x02b2, TryCatch #5 {Exception -> 0x02b2, blocks: (B:330:0x01d8, B:336:0x01ef, B:342:0x0203, B:344:0x0209, B:349:0x0218, B:351:0x0222, B:361:0x024c, B:352:0x0227, B:354:0x0237, B:356:0x023f, B:345:0x020f), top: B:411:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x020f A[Catch: Exception -> 0x02b2, TryCatch #5 {Exception -> 0x02b2, blocks: (B:330:0x01d8, B:336:0x01ef, B:342:0x0203, B:344:0x0209, B:349:0x0218, B:351:0x0222, B:361:0x024c, B:352:0x0227, B:354:0x0237, B:356:0x023f, B:345:0x020f), top: B:411:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0222 A[Catch: Exception -> 0x02b2, TryCatch #5 {Exception -> 0x02b2, blocks: (B:330:0x01d8, B:336:0x01ef, B:342:0x0203, B:344:0x0209, B:349:0x0218, B:351:0x0222, B:361:0x024c, B:352:0x0227, B:354:0x0237, B:356:0x023f, B:345:0x020f), top: B:411:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0227 A[Catch: Exception -> 0x02b2, TryCatch #5 {Exception -> 0x02b2, blocks: (B:330:0x01d8, B:336:0x01ef, B:342:0x0203, B:344:0x0209, B:349:0x0218, B:351:0x0222, B:361:0x024c, B:352:0x0227, B:354:0x0237, B:356:0x023f, B:345:0x020f), top: B:411:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x02c1 A[Catch: Exception -> 0x030f, TRY_ENTER, TryCatch #1 {Exception -> 0x030f, blocks: (B:215:0x0008, B:217:0x001c, B:219:0x0026, B:222:0x0033, B:226:0x0041, B:228:0x0047, B:230:0x004d, B:232:0x0055, B:234:0x005d, B:236:0x0065, B:238:0x006d, B:240:0x0075, B:242:0x007d, B:245:0x0085, B:247:0x008d, B:249:0x0095, B:251:0x009d, B:253:0x00a7, B:255:0x00b1, B:257:0x00bb, B:259:0x00c5, B:261:0x00cf, B:263:0x00d9, B:265:0x00e3, B:267:0x00ed, B:270:0x00f5, B:272:0x00fd, B:274:0x0105, B:276:0x010f, B:278:0x0119, B:280:0x0121, B:282:0x012b, B:284:0x0135, B:286:0x0139, B:288:0x0141, B:290:0x0149, B:292:0x014f, B:294:0x0157, B:296:0x015f, B:298:0x0167, B:387:0x02b9, B:390:0x02c1, B:392:0x02c7, B:393:0x02e1, B:394:0x0302, B:301:0x0171, B:302:0x0176, B:304:0x017e, B:307:0x0189, B:309:0x0191, B:312:0x019c, B:314:0x01a4, B:317:0x01af, B:319:0x01b7, B:322:0x01c2, B:324:0x01ca), top: B:403:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0252 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x02e1 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zzrh r23, com.google.android.gms.internal.ads.zzrk r24) throws com.google.android.gms.internal.ads.zzrj {
        /*
            Method dump skipped, instructions count: 793
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrp.zzh(com.google.android.gms.internal.ads.zzrh, com.google.android.gms.internal.ads.zzrk):java.util.ArrayList");
    }

    private static void zzi(List list, final zzro zzroVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzre
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                zzro zzroVar2 = zzro.this;
                int i = zzrp.zza;
                return zzroVar2.zza(obj2) - zzroVar2.zza(obj);
            }
        });
    }

    private static boolean zzj(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzew.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzbt.zzg(str)) {
            return true;
        }
        String zza2 = zzfnb.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        return (zza2.startsWith("omx.") || zza2.startsWith("c2.")) ? false : true;
    }
}
