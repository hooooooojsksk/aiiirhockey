package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public enum JF {
    A07(0),
    A0F(4),
    A0D(5),
    A0E(6),
    A0C(7),
    A0I(100),
    A0G(101),
    A0J(102),
    A0H(103),
    A05(200),
    A04(HttpStatus.SC_INTERNAL_SERVER_ERROR),
    A09(800),
    A08(801),
    A0A(802),
    A0B(803),
    A03(HttpStatus.SC_CREATED),
    A06(HttpStatus.SC_BAD_REQUEST);
    
    public static byte[] A01;
    public final int A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-104, -117, -98, -109, -96, -113, -87, 124, ByteCompanionObject.MAX_VALUE, airhockey.J_PURCHASE, -55, -68, -49, -60, -47, -64, -38, -67, -68, -55, -55, -64, -51, -92, -105, -86, -97, -84, -101, -75, -85, -92, -95, -92, -91, -83, -92, -45, -58, -40, -62, -45, -59, -58, -59, -32, -41, -54, -59, -58, -48, -52, -59, -62, -59, -58, -50, -59, -61, -65, -52, -69, -82, -63, -74, -61, -78, -52, -71, -82, -69, -79, -64, -80, -82, -67, -78, -52, -98, -93, -52, -90, -54, -58, -45, -62, -75, -56, -67, -54, -71, -45, -60, -61, -58, -56, -58, -75, -67, -56, -45, -83, -45, -91, -86, -25, -29, -16, -33, -46, -27, -38, -25, -42, -16, -28, -30, -26, -46, -29, -42, -16, -62, -16, -62, -51, -55, -42, -55, -68, -50, -72, -55, -69, -68, -69, -42, -51, -64, -69, -68, -58, -19, -37, -40, -20, -33, -37, -19, -11, -40, -41, -28, -28, -37, -24, -11, -56, -53, -58, -85, -103, -106, -86, -99, -103, -85, -77, -106, -107, -94, -94, -103, -90, -77, -119, -124, -69, -87, -90, -70, -83, -87, -69, -61, -90, -91, -78, -78, -87, -74, -61, -99, -108, -80, -98, -101, -81, -94, -98, -80, -72, -101, -102, -89, -89, -98, -85, -72, -91, -98, -96, -102, -100, -78, -109, -127, 126, -110, -123, -127, -109, -101, -123, -118, -112, -127, -114, -113, -112, -123, -112, -123, 125, -120, -101, -124, -117, -114, -123, -106, -117, -118, -112, 125, -120, -28, -46, -49, -29, -42, -46, -28, -20, -42, -37, -31, -46, -33, -32, -31, -42, -31, -42, -50, -39, -20, -31, -50, -49, -39, -46, -31, -96, -114, -117, -97, -110, -114, -96, -88, -110, -105, -99, -114, -101, -100, -99, -110, -99, -110, -118, -107, -88, -98, -105, -108, -105, -104, -96, -105, -59, -77, -80, -60, -73, -77, -59, -51, -73, -68, -62, -77, -64, -63, -62, -73, -62, -73, -81, -70, -51, -60, -77, -64, -62, -73, -79, -81, -70};
    }

    static {
        A02();
    }

    JF(int i) {
        this.A00 = i;
    }

    @Nullable
    public static JF A00(int i) {
        JF[] values;
        for (JF jf : values()) {
            if (jf.A00 == i) {
                return jf;
            }
        }
        return null;
    }

    public final int A03() {
        return this.A00;
    }

    public final AdPlacementType A04() {
        switch (this) {
            case A05:
            case A09:
            case A08:
            case A0A:
                return AdPlacementType.NATIVE;
            case A0D:
            case A0E:
            case A0F:
            case A0C:
                return AdPlacementType.BANNER;
            case A0G:
            case A0J:
            case A0H:
            case A0I:
                return AdPlacementType.INTERSTITIAL;
            case A06:
            case A0B:
                return AdPlacementType.REWARDED_VIDEO;
            default:
                return AdPlacementType.UNKNOWN;
        }
    }
}
