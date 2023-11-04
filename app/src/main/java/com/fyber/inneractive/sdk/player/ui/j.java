package com.fyber.inneractive.sdk.player.ui;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RotateDrawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.global.features.r;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifier;
import com.fyber.inneractive.sdk.ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l0;

/* loaded from: classes.dex */
public class j extends l {
    public TextView Q;
    public ImageView R;
    public View S;
    public ViewGroup T;
    public final a U;
    public ViewGroup V;

    public j(Context context, com.fyber.inneractive.sdk.flow.d dVar, a aVar, s sVar, boolean z, String str) {
        super(context, sVar, str);
        LayoutInflater.from(context).inflate(R.layout.ia_video_view_new_design, (ViewGroup) this, true);
        e();
        this.U = aVar;
        if (dVar != null) {
            dVar.a(this.T, FyberAdIdentifier.Corner.BOTTOM_LEFT);
        }
        f(z);
    }

    private void setProgressBarTint(r rVar) {
        String a = rVar.a("new_video_design_skip_progress_bar_start_color", "#9000D691");
        String a2 = rVar.a("new_video_design_skip_progress_bar_end_color", "#00D691");
        try {
            int[] iArr = {Color.parseColor(a), Color.parseColor(a2)};
            Drawable progressDrawable = this.w.getProgressDrawable();
            if (progressDrawable instanceof RotateDrawable) {
                Drawable drawable = ((RotateDrawable) progressDrawable).getDrawable();
                if (drawable instanceof GradientDrawable) {
                    ((GradientDrawable) drawable).setColors(iArr);
                    this.w.setProgressDrawable(progressDrawable);
                }
            }
        } catch (Exception unused) {
            IAlog.a("could not parse colors %s %s", a, a2);
        }
    }

