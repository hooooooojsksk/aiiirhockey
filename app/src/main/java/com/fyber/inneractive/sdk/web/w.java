package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public final class w implements View.OnTouchListener {
    public final a a;
    public float b;
    public float c;
    public float d;

    /* loaded from: classes.dex */
    public interface a {
    }

    public w(a aVar, Context context) {
        this.a = aVar;
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        if (this.a != null) {
            if (motionEvent.getActionMasked() == 0) {
                ((d) this.a).j();
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
            } else if (motionEvent.getActionMasked() == 3) {
                ((d) this.a).j();
                this.c = -1.0f;
                this.b = -1.0f;
            } else if (motionEvent.getActionMasked() == 1) {
                if (this.b >= 0.0f && this.c >= 0.0f) {
                    float round = Math.round(Math.abs(this.c - motionEvent.getY()));
                    float f2 = this.d;
                    if (Math.round(Math.abs(f - motionEvent.getX())) < f2 && round < f2) {
                        d dVar = (d) this.a;
                        dVar.getClass();
                        IAlog.a("IAWebViewController onClicked()", new Object[0]);
                        if (dVar.l != null) {
                            IAlog.d("Native click detected in time. Processing pending click", new Object[0]);
                            dVar.l.d();
                            Runnable runnable = dVar.m;
                            if (runnable != null) {
                                com.fyber.inneractive.sdk.util.m.b.removeCallbacks(runnable);
                            }
                            dVar.l = null;
                            dVar.j();
                        } else {
                            if (dVar.n != null) {
                                com.fyber.inneractive.sdk.util.m.b.postDelayed(dVar.n, IAConfigManager.M.u.b.a("click_timeout", 1000, 1000));
                            }
                            dVar.j = true;
                        }
                    }
                    this.b = -1.0f;
                    this.c = -1.0f;
                }
            }
        }
        return false;
    }
}
