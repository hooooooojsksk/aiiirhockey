package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdBase;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Is */
/* loaded from: assets/audience_network.dex */
public enum EnumC0523Is {
    A05(0, NativeAdBase.MediaCacheFlag.NONE),
    A04(1, NativeAdBase.MediaCacheFlag.ALL);
    
    public static byte[] A02;
    public final long A00;
    public final NativeAdBase.MediaCacheFlag A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 111);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{airhockey.P_GAME_BREAKBALLCOUNT, 75, 75, 34, 35, 34, 41};
    }

    static {
        A02();
    }

    EnumC0523Is(long j, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = j;
        this.A01 = mediaCacheFlag;
    }

    public static EnumC0523Is A00(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        EnumC0523Is[] values;
        for (EnumC0523Is enumC0523Is : values()) {
            if (enumC0523Is.A01 == mediaCacheFlag) {
                return enumC0523Is;
            }
        }
        return null;
    }
}
