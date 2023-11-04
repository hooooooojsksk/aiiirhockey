package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzabp implements zzabk {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzabp(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzabp zzb(zzen zzenVar) {
        int zzg = zzenVar.zzg();
        zzenVar.zzG(8);
        int zzg2 = zzenVar.zzg();
        int zzg3 = zzenVar.zzg();
        zzenVar.zzG(4);
        int zzg4 = zzenVar.zzg();
        zzenVar.zzG(12);
        return new zzabp(zzg, zzg2, zzg3, zzg4);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final int zza() {
        return 1751742049;
    }
}
