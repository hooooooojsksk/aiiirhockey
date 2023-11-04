package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaju {
    public static X509Certificate[][] zza(String str) throws zzajr, SecurityException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair zzc = zzajv.zzc(randomAccessFile);
            if (zzc != null) {
                ByteBuffer byteBuffer = (ByteBuffer) zzc.first;
                long longValue = ((Long) zzc.second).longValue();
                long j = (-20) + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new zzajr("ZIP64 APK not supported");
                    }
                }
                long zza = zzajv.zza(byteBuffer);
                if (zza >= longValue) {
                    throw new zzajr("ZIP Central Directory offset out of range: " + zza + ". ZIP End of Central Directory offset: " + longValue);
                } else if (zzajv.zzb(byteBuffer) + zza == longValue) {
                    if (zza < 32) {
                        throw new zzajr("APK too small for APK Signing Block. ZIP Central Directory offset: " + zza);
                    }
                    ByteBuffer allocate = ByteBuffer.allocate(24);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    randomAccessFile.seek(zza - allocate.capacity());
                    randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                    int i = 8;
                    if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                        throw new zzajr("No APK Signing Block before ZIP Central Directory");
                    }
                    int i2 = 0;
                    long j2 = allocate.getLong(0);
                    if (j2 < allocate.capacity() || j2 > 2147483639) {
                        throw new zzajr("APK Signing Block size out of range: " + j2);
                    }
                    int i3 = (int) (8 + j2);
                    long j3 = zza - i3;
                    if (j3 < 0) {
                        throw new zzajr("APK Signing Block offset out of range: " + j3);
                    }
                    ByteBuffer allocate2 = ByteBuffer.allocate(i3);
                    allocate2.order(ByteOrder.LITTLE_ENDIAN);
                    randomAccessFile.seek(j3);
                    randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                    long j4 = allocate2.getLong(0);
                    if (j4 != j2) {
                        throw new zzajr("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
                    }
                    Pair create = Pair.create(allocate2, Long.valueOf(j3));
                    ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                    long longValue2 = ((Long) create.second).longValue();
                    if (byteBuffer2.order() == ByteOrder.LITTLE_ENDIAN) {
                        int capacity = byteBuffer2.capacity() - 24;
                        if (capacity < 8) {
                            throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                        }
                        int capacity2 = byteBuffer2.capacity();
                        if (capacity > byteBuffer2.capacity()) {
                            throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                        }
                        int limit = byteBuffer2.limit();
                        int position = byteBuffer2.position();
                        byteBuffer2.position(0);
                        byteBuffer2.limit(capacity);
                        byteBuffer2.position(8);
                        ByteBuffer slice = byteBuffer2.slice();
                        slice.order(byteBuffer2.order());
                        byteBuffer2.position(0);
                        byteBuffer2.limit(limit);
                        byteBuffer2.position(position);
                        while (slice.hasRemaining()) {
                            i2++;
                            if (slice.remaining() >= i) {
                                long j5 = slice.getLong();
                                if (j5 >= 4 && j5 <= 2147483647L) {
                                    int i4 = (int) j5;
                                    int position2 = slice.position() + i4;
                                    if (i4 <= slice.remaining()) {
                                        if (slice.getInt() != 1896449818) {
                                            slice.position(position2);
                                            i = 8;
                                        } else {
                                            X509Certificate[][] zzl = zzl(randomAccessFile.getChannel(), new zzajq(zze(slice, i4 - 4), longValue2, zza, longValue, byteBuffer, null));
                                            randomAccessFile.close();
                                            try {
                                                randomAccessFile.close();
                                            } catch (IOException unused) {
                                            }
                                            return zzl;
                                        }
                                    } else {
                                        throw new zzajr("APK Signing Block entry #" + i2 + " size out of range: " + i4 + ", available: " + slice.remaining());
                                    }
                                } else {
                                    throw new zzajr("APK Signing Block entry #" + i2 + " size out of range: " + j5);
                                }
                            } else {
                                throw new zzajr("Insufficient data to read size of APK Signing Block entry #" + i2);
                            }
                        }
                        throw new zzajr("No APK Signature Scheme v2 block in APK Signing Block");
                    }
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                } else {
                    throw new zzajr("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
            }
            throw new zzajr("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    private static int zzb(int i) {
        if (i != 1) {
            if (i == 2) {
                return 64;
            }
            throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
        }
        return 32;
    }

    private static int zzc(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    private static String zzd(int i) {
        if (i != 1) {
            if (i == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
        }
        return "SHA-256";
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + remaining);
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            int remaining2 = byteBuffer.remaining();
            throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + remaining2);
        }
        return zze(byteBuffer, i);
    }

    private static void zzg(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (!map.isEmpty()) {
            zzajo zzajoVar = new zzajo(fileChannel, 0L, j);
            zzajo zzajoVar2 = new zzajo(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            zzajv.zzd(duplicate, j);
            zzajm zzajmVar = new zzajm(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i = 0;
            for (Integer num : map.keySet()) {
                iArr[i] = num.intValue();
                i++;
            }
            try {
                byte[][] zzk = zzk(iArr, new zzajn[]{zzajoVar, zzajoVar2, zzajmVar});
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = iArr[i2];
                    if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), zzk[i2])) {
                        throw new SecurityException(zzd(i3).concat(" digest of contents did not verify"));
                    }
                }
                return;
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        }
        throw new SecurityException("No digests provided");
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        int remaining = byteBuffer.remaining();
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + remaining);
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x0048, code lost:
        r11 = zzc(r5);
        r12 = zzc(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0050, code lost:
        if (r11 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0052, code lost:
        if (r12 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.cert.X509Certificate[] zzj(java.nio.ByteBuffer r22, java.util.Map r23, java.security.cert.CertificateFactory r24) throws java.lang.SecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaju.zzj(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] zzk(int[] iArr, zzajn[] zzajnVarArr) throws DigestException {
        long j;
        int i;
        int length;
        long j2 = 0;
        int i2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (i3 >= 3) {
                break;
            }
            j3 += (zzajnVarArr[i3].zza() + 1048575) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            i3++;
        }
        if (j3 >= 2097151) {
            throw new DigestException("Too many chunks: " + j3);
        }
        byte[][] bArr = new byte[iArr.length];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i4 >= length) {
                break;
            }
            int i5 = (int) j3;
            byte[] bArr2 = new byte[(zzb(iArr[i4]) * i5) + 5];
            bArr2[0] = 90;
            zzg(i5, bArr2, 1);
            bArr[i4] = bArr2;
            i4++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            String zzd = zzd(iArr[i6]);
            try {
                messageDigestArr[i6] = MessageDigest.getInstance(zzd);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(zzd.concat(" digest not supported"), e);
            }
        }
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i7 < i; i = 3) {
            zzajn zzajnVar = zzajnVarArr[i7];
            long j4 = j2;
            long zza = zzajnVar.zza();
            while (zza > j2) {
                int min = (int) Math.min(zza, j);
                zzg(min, bArr3, 1);
                for (int i9 = 0; i9 < length; i9++) {
                    messageDigestArr[i9].update(bArr3);
                }
                long j5 = j4;
                try {
                    zzajnVar.zzb(messageDigestArr, j5, min);
                    byte[] bArr4 = bArr3;
                    int i10 = 0;
                    while (i10 < iArr.length) {
                        int i11 = iArr[i10];
                        zzajn zzajnVar2 = zzajnVar;
                        byte[] bArr5 = bArr[i10];
                        int zzb = zzb(i11);
                        int i12 = length;
                        MessageDigest messageDigest = messageDigestArr[i10];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int digest = messageDigest.digest(bArr5, (i8 * zzb) + 5, zzb);
                        if (digest != zzb) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                        }
                        i10++;
                        zzajnVar = zzajnVar2;
                        length = i12;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j6 = min;
                    long j7 = j5 + j6;
                    zza -= j6;
                    i8++;
                    j2 = 0;
                    j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    bArr3 = bArr4;
                    j4 = j7;
                    messageDigestArr = messageDigestArr;
                } catch (IOException e2) {
                    throw new DigestException("Failed to digest chunk #" + i8 + " of section #" + i2, e2);
                }
            }
            i2++;
            i7++;
            j2 = 0;
            j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        byte[][] bArr6 = new byte[iArr.length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            byte[] bArr7 = bArr[i13];
            String zzd2 = zzd(i14);
            try {
                bArr6[i13] = MessageDigest.getInstance(zzd2).digest(bArr7);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(zzd2.concat(" digest not supported"), e3);
            }
        }
        return bArr6;
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zzajq zzajqVar) throws SecurityException {
        ByteBuffer byteBuffer;
        long j;
        long j2;
        long j3;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzajqVar.zza;
                ByteBuffer zzf = zzf(byteBuffer);
                int i = 0;
                while (zzf.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzj(zzf(zzf), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException("Failed to parse/verify signer #" + i + " block", e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (!hashMap.isEmpty()) {
                    j = zzajqVar.zzb;
                    j2 = zzajqVar.zzc;
                    j3 = zzajqVar.zzd;
                    byteBuffer2 = zzajqVar.zze;
                    zzh(hashMap, fileChannel, j, j2, j3, byteBuffer2);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                }
                throw new SecurityException("No content digests found");
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}
