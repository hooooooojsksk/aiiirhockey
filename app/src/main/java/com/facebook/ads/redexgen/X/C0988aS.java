package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.aS */
/* loaded from: assets/audience_network.dex */
public class C0988aS implements C0R {
    public static byte[] A07;
    public static String[] A08 = {"nHMpSWMsnsV7ze4k7TMdpo8w7eAhh5yl", "NZIGXtqvLJqJvnsqDFZQPtZx", "Ad1TvQCscaWcF7stMWLl9lRlqQAvL", "Ujq4dS9mEeqxvShJwD8UISSMYbM", "6D9", "oL3lqgBhSNj2gXyheQdgS3kbnnn96fNg", "3X2AVVUyUAfxSvaFg1Rh03BQkiDduKF9", "x5OfLFoNyht1tsSSgvPC5bYcCNR"};
    public final C0986aQ A00;
    public final AtomicReference<String> A05 = new AtomicReference<>();
    public final AtomicReference<String> A04 = new AtomicReference<>();
    public final AtomicReference<String> A03 = new AtomicReference<>();
    public final AtomicReference<EnumC00780c> A06 = new AtomicReference<>();
    public final UUID A01 = UUID.randomUUID();
    public final AtomicInteger A02 = new AtomicInteger(1);

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{5, 22, 13, 13, 6, 15, 60, 109, 126, airhockey.J_GAME_STANDBY, airhockey.J_GAME_STANDBY, airhockey.J_INVITE, airhockey.J_ENEMYWIN, 84, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_INVITE, airhockey.J_PURCHASE};
        String[] strArr = A08;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        A08[2] = "yQ17NavN7ZSoq7zHySEgN4tR7loqT";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final void A03(JSONObject jSONObject) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            try {
                jSONObject.put(A00(7, 10, 84), this.A02.getAndIncrement());
            } catch (Throwable th) {
                if (A08[2].length() != 29) {
                    throw new RuntimeException();
                }
                String[] strArr = A08;
                strArr[7] = "UnqhnC2RP1s6q9DMOMPvS7zFM4J";
                strArr[3] = "fX0qBiaLsOBwY7ffp1ojH1RHxSy";
                C0548Jt.A00(th, this);
                return;
            }
        } catch (JSONException unused) {
        }
        C0X.A0E.A04(this.A01).A02(jSONObject);
        String str = this.A05.get();
        if (!TextUtils.isEmpty(str)) {
            C0X.A0Q.A04(str).A02(jSONObject);
        }
        String str2 = this.A04.get();
        if (!TextUtils.isEmpty(str2)) {
            C0X.A0P.A04(str2).A02(jSONObject);
        }
        String str3 = this.A03.get();
        if (!TextUtils.isEmpty(str3)) {
            C0X.A0O.A04(str3).A02(jSONObject);
        }
        EnumC00780c enumC00780c = this.A06.get();
        if (enumC00780c != null) {
            C0X.A0D.A04(enumC00780c).A02(jSONObject);
        }
    }

    static {
        A01();
    }

    public C0988aS(C0986aQ c0986aQ) {
        this.A00 = c0986aQ;
    }

    private void A02(int i, String str) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(0, 7, 60) + C0X.A0N.getName(), str);
            } catch (JSONException unused) {
            }
            A03(jSONObject);
            this.A00.A00().A9Q(i, jSONObject);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    public final void A04(C0T type, C0W... params) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (C0W c0w : params) {
                c0w.A02(jSONObject);
            }
            A03(jSONObject);
            this.A00.A00().A9E(type, jSONObject);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2R(String str, int reason) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0S, C0X.A0G.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2S(String objectHash) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0T, C0X.A0K.A04(objectHash));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2T(String objectHash) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0U, C0X.A0K.A04(objectHash));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2U(String objectHash) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0V, C0X.A0K.A04(objectHash));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2V(String objectHash) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0W, C0X.A0K.A04(objectHash));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2W(String objectHash) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0X, C0X.A0K.A04(objectHash));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2X(String objectHash) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0Y, C0X.A0K.A04(objectHash));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2Y() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0j, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2Z() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0w, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2a(boolean listenerSet) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0a, C0X.A01.A04(Boolean.valueOf(listenerSet)));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2b(long loadTimeMs, int errorCode, String errorMessage) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0y, C0X.A0F.A04(Integer.valueOf(errorCode)), C0X.A0L.A04(errorMessage), C0X.A0J.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2c() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A10, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2d() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0z, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2e() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A11, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2f(long loadTimeMs) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A12, C0X.A0J.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2g(C0Q reason) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A26, C0X.A00.A04(reason));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2h(String placementType, String placementId) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A04.set(placementType);
            this.A03.set(placementId);
            A04(C0T.A0b, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2i() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0c, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2j() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0d, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2k(long loadTimeMs, int errorCode, @Nullable String errorMessage, boolean isPublic) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0e, C0X.A0J.A04(Long.valueOf(loadTimeMs)), C0X.A0F.A04(Integer.valueOf(errorCode)), C0X.A0L.A04(errorMessage), C0X.A09.A04(Boolean.valueOf(isPublic)));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2l(long loadTimeMs) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0f, C0X.A0J.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2m(boolean result) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A19, C0X.A0C.A04(Boolean.valueOf(result)));
        } catch (Throwable th) {
            String[] strArr = A08;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A08[6] = "gK8mXYwR0ckPpFtcTSNh6868pPwacmBZ";
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2n() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1A, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2o(String errorMessage) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1E, C0X.A0L.A04(errorMessage));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2p() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1F, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2q() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1G, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2r() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1H, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2s(int funnelVideoPauseReason) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1I, C0X.A0G.A04(Integer.valueOf(funnelVideoPauseReason)));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2t() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1J, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2u() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1M, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2v() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1K, new C0W[0]);
        } catch (Throwable th) {
            if (A08[6].charAt(19) != 'h') {
                throw new RuntimeException();
            }
            A08[6] = "TXE2cMU86vxtF7wI18ThzZXaU0uTRMLS";
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2w(int reason) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1L, C0X.A0G.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2x() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1N, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2y(String uri) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1O, C0X.A0N.A04(uri));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2z() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1P, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A30() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1Q, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A31() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1R, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A32() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1S, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A33(int funnelVideoStartReason) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1T, C0X.A0G.A04(Integer.valueOf(funnelVideoStartReason)));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A34() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1U, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A35(int reason) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1V, C0X.A0G.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A36() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A28, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
            if (A08[4].length() != 3) {
                throw new RuntimeException();
            }
            A08[6] = "VZoNBueTz9dHgRCK2oHhqd2tucTd08Xg";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A37() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A29, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A38(C0Q reason) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A25, C0X.A00.A04(reason));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A39(int reason) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A27, C0X.A0H.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A3A() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2A, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A3w(long loadTimeMs) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0h, C0X.A0J.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
            if (A08[0].charAt(15) != 'k') {
                throw new RuntimeException();
            }
            A08[1] = "iGvSb1Hz3BIwYRP6JXvlZVW4";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A3x(long loadTimeMs) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0i, C0X.A0J.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A40() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0R, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A44() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0k, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4Z() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0l, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4a() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0p, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4b(boolean isInvalidated) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0g, C0X.A08.A04(Boolean.valueOf(isInvalidated)));
        } catch (Throwable th) {
            if (A08[1].length() == 19) {
                throw new RuntimeException();
            }
            A08[5] = "sws4bQbg9GprWoTPEe05ZlT1gMn94mHS";
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4c(int errorCode, String errorMessage) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0q, C0X.A0F.A04(Integer.valueOf(errorCode)), C0X.A0L.A04(errorMessage));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4d(boolean hasBid) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0o, C0X.A03.A04(Boolean.valueOf(hasBid)));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4e() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0s, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4f() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0t, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4g() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0u, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4h() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0v, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4x() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1Z, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4y(String message) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1a, C0X.A0N.A04(message));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4z() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1b, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A50() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1c, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A51() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1d, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A52(String errorMessage) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1e, C0X.A0L.A04(errorMessage));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A53(String errorMessage) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1f, C0X.A0L.A04(errorMessage));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A54(String message) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1g, C0X.A0N.A04(message));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A55(String errorMessage) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1i, C0X.A0L.A04(errorMessage));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A56() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1j, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A57(String errorMessage) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1k, C0X.A0L.A04(errorMessage));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A58(long loadTimeMs) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1l, C0X.A0J.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A59(String errorMessage) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1m, C0X.A0L.A04(errorMessage));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A8L() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1n, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A8M(boolean isDisabledByGK) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1o, C0X.A07.A04(Boolean.valueOf(isDisabledByGK)));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A8N() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1p, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A8O(String error) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1q, C0X.A0L.A04(error));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A8P() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1r, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A8Q() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1s, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A8R(String exception) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1t, C0X.A0M.A04(exception));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A9A(int code, String message) {
        if (C0548Jt.A02(this) || code < 11000 || code > 11099) {
            return;
        }
        try {
            A02(code, message);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A9o(String errorMessage) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A13, C0X.A0L.A04(errorMessage));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A9p(int reason) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A14, C0X.A0H.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
            if (A08[4].length() != 3) {
                throw new RuntimeException();
            }
            A08[1] = "n4mJfQKCjkVGyNTXc44lq1NfZCr";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A9q() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1w, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A9r() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1x, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A9s() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1y, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A9u() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A15, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
            if (A08[5].charAt(28) == 'u') {
                throw new RuntimeException();
            }
            A08[0] = "A3lONLTCXWx4KhpkbRCT5RNlo5C8otzX";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AE2(String errorMessage) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A17, C0X.A0L.A04(errorMessage));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AE3() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A18, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AF7(String requestId) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A05.set(requestId);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFA(EnumC00780c viewType) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A06.set(viewType);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFn() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1C, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFo() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1W, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFs() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2B, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFt(int code, String message) {
        if (C0548Jt.A02(this) || code < 12000 || code > 12099) {
            return;
        }
        try {
            A02(code, message);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFu() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2C, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFv() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2D, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFw() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2E, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFx(boolean callIgnored) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2F, C0X.A02.A04(Boolean.valueOf(callIgnored)));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFy() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2G, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFz() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2H, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AG0(int errorCode, @Nullable String message) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2I, C0X.A0F.A04(Integer.valueOf(errorCode)), C0X.A0L.A04(message));
        } catch (Throwable th) {
            if (A08[0].charAt(15) != 'k') {
                throw new RuntimeException();
            }
            A08[2] = "2PKYVe8Qgwv7j3CDJ6bxblARvZgyh";
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AG1(boolean hasWebview) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2J, C0X.A06.A04(Boolean.valueOf(hasWebview)));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AG2() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2K, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AG3(String error) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2L, C0X.A0L.A04(error));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AG4(int i, String error) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2M, C0X.A0L.A04(error));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
            if (A08[6].charAt(19) != 'h') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[7] = "5qwGvT3tjlGxlYjcZrXYRuOycIv";
            strArr[3] = "UEyDz1QZjBltnQnS2IeC3S3ns7y";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AG5() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2N, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AG6(int visibility) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2O, C0X.A0I.A04(Integer.valueOf(visibility)));
        } catch (Throwable th) {
            String[] strArr = A08;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A08[2] = "bm6dbMytZvpqzg8D3QKVLEJHQj3Ec";
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AGB(String errorMessage) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1X, C0X.A0L.A04(errorMessage));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AGC(String errorMessage) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1Y, C0X.A0L.A04(errorMessage));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
            if (A08[1].length() == 19) {
                throw new RuntimeException();
            }
            A08[5] = "ivuB5Sydf2jbsPKu7So7nbx7xRGWOHbH";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final String getId() {
        if (C0548Jt.A02(this)) {
            return null;
        }
        try {
            return this.A01.toString();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void unregisterView() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1B, new C0W[0]);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
