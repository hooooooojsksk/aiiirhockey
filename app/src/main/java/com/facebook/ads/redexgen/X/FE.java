package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.drive.DriveFile;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class FE extends AbstractC0982aM {
    public static byte[] A02;
    public static String[] A03 = {"eZwrQOnpnpQE2xbRo0zNjy7tlobdqdqH", "SFt7WwZUn", "NjRPf9lXQVcUlHZaPZ2tHyzwDKEOZm5m", "vsw9aGbGyLBdbL44W3z8tEYPUFR7w9", "bZApvv", "GYK1wV", "jBSwIULngy0dc0IzE6SbgF9ev3BAFzHy", "9HFC3JFq8"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 27;
            String[] strArr = A03;
            if (strArr[6].charAt(23) == strArr[0].charAt(23)) {
                throw new RuntimeException();
            }
            A03[3] = "uqLwDcTKX4SWJds2FMBMp5QNw2MnWtU";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final List<Intent> A05() {
        List<C00860k> A042 = A04();
        ArrayList arrayList = new ArrayList();
        if (A042 != null) {
            for (C00860k c00860k : A042) {
                Intent A00 = A00(c00860k);
                if (A00 != null) {
                    arrayList.add(A00);
                }
            }
        }
        return arrayList;
    }

    public static void A06() {
        A02 = new byte[]{airhockey.J_GAME_EXIT, -105, -105, -108, -105, airhockey.P_GAME_STANDBY, -107, -122, -105, -104, -114, -109, -116, airhockey.P_GAME_STANDBY, -122, -107, -107, -104, -114, -103, -118, -124, -119, -122, -103, -122, -124, -97, -89, -86, -93, -94, 94, -78, -83, 94, -83, -82, -93, -84, 94, -85, -97, -80, -87, -93, -78, 94, -77, -80, -86, airhockey.J_ACHIEVEMENTCALLBACK, 94, -29, -27, -5, 8, -2, 12, 9, 3, -2, -108, -95, -105, -91, -94, -100, -105, airhockey.J_SDKVER, -100, -95, -89, -104, -95, -89, airhockey.J_SDKVER, -108, -106, -89, -100, -94, -95, airhockey.J_SDKVER, 119, 124, airhockey.J_DISCONNECT, ByteCompanionObject.MAX_VALUE, -94, -81, -91, -77, -80, -86, -91, 111, -86, -81, -75, -90, -81, -75, 111, -94, -92, -75, -86, -80, -81, 111, -105, -118, -122, -104, -8, 7, 7, 10, 0, 11, -4, -10, -5, -8, 11, -8, -3, -15, 2, -5, -11, 4, -54, -65, -65, -12, -11, 4, -15, -7, -4, 3, -49, -7, -12, -51, -75, 3, -26, -25, -36, -27, -36, -37, -42, -37, -36, -36, -25, -29, -32, -27, -30, -108, -107, -118, -109, -118, -119, -124, -104, -103, -108, -105, -118, -124, -117, -122, -111, -111, -121, -122, -120, -112, -124, -102, -105, -111, -38, -37, -48, -39, -48, -49, -54, -34, -33, -38, -35, -48, -54, -32, -35, -41, -70, -85, -68, -67, -77, -72, -79, -51, -50, -55, -52, -65, -71, -61, -66, -10, -9, -14, -11, -24, -30, -8, -11, -17, -96, -95, -100, -97, -110, -116, -94, -97, -103, -116, -92, -110, -113, -116, -109, -114, -103, -103, -113, -114, -112, -104, -90, -105, -98, airhockey.J_GAME_DISCONNECT, -72, -87, -80, -76, -74, -77, -79, -76, -72, 126};
    }

    static {
        A06();
        A04 = FE.class.getSimpleName();
    }

    public FE(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, String str, Uri uri, Map<String, String> extraData, @Nullable C00870m c00870m, boolean z) {
        super(c0887Xc, interfaceC0505Ia, str, c00870m, z);
        this.A00 = uri;
        this.A01 = extraData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0048, code lost:
        if (r3.startsWith(r0) != false) goto L16;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.content.Intent A00(com.facebook.ads.redexgen.X.C00860k r10) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.FE.A00(com.facebook.ads.redexgen.X.0k):android.content.Intent");
    }

    private Intent A01(C00860k c00860k) {
        Intent intent = new Intent(A03(88, 26, 38));
        intent.addFlags(DriveFile.MODE_READ_ONLY);
        if (!TextUtils.isEmpty(c00860k.A05()) && !TextUtils.isEmpty(c00860k.A04())) {
            intent.setComponent(new ComponentName(c00860k.A05(), c00860k.A04()));
        }
        if (!TextUtils.isEmpty(c00860k.A03())) {
            intent.setData(KT.A00(c00860k.A03()));
        }
        return intent;
    }

    private final Uri A02() {
        String queryParameter = this.A00.getQueryParameter(A03(219, 9, 104));
        if (!TextUtils.isEmpty(queryParameter)) {
            return KT.A00(queryParameter);
        }
        Uri uri = this.A00;
        String storeUrl = A03(211, 8, 63);
        String storeId = uri.getQueryParameter(storeUrl);
        Locale locale = Locale.US;
        Object[] objArr = {storeId};
        String storeUrl2 = A03(126, 22, 117);
        return KT.A00(String.format(locale, storeUrl2, objArr));
    }

    @Nullable
    private List<C00860k> A04() {
        String queryParameter = this.A00.getQueryParameter(A03(114, 12, 124));
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String appsiteDataString = A03(53, 2, 109);
        if (appsiteDataString.equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(queryParameter);
            String appsiteDataString2 = A03(55, 7, 127);
            JSONArray optJSONArray = jSONObject.optJSONArray(appsiteDataString2);
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C00860k A00 = C00860k.A00(optJSONArray.optJSONObject(i));
                    if (A00 != null) {
                        arrayList.add(A00);
                    }
                }
            }
        } catch (JSONException e) {
            InterfaceC02617r A07 = ((AbstractC00810f) this).A00.A07();
            int i2 = C02627s.A23;
            C02637t c02637t = new C02637t(e);
            String appsiteDataString3 = A03(HttpStatus.SC_NO_CONTENT, 7, 47);
            A07.A9C(appsiteDataString3, i2, c02637t);
            String str = A04;
            String appsiteDataString4 = A03(0, 26, 10);
            Log.w(str, appsiteDataString4, e);
        }
        return arrayList;
    }

    private boolean A07() {
        List<Intent> appLaunchIntents = A05();
        if (appLaunchIntents == null) {
            return false;
        }
        for (Intent intent : appLaunchIntents) {
            if (KG.A0B(((AbstractC00810f) this).A00, intent)) {
                return true;
            }
        }
        return false;
    }

    private boolean A08() throws KE {
        KS ks = new KS();
        try {
            KS.A0A(ks, ((AbstractC00810f) this).A00, A02(), ((AbstractC00810f) this).A02);
            return true;
        } catch (Exception unused) {
            String str = A03(26, 27, 35) + this.A00.toString();
            String queryParameter = this.A00.getQueryParameter(A03(228, 22, 18));
            if (queryParameter != null && queryParameter.length() > 0) {
                KS.A0A(ks, ((AbstractC00810f) this).A00, KT.A00(queryParameter), ((AbstractC00810f) this).A02);
                return false;
            }
            return false;
        }
    }

    public static boolean A09(C0887Xc c0887Xc, String str) {
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            boolean A1Y = IK.A1Y(c0887Xc);
            if (A03[3].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "1LqNNd92i";
            strArr[1] = "QkgxMECyk";
            if (A1Y) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00810f
    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public final EnumC00800e A0A() {
        EnumC00800e enumC00800e = null;
        String A032 = A03(148, 15, 92);
        boolean A0F = A0F(this.A00);
        if (!A0F) {
            A0F = A07();
        }
        if (!A0F) {
            try {
                A032 = A08() ? A03(188, 16, 80) : A03(163, 25, 10);
            } catch (Exception unused) {
                enumC00800e = EnumC00800e.A02;
            }
        }
        this.A01.put(A032, String.valueOf(true));
        return enumC00800e;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0982aM
    public final void A0D() {
        EnumC00800e enumC00800e = null;
        if (((AbstractC0982aM) this).A02) {
            enumC00800e = A0A();
        } else {
            this.A01.put(A03(188, 16, 80), String.valueOf(true));
        }
        Map<String, String> map = this.A01;
        if (A03[3].length() == 13) {
            throw new RuntimeException();
        }
        A03[2] = "sgzsFq3t5RzUzGxHOqvhuB7Tq08HlvIk";
        A0E(map, enumC00800e);
    }
}
