package com.google.android.gms.internal.ads;

import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgnx {
    public static String zza(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            int i = b & UByte.MAX_VALUE;
            sb.append("0123456789abcdef".charAt(i >> 4));
            sb.append("0123456789abcdef".charAt(i & 15));
        }
        return sb.toString();
    }
}
