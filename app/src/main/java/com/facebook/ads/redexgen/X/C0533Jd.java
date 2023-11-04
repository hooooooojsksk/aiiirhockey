package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Jd */
/* loaded from: assets/audience_network.dex */
public final class C0533Jd {
    public static byte[] A07;
    public static final LO A08;
    public static final Executor A09;
    public long A00;
    @Nullable
    public Jc A01;
    @Nullable
    public Map<String, String> A02;
    public final C2D A03;
    public final C0887Xc A04;
    public final C0534Je A05;
    public final String A06;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 80);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{60, 61, 62, airhockey.J_ENEMYLOSE, 63, airhockey.J_GAME_REMATCH, airhockey.J_ENEMYLOSE, airhockey.J_GAME_REMATCH, airhockey.J_PURCHASE, airhockey.J_GAME_REMATCH, airhockey.J_GAME_ENEMYEXIT, 119, airhockey.J_ERROR, 78, 65, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYSCORE, 89, 82, 95, airhockey.P_GAME_MYLOSE, 92, 88, airhockey.P_GAME_MYLOSE, 94, 89, 82, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_REMATCH, airhockey.J_NATION, 88, 11, airhockey.J_WAIT, airhockey.J_GAME_STANDBY, 17, 11, airhockey.J_ONREWARDED, airhockey.J_GAME_STANDBY, 10, airhockey.J_GAME_DISCONNECT, 99, 102, 102, 10, 88, 79, airhockey.P_GAME_REMATCH, 79, airhockey.P_GAME_MYSCORE, 92, 79, 78, 20, 53, airhockey.J_PURCHASE, 28, 51, 54, 54, airhockey.J_PURCHASE, 63, 40, 40, 53, 40, airhockey.J_PURCHASE, 57, 53, 62, 63, airhockey.J_PURCHASE, 1, ByteCompanionObject.MAX_VALUE, 41, 7, airhockey.J_PURCHASE, ByteCompanionObject.MAX_VALUE, 41, 15, 13, 6, 13, 26, 1, 11, 81, 90, 75, airhockey.P_GAME_MYLOSE, 80, 77, 84, 40, 41, 0, 47, 42, 42, 14, 41, 41, 45};
    }

    static {
        A0A();
        A08 = new LO();
        A09 = Executors.newCachedThreadPool(A08);
    }

    public C0533Jd(C0887Xc c0887Xc) {
        this(c0887Xc, C2E.A00(c0887Xc.A01()));
    }

    public C0533Jd(C0887Xc c0887Xc, C2D c2d) {
        this.A00 = -1L;
        this.A04 = c0887Xc;
        this.A05 = C0534Je.A00();
        this.A06 = C0537Jh.A01(c0887Xc);
        this.A03 = c2d;
    }

    public QH A03(long j, C0531Ja c0531Ja) {
        return new C0789Tf(this, c0531Ja, j);
    }

    public void A09() {
        C0887Xc c0887Xc = this.A04;
        if (c0887Xc == null || !QY.A0A(c0887Xc)) {
            return;
        }
        C02637t c02637t = new C02637t(A05(8, 5, 107));
        c02637t.A03(1);
        this.A04.A07().A9C(A05(86, 7, 111), C02627s.A1w, c02637t);
    }

    private void A0B(int i, String str) {
        String A05 = A05(93, 10, 22);
        JO.A05(A05, A05(37, 16, 122), A05(0, 8, 90));
        JO.A04(A05, String.format(Locale.US, A05(53, 26, 10), Integer.valueOf(i), str));
    }

    public void A0C(JA ja) {
        Jc jc = this.A01;
        if (jc != null) {
            jc.AAv(ja);
        }
    }

    public void A0D(JA ja) {
        LF.A00(new C0788Td(this, ja));
    }

    public void A0K(C0787Tc c0787Tc) {
        Jc jc = this.A01;
        if (jc != null) {
            jc.ACh(c0787Tc);
        }
    }

    private void A0L(C0787Tc c0787Tc) {
        C7T syncModule;
        LF.A00(new Te(this, c0787Tc));
        if (IK.A1v(this.A04) && (syncModule = this.A04.A05()) != null) {
            syncModule.A5W();
        }
    }

    public void A0M(String str, long j, C0531Ja c0531Ja) {
        String str2;
        try {
        } catch (Exception e) {
            e = e;
        }
        try {
            C0536Jg A06 = this.A05.A06(this.A04, str, j);
            C8A A00 = A06.A00();
            if (A00 != null) {
                IK.A0P(this.A04).A2L(A00.A08());
                this.A04.A07().A9i();
                this.A03.A0N(A00.A06());
                JZ.A05(A00.A05().A0B(), c0531Ja);
                LZ.A01(this.A04, A09, A00);
                C02637t c02637t = new C02637t(A05(30, 7, 123) + C0563Kl.A02());
                c02637t.A04(1);
                c02637t.A08(false);
                this.A04.A07().A9c(A05(79, 7, 56), C02627s.A1W, c02637t);
            }
            int i = C0532Jb.A00[A06.A01().ordinal()];
            if (i == 1) {
                C0787Tc c0787Tc = (C0787Tc) A06;
                if (A00 != null) {
                    if (A00.A05().A0E()) {
                        JZ.A07(str, c0531Ja);
                    }
                    if (this.A02 != null) {
                        str2 = this.A02.get(A05(13, 17, 93));
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(A06.A02()) && !TextUtils.isEmpty(str2)) {
                        this.A04.A02().AER(this.A04, str2, A06.A02());
                    }
                }
                this.A04.A0E().A2l(LC.A01(this.A00));
                A0L(c0787Tc);
            } else if (i != 2) {
                AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                this.A04.A0E().A2k(LC.A01(this.A00), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                A0D(JA.A01(adErrorType, str));
            } else {
                C0786Tb c0786Tb = (C0786Tb) A06;
                String A04 = c0786Tb.A04();
                AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c0786Tb.A03(), AdErrorType.ERROR_MESSAGE);
                A0B(c0786Tb.A03(), A04);
                if (A04 == null) {
                    A04 = str;
                }
                this.A04.A0E().A2k(LC.A01(this.A00), adErrorTypeFromCode.getErrorCode(), A04, adErrorTypeFromCode.isPublicError());
                A0D(JA.A01(adErrorTypeFromCode, A04));
            }
        } catch (Exception e2) {
            e = e2;
            String message = e.getMessage();
            AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
            this.A04.A0E().A2k(LC.A01(this.A00), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            A0D(JA.A01(adErrorType2, message));
        }
    }

    public void A0N(String str, long j, C0531Ja c0531Ja) {
        A09.execute(new C0790Tg(this, str, j, c0531Ja));
    }

    public final void A0O(C0531Ja c0531Ja) {
        this.A00 = System.currentTimeMillis();
        AnonymousClass81.A0B(this.A04);
        if (JZ.A08(c0531Ja)) {
            LQ.A06.execute(new C0792Ti(this));
            String A02 = JZ.A02(c0531Ja);
            if (A02 != null) {
                this.A04.A0E().AFn();
                A0N(A02, 0L, c0531Ja);
                return;
            }
            AdErrorType adErrorType = AdErrorType.LOAD_TOO_FREQUENTLY;
            this.A04.A0E().A2k(LC.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage(), adErrorType.isPublicError());
            A0D(JA.A01(adErrorType, null));
            return;
        }
        A09.execute(new C0791Th(this, c0531Ja));
    }

    public final void A0P(Jc jc) {
        this.A01 = jc;
    }
}
