package com.google.android.gms.internal.ads;

import kotlin.UByte;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzfpv {
    public static int zza(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x002a, code lost:
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002c, code lost:
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x002e, code lost:
        zze(r12, r1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0032, code lost:
        r13[r5] = (r9 & r11) | (r13[r5] & r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0039, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzb(@javax.annotation.CheckForNull java.lang.Object r9, @javax.annotation.CheckForNull java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, @javax.annotation.CheckForNull java.lang.Object[] r15) {
        /*
            int r0 = com.google.android.gms.internal.ads.zzfqc.zzb(r9)
            r1 = r0 & r11
            int r2 = zzc(r12, r1)
            r3 = -1
            if (r2 == 0) goto L42
            r4 = r11 ^ (-1)
            r0 = r0 & r4
            r5 = -1
        L11:
            int r2 = r2 + r3
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3a
            r7 = r14[r2]
            boolean r7 = com.google.android.gms.internal.ads.zzfnp.zza(r9, r7)
            if (r7 == 0) goto L3a
            if (r15 == 0) goto L2a
            r7 = r15[r2]
            boolean r7 = com.google.android.gms.internal.ads.zzfnp.zza(r10, r7)
            if (r7 == 0) goto L3a
        L2a:
            r9 = r6 & r11
            if (r5 != r3) goto L32
            zze(r12, r1, r9)
            goto L39
        L32:
            r10 = r13[r5]
            r10 = r10 & r4
            r9 = r9 & r11
            r9 = r9 | r10
            r13[r5] = r9
        L39:
            return r2
        L3a:
            r5 = r6 & r11
            if (r5 == 0) goto L42
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        L42:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfpv.zzb(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static int zzc(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & UByte.MAX_VALUE;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    public static Object zzd(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            return i <= 65536 ? new short[i] : new int[i];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i);
    }

    public static void zze(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
