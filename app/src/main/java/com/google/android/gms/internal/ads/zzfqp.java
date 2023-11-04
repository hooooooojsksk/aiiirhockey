package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public abstract class zzfqp extends zzfqf implements Set {
    @CheckForNull
    private transient zzfqk zza;

    public static int zzh(int i) {
        double d;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
                d = highestOneBit;
                Double.isNaN(d);
            } while (d * 0.7d < max);
            return highestOneBit;
        }
        zzfnu.zzf(max < 1073741824, "collection too large");
        return 1073741824;
    }

    public static zzfqo zzj(int i) {
        return new zzfqo(i);
    }

    public static zzfqp zzl(Collection collection) {
        Object[] array = collection.toArray();
        return zzs(array.length, array);
    }

    public static zzfqp zzm() {
        return zzfrz.zza;
    }

    public static zzfqp zzn(Object obj) {
        return new zzfsg(obj);
    }

    public static zzfqp zzo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzs(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzfqp zzp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return zzs(12, objArr2);
    }

    public static boolean zzt(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfqp) && zzr() && ((zzfqp) obj).zzr() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzfsf.zzc(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzfsf.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    public zzfqk zzd() {
        zzfqk zzfqkVar = this.zza;
        if (zzfqkVar == null) {
            zzfqk zzi = zzi();
            this.zza = zzi;
            return zzi;
        }
        return zzfqkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzfsj iterator();

    zzfqk zzi() {
        return zzfqk.zzj(toArray());
    }

    boolean zzr() {
        return false;
    }

    public static zzfqp zzs(int i, Object... objArr) {
        if (i != 0) {
            if (i == 1) {
                Object obj = objArr[0];
                obj.getClass();
                return new zzfsg(obj);
            }
            int zzh = zzh(i);
            Object[] objArr2 = new Object[zzh];
            int i2 = zzh - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj2 = objArr[i5];
                zzfrr.zza(obj2, i5);
                int hashCode = obj2.hashCode();
                int zza = zzfqc.zza(hashCode);
                while (true) {
                    int i6 = zza & i2;
                    Object obj3 = objArr2[i6];
                    if (obj3 != null) {
                        if (!obj3.equals(obj2)) {
                            zza++;
                        }
                    } else {
                        objArr[i4] = obj2;
                        objArr2[i6] = obj2;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                return new zzfsg(obj4);
            }
            if (zzh(i4) < zzh / 2) {
                return zzs(i4, objArr);
            }
            if (zzt(i4, objArr.length)) {
                objArr = Arrays.copyOf(objArr, i4);
            }
            return new zzfrz(objArr, i3, objArr2, i2, i4);
        }
        return zzfrz.zza;
    }
}