    private void setSizesAndTint(r rVar) {
        ImageView imageView = this.u;
        Integer b = rVar.b("new_video_design_mute_btn_size_w");
        int intValue = b != null ? b.intValue() : 30;
        Integer b2 = rVar.b("new_video_design_mute_btn_size_h");
        com.fyber.inneractive.sdk.util.l.a(imageView, intValue, b2 != null ? b2.intValue() : 30);
        IAsmoothProgressBar iAsmoothProgressBar = this.w;
        Integer b3 = rVar.b("new_video_design_skip_progress_bar_size_w");
        int intValue2 = b3 != null ? b3.intValue() : 46;
        Integer b4 = rVar.b("new_video_design_skip_progress_bar_size_h");
        com.fyber.inneractive.sdk.util.l.a(iAsmoothProgressBar, intValue2, b4 != null ? b4.intValue() : 46);
        ImageView imageView2 = this.R;
        Integer b5 = rVar.b("new_video_design_skip_btn_size_w");
        int intValue3 = b5 != null ? b5.intValue() : 30;
        Integer b6 = rVar.b("new_video_design_skip_btn_size_h");
        com.fyber.inneractive.sdk.util.l.a(imageView2, intValue3, b6 != null ? b6.intValue() : 30);
        TextView textView = this.Q;
        Integer b7 = rVar.b("new_video_design_skip_btn_size_w");
        int intValue4 = b7 != null ? b7.intValue() : 30;
        Integer b8 = rVar.b("new_video_design_skip_btn_size_h");
        com.fyber.inneractive.sdk.util.l.a(textView, intValue4, b8 != null ? b8.intValue() : 30);
        ImageView imageView3 = this.R;
        Integer b9 = rVar.b("new_video_design_skip_btn_margin");
        int intValue5 = b9 != null ? b9.intValue() : 12;
        if (imageView3 != null && (imageView3.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            int b10 = com.fyber.inneractive.sdk.util.l.b(intValue5);
            ((ViewGroup.MarginLayoutParams) imageView3.getLayoutParams()).setMargins(b10, b10, b10, b10);
            imageView3.requestLayout();
        }
        TextView textView2 = this.Q;
        Integer b11 = rVar.b("new_video_design_skip_btn_margin");
        int intValue6 = b11 != null ? b11.intValue() : 12;
        if (textView2 != null && (textView2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            int b12 = com.fyber.inneractive.sdk.util.l.b(intValue6);
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).setMargins(b12, b12, b12, b12);
            textView2.requestLayout();
        }
        View view = this.S;
        Integer b13 = rVar.b("new_video_design_action_btn_size_w");
        int intValue7 = b13 != null ? b13.intValue() : 120;
        Integer b14 = rVar.b("new_video_design_action_btn_size_h");
        com.fyber.inneractive.sdk.util.l.a(view, intValue7, b14 != null ? b14.intValue() : 48);
        View view2 = this.S;
        String a = rVar.a("new_video_design_tint_color", "#00D691");
        if (view2 != null) {
            try {
                view2.setBackgroundColor(Color.parseColor(a));
            } catch (Exception unused) {
                IAlog.a("could not parse color %s", a);
            }
        }
        TextView textView3 = this.k;
        String a2 = rVar.a("new_video_design_action_btn_text_color", "#ffffff");
        if (textView3 != null) {
            try {
                textView3.setTextColor(Color.parseColor(a2));
            } catch (Exception unused2) {
                IAlog.a("could not parse color %s", a2);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.d
    public void a(l0 l0Var, int i, int i2) {
        a aVar = this.U;
        if (aVar != null) {
            aVar.a(this.d, this.r, this.s, this.t, l0Var, i, i2, this.b, ((a0) this.c).f.f.intValue());
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public void b(boolean z) {
        if (this.i != null) {
            ViewGroup viewGroup = this.z;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                IAlog.a("end card is visible and requested to show last frame image with value of %s", Boolean.valueOf(z));
                this.i.setVisibility(8);
                return;
            }
            if (z) {
                this.i.setAlpha(0.0f);
            }
            this.i.setVisibility(z ? 0 : 8);
            if (z) {
                this.i.animate().alpha(1.0f).setDuration(500L).start();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public void c() {
        ImageView imageView = this.R;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.R.setEnabled(true);
            TextView textView = this.Q;
            if (textView != null) {
                textView.setVisibility(4);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public void d() {
        ImageView imageView = this.u;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        TextView textView = this.Q;
        if (textView != null) {
            textView.setVisibility(4);
        }
        View view = this.S;
        if (view != null) {
            view.setVisibility(8);
        }
        if (this.w != null && !f()) {
            this.w.setVisibility(4);
        }
        e(false);
        this.k.setVisibility(4);
        ImageView imageView2 = this.v;
        if (imageView2 != null) {
            imageView2.setVisibility(4);
        }
        ViewGroup viewGroup = this.T;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        a(false, (String) null);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public void d(boolean z) {
    }

    public void e(boolean z) {
        ImageView imageView = this.R;
        if (imageView == null || this.Q == null) {
            return;
        }
        if (imageView.isEnabled()) {
            this.R.setVisibility(z ? 0 : 4);
            this.Q.setVisibility(4);
            return;
        }
        this.R.setVisibility(4);
        this.Q.setVisibility(z ? 0 : 4);
    }

    public void f(boolean z) {
        s sVar = this.K;
        String c = sVar != null ? ((com.fyber.inneractive.sdk.config.global.features.n) sVar.a(com.fyber.inneractive.sdk.config.global.features.n.class)).c() : getContext().getString(R.string.ia_video_app_info_text);
        if (z) {
            e(false);
            a(true, c);
            return;
        }
        a(false, (String) null);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public View[] getTrackingFriendlyView() {
        return new View[]{this.V, this.I, this.i, this.J};
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return new View[]{this.q, this.T};
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public void h() {
        s sVar;
        if (this.S == null || (sVar = this.K) == null) {
            return;
        }
        r rVar = (r) sVar.a(r.class);
        TextView textView = this.k;
        if (textView != null) {
            textView.setTextSize(0, getResources().getDimension(R.dimen.ia_video_overlay_text_large_for_cta));
            View view = this.S;
            Integer b = rVar.b("new_video_design_action_btn_size_w_large");
            int intValue = b != null ? b.intValue() : 180;
            Integer b2 = rVar.b("new_video_design_action_btn_size_h");
            com.fyber.inneractive.sdk.util.l.a(view, intValue, b2 != null ? b2.intValue() : 48);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public void j() {
        a aVar = this.U;
        if (aVar != null) {
            this.C = aVar.a(this.d, this.r, this.s, this.B, this.b, this.j, this.i);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (f()) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            View view = this.S;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("x", (displayMetrics.widthPixels / 2.0f) - (view.getWidth() / 2.0f)), PropertyValuesHolder.ofFloat("y", displayMetrics.heightPixels / 1.3f), PropertyValuesHolder.ofFloat("scaleX", 1.4f), PropertyValuesHolder.ofFloat("scaleY", 1.4f));
            ofPropertyValuesHolder.setDuration(750L);
            ofPropertyValuesHolder.start();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public void setRemainingTime(String str) {
        TextView textView = this.Q;
        if (textView != null) {
            textView.setVisibility(0);
            this.Q.setText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public void setSkipText(String str) {
        TextView textView = this.Q;
        if (textView != null) {
            textView.setVisibility(0);
            this.Q.setText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l, com.fyber.inneractive.sdk.player.ui.h
    public void a(b bVar) {
        View view = bVar.e;
        this.p = view;
        if (view == null || this.z == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.p);
        }
        ViewGroup viewGroup = this.T;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        TextView textView = this.Q;
        if (textView != null) {
            textView.setVisibility(4);
        }
        b(bVar);
        this.z.addView(this.p, 0);
        c(bVar);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public void e() {
        super.e();
        this.V = (ViewGroup) findViewById(R.id.ia_video_controls_overlay);
        this.S = findViewById(R.id.ia_cta_container);
        this.w = (IAsmoothProgressBar) findViewById(R.id.ia_video_progressbar_new);
        ImageView imageView = (ImageView) findViewById(R.id.ia_iv_skip);
        this.R = imageView;
        imageView.setEnabled(false);
        this.Q = (TextView) findViewById(R.id.ia_tv_skip_left);
        this.T = (ViewGroup) findViewById(R.id.ia_identifier_overlay);
        this.u = (ImageView) findViewById(R.id.ia_iv_mute_button_new);
        this.I = findViewById(R.id.ia_click_overlay);
        this.w.setVisibility(0);
        this.u.setVisibility(0);
        a(this.R, 6);
        a(this.u, 1);
        s sVar = this.K;
        if (sVar != null) {
            setSizesAndTint((r) sVar.a(r.class));
            setProgressBarTint((r) this.K.a(r.class));
        }
    }
}
