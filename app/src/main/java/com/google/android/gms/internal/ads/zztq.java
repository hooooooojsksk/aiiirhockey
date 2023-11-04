package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zztq implements zzxc, zzsh {
    final /* synthetic */ zztv zza;
    private final Uri zzc;
    private final zzgh zzd;
    private final zztl zze;
    private final zzzx zzf;
    private final zzdo zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzabb zzm;
    private boolean zzn;
    private final zzaau zzh = new zzaau();
    private boolean zzj = true;
    private final long zzb = zzsj.zza();
    private zzfl zzl = zzi(0);

    public zztq(zztv zztvVar, Uri uri, zzfg zzfgVar, zztl zztlVar, zzzx zzzxVar, zzdo zzdoVar) {
        this.zza = zztvVar;
        this.zzc = uri;
        this.zzd = new zzgh(zzfgVar);
        this.zze = zztlVar;
        this.zzf = zzzxVar;
        this.zzg = zzdoVar;
    }

    public static /* bridge */ /* synthetic */ void zzf(zztq zztqVar, long j, long j2) {
        zztqVar.zzh.zza = j;
        zztqVar.zzk = j2;
        zztqVar.zzj = true;
        zztqVar.zzn = false;
    }

    private final zzfl zzi(long j) {
        Map map;
        zzfj zzfjVar = new zzfj();
        zzfjVar.zzd(this.zzc);
        zzfjVar.zzc(j);
        zzfjVar.zza(6);
        map = zztv.zzb;
        zzfjVar.zzb(map);
        return zzfjVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxc
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:282:0x0082 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:264:0x000b, B:266:0x001f, B:267:0x0025, B:270:0x003b, B:271:0x0041, B:280:0x0077, B:282:0x0082, B:284:0x008e, B:286:0x0098, B:288:0x00a4, B:290:0x00ae, B:292:0x00ba, B:294:0x00c4, B:296:0x00d6, B:298:0x00e0, B:299:0x00e6, B:308:0x0116, B:309:0x011d, B:311:0x012a, B:313:0x0132, B:315:0x014f, B:317:0x016a, B:318:0x016f, B:320:0x0173, B:302:0x00f0, B:305:0x0104, B:275:0x004d, B:278:0x0063), top: B:374:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0098 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:264:0x000b, B:266:0x001f, B:267:0x0025, B:270:0x003b, B:271:0x0041, B:280:0x0077, B:282:0x0082, B:284:0x008e, B:286:0x0098, B:288:0x00a4, B:290:0x00ae, B:292:0x00ba, B:294:0x00c4, B:296:0x00d6, B:298:0x00e0, B:299:0x00e6, B:308:0x0116, B:309:0x011d, B:311:0x012a, B:313:0x0132, B:315:0x014f, B:317:0x016a, B:318:0x016f, B:320:0x0173, B:302:0x00f0, B:305:0x0104, B:275:0x004d, B:278:0x0063), top: B:374:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00ae A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:264:0x000b, B:266:0x001f, B:267:0x0025, B:270:0x003b, B:271:0x0041, B:280:0x0077, B:282:0x0082, B:284:0x008e, B:286:0x0098, B:288:0x00a4, B:290:0x00ae, B:292:0x00ba, B:294:0x00c4, B:296:0x00d6, B:298:0x00e0, B:299:0x00e6, B:308:0x0116, B:309:0x011d, B:311:0x012a, B:313:0x0132, B:315:0x014f, B:317:0x016a, B:318:0x016f, B:320:0x0173, B:302:0x00f0, B:305:0x0104, B:275:0x004d, B:278:0x0063), top: B:374:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x00c4 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:264:0x000b, B:266:0x001f, B:267:0x0025, B:270:0x003b, B:271:0x0041, B:280:0x0077, B:282:0x0082, B:284:0x008e, B:286:0x0098, B:288:0x00a4, B:290:0x00ae, B:292:0x00ba, B:294:0x00c4, B:296:0x00d6, B:298:0x00e0, B:299:0x00e6, B:308:0x0116, B:309:0x011d, B:311:0x012a, B:313:0x0132, B:315:0x014f, B:317:0x016a, B:318:0x016f, B:320:0x0173, B:302:0x00f0, B:305:0x0104, B:275:0x004d, B:278:0x0063), top: B:374:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x00e0 A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #6 {all -> 0x01eb, blocks: (B:264:0x000b, B:266:0x001f, B:267:0x0025, B:270:0x003b, B:271:0x0041, B:280:0x0077, B:282:0x0082, B:284:0x008e, B:286:0x0098, B:288:0x00a4, B:290:0x00ae, B:292:0x00ba, B:294:0x00c4, B:296:0x00d6, B:298:0x00e0, B:299:0x00e6, B:308:0x0116, B:309:0x011d, B:311:0x012a, B:313:0x0132, B:315:0x014f, B:317:0x016a, B:318:0x016f, B:320:0x0173, B:302:0x00f0, B:305:0x0104, B:275:0x004d, B:278:0x0063), top: B:374:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0116 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:264:0x000b, B:266:0x001f, B:267:0x0025, B:270:0x003b, B:271:0x0041, B:280:0x0077, B:282:0x0082, B:284:0x008e, B:286:0x0098, B:288:0x00a4, B:290:0x00ae, B:292:0x00ba, B:294:0x00c4, B:296:0x00d6, B:298:0x00e0, B:299:0x00e6, B:308:0x0116, B:309:0x011d, B:311:0x012a, B:313:0x0132, B:315:0x014f, B:317:0x016a, B:318:0x016f, B:320:0x0173, B:302:0x00f0, B:305:0x0104, B:275:0x004d, B:278:0x0063), top: B:374:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x012a A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:264:0x000b, B:266:0x001f, B:267:0x0025, B:270:0x003b, B:271:0x0041, B:280:0x0077, B:282:0x0082, B:284:0x008e, B:286:0x0098, B:288:0x00a4, B:290:0x00ae, B:292:0x00ba, B:294:0x00c4, B:296:0x00d6, B:298:0x00e0, B:299:0x00e6, B:308:0x0116, B:309:0x011d, B:311:0x012a, B:313:0x0132, B:315:0x014f, B:317:0x016a, B:318:0x016f, B:320:0x0173, B:302:0x00f0, B:305:0x0104, B:275:0x004d, B:278:0x0063), top: B:374:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x016a A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:264:0x000b, B:266:0x001f, B:267:0x0025, B:270:0x003b, B:271:0x0041, B:280:0x0077, B:282:0x0082, B:284:0x008e, B:286:0x0098, B:288:0x00a4, B:290:0x00ae, B:292:0x00ba, B:294:0x00c4, B:296:0x00d6, B:298:0x00e0, B:299:0x00e6, B:308:0x0116, B:309:0x011d, B:311:0x012a, B:313:0x0132, B:315:0x014f, B:317:0x016a, B:318:0x016f, B:320:0x0173, B:302:0x00f0, B:305:0x0104, B:275:0x004d, B:278:0x0063), top: B:374:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0173 A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #6 {all -> 0x01eb, blocks: (B:264:0x000b, B:266:0x001f, B:267:0x0025, B:270:0x003b, B:271:0x0041, B:280:0x0077, B:282:0x0082, B:284:0x008e, B:286:0x0098, B:288:0x00a4, B:290:0x00ae, B:292:0x00ba, B:294:0x00c4, B:296:0x00d6, B:298:0x00e0, B:299:0x00e6, B:308:0x0116, B:309:0x011d, B:311:0x012a, B:313:0x0132, B:315:0x014f, B:317:0x016a, B:318:0x016f, B:320:0x0173, B:302:0x00f0, B:305:0x0104, B:275:0x004d, B:278:0x0063), top: B:374:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x020b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x01c9 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzxc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztq.zzh():void");
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final void zza(zzen zzenVar) {
        long zzQ;
        long max;
        if (this.zzn) {
            zzQ = this.zza.zzQ(true);
            max = Math.max(zzQ, this.zzk);
        } else {
            max = this.zzk;
        }
        int zza = zzenVar.zza();
        zzabb zzabbVar = this.zzm;
        Objects.requireNonNull(zzabbVar);
        zzaaz.zzb(zzabbVar, zzenVar, zza);
        zzabbVar.zzs(max, 1, zza, 0, null);
        this.zzn = true;
    }
}
