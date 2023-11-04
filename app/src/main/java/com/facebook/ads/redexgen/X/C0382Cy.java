package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cy */
/* loaded from: assets/audience_network.dex */
public final class C0382Cy implements WG {
    public static byte[] A05;
    public static String[] A06 = {"ilqNaxLa84KwPxLclQkuXaDAjXKjVBay", "YYRGnxFlW9XodSzMr5d0AgWnEUGN8SAb", "TFjL0s25LaCBEteV0vZTEC31LOIwZtzx", "GUmZTVO9tTTKl3Mpcsedxo5lbewk1Lj3", "rxyeYW6RMQKKTnfalukPqNZ2KBfsB6S5", "mDRU4t7MoPNm7z5QI5KjgmazMAxk28NE", "eki8tF0EBXj6l5GM9f5RfEnwS82fHKRK", "1REkWmsZMDj0bgzORsQu3VEtsLn99tZ6"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long[] A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0382Cy A01(long j, long j2, Bb bb, C0483Hc c0483Hc) {
        int A0H;
        int i = bb.A04;
        int i2 = bb.A03;
        int A08 = c0483Hc.A08();
        if ((A08 & 1) != 1 || (A0H = c0483Hc.A0H()) == 0) {
            return null;
        }
        long A0F = C0499Hs.A0F(A0H, i * 1000000, i2);
        if ((A08 & 6) != 6) {
            return new C0382Cy(j2, bb.A02, A0F);
        }
        long A0H2 = c0483Hc.A0H();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = c0483Hc.A0E();
        }
        if (j != -1 && j != j2 + A0H2) {
            Log.w(A02(27, 10, 25), A02(2, 25, 119) + j + A02(0, 2, 77) + (j2 + A0H2));
        }
        return new C0382Cy(j2, bb.A02, A0F, A0H2, jArr);
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-24, -36, 62, 47, 52, 45, 6, airhockey.P_GAME_EXIT, airhockey.P_GAME_MYWIN, 90, airhockey.P_GAME_MYWIN, 6, 89, 79, 96, 75, 6, 83, 79, 89, 83, airhockey.P_GAME_MYWIN, 90, airhockey.P_GAME_REMATCH, 78, 32, 6, -32, -15, -10, -17, -37, -19, -19, -13, -19, -6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.WG
    public final long A7q(long j) {
        long j2 = j - this.A02;
        if (A8v()) {
            int i = this.A00;
            String[] strArr = A06;
            if (strArr[5].charAt(8) != strArr[2].charAt(8)) {
                String[] strArr2 = A06;
                strArr2[5] = "W8nk4dNFk5UYs2ixe7nvUw2jVo0XpVlf";
                strArr2[2] = "94Ku6bJ3HPlMD7WZMvisRyq3A9jYmrd2";
                if (j2 <= i) {
                    return 0L;
                }
                double d = (j2 * 256.0d) / this.A01;
                int A0B = C0499Hs.A0B(this.A04, (long) d, true, true);
                long A00 = A00(A0B);
                long j3 = this.A04[A0B];
                long A002 = A00(A0B + 1);
                long j4 = A0B == 99 ? 256L : this.A04[A0B + 1];
                return Math.round((A002 - A00) * (j3 == j4 ? 0.0d : (d - j3) / (j4 - j3))) + A00;
            }
            throw new RuntimeException();
        }
        return 0L;
    }

    static {
        A03();
    }

    public C0382Cy(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    public C0382Cy(long j, int i, long j2, long j3, long[] jArr) {
        this.A02 = j;
        this.A00 = i;
        this.A03 = j2;
        this.A01 = j3;
        this.A04 = jArr;
    }

    private long A00(int i) {
        return (this.A03 * i) / 100;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0348Be
    public final long A6Y() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0348Be
    public final C0347Bd A7a(long j) {
        long[] jArr;
        double prevScaledPosition;
        if (!A8v()) {
            return new C0347Bd(new C0349Bf(0L, this.A02 + this.A00));
        }
        long A0E = C0499Hs.A0E(j, 0L, this.A03);
        double d = (A0E * 100.0d) / this.A03;
        if (d <= 0.0d) {
            prevScaledPosition = 0.0d;
        } else if (d >= 100.0d) {
            prevScaledPosition = 256.0d;
        } else {
            int i = (int) d;
            double prevScaledPosition2 = this.A04[i];
            double d2 = i == 99 ? 256.0d : jArr[i + 1];
            double d3 = i;
            String[] strArr = A06;
            if (strArr[1].charAt(15) != strArr[6].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[5] = "OMtgh7AGIO6dejZGwnLWpymQ4IFINQQk";
            strArr2[2] = "IsjlGA9bpSadN6h09kE1zH4HNrdroVjr";
            prevScaledPosition = prevScaledPosition2 + ((d2 - prevScaledPosition2) * (d - d3));
        }
        long round = Math.round((prevScaledPosition / 256.0d) * this.A01);
        long positionOffset = this.A00;
        return new C0347Bd(new C0349Bf(A0E, this.A02 + C0499Hs.A0E(round, positionOffset, this.A01 - 1)));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0348Be
    public final boolean A8v() {
        return this.A04 != null;
    }
}
