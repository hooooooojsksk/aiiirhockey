package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzanp extends zzgqm implements zzgrx {
    private static final zzanp zzb;
    private int zzd;
    private long zzt;
    private long zzu;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = 1000;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = 1000;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        zzanp zzanpVar = new zzanp();
        zzb = zzanpVar;
        zzgqm.zzaT(zzanp.class, zzanpVar);
    }

    private zzanp() {
    }

    public static zzano zza() {
        return (zzano) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzanp zzanpVar, long j) {
        zzanpVar.zzd |= 1;
        zzanpVar.zze = j;
    }

    public static /* synthetic */ void zze(zzanp zzanpVar, long j) {
        zzanpVar.zzd |= 2;
        zzanpVar.zzf = j;
    }

    public static /* synthetic */ void zzf(zzanp zzanpVar, long j) {
        zzanpVar.zzd |= 4;
        zzanpVar.zzg = j;
    }

    public static /* synthetic */ void zzg(zzanp zzanpVar, long j) {
        zzanpVar.zzd |= 8;
        zzanpVar.zzh = j;
    }

    public static /* synthetic */ void zzh(zzanp zzanpVar) {
        zzanpVar.zzd &= -9;
        zzanpVar.zzh = -1L;
    }

    public static /* synthetic */ void zzi(zzanp zzanpVar, long j) {
        zzanpVar.zzd |= 16;
        zzanpVar.zzi = j;
    }

    public static /* synthetic */ void zzj(zzanp zzanpVar, long j) {
        zzanpVar.zzd |= 32;
        zzanpVar.zzj = j;
    }

    public static /* synthetic */ void zzk(zzanp zzanpVar, long j) {
        zzanpVar.zzd |= 128;
        zzanpVar.zzl = j;
    }

    public static /* synthetic */ void zzl(zzanp zzanpVar, long j) {
        zzanpVar.zzd |= 256;
        zzanpVar.zzm = j;
    }

    public static /* synthetic */ void zzm(zzanp zzanpVar, long j) {
        zzanpVar.zzd |= 512;
        zzanpVar.zzn = j;
    }

    public static /* synthetic */ void zzn(zzanp zzanpVar, long j) {
        zzanpVar.zzd |= 2048;
        zzanpVar.zzp = j;
    }

    public static /* synthetic */ void zzo(zzanp zzanpVar, long j) {
        zzanpVar.zzd |= 4096;
        zzanpVar.zzq = j;
    }

    public static /* synthetic */ void zzp(zzanp zzanpVar, long j) {
        zzanpVar.zzd |= 8192;
        zzanpVar.zzr = j;
    }

    public static /* synthetic */ void zzq(zzanp zzanpVar, long j) {
        zzanpVar.zzd |= 16384;
        zzanpVar.zzs = j;
    }

    public static /* synthetic */ void zzr(zzanp zzanpVar, long j) {
        zzanpVar.zzd |= 32768;
        zzanpVar.zzt = j;
    }

    public static /* synthetic */ void zzs(zzanp zzanpVar, long j) {
        zzanpVar.zzd |= 65536;
        zzanpVar.zzu = j;
    }

    public static /* synthetic */ void zzt(zzanp zzanpVar, long j) {
        zzanpVar.zzd |= 131072;
        zzanpVar.zzv = j;
    }

    public static /* synthetic */ void zzu(zzanp zzanpVar, long j) {
        zzanpVar.zzd |= 262144;
        zzanpVar.zzw = j;
    }

    public static /* synthetic */ void zzv(zzanp zzanpVar, int i) {
        zzanpVar.zzk = i - 1;
        zzanpVar.zzd |= 64;
    }

    public static /* synthetic */ void zzw(zzanp zzanpVar, int i) {
        zzanpVar.zzo = i - 1;
        zzanpVar.zzd |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                zzgqq zzgqqVar = zzany.zza;
                return zzaQ(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzgqqVar, "zzl", "zzm", "zzn", "zzo", zzgqqVar, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzano(null);
            } else {
                return new zzanp();
            }
        }
        return (byte) 1;
    }
}
