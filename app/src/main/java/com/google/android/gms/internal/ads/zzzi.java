package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzzi implements zzaax {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzzi(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
            return;
        }
        int i = length - 1;
        this.zzf = jArr2[i] + jArr3[i];
    }

    public final String toString() {
        int i = this.zza;
        String arrays = Arrays.toString(this.zzb);
        String arrays2 = Arrays.toString(this.zzc);
        String arrays3 = Arrays.toString(this.zze);
        String arrays4 = Arrays.toString(this.zzd);
        return "ChunkIndex(length=" + i + ", sizes=" + arrays + ", offsets=" + arrays2 + ", timeUs=" + arrays3 + ", durationsUs=" + arrays4 + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        int zzd = zzew.zzd(this.zze, j, true, true);
        zzaay zzaayVar = new zzaay(this.zze[zzd], this.zzc[zzd]);
        if (zzaayVar.zzb >= j || zzd == this.zza - 1) {
            return new zzaav(zzaayVar, zzaayVar);
        }
        int i = zzd + 1;
        return new zzaav(zzaayVar, new zzaay(this.zze[i], this.zzc[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return true;
    }
}
