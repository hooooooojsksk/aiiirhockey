package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
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
public class k extends l {
    public a Q;
    public ViewGroup R;

    public k(Context context, com.fyber.inneractive.sdk.flow.d dVar, a aVar, s sVar, boolean z, String str) {
        super(context, sVar, str);
        LayoutInflater.from(context).inflate(R.layout.ia_video_view, (ViewGroup) this, true);
        e();
        this.Q = aVar;
        if (dVar != null) {
            dVar.a(this.R, FyberAdIdentifier.Corner.BOTTOM_LEFT);
        }
        g(z);
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
        b(bVar);
        this.z.addView(this.p, 0);
        c(bVar);
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
            this.i.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public void c() {
        TextView textView = this.o;
        if (textView != null) {
            textView.setEnabled(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public void d(boolean z) {
        TextView textView = this.o;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 4);
        }
    }

    public void e(boolean z) {
        TextView textView = this.n;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 4);
        }
    }

    public void f(boolean z) {
        ViewGroup viewGroup = this.R;
        if (viewGroup != null) {
            viewGroup.setVisibility(z ? 0 : 4);
        }
    }

    public void g(boolean z) {
        String str;
        boolean z2;
        String string = getContext().getString(R.string.ia_video_app_info_text);
        s sVar = this.K;
        if (sVar == null || sVar.a(r.class) == null) {
            str = string;
            z2 = true;
        } else {
            z2 = ((r) this.K.a(r.class)).a("show_ad_identifier_original_design", true);
            str = ((com.fyber.inneractive.sdk.config.global.features.n) this.K.a(com.fyber.inneractive.sdk.config.global.features.n.class)).c();
        }
        if (z && z2) {
            e(false);
            a(true, str);
            f(true);
        } else if (z) {
            e(false);
            a(true, str);
            f(false);
        } else if (z2) {
            a(false, (String) null);
            e(false);
            f(true);
        } else {
            e(true);
            f(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public View[] getTrackingFriendlyView() {
        return new View[]{this.k, this.n, this.o, this.u, this.w, this.I, this.J};
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return new View[]{this.q, this.R};
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public void h() {
        ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
        layoutParams.width = -2;
        this.k.setLayoutParams(layoutParams);
        this.k.setTextSize(0, getResources().getDimension(R.dimen.ia_video_overlay_text_large_for_cta));
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public void j() {
        a aVar = this.Q;
        if (aVar != null) {
            this.C = aVar.a(this.d, this.r, this.s, this.B, this.b, this.j, this.i);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public void setRemainingTime(String str) {
        TextView textView = this.n;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public void setSkipText(String str) {
        boolean z;
        if (this.o != null) {
            try {
                Integer.parseInt(str);
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                int parseInt = Integer.parseInt(str);
                TextView textView = this.o;
                textView.setText(textView.getContext().getString(R.string.ia_video_before_skip_format, Integer.valueOf(parseInt)));
                return;
            }
            this.o.setText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public void d() {
        d(false);
        ImageView imageView = this.u;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        IAsmoothProgressBar iAsmoothProgressBar = this.w;
        if (iAsmoothProgressBar != null) {
            iAsmoothProgressBar.setVisibility(4);
        }
        e(false);
        this.k.setVisibility(4);
        ImageView imageView2 = this.v;
        if (imageView2 != null) {
            imageView2.setVisibility(4);
        }
        f(false);
        a(false, (String) null);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public void e() {
        super.e();
        this.w = (IAsmoothProgressBar) findViewById(R.id.ia_video_progressbar);
        this.u = (ImageView) findViewById(R.id.ia_iv_mute_button);
        this.n = (TextView) findViewById(R.id.ia_tv_remaining_time);
        this.o = (TextView) findViewById(R.id.ia_tv_skip);
        this.R = (ViewGroup) findViewById(R.id.ia_identifier_overlay);
        this.I = findViewById(R.id.ia_click_overlay);
        this.w.setVisibility(0);
        this.u.setVisibility(0);
        a(this.u, 1);
        a(this.o, 6);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.d
    public void a(l0 l0Var, int i, int i2) {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a(this.d, this.r, this.s, this.t, l0Var, i, i2, this.b, ((a0) this.c).f.f.intValue());
        }
    }
}
