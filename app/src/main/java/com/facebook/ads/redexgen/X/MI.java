package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.NativeAdLayout;

/* loaded from: assets/audience_network.dex */
public final class MI {
    public static String[] A00 = {"Mh7OQPY25mJ4xZdJdnJU4lIWxnSb2W80", "uMvQGqYS2R9kLiwAhxbB5gyg9uPLoFmG", "JD8RnvPxGeaTxsc34jN0O6vhnDfoaLvm", "v", "yiVoJ6", "bh6EDcFJy1WMlrC6ew5uNV", "HsXTYL", "k"};
    public static final int A01 = (int) (Kk.A02 * 200.0f);
    public static final int A03 = (int) (Kk.A02 * 200.0f);
    public static final int A02 = (int) (Kk.A02 * 50.0f);

    public static AnonymousClass10 A00(@Nullable NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return AnonymousClass10.A05;
        }
        if (A03(nativeAdLayout)) {
            return AnonymousClass10.A06;
        }
        return AnonymousClass10.A04;
    }

    @Nullable
    public static MH A01(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, String str, @Nullable NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return null;
        }
        int h = nativeAdLayout.getWidth();
        int w = nativeAdLayout.getHeight();
        int i = A01;
        if (h >= i && w >= i) {
            return new C0777Ss(c0887Xc, interfaceC0505Ia, str);
        }
        if (h < A03 || w < A02) {
            return null;
        }
        return new C0778St(c0887Xc, interfaceC0505Ia, str);
    }

    public static MH A02(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, String str, C1V c1v, InterfaceC0588Lk interfaceC0588Lk, InterfaceC0587Lj interfaceC0587Lj) {
        return new C0779Su(c0887Xc, interfaceC0505Ia, str, c1v, interfaceC0588Lk, interfaceC0587Lj);
    }

    public static boolean A03(NativeAdLayout nativeAdLayout) {
        int h = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int w = A01;
        if (h < w || height < w) {
            if (h >= A03) {
                int i = A02;
                if (A00[5].length() != 22) {
                    throw new RuntimeException();
                }
                A00[5] = "hhrIY4o6fKEkU42z4UVpb3";
                if (height < i) {
                }
            }
            return true;
        }
        return false;
    }
}
