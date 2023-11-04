package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9D */
/* loaded from: assets/audience_network.dex */
public class C9D extends SF {
    @Nullable
    public M2 A00;
    @Nullable
    public O2 A01;
    @Nullable
    public C0670Op A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    @Nullable
    public RelativeLayout A06;
    public C0736Rd A07;
    public final C0887Xc A08;
    public final PO A09;
    public final NY A0A;
    public final AbstractC0623Mt A0B;
    public final M9 A0C;
    public final AbstractC0569Kr A0D;
    public final String A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final C0642Nm A0I;
    public static String[] A0J = {"dJoea1DbFsfm9GTpKIzcXYdmCRfBe4FS", "N1xc2MysRccxXRgwDgHXZSQeh7bFq7uk", "3nDu3mubCrSGPsHb", "SUxuavEQD34fwSKO8hxc7w", "hmAyL1Y1BI3zOyZEMNvfuG", "1nycCDmAbpyAo4RWRzHJ2ixoeiRT", "fh6VcnyoMwgZMcb2oBIx6", "bmD"};
    public static final int A0L = (int) (Kk.A02 * 0.0f);
    public static final int A0M = (int) (Kk.A02 * 9.0f);
    public static final int A0K = (int) (Kk.A02 * 9.0f);

    public C9D(C0642Nm c0642Nm, boolean z, String str, C0736Rd c0736Rd) {
        super(c0642Nm, z);
        this.A0G = new Path();
        this.A0H = new RectF();
        this.A0D = new AbstractC0569Kr() { // from class: com.facebook.ads.redexgen.X.9e
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(C0570Ks c0570Ks) {
                if (C9D.this.getVideoView() != null) {
                    C9D.this.A07.A0P().setVolume(C9D.this.getVideoView().getVolume());
                }
            }
        };
        this.A09 = new PO() { // from class: com.facebook.ads.redexgen.X.9c
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(AnonymousClass72 anonymousClass72) {
                C9D.this.A03();
                Object tag = C9D.this.getTag(-1593835536);
                if (tag != null) {
                    C9D.this.A07.A0N().ACu(((Integer) tag).intValue());
                }
            }
        };
        this.A0B = new AbstractC0623Mt() { // from class: com.facebook.ads.redexgen.X.9b
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(NC nc) {
                C9D.this.A02();
                C9D.this.A07.A0O().AD6(C9D.this);
            }
        };
        this.A0A = new NY() { // from class: com.facebook.ads.redexgen.X.9G
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(C02466z c02466z) {
                C9D.this.A03();
                C9D.this.A07.A0O().AD4(C9D.this);
            }
        };
        this.A0C = new M9() { // from class: com.facebook.ads.redexgen.X.9E
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(MK mk) {
                C9D.this.A05 = true;
                C9D.this.A04();
            }
        };
        this.A0I = c0642Nm;
        this.A07 = c0736Rd;
        this.A0E = str;
        this.A08 = c0642Nm.A05();
        setGravity(17);
        int i = A0L;
        setPadding(i, 0, i, i);
        LL.A0M(this, 0);
        setUpView(this.A08);
        this.A0F = new Paint();
        this.A0F.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.A0F.setStyle(Paint.Style.FILL);
        this.A0F.setAlpha(16);
        this.A0F.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    public void A02() {
        if (this.A0I.A0A() != null && this.A02 != null) {
            this.A0I.A0A().A93(this.A02.getSimpleVideoView());
            if (IK.A1g(getContext())) {
                this.A0I.A0A().A07(false);
            }
        }
    }

    public void A03() {
        if (this.A0I.A0A() != null) {
            this.A0I.A0A().A05();
            if (this.A02 != null) {
                this.A0I.A0A().AFf(this.A02.getSimpleVideoView());
            }
        }
    }

    public void A04() {
        if (this.A01 == null) {
            return;
        }
        if (!A0k() || !this.A05) {
            boolean A0k = A0k();
            String[] strArr = A0J;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[3] = "whWH7G9NZGoicUCMK8TGye";
            strArr2[4] = "jQqQ2QRGHP0rmsCqitHuog";
            if (A0k || !this.A04) {
                return;
            }
        }
        this.A01.AAF();
    }

    private void A05(@Nullable View view) {
        RelativeLayout.LayoutParams layoutParams;
        if (view == null || (layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    public static void A06(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        LL.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0638Ni
    public final boolean A0D() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0638Ni
    public final boolean A0d() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.SF
    public final void A0g() {
        C0670Op c0670Op;
        if (A0k() && (c0670Op = this.A02) != null) {
            c0670Op.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SF
    public final void A0h() {
        if (A0k()) {
            A0i();
            C0670Op c0670Op = this.A02;
            if (c0670Op != null) {
                c0670Op.A05(PK.A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.SF
    public final void A0i() {
        C0670Op c0670Op;
        float volume = this.A07.A0P().getVolume();
        if (!A0k() || (c0670Op = this.A02) == null) {
            return;
        }
        float newVolume = c0670Op.getVolume();
        if (volume != newVolume) {
            this.A02.setVolume(volume);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SF
    public final boolean A0j() {
        C0670Op c0670Op;
        return A0k() && (c0670Op = this.A02) != null && c0670Op.A06();
    }

    @Override // com.facebook.ads.redexgen.X.SF
    public final boolean A0k() {
        return this.A03;
    }

    public final void A0l(Map<String, String> extraParams) {
        C0670Op c0670Op = this.A02;
        if (c0670Op != null) {
            c0670Op.A02();
            if (A0k()) {
                this.A02.A04(getAdEventManager(), this.A0E, extraParams);
            }
        }
    }

    @Nullable
    public final C0670Op getVideoView() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0638Ni, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A0G.reset();
        this.A0H.set(0.0f, 0.0f, getWidth(), getHeight());
        int i = 0;
        int radius = getResources().getConfiguration().orientation;
        boolean z = radius == 1;
        if (z) {
            i = A0K;
        }
        this.A0G.addRoundRect(this.A0H, i, i, Path.Direction.CW);
        canvas.drawPath(this.A0G, this.A0F);
        RectF rectF = this.A0H;
        int radius2 = A0L;
        float f = radius2;
        int width = getWidth();
        int radius3 = A0L;
        float f2 = width - radius3;
        int height = getHeight();
        int radius4 = A0L;
        rectF.set(f, 0.0f, f2, height - radius4);
        if (z) {
            i = A0M;
        }
        this.A0G.addRoundRect(this.A0H, i, i, Path.Direction.CW);
        canvas.clipPath(this.A0G);
        super.onDraw(canvas);
    }

    public void setCTAInfo(C1M c1m, Map<String, String> extraData) {
        getCtaButton().setCta(c1m, this.A0E, extraData);
    }

    public void setImageUrl(String str) {
        M2 m2 = this.A00;
        if (m2 != null) {
            m2.setVisibility(0);
            new AsyncTaskC0764Sf(this.A00, this.A08).A04().A06(new SX(this)).A07(str);
        }
        C0670Op c0670Op = this.A02;
        if (c0670Op != null) {
            c0670Op.setVisibility(8);
        }
    }

    public void setIsVideo(boolean z) {
        this.A03 = z;
    }

    public void setOnAssetsLoadedListener(O2 o2) {
        this.A01 = o2;
    }

    public void setUpImageView(C0887Xc c0887Xc) {
        this.A00 = new M2(c0887Xc);
        if (IK.A13(c0887Xc)) {
            this.A00.setOnClickListener(new NN(this));
        }
        A06(this.A00);
    }

    public void setUpMediaContainer(C0887Xc c0887Xc) {
        this.A06 = new RelativeLayout(c0887Xc);
        A06(this.A06);
        M2 m2 = this.A00;
        if (m2 != null) {
            this.A06.addView(m2);
            A05(this.A00);
        }
        C0670Op c0670Op = this.A02;
        if (c0670Op != null) {
            this.A06.addView(c0670Op);
            A05(this.A02);
        }
        addView(this.A06);
    }

    public void setUpVideoView(C0887Xc c0887Xc) {
        this.A02 = new C0670Op(c0887Xc, new C0513Ii(this.A0E, getAdEventManager()));
        if (IK.A14(c0887Xc)) {
            this.A02.setOnClickListener(new NO(this));
        }
        A06(this.A02);
    }

    private void setUpView(C0887Xc c0887Xc) {
        setUpImageView(c0887Xc);
        setUpVideoView(c0887Xc);
        setUpMediaContainer(c0887Xc);
    }

    public void setVideoPlaceholderUrl(String str) {
        C0670Op c0670Op = this.A02;
        if (c0670Op != null) {
            c0670Op.setPlaceholderUrl(str);
        }
    }

    public void setVideoUrl(String str) {
        M2 m2 = this.A00;
        if (m2 != null) {
            if (A0J[5].length() == 10) {
                throw new RuntimeException();
            }
            A0J[2] = "s54OOOYMcUndmM7F";
            m2.setVisibility(8);
        }
        C0670Op c0670Op = this.A02;
        if (c0670Op != null) {
            c0670Op.setVisibility(0);
            this.A02.setVideoURI(str);
            this.A02.A03(this.A0D);
            this.A02.A03(this.A09);
            this.A02.A03(this.A0B);
            this.A02.A03(this.A0A);
            this.A02.A03(this.A0C);
        }
    }
}
