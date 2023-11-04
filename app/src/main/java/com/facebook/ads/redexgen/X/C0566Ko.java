package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ko */
/* loaded from: assets/audience_network.dex */
public final class C0566Ko {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 3);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{58, 43, 43, 55, 50, 56, 58, 47, 50, 52, 53, airhockey.J_DISCONNECT, 43, 63, 61, 119, 123, airhockey.J_GOO, airhockey.J_BACK, 45, 44, 58, 42, 59, 32, 57, 61, 32, 38, 39, 9, 14, 16};
    }

    public static String A01(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(15, 4, 23), i);
            jSONObject.put(A00(19, 11, 74), str);
            JSONObject errorMsgObj = jSONObject.put(A00(30, 3, 127), str2);
            errorMsgObj.toString();
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    @Nullable
    public static String A02(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String A002 = A00(0, 0, 103);
        if (isEmpty) {
            return A002;
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
            return A002;
        }
        String extension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        return extension;
    }

    public static boolean A04(String str) {
        return A00(0, 15, 88).equalsIgnoreCase(A02(str));
    }
}
