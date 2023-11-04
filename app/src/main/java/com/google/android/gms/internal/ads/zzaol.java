package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaol {
    static boolean zza = false;
    private static MessageDigest zzc;
    private static final Object zzd = new Object();
    private static final Object zze = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static String zza(zzans zzansVar, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] zzg;
        byte[] zzax = zzansVar.zzax();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcO)).booleanValue()) {
            Vector zzb2 = zzb(zzax, 255);
            if (zzb2 == null || zzb2.size() == 0) {
                zzg = zzg(zzf(4096).zzax(), str, true);
            } else {
                zzaoe zza2 = zzaof.zza();
                int size = zzb2.size();
                for (int i = 0; i < size; i++) {
                    zza2.zza(zzgpe.zzv(zzg((byte[]) zzb2.get(i), str, false)));
                }
                zza2.zzb(zzgpe.zzv(zze(zzax)));
                zzg = ((zzaof) zza2.zzal()).zzax();
            }
        } else if (zzaqz.zza == null) {
            throw new GeneralSecurityException();
        } else {
            byte[] zza3 = zzaqz.zza.zza(zzax, str != null ? str.getBytes() : new byte[0]);
            zzaoe zza4 = zzaof.zza();
            zza4.zza(zzgpe.zzv(zza3));
            zza4.zzc(3);
            zzg = ((zzaof) zza4.zzal()).zzax();
        }
        return zzaoh.zza(zzg, true);
    }

    static Vector zzb(byte[] bArr, int i) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i2 = length + 254;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i2 / 255; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void zzd() {
        synchronized (zze) {
            if (!zza) {
                zza = true;
                new Thread(new zzaok(null)).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x001e, code lost:
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.zzaol.zzc.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] zze(byte[] r6) throws java.security.NoSuchAlgorithmException {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzaol.zzd
            monitor-enter(r0)
            zzd()     // Catch: java.lang.Throwable -> L34
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = com.google.android.gms.internal.ads.zzaol.zzb     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            r3 = 2
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            boolean r2 = r2.await(r3, r5)     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            if (r2 != 0) goto L14
            goto L1c
        L14:
            java.security.MessageDigest r2 = com.google.android.gms.internal.ads.zzaol.zzc     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L19
            goto L1c
        L19:
            r1 = r2
            goto L1c
        L1b:
        L1c:
            if (r1 == 0) goto L2c
            r1.reset()     // Catch: java.lang.Throwable -> L34
            r1.update(r6)     // Catch: java.lang.Throwable -> L34
            java.security.MessageDigest r6 = com.google.android.gms.internal.ads.zzaol.zzc     // Catch: java.lang.Throwable -> L34
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return r6
        L2c:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L34
            throw r6     // Catch: java.lang.Throwable -> L34
        L34:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaol.zze(byte[]):byte[]");
    }

    static zzans zzf(int i) {
        zzamv zza2 = zzans.zza();
        zza2.zzD(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        return (zzans) zza2.zzal();
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] array;
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        if (length > i) {
            bArr = zzf(4096).zzax();
        }
        int length2 = bArr.length;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i + 1).put((byte) length2).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i + 1).put((byte) length2).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(256).put(zze(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        zzaom[] zzaomVarArr = new zzapl().zzcG;
        int length3 = zzaomVarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            zzaomVarArr[i2].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzgol(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
