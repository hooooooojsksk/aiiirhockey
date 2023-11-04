package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgll extends zzgqm implements zzgrx {
    private static final zzgll zzb;
    private int zzd;
    private zzgqv zze = zzaM();

    static {
        zzgll zzgllVar = new zzgll();
        zzb = zzgllVar;
        zzgqm.zzaT(zzgll.class, zzgllVar);
    }

    private zzgll() {
    }

    public static zzgli zzd() {
        return (zzgli) zzb.zzaA();
    }

    public static zzgll zzg(InputStream inputStream, zzgpy zzgpyVar) throws IOException {
        return (zzgll) zzgqm.zzaH(zzb, inputStream, zzgpyVar);
    }

    public static zzgll zzh(byte[] bArr, zzgpy zzgpyVar) throws zzgqy {
        return (zzgll) zzgqm.zzaI(zzb, bArr, zzgpyVar);
    }

    public static /* synthetic */ void zzk(zzgll zzgllVar, zzglk zzglkVar) {
        zzglkVar.getClass();
        zzgqv zzgqvVar = zzgllVar.zze;
        if (!zzgqvVar.zzc()) {
            zzgllVar.zze = zzgqm.zzaN(zzgqvVar);
        }
        zzgllVar.zze.add(zzglkVar);
    }

    public final int zza() {
        return this.zze.size();
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
                    return new zzgli(null);
                }
                return new zzgll();
            }
            return zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzglk.class});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzglk zze(int i) {
        return (zzglk) this.zze.get(i);
    }

    public final List zzi() {
        return this.zze;
    }
}
