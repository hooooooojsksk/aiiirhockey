package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.work.WorkRequest;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.b0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.t;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.flow.o;
import com.fyber.inneractive.sdk.flow.p;
import com.fyber.inneractive.sdk.flow.z;
import com.fyber.inneractive.sdk.measurement.tracker.c;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.v;
import com.fyber.inneractive.sdk.web.i;
import cz.msebera.android.httpclient.HttpStatus;

/* loaded from: classes.dex */
public class g extends p<z, InneractiveAdViewEventsListener> implements com.fyber.inneractive.sdk.interfaces.b, v.b {
    public InneractiveAdViewUnitController m;
    public IAmraidWebViewController n;
    public i.f o;
    public ViewGroup q;
    public RelativeLayout r;
    public Runnable t;
    public com.fyber.inneractive.sdk.renderers.b z;
    public long l = 0;
    public boolean p = false;
    public long s = 0;
    public int u = 0;
    public long v = 0;
    public boolean w = false;
    public boolean x = true;
    public boolean y = false;

    /* loaded from: classes.dex */
    public static class a extends RelativeLayout {
        public final float a;

        public a(Context context, float f) {
            super(context);
            this.a = f;
        }

        @Override // android.widget.RelativeLayout, android.view.View
        public void onMeasure(int i, int i2) {
            int i3;
            View.MeasureSpec.getMode(i);
            int mode = View.MeasureSpec.getMode(i2);
            if (mode != 0 && (mode != Integer.MIN_VALUE || View.MeasureSpec.getSize(i2) <= 0)) {
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                i3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            } else {
                int size3 = View.MeasureSpec.getSize(i);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                float f = this.a;
                if (f != 0.0f) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (size3 * f), 1073741824);
                }
                i3 = makeMeasureSpec;
            }
            super.onMeasure(i3, i2);
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        BANNER_WIDTH(320),
        BANNER_HEIGHT(50),
        BANNER_TABLET_HEIGHT(90),
        BANNER_TABLET_WIDTH(728),
        RECTANGLE_HEIGHT(250),
        RECTANGLE_WIDTH(HttpStatus.SC_MULTIPLE_CHOICES);
        
        public final int value;

