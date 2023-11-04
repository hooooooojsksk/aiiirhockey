package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.6Y */
/* loaded from: assets/audience_network.dex */
public final class C6Y extends PR implements View.OnClickListener {
    public static String[] A05 = {"dj2bca5KMhic7lU7SNdjndSTQwmssf52", "TPlcacN2BRfqpmqqou3eGj4ypEirHC", "lK1i5T", "LDnNwGMA5Xj1Rc4RK", "9vPtQslMJEvaRYxyY6ZiMi1q6kn3NQTo", "pbwCeIFhJ07zfEQSECI2TdcOW", "Wj7W52", "ztBFgo3EeJBil6N8wes8zN"};
    public final PO A00;
    public final NY A01;
    public final AbstractC0623Mt A02;
    public final M9 A03;
    public final C0686Pf A04;

    public C6Y(C0887Xc c0887Xc) {
        this(c0887Xc, null);
    }

    public C6Y(C0887Xc c0887Xc, AttributeSet attributeSet) {
        this(c0887Xc, attributeSet, 0);
    }

    public C6Y(C0887Xc c0887Xc, AttributeSet attributeSet, int i) {
        super(c0887Xc, attributeSet, i);
        this.A03 = new M9() { // from class: com.facebook.ads.redexgen.X.6f
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(MK mk) {
                C6Y.this.setVisibility(0);
            }
        };
        this.A01 = new NY() { // from class: com.facebook.ads.redexgen.X.6e
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(C02466z c02466z) {
                C0686Pf c0686Pf;
                c0686Pf = C6Y.this.A04;
                c0686Pf.setChecked(true);
            }
        };
        this.A02 = new AbstractC0623Mt() { // from class: com.facebook.ads.redexgen.X.6d
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(NC nc) {
                C0686Pf c0686Pf;
                c0686Pf = C6Y.this.A04;
                c0686Pf.setChecked(false);
            }
        };
        this.A00 = new PO() { // from class: com.facebook.ads.redexgen.X.6Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(AnonymousClass72 anonymousClass72) {
                C0686Pf c0686Pf;
                c0686Pf = C6Y.this.A04;
                c0686Pf.setChecked(true);
            }
        };
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A04 = new C0686Pf(c0887Xc);
        this.A04.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(this.A04, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.X.PR
    public final void A07() {
        super.A07();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PR
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A08();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            RA videoView = getVideoView();
            if (videoView == null) {
                return;
            }
            if (videoView.getState() == Q7.A07 || videoView.getState() == Q7.A05 || videoView.getState() == Q7.A06) {
                videoView.A0b(PK.A04, 11);
            } else if (videoView.getState() == Q7.A0A) {
                videoView.A0e(true, 7);
            }
        } catch (Throwable th) {
            if (A05[5].length() != 25) {
                throw new RuntimeException();
            }
            A05[7] = "YsoDkb8mAWGLBYzRGBa3i8";
            C0548Jt.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(@Nullable String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(@Nullable String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}
