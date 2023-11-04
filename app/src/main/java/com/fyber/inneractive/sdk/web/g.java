package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.web.w;

/* loaded from: classes.dex */
public class g extends WebView {
    public boolean a;
    public boolean b;
    public a c;
    public w d;
    public final k0 e;
    public int f;
    public int g;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(boolean z);

        void b();
    }

    public g() {
        super(null);
        this.a = false;
        this.e = k0.a();
    }

    public void a(String str) {
        IAlog.a("injecting JS: %s", str);
        if (str != null) {
            try {
                loadUrl("javascript:" + str);
            } catch (Exception unused) {
                IAlog.a("Failed to inject JS", new Object[0]);
            }
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        try {
            super.destroy();
        } catch (Throwable unused) {
        }
        this.c = null;
    }

    public int getHeightDp() {
        return this.g;
    }

    public boolean getIsVisible() {
        return this.b;
    }

    public k0 getLastClickedLocation() {
        return this.e;
    }

    public int getWidthDp() {
        return this.f;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a) {
            return;
        }
        this.a = true;
        a aVar = this.c;
        if (aVar != null) {
            aVar.a();
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b = false;
        if (this.a) {
            this.a = false;
            a aVar = this.c;
            if (aVar != null) {
                aVar.b();
            }
            a();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && motionEvent.getEventTime() - motionEvent.getDownTime() >= ViewConfiguration.getLongPressTimeout()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, x, y, 0));
            dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, x, y, 0));
        }
        w wVar = this.d;
        if (wVar != null) {
            wVar.onTouch(this, motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            k0 k0Var = this.e;
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            k0Var.a = x2;
            k0Var.b = y2;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        IAlog.d("onWindowFocusChanged with: %s", Boolean.valueOf(z));
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 8) {
            a(false);
        } else {
            a();
        }
    }

    public void setHeightDp(int i) {
        this.g = i;
    }

    public void setListener(a aVar) {
        this.c = aVar;
    }

    public void setTapListener(w.a aVar) {
        this.d = new w(aVar, IAConfigManager.M.v.a());
    }

    public void setWidthDp(int i) {
        this.f = i;
    }

    public boolean a() {
        boolean z = false;
        IAlog.d("updateVisibility called - is = %s hwf = %s atw = %swinToken - %s app token - %s", Boolean.valueOf(isShown()), Boolean.valueOf(hasWindowFocus()), Boolean.valueOf(this.a), getWindowToken(), getApplicationWindowToken());
        if (getWindowToken() != getApplicationWindowToken()) {
            if (getWindowVisibility() != 8 && isShown() && this.a) {
                z = true;
            }
            return a(z);
        }
        if (isShown() && hasWindowFocus() && this.a) {
            z = true;
        }
        return a(z);
    }

    public g(Context context) {
        super(IAConfigManager.b().a());
        this.a = false;
        this.e = k0.a();
    }

    public final boolean a(boolean z) {
        if (z) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                Rect rect = new Rect();
                viewGroup.getHitRect(rect);
                if (!getLocalVisibleRect(rect) && getWindowToken() == getApplicationWindowToken()) {
                    IAlog.d("updateVisibility - Cannot find local visible rect. Scrolled out?", new Object[0]);
                    z = false;
                }
            } else {
                IAlog.d("updateVisibility - No parent available", new Object[0]);
            }
        }
        if (this.b != z) {
            this.b = z;
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(z);
            }
            return true;
        }
        return false;
    }
}
