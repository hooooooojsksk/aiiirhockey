package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgqi;
import com.google.android.gms.internal.ads.zzgqm;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzgqm<MessageType extends zzgqm<MessageType, BuilderType>, BuilderType extends zzgqi<MessageType, BuilderType>> extends zzgon<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzgth zzc = zzgth.zzc();

    private final int zza(zzgsp zzgspVar) {
        if (zzgspVar == null) {
            return zzgse.zza().zzb(getClass()).zza(this);
        }
        return zzgspVar.zza(this);
    }

    public static zzgqm zzaC(Class cls) {
        Map map = zzb;
        zzgqm zzgqmVar = (zzgqm) map.get(cls);
        if (zzgqmVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgqmVar = (zzgqm) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgqmVar == null) {
            zzgqmVar = (zzgqm) ((zzgqm) zzgtq.zzg(cls)).zzb(6, null, null);
            if (zzgqmVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzgqmVar);
        }
        return zzgqmVar;
    }

    public static zzgqm zzaE(zzgqm zzgqmVar, zzgpe zzgpeVar) throws zzgqy {
        zzgpy zzgpyVar = zzgpy.zza;
        zzgpm zzl = zzgpeVar.zzl();
        zzgqm zzaD = zzgqmVar.zzaD();
        try {
            zzgsp zzb2 = zzgse.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgpn.zzq(zzl), zzgpyVar);
            zzb2.zzf(zzaD);
            try {
                zzl.zzz(0);
                zzc(zzaD);
                zzc(zzaD);
                return zzaD;
            } catch (zzgqy e) {
                e.zzh(zzaD);
                throw e;
            }
        } catch (zzgqy e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgqy(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgtf e3) {
            zzgqy zza = e3.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgqy) {
                throw ((zzgqy) e4.getCause());
            }
            zzgqy zzgqyVar = new zzgqy(e4);
            zzgqyVar.zzh(zzaD);
            throw zzgqyVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgqy) {
                throw ((zzgqy) e5.getCause());
            }
            throw e5;
        }
    }

    public static zzgqm zzaF(zzgqm zzgqmVar, byte[] bArr) throws zzgqy {
        zzgqm zzd = zzd(zzgqmVar, bArr, 0, bArr.length, zzgpy.zza);
        zzc(zzd);
        return zzd;
    }

    public static zzgqm zzaG(zzgqm zzgqmVar, zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        zzgpm zzl = zzgpeVar.zzl();
        zzgqm zzaD = zzgqmVar.zzaD();
        try {
            zzgsp zzb2 = zzgse.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgpn.zzq(zzl), zzgpyVar);
            zzb2.zzf(zzaD);
            try {
                zzl.zzz(0);
                zzc(zzaD);
                return zzaD;
            } catch (zzgqy e) {
                e.zzh(zzaD);
                throw e;
            }
        } catch (zzgqy e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgqy(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgtf e3) {
            zzgqy zza = e3.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgqy) {
                throw ((zzgqy) e4.getCause());
            }
            zzgqy zzgqyVar = new zzgqy(e4);
            zzgqyVar.zzh(zzaD);
            throw zzgqyVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgqy) {
                throw ((zzgqy) e5.getCause());
            }
            throw e5;
        }
    }

    public static zzgqm zzaH(zzgqm zzgqmVar, InputStream inputStream, zzgpy zzgpyVar) throws zzgqy {
        zzgpm zzH = zzgpm.zzH(inputStream, 4096);
        zzgqm zzaD = zzgqmVar.zzaD();
        try {
            zzgsp zzb2 = zzgse.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgpn.zzq(zzH), zzgpyVar);
            zzb2.zzf(zzaD);
            zzc(zzaD);
            return zzaD;
        } catch (zzgqy e) {
            e = e;
            if (e.zzl()) {
                e = new zzgqy(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgtf e2) {
            zzgqy zza = e2.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgqy) {
                throw ((zzgqy) e3.getCause());
            }
            zzgqy zzgqyVar = new zzgqy(e3);
            zzgqyVar.zzh(zzaD);
            throw zzgqyVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzgqy) {
                throw ((zzgqy) e4.getCause());
            }
            throw e4;
        }
    }

    public static zzgqm zzaI(zzgqm zzgqmVar, byte[] bArr, zzgpy zzgpyVar) throws zzgqy {
        zzgqm zzd = zzd(zzgqmVar, bArr, 0, bArr.length, zzgpyVar);
        zzc(zzd);
        return zzd;
    }

    public static zzgqr zzaJ() {
        return zzgqn.zzf();
    }

    public static zzgqr zzaK(zzgqr zzgqrVar) {
        int size = zzgqrVar.size();
        return zzgqrVar.zzg(size == 0 ? 10 : size + size);
    }

    public static zzgqu zzaL() {
        return zzgrl.zzf();
    }

    public static zzgqv zzaM() {
        return zzgsf.zze();
    }

    public static zzgqv zzaN(zzgqv zzgqvVar) {
        int size = zzgqvVar.size();
        return zzgqvVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzaP(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzaQ(zzgrw zzgrwVar, String str, Object[] objArr) {
        return new zzgsg(zzgrwVar, str, objArr);
    }

    public static void zzaT(Class cls, zzgqm zzgqmVar) {
        zzgqmVar.zzaS();
        zzb.put(cls, zzgqmVar);
    }

    private static zzgqm zzc(zzgqm zzgqmVar) throws zzgqy {
        if (zzgqmVar == null || zzgqmVar.zzaW()) {
            return zzgqmVar;
        }
        zzgqy zza = new zzgtf(zzgqmVar).zza();
        zza.zzh(zzgqmVar);
        throw zza;
    }

    private static zzgqm zzd(zzgqm zzgqmVar, byte[] bArr, int i, int i2, zzgpy zzgpyVar) throws zzgqy {
        zzgqm zzaD = zzgqmVar.zzaD();
        try {
            zzgsp zzb2 = zzgse.zza().zzb(zzaD.getClass());
            zzb2.zzi(zzaD, bArr, 0, i2, new zzgoq(zzgpyVar));
            zzb2.zzf(zzaD);
            return zzaD;
        } catch (zzgqy e) {
            e = e;
            if (e.zzl()) {
                e = new zzgqy(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgtf e2) {
            zzgqy zza = e2.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgqy) {
                throw ((zzgqy) e3.getCause());
            }
            zzgqy zzgqyVar = new zzgqy(e3);
            zzgqyVar.zzh(zzaD);
            throw zzgqyVar;
        } catch (IndexOutOfBoundsException unused) {
            zzgqy zzj = zzgqy.zzj();
            zzj.zzh(zzaD);
            throw zzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzgse.zza().zzb(getClass()).zzj(this, (zzgqm) obj);
        }
        return false;
    }

    public final int hashCode() {
        if (zzaX()) {
            return zzay();
        }
        int i = this.zza;
        if (i == 0) {
            int zzay = zzay();
            this.zza = zzay;
            return zzay;
        }
        return i;
    }

    public final String toString() {
        return zzgry.zza(this, super.toString());
    }

    public final zzgqi zzaA() {
        return (zzgqi) zzb(5, null, null);
    }

    public final zzgqi zzaB() {
        zzgqi zzgqiVar = (zzgqi) zzb(5, null, null);
        zzgqiVar.zzaj(this);
        return zzgqiVar;
    }

    public final zzgqm zzaD() {
        return (zzgqm) zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public final /* synthetic */ zzgrv zzaO() {
        return (zzgqi) zzb(5, null, null);
    }

    public final void zzaR() {
        zzgse.zza().zzb(getClass()).zzf(this);
        zzaS();
    }

    public final void zzaS() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzaU(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public final void zzaV(zzgpt zzgptVar) throws IOException {
        zzgse.zza().zzb(getClass()).zzm(this, zzgpu.zza(zzgptVar));
    }

    public final boolean zzaW() {
        Boolean bool = Boolean.TRUE;
        byte byteValue = ((Byte) zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzgse.zza().zzb(getClass()).zzk(this);
        zzb(2, true != zzk ? null : this, null);
        return zzk;
    }

    public final boolean zzaX() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    final int zzay() {
        return zzgse.zza().zzb(getClass()).zzb(this);
    }

    public abstract Object zzb(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.zzgrx
    public final /* synthetic */ zzgrw zzbf() {
        return (zzgqm) zzb(6, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final int zzat(zzgsp zzgspVar) {
        if (zzaX()) {
            int zza = zza(zzgspVar);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = zza(zzgspVar);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public final int zzaz() {
        int i;
        if (zzaX()) {
            i = zza(null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = zza(null);
                if (i >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
            }
        }
        return i;
    }
}
