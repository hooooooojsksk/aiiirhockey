package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.39 */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass39 extends AbstractC0388Dh implements Handler.Callback {
    public static String[] A0D = {"gjDhtLri4FaGEAWjRmzGOIMLbPPteIUr", "gp3Mr1PqMY6rayIsxO9yJntmkSBHR7UD", "5ZPDaEp5A16UYvNfALSoSfbuhC4Pwik1", "wt", "uAQVQjgSUgDp2O8dWeXQS6qYbl", "Gm3ZCOzsQkh90YHushfajnERb16f", "RaSLUB1F0sju8CZYqMhotlzh76Y2FLCY", "Ujo7akDRrtwDl4IVTi3qcCtKoi2"};
    public int A00;
    public int A01;
    public Format A02;
    public V6 A03;
    public BK A04;
    public BJ A05;
    public BJ A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final C9S A0A;
    public final FT A0B;
    public final FU A0C;

    public AnonymousClass39(FU fu, Looper looper) {
        this(fu, looper, FT.A00);
    }

    public AnonymousClass39(FU fu, Looper looper, FT ft) {
        super(3);
        this.A0C = (FU) HD.A01(fu);
        this.A09 = looper == null ? null : new Handler(looper, this);
        this.A0B = ft;
        this.A0A = new C9S();
    }

    private long A00() {
        int i = this.A01;
        if (i == -1 || i >= this.A06.A6j()) {
            return LongCompanionObject.MAX_VALUE;
        }
        return this.A06.A6i(this.A01);
    }

    private void A01() {
        A06(Collections.emptyList());
    }

    private void A02() {
        this.A04 = null;
        this.A01 = -1;
        BJ bj = this.A06;
        if (bj != null) {
            bj.A08();
            this.A06 = null;
        }
        BJ bj2 = this.A05;
        if (bj2 != null) {
            bj2.A08();
            this.A05 = null;
        }
    }

    private void A03() {
        A02();
        this.A03.AE4();
        this.A03 = null;
        this.A00 = 0;
    }

    private void A04() {
        A03();
        this.A03 = this.A0B.A4J(this.A02);
    }

    private void A05(List<FQ> list) {
        this.A0C.AAf(list);
    }

    private void A06(List<FQ> list) {
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            A05(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0388Dh
    public final void A12() {
        this.A02 = null;
        A01();
        A03();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0388Dh
    public final void A15(long j, boolean z) {
        A01();
        this.A07 = false;
        this.A08 = false;
        if (this.A00 != 0) {
            A04();
            return;
        }
        A02();
        this.A03.flush();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0388Dh
    public final void A17(Format[] formatArr, long j) throws C9F {
        this.A02 = formatArr[0];
        if (this.A03 != null) {
            this.A00 = 1;
        } else {
            this.A03 = this.A0B.A4J(this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public final boolean A8h() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public final boolean A8r() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0090, code lost:
        if (r6 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0094, code lost:
        if (r10.A00 != 2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0096, code lost:
        A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00a9, code lost:
        A02();
        r10.A08 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00bb, code lost:
        if (r6 == 0) goto L35;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AEH(long r11, long r13) throws com.facebook.ads.redexgen.X.C9F {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass39.AEH(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03089n
    public final int AFY(Format format) {
        if (this.A0B.AFZ(format)) {
            return AbstractC0388Dh.A0x(null, format.A0H) ? 4 : 2;
        } else if (HV.A0A(format.A0O)) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            List<FQ> list = (List) message.obj;
            String[] strArr = A0D;
            if (strArr[1].charAt(30) != strArr[0].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[7] = "l6TDTpt99EyMX5wDtgW8ykbRvyz";
            strArr2[4] = "JTJkXOfBS96AZaGW1FTj7RQLpJ";
            A05(list);
            return true;
        }
        throw new IllegalStateException();
    }
}
