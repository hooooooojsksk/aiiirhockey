package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Eu */
/* loaded from: assets/audience_network.dex */
public final class C0427Eu extends AbstractC0952Zs implements Serializable {
    public static byte[] A00 = null;
    public static String[] A01 = {"lNfLNH12lo092G91EOzeY1GmrD7sd3LT", "IfriMLumcJB6cDz8CdV53z8mw", "VqAXCxmiQObdbt99qEtF0Khtp", "Er74lg0w9IOdrBN2LYFe3VajafM65LKV", "PApxnlfYZYjRi2lMOUBi6X3WbwZz37rL", "HRTNeezFOCXWn2GXnxOdBfrunSk2O2aN", "VET24gqvkOE8n1LMNVzexbAvR8qySpIp", "2OknKa0ZFArae7oBhfBaswv35Z02O68Z"};
    public static final long serialVersionUID = 2751287062553772011L;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{123, airhockey.J_GAME_DISCONNECT, 126, airhockey.J_ENEMYLOSE, 123, 109, airhockey.J_GAME_DISCONNECT, 109, 86, ByteCompanionObject.MAX_VALUE, 96, 109, airhockey.J_GAME_DISCONNECT, 102};
    }

    static {
        A04();
    }

    public C0427Eu(List<C1C> list) {
        super(list);
    }

    public static C0427Eu A02(JSONObject jSONObject, C0887Xc c0887Xc) {
        C0427Eu c0427Eu = new C0427Eu(AbstractC0952Zs.A07(jSONObject, c0887Xc, new C0947Zn()));
        c0427Eu.A0q(jSONObject);
        c0427Eu.A0S(A03(0, 14, 8));
        return c0427Eu;
    }

    @Override // com.facebook.ads.redexgen.X.C1B
    public final int A0C() {
        if (!A0Y()) {
            if (A0h().A0D().A06() != null) {
                return 1;
            }
            return 0;
        }
        String[] strArr = A01;
        if (strArr[2].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A01[3] = "Avc54I4RohpfVXuEjhFSHVQISVBIYsCd";
        return 3;
    }

    @Override // com.facebook.ads.redexgen.X.C1B
    public final int A0D() {
        return A0h().A0D().A04();
    }
}
