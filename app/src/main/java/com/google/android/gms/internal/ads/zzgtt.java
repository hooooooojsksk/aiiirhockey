package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgtt extends zzgts {
    /* JADX WARN: Code restructure failed: missing block: B:139:0x001c, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0047, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0083, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzgts
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgtt.zza(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final String zzb(byte[] bArr, int i, int i2) throws zzgqy {
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!zzgtr.zzd(b)) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (zzgtr.zzd(b2)) {
                int i6 = i4 + 1;
                cArr[i4] = (char) b2;
                i = i5;
                while (true) {
                    i4 = i6;
                    if (i < i3) {
                        byte b3 = bArr[i];
                        if (zzgtr.zzd(b3)) {
                            i++;
                            i6 = i4 + 1;
                            cArr[i4] = (char) b3;
                        }
                    }
                }
            } else if (zzgtr.zzf(b2)) {
                if (i5 < i3) {
                    zzgtr.zzc(b2, bArr[i5], cArr, i4);
                    i = i5 + 1;
                    i4++;
                } else {
                    throw zzgqy.zzd();
                }
            } else if (zzgtr.zze(b2)) {
                if (i5 < i3 - 1) {
                    int i7 = i5 + 1;
                    zzgtr.zzb(b2, bArr[i5], bArr[i7], cArr, i4);
                    i = i7 + 1;
                    i4++;
                } else {
                    throw zzgqy.zzd();
                }
            } else if (i5 < i3 - 2) {
                int i8 = i5 + 1;
                byte b4 = bArr[i5];
                int i9 = i8 + 1;
                zzgtr.zza(b2, b4, bArr[i8], bArr[i9], cArr, i4);
                i4 += 2;
                i = i9 + 1;
            } else {
                throw zzgqy.zzd();
            }
        }
        return new String(cArr, 0, i4);
    }
}
