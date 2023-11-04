package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgjj extends zzgqm implements zzgrx {
    private static final zzgjj zzb;
    private zzgjs zzd;
    private zzgjd zze;
    private int zzf;

    static {
        zzgjj zzgjjVar = new zzgjj();
        zzb = zzgjjVar;
        zzgqm.zzaT(zzgjj.class, zzgjjVar);
    }

    private zzgjj() {
    }

    public static zzgji zzc() {
        return (zzgji) zzb.zzaA();
    }

    public static zzgjj zze() {
        return zzb;
    }

    public static /* synthetic */ void zzg(zzgjj zzgjjVar, zzgjs zzgjsVar) {
        zzgjsVar.getClass();
        zzgjjVar.zzd = zzgjsVar;
    }

    public static /* synthetic */ void zzh(zzgjj zzgjjVar, zzgjd zzgjdVar) {
        zzgjdVar.getClass();
        zzgjjVar.zze = zzgjdVar;
    }

    public final zzgjd zza() {
        zzgjd zzgjdVar = this.zze;
        return zzgjdVar == null ? zzgjd.zzd() : zzgjdVar;
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
                    return new zzgji(null);
                }
                return new zzgjj();
            }
            return zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgjs zzf() {
        zzgjs zzgjsVar = this.zzd;
        return zzgjsVar == null ? zzgjs.zzd() : zzgjsVar;
    }

    public final int zzi() {
        int i = this.zzf;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
