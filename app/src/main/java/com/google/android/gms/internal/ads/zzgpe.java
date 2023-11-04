package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzgpe implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzgpe zzb = new zzgpa(zzgqw.zzd);
    private static final zzgpd zzd;
    private int zzc = 0;

    static {
        int i = zzgop.zza;
        zzd = new zzgpd(null);
        zza = new zzgov();
    }

    public static void zzB(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    public static zzgpb zzt() {
        return new zzgpb(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgpe zzu(Iterable iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = iterable.size();
        }
        if (size == 0) {
            return zzb;
        }
        return zzc(iterable.iterator(), size);
    }

    public static zzgpe zzv(byte[] bArr) {
        return zzw(bArr, 0, bArr.length);
    }

    public static zzgpe zzw(byte[] bArr, int i, int i2) {
        zzq(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzgpa(bArr2);
    }

    public static zzgpe zzx(String str) {
        return new zzgpa(str.getBytes(zzgqw.zzb));
    }

    public static zzgpe zzy(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            zzgpe zzw = i2 == 0 ? null : zzw(bArr, 0, i2);
            if (zzw != null) {
                arrayList.add(zzw);
                i = Math.min(i + i, 8192);
            } else {
                return zzu(arrayList);
            }
        }
    }

    public static zzgpe zzz(byte[] bArr) {
        return new zzgpa(bArr);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zzi(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzgte.zza(this) : zzgte.zza(zzk(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String zzA(Charset charset) {
        return zzd() == 0 ? "" : zzm(charset);
    }

    @Deprecated
    public final void zzC(byte[] bArr, int i, int i2, int i3) {
        zzq(0, i3, zzd());
        zzq(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }

    public final boolean zzD() {
        return zzd() == 0;
    }

    public final byte[] zzE() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzgqw.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i, int i2, int i3);

    public abstract int zzj(int i, int i2, int i3);

    public abstract zzgpe zzk(int i, int i2);

    public abstract zzgpm zzl();

    protected abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    public abstract void zzo(zzgot zzgotVar) throws IOException;

    public abstract boolean zzp();

    public final int zzr() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzs */
    public zzgoy iterator() {
        return new zzgou(this);
    }

    private static zzgpe zzc(Iterator it, int i) {
        if (i > 0) {
            if (i == 1) {
                return (zzgpe) it.next();
            }
            int i2 = i >>> 1;
            zzgpe zzc = zzc(it, i2);
            zzgpe zzc2 = zzc(it, i - i2);
            if (Integer.MAX_VALUE - zzc.zzd() < zzc2.zzd()) {
                int zzd2 = zzc.zzd();
                int zzd3 = zzc2.zzd();
                throw new IllegalArgumentException("ByteString would be too long: " + zzd2 + "+" + zzd3);
            }
            return zzgso.zzG(zzc, zzc2);
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    public static int zzq(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
            } else if (i2 < i) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
            }
        }
        return i4;
    }
}
