package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Iy */
/* loaded from: assets/audience_network.dex */
public final class C0529Iy implements NativeAdImageApi {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final String A02;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{85, 88, 84, 90, 85, airhockey.P_GAME_REMATCH, 92, 91, airhockey.P_GAME_STANDBY, 12, 18, 31, 15, 19};
    }

    public C0529Iy(String str, int i, int i2) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    @Nullable
    public static C0529Iy A00(@Nullable JSONObject jSONObject) {
        String optString;
        if (jSONObject == null || (optString = jSONObject.optString(A01(6, 3, 51))) == null) {
            return null;
        }
        return new C0529Iy(optString, jSONObject.optInt(A01(9, 5, 97), 0), jSONObject.optInt(A01(0, 6, 39), 0));
    }

    @Override // com.facebook.ads.internal.api.NativeAdImageApi
    public final int getHeight() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.NativeAdImageApi
    public final String getUrl() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.NativeAdImageApi
    public final int getWidth() {
        return this.A01;
    }
}
