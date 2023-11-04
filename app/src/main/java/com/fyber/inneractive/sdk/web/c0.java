package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.fyber.inneractive.sdk.measurement.a;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.d0;
import com.fyber.inneractive.sdk.web.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class c0<T extends d0> extends com.fyber.inneractive.sdk.web.d<T> {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public com.fyber.inneractive.sdk.mraid.b0 I;
    public i.g J;
    public com.fyber.inneractive.sdk.measurement.a K;
    public a.InterfaceC0020a L;
    public final Runnable M;
    public ViewTreeObserver.OnPreDrawListener N;
    public final Runnable O;
    public final Runnable P;
    public int w;
    public int x;
    public int y;
    public int z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            c0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = c0.this.b;
            if (gVar != null) {
                gVar.getViewTreeObserver().addOnPreDrawListener(c0.this.N);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnPreDrawListener {
        public b() {
            c0.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            g gVar;
            g gVar2 = c0.this.b;
            if (gVar2 != null) {
                gVar2.getViewTreeObserver().removeOnPreDrawListener(this);
                c0.this.n();
                c0 c0Var = c0.this;
                c0Var.a(new com.fyber.inneractive.sdk.mraid.x(c0Var.J));
                c0 c0Var2 = c0.this;
                if (c0Var2.J == i.g.INTERSTITIAL && (gVar = c0Var2.b) != null) {
                    gVar.a("if (window.showInterstitial) { showInterstitial(); }");
                }
                c0.this.l();
                c0 c0Var3 = c0.this;
                c0Var3.a(c0Var3.m(), true);
                c0.this.r();
                com.fyber.inneractive.sdk.util.m.b.postDelayed(c0.this.O, 100L);
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
            c0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.InterfaceC0020a interfaceC0020a;
            c0 c0Var = c0.this;
            if (c0Var.K == null || (interfaceC0020a = c0Var.L) == null) {
                return;
            }
            interfaceC0020a.a();
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
            c0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = c0.this.b;
            if (gVar != null) {
                gVar.a("if (FyberMraidVideoController.getCurrentTime() < 0.2) { var ifr = document.createElement('iframe'); var container = document.body || document.documentElement; container.appendChild(ifr); ifr.setAttribute('sandbox', ''); ifr.setAttribute('style', 'position: fixed; bottom: -20px; border: none; visibility: hidden; height: 20px; z-index: -99999'); ifr.setAttribute('src','FyMraidVideo://fyMraidVideoAdPlaybackFailure'); console.log('dispatched closure event'); } else { console.log('video has progressed'); };");
            }
        }
    }

    public c0(Context context, boolean z, boolean z2, i.g gVar) {
        super(context, z, z2);
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.B = -1;
        this.C = false;
        this.D = true;
        this.E = false;
        this.F = false;
        this.G = false;
        this.I = com.fyber.inneractive.sdk.mraid.b0.HIDDEN;
        this.L = null;
        this.M = new a();
        this.N = new b();
        this.O = new c();
        this.P = new d();
        this.J = gVar;
    }

    public void a(ArrayList<com.fyber.inneractive.sdk.mraid.u> arrayList) {
        String arrayList2;
        if (this.b != null) {
            if (arrayList.toString().length() < 2) {
                return;
            }
            String str = "{" + arrayList2.substring(1, arrayList2.length() - 1) + "}";
            this.b.a("window.mraidbridge.fireChangeEvent(" + str + ");");
            IAlog.d("Fire changes: %s", str);
        }
    }

    public void l() {
        g gVar = this.b;
        if (gVar != null) {
            gVar.a("window.mraidbridge.fireReadyEvent();");
        }
    }

    public Context m() {
        g gVar = this.b;
        if (gVar != null) {
            return gVar.getContext();
        }
        return null;
    }

    public void n() {
        ArrayList<com.fyber.inneractive.sdk.mraid.u> arrayList = new ArrayList<>();
        g gVar = this.b;
        if (gVar != null && gVar.getScaleX() != 1.0f && this.b.getScaleY() != 1.0f) {
            int widthDp = this.b.getWidthDp();
            int heightDp = this.b.getHeightDp();
            arrayList.add(new com.fyber.inneractive.sdk.mraid.y(widthDp, heightDp));
            arrayList.add(new com.fyber.inneractive.sdk.mraid.w(widthDp, heightDp));
        } else {
            arrayList.add(new com.fyber.inneractive.sdk.mraid.y(this.y, this.z));
            arrayList.add(new com.fyber.inneractive.sdk.mraid.w(this.w, this.x));
        }
        g gVar2 = this.b;
        int c2 = com.fyber.inneractive.sdk.util.l.c(gVar2 != null ? gVar2.getWidth() : this.w);
        g gVar3 = this.b;
        arrayList.add(new com.fyber.inneractive.sdk.mraid.v(0, 0, c2, com.fyber.inneractive.sdk.util.l.c(gVar3 != null ? gVar3.getHeight() : this.x)));
        a(arrayList);
        com.fyber.inneractive.sdk.mraid.b0 b0Var = com.fyber.inneractive.sdk.mraid.b0.DEFAULT;
        this.I = b0Var;
        a(new com.fyber.inneractive.sdk.mraid.z(b0Var));
    }

    public void o() {
        g gVar = this.b;
        if (gVar != null) {
            this.E = true;
            if (Build.VERSION.SDK_INT >= 17 && this.C) {
                gVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            com.fyber.inneractive.sdk.util.m.b.postDelayed(this.M, 0L);
        }
    }

    public boolean p() {
        return this.I == com.fyber.inneractive.sdk.mraid.b0.EXPANDED;
    }

    public boolean q() {
        i.g gVar = this.J;
        return gVar != null && gVar.equals(i.g.INTERSTITIAL);
    }

    public void r() {
        g gVar;
        if (this.E && this.F && this.C && (gVar = this.b) != null) {
            gVar.a("FyberMraidVideoController.play()");
            Runnable runnable = this.P;
            if (runnable != null) {
                com.fyber.inneractive.sdk.util.m.b.postDelayed(runnable, 5000L);
            }
            if (this.G) {
                this.b.a("FyberMraidVideoController.mute(true)");
            }
        }
    }

    public void setAdDefaultSize(int i, int i2) {
        this.A = i;
        this.B = i2;
    }

    public void setAutoplayMRAIDVideos(boolean z) {
        this.C = z;
    }

    public void setCenteringTagsRequired(boolean z) {
        this.D = z;
    }

    public void a(com.fyber.inneractive.sdk.mraid.u uVar) {
        if (this.b != null) {
            String str = "{" + uVar.toString() + "}";
            this.b.a("window.mraidbridge.fireChangeEvent(" + str + ");");
            IAlog.d("Fire changes: %s", str);
        }
    }

    public void a(Context context, boolean z) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (context != null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (Build.VERSION.SDK_INT >= 17) {
                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            } else {
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            }
        }
        int a2 = com.fyber.inneractive.sdk.util.l.a(context);
        int a3 = com.fyber.inneractive.sdk.util.l.a(context, a2);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        double d2 = i;
        double d3 = displayMetrics.densityDpi;
        Double.isNaN(d3);
        double d4 = 160.0d / d3;
        Double.isNaN(d2);
        int i3 = (int) (d2 * d4);
        double d5 = i2;
        Double.isNaN(d5);
        int i4 = (int) (d5 * d4);
        int i5 = (i2 - a2) - a3;
        g gVar = this.b;
        if (gVar != null && gVar.getScaleX() != 1.0f && this.b.getScaleY() != 1.0f) {
            i3 = this.b.getWidthDp();
            i4 = this.b.getHeightDp();
            i5 = (com.fyber.inneractive.sdk.util.l.b(this.b.getHeightDp()) - a2) - a3;
            this.w = this.y;
        } else {
            double d6 = displayMetrics.densityDpi;
            Double.isNaN(d6);
            Double.isNaN(d2);
            this.w = (int) (d2 * (160.0d / d6));
        }
        double d7 = i5;
        double d8 = displayMetrics.densityDpi;
        Double.isNaN(d8);
        Double.isNaN(d7);
        this.x = (int) (d7 * (160.0d / d8));
        if (this.y == i3 && this.z == i4) {
            return;
        }
        this.y = i3;
        this.z = i4;
        if (z) {
            a(new com.fyber.inneractive.sdk.mraid.y(i3, i4));
            a(new com.fyber.inneractive.sdk.mraid.w(this.w, this.x));
            a(new com.fyber.inneractive.sdk.mraid.v(0, 0, this.w, this.x));
            int i6 = this.A;
            if (i6 > 0 && this.B > 0) {
                a(new com.fyber.inneractive.sdk.mraid.t(com.fyber.inneractive.sdk.util.l.c(i6), com.fyber.inneractive.sdk.util.l.c(this.B)));
                return;
            }
            g gVar2 = this.b;
            if (gVar2 == null || gVar2.getWidth() <= 0 || this.b.getHeight() <= 0) {
                return;
            }
            a(new com.fyber.inneractive.sdk.mraid.t(com.fyber.inneractive.sdk.util.l.c(this.b.getWidth()), com.fyber.inneractive.sdk.util.l.c(this.b.getHeight())));
        }
    }
}
