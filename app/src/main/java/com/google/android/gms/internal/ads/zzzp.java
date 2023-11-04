package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzzp implements zzaab {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    private static final zzzo zzc = new zzzo(new zzzn() { // from class: com.google.android.gms.internal.ads.zzzl
        @Override // com.google.android.gms.internal.ads.zzzn
        public final Constructor zza() {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzzu.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final zzzo zzd = new zzzo(new zzzn() { // from class: com.google.android.gms.internal.ads.zzzm
        @Override // com.google.android.gms.internal.ads.zzzn
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzzu.class).getConstructor(new Class[0]);
        }
    });
    private zzfqk zze;

    @Override // com.google.android.gms.internal.ads.zzaab
    public final synchronized zzzu[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:447:0x031d, code lost:
        if (r10 == r4) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x031f, code lost:
        zzc(r10, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:349:0x01a6 A[Catch: all -> 0x0341, TryCatch #0 {, blocks: (B:239:0x0003, B:241:0x0018, B:244:0x001f, B:349:0x01a6, B:350:0x01a9, B:448:0x031f, B:449:0x0322, B:451:0x0327, B:454:0x032d, B:455:0x0330, B:456:0x0333, B:353:0x01b2, B:355:0x01ba, B:358:0x01c4, B:361:0x01cf, B:363:0x01d7, B:366:0x01e1, B:369:0x01ec, B:372:0x01f7, B:375:0x0202, B:377:0x020a, B:379:0x0212, B:382:0x021c, B:384:0x022a, B:387:0x0234, B:390:0x023f, B:392:0x0247, B:394:0x0255, B:396:0x0263, B:399:0x0273, B:401:0x0281, B:404:0x028b, B:406:0x0293, B:408:0x029b, B:410:0x02a3, B:413:0x02ac, B:415:0x02b4, B:418:0x02c3, B:420:0x02cb, B:423:0x02d4, B:425:0x02dc, B:428:0x02e5, B:430:0x02ed, B:433:0x02f6, B:248:0x0042, B:249:0x004a, B:330:0x0177, B:251:0x004f, B:254:0x005b, B:257:0x0067, B:260:0x0073, B:263:0x007f, B:266:0x008a, B:269:0x0095, B:272:0x00a0, B:275:0x00ac, B:278:0x00b8, B:281:0x00c4, B:284:0x00d0, B:287:0x00db, B:290:0x00e6, B:293:0x00f1, B:296:0x00fd, B:299:0x0109, B:302:0x0115, B:305:0x0120, B:308:0x012b, B:311:0x0136, B:314:0x0141, B:317:0x014b, B:320:0x0156, B:323:0x0161, B:326:0x016c), top: B:464:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x01b2 A[Catch: all -> 0x0341, TryCatch #0 {, blocks: (B:239:0x0003, B:241:0x0018, B:244:0x001f, B:349:0x01a6, B:350:0x01a9, B:448:0x031f, B:449:0x0322, B:451:0x0327, B:454:0x032d, B:455:0x0330, B:456:0x0333, B:353:0x01b2, B:355:0x01ba, B:358:0x01c4, B:361:0x01cf, B:363:0x01d7, B:366:0x01e1, B:369:0x01ec, B:372:0x01f7, B:375:0x0202, B:377:0x020a, B:379:0x0212, B:382:0x021c, B:384:0x022a, B:387:0x0234, B:390:0x023f, B:392:0x0247, B:394:0x0255, B:396:0x0263, B:399:0x0273, B:401:0x0281, B:404:0x028b, B:406:0x0293, B:408:0x029b, B:410:0x02a3, B:413:0x02ac, B:415:0x02b4, B:418:0x02c3, B:420:0x02cb, B:423:0x02d4, B:425:0x02dc, B:428:0x02e5, B:430:0x02ed, B:433:0x02f6, B:248:0x0042, B:249:0x004a, B:330:0x0177, B:251:0x004f, B:254:0x005b, B:257:0x0067, B:260:0x0073, B:263:0x007f, B:266:0x008a, B:269:0x0095, B:272:0x00a0, B:275:0x00ac, B:278:0x00b8, B:281:0x00c4, B:284:0x00d0, B:287:0x00db, B:290:0x00e6, B:293:0x00f1, B:296:0x00fd, B:299:0x0109, B:302:0x0115, B:305:0x0120, B:308:0x012b, B:311:0x0136, B:314:0x0141, B:317:0x014b, B:320:0x0156, B:323:0x0161, B:326:0x016c), top: B:464:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0327 A[Catch: all -> 0x0341, TryCatch #0 {, blocks: (B:239:0x0003, B:241:0x0018, B:244:0x001f, B:349:0x01a6, B:350:0x01a9, B:448:0x031f, B:449:0x0322, B:451:0x0327, B:454:0x032d, B:455:0x0330, B:456:0x0333, B:353:0x01b2, B:355:0x01ba, B:358:0x01c4, B:361:0x01cf, B:363:0x01d7, B:366:0x01e1, B:369:0x01ec, B:372:0x01f7, B:375:0x0202, B:377:0x020a, B:379:0x0212, B:382:0x021c, B:384:0x022a, B:387:0x0234, B:390:0x023f, B:392:0x0247, B:394:0x0255, B:396:0x0263, B:399:0x0273, B:401:0x0281, B:404:0x028b, B:406:0x0293, B:408:0x029b, B:410:0x02a3, B:413:0x02ac, B:415:0x02b4, B:418:0x02c3, B:420:0x02cb, B:423:0x02d4, B:425:0x02dc, B:428:0x02e5, B:430:0x02ed, B:433:0x02f6, B:248:0x0042, B:249:0x004a, B:330:0x0177, B:251:0x004f, B:254:0x005b, B:257:0x0067, B:260:0x0073, B:263:0x007f, B:266:0x008a, B:269:0x0095, B:272:0x00a0, B:275:0x00ac, B:278:0x00b8, B:281:0x00c4, B:284:0x00d0, B:287:0x00db, B:290:0x00e6, B:293:0x00f1, B:296:0x00fd, B:299:0x0109, B:302:0x0115, B:305:0x0120, B:308:0x012b, B:311:0x0136, B:314:0x0141, B:317:0x014b, B:320:0x0156, B:323:0x0161, B:326:0x016c), top: B:464:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzaab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.zzzu[] zzb(android.net.Uri r22, java.util.Map r23) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzp.zzb(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzzu[]");
    }

    private final void zzc(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzahc());
                return;
            case 1:
                list.add(new zzahf());
                return;
            case 2:
                list.add(new zzahi(0));
                return;
            case 3:
                list.add(new zzabj(0));
                return;
            case 4:
                zzzu zza2 = zzc.zza(0);
                if (zza2 != null) {
                    list.add(zza2);
                    return;
                } else {
                    list.add(new zzaca(0));
                    return;
                }
            case 5:
                list.add(new zzacd());
                return;
            case 6:
                list.add(new zzaeu(0));
                return;
            case 7:
                list.add(new zzafc(0));
                return;
            case 8:
                list.add(new zzafx(0, null));
                list.add(new zzagc(0));
                return;
            case 9:
                list.add(new zzagq());
                return;
            case 10:
                list.add(new zzail());
                return;
            case 11:
                if (this.zze == null) {
                    this.zze = zzfqk.zzo();
                }
                list.add(new zzaiv(1, new zzeu(0L), new zzahk(0, this.zze), 112800));
                return;
            case 12:
                list.add(new zzajh());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new zzaci());
                return;
            case 15:
                zzzu zza3 = zzd.zza(new Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    return;
                }
                return;
            case 16:
                list.add(new zzabo());
                return;
        }
    }
}
