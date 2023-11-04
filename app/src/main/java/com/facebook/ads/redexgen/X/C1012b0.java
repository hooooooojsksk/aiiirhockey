package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.b0 */
/* loaded from: assets/audience_network.dex */
public final class C1012b0 {
    public static String[] A0C = {"YcCIPLCDTe1wGTKdO7xqYhpFwQzvmXtt", "FfIdHaSVTal814YVh5tJNVr21T0wsSAo", "HLDls6wic6LzndIKtUvgWnGJ4QMP07cO", "ccYpD8PuArRKO9YkPTuVfhIh5pDN1br2", "LFFD576NBTVByEN649EglQB81U0zBBuc", "sO5gz1O188I9hNkbLLxzl8j4JWiDgVKK", "Hord6YvHX1lmSPmhXyMRW660HCYjcXOm", "5HbQDpK1pfSpB47EOovGOWVGJlrw1BSl"};
    @Nullable
    public InterfaceC1016b4 A00;
    public boolean A01;
    public final Rect A02;
    public final Rect A03;
    public final Handler A04;
    public final RO A05;
    public final InterfaceC1023bB A06;
    public final C1014b2 A07;
    public final InterfaceC0449Fs A08;
    public final Runnable A09;
    public final List<Rect> A0A;
    public final List<View> A0B;

    public C1012b0(InterfaceC1023bB interfaceC1023bB, RO ro, InterfaceC0449Fs interfaceC0449Fs, C1014b2 c1014b2, Handler handler) {
        this(interfaceC1023bB, ro, interfaceC0449Fs, c1014b2, handler, 100);
    }

    public C1012b0(InterfaceC1023bB interfaceC1023bB, RO ro, InterfaceC0449Fs interfaceC0449Fs, C1014b2 c1014b2, Handler handler, int i) {
        this.A03 = new Rect();
        this.A02 = new Rect();
        this.A0B = new ArrayList();
        this.A0A = new ArrayList();
        this.A01 = false;
        this.A06 = interfaceC1023bB;
        this.A05 = ro;
        this.A08 = interfaceC0449Fs;
        this.A07 = c1014b2;
        this.A04 = handler;
        this.A09 = new RunnableC1013b1(this, i);
    }

    private void A03(long j) {
        if (this.A0B.isEmpty()) {
            this.A06.A85(this.A0A);
            this.A08.A3r(j, this.A0A);
            this.A08.A5H();
            return;
        }
        throw new IllegalStateException();
    }

    public void A04(long j) {
        this.A06.A85(this.A0A);
        this.A08.A3r(j, this.A0A);
        if (this.A0B.isEmpty()) {
            this.A07.A03(this.A0B);
            Iterator<View> it = this.A0B.iterator();
            loop0: while (true) {
                if (it.hasNext()) {
                    View next = it.next();
                    C1021b9 A00 = this.A07.A00(next);
                    for (Rect rect : this.A0A) {
                        if (C1005at.A00(next, this.A03, this.A02, rect) && A00 != C1021b9.A08) {
                            InterfaceC0449Fs interfaceC0449Fs = this.A08;
                            Rect containerRect = this.A03;
                            Rect rect2 = this.A02;
                            if (A0C[0].charAt(21) != 'h') {
                                break loop0;
                            }
                            A0C[6] = "BhrT0c14O8Thrmtg3HRzOfRcpCyh5HNl";
                            interfaceC0449Fs.A3K(A00, containerRect, rect2);
                        }
                    }
                } else {
                    this.A08.A5H();
                    InterfaceC1016b4 interfaceC1016b4 = this.A00;
                    if (interfaceC1016b4 != null) {
                        interfaceC1016b4.ACU();
                    }
                    this.A0B.clear();
                    String[] strArr = A0C;
                    if (strArr[1].charAt(9) != strArr[3].charAt(9)) {
                        String[] strArr2 = A0C;
                        strArr2[1] = "lmQ3TWUKEycrXTOUs6diKoA3HcDn9Pdd";
                        strArr2[3] = "T2sieqBmgvCwHjMtYcExspPM2F3LyLlD";
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        throw new IllegalStateException();
    }

    public final void A07() {
        InterfaceC1016b4 interfaceC1016b4 = this.A00;
        if (interfaceC1016b4 != null) {
            interfaceC1016b4.ACU();
        }
        if (this.A01) {
            this.A04.removeCallbacks(this.A09);
            A03(this.A05.A9v());
        }
        this.A01 = false;
        if (A0C[0].charAt(21) != 'h') {
            throw new RuntimeException();
        }
        A0C[0] = "Da2exFZBguRvp8OTbNDxEhbqIKaEOHIs";
    }

    public final void A08() {
        if (!this.A01) {
            this.A01 = true;
            this.A04.post(this.A09);
        }
    }

    public final void A09(@Nullable InterfaceC1018b6 interfaceC1018b6) {
        this.A08.AFB(interfaceC1018b6);
    }

    public final void A0A(@Nullable InterfaceC1016b4 interfaceC1016b4) {
        this.A00 = interfaceC1016b4;
    }
}
