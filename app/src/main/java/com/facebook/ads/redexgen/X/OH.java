package com.facebook.ads.redexgen.X;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class OH extends WebChromeClient {
    public static byte[] A01;
    public final /* synthetic */ OM A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-41, -44, -39, -48, -71, -32, -40, -51, -48, -35, 83, 75, 89, 89, airhockey.P_GAME_MYWIN, 77, 75, airhockey.P_GAME_SELECTMAP, 64, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYSCORE, 52, 54, 26, 53};
    }

    public OH(OM om) {
        this.A00 = om;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C0513Ii c0513Ii;
        O9 o9;
        C0887Xc c0887Xc;
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(10, 7, 123), consoleMessage.message());
                jSONObject.put(A00(0, 10, 0), consoleMessage.lineNumber());
                jSONObject.put(A00(17, 8, 102), consoleMessage.sourceId());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            c0513Ii = this.A00.A0D;
            c0513Ii.A04(EnumC0512Ih.A0N, null);
            o9 = this.A00.A0E;
            o9.A04(C02627s.A14, jSONObject2);
            c0887Xc = this.A00.A0B;
            c0887Xc.A0E().A52(jSONObject2);
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
