package com.google.android.gms.internal.ads;

import com.google.android.gms.drive.DriveFile;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgrz<T> implements zzgsp<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgtq.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgrw zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzgrk zzn;
    private final zzgtg zzo;
    private final zzgpz zzp;
    private final zzgsb zzq;
    private final zzgrr zzr;

    private zzgrz(int[] iArr, Object[] objArr, int i, int i2, zzgrw zzgrwVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzgsb zzgsbVar, zzgrk zzgrkVar, zzgtg zzgtgVar, zzgpz zzgpzVar, zzgrr zzgrrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzgrwVar instanceof zzgqm;
        this.zzj = z;
        boolean z3 = false;
        if (zzgpzVar != null && zzgpzVar.zzh(zzgrwVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzq = zzgsbVar;
        this.zzn = zzgrkVar;
        this.zzo = zzgtgVar;
        this.zzp = zzgpzVar;
        this.zzg = zzgrwVar;
        this.zzr = zzgrrVar;
    }

    private static long zzA(Object obj, long j) {
        return ((Long) zzgtq.zzh(obj, j)).longValue();
    }

    private final zzgqq zzB(int i) {
        int i2 = i / 3;
        return (zzgqq) this.zzd[i2 + i2 + 1];
    }

    private final zzgsp zzC(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgsp zzgspVar = (zzgsp) this.zzd[i3];
        if (zzgspVar != null) {
            return zzgspVar;
        }
        zzgsp zzb2 = zzgse.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzD(Object obj, int i, Object obj2, zzgtg zzgtgVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzh = zzgtq.zzh(obj, zzz(i) & 1048575);
        if (zzh == null || zzB(i) == null) {
            return obj2;
        }
        zzgrq zzgrqVar = (zzgrq) zzh;
        zzgrp zzgrpVar = (zzgrp) zzE(i);
        throw null;
    }

    private final Object zzE(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzF(Object obj, int i) {
        zzgsp zzC = zzC(i);
        int zzz = zzz(i) & 1048575;
        if (!zzS(obj, i)) {
            return zzC.zze();
        }
        Object object = zzb.getObject(obj, zzz);
        if (zzV(object)) {
            return object;
        }
        Object zze = zzC.zze();
        if (object != null) {
            zzC.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzG(Object obj, int i, int i2) {
        zzgsp zzC = zzC(i2);
        if (!zzW(obj, i, i2)) {
            return zzC.zze();
        }
        Object object = zzb.getObject(obj, zzz(i2) & 1048575);
        if (zzV(object)) {
            return object;
        }
        Object zze = zzC.zze();
        if (object != null) {
            zzC.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzH(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzI(Object obj) {
        if (!zzV(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzJ(Object obj, Object obj2, int i) {
        if (zzS(obj2, i)) {
            Unsafe unsafe = zzb;
            long zzz = zzz(i) & 1048575;
            Object object = unsafe.getObject(obj2, zzz);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgsp zzC = zzC(i);
            if (!zzS(obj, i)) {
                if (!zzV(object)) {
                    unsafe.putObject(obj, zzz, object);
                } else {
                    Object zze = zzC.zze();
                    zzC.zzg(zze, object);
                    unsafe.putObject(obj, zzz, zze);
                }
                zzM(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzz);
            if (!zzV(object2)) {
                Object zze2 = zzC.zze();
                zzC.zzg(zze2, object2);
                unsafe.putObject(obj, zzz, zze2);
                object2 = zze2;
            }
            zzC.zzg(object2, object);
        }
    }

    private final void zzK(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzW(obj2, i2, i)) {
            Unsafe unsafe = zzb;
            long zzz = zzz(i) & 1048575;
            Object object = unsafe.getObject(obj2, zzz);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgsp zzC = zzC(i);
            if (!zzW(obj, i2, i)) {
                if (!zzV(object)) {
                    unsafe.putObject(obj, zzz, object);
                } else {
                    Object zze = zzC.zze();
                    zzC.zzg(zze, object);
                    unsafe.putObject(obj, zzz, zze);
                }
                zzN(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzz);
            if (!zzV(object2)) {
                Object zze2 = zzC.zze();
                zzC.zzg(zze2, object2);
                unsafe.putObject(obj, zzz, zze2);
                object2 = zze2;
            }
            zzC.zzg(object2, object);
        }
    }

    private final void zzL(Object obj, int i, zzgsh zzgshVar) throws IOException {
        if (zzR(i)) {
            zzgtq.zzv(obj, i & 1048575, zzgshVar.zzs());
        } else if (!this.zzi) {
            zzgtq.zzv(obj, i & 1048575, zzgshVar.zzp());
        } else {
            zzgtq.zzv(obj, i & 1048575, zzgshVar.zzr());
        }
    }

    private final void zzM(Object obj, int i) {
        int zzw = zzw(i);
        long j = 1048575 & zzw;
        if (j == 1048575) {
            return;
        }
        zzgtq.zzt(obj, j, (1 << (zzw >>> 20)) | zzgtq.zzd(obj, j));
    }

    private final void zzN(Object obj, int i, int i2) {
        zzgtq.zzt(obj, zzw(i2) & 1048575, i);
    }

    private final void zzO(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzz(i) & 1048575, obj2);
        zzM(obj, i);
    }

    private final void zzP(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzz(i2) & 1048575, obj2);
        zzN(obj, i, i2);
    }

    private final boolean zzQ(Object obj, Object obj2, int i) {
        return zzS(obj, i) == zzS(obj2, i);
    }

    private static boolean zzR(int i) {
        return (i & DriveFile.MODE_WRITE_ONLY) != 0;
    }

    private final boolean zzS(Object obj, int i) {
        int zzw = zzw(i);
        long j = zzw & 1048575;
        if (j != 1048575) {
            return (zzgtq.zzd(obj, j) & (1 << (zzw >>> 20))) != 0;
        }
        int zzz = zzz(i);
        long j2 = zzz & 1048575;
        switch (zzy(zzz)) {
            case 0:
                return Double.doubleToRawLongBits(zzgtq.zzb(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgtq.zzc(obj, j2)) != 0;
            case 2:
                return zzgtq.zzf(obj, j2) != 0;
            case 3:
                return zzgtq.zzf(obj, j2) != 0;
            case 4:
                return zzgtq.zzd(obj, j2) != 0;
            case 5:
                return zzgtq.zzf(obj, j2) != 0;
            case 6:
                return zzgtq.zzd(obj, j2) != 0;
            case 7:
                return zzgtq.zzz(obj, j2);
            case 8:
                Object zzh = zzgtq.zzh(obj, j2);
                if (zzh instanceof String) {
                    return !((String) zzh).isEmpty();
                } else if (zzh instanceof zzgpe) {
                    return !zzgpe.zzb.equals(zzh);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzgtq.zzh(obj, j2) != null;
            case 10:
                return !zzgpe.zzb.equals(zzgtq.zzh(obj, j2));
            case 11:
                return zzgtq.zzd(obj, j2) != 0;
            case 12:
                return zzgtq.zzd(obj, j2) != 0;
            case 13:
                return zzgtq.zzd(obj, j2) != 0;
            case 14:
                return zzgtq.zzf(obj, j2) != 0;
            case 15:
                return zzgtq.zzd(obj, j2) != 0;
            case 16:
                return zzgtq.zzf(obj, j2) != 0;
            case 17:
                return zzgtq.zzh(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzT(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzS(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzU(Object obj, int i, zzgsp zzgspVar) {
        return zzgspVar.zzk(zzgtq.zzh(obj, i & 1048575));
    }

    private static boolean zzV(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgqm) {
            return ((zzgqm) obj).zzaX();
        }
        return true;
    }

    private final boolean zzW(Object obj, int i, int i2) {
        return zzgtq.zzd(obj, (long) (zzw(i2) & 1048575)) == i;
    }

    private static boolean zzX(Object obj, long j) {
        return ((Boolean) zzgtq.zzh(obj, j)).booleanValue();
    }

    private final void zzY(zzgpu zzgpuVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        zzgrp zzgrpVar = (zzgrp) zzE(i2);
        throw null;
    }

    private static final void zzZ(int i, Object obj, zzgpu zzgpuVar) throws IOException {
        if (obj instanceof String) {
            zzgpuVar.zzF(i, (String) obj);
        } else {
            zzgpuVar.zzd(i, (zzgpe) obj);
        }
    }

    static zzgth zzd(Object obj) {
        zzgqm zzgqmVar = (zzgqm) obj;
        zzgth zzgthVar = zzgqmVar.zzc;
        if (zzgthVar == zzgth.zzc()) {
            zzgth zzf = zzgth.zzf();
            zzgqmVar.zzc = zzf;
            return zzf;
        }
        return zzgthVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:340:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzgrz zzl(java.lang.Class r31, com.google.android.gms.internal.ads.zzgrt r32, com.google.android.gms.internal.ads.zzgsb r33, com.google.android.gms.internal.ads.zzgrk r34, com.google.android.gms.internal.ads.zzgtg r35, com.google.android.gms.internal.ads.zzgpz r36, com.google.android.gms.internal.ads.zzgrr r37) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzl(java.lang.Class, com.google.android.gms.internal.ads.zzgrt, com.google.android.gms.internal.ads.zzgsb, com.google.android.gms.internal.ads.zzgrk, com.google.android.gms.internal.ads.zzgtg, com.google.android.gms.internal.ads.zzgpz, com.google.android.gms.internal.ads.zzgrr):com.google.android.gms.internal.ads.zzgrz");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzgtq.zzh(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzgtq.zzh(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i;
        int zzE;
        int zzE2;
        int zzF;
        int zzE3;
        int zzE4;
        int zzE5;
        int zzE6;
        int zzu;
        int zzi;
        int zzD;
        int zzE7;
        int i2;
        int zzE8;
        int zzE9;
        int zzE10;
        int zzE11;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        while (i4 < this.zzc.length) {
            int zzz = zzz(i4);
            int[] iArr = this.zzc;
            int i8 = iArr[i4];
            int zzy = zzy(zzz);
            if (zzy <= 17) {
                int i9 = iArr[i4 + 2];
                int i10 = i9 & i3;
                int i11 = i9 >>> 20;
                if (i10 != i6) {
                    i7 = unsafe.getInt(obj, i10);
                    i6 = i10;
                }
                i = 1 << i11;
            } else {
                i = 0;
            }
            long j = zzz & i3;
            switch (zzy) {
                case 0:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzE = zzgpt.zzE(i8 << 3);
                        zzE4 = zzE + 8;
                        i5 += zzE4;
                        break;
                    }
                case 1:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzE2 = zzgpt.zzE(i8 << 3);
                        zzE4 = zzE2 + 4;
                        i5 += zzE4;
                        break;
                    }
                case 2:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzF = zzgpt.zzF(unsafe.getLong(obj, j));
                        zzE3 = zzgpt.zzE(i8 << 3);
                        i5 += zzE3 + zzF;
                        break;
                    }
                case 3:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzF = zzgpt.zzF(unsafe.getLong(obj, j));
                        zzE3 = zzgpt.zzE(i8 << 3);
                        i5 += zzE3 + zzF;
                        break;
                    }
                case 4:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzF = zzgpt.zzy(unsafe.getInt(obj, j));
                        zzE3 = zzgpt.zzE(i8 << 3);
                        i5 += zzE3 + zzF;
                        break;
                    }
                case 5:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzE = zzgpt.zzE(i8 << 3);
                        zzE4 = zzE + 8;
                        i5 += zzE4;
                        break;
                    }
                case 6:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzE2 = zzgpt.zzE(i8 << 3);
                        zzE4 = zzE2 + 4;
                        i5 += zzE4;
                        break;
                    }
                case 7:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzE4 = zzgpt.zzE(i8 << 3) + 1;
                        i5 += zzE4;
                        break;
                    }
                case 8:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgpe) {
                            int i12 = zzgpt.zzf;
                            int zzd = ((zzgpe) object).zzd();
                            zzE5 = zzgpt.zzE(zzd) + zzd;
                            zzE6 = zzgpt.zzE(i8 << 3);
                            zzE4 = zzE6 + zzE5;
                            i5 += zzE4;
                            break;
                        } else {
                            zzF = zzgpt.zzC((String) object);
                            zzE3 = zzgpt.zzE(i8 << 3);
                            i5 += zzE3 + zzF;
                            break;
                        }
                    }
                case 9:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzE4 = zzgsr.zzo(i8, unsafe.getObject(obj, j), zzC(i4));
                        i5 += zzE4;
                        break;
                    }
                case 10:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        int i13 = zzgpt.zzf;
                        int zzd2 = ((zzgpe) unsafe.getObject(obj, j)).zzd();
                        zzE5 = zzgpt.zzE(zzd2) + zzd2;
                        zzE6 = zzgpt.zzE(i8 << 3);
                        zzE4 = zzE6 + zzE5;
                        i5 += zzE4;
                        break;
                    }
                case 11:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzF = zzgpt.zzE(unsafe.getInt(obj, j));
                        zzE3 = zzgpt.zzE(i8 << 3);
                        i5 += zzE3 + zzF;
                        break;
                    }
                case 12:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzF = zzgpt.zzy(unsafe.getInt(obj, j));
                        zzE3 = zzgpt.zzE(i8 << 3);
                        i5 += zzE3 + zzF;
                        break;
                    }
                case 13:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzE2 = zzgpt.zzE(i8 << 3);
                        zzE4 = zzE2 + 4;
                        i5 += zzE4;
                        break;
                    }
                case 14:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzE = zzgpt.zzE(i8 << 3);
                        zzE4 = zzE + 8;
                        i5 += zzE4;
                        break;
                    }
                case 15:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        zzE3 = zzgpt.zzE(i8 << 3);
                        zzF = zzgpt.zzE((i14 >> 31) ^ (i14 + i14));
                        i5 += zzE3 + zzF;
                        break;
                    }
                case 16:
                    if ((i & i7) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        i5 += zzgpt.zzE(i8 << 3) + zzgpt.zzF((j2 >> 63) ^ (j2 + j2));
                        break;
                    }
                case 17:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzE4 = zzgpt.zzx(i8, (zzgrw) unsafe.getObject(obj, j), zzC(i4));
                        i5 += zzE4;
                        break;
                    }
                case 18:
                    zzE4 = zzgsr.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzE4;
                    break;
                case 19:
                    zzE4 = zzgsr.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzE4;
                    break;
                case 20:
                    zzE4 = zzgsr.zzm(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzE4;
                    break;
                case 21:
                    zzE4 = zzgsr.zzx(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzE4;
                    break;
                case 22:
                    zzE4 = zzgsr.zzk(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzE4;
                    break;
                case 23:
                    zzE4 = zzgsr.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzE4;
                    break;
                case 24:
                    zzE4 = zzgsr.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzE4;
                    break;
                case 25:
                    zzE4 = zzgsr.zza(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzE4;
                    break;
                case 26:
                    zzu = zzgsr.zzu(i8, (List) unsafe.getObject(obj, j));
                    i5 += zzu;
                    break;
                case 27:
                    zzu = zzgsr.zzp(i8, (List) unsafe.getObject(obj, j), zzC(i4));
                    i5 += zzu;
                    break;
                case 28:
                    zzu = zzgsr.zzc(i8, (List) unsafe.getObject(obj, j));
                    i5 += zzu;
                    break;
                case 29:
                    zzu = zzgsr.zzv(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzu;
                    break;
                case 30:
                    zzu = zzgsr.zzd(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzu;
                    break;
                case 31:
                    zzu = zzgsr.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzu;
                    break;
                case 32:
                    zzu = zzgsr.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzu;
                    break;
                case 33:
                    zzu = zzgsr.zzq(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzu;
                    break;
                case 34:
                    zzu = zzgsr.zzs(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzu;
                    break;
                case 35:
                    zzi = zzgsr.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgpt.zzD(i8);
                        zzE7 = zzgpt.zzE(zzi);
                        i2 = zzD + zzE7;
                        i5 += i2 + zzi;
                    }
                    break;
                case 36:
                    zzi = zzgsr.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgpt.zzD(i8);
                        zzE7 = zzgpt.zzE(zzi);
                        i2 = zzD + zzE7;
                        i5 += i2 + zzi;
                    }
                    break;
                case 37:
                    zzi = zzgsr.zzn((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgpt.zzD(i8);
                        zzE7 = zzgpt.zzE(zzi);
                        i2 = zzD + zzE7;
                        i5 += i2 + zzi;
                    }
                    break;
                case 38:
                    zzi = zzgsr.zzy((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgpt.zzD(i8);
                        zzE7 = zzgpt.zzE(zzi);
                        i2 = zzD + zzE7;
                        i5 += i2 + zzi;
                    }
                    break;
                case 39:
                    zzi = zzgsr.zzl((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgpt.zzD(i8);
                        zzE7 = zzgpt.zzE(zzi);
                        i2 = zzD + zzE7;
                        i5 += i2 + zzi;
                    }
                    break;
                case 40:
                    zzi = zzgsr.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgpt.zzD(i8);
                        zzE7 = zzgpt.zzE(zzi);
                        i2 = zzD + zzE7;
                        i5 += i2 + zzi;
                    }
                    break;
                case 41:
                    zzi = zzgsr.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgpt.zzD(i8);
                        zzE7 = zzgpt.zzE(zzi);
                        i2 = zzD + zzE7;
                        i5 += i2 + zzi;
                    }
                    break;
                case 42:
                    zzi = zzgsr.zzb((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgpt.zzD(i8);
                        zzE7 = zzgpt.zzE(zzi);
                        i2 = zzD + zzE7;
                        i5 += i2 + zzi;
                    }
                    break;
                case 43:
                    zzi = zzgsr.zzw((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgpt.zzD(i8);
                        zzE7 = zzgpt.zzE(zzi);
                        i2 = zzD + zzE7;
                        i5 += i2 + zzi;
                    }
                    break;
                case 44:
                    zzi = zzgsr.zze((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgpt.zzD(i8);
                        zzE7 = zzgpt.zzE(zzi);
                        i2 = zzD + zzE7;
                        i5 += i2 + zzi;
                    }
                    break;
                case 45:
                    zzi = zzgsr.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgpt.zzD(i8);
                        zzE7 = zzgpt.zzE(zzi);
                        i2 = zzD + zzE7;
                        i5 += i2 + zzi;
                    }
                    break;
                case 46:
                    zzi = zzgsr.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgpt.zzD(i8);
                        zzE7 = zzgpt.zzE(zzi);
                        i2 = zzD + zzE7;
                        i5 += i2 + zzi;
                    }
                    break;
                case 47:
                    zzi = zzgsr.zzr((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgpt.zzD(i8);
                        zzE7 = zzgpt.zzE(zzi);
                        i2 = zzD + zzE7;
                        i5 += i2 + zzi;
                    }
                    break;
                case 48:
                    zzi = zzgsr.zzt((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgpt.zzD(i8);
                        zzE7 = zzgpt.zzE(zzi);
                        i2 = zzD + zzE7;
                        i5 += i2 + zzi;
                    }
                    break;
                case 49:
                    zzu = zzgsr.zzj(i8, (List) unsafe.getObject(obj, j), zzC(i4));
                    i5 += zzu;
                    break;
                case 50:
                    zzgrr.zza(i8, unsafe.getObject(obj, j), zzE(i4));
                    break;
                case 51:
                    if (zzW(obj, i8, i4)) {
                        zzE8 = zzgpt.zzE(i8 << 3);
                        zzu = zzE8 + 8;
                        i5 += zzu;
                    }
                    break;
                case 52:
                    if (zzW(obj, i8, i4)) {
                        zzE9 = zzgpt.zzE(i8 << 3);
                        zzu = zzE9 + 4;
                        i5 += zzu;
                    }
                    break;
                case 53:
                    if (zzW(obj, i8, i4)) {
                        zzi = zzgpt.zzF(zzA(obj, j));
                        i2 = zzgpt.zzE(i8 << 3);
                        i5 += i2 + zzi;
                    }
                    break;
                case 54:
                    if (zzW(obj, i8, i4)) {
                        zzi = zzgpt.zzF(zzA(obj, j));
                        i2 = zzgpt.zzE(i8 << 3);
                        i5 += i2 + zzi;
                    }
                    break;
                case 55:
                    if (zzW(obj, i8, i4)) {
                        zzi = zzgpt.zzy(zzq(obj, j));
                        i2 = zzgpt.zzE(i8 << 3);
                        i5 += i2 + zzi;
                    }
                    break;
                case 56:
                    if (zzW(obj, i8, i4)) {
                        zzE8 = zzgpt.zzE(i8 << 3);
                        zzu = zzE8 + 8;
                        i5 += zzu;
                    }
                    break;
                case 57:
                    if (zzW(obj, i8, i4)) {
                        zzE9 = zzgpt.zzE(i8 << 3);
                        zzu = zzE9 + 4;
                        i5 += zzu;
                    }
                    break;
                case 58:
                    if (zzW(obj, i8, i4)) {
                        zzu = zzgpt.zzE(i8 << 3) + 1;
                        i5 += zzu;
                    }
                    break;
                case 59:
                    if (zzW(obj, i8, i4)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgpe) {
                            int i15 = zzgpt.zzf;
                            int zzd3 = ((zzgpe) object2).zzd();
                            zzE10 = zzgpt.zzE(zzd3) + zzd3;
                            zzE11 = zzgpt.zzE(i8 << 3);
                            zzu = zzE11 + zzE10;
                            i5 += zzu;
                        } else {
                            zzi = zzgpt.zzC((String) object2);
                            i2 = zzgpt.zzE(i8 << 3);
                            i5 += i2 + zzi;
                        }
                    }
                    break;
                case 60:
                    if (zzW(obj, i8, i4)) {
                        zzu = zzgsr.zzo(i8, unsafe.getObject(obj, j), zzC(i4));
                        i5 += zzu;
                    }
                    break;
                case 61:
                    if (zzW(obj, i8, i4)) {
                        int i16 = zzgpt.zzf;
                        int zzd4 = ((zzgpe) unsafe.getObject(obj, j)).zzd();
                        zzE10 = zzgpt.zzE(zzd4) + zzd4;
                        zzE11 = zzgpt.zzE(i8 << 3);
                        zzu = zzE11 + zzE10;
                        i5 += zzu;
                    }
                    break;
                case 62:
                    if (zzW(obj, i8, i4)) {
                        zzi = zzgpt.zzE(zzq(obj, j));
                        i2 = zzgpt.zzE(i8 << 3);
                        i5 += i2 + zzi;
                    }
                    break;
                case 63:
                    if (zzW(obj, i8, i4)) {
                        zzi = zzgpt.zzy(zzq(obj, j));
                        i2 = zzgpt.zzE(i8 << 3);
                        i5 += i2 + zzi;
                    }
                    break;
                case 64:
                    if (zzW(obj, i8, i4)) {
                        zzE9 = zzgpt.zzE(i8 << 3);
                        zzu = zzE9 + 4;
                        i5 += zzu;
                    }
                    break;
                case 65:
                    if (zzW(obj, i8, i4)) {
                        zzE8 = zzgpt.zzE(i8 << 3);
                        zzu = zzE8 + 8;
                        i5 += zzu;
                    }
                    break;
                case 66:
                    if (zzW(obj, i8, i4)) {
                        int zzq = zzq(obj, j);
                        i2 = zzgpt.zzE(i8 << 3);
                        zzi = zzgpt.zzE((zzq >> 31) ^ (zzq + zzq));
                        i5 += i2 + zzi;
                    }
                    break;
                case 67:
                    if (zzW(obj, i8, i4)) {
                        long zzA = zzA(obj, j);
                        i5 += zzgpt.zzE(i8 << 3) + zzgpt.zzF((zzA >> 63) ^ (zzA + zzA));
                    }
                    break;
                case 68:
                    if (zzW(obj, i8, i4)) {
                        zzu = zzgpt.zzx(i8, (zzgrw) unsafe.getObject(obj, j), zzC(i4));
                        i5 += zzu;
                    }
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
        zzgtg zzgtgVar = this.zzo;
        int zza2 = i5 + zzgtgVar.zza(zzgtgVar.zzd(obj));
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        return zza2;
    }

    private static int zzq(Object obj, long j) {
        return ((Integer) zzgtq.zzh(obj, j)).intValue();
    }

    private final int zzr(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzgoq zzgoqVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzE = zzE(i3);
        Object object = unsafe.getObject(obj, j);
        if (zzgrr.zzb(object)) {
            zzgrq zzb2 = zzgrq.zza().zzb();
            zzgrr.zzc(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        zzgrp zzgrpVar = (zzgrp) zzE;
        throw null;
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzgoq zzgoqVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzgor.zzp(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzgor.zzb(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = zzgor.zzm(bArr, i, zzgoqVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzgoqVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzgor.zzj(bArr, i, zzgoqVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzgoqVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzgor.zzp(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzgor.zzb(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzgor.zzm(bArr, i, zzgoqVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzgoqVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzgor.zzj(bArr, i, zzgoqVar);
                    int i13 = zzgoqVar.zza;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & DriveFile.MODE_WRITE_ONLY) == 0 || zzgtv.zzj(bArr, zzj2, zzj2 + i13)) {
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i13, zzgqw.zzb));
                        zzj2 += i13;
                    } else {
                        throw zzgqy.zzd();
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object zzG = zzG(obj, i4, i8);
                    int zzo = zzgor.zzo(zzG, zzC(i8), bArr, i, i2, zzgoqVar);
                    zzP(obj, i4, i8, zzG);
                    return zzo;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = zzgor.zza(bArr, i, zzgoqVar);
                    unsafe.putObject(obj, j, zzgoqVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzgor.zzj(bArr, i, zzgoqVar);
                    int i14 = zzgoqVar.zza;
                    zzgqq zzB = zzB(i8);
                    if (zzB == null || zzB.zza(i14)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        zzd(obj).zzj(i3, Long.valueOf(i14));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int zzj4 = zzgor.zzj(bArr, i, zzgoqVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzgpm.zzF(zzgoqVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = zzgor.zzm(bArr, i, zzgoqVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzgpm.zzG(zzgoqVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object zzG2 = zzG(obj, i4, i8);
                    int zzn = zzgor.zzn(zzG2, zzC(i8), bArr, i, i2, (i3 & (-8)) | 4, zzgoqVar);
                    zzP(obj, i4, i8, zzG2);
                    return zzn;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:374:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0214  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:372:0x0148 -> B:373:0x0149). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:404:0x01c3 -> B:405:0x01c4). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:424:0x0211 -> B:425:0x0212). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzt(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.ads.zzgoq r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzt(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.zzgoq):int");
    }

    private final int zzu(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzx(i, 0);
    }

    private final int zzv(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzx(i, i2);
    }

    private final int zzw(int i) {
        return this.zzc[i + 2];
    }

    private final int zzx(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzy(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzz(int i) {
        return this.zzc[i + 1];
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final int zza(Object obj) {
        int zzE;
        int zzE2;
        int zzF;
        int zzE3;
        int zzE4;
        int zzE5;
        int zzE6;
        int zzo;
        int zzE7;
        int zzF2;
        int zzD;
        int zzE8;
        if (this.zzj) {
            Unsafe unsafe = zzb;
            int i = 0;
            for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
                int zzz = zzz(i2);
                int zzy = zzy(zzz);
                int i3 = this.zzc[i2];
                int i4 = zzz & 1048575;
                if (zzy >= zzgqe.DOUBLE_LIST_PACKED.zza() && zzy <= zzgqe.SINT64_LIST_PACKED.zza()) {
                    int i5 = this.zzc[i2 + 2];
                }
                long j = i4;
                switch (zzy) {
                    case 0:
                        if (zzS(obj, i2)) {
                            zzE = zzgpt.zzE(i3 << 3);
                            zzo = zzE + 8;
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzS(obj, i2)) {
                            zzE2 = zzgpt.zzE(i3 << 3);
                            zzo = zzE2 + 4;
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzS(obj, i2)) {
                            zzF = zzgpt.zzF(zzgtq.zzf(obj, j));
                            zzE3 = zzgpt.zzE(i3 << 3);
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzS(obj, i2)) {
                            zzF = zzgpt.zzF(zzgtq.zzf(obj, j));
                            zzE3 = zzgpt.zzE(i3 << 3);
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzS(obj, i2)) {
                            zzF = zzgpt.zzy(zzgtq.zzd(obj, j));
                            zzE3 = zzgpt.zzE(i3 << 3);
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzS(obj, i2)) {
                            zzE = zzgpt.zzE(i3 << 3);
                            zzo = zzE + 8;
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzS(obj, i2)) {
                            zzE2 = zzgpt.zzE(i3 << 3);
                            zzo = zzE2 + 4;
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzS(obj, i2)) {
                            zzE4 = zzgpt.zzE(i3 << 3);
                            zzo = zzE4 + 1;
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzS(obj, i2)) {
                            Object zzh = zzgtq.zzh(obj, j);
                            if (zzh instanceof zzgpe) {
                                int i6 = i3 << 3;
                                int i7 = zzgpt.zzf;
                                int zzd = ((zzgpe) zzh).zzd();
                                zzE5 = zzgpt.zzE(zzd) + zzd;
                                zzE6 = zzgpt.zzE(i6);
                                zzo = zzE6 + zzE5;
                                i += zzo;
                                break;
                            } else {
                                zzF = zzgpt.zzC((String) zzh);
                                zzE3 = zzgpt.zzE(i3 << 3);
                                i += zzE3 + zzF;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (zzS(obj, i2)) {
                            zzo = zzgsr.zzo(i3, zzgtq.zzh(obj, j), zzC(i2));
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzS(obj, i2)) {
                            int i8 = i3 << 3;
                            int i9 = zzgpt.zzf;
                            int zzd2 = ((zzgpe) zzgtq.zzh(obj, j)).zzd();
                            zzE5 = zzgpt.zzE(zzd2) + zzd2;
                            zzE6 = zzgpt.zzE(i8);
                            zzo = zzE6 + zzE5;
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzS(obj, i2)) {
                            zzF = zzgpt.zzE(zzgtq.zzd(obj, j));
                            zzE3 = zzgpt.zzE(i3 << 3);
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzS(obj, i2)) {
                            zzF = zzgpt.zzy(zzgtq.zzd(obj, j));
                            zzE3 = zzgpt.zzE(i3 << 3);
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzS(obj, i2)) {
                            zzE2 = zzgpt.zzE(i3 << 3);
                            zzo = zzE2 + 4;
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzS(obj, i2)) {
                            zzE = zzgpt.zzE(i3 << 3);
                            zzo = zzE + 8;
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzS(obj, i2)) {
                            int zzd3 = zzgtq.zzd(obj, j);
                            zzE3 = zzgpt.zzE(i3 << 3);
                            zzF = zzgpt.zzE((zzd3 >> 31) ^ (zzd3 + zzd3));
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzS(obj, i2)) {
                            long zzf = zzgtq.zzf(obj, j);
                            zzE7 = zzgpt.zzE(i3 << 3);
                            zzF2 = zzgpt.zzF((zzf >> 63) ^ (zzf + zzf));
                            zzo = zzE7 + zzF2;
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzS(obj, i2)) {
                            zzo = zzgpt.zzx(i3, (zzgrw) zzgtq.zzh(obj, j), zzC(i2));
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzo = zzgsr.zzh(i3, (List) zzgtq.zzh(obj, j), false);
                        i += zzo;
                        break;
                    case 19:
                        zzo = zzgsr.zzf(i3, (List) zzgtq.zzh(obj, j), false);
                        i += zzo;
                        break;
                    case 20:
                        zzo = zzgsr.zzm(i3, (List) zzgtq.zzh(obj, j), false);
                        i += zzo;
                        break;
                    case 21:
                        zzo = zzgsr.zzx(i3, (List) zzgtq.zzh(obj, j), false);
                        i += zzo;
                        break;
                    case 22:
                        zzo = zzgsr.zzk(i3, (List) zzgtq.zzh(obj, j), false);
                        i += zzo;
                        break;
                    case 23:
                        zzo = zzgsr.zzh(i3, (List) zzgtq.zzh(obj, j), false);
                        i += zzo;
                        break;
                    case 24:
                        zzo = zzgsr.zzf(i3, (List) zzgtq.zzh(obj, j), false);
                        i += zzo;
                        break;
                    case 25:
                        zzo = zzgsr.zza(i3, (List) zzgtq.zzh(obj, j), false);
                        i += zzo;
                        break;
                    case 26:
                        zzo = zzgsr.zzu(i3, (List) zzgtq.zzh(obj, j));
                        i += zzo;
                        break;
                    case 27:
                        zzo = zzgsr.zzp(i3, (List) zzgtq.zzh(obj, j), zzC(i2));
                        i += zzo;
                        break;
                    case 28:
                        zzo = zzgsr.zzc(i3, (List) zzgtq.zzh(obj, j));
                        i += zzo;
                        break;
                    case 29:
                        zzo = zzgsr.zzv(i3, (List) zzgtq.zzh(obj, j), false);
                        i += zzo;
                        break;
                    case 30:
                        zzo = zzgsr.zzd(i3, (List) zzgtq.zzh(obj, j), false);
                        i += zzo;
                        break;
                    case 31:
                        zzo = zzgsr.zzf(i3, (List) zzgtq.zzh(obj, j), false);
                        i += zzo;
                        break;
                    case 32:
                        zzo = zzgsr.zzh(i3, (List) zzgtq.zzh(obj, j), false);
                        i += zzo;
                        break;
                    case 33:
                        zzo = zzgsr.zzq(i3, (List) zzgtq.zzh(obj, j), false);
                        i += zzo;
                        break;
                    case 34:
                        zzo = zzgsr.zzs(i3, (List) zzgtq.zzh(obj, j), false);
                        i += zzo;
                        break;
                    case 35:
                        zzF = zzgsr.zzi((List) unsafe.getObject(obj, j));
                        if (zzF > 0) {
                            zzD = zzgpt.zzD(i3);
                            zzE8 = zzgpt.zzE(zzF);
                            zzE3 = zzD + zzE8;
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        zzF = zzgsr.zzg((List) unsafe.getObject(obj, j));
                        if (zzF > 0) {
                            zzD = zzgpt.zzD(i3);
                            zzE8 = zzgpt.zzE(zzF);
                            zzE3 = zzD + zzE8;
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        zzF = zzgsr.zzn((List) unsafe.getObject(obj, j));
                        if (zzF > 0) {
                            zzD = zzgpt.zzD(i3);
                            zzE8 = zzgpt.zzE(zzF);
                            zzE3 = zzD + zzE8;
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        zzF = zzgsr.zzy((List) unsafe.getObject(obj, j));
                        if (zzF > 0) {
                            zzD = zzgpt.zzD(i3);
                            zzE8 = zzgpt.zzE(zzF);
                            zzE3 = zzD + zzE8;
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        zzF = zzgsr.zzl((List) unsafe.getObject(obj, j));
                        if (zzF > 0) {
                            zzD = zzgpt.zzD(i3);
                            zzE8 = zzgpt.zzE(zzF);
                            zzE3 = zzD + zzE8;
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        zzF = zzgsr.zzi((List) unsafe.getObject(obj, j));
                        if (zzF > 0) {
                            zzD = zzgpt.zzD(i3);
                            zzE8 = zzgpt.zzE(zzF);
                            zzE3 = zzD + zzE8;
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        zzF = zzgsr.zzg((List) unsafe.getObject(obj, j));
                        if (zzF > 0) {
                            zzD = zzgpt.zzD(i3);
                            zzE8 = zzgpt.zzE(zzF);
                            zzE3 = zzD + zzE8;
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        zzF = zzgsr.zzb((List) unsafe.getObject(obj, j));
                        if (zzF > 0) {
                            zzD = zzgpt.zzD(i3);
                            zzE8 = zzgpt.zzE(zzF);
                            zzE3 = zzD + zzE8;
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        zzF = zzgsr.zzw((List) unsafe.getObject(obj, j));
                        if (zzF > 0) {
                            zzD = zzgpt.zzD(i3);
                            zzE8 = zzgpt.zzE(zzF);
                            zzE3 = zzD + zzE8;
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        zzF = zzgsr.zze((List) unsafe.getObject(obj, j));
                        if (zzF > 0) {
                            zzD = zzgpt.zzD(i3);
                            zzE8 = zzgpt.zzE(zzF);
                            zzE3 = zzD + zzE8;
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        zzF = zzgsr.zzg((List) unsafe.getObject(obj, j));
                        if (zzF > 0) {
                            zzD = zzgpt.zzD(i3);
                            zzE8 = zzgpt.zzE(zzF);
                            zzE3 = zzD + zzE8;
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        zzF = zzgsr.zzi((List) unsafe.getObject(obj, j));
                        if (zzF > 0) {
                            zzD = zzgpt.zzD(i3);
                            zzE8 = zzgpt.zzE(zzF);
                            zzE3 = zzD + zzE8;
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        zzF = zzgsr.zzr((List) unsafe.getObject(obj, j));
                        if (zzF > 0) {
                            zzD = zzgpt.zzD(i3);
                            zzE8 = zzgpt.zzE(zzF);
                            zzE3 = zzD + zzE8;
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        zzF = zzgsr.zzt((List) unsafe.getObject(obj, j));
                        if (zzF > 0) {
                            zzD = zzgpt.zzD(i3);
                            zzE8 = zzgpt.zzE(zzF);
                            zzE3 = zzD + zzE8;
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        zzo = zzgsr.zzj(i3, (List) zzgtq.zzh(obj, j), zzC(i2));
                        i += zzo;
                        break;
                    case 50:
                        zzgrr.zza(i3, zzgtq.zzh(obj, j), zzE(i2));
                        break;
                    case 51:
                        if (zzW(obj, i3, i2)) {
                            zzE = zzgpt.zzE(i3 << 3);
                            zzo = zzE + 8;
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzW(obj, i3, i2)) {
                            zzE2 = zzgpt.zzE(i3 << 3);
                            zzo = zzE2 + 4;
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzW(obj, i3, i2)) {
                            zzF = zzgpt.zzF(zzA(obj, j));
                            zzE3 = zzgpt.zzE(i3 << 3);
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzW(obj, i3, i2)) {
                            zzF = zzgpt.zzF(zzA(obj, j));
                            zzE3 = zzgpt.zzE(i3 << 3);
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzW(obj, i3, i2)) {
                            zzF = zzgpt.zzy(zzq(obj, j));
                            zzE3 = zzgpt.zzE(i3 << 3);
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzW(obj, i3, i2)) {
                            zzE = zzgpt.zzE(i3 << 3);
                            zzo = zzE + 8;
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzW(obj, i3, i2)) {
                            zzE2 = zzgpt.zzE(i3 << 3);
                            zzo = zzE2 + 4;
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzW(obj, i3, i2)) {
                            zzE4 = zzgpt.zzE(i3 << 3);
                            zzo = zzE4 + 1;
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzW(obj, i3, i2)) {
                            Object zzh2 = zzgtq.zzh(obj, j);
                            if (zzh2 instanceof zzgpe) {
                                int i10 = i3 << 3;
                                int i11 = zzgpt.zzf;
                                int zzd4 = ((zzgpe) zzh2).zzd();
                                zzE5 = zzgpt.zzE(zzd4) + zzd4;
                                zzE6 = zzgpt.zzE(i10);
                                zzo = zzE6 + zzE5;
                                i += zzo;
                                break;
                            } else {
                                zzF = zzgpt.zzC((String) zzh2);
                                zzE3 = zzgpt.zzE(i3 << 3);
                                i += zzE3 + zzF;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (zzW(obj, i3, i2)) {
                            zzo = zzgsr.zzo(i3, zzgtq.zzh(obj, j), zzC(i2));
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzW(obj, i3, i2)) {
                            int i12 = i3 << 3;
                            int i13 = zzgpt.zzf;
                            int zzd5 = ((zzgpe) zzgtq.zzh(obj, j)).zzd();
                            zzE5 = zzgpt.zzE(zzd5) + zzd5;
                            zzE6 = zzgpt.zzE(i12);
                            zzo = zzE6 + zzE5;
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzW(obj, i3, i2)) {
                            zzF = zzgpt.zzE(zzq(obj, j));
                            zzE3 = zzgpt.zzE(i3 << 3);
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzW(obj, i3, i2)) {
                            zzF = zzgpt.zzy(zzq(obj, j));
                            zzE3 = zzgpt.zzE(i3 << 3);
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzW(obj, i3, i2)) {
                            zzE2 = zzgpt.zzE(i3 << 3);
                            zzo = zzE2 + 4;
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzW(obj, i3, i2)) {
                            zzE = zzgpt.zzE(i3 << 3);
                            zzo = zzE + 8;
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzW(obj, i3, i2)) {
                            int zzq = zzq(obj, j);
                            zzE3 = zzgpt.zzE(i3 << 3);
                            zzF = zzgpt.zzE((zzq >> 31) ^ (zzq + zzq));
                            i += zzE3 + zzF;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzW(obj, i3, i2)) {
                            long zzA = zzA(obj, j);
                            zzE7 = zzgpt.zzE(i3 << 3);
                            zzF2 = zzgpt.zzF((zzA >> 63) ^ (zzA + zzA));
                            zzo = zzE7 + zzF2;
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzW(obj, i3, i2)) {
                            zzo = zzgpt.zzx(i3, (zzgrw) zzgtq.zzh(obj, j), zzC(i2));
                            i += zzo;
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzgtg zzgtgVar = this.zzo;
            return i + zzgtgVar.zza(zzgtgVar.zzd(obj));
        }
        return zzp(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final int zzb(Object obj) {
        int i;
        int zzc;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzz = zzz(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzz;
            int i5 = 37;
            switch (zzy(zzz)) {
                case 0:
                    i = i2 * 53;
                    zzc = zzgqw.zzc(Double.doubleToLongBits(zzgtq.zzb(obj, j)));
                    i2 = i + zzc;
                    break;
                case 1:
                    i = i2 * 53;
                    zzc = Float.floatToIntBits(zzgtq.zzc(obj, j));
                    i2 = i + zzc;
                    break;
                case 2:
                    i = i2 * 53;
                    zzc = zzgqw.zzc(zzgtq.zzf(obj, j));
                    i2 = i + zzc;
                    break;
                case 3:
                    i = i2 * 53;
                    zzc = zzgqw.zzc(zzgtq.zzf(obj, j));
                    i2 = i + zzc;
                    break;
                case 4:
                    i = i2 * 53;
                    zzc = zzgtq.zzd(obj, j);
                    i2 = i + zzc;
                    break;
                case 5:
                    i = i2 * 53;
                    zzc = zzgqw.zzc(zzgtq.zzf(obj, j));
                    i2 = i + zzc;
                    break;
                case 6:
                    i = i2 * 53;
                    zzc = zzgtq.zzd(obj, j);
                    i2 = i + zzc;
                    break;
                case 7:
                    i = i2 * 53;
                    zzc = zzgqw.zza(zzgtq.zzz(obj, j));
                    i2 = i + zzc;
                    break;
                case 8:
                    i = i2 * 53;
                    zzc = ((String) zzgtq.zzh(obj, j)).hashCode();
                    i2 = i + zzc;
                    break;
                case 9:
                    Object zzh = zzgtq.zzh(obj, j);
                    if (zzh != null) {
                        i5 = zzh.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzc = zzgtq.zzh(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 11:
                    i = i2 * 53;
                    zzc = zzgtq.zzd(obj, j);
                    i2 = i + zzc;
                    break;
                case 12:
                    i = i2 * 53;
                    zzc = zzgtq.zzd(obj, j);
                    i2 = i + zzc;
                    break;
                case 13:
                    i = i2 * 53;
                    zzc = zzgtq.zzd(obj, j);
                    i2 = i + zzc;
                    break;
                case 14:
                    i = i2 * 53;
                    zzc = zzgqw.zzc(zzgtq.zzf(obj, j));
                    i2 = i + zzc;
                    break;
                case 15:
                    i = i2 * 53;
                    zzc = zzgtq.zzd(obj, j);
                    i2 = i + zzc;
                    break;
                case 16:
                    i = i2 * 53;
                    zzc = zzgqw.zzc(zzgtq.zzf(obj, j));
                    i2 = i + zzc;
                    break;
                case 17:
                    Object zzh2 = zzgtq.zzh(obj, j);
                    if (zzh2 != null) {
                        i5 = zzh2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    zzc = zzgtq.zzh(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 50:
                    i = i2 * 53;
                    zzc = zzgtq.zzh(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 51:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgqw.zzc(Double.doubleToLongBits(zzn(obj, j)));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = Float.floatToIntBits(zzo(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgqw.zzc(zzA(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgqw.zzc(zzA(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzq(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgqw.zzc(zzA(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzq(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgqw.zza(zzX(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = ((String) zzgtq.zzh(obj, j)).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgtq.zzh(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgtq.zzh(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzq(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzq(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzq(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgqw.zzc(zzA(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzq(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgqw.zzc(zzA(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgtq.zzh(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzo.zzd(obj).hashCode();
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:348:0x0407, code lost:
        if (r0 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0409, code lost:
        r26.putInt(r12, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x040f, code lost:
        r10 = r8.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0414, code lost:
        if (r10 >= r8.zzm) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0416, code lost:
        zzD(r28, r8.zzk[r10], null, r8.zzo, r28);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0429, code lost:
        if (r9 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x042d, code lost:
        if (r6 != r31) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0434, code lost:
        throw com.google.android.gms.internal.ads.zzgqy.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0437, code lost:
        if (r6 > r31) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0439, code lost:
        if (r7 != r9) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x043b, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0441, code lost:
        throw com.google.android.gms.internal.ads.zzgqy.zzg();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.ads.zzgoq r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgoq):int");
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final Object zze() {
        return ((zzgqm) this.zzg).zzaD();
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzf(Object obj) {
        if (zzV(obj)) {
            if (obj instanceof zzgqm) {
                zzgqm zzgqmVar = (zzgqm) obj;
                zzgqmVar.zzaU(Integer.MAX_VALUE);
                zzgqmVar.zza = 0;
                zzgqmVar.zzaS();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzz = zzz(i);
                int i2 = 1048575 & zzz;
                int zzy = zzy(zzz);
                long j = i2;
                if (zzy != 9) {
                    switch (zzy) {
                        case 17:
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.zzn.zzb(obj, j);
                            continue;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzgrq) object).zzc();
                                unsafe.putObject(obj, j, object);
                            } else {
                                continue;
                            }
                        default:
                    }
                }
                if (zzS(obj, i)) {
                    zzC(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzo.zzm(obj);
            if (this.zzh) {
                this.zzp.zze(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzg(Object obj, Object obj2) {
        zzI(obj);
        Objects.requireNonNull(obj2);
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzz = zzz(i);
            int i2 = this.zzc[i];
            long j = 1048575 & zzz;
            switch (zzy(zzz)) {
                case 0:
                    if (zzS(obj2, i)) {
                        zzgtq.zzr(obj, j, zzgtq.zzb(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzS(obj2, i)) {
                        zzgtq.zzs(obj, j, zzgtq.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzS(obj2, i)) {
                        zzgtq.zzu(obj, j, zzgtq.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzS(obj2, i)) {
                        zzgtq.zzu(obj, j, zzgtq.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzS(obj2, i)) {
                        zzgtq.zzt(obj, j, zzgtq.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzS(obj2, i)) {
                        zzgtq.zzu(obj, j, zzgtq.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzS(obj2, i)) {
                        zzgtq.zzt(obj, j, zzgtq.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzS(obj2, i)) {
                        zzgtq.zzp(obj, j, zzgtq.zzz(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzS(obj2, i)) {
                        zzgtq.zzv(obj, j, zzgtq.zzh(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzJ(obj, obj2, i);
                    break;
                case 10:
                    if (zzS(obj2, i)) {
                        zzgtq.zzv(obj, j, zzgtq.zzh(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzS(obj2, i)) {
                        zzgtq.zzt(obj, j, zzgtq.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzS(obj2, i)) {
                        zzgtq.zzt(obj, j, zzgtq.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzS(obj2, i)) {
                        zzgtq.zzt(obj, j, zzgtq.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzS(obj2, i)) {
                        zzgtq.zzu(obj, j, zzgtq.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzS(obj2, i)) {
                        zzgtq.zzt(obj, j, zzgtq.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzS(obj2, i)) {
                        zzgtq.zzu(obj, j, zzgtq.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzJ(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzn.zzc(obj, obj2, j);
                    break;
                case 50:
                    zzgsr.zzI(this.zzr, obj, obj2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzW(obj2, i2, i)) {
                        zzgtq.zzv(obj, j, zzgtq.zzh(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzK(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzW(obj2, i2, i)) {
                        zzgtq.zzv(obj, j, zzgtq.zzh(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzK(obj, obj2, i);
                    break;
            }
        }
        zzgsr.zzF(this.zzo, obj, obj2);
        if (this.zzh) {
            zzgsr.zzE(this.zzp, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:398:0x061d A[Catch: all -> 0x0612, TryCatch #0 {all -> 0x0612, blocks: (B:382:0x05eb, B:396:0x0618, B:398:0x061d, B:399:0x0622), top: B:424:0x05eb }] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0655 A[LOOP:2: B:414:0x0651->B:416:0x0655, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0628 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r18, com.google.android.gms.internal.ads.zzgsh r19, com.google.android.gms.internal.ads.zzgpy r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzgsh, com.google.android.gms.internal.ads.zzgpy):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:267:0x02ed, code lost:
        if (r0 != r24) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x02ef, code lost:
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0300, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x032c, code lost:
        if (r0 != r14) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x034f, code lost:
        if (r0 != r14) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.gms.internal.ads.zzgsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.zzgoq r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzi(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzgoq):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzH;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzz = zzz(i);
            long j = zzz & 1048575;
            switch (zzy(zzz)) {
                case 0:
                    if (zzQ(obj, obj2, i) && Double.doubleToLongBits(zzgtq.zzb(obj, j)) == Double.doubleToLongBits(zzgtq.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzQ(obj, obj2, i) && Float.floatToIntBits(zzgtq.zzc(obj, j)) == Float.floatToIntBits(zzgtq.zzc(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzQ(obj, obj2, i) && zzgtq.zzf(obj, j) == zzgtq.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzQ(obj, obj2, i) && zzgtq.zzf(obj, j) == zzgtq.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzQ(obj, obj2, i) && zzgtq.zzd(obj, j) == zzgtq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzQ(obj, obj2, i) && zzgtq.zzf(obj, j) == zzgtq.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzQ(obj, obj2, i) && zzgtq.zzd(obj, j) == zzgtq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzQ(obj, obj2, i) && zzgtq.zzz(obj, j) == zzgtq.zzz(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzQ(obj, obj2, i) && zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzQ(obj, obj2, i) && zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzQ(obj, obj2, i) && zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzQ(obj, obj2, i) && zzgtq.zzd(obj, j) == zzgtq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzQ(obj, obj2, i) && zzgtq.zzd(obj, j) == zzgtq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzQ(obj, obj2, i) && zzgtq.zzd(obj, j) == zzgtq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzQ(obj, obj2, i) && zzgtq.zzf(obj, j) == zzgtq.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzQ(obj, obj2, i) && zzgtq.zzd(obj, j) == zzgtq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzQ(obj, obj2, i) && zzgtq.zzf(obj, j) == zzgtq.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzQ(obj, obj2, i) && zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzH = zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j));
                    break;
                case 50:
                    zzH = zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzw = zzw(i) & 1048575;
                    if (zzgtq.zzd(obj, zzw) == zzgtq.zzd(obj2, zzw) && zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzH) {
                return false;
            }
        }
        if (this.zzo.zzd(obj).equals(this.zzo.zzd(obj2))) {
            if (this.zzh) {
                this.zzp.zza(obj);
                this.zzp.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzl) {
            int i6 = this.zzk[i5];
            int i7 = this.zzc[i6];
            int zzz = zzz(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzz) != 0 && !zzT(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzy = zzy(zzz);
            if (zzy != 9 && zzy != 17) {
                if (zzy != 27) {
                    if (zzy == 60 || zzy == 68) {
                        if (zzW(obj, i7, i6) && !zzU(obj, zzz, zzC(i6))) {
                            return false;
                        }
                    } else if (zzy != 49) {
                        if (zzy == 50 && !((zzgrq) zzgtq.zzh(obj, zzz & 1048575)).isEmpty()) {
                            zzgrp zzgrpVar = (zzgrp) zzE(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzgtq.zzh(obj, zzz & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgsp zzC = zzC(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzC.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzT(obj, i6, i, i2, i10) && !zzU(obj, zzz, zzC(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzm(Object obj, zzgpu zzgpuVar) throws IOException {
        int i;
        int i2 = 1048575;
        if (!this.zzj) {
            if (!this.zzh) {
                int length = this.zzc.length;
                Unsafe unsafe = zzb;
                int i3 = 0;
                int i4 = 1048575;
                int i5 = 0;
                while (i3 < length) {
                    int zzz = zzz(i3);
                    int[] iArr = this.zzc;
                    int i6 = iArr[i3];
                    int zzy = zzy(zzz);
                    if (zzy <= 17) {
                        int i7 = iArr[i3 + 2];
                        int i8 = i7 & i2;
                        if (i8 != i4) {
                            i5 = unsafe.getInt(obj, i8);
                            i4 = i8;
                        }
                        i = 1 << (i7 >>> 20);
                    } else {
                        i = 0;
                    }
                    long j = zzz & i2;
                    switch (zzy) {
                        case 0:
                            if ((i5 & i) != 0) {
                                zzgpuVar.zzf(i6, zzgtq.zzb(obj, j));
                                continue;
                            }
                            i3 += 3;
                            i2 = 1048575;
                        case 1:
                            if ((i5 & i) != 0) {
                                zzgpuVar.zzo(i6, zzgtq.zzc(obj, j));
                            } else {
                                continue;
                            }
                            i3 += 3;
                            i2 = 1048575;
                        case 2:
                            if ((i5 & i) != 0) {
                                zzgpuVar.zzt(i6, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i3 += 3;
                            i2 = 1048575;
                        case 3:
                            if ((i5 & i) != 0) {
                                zzgpuVar.zzJ(i6, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i3 += 3;
                            i2 = 1048575;
                        case 4:
                            if ((i5 & i) != 0) {
                                zzgpuVar.zzr(i6, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i3 += 3;
                            i2 = 1048575;
                        case 5:
                            if ((i5 & i) != 0) {
                                zzgpuVar.zzm(i6, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i3 += 3;
                            i2 = 1048575;
                        case 6:
                            if ((i5 & i) != 0) {
                                zzgpuVar.zzk(i6, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i3 += 3;
                            i2 = 1048575;
                        case 7:
                            if ((i5 & i) != 0) {
                                zzgpuVar.zzb(i6, zzgtq.zzz(obj, j));
                            } else {
                                continue;
                            }
                            i3 += 3;
                            i2 = 1048575;
                        case 8:
                            if ((i5 & i) != 0) {
                                zzZ(i6, unsafe.getObject(obj, j), zzgpuVar);
                            } else {
                                continue;
                            }
                            i3 += 3;
                            i2 = 1048575;
                        case 9:
                            if ((i5 & i) != 0) {
                                zzgpuVar.zzv(i6, unsafe.getObject(obj, j), zzC(i3));
                            } else {
                                continue;
                            }
                            i3 += 3;
                            i2 = 1048575;
                        case 10:
                            if ((i5 & i) != 0) {
                                zzgpuVar.zzd(i6, (zzgpe) unsafe.getObject(obj, j));
                            } else {
                                continue;
                            }
                            i3 += 3;
                            i2 = 1048575;
                        case 11:
                            if ((i5 & i) != 0) {
                                zzgpuVar.zzH(i6, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i3 += 3;
                            i2 = 1048575;
                        case 12:
                            if ((i5 & i) != 0) {
                                zzgpuVar.zzi(i6, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i3 += 3;
                            i2 = 1048575;
                        case 13:
                            if ((i5 & i) != 0) {
                                zzgpuVar.zzw(i6, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i3 += 3;
                            i2 = 1048575;
                        case 14:
                            if ((i5 & i) != 0) {
                                zzgpuVar.zzy(i6, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i3 += 3;
                            i2 = 1048575;
                        case 15:
                            if ((i5 & i) != 0) {
                                zzgpuVar.zzA(i6, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i3 += 3;
                            i2 = 1048575;
                        case 16:
                            if ((i5 & i) != 0) {
                                zzgpuVar.zzC(i6, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i3 += 3;
                            i2 = 1048575;
                        case 17:
                            if ((i5 & i) != 0) {
                                zzgpuVar.zzq(i6, unsafe.getObject(obj, j), zzC(i3));
                            } else {
                                continue;
                            }
                            i3 += 3;
                            i2 = 1048575;
                        case 18:
                            zzgsr.zzL(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                            continue;
                            i3 += 3;
                            i2 = 1048575;
                        case 19:
                            zzgsr.zzP(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                            continue;
                            i3 += 3;
                            i2 = 1048575;
                        case 20:
                            zzgsr.zzS(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                            continue;
                            i3 += 3;
                            i2 = 1048575;
                        case 21:
                            zzgsr.zzaa(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                            continue;
                            i3 += 3;
                            i2 = 1048575;
                        case 22:
                            zzgsr.zzR(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                            continue;
                            i3 += 3;
                            i2 = 1048575;
                        case 23:
                            zzgsr.zzO(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                            continue;
                            i3 += 3;
                            i2 = 1048575;
                        case 24:
                            zzgsr.zzN(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                            continue;
                            i3 += 3;
                            i2 = 1048575;
                        case 25:
                            zzgsr.zzJ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                            continue;
                            i3 += 3;
                            i2 = 1048575;
                        case 26:
                            zzgsr.zzY(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar);
                            break;
                        case 27:
                            zzgsr.zzT(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, zzC(i3));
                            break;
                        case 28:
                            zzgsr.zzK(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar);
                            break;
                        case 29:
                            zzgsr.zzZ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                            break;
                        case 30:
                            zzgsr.zzM(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                            break;
                        case 31:
                            zzgsr.zzU(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                            break;
                        case 32:
                            zzgsr.zzV(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                            break;
                        case 33:
                            zzgsr.zzW(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                            break;
                        case 34:
                            zzgsr.zzX(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                            break;
                        case 35:
                            zzgsr.zzL(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                            break;
                        case 36:
                            zzgsr.zzP(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                            break;
                        case 37:
                            zzgsr.zzS(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                            break;
                        case 38:
                            zzgsr.zzaa(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                            break;
                        case 39:
                            zzgsr.zzR(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                            break;
                        case 40:
                            zzgsr.zzO(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                            break;
                        case 41:
                            zzgsr.zzN(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                            break;
                        case 42:
                            zzgsr.zzJ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                            break;
                        case 43:
                            zzgsr.zzZ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                            break;
                        case 44:
                            zzgsr.zzM(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                            break;
                        case 45:
                            zzgsr.zzU(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                            break;
                        case 46:
                            zzgsr.zzV(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                            break;
                        case 47:
                            zzgsr.zzW(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                            break;
                        case 48:
                            zzgsr.zzX(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                            break;
                        case 49:
                            zzgsr.zzQ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgpuVar, zzC(i3));
                            break;
                        case 50:
                            zzY(zzgpuVar, i6, unsafe.getObject(obj, j), i3);
                            break;
                        case 51:
                            if (zzW(obj, i6, i3)) {
                                zzgpuVar.zzf(i6, zzn(obj, j));
                                break;
                            }
                            break;
                        case 52:
                            if (zzW(obj, i6, i3)) {
                                zzgpuVar.zzo(i6, zzo(obj, j));
                                break;
                            }
                            break;
                        case 53:
                            if (zzW(obj, i6, i3)) {
                                zzgpuVar.zzt(i6, zzA(obj, j));
                                break;
                            }
                            break;
                        case 54:
                            if (zzW(obj, i6, i3)) {
                                zzgpuVar.zzJ(i6, zzA(obj, j));
                                break;
                            }
                            break;
                        case 55:
                            if (zzW(obj, i6, i3)) {
                                zzgpuVar.zzr(i6, zzq(obj, j));
                                break;
                            }
                            break;
                        case 56:
                            if (zzW(obj, i6, i3)) {
                                zzgpuVar.zzm(i6, zzA(obj, j));
                                break;
                            }
                            break;
                        case 57:
                            if (zzW(obj, i6, i3)) {
                                zzgpuVar.zzk(i6, zzq(obj, j));
                                break;
                            }
                            break;
                        case 58:
                            if (zzW(obj, i6, i3)) {
                                zzgpuVar.zzb(i6, zzX(obj, j));
                                break;
                            }
                            break;
                        case 59:
                            if (zzW(obj, i6, i3)) {
                                zzZ(i6, unsafe.getObject(obj, j), zzgpuVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zzW(obj, i6, i3)) {
                                zzgpuVar.zzv(i6, unsafe.getObject(obj, j), zzC(i3));
                                break;
                            }
                            break;
                        case 61:
                            if (zzW(obj, i6, i3)) {
                                zzgpuVar.zzd(i6, (zzgpe) unsafe.getObject(obj, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zzW(obj, i6, i3)) {
                                zzgpuVar.zzH(i6, zzq(obj, j));
                                break;
                            }
                            break;
                        case 63:
                            if (zzW(obj, i6, i3)) {
                                zzgpuVar.zzi(i6, zzq(obj, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zzW(obj, i6, i3)) {
                                zzgpuVar.zzw(i6, zzq(obj, j));
                                break;
                            }
                            break;
                        case 65:
                            if (zzW(obj, i6, i3)) {
                                zzgpuVar.zzy(i6, zzA(obj, j));
                                break;
                            }
                            break;
                        case 66:
                            if (zzW(obj, i6, i3)) {
                                zzgpuVar.zzA(i6, zzq(obj, j));
                                break;
                            }
                            break;
                        case 67:
                            if (zzW(obj, i6, i3)) {
                                zzgpuVar.zzC(i6, zzA(obj, j));
                                break;
                            }
                            break;
                        case 68:
                            if (zzW(obj, i6, i3)) {
                                zzgpuVar.zzq(i6, unsafe.getObject(obj, j), zzC(i3));
                                break;
                            }
                            break;
                    }
                    i3 += 3;
                    i2 = 1048575;
                }
                zzgtg zzgtgVar = this.zzo;
                zzgtgVar.zzr(zzgtgVar.zzd(obj), zzgpuVar);
            } else {
                this.zzp.zza(obj);
                throw null;
            }
        } else {
            if (!this.zzh) {
                int length2 = this.zzc.length;
                for (int i9 = 0; i9 < length2; i9 += 3) {
                    int zzz2 = zzz(i9);
                    int i10 = this.zzc[i9];
                    switch (zzy(zzz2)) {
                        case 0:
                            if (zzS(obj, i9)) {
                                zzgpuVar.zzf(i10, zzgtq.zzb(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zzS(obj, i9)) {
                                zzgpuVar.zzo(i10, zzgtq.zzc(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zzS(obj, i9)) {
                                zzgpuVar.zzt(i10, zzgtq.zzf(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zzS(obj, i9)) {
                                zzgpuVar.zzJ(i10, zzgtq.zzf(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zzS(obj, i9)) {
                                zzgpuVar.zzr(i10, zzgtq.zzd(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zzS(obj, i9)) {
                                zzgpuVar.zzm(i10, zzgtq.zzf(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zzS(obj, i9)) {
                                zzgpuVar.zzk(i10, zzgtq.zzd(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zzS(obj, i9)) {
                                zzgpuVar.zzb(i10, zzgtq.zzz(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (zzS(obj, i9)) {
                                zzZ(i10, zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (zzS(obj, i9)) {
                                zzgpuVar.zzv(i10, zzgtq.zzh(obj, zzz2 & 1048575), zzC(i9));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (zzS(obj, i9)) {
                                zzgpuVar.zzd(i10, (zzgpe) zzgtq.zzh(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (zzS(obj, i9)) {
                                zzgpuVar.zzH(i10, zzgtq.zzd(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zzS(obj, i9)) {
                                zzgpuVar.zzi(i10, zzgtq.zzd(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zzS(obj, i9)) {
                                zzgpuVar.zzw(i10, zzgtq.zzd(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zzS(obj, i9)) {
                                zzgpuVar.zzy(i10, zzgtq.zzf(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zzS(obj, i9)) {
                                zzgpuVar.zzA(i10, zzgtq.zzd(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zzS(obj, i9)) {
                                zzgpuVar.zzC(i10, zzgtq.zzf(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (zzS(obj, i9)) {
                                zzgpuVar.zzq(i10, zzgtq.zzh(obj, zzz2 & 1048575), zzC(i9));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            zzgsr.zzL(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                            break;
                        case 19:
                            zzgsr.zzP(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                            break;
                        case 20:
                            zzgsr.zzS(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                            break;
                        case 21:
                            zzgsr.zzaa(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                            break;
                        case 22:
                            zzgsr.zzR(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                            break;
                        case 23:
                            zzgsr.zzO(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                            break;
                        case 24:
                            zzgsr.zzN(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                            break;
                        case 25:
                            zzgsr.zzJ(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                            break;
                        case 26:
                            zzgsr.zzY(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar);
                            break;
                        case 27:
                            zzgsr.zzT(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, zzC(i9));
                            break;
                        case 28:
                            zzgsr.zzK(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar);
                            break;
                        case 29:
                            zzgsr.zzZ(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                            break;
                        case 30:
                            zzgsr.zzM(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                            break;
                        case 31:
                            zzgsr.zzU(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                            break;
                        case 32:
                            zzgsr.zzV(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                            break;
                        case 33:
                            zzgsr.zzW(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                            break;
                        case 34:
                            zzgsr.zzX(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                            break;
                        case 35:
                            zzgsr.zzL(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                            break;
                        case 36:
                            zzgsr.zzP(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                            break;
                        case 37:
                            zzgsr.zzS(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                            break;
                        case 38:
                            zzgsr.zzaa(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                            break;
                        case 39:
                            zzgsr.zzR(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                            break;
                        case 40:
                            zzgsr.zzO(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                            break;
                        case 41:
                            zzgsr.zzN(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                            break;
                        case 42:
                            zzgsr.zzJ(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                            break;
                        case 43:
                            zzgsr.zzZ(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                            break;
                        case 44:
                            zzgsr.zzM(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                            break;
                        case 45:
                            zzgsr.zzU(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                            break;
                        case 46:
                            zzgsr.zzV(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                            break;
                        case 47:
                            zzgsr.zzW(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                            break;
                        case 48:
                            zzgsr.zzX(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                            break;
                        case 49:
                            zzgsr.zzQ(i10, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, zzC(i9));
                            break;
                        case 50:
                            zzY(zzgpuVar, i10, zzgtq.zzh(obj, zzz2 & 1048575), i9);
                            break;
                        case 51:
                            if (zzW(obj, i10, i9)) {
                                zzgpuVar.zzf(i10, zzn(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (zzW(obj, i10, i9)) {
                                zzgpuVar.zzo(i10, zzo(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (zzW(obj, i10, i9)) {
                                zzgpuVar.zzt(i10, zzA(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (zzW(obj, i10, i9)) {
                                zzgpuVar.zzJ(i10, zzA(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (zzW(obj, i10, i9)) {
                                zzgpuVar.zzr(i10, zzq(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (zzW(obj, i10, i9)) {
                                zzgpuVar.zzm(i10, zzA(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (zzW(obj, i10, i9)) {
                                zzgpuVar.zzk(i10, zzq(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (zzW(obj, i10, i9)) {
                                zzgpuVar.zzb(i10, zzX(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (zzW(obj, i10, i9)) {
                                zzZ(i10, zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (zzW(obj, i10, i9)) {
                                zzgpuVar.zzv(i10, zzgtq.zzh(obj, zzz2 & 1048575), zzC(i9));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (zzW(obj, i10, i9)) {
                                zzgpuVar.zzd(i10, (zzgpe) zzgtq.zzh(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (zzW(obj, i10, i9)) {
                                zzgpuVar.zzH(i10, zzq(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (zzW(obj, i10, i9)) {
                                zzgpuVar.zzi(i10, zzq(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (zzW(obj, i10, i9)) {
                                zzgpuVar.zzw(i10, zzq(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (zzW(obj, i10, i9)) {
                                zzgpuVar.zzy(i10, zzA(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (zzW(obj, i10, i9)) {
                                zzgpuVar.zzA(i10, zzq(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (zzW(obj, i10, i9)) {
                                zzgpuVar.zzC(i10, zzA(obj, zzz2 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (zzW(obj, i10, i9)) {
                                zzgpuVar.zzq(i10, zzgtq.zzh(obj, zzz2 & 1048575), zzC(i9));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                zzgtg zzgtgVar2 = this.zzo;
                zzgtgVar2.zzr(zzgtgVar2.zzd(obj), zzgpuVar);
                return;
            }
            this.zzp.zza(obj);
            throw null;
        }
    }
}
