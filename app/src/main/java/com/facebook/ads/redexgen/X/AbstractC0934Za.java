package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONArray;
import org.json.JSONObject;

@SuppressLint({"HardcodedIPAddressUse"})
/* renamed from: com.facebook.ads.redexgen.X.Za */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0934Za implements Jc {
    public static byte[] A0D;
    public static String[] A0E = {"4yJhIog9RzpC9w4XHjq79o6hmz2pMXrt", "bLneqHgNlbzxjE", "P7gevZ65hMGDm5VmgpkLcWEi46YxYduR", "Pajg2XTKXpS0pN0AoGLcPnQoa2IWF6Z7", "YyJRdl3XxpBTstTmsw", "OvgbPt0JG7dlaj99kqPbJKVmb9CPKTVr", "21VbiQWRKHmC0d4xB3zoTsbqXtN2ZOxw", "Q3Y9mBD7X4l0uaedlY7FP5X0xCsXbtIX"};
    public static final Handler A0F;
    public static final C00930s A0G = null;
    @SuppressLint({"StaticFieldLeak"})
    public static final C0533Jd A0H = null;
    public static final String A0I;
    @Nullable
    public InterfaceC00880n A00;
    @Nullable
    public InterfaceC00880n A01;
    @Nullable
    public C8A A04;
    @Nullable
    public C0531Ja A05;
    @Nullable
    public AbstractC00890o A06;
    public final C01161p A07;
    public final InterfaceC0505Ia A08;
    public final C00930s A09;
    public final C0533Jd A0A;
    public final C0887Xc A0B;
    public volatile boolean A0C;
    public long A03 = -1;
    @Nullable
    public String A02 = null;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{75, airhockey.J_INVITE, airhockey.J_GAME_ENEMYEXIT, airhockey.J_PURCHASE, 126, 111, airhockey.J_ACHIEVEMENTCALLBACK, 42, airhockey.J_INVITE, airhockey.J_GAME_STANDBY, 111, airhockey.J_WAIT, 42, airhockey.J_ONREWARDED, airhockey.J_GAME_STANDBY, 126, 42, 111, airhockey.J_SAVEDGAME_RELOAD, 99, airhockey.J_WAIT, 126, 78, airhockey.J_GAME_ENEMYEXIT, airhockey.J_INVITE, ByteCompanionObject.MAX_VALUE, 123, airhockey.J_GAME_EXIT, 125, 47, 102, 124, 47, airhockey.J_SDKVER, airhockey.J_PURCHASE, 99, 99, 47, 39, airhockey.J_GAME_DISCONNECT, airhockey.J_ENEMYWIN, airhockey.J_INVITE, 102, airhockey.J_SDKVER, 47, airhockey.J_SDKVER, 96, 123, 47, 99, 96, airhockey.J_INVITE, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, 38, 57, 28, 25, 8, 12, 29, 10, 88, 17, 11, 88, 22, 13, 20, 20, 88, 80, 27, 16, 25, 17, 22, 29, 28, 81, 45, 8, 13, 28, 24, 9, 30, 76, 5, 31, 76, 2, 25, 0, 0, 76, airhockey.P_GAME_SELECTMAP, 2, 3, 76, 15, 4, 13, 5, 2, airhockey.P_GAME_STANDBY, 78, airhockey.J_GAME_ENEMYEXIT, airhockey.J_INVITE, ByteCompanionObject.MAX_VALUE, 123, airhockey.J_GAME_EXIT, 125, 47, 102, 124, 47, airhockey.J_SDKVER, airhockey.J_PURCHASE, 99, 99, 47, 96, airhockey.J_SDKVER, 47, 124, 123, airhockey.J_INVITE, 125, 123, 78, airhockey.J_GAME_ENEMYEXIT, 5, 36, airhockey.J_GAME_ENEMYEXIT, 38, 36, 57, 46, airhockey.J_GAME_ENEMYEXIT, 42, 47, airhockey.J_GAME_ENEMYEXIT, 40, 42, 37, 47, 34, 47, 42, 63, 46, 56, airhockey.J_GAME_STANDBY, airhockey.J_PURCHASE, 95, airhockey.P_NATION, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_EXIT, 13, 76, airhockey.P_GAME_REMATCH, 76, 93, 89, airhockey.P_GAME_MYLOSE, 95, 13, 89, 84, 93, airhockey.P_GAME_MYLOSE, 3, 46, 43, 111, 46, 35, 61, 42, 46, 43, 54, 111, 60, 59, 46, 61, 59, 42, 43, 94, 91, 76, 52, 37, 60, 26, 17, 24, 16, 23, 38, 9, 24, 11, 24, 20, 10, 76, 91, airhockey.P_GAME_EXIT, 79, 90, 79, airhockey.J_SDKVER, 76, airhockey.P_GAME_SELECTMAP, 75, 77, 90, 14, airhockey.P_GAME_MYWIN, 93, 14, 64, 91, airhockey.P_NATION, airhockey.P_NATION, 38, 45, 32, 49, 58, 51, 55, 38, 39, 28, 42, 39, airhockey.J_PURCHASE, airhockey.J_BACK, airhockey.J_GAME_REMATCH, airhockey.J_REWARD, 109, airhockey.J_GOO, airhockey.J_BACK, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_PURCHASE, airhockey.J_BACK, airhockey.J_GAME_ENEMYEXIT, 63, airhockey.J_REWARD, airhockey.J_GAME_DISCONNECT, 63, airhockey.J_PURCHASE, airhockey.J_SAVEDGAME_RELOAD, 111, airhockey.J_GAME_ENEMYEXIT, 102, 38, 50, 37, 49, 53, 37, 46, 35, 57, 31, 35, 33, 48, 48, 41, 46, 39, 28, 27, 3, 20, 25, 28, 17, 85, 5, 25, 20, 22, 16, 24, 16, 27, 1, 85, 28, 27, 85, 7, 16, 6, 5, 26, 27, 6, 16, 10, 9, 7, 2, 57, 18, 15, 11, 3, 57, 11, 21, 44, 59, 47, 43, 59, 45, 42, 1, 55, 58};
    }

    public abstract void A0L();

    public abstract void A0N(InterfaceC00880n interfaceC00880n, C8A c8a, AnonymousClass88 anonymousClass88, C01171q c01171q);

    static {
        A07();
        LN.A02();
        A0I = AbstractC0934Za.class.getSimpleName();
        A0F = new Handler(Looper.getMainLooper());
    }

    public AbstractC0934Za(C0887Xc c0887Xc, C01161p c01161p) {
        this.A0B = c0887Xc;
        this.A07 = c01161p;
        C0533Jd c0533Jd = A0H;
        if (c0533Jd != null) {
            this.A0A = c0533Jd;
        } else {
            this.A0A = new C0533Jd(this.A0B);
        }
        this.A0A.A0P(this);
        C00930s c00930s = A0G;
        if (c00930s != null) {
            this.A09 = c00930s;
        } else {
            this.A09 = new C00930s();
        }
        DynamicLoaderFactory.makeLoader(this.A0B).getInitApi().onAdLoadInvoked(this.A0B);
        this.A08 = c0887Xc.A09();
        this.A0B.A0E().A4a();
    }

    @SuppressLint({"CatchGeneralException"})
    private void A08(C0787Tc c0787Tc) {
        C8A placement = c0787Tc.A00();
        if (placement == null || placement.A05() == null) {
            String A06 = A06(279, 29, 125);
            JA error = new JA(AdErrorType.NO_AD_PLACEMENT, A06);
            this.A0B.A0E().A4c(error.A03().getErrorCode(), A06);
            AbstractC00890o abstractC00890o = this.A06;
            if (abstractC00890o != null) {
                abstractC00890o.A0G(error);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        C8A c8a = this.A04;
        JSONObject A09 = c8a.A09();
        String A062 = A06(195, 3, 93);
        if (A09 == null) {
            AnonymousClass88 A04 = c8a.A04();
            if (!A0C(c8a, A04)) {
                return;
            }
            if (this.A00 == null) {
                this.A0B.A07().A9C(A062, C02627s.A0a, new C02637t(A06(81, 26, 100), A04.A02()));
                AAv(JA.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            C01171q loadConfig = new C01171q(A04.A04(), c8a.A05(), this.A07.A09, c8a.A05().A0C());
            A0N(this.A00, c8a, A04, loadConfig);
            return;
        }
        ArrayList<AnonymousClass88> arrayList = new ArrayList();
        AnonymousClass88 A042 = c8a.A04();
        do {
            if (arrayList.isEmpty()) {
                if (A0C(c8a, A042)) {
                    arrayList.add(A042);
                } else {
                    return;
                }
            } else if (A0B(A042)) {
                arrayList.add(A042);
            }
            A042 = c8a.A04();
        } while (A042 != null);
        if (this.A00 == null) {
            this.A0B.A07().A9C(A062, C02627s.A0a, new C02637t(A06(56, 25, 112), ((AnonymousClass88) arrayList.get(0)).A02()));
            AAv(JA.A00(AdErrorType.INTERNAL_ERROR));
            return;
        }
        boolean z = false;
        try {
            if (arrayList.size() > 1 && this.A00.AFX()) {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                for (AnonymousClass88 anonymousClass88 : arrayList) {
                    jSONArray.put(anonymousClass88.A04());
                }
                jSONObject.put(A06(192, 3, 55), jSONArray);
                jSONObject.put(A06(198, 12, 113), c8a.A09());
                C01171q loadConfig2 = new C01171q(jSONObject, c8a.A05(), this.A07.A09, c8a.A05().A0C());
                A0N(this.A00, c8a, A042, loadConfig2);
                z = true;
            }
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            if (arrayList.isEmpty()) {
                JA A01 = JA.A01(AdErrorType.NO_FILL, A06(0, 0, 73));
                this.A0B.A0E().A4c(A01.A03().getErrorCode(), A06(133, 22, 67));
                AbstractC00890o abstractC00890o2 = this.A06;
                if (abstractC00890o2 != null) {
                    abstractC00890o2.A0G(A01);
                    return;
                }
                return;
            }
            InterfaceC00880n interfaceC00880n = this.A00;
            String[] strArr = A0E;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[0] = "F2ixlBYVHNYJB4bAHADqJrSynawwg1yM";
            strArr2[5] = "djkwyiiWLTaQwWMcVWQWfq0o8Ww2Jgo9";
            if (interfaceC00880n == null) {
                this.A0B.A07().A9C(A062, C02627s.A0a, new C02637t(A06(22, 34, 7), ((AnonymousClass88) arrayList.get(0)).A02()));
                AAv(JA.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            AnonymousClass88 anonymousClass882 = (AnonymousClass88) arrayList.get(0);
            A0N(this.A00, c8a, anonymousClass882, new C01171q(anonymousClass882.A04(), c8a.A05(), this.A07.A09, c8a.A05().A0C()));
        }
    }

    private final void A09(@Nullable String str, @Nullable AdExperienceType adExperienceType) {
        this.A0B.A0E().A4d(str != null);
        this.A03 = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT < 17) {
            AAv(new JA(AdErrorType.API_NOT_SUPPORTED, A06(0, 0, 73)));
            return;
        }
        try {
            this.A05 = this.A07.A01(this.A0B, new JK(this.A0B, str, this.A07.A09, this.A07.A08), adExperienceType);
            if (A0E[6].charAt(21) == '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[4] = "3q2wB1pMY3UXfOrLgu";
            strArr[1] = "CsXqAZILgfX2KA";
            this.A0A.A0O(this.A05);
        } catch (JB e) {
            AAv(JA.A02(e));
        }
    }

    private void A0A(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A06(230, 12, 75));
            C00950u.A01(this.A0B).A0O(jSONObject);
        }
    }

    private boolean A0B(AnonymousClass88 anonymousClass88) {
        return (anonymousClass88 == null || anonymousClass88.A04() == null) ? false : true;
    }

    private boolean A0C(C8A c8a, AnonymousClass88 anonymousClass88) {
        String A06 = A06(0, 0, 73);
        if (anonymousClass88 == null) {
            JA A01 = JA.A01(AdErrorType.NO_FILL, A06);
            this.A0B.A0E().A4c(A01.A03().getErrorCode(), A06(133, 22, 67));
            AbstractC00890o abstractC00890o = this.A06;
            if (abstractC00890o != null) {
                abstractC00890o.A0G(A01);
            }
            return false;
        }
        String A02 = anonymousClass88.A02();
        InterfaceC00880n A00 = this.A09.A00(this.A0B, c8a.A05().A0D());
        if (A00 == null) {
            this.A0B.A07().A9C(A06(195, 3, 93), C02627s.A0a, new C02637t(A06(0, 22, 2), A02));
            AAv(JA.A00(AdErrorType.INTERNAL_ERROR));
            return false;
        } else if (this.A07.A00() != A00.A7L()) {
            JA A012 = JA.A01(AdErrorType.INTERNAL_ERROR, A06);
            this.A0B.A0E().A4c(A012.A03().getErrorCode(), A06(155, 19, 37));
            AbstractC00890o abstractC00890o2 = this.A06;
            if (abstractC00890o2 != null) {
                abstractC00890o2.A0G(A012);
            }
            return false;
        } else {
            this.A00 = A00;
            String[] strArr = A0E;
            if (strArr[4].length() != strArr[1].length()) {
                String[] strArr2 = A0E;
                strArr2[0] = "MKxF4EMWgzzLH5X7HNcHVA2i4zdAiZz9";
                strArr2[5] = "4tfdEW2uI31voJBW941pIR5b1aNGKiQe";
                JSONObject A04 = anonymousClass88.A04();
                if (A04 != null) {
                    String optString = A04.optString(A06(320, 10, 86));
                    this.A0B.A0E().AF7(optString);
                    this.A0B.A0C(optString);
                    C0886Xb A002 = C7M.A00();
                    if (A002 != null) {
                        A002.A0C(optString);
                    }
                    JSONObject dataObject = A04.optJSONObject(A06(262, 17, 72));
                    A0A(dataObject);
                    if (this.A05 == null) {
                        String A062 = A06(242, 20, 23);
                        JA A013 = JA.A01(AdErrorType.UNKNOWN_ERROR, A062);
                        this.A0B.A0E().A4c(A013.A03().getErrorCode(), A062);
                        AbstractC00890o abstractC00890o3 = this.A06;
                        if (abstractC00890o3 != null) {
                            abstractC00890o3.A0G(A013);
                        }
                        return false;
                    }
                    return true;
                }
                String A063 = A06(212, 18, 38);
                JA A014 = JA.A01(AdErrorType.UNKNOWN_ERROR, A063);
                this.A0B.A0E().A4c(A014.A03().getErrorCode(), A063);
                AbstractC00890o abstractC00890o4 = this.A06;
                if (abstractC00890o4 != null) {
                    abstractC00890o4.A0G(A014);
                }
                return false;
            }
            throw new RuntimeException();
        }
    }

    public final long A0D() {
        C8A c8a = this.A04;
        if (c8a != null) {
            return c8a.A03();
        }
        return -1L;
    }

    public final Handler A0E() {
        return A0F;
    }

    public C1B A0F() {
        return ((AbstractC0956Zw) this.A01).A0H();
    }

    @Nullable
    public final C8B A0G() {
        C8A c8a = this.A04;
        if (c8a == null) {
            return null;
        }
        return c8a.A05();
    }

    public final void A0H() {
        String A6B;
        this.A0B.A0E().A2f(LC.A01(this.A03));
        InterfaceC00880n interfaceC00880n = this.A01;
        if (interfaceC00880n == null || (A6B = interfaceC00880n.A6B()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String A04 = LC.A04(this.A03);
        String clientToken = A06(308, 12, 110);
        hashMap.put(clientToken, A04);
        new C0513Ii(A6B, this.A08).A04(EnumC0512Ih.A08, hashMap);
    }

    public final void A0I() {
        InterfaceC00880n interfaceC00880n = this.A01;
        String A06 = A06(195, 3, 93);
        if (interfaceC00880n == null) {
            String A062 = A06(107, 26, 7);
            this.A0B.A07().A9C(A06, C02627s.A0Q, new C02637t(A062));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0E().A4c(adErrorType.getErrorCode(), A062);
            AbstractC00890o abstractC00890o = this.A06;
            if (abstractC00890o != null) {
                String errorMessage = adErrorType.getDefaultErrorMessage();
                abstractC00890o.A0G(JA.A01(adErrorType, errorMessage));
            }
            this.A0B.A0E().A4f();
        } else if (this.A0C) {
            String A063 = A06(174, 18, 71);
            this.A0B.A07().A9C(A06, C02627s.A0M, new C02637t(A063));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0E().A4c(adErrorType2.getErrorCode(), A063);
            AbstractC00890o abstractC00890o2 = this.A06;
            if (abstractC00890o2 != null) {
                String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                abstractC00890o2.A0G(JA.A01(adErrorType2, errorMessage2));
            }
            this.A0B.A0E().A4e();
        } else {
            if (!TextUtils.isEmpty(this.A01.A6B())) {
                this.A08.A9W(this.A01.A6B());
            }
            this.A0B.A0E().A4g();
            this.A0C = true;
            A0L();
        }
    }

    public final void A0J() {
        A0T(false);
    }

    public final void A0K() {
        if (this.A02 != null) {
            C00950u.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0M(@Nullable InterfaceC00880n interfaceC00880n) {
        if (interfaceC00880n != null) {
            interfaceC00880n.onDestroy();
        }
    }

    public final void A0O(AbstractC00890o abstractC00890o) {
        this.A06 = abstractC00890o;
    }

    public final void A0P(C01171q c01171q) {
        this.A0B.A0E().A4Z();
        String clientToken = c01171q.A03().optString(A06(210, 2, 39));
        if (!TextUtils.isEmpty(clientToken)) {
            C0513Ii funnelLoggingHandler = new C0513Ii(clientToken, this.A08);
            funnelLoggingHandler.A04(EnumC0512Ih.A04, null);
        }
    }

    public void A0Q(@Nullable String str) {
        A09(str, null);
    }

    public final void A0R(@Nullable String str) {
        A0Q(str);
    }

    public final void A0S(@Nullable String str, @Nullable AdExperienceType adExperienceType) {
        A09(str, adExperienceType);
    }

    public void A0T(boolean z) {
        if (!z && !this.A0C) {
            return;
        }
        this.A0B.A0E().A4h();
        A0M(this.A01);
        this.A0C = false;
    }

    public final boolean A0U() {
        C8A c8a = this.A04;
        return c8a == null || c8a.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.Jc
    public final synchronized void AAv(JA ja) {
        A0E().post(new C0935Zb(this, ja));
    }

    @Override // com.facebook.ads.redexgen.X.Jc
    @SuppressLint({"CatchGeneralException"})
    public final synchronized void ACh(C0787Tc c0787Tc) {
        try {
            A08(c0787Tc);
        } catch (Exception e) {
            this.A0B.A07().A9C(A06(195, 3, 93), C02627s.A0T, new C02637t(e));
        }
    }
}
