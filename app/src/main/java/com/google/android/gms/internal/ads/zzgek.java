package com.google.android.gms.internal.ads;

import android.os.Build;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import javax.annotation.Nullable;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzgek {
    public static final Charset zza = Charset.forName("UTF-8");

    public static int zza() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & ByteCompanionObject.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE);
        }
        return i;
    }

    public static final zzgoj zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new zzgej("Not a printable ASCII character: " + charAt);
            }
            bArr[i] = (byte) charAt;
        }
        return zzgoj.zzb(bArr);
    }

    @Nullable
    public static Integer zzc() {
        return Integer.valueOf(Build.VERSION.SDK_INT);
    }
}
