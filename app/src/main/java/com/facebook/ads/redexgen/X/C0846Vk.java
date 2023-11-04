package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vk */
/* loaded from: assets/audience_network.dex */
public final class C0846Vk implements InterfaceC0364Cb {
    public static byte[] A06;
    public static String[] A07 = {"3GVDuA8wFVUyMgpUpbIewfrR9H99KrEk", "JlICi14zqaUcthBIG11pWTw91wh2yVCw", "SCc1nWfYKQsHAUfYf8T5wZndFViKre8j", "glAeXwJzdtWksZ9B0aFClAzpFAfPstjY", "", "MoUOfVVsEVomZ5Pq9PB", "UtG2kZW99inEJ5Gw9pPEuhVI3SuCWANI", "WpnQHVSEOc3lam6iocwMhSGypVEKzNDF"};
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0351Bh A03;
    public boolean A04;
    public final C0483Hc A05 = new C0483Hc(10);

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[3].charAt(3) == 'p') {
                throw new RuntimeException();
            }
            A07[3] = "8BWuaIrledIbOr1Vvmzlm7GxjPqtlOKX";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
            i4++;
        }
    }

    public static void A01() {
        A06 = new byte[]{airhockey.J_WAIT, 84, 78, 94, 92, 79, 89, 84, 83, 90, 29, 84, 83, 75, 92, 81, 84, 89, 29, airhockey.J_DISCONNECT, airhockey.J_WAIT, 14, 29, airhockey.P_GAME_REMATCH, 92, 90, 22, 59, airhockey.J_GAME_DISCONNECT, 13, 58, 62, 59, 58, 45, 43, 58, 58, 38, 35, 41, 43, 62, 35, 37, 36, airhockey.J_GAME_STANDBY, 35, 46, airhockey.J_WAIT};
    }

    static {
        A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0078, code lost:
        if (51 != r6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
        if (51 != r6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
        r8.A05.A0Z(3);
        r8.A01 = r8.A05.A0D() + 10;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A4B(com.facebook.ads.redexgen.X.C0483Hc r9) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0846Vk.A4B(com.facebook.ads.redexgen.X.Hc):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void A4Y(BX bx, C0375Cp c0375Cp) {
        c0375Cp.A05();
        this.A03 = bx.AFc(c0375Cp.A03(), 4);
        this.A03.A5X(Format.A0B(c0375Cp.A04(), A00(35, 15, 124), null, -1, null));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void ADM() {
        int i;
        if (!this.A04 || (i = this.A01) == 0 || this.A00 != i) {
            return;
        }
        this.A03.AEY(this.A02, 1, i, 0, null);
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void ADN(long j, boolean z) {
        if (!z) {
            return;
        }
        this.A04 = true;
        this.A02 = j;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void AEb() {
        this.A04 = false;
    }
}
