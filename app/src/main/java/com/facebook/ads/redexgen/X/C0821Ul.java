package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ul */
/* loaded from: assets/audience_network.dex */
public final class C0821Ul implements GX {
    public static byte[] A0A;
    public static String[] A0B = {"QvoqMDlujHZGkbfh87JugdjLyzIxT7Wh", "ZZchp3HeTsLmxg3WfZ3Y", "qhagKIv", "Y1FNp0MjJJUWN0FCWTznZ2J9LVjCbw0g", "qdDuvYrChXaUr4tN", "YWBrlCwfH1YxEEmdkJFSbaSmAQF4", "KXNImhaNyDm6MeVCqM70", "pGNt1qWL1myUumzYaBIGkqUD2WTNJwvO"};
    public GX A00;
    public GX A01;
    public GX A02;
    public GX A03;
    public GX A04;
    public GX A05;
    public GX A06;
    public final Context A07;
    public final GX A08;
    public final InterfaceC0474Gt<? super GX> A09;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 92);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{22, 88, 87, 93, 75, 86, 80, 93, 102, 88, airhockey.P_GAME_EXIT, airhockey.P_GAME_EXIT, 92, 77, 22, 11, 62, 62, 47, 39, 58, 62, 35, 36, 45, airhockey.J_GAME_EXIT, 62, 37, airhockey.J_GAME_EXIT, 58, 38, 43, 51, airhockey.J_GAME_EXIT, 24, 30, 7, 26, airhockey.J_GAME_EXIT, 57, 62, 56, 47, 43, 39, airhockey.J_GAME_EXIT, 61, 35, 62, 34, 37, 63, 62, airhockey.J_GAME_EXIT, 46, 47, 58, 47, 36, 46, 35, 36, 45, airhockey.J_GAME_EXIT, 37, 36, airhockey.J_GAME_EXIT, 62, 34, 47, airhockey.J_GAME_EXIT, 24, 30, 7, 26, airhockey.J_GAME_EXIT, 47, 50, 62, 47, 36, 57, 35, 37, 36, 6, 39, 36, 35, 55, 46, 54, 6, 35, 54, 35, 17, 45, 55, 48, 33, 39, 15, 56, 56, 37, 56, airhockey.J_GAME_EXIT, 35, 36, 57, 62, 43, 36, 62, 35, 43, 62, 35, 36, 45, airhockey.J_GAME_EXIT, 24, 30, 7, 26, airhockey.J_GAME_EXIT, 47, 50, 62, 47, 36, 57, 35, 37, 36, 60, 46, 46, 56, 41, 81, 93, 95, 28, 84, 83, 81, 87, 80, 93, 93, 89, 28, 83, 86, 65, 28, 91, 92, airhockey.P_GAME_BREAKBALLCOUNT, 87, 64, 92, 83, 94, 28, 87, airhockey.P_GAME_EXIT, 93, airhockey.P_NATION, 94, 83, 75, 87, 64, 0, 28, 87, airhockey.P_GAME_EXIT, airhockey.P_GAME_BREAKBALLCOUNT, 28, 64, airhockey.P_GAME_BREAKBALLCOUNT, 95, airhockey.P_NATION, 28, 96, airhockey.P_GAME_BREAKBALLCOUNT, 95, airhockey.P_NATION, airhockey.J_REWARD, 83, airhockey.P_GAME_BREAKBALLCOUNT, 83, airhockey.J_SDKVER, 93, airhockey.P_GAME_MYWIN, 64, 81, 87, 96, airhockey.J_GAME_DISCONNECT, 109, 119, 102, 109, 119, airhockey.J_SAVEDGAME_SAVE, airhockey.J_REWARD, 99, airhockey.J_REWARD, 89, airhockey.P_GAME_EXIT, 92, 89, 78, 88, airhockey.P_GAME_SELECTMAP, 94, 89, airhockey.P_GAME_MYLOSE, 78, 87, 81, airhockey.P_GAME_MYLOSE, 85};
    }

    static {
        A07();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gt != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C0821Ul(Context context, InterfaceC0474Gt<? super GX> interfaceC0474Gt, GX gx) {
        this.A07 = context.getApplicationContext();
        this.A09 = interfaceC0474Gt;
        this.A08 = (GX) HD.A01(gx);
    }

    private GX A00() {
        if (this.A00 == null) {
            this.A00 = new C0826Uq(this.A07, this.A09);
        }
        return this.A00;
    }

    private GX A01() {
        if (this.A01 == null) {
            this.A01 = new C0825Up(this.A07, this.A09);
        }
        return this.A01;
    }

    private GX A02() {
        if (this.A02 == null) {
            this.A02 = new C0824Uo();
        }
        return this.A02;
    }

    private GX A03() {
        if (this.A04 == null) {
            this.A04 = new C0817Uh(this.A09);
        }
        return this.A04;
    }

    private GX A04() {
        if (this.A05 == null) {
            this.A05 = new UY(this.A07, this.A09);
        }
        return this.A05;
    }

    private GX A05() {
        if (this.A06 == null) {
            try {
                this.A06 = (GX) Class.forName(A06(141, 60, 110)).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                Log.w(A06(85, 17, 30), A06(15, 70, 22));
            } catch (Exception e) {
                throw new RuntimeException(A06(102, 34, 22), e);
            }
            GX gx = this.A06;
            String[] strArr = A0B;
            if (strArr[1].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "M1stUSKIngTBOPXJSAAv";
            strArr2[4] = "pJ0gFaSQQ06jpnK4";
            if (gx == null) {
                this.A06 = this.A08;
            }
        }
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final Uri A7w() {
        GX gx = this.A03;
        if (gx == null) {
            return null;
        }
        return gx.A7w();
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final long ADF(C0458Gb c0458Gb) throws IOException {
        HD.A04(this.A03 == null);
        String scheme = c0458Gb.A04.getScheme();
        if (C0499Hs.A0e(c0458Gb.A04)) {
            String path = c0458Gb.A04.getPath();
            String scheme2 = A06(0, 15, 101);
            if (path.startsWith(scheme2)) {
                GX A00 = A00();
                String[] strArr = A0B;
                String str = strArr[1];
                String scheme3 = strArr[2];
                if (str.length() == scheme3.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0B;
                strArr2[1] = "klcz1c4PkgrD18lWpLHv";
                strArr2[2] = "u5g7BFA";
                this.A03 = A00;
            } else {
                this.A03 = A03();
            }
        } else {
            String scheme4 = A06(136, 5, 1);
            if (scheme4.equals(scheme)) {
                this.A03 = A00();
            } else {
                String scheme5 = A06(HttpStatus.SC_CREATED, 7, 95);
                if (scheme5.equals(scheme)) {
                    this.A03 = A01();
                } else {
                    String scheme6 = A06(223, 4, 121);
                    if (scheme6.equals(scheme)) {
                        this.A03 = A05();
                    } else {
                        String scheme7 = A06(208, 4, 75);
                        if (scheme7.equals(scheme)) {
                            this.A03 = A02();
                        } else {
                            String scheme8 = A06(212, 11, 119);
                            if (scheme8.equals(scheme)) {
                                this.A03 = A04();
                            } else {
                                this.A03 = this.A08;
                            }
                        }
                    }
                }
            }
        }
        return this.A03.ADF(c0458Gb);
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final void close() throws IOException {
        GX gx = this.A03;
        if (gx != null) {
            try {
                gx.close();
            } finally {
                this.A03 = null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return this.A03.read(bArr, i, i2);
    }
}
