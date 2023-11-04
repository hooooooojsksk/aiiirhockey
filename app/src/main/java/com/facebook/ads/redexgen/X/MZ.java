package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class MZ extends LinearLayout {
    public static final int A03 = (int) (Kk.A02 * 40.0f);
    public static final int A04 = (int) (Kk.A02 * 20.0f);
    public static final int A05 = (int) (Kk.A02 * 10.0f);
    public final C2H A00;
    public final C0887Xc A01;
    public final MJ A02;

    public MZ(C0887Xc c0887Xc, C2H c2h, MJ mj, LT lt) {
        this(c0887Xc, c2h, mj, null, lt);
    }

    public MZ(C0887Xc c0887Xc, C2H c2h, MJ mj, @Nullable String str, LT lt) {
        super(c0887Xc);
        this.A01 = c0887Xc;
        this.A00 = c2h;
        this.A02 = mj;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View A01 = A01(str);
            A01.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            LL.A0M(view, -10459280);
            addView(A01, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.A00.A03())) {
            View A00 = A00(lt, this.A00.A03());
            int i = A05;
            A00.setPadding(0, i, 0, i);
            addView(A00, layoutParams);
        }
        ViewGroup A02 = A02();
        A02.setPadding(0, A05, 0, 0);
        addView(A02, layoutParams);
    }

    private View A00(LT lt, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        int i = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(LU.A01(lt));
        TextView textView = new TextView(getContext());
        LL.A0X(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(LU.A01(LT.BACK_ARROW));
        int i = A05;
        imageView.setPadding(0, i, i * 2, i);
        int i2 = A03;
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(i2, i2);
        imageView.setOnClickListener(new MX(this));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        LL.A0X(textView, true, 16);
        textView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, A03, 0);
        layoutParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, titleParams);
        linearLayout.addView(textView, layoutParams);
        return linearLayout;
    }

    private ViewGroup A02() {
        C0609Mf c0609Mf = new C0609Mf(this.A01);
        for (C2H c2h : this.A00.A05()) {
            ML ml = new ML(this.A01);
            ml.setData(c2h.A04(), null);
            ml.setOnClickListener(new MY(this, ml, c2h));
            c0609Mf.addView(ml);
        }
        return c0609Mf;
    }
}
