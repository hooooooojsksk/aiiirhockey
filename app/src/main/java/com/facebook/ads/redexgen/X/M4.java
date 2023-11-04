package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;

/* loaded from: assets/audience_network.dex */
public final class M4 extends LinearLayout {
    public static String[] A06 = {"RdKbZKE5ShqjtspsYuId0BpVT", "jFs6Ox2yxsj", "", "O0DGVMIkWcl", "ZjYxtVw01iwSMNXN0b17Jtyc9gHU9Z2d", "b1LSaO6GQJOSELIr8C99", "", "wukZGaaSm"};
    public static final int A07 = (int) (Kk.A02 * 15.0f);
    public static final int A08 = (int) (Kk.A02 * 10.0f);
    public static final int A09 = (int) (Kk.A02 * 44.0f);
    public int A00;
    public boolean A01;
    public final ImageView A02;
    public final LinearLayout A03;
    public final TextView A04;
    public final NK A05;

    public M4(C0887Xc c0887Xc, int i) {
        super(c0887Xc);
        this.A01 = false;
        this.A02 = new ImageView(c0887Xc);
        ImageView imageView = this.A02;
        int i2 = A08;
        imageView.setPadding(i2, i2, i2, i2);
        this.A05 = new NK(c0887Xc);
        this.A05.setProgress(0.0f);
        NK nk = this.A05;
        int i3 = A08;
        nk.setPadding(i3, i3, i3, i3);
        this.A04 = new TextView(c0887Xc);
        setOrientation(0);
        this.A03 = new LinearLayout(c0887Xc);
        this.A00 = i;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        int i = A09;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        LL.A0X(this.A04, true, 16);
        this.A04.setTextColor(-1);
        this.A04.setVisibility(8);
        this.A03.addView(this.A02, layoutParams2);
        this.A03.addView(this.A05, layoutParams2);
        addView(this.A03, layoutParams);
        LinearLayout.LayoutParams actionTextLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        actionTextLayoutParams.gravity = 17;
        addView(this.A04, actionTextLayoutParams);
    }

    private void A01() {
        int i;
        NK nk = this.A05;
        int i2 = this.A00;
        int i3 = 8;
        if (i2 == 2 || i2 == 6) {
            i = this.A01 ? 4 : 0;
        } else {
            i = 8;
        }
        nk.setVisibility(i);
        ImageView imageView = this.A02;
        int i4 = this.A00;
        if (i4 == 5) {
            i3 = 4;
        } else if (i4 != 2 && i4 != 6) {
            i3 = 0;
        }
        imageView.setVisibility(i3);
    }

    public final void A02(C1L c1l, boolean z, boolean z2) {
        int A04 = c1l.A04(z);
        NK nk = this.A05;
        int accentColor = C01272a.A01(A04, 77);
        nk.A02(accentColor, A04, 110);
        this.A02.setColorFilter(A04);
        if (!z2) {
            this.A04.setTextColor(-1);
            return;
        }
        TextView textView = this.A04;
        int accentColor2 = C01272a.A01(-1, 110);
        textView.setTextColor(accentColor2);
    }

    public final boolean A03() {
        return !this.A04.getText().toString().isEmpty();
    }

    public final boolean A04() {
        int i = this.A00;
        return (i == 2 || i == 4) ? false : true;
    }

    @ToolbarActionView$ToolbarActionMode
    public int getToolbarActionMode() {
        return this.A00;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setInitialUnskippableSeconds(int i) {
        if (i > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f) {
        this.A05.setProgressWithAnimation(f);
    }

    public void setProgressClickListener(@Nullable View.OnClickListener onClickListener) {
        this.A05.setOnClickListener(onClickListener);
    }

    public void setProgressImage(@Nullable LT lt) {
        this.A05.setImage(lt);
    }

    public void setProgressImmediate(float f) {
        this.A05.clearAnimation();
        this.A05.setProgress(f);
    }

    public void setProgressSpinnerInvisible(boolean z) {
        this.A01 = z;
        A01();
    }

    public void setToolbarActionMode(int i) {
        LT lt;
        this.A00 = i;
        A01();
        setVisibility(0);
        if (Build.VERSION.SDK_INT >= 16) {
            this.A02.setImageAlpha(255);
        }
        ImageView imageView = this.A02;
        int i2 = A08;
        imageView.setPadding(i2, i2, i2, i2);
        if (i == 0) {
            lt = LT.CROSS;
        } else if (i == 1) {
            lt = LT.SKIP_ARROW;
        } else if (i == 3) {
            lt = LT.MINIMIZE_ARROW;
        } else if (i == 4) {
            lt = LT.CROSS;
            this.A02.setVisibility(8);
            setVisibility(8);
        } else if (i == 5) {
            lt = LT.CROSS;
        } else if (i == 6) {
            lt = LT.CROSS;
        } else if (i != 7) {
            lt = LT.CROSS;
        } else {
            lt = LT.CROSS;
            if (Build.VERSION.SDK_INT >= 16) {
                this.A02.setImageAlpha(110);
            }
            ImageView imageView2 = this.A02;
            int i3 = A07;
            imageView2.setPadding(i3, i3, i3, i3);
        }
        ImageView imageView3 = this.A02;
        Bitmap A01 = LU.A01(lt);
        if (A06[4].charAt(13) == 'C') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[6] = "";
        strArr[2] = "";
        imageView3.setImageBitmap(A01);
        LL.A0G(1002, this.A02);
    }

    public void setToolbarMessage(String str) {
        this.A04.setText(str);
        this.A04.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z) {
        this.A04.setVisibility(z ? 0 : 4);
    }
}
