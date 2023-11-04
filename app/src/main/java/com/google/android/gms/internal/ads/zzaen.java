package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.UByte;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaen implements zzaep {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzaew zzc = new zzaew();
    private zzaeo zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzzv zzzvVar, int i) throws IOException {
        ((zzzk) zzzvVar).zzn(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.zza[i2] & UByte.MAX_VALUE);
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zza(zzaeo zzaeoVar) {
        this.zzd = zzaeoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0087, code lost:
        if (r0 == 1) goto L29;
     */
    @Override // com.google.android.gms.internal.ads.zzaep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzzv r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaen.zzc(com.google.android.gms.internal.ads.zzzv):boolean");
    }
}
