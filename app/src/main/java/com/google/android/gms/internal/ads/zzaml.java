package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaml extends zzgqm implements zzgrx {
    private static final zzaml zzb;
    private int zzd;
    private long zzf;
    private long zzj;
    private long zzk;
    private long zzm;
    private int zzq;
    private String zze = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzn = "";
    private String zzo = "";
    private zzgqv zzp = zzaM();

    static {
        zzaml zzamlVar = new zzaml();
        zzb = zzamlVar;
        zzgqm.zzaT(zzaml.class, zzamlVar);
    }

    private zzaml() {
    }

    public static zzamh zza() {
        return (zzamh) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzaml zzamlVar, long j) {
        zzamlVar.zzd |= 2;
        zzamlVar.zzf = j;
    }

    public static /* synthetic */ void zze(zzaml zzamlVar, String str) {
        str.getClass();
        zzamlVar.zzd |= 4;
        zzamlVar.zzg = str;
    }

    public static /* synthetic */ void zzf(zzaml zzamlVar, String str) {
        str.getClass();
        zzamlVar.zzd |= 8;
        zzamlVar.zzh = str;
    }

    public static /* synthetic */ void zzg(zzaml zzamlVar, String str) {
        zzamlVar.zzd |= 16;
        zzamlVar.zzi = str;
    }

    public static /* synthetic */ void zzh(zzaml zzamlVar, String str) {
        zzamlVar.zzd |= 1024;
        zzamlVar.zzo = str;
    }

    public static /* synthetic */ void zzi(zzaml zzamlVar, String str) {
        str.getClass();
        zzamlVar.zzd |= 1;
        zzamlVar.zze = str;
    }

    public static /* synthetic */ void zzj(zzaml zzamlVar, int i) {
        zzamlVar.zzq = i - 1;
        zzamlVar.zzd |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzamh(null);
                }
                return new zzaml();
            }
            return zzaQ(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", zzamj.class, "zzq", zzamk.zza});
        }
        return (byte) 1;
    }
}
