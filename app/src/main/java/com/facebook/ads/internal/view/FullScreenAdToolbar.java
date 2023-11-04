package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.facebook.ads.redexgen.X.AbstractC0586Li;
import com.facebook.ads.redexgen.X.C01021b;
import com.facebook.ads.redexgen.X.C0513Ii;
import com.facebook.ads.redexgen.X.C0584Lg;
import com.facebook.ads.redexgen.X.C0636Ng;
import com.facebook.ads.redexgen.X.C0667Om;
import com.facebook.ads.redexgen.X.C0887Xc;
import com.facebook.ads.redexgen.X.C1L;
import com.facebook.ads.redexgen.X.C1V;
import com.facebook.ads.redexgen.X.InterfaceC0585Lh;
import com.facebook.ads.redexgen.X.InterfaceC0587Lj;
import com.facebook.ads.redexgen.X.Kk;
import com.facebook.ads.redexgen.X.LL;
import com.facebook.ads.redexgen.X.LT;
import com.facebook.ads.redexgen.X.M4;
import com.facebook.ads.redexgen.X.View$OnClickListenerC0592Lo;
import com.facebook.ads.redexgen.X.View$OnClickListenerC0759Sa;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FullScreenAdToolbar extends AbstractC0586Li {
    public static byte[] A08;
    public static String[] A09 = {"elaUgpg", "xyZ5KhWZZkOCw26QnbyRE89VYXYHkT38", "j2Hg99bd5kkvFLrtwtqoGvtE7T", "FtK0h2Y990QReQxCoMrwn7Y", "09p430KvfvIa5D7TMMbG57be7BWhVuc0", "4K9Dg6G4rdQDm1ubILJxRl9GbBVTjarc", "MQsbPX4", "ODYsITK"};
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    @Nullable
    public C0584Lg A00;
    @Nullable
    public InterfaceC0585Lh A01;
    public boolean A02;
    public final RelativeLayout A03;
    public final C0513Ii A04;
    public final InterfaceC0587Lj A05;
    public final M4 A06;
    public final C0667Om A07;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{-26, 15, 18, 22, 8, -61, -28, 7, 56, 75, 86, 85, 88, 90, 6, 39, airhockey.P_GAME_EXIT, 77, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_STANDBY, 59, 58, 75};
    }

    static {
        A03();
        A0A = (int) (Kk.A02 * 10.0f);
        A0E = (int) (Kk.A02 * 16.0f);
        int i = A0E;
        int i2 = A0A;
        A0C = i - i2;
        A0D = (i * 2) - i2;
        A0B = (int) (Kk.A02 * 4.0f);
    }

    public FullScreenAdToolbar(C0887Xc c0887Xc, InterfaceC0587Lj interfaceC0587Lj, C0513Ii c0513Ii, @ToolbarActionView$ToolbarActionMode int i) {
        super(c0887Xc);
        this.A02 = true;
        this.A05 = interfaceC0587Lj;
        this.A04 = c0513Ii;
        setGravity(16);
        this.A06 = new M4(c0887Xc, i);
        this.A06.setContentDescription(A02(0, 8, 50));
        this.A06.setActionClickListener(new View$OnClickListenerC0592Lo(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i2 = A0C;
        layoutParams.setMargins(i2, i2, A0D, i2);
        addView(this.A06, layoutParams);
        this.A03 = new RelativeLayout(c0887Xc);
        LinearLayout.LayoutParams containerParams = new LinearLayout.LayoutParams(0, -2);
        containerParams.weight = 1.0f;
        this.A07 = new C0667Om(c0887Xc);
        LinearLayout.LayoutParams pageDetailsParams = new LinearLayout.LayoutParams(-2, -2);
        pageDetailsParams.gravity = 17;
        this.A07.setLayoutParams(pageDetailsParams);
        this.A03.addView(this.A07);
        addView(this.A03, containerParams);
    }

    public FullScreenAdToolbar(C0887Xc c0887Xc, InterfaceC0587Lj interfaceC0587Lj, C0513Ii c0513Ii, @ToolbarActionView$ToolbarActionMode int i, int i2) {
        this(c0887Xc, interfaceC0587Lj, c0513Ii, i);
        A07(c0887Xc, i2);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    public final void A04(C1L c1l, boolean z) {
        boolean z2 = this.A02;
        int A04 = c1l.A04(z2);
        this.A07.A01(c1l.A0A(z2), A04);
        this.A00.setIconColors(A04);
        this.A00.setContentDescription(A02(8, 9, 117));
        this.A06.A02(c1l, z2, z);
        if (z2) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            LL.A0S(this, gradientDrawable);
            LL.A0Q(this.A00, 0, ViewCompat.MEASURED_STATE_MASK, A0B);
            return;
        }
        LL.A0M(this, 0);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    public final boolean A05() {
        return this.A06.A03();
    }

    public final void A06(C1V c1v, String str, int i) {
        this.A06.setInitialUnskippableSeconds(i);
        C0584Lg c0584Lg = this.A00;
        if (c0584Lg != null) {
            c0584Lg.setAdDetails(c1v, str, this.A04, this.A05);
        }
    }

    public final void A07(C0887Xc c0887Xc, int i) {
        C0584Lg c0584Lg = this.A00;
        if (c0584Lg != null) {
            LL.A0J(c0584Lg);
            this.A00.removeAllViews();
        }
        this.A00 = new C0584Lg(c0887Xc, i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        int i2 = A0E;
        layoutParams.setMargins(0, i2 / 2, i2 / 2, i2 / 2);
        addView(this.A00, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    public View getDetailsContainer() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    @ToolbarActionView$ToolbarActionMode
    public int getToolbarActionMode() {
        return this.A06.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    public int getToolbarHeight() {
        return AbstractC0586Li.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    @Nullable
    public InterfaceC0585Lh getToolbarListener() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    public void setAdReportingVisible(boolean z) {
        this.A00.setVisibility(z ? 0 : 8);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    public void setCTAClickListener(View.OnClickListener onClickListener) {
        this.A07.setOnClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    public void setCTAClickListener(View$OnClickListenerC0759Sa view$OnClickListenerC0759Sa) {
        this.A07.setOnClickListener(C0636Ng.A03(view$OnClickListenerC0759Sa, A02(17, 7, 104)));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    public void setFullscreen(boolean z) {
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    public void setPageDetails(C1V c1v, String str, int i, C01021b c01021b) {
        this.A06.setInitialUnskippableSeconds(i);
        this.A07.setPageDetails(c1v);
        C0584Lg c0584Lg = this.A00;
        if (c0584Lg != null) {
            c0584Lg.setAdDetails(c1v, str, this.A04, this.A05);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    public void setPageDetailsVisible(boolean z) {
        this.A03.removeAllViews();
        if (z) {
            RelativeLayout relativeLayout = this.A03;
            C0667Om c0667Om = this.A07;
            if (A09[4].charAt(4) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[2] = "uYrc95dj4mq6YR3RipRhNZPjST";
            strArr[3] = "ufyXPPKrvmASdIniU0CJIS9";
            relativeLayout.addView(c0667Om);
        }
        M4 m4 = this.A06;
        String[] strArr2 = A09;
        if (strArr2[2].length() == strArr2[3].length()) {
            m4.setToolbarMessageEnabled(!z);
            return;
        }
        A09[1] = "RoBBOPMqmB8G6B1FErbRchWOJuWn3pgq";
        m4.setToolbarMessageEnabled(!z);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    public void setProgress(float f) {
        this.A06.setProgress(f);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    public void setProgressClickListener(@Nullable View.OnClickListener onClickListener) {
        this.A06.setProgressClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    public void setProgressImage(@Nullable LT lt) {
        this.A06.setProgressImage(lt);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    public void setProgressImmediate(float f) {
        this.A06.setProgressImmediate(f);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    public void setProgressSpinnerInvisible(boolean z) {
        this.A06.setProgressSpinnerInvisible(z);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    public void setToolbarActionMessage(String str) {
        this.A06.setToolbarMessage(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    public void setToolbarActionMode(@ToolbarActionView$ToolbarActionMode int i) {
        this.A06.setToolbarActionMode(i);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0586Li
    public void setToolbarListener(@Nullable InterfaceC0585Lh interfaceC0585Lh) {
        this.A01 = interfaceC0585Lh;
    }
}
