package com.google.android.gms.internal.ads;

import com.mobirix.airhockey.googlePlayServiceHelper;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgso extends zzgpe {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, googlePlayServiceHelper.RC_SIGN_IN, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzgpe zzd;
    private final zzgpe zze;
    private final int zzf;
    private final int zzg;

    /* JADX INFO: Access modifiers changed from: private */
    public zzgso(zzgpe zzgpeVar, zzgpe zzgpeVar2) {
        this.zzd = zzgpeVar;
        this.zze = zzgpeVar2;
        int zzd = zzgpeVar.zzd();
        this.zzf = zzd;
        this.zzc = zzd + zzgpeVar2.zzd();
        this.zzg = Math.max(zzgpeVar.zzf(), zzgpeVar2.zzf()) + 1;
    }

    public static zzgpe zzG(zzgpe zzgpeVar, zzgpe zzgpeVar2) {
        if (zzgpeVar2.zzd() == 0) {
            return zzgpeVar;
        }
        if (zzgpeVar.zzd() == 0) {
            return zzgpeVar2;
        }
        int zzd = zzgpeVar.zzd() + zzgpeVar2.zzd();
        if (zzd < 128) {
            return zzH(zzgpeVar, zzgpeVar2);
        }
        if (zzgpeVar instanceof zzgso) {
            zzgso zzgsoVar = (zzgso) zzgpeVar;
            if (zzgsoVar.zze.zzd() + zzgpeVar2.zzd() < 128) {
                return new zzgso(zzgsoVar.zzd, zzH(zzgsoVar.zze, zzgpeVar2));
            } else if (zzgsoVar.zzd.zzf() > zzgsoVar.zze.zzf() && zzgsoVar.zzg > zzgpeVar2.zzf()) {
                return new zzgso(zzgsoVar.zzd, new zzgso(zzgsoVar.zze, zzgpeVar2));
            }
        }
        if (zzd >= zzc(Math.max(zzgpeVar.zzf(), zzgpeVar2.zzf()) + 1)) {
            return new zzgso(zzgpeVar, zzgpeVar2);
        }
        return zzgsk.zza(new zzgsk(null), zzgpeVar, zzgpeVar2);
    }

    private static zzgpe zzH(zzgpe zzgpeVar, zzgpe zzgpeVar2) {
        int zzd = zzgpeVar.zzd();
        int zzd2 = zzgpeVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzgpeVar.zzC(bArr, 0, 0, zzd);
        zzgpeVar2.zzC(bArr, 0, zzd, zzd2);
        return new zzgpa(bArr);
    }

    public static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final boolean equals(Object obj) {
        boolean zzg;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgpe)) {
            return false;
        }
        zzgpe zzgpeVar = (zzgpe) obj;
        if (this.zzc != zzgpeVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgpeVar.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzgsm zzgsmVar = new zzgsm(this, null);
        zzgoz next = zzgsmVar.next();
        zzgsm zzgsmVar2 = new zzgsm(zzgpeVar, null);
        zzgoz next2 = zzgsmVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int zzd = next.zzd() - i;
            int zzd2 = next2.zzd() - i2;
            int min = Math.min(zzd, zzd2);
            if (i == 0) {
                zzg = next.zzg(next2, i2, min);
            } else {
                zzg = next2.zzg(next, i, min);
            }
            if (!zzg) {
                return false;
            }
            i3 += min;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzgsmVar.next();
                i = 0;
            } else {
                i += min;
            }
            if (min == zzd2) {
                next2 = zzgsmVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgpe, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgsi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final byte zza(int i) {
        zzB(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final byte zzb(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zzb(i) : this.zze.zzb(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            this.zzd.zze(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.zze.zze(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.zzd.zze(bArr, i, i2, i6);
            this.zze.zze(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final int zzi(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzi(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzi(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzi(this.zzd.zzi(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final int zzj(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzj(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzj(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzj(this.zzd.zzj(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final zzgpe zzk(int i, int i2) {
        int zzq = zzq(i, i2, this.zzc);
        if (zzq == 0) {
            return zzgpe.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.zzk(i, i2);
        }
        if (i >= i3) {
            return this.zze.zzk(i - i3, i2 - i3);
        }
        zzgpe zzgpeVar = this.zzd;
        return new zzgso(zzgpeVar.zzk(i, zzgpeVar.zzd()), this.zze.zzk(0, i2 - this.zzf));
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final zzgpm zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        zzgsm zzgsmVar = new zzgsm(this, null);
        while (zzgsmVar.hasNext()) {
            arrayList.add(zzgsmVar.next().zzn());
        }
        int i = zzgpm.zzd;
        boolean z = false;
        int i2 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z |= true;
            } else {
                z = byteBuffer.isDirect() ? z | true : z | true;
            }
        }
        if (z) {
            return new zzgpi(arrayList, i2, true, null);
        }
        return zzgpm.zzH(new zzgqz(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    protected final String zzm(Charset charset) {
        return new String(zzE(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzo(zzgot zzgotVar) throws IOException {
        this.zzd.zzo(zzgotVar);
        this.zze.zzo(zzgotVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final boolean zzp() {
        int zzj = this.zzd.zzj(0, 0, this.zzf);
        zzgpe zzgpeVar = this.zze;
        return zzgpeVar.zzj(zzj, 0, zzgpeVar.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final zzgoy zzs() {
        return new zzgsi(this);
    }
}
