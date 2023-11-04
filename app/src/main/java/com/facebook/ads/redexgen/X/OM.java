package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class OM {
    public static byte[] A0K;
    public static final AtomicInteger A0L;
    public static final AtomicInteger A0M;
    @Nullable
    public OB A02;
    @Nullable
    public OK A03;
    @Nullable
    public OL A04;
    @Nullable
    public QA A05;
    public final int A08;
    public final AbstractC0952Zs A09;
    public final C6M A0A;
    public final C0887Xc A0B;
    public final InterfaceC0505Ia A0C;
    public final C0513Ii A0D;
    public final O9 A0E;
    public final S1 A0F;
    public final OX A0G;
    public final OY A0H;
    public final LinkedList<OJ> A0J = new LinkedList<>();
    public LD A01 = new LD();
    public boolean A07 = true;
    public boolean A06 = false;
    public long A00 = -1;
    public final String A0I = UUID.randomUUID().toString();

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0K = new byte[]{37, 63, 39, 56, 61, 39, 57, 13, 34, 40, 62, 35, 37, 40, 5, 34, 56, 41, 62, 42, 45, 47, 41, 5, 0, 54, 1, 20, 11, 22, 16, 13, 10, 3, 34, 13, 10, 13, 23, 12, 1, 0, 76, airhockey.P_GAME_MYSCORE, 65, 23, airhockey.P_GAME_MYSCORE, 77, 95, 96, airhockey.J_GAME_STANDBY, 83, airhockey.J_ONREWARDED, airhockey.J_BACK, airhockey.J_INVITE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ERROR, airhockey.J_ENEMYLOSE, 111, 102, 82, airhockey.J_ERROR, 96, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ERROR, airhockey.J_ONREWARDED, airhockey.J_GAME_STANDBY, 41, 38, 36, airhockey.J_SAVEDGAME_RELOAD, 38, 40, 58, 34, 55, 55, 34, 32, 43, 38, 39, 20, 21, 13, 54, 46, 10, 9, 28, 11, 0, 13, 12, 46, 26, 9, 5, 13, 44, 9, 28, 9, 84, airhockey.P_NATION, airhockey.P_GAME_STANDBY, airhockey.P_GAME_STANDBY, 82, 89, airhockey.P_GAME_MYSCORE, 96, airhockey.J_SDKVER, airhockey.J_WAIT, airhockey.P_NATION, 90, 48, 36, 55, 59, 51, 37, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_WAIT, 86, airhockey.J_DISCONNECT, 99, 126, airhockey.J_SDKVER, 126, 99, airhockey.J_INVITE, airhockey.P_GAME_MYWIN, airhockey.J_REWARD, airhockey.J_NATION, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_SAVE, 63, 48, 50, airhockey.J_ONREWARDED, 48, 62, 44, 36, 37, 10, 40, 63, 34, 61, 34, 63, 50, 25, 46, 56, 62, 38, 46, 47, 99, airhockey.J_GAME_DISCONNECT, airhockey.J_INVITE, 56, airhockey.J_GAME_DISCONNECT, airhockey.J_NATION, airhockey.J_GOO, 83, 82, ByteCompanionObject.MAX_VALUE, 80, 83, 79, 89, airhockey.J_PURCHASE, airhockey.P_GAME_REMATCH, 80, 80, 79, 95, 78, 89, 89, 82, airhockey.J_GAME_EXIT, 85, 89, 75, 20, 27, 25, 79, 27, 21, airhockey.P_GAME_MYSCORE, airhockey.P_NATION, airhockey.J_GAME_EXIT, 89, 64, 64, 95, 79, 94, airhockey.P_GAME_REMATCH, airhockey.P_GAME_REMATCH, airhockey.P_NATION, airhockey.J_PURCHASE, airhockey.P_GAME_STANDBY, airhockey.P_GAME_REMATCH, 91, 4, 11, 9, 95, 11, 5, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_REMATCH, airhockey.J_BACK, airhockey.P_GAME_BREAKBALLCOUNT, 75, 82, airhockey.P_NATION, airhockey.J_ERROR, airhockey.P_NATION, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYSCORE, 15, 0, 2, 84, 0, 11, 7, 0, 2, 84, 0, 11, 7, 0, 2, 84, 0, 14, 28, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_WAIT, 65, airhockey.J_REWARD, 123, airhockey.J_NATION, airhockey.J_SAVEDGAME_RELOAD, 64, airhockey.J_GAME_STANDBY, 126, 99, 99, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_WAIT, 63, 48, 50, airhockey.J_ONREWARDED, 48, 59, 55, 48, 50, airhockey.J_ONREWARDED, 48, 62, 44, airhockey.J_GAME_EXIT, 124, airhockey.J_PURCHASE, airhockey.J_REWARD, 119, 125, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_PURCHASE, airhockey.J_BACK, airhockey.J_ACHIEVEMENTCALLBACK, 119, 119, 124, airhockey.J_ERROR, 20, 2, 19, 38, 18, 19, 15, 44, 2, 30, 79, 64, airhockey.P_NATION, 20, 64, 75, 64, airhockey.P_NATION, 20, 64, 78, 92, 77, 91, airhockey.P_GAME_EXIT, 124, 95, 77, 91, 8, 10, ByteCompanionObject.MAX_VALUE, 77, 77, 91, airhockey.P_GAME_EXIT, 77, 22, 25, 27, 77, 25, 18, 25, 27, 77, 25, 23, 2, 20, 5, 51, 16, 2, 20, airhockey.P_GAME_MYWIN, airhockey.P_GAME_STANDBY, 50, 30, 31, 23, 24, 22, 89, 86, 84, 2, 86, 93, 86, 84, 2, 86, 88, 57, 34, 57, 44, 33, 26, 27, 3, 56, 32, 38, 33, 63, 29, 2, 15, 14, 4, 46, 29, 14, 5, 31, airhockey.P_GAME_MYSCORE, 76, 78, 24, 76, airhockey.P_GAME_MYWIN, 75, 76, 78, 24, 76, airhockey.P_GAME_MYWIN, 75, 76, 78, 24, 76, airhockey.P_NATION, 80, 14, 17, 29, 15, 42, 29, 25, 28, 1, 44, 23, 43, 16, 23, 15, 80, 95, 93, 11, 95, 81, airhockey.P_GAME_MYSCORE};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A0i(Map<String, String> map) {
        String A0A = A0A(87, 16, 106);
        if (map.containsKey(A0A) && IK.A1R(this.A0B)) {
            try {
                JSONArray jSONArray = new JSONArray(map.get(A0A));
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONArray jSONArray2 = new JSONArray(jSONArray.getString(i));
                    String string = jSONArray2.getString(0);
                    String string2 = jSONArray2.getString(1);
                    String string3 = jSONArray2.getString(2);
                    String string4 = jSONArray2.getString(3);
                    if (string != null && string2 != null && string3 != null) {
                        RU ru = new RU(this.A09.A0m(), Long.parseLong(string), Long.parseLong(string2), Long.parseLong(string3));
                        ru.A05(Long.parseLong(string4));
                        arrayList.add(ru);
                    }
                }
                String A04 = RT.A04(arrayList);
                HashMap hashMap = new HashMap();
                hashMap.put(A0A(115, 6, 84), A04);
                if (A04 != null) {
                    this.A0C.A9U(this.A09.A0m(), hashMap);
                }
            } catch (Exception e) {
                this.A0B.A07().A9C(A0A(274, 14, 27), 3600, new C02637t(e));
            }
        }
        if (map.containsKey(A0A)) {
            map.remove(A0A);
        }
        this.A0C.A9B(this.A09.A0m(), new NA(map).A03(this.A05).A05());
    }

    static {
        A0D();
        A0M = new AtomicInteger();
        A0L = new AtomicInteger();
    }

    public OM(C0887Xc c0887Xc, AbstractC0952Zs abstractC0952Zs, InterfaceC0505Ia interfaceC0505Ia, int i) {
        this.A0B = c0887Xc;
        this.A0C = interfaceC0505Ia;
        this.A09 = abstractC0952Zs;
        this.A08 = i;
        this.A0F = new S1(this, c0887Xc);
        this.A0A = new C6M(this.A0B);
        this.A0D = new C0513Ii(abstractC0952Zs.A0m(), interfaceC0505Ia);
        this.A0E = new O9(abstractC0952Zs.A0L(), abstractC0952Zs.A0h().A0D().A08(), i);
        this.A0H = OZ.A00(this.A0B, abstractC0952Zs.A0N(), this.A0A, this.A0D, this.A0E, A0H());
        this.A0G = new OX(this.A0B, this, interfaceC0505Ia, this.A0E, this.A0I, abstractC0952Zs.A0m());
    }

    public static AtomicInteger A0B() {
        return A0L;
    }

    private void A0C() {
        A0F(new OJ(A0A(288, 22, 101), new String[]{this.A0I, A0A(1, 6, 11)}));
        String assets = Base64.encodeToString(this.A0H.A05.toString().getBytes(), 0).replace(A0A(0, 1, 45), A0A(0, 0, 109));
        String assets2 = this.A0I;
        A0F(new OJ(A0A(310, 26, 60), new String[]{assets, assets2}));
    }

    @TargetApi(21)
    public synchronized void A0E() {
        if (this.A06) {
            while (!this.A0J.isEmpty()) {
                OJ poll = this.A0J.poll();
                if (poll != null) {
                    this.A0F.A05(String.format(Locale.US, poll.A00, poll.A02));
                    if (poll.A01) {
                        this.A0D.A04(EnumC0512Ih.A0L, null);
                        this.A0B.A0E().A4y(poll.A00);
                    }
                }
            }
        }
    }

    private synchronized void A0F(OJ oj) {
        this.A0J.offer(oj);
        A0E();
    }

    private boolean A0H() {
        return !A0I();
    }

    private boolean A0I() {
        return IK.A2G(this.A0B, C0701Pu.A03());
    }

    public final C0513Ii A0K() {
        return this.A0D;
    }

    public final LD A0L() {
        return this.A01;
    }

    public final O9 A0M() {
        return this.A0E;
    }

    @Nullable
    public final OB A0N() {
        return this.A02;
    }

    public final S1 A0O() {
        return this.A0F;
    }

    public final void A0P() {
        A0F(new OJ(A0A(23, 26, 102), new String[]{this.A0I}));
    }

    public final void A0Q() {
        A0F(new OJ(A0A(49, 25, 3), new String[]{this.A0I}));
    }

    public final void A0R() {
        this.A07 = true;
    }

    public final void A0S() {
        this.A07 = false;
    }

    public final void A0T() {
        A0F(new OJ(A0A(121, 23, 21), new String[]{this.A0I}));
    }

    public final void A0U() {
        A0F(new OJ(A0A(168, 27, 62), new String[]{this.A0I}));
    }

    public final void A0V() {
        A0F(new OJ(A0A(195, 22, 46), new String[]{this.A0I}));
    }

    public final void A0W() {
        A0F(new OJ(A0A(HttpStatus.SC_NOT_FOUND, 22, 122), new String[]{this.A0I}));
    }

    @SuppressLint({"AddJavascriptInterface"})
    public final void A0X() {
        String str;
        if (Build.VERSION.SDK_INT > 16) {
            this.A0F.addJavascriptInterface(this.A0G, A0A(7, 16, 78));
        }
        this.A0D.A04(EnumC0512Ih.A0O, null);
        if (this.A08 == 3) {
            str = this.A0H.A00;
        } else {
            str = this.A0H.A01;
        }
        this.A0F.loadUrl(str);
        this.A00 = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            String url = A0A(372, 3, 81);
            jSONObject.put(url, str);
            jSONObject.put(A0A(103, 12, 53), ON.A00());
            jSONObject.put(A0A(362, 10, 79), A0M.getAndIncrement());
            jSONObject.put(A0A(74, 13, 65), A0L);
        } catch (JSONException unused) {
        }
        this.A0B.A0E().A54(jSONObject.toString());
        A0C();
    }

    public final void A0Y() {
        A0F(new OJ(A0A(144, 24, 73), new String[]{this.A0I}));
    }

    public final void A0Z(LD ld) {
        this.A01 = ld;
    }

    public final void A0a(@Nullable OB ob) {
        this.A02 = ob;
    }

    public final void A0b(OK ok) {
        this.A03 = ok;
    }

    public final void A0c(OL ol) {
        this.A04 = ol;
    }

    public final void A0d(S0 s0) {
        this.A0G.A0N(s0);
    }

    public final void A0e(@Nullable QA qa) {
        this.A05 = qa;
    }

    public final void A0f(String str) {
        A0F(new OJ(A0A(247, 27, 21), new String[]{this.A0I, str}));
    }

    public final void A0g(String str, String str2) {
        A0F(new OJ(A0A(217, 30, 37), new String[]{this.A0I, str, str2}));
    }

    public final void A0h(String str, JSONObject jSONObject) {
        A0F(new OJ(A0A(375, 29, 105), new String[]{this.A0I, str, jSONObject.toString()}, false));
    }

    public final void A0j(JSONObject jSONObject) {
        A0F(new OJ(A0A(336, 26, 115), new String[]{Base64.encodeToString(jSONObject.toString().getBytes(), 0).replace(A0A(0, 1, 45), A0A(0, 0, 109)), this.A0I}));
    }

    public final boolean A0k() {
        return this.A0G.A0O();
    }

    public final boolean A0l() {
        return this.A07;
    }
}
