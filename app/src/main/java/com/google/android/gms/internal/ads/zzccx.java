package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzccx extends zzccu {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzccx(zzcbj zzcbjVar) {
        super(zzcbjVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            zzbza.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.zzg = file;
        if (file.isDirectory() || this.zzg.mkdirs()) {
            if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
                return;
            }
            zzbza.zzj("Could not set cache file permissions at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
            return;
        }
        zzbza.zzj("Could not create preload cache directory at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
        this.zzg = null;
    }

    private final File zza(File file) {
        return new File(this.zzg, String.valueOf(file.getName()).concat(".done"));
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final void zzf() {
        this.zzh = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:355:0x0343, code lost:
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0349, code lost:
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0351, code lost:
        if (com.google.android.gms.ads.internal.util.zze.zzm(3) == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0353, code lost:
        com.google.android.gms.internal.ads.zzbza.zze("Preloaded " + com.google.android.gms.internal.ads.zzccx.zzf.format(r13) + " bytes from " + r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0376, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x037f, code lost:
        if (r0.isFile() == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0381, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0389, code lost:
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:389:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x040d  */
    @Override // com.google.android.gms.internal.ads.zzccu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzt(final java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzccx.zzt(java.lang.String):boolean");
    }
}
