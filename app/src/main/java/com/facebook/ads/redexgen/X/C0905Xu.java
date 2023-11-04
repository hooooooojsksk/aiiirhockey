package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Xu */
/* loaded from: assets/audience_network.dex */
public class C0905Xu extends K1 {
    public static byte[] A01;
    public final /* synthetic */ C02145m A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{62, 44, 44, 58, 43, 44};
    }

    public C0905Xu(C02145m c02145m) {
        this.A00 = c02145m;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        Handler handler;
        JSONObject jSONObject;
        C6M c6m;
        String str;
        String str2;
        try {
            jSONObject = this.A00.A05;
            JSONArray jSONArray = jSONObject.getJSONArray(A00(0, 6, 77));
            for (int i = 0; i < jSONArray.length(); i++) {
                C02125k assetData = C02125k.A00(jSONArray.getJSONObject(i));
                this.A00.A09(assetData.A04, assetData);
            }
            c6m = this.A00.A02;
            C0907Xw c0907Xw = new C0907Xw(this);
            str = this.A00.A04;
            str2 = this.A00.A03;
            c6m.A0W(c0907Xw, new C6F(str, str2));
        } catch (JSONException unused) {
            handler = this.A00.A00;
            handler.post(new C0906Xv(this));
        }
    }
}