        b(int i) {
            this.value = i;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p
    public int A() {
        IAmraidWebViewController iAmraidWebViewController = this.n;
        if (iAmraidWebViewController != null) {
            if (iAmraidWebViewController.b != null && iAmraidWebViewController.p()) {
                return com.fyber.inneractive.sdk.util.l.c(this.n.b.getWidth());
            }
            return com.fyber.inneractive.sdk.util.l.c(this.n.g0);
        }
        return -1;
    }

    public final void J() {
        if (this.t != null) {
            IAlog.a("%scancelling refreen runnable", IAlog.a(this));
            com.fyber.inneractive.sdk.util.m.b.removeCallbacks(this.t);
            this.t = null;
        }
    }

    public final void K() {
        com.fyber.inneractive.sdk.renderers.b bVar = this.z;
        if (bVar != null) {
            bVar.c();
        }
        if (this.n != null) {
            J();
            AdContent adcontent = this.b;
            if (adcontent != 0) {
                ((z) adcontent).a();
            }
            this.n = null;
            this.b = null;
            ViewGroup viewGroup = this.q;
            if (viewGroup != null) {
                viewGroup.removeView(this.r);
            }
        }
        this.w = false;
    }

    public final int L() {
        t tVar;
        int intValue;
        int i = this.u;
        if (i == -1) {
            IAlog.a("%sreturning disable value for banner refresh", IAlog.a(this));
            return 0;
        }
        if (i > 0) {
            IAlog.a("%sreturning overriden refresh interval = %d", IAlog.a(this), Integer.valueOf(this.u));
            intValue = this.u;
        } else {
            b0 b0Var = this.a.getAdContent().d;
            if (b0Var != null && (tVar = ((a0) b0Var).c) != null) {
                Integer num = tVar.a;
                IAlog.a("%sreturning refreshConfig = %d", IAlog.a(this), num);
                if (num != null) {
                    intValue = num.intValue();
                }
            }
            IAlog.a("%sgetRefreshInterval: returning 0. Refresh is disabled", IAlog.a(this));
            return 0;
        }
        return intValue * 1000;
    }

    public final void M() {
        IAmraidWebViewController iAmraidWebViewController = this.n;
        if (iAmraidWebViewController == null || iAmraidWebViewController.b == null) {
            return;
        }
        IAlog.a("%srefreshing ad", IAlog.a(this));
        if (!this.n.p() || this.n.t()) {
            this.s = 0L;
            this.m.refreshAd();
        }
    }

    public final void N() {
        com.fyber.inneractive.sdk.web.g gVar;
        IAmraidWebViewController iAmraidWebViewController = this.n;
        if (iAmraidWebViewController == null || (gVar = iAmraidWebViewController.b) == null || !gVar.getIsVisible() || this.s == 0 || this.n.p() || this.n.t()) {
            return;
        }
        if (!this.x) {
            if (this.l < System.currentTimeMillis() - this.s) {
                this.v = 1L;
            } else {
                this.v = this.l - (System.currentTimeMillis() - this.s);
            }
        }
        IAlog.a("%sresuming refresh runnable mRefreshTimeStamp %d", IAlog.a(this), Long.valueOf(this.v));
        a(this.v, false);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a() {
    }

    @Override // com.fyber.inneractive.sdk.flow.p
    public void b(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.n;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(view, c.EnumC0022c.ProgressOverlay);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public boolean canRefreshAd() {
        IAmraidWebViewController iAmraidWebViewController = this.n;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.p() || this.n.t()) ? false : true;
        }
        return true;
    }

    public final void d(boolean z) {
        if (this.t != null) {
            this.x = z;
            J();
            this.v = this.l - (System.currentTimeMillis() - this.s);
            IAlog.a("%sPause refresh time : time remaning:%d ,refreshInterval: %d", IAlog.a(this), Long.valueOf(this.v), Long.valueOf(this.l));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        J();
        K();
        this.o = null;
        v.a.a.a.remove(this);
        Runnable runnable = this.t;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.m.b.removeCallbacks(runnable);
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public int f() {
        return this.n.g0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void n() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public int p() {
        return this.n.h0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void u() {
        com.fyber.inneractive.sdk.renderers.b bVar = this.z;
        if (bVar != null) {
            bVar.c();
        }
        RelativeLayout relativeLayout = this.r;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        ViewGroup viewGroup = this.q;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.q = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p
    public View y() {
        IAmraidWebViewController iAmraidWebViewController = this.n;
        if (iAmraidWebViewController != null) {
            return iAmraidWebViewController.b;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.p
    public int z() {
        IAmraidWebViewController iAmraidWebViewController = this.n;
        if (iAmraidWebViewController != null) {
            if (iAmraidWebViewController.b != null && iAmraidWebViewController.p()) {
                return com.fyber.inneractive.sdk.util.l.c(this.n.b.getHeight());
            }
            return com.fyber.inneractive.sdk.util.l.c(this.n.h0);
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public boolean a(o oVar) {
        return oVar instanceof z;
    }

    @Override // com.fyber.inneractive.sdk.util.v.b
    public void c(boolean z) {
        IAlog.a("%sgot onLockScreenStateChanged with: %s", IAlog.a(this), Boolean.valueOf(z));
        if (z) {
            d(false);
            com.fyber.inneractive.sdk.renderers.b bVar = this.z;
            if (bVar == null || !bVar.h) {
                return;
            }
            bVar.c();
            return;
        }
        N();
        com.fyber.inneractive.sdk.renderers.b bVar2 = this.z;
        if (bVar2 != null) {
            bVar2.b();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void r() {
        com.fyber.inneractive.sdk.web.g gVar;
        IAlog.a("%sgot onAdRefreshFailed", IAlog.a(this));
        IAmraidWebViewController iAmraidWebViewController = this.n;
        if (iAmraidWebViewController == null || (gVar = iAmraidWebViewController.b) == null) {
            return;
        }
        if (gVar.getIsVisible() && !v.a.a.b && !this.n.p() && !this.n.t()) {
            IAlog.a("%sview is visible and screen is unlocked: refreshing ad and webView is not expanded", IAlog.a(this));
            long L = L();
            this.l = L;
            if (L != 0) {
                a(WorkRequest.MIN_BACKOFF_MILLIS, false);
                return;
            }
            return;
        }
        IAlog.a("%sview is not visible or screen is locked or webView is Expanded or web is Resised. Waiting for visibility change", IAlog.a(this));
        this.v = 1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01be  */
    @Override // com.fyber.inneractive.sdk.interfaces.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.view.ViewGroup r18) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.g.a(android.view.ViewGroup):void");
    }

    @Override // com.fyber.inneractive.sdk.flow.p
    public void c(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.n;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(view);
        }
    }

    public final void a(long j, boolean z) {
        IAmraidWebViewController iAmraidWebViewController;
        com.fyber.inneractive.sdk.web.g gVar;
        if (!TextUtils.isEmpty(this.a.getMediationNameString()) || j == 0 || (this.a.getSelectedUnitController() instanceof InneractiveFullscreenUnitController) || this.u == -1 || (iAmraidWebViewController = this.n) == null || (gVar = iAmraidWebViewController.b) == null) {
            return;
        }
        if (!gVar.getIsVisible()) {
            IAlog.a("%sstartRefreshTimer called but ad is not visible", IAlog.a(this));
            return;
        }
        this.s = System.currentTimeMillis();
        this.l = z ? this.l : j;
        IAlog.a("%sstartRefreshTimer in %d msec, mRefreshInterval = %d", IAlog.a(this), Long.valueOf(j), Long.valueOf(this.l));
        if (j > 1) {
            Runnable runnable = this.t;
            if (runnable != null) {
                com.fyber.inneractive.sdk.util.m.b.removeCallbacks(runnable);
            }
            J();
            f fVar = new f(this);
            this.t = fVar;
            com.fyber.inneractive.sdk.util.m.b.postDelayed(fVar, j);
            return;
        }
        M();
    }

    public static l0 a(int i, int i2, b0 b0Var) {
        int a2;
        int a3;
        t tVar;
        IAlog.a("View layout params: response width and height: %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i > 0 && i2 > 0) {
            a2 = com.fyber.inneractive.sdk.util.l.a(i);
            a3 = com.fyber.inneractive.sdk.util.l.a(i2);
        } else {
            UnitDisplayType unitDisplayType = UnitDisplayType.BANNER;
            if (b0Var != null && (tVar = ((a0) b0Var).c) != null) {
                unitDisplayType = tVar.b;
            }
            if (unitDisplayType.equals(UnitDisplayType.MRECT)) {
                a2 = com.fyber.inneractive.sdk.util.l.a(b.RECTANGLE_WIDTH.value);
                a3 = com.fyber.inneractive.sdk.util.l.a(b.RECTANGLE_HEIGHT.value);
            } else if (com.fyber.inneractive.sdk.util.j.o()) {
                a2 = com.fyber.inneractive.sdk.util.l.a(b.BANNER_TABLET_WIDTH.value);
                a3 = com.fyber.inneractive.sdk.util.l.a(b.BANNER_TABLET_HEIGHT.value);
            } else {
                a2 = com.fyber.inneractive.sdk.util.l.a(b.BANNER_WIDTH.value);
                a3 = com.fyber.inneractive.sdk.util.l.a(b.BANNER_HEIGHT.value);
            }
        }
        IAlog.d("View layout params: final scaled width and height: %d, %d", Integer.valueOf(a2), Integer.valueOf(a3));
        return new l0(a2, a3);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public boolean a(View view) {
        return view.equals(this.q);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a(int i) {
        this.u = i;
    }

    public final void a(l0 l0Var) {
        FrameLayout frameLayout = new FrameLayout(this.q.getContext());
        frameLayout.setBackgroundResource(R.color.blank_background);
        this.q.removeAllViews();
        this.q.addView(frameLayout, new FrameLayout.LayoutParams(l0Var.a, l0Var.b, 17));
    }
}
