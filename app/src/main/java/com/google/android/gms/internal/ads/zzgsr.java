package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgsr {
    private static final Class zza;
    private static final zzgtg zzb;
    private static final zzgtg zzc;
    private static final zzgtg zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzgti();
    }

    public static zzgtg zzA() {
        return zzc;
    }

    public static zzgtg zzB() {
        return zzd;
    }

    public static Object zzC(Object obj, int i, List list, zzgqq zzgqqVar, Object obj2, zzgtg zzgtgVar) {
        if (zzgqqVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzgqqVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj2 = zzD(obj, i, intValue, obj2, zzgtgVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgqqVar.zza(intValue2)) {
                    obj2 = zzD(obj, i, intValue2, obj2, zzgtgVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzD(Object obj, int i, int i2, Object obj2, zzgtg zzgtgVar) {
        if (obj2 == null) {
            obj2 = zzgtgVar.zzc(obj);
        }
        zzgtgVar.zzl(obj2, i, i2);
        return obj2;
    }

    public static void zzE(zzgpz zzgpzVar, Object obj, Object obj2) {
        zzgpzVar.zza(obj2);
        throw null;
    }

    public static void zzF(zzgtg zzgtgVar, Object obj, Object obj2) {
        zzgtgVar.zzo(obj, zzgtgVar.zze(zzgtgVar.zzd(obj), zzgtgVar.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzgqm.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void zzI(zzgrr zzgrrVar, Object obj, Object obj2, long j) {
        zzgtq.zzv(obj, j, zzgrr.zzc(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j)));
    }

    public static void zzJ(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzc(i, list, z);
    }

    public static void zzK(int i, List list, zzgpu zzgpuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zze(i, list);
    }

    public static void zzL(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzg(i, list, z);
    }

    public static void zzM(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzj(i, list, z);
    }

    public static void zzN(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzl(i, list, z);
    }

    public static void zzO(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzn(i, list, z);
    }

    public static void zzP(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzp(i, list, z);
    }

    public static void zzQ(int i, List list, zzgpu zzgpuVar, zzgsp zzgspVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgpuVar.zzq(i, list.get(i2), zzgspVar);
        }
    }

    public static void zzR(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzs(i, list, z);
    }

    public static void zzS(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzu(i, list, z);
    }

    public static void zzT(int i, List list, zzgpu zzgpuVar, zzgsp zzgspVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgpuVar.zzv(i, list.get(i2), zzgspVar);
        }
    }

    public static void zzU(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzx(i, list, z);
    }

    public static void zzV(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzz(i, list, z);
    }

    public static void zzW(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzB(i, list, z);
    }

    public static void zzX(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzD(i, list, z);
    }

    public static void zzY(int i, List list, zzgpu zzgpuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzG(i, list);
    }

    public static void zzZ(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzI(i, list, z);
    }

    public static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgpt.zzE(i << 3) + 1);
    }

    public static void zzaa(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzK(i, list, z);
    }

    private static zzgtg zzab(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzgtg) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List list) {
        return list.size();
    }

    public static int zzc(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = size * zzgpt.zzD(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzD += zzgpt.zzw((zzgpe) list.get(i2));
        }
        return zzD;
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzgpt.zzD(i));
    }

    public static int zze(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgqn) {
            zzgqn zzgqnVar = (zzgqn) list;
            i = 0;
            while (i2 < size) {
                i += zzgpt.zzy(zzgqnVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgpt.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzf(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgpt.zzE(i << 3) + 4);
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgpt.zzE(i << 3) + 8);
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i, List list, zzgsp zzgspVar) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += zzgpt.zzx(i, (zzgrw) list.get(i3), zzgspVar);
            }
            return i2;
        }
        return 0;
    }

    public static int zzk(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzgpt.zzD(i));
    }

    public static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgqn) {
            zzgqn zzgqnVar = (zzgqn) list;
            i = 0;
            while (i2 < size) {
                i += zzgpt.zzy(zzgqnVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgpt.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzm(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzgpt.zzD(i));
    }

    public static int zzn(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrl) {
            zzgrl zzgrlVar = (zzgrl) list;
            i = 0;
            while (i2 < size) {
                i += zzgpt.zzF(zzgrlVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgpt.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzo(int i, Object obj, zzgsp zzgspVar) {
        if (obj instanceof zzgrc) {
            int i2 = zzgpt.zzf;
            int zza2 = ((zzgrc) obj).zza();
            return zzgpt.zzE(i << 3) + zzgpt.zzE(zza2) + zza2;
        }
        return zzgpt.zzE(i << 3) + zzgpt.zzA((zzgrw) obj, zzgspVar);
    }

    public static int zzp(int i, List list, zzgsp zzgspVar) {
        int zzA;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = zzgpt.zzD(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzgrc) {
                zzA = zzgpt.zzz((zzgrc) obj);
            } else {
                zzA = zzgpt.zzA((zzgrw) obj, zzgspVar);
            }
            zzD += zzA;
        }
        return zzD;
    }

    public static int zzq(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzgpt.zzD(i));
    }

    public static int zzr(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgqn) {
            zzgqn zzgqnVar = (zzgqn) list;
            i = 0;
            while (i2 < size) {
                int zze = zzgqnVar.zze(i2);
                i += zzgpt.zzE((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzgpt.zzE((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzs(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzgpt.zzD(i));
    }

    public static int zzt(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrl) {
            zzgrl zzgrlVar = (zzgrl) list;
            i = 0;
            while (i2 < size) {
                long zze = zzgrlVar.zze(i2);
                i += zzgpt.zzF((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzgpt.zzF((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzu(int i, List list) {
        int zzC;
        int zzC2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z = list instanceof zzgre;
        int zzD = zzgpt.zzD(i) * size;
        if (z) {
            zzgre zzgreVar = (zzgre) list;
            while (i2 < size) {
                Object zzf = zzgreVar.zzf(i2);
                if (zzf instanceof zzgpe) {
                    zzC2 = zzgpt.zzw((zzgpe) zzf);
                } else {
                    zzC2 = zzgpt.zzC((String) zzf);
                }
                zzD += zzC2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzgpe) {
                    zzC = zzgpt.zzw((zzgpe) obj);
                } else {
                    zzC = zzgpt.zzC((String) obj);
                }
                zzD += zzC;
                i2++;
            }
        }
        return zzD;
    }

    public static int zzv(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzgpt.zzD(i));
    }

    public static int zzw(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgqn) {
            zzgqn zzgqnVar = (zzgqn) list;
            i = 0;
            while (i2 < size) {
                i += zzgpt.zzE(zzgqnVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgpt.zzE(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzx(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzgpt.zzD(i));
    }

    public static int zzy(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrl) {
            zzgrl zzgrlVar = (zzgrl) list;
            i = 0;
            while (i2 < size) {
                i += zzgpt.zzF(zzgrlVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgpt.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzgtg zzz() {
        return zzb;
    }
}
