package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Uf */
/* loaded from: assets/audience_network.dex */
public class C0815Uf implements InterfaceC0485He<String> {
    public static byte[] A00;
    public static String[] A01 = {"", "vlIuDSzGbyZPSOo9NvS3Fgy2A3aK70Ro", "3dVIdsQUspyQ", "UTSvinwo0cRMStWYFPA8OYJwOxvnVwXs", "RE5EMThjSVpoLeDJX1cgkycsZ0xzbqtm", "RpzVhDU", "goToTGvZMCWAKhVB", "BfTI1em2yqq329uW9D4CSUzGh8lnadBe"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        String[] strArr = A01;
        if (strArr[7].charAt(27) != strArr[3].charAt(27)) {
            throw new RuntimeException();
        }
        A01[6] = "DusCHERYjWvkKwCYEIDEH2";
        A00 = new byte[]{8, 20, 13, 12, ByteCompanionObject.MAX_VALUE, airhockey.J_INVITE, airhockey.J_SAVEDGAME_SAVE, ByteCompanionObject.MAX_VALUE, 119, 102, 123, 119, 44, airhockey.J_ERROR, 119, 119, airhockey.J_GAME_REMATCH, 124, 125};
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0485He
    /* renamed from: A02 */
    public final boolean A5J(String str) {
        String A0M = C0499Hs.A0M(str);
        return (TextUtils.isEmpty(A0M) || (A0M.contains(A00(4, 4, 69)) && !A0M.contains(A00(8, 8, 77))) || A0M.contains(A00(0, 4, 46)) || A0M.contains(A00(16, 3, 95))) ? false : true;
    }
}
