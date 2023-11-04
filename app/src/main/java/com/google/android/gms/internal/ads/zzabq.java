package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzabq implements zzabk {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzabq(int i, int i2, int i3, int i4, int i5, int i6) {
        this.zza = i;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
    }

    public static zzabq zzb(zzen zzenVar) {
        int zzg = zzenVar.zzg();
        zzenVar.zzG(12);
        int zzg2 = zzenVar.zzg();
        int zzg3 = zzenVar.zzg();
        int zzg4 = zzenVar.zzg();
        zzenVar.zzG(4);
        int zzg5 = zzenVar.zzg();
        int zzg6 = zzenVar.zzg();
        zzenVar.zzG(8);
        return new zzabq(zzg, zzg2, zzg3, zzg4, zzg5, zzg6);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final int zza() {
        return 1752331379;
    }
}
