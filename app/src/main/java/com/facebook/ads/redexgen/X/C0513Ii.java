package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ii */
/* loaded from: assets/audience_network.dex */
public final class C0513Ii {
    public static byte[] A02;
    public static String[] A03 = {"0EK1zjbC0rvKFRySirHuNeKu7O6M1c2K", "EZ3WTNSY5ayWns4cE", "iOTwBXJJn2mTXQ1MI7WizzznsNyhmcwj", "DnXRTJeCR1MDANpnyW3y9Xegmk", "0BaBrbX1x0DXsftKwoONmcZPElrNX48m", "JdhHjDAP4IE4TNrXk8Fag99Jau", "kO1FJ5pbtA78NTGKnINecVB8MAIDEUuG", "0uD1E8KeZOnBJibGqVh9DEewsO4i87jr"};
    public final InterfaceC0505Ia A00;
    public final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[4].charAt(5) != 'b') {
                throw new RuntimeException();
            }
            A03[4] = "OpSsMbmoyiuJLyOxEkBMoj5ebplLMUgU";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 40);
            i4++;
        }
    }

    public static void A01() {
        A02 = new byte[]{24, 30, 9, 31, 18, 27, 14};
    }

    static {
        A01();
    }

    public C0513Ii(String str, InterfaceC0505Ia interfaceC0505Ia) {
        this.A01 = str;
        this.A00 = interfaceC0505Ia;
    }

    public static void A02(EnumC0512Ih enumC0512Ih, @Nullable Map<String, String> map, String str, InterfaceC0505Ia interfaceC0505Ia) {
        A03(enumC0512Ih.A02(), map, str, interfaceC0505Ia);
    }

    public static void A03(String str, @Nullable Map<String, String> map, String str2, InterfaceC0505Ia interfaceC0505Ia) {
        if (!C0515Ik.A0B(str2, str)) {
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(A00(0, 7, 67), str);
        interfaceC0505Ia.A9F(str2, map);
    }

    public final void A04(EnumC0512Ih enumC0512Ih, @Nullable Map<String, String> data) {
        A05(enumC0512Ih.A02(), data);
    }

    public final void A05(String str, @Nullable Map<String, String> data) {
        A03(str, data, this.A01, this.A00);
    }
}
