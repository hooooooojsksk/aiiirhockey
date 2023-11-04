package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public class zzgpa extends zzgoz {
    protected final byte[] zza;

    public zzgpa(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgpe) && zzd() == ((zzgpe) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zzgpa) {
                zzgpa zzgpaVar = (zzgpa) obj;
                int zzr = zzr();
                int zzr2 = zzgpaVar.zzr();
                if (zzr == 0 || zzr2 == 0 || zzr == zzr2) {
                    return zzg(zzgpaVar, 0, zzd());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgoz
    public final boolean zzg(zzgpe zzgpeVar, int i, int i2) {
        if (i2 > zzgpeVar.zzd()) {
            int zzd = zzd();
            throw new IllegalArgumentException("Length too large: " + i2 + zzd);
        }
        int i3 = i + i2;
        if (i3 > zzgpeVar.zzd()) {
            int zzd2 = zzgpeVar.zzd();
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + zzd2);
        } else if (zzgpeVar instanceof zzgpa) {
            zzgpa zzgpaVar = (zzgpa) zzgpeVar;
            byte[] bArr = this.zza;
            byte[] bArr2 = zzgpaVar.zza;
            int zzc = zzc() + i2;
            int zzc2 = zzc();
            int zzc3 = zzgpaVar.zzc() + i;
            while (zzc2 < zzc) {
                if (bArr[zzc2] != bArr2[zzc3]) {
                    return false;
                }
                zzc2++;
                zzc3++;
            }
            return true;
        } else {
            return zzgpeVar.zzk(i, i3).equals(zzk(0, i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final int zzi(int i, int i2, int i3) {
        return zzgqw.zzd(i, this.zza, zzc() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final int zzj(int i, int i2, int i3) {
        int zzc = zzc() + i2;
        return zzgtv.zzf(i, this.zza, zzc, i3 + zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final zzgpe zzk(int i, int i2) {
        int zzq = zzq(i, i2, zzd());
        return zzq == 0 ? zzgpe.zzb : new zzgox(this.zza, zzc() + i, zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final zzgpm zzl() {
        return zzgpm.zzI(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    protected final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzo(zzgot zzgotVar) throws IOException {
        zzgotVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final boolean zzp() {
        int zzc = zzc();
        return zzgtv.zzj(this.zza, zzc, zzd() + zzc);
    }
}
