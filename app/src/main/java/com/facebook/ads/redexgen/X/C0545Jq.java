package com.facebook.ads.redexgen.X;

import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Handler;
import android.view.View;
import androidx.annotation.Nullable;

@TargetApi(12)
/* renamed from: com.facebook.ads.redexgen.X.Jq */
/* loaded from: assets/audience_network.dex */
public final class C0545Jq implements PL {
    public static String[] A0B = {"82Zz8oCZg8zkkbzw8opl2Yz4CtrF2SDp", "9Qv", "sj5N5SmrmBRQmWue5o8rJw6ys3alFtJa", "lBA7odrZYL425", "CSSBUKaIJSWMhqfJuWGnuyX4cipoTk5I", "IDQP5gLMbSSnC18VVbdsGZXvkzghwpNg", "Yf1MSxzKxHs57zUlY7hI2xykX4pHUq1P", "T3bn0lMwtbok5v0PvXD6574OGDOrX6LS"};
    public View A00;
    @Nullable
    public RA A01;
    @Nullable
    public PX A02;
    public boolean A03;
    public final Handler A04;
    public final PO A05;
    public final NY A06;
    public final AbstractC0623Mt A07;
    public final LE A08;
    public final boolean A09;
    public final boolean A0A;

    public C0545Jq(View view, PX px, boolean z) {
        this(view, px, z, false);
    }

    public C0545Jq(View view, @Nullable PX px, boolean z, boolean z2) {
        this.A06 = new NY() { // from class: com.facebook.ads.redexgen.X.6n
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(C02466z c02466z) {
                C0545Jq.this.A06(1, 0);
            }
        };
        this.A07 = new AbstractC0623Mt() { // from class: com.facebook.ads.redexgen.X.6k
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(NC nc) {
                boolean z3;
                PX px2;
                boolean z4;
                z3 = C0545Jq.this.A03;
                if (!z3) {
                    return;
                }
                px2 = C0545Jq.this.A02;
                if (px2 != PX.A03) {
                    z4 = C0545Jq.this.A09;
                    if (!z4) {
                        C0545Jq.this.A06(0, 8);
                        return;
                    }
                }
                C0545Jq.this.A02 = null;
                C0545Jq.this.A05();
            }
        };
        this.A05 = new PO() { // from class: com.facebook.ads.redexgen.X.6j
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(AnonymousClass72 anonymousClass72) {
                PX px2;
                View view2;
                View view3;
                px2 = C0545Jq.this.A02;
                if (px2 == PX.A04) {
                    return;
                }
                view2 = C0545Jq.this.A00;
                view2.setAlpha(1.0f);
                view3 = C0545Jq.this.A00;
                view3.setVisibility(0);
            }
        };
        this.A08 = new C02336i(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z;
        this.A0A = z2;
        A08(view, px);
    }

    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new PW(this));
    }

    public void A06(int i, int i2) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i);
        this.A00.setVisibility(i2);
    }

    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, PX px) {
        this.A02 = px;
        this.A00 = view;
        this.A00.clearAnimation();
        if (px == PX.A04) {
            this.A00.setAlpha(0.0f);
            String[] strArr = A0B;
            if (strArr[5].charAt(26) == strArr[0].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[5] = "3OWa54Sl5zOXBo6RskK22JrE4LW5JWKj";
            strArr2[0] = "lt7hksMEFpJVhV2333OBcIopOVPW9bfy";
            this.A00.setVisibility(8);
            return;
        }
        this.A00.setAlpha(1.0f);
        this.A00.setVisibility(0);
    }

    @Override // com.facebook.ads.redexgen.X.PL
    public final void A93(RA ra) {
        this.A01 = ra;
        ra.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.PL
    public final void AFf(RA ra) {
        A06(1, 0);
        ra.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
