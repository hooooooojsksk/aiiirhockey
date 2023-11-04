package com.fyber.inneractive.sdk.mraid;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.web.i;
import java.util.Map;

/* loaded from: classes.dex */
public class o extends b {
    public o(Map<String, String> map, com.fyber.inneractive.sdk.web.i iVar, k0 k0Var) {
        super(map, iVar, k0Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public void a() {
        int a = a("w");
        int a2 = a("h");
        int a3 = a("offsetX");
        int a4 = a("offsetY");
        boolean equals = InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equals(this.b.get("allowOffscreen"));
        this.b.get("customClosePosition");
        if (a <= 0) {
            a = this.c.c0;
        }
        if (a2 <= 0) {
            a2 = this.c.d0;
        }
        com.fyber.inneractive.sdk.web.i iVar = this.c;
        com.fyber.inneractive.sdk.web.g gVar = iVar.b;
        if (gVar == null) {
            return;
        }
        try {
            ViewGroup viewGroup = (ViewGroup) gVar.getRootView().findViewById(16908290);
            iVar.U = viewGroup;
            if (viewGroup == null) {
                IAlog.e("Couldn't find content in the view tree", new Object[0]);
                iVar.a(g.RESIZE, "Ad can be resized only if it's state is default or resized.");
            } else if (iVar.R == i.d.DISABLED) {
            } else {
                b0 b0Var = iVar.Q;
                if (b0Var != b0.DEFAULT && b0Var != b0.RESIZED) {
                    iVar.a(g.RESIZE, "Ad can be resized only if it's state is default or resized.");
                } else if (a < 0 && a2 < 0) {
                    iVar.a(g.RESIZE, "Creative size passed to resize() was invalid.");
                } else {
                    iVar.c(false);
                    i.h hVar = iVar.S;
                    if (hVar == i.h.ALWAYS_VISIBLE || (!iVar.a0 && hVar != i.h.ALWAYS_HIDDEN)) {
                        iVar.d(true);
                    }
                    iVar.e(false);
                    iVar.h0 = com.fyber.inneractive.sdk.util.l.b(a2);
                    iVar.g0 = com.fyber.inneractive.sdk.util.l.b(a);
                    if (!equals) {
                        int i = (a3 + a) - iVar.c0;
                        if (i > 0) {
                            a3 -= i;
                        }
                        if (a3 < 0) {
                            a3 = 0;
                        }
                        int i2 = (a4 + a2) - iVar.d0;
                        if (i2 > 0) {
                            a4 -= i2;
                        }
                        if (a4 < 0) {
                            a4 = 0;
                        }
                    }
                    ViewGroup.LayoutParams layoutParams = iVar.b.getLayoutParams();
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        int[] iArr = null;
                        if (a3 == 0 && a4 == 0) {
                            iArr = new int[]{13};
                        }
                        RelativeLayout.LayoutParams a5 = com.fyber.inneractive.sdk.util.q.a(com.fyber.inneractive.sdk.util.l.b(a), com.fyber.inneractive.sdk.util.l.b(a2), iArr);
                        a5.leftMargin = a3;
                        a5.topMargin = a4;
                        iVar.b.setLayoutParams(a5);
                    } else if (layoutParams instanceof FrameLayout.LayoutParams) {
                        iVar.b.setLayoutParams(new FrameLayout.LayoutParams(com.fyber.inneractive.sdk.util.l.b(a), com.fyber.inneractive.sdk.util.l.b(a2), 17));
                    }
                    b0 b0Var2 = iVar.Q;
                    b0 b0Var3 = b0.RESIZED;
                    if (b0Var2 != b0Var3) {
                        iVar.Q = b0Var3;
                        iVar.a(new z(b0Var3));
                        int i3 = iVar.g0;
                        if (i3 != -1 && iVar.h0 != -1) {
                            iVar.a(new t(com.fyber.inneractive.sdk.util.l.c(i3), com.fyber.inneractive.sdk.util.l.c(iVar.h0)));
                        }
                    }
                    iVar.a(g.RESIZE);
                    L l = iVar.g;
                    if (l != 0) {
                        ((i.f) l).b(iVar);
                    }
                }
            }
        } catch (Exception unused) {
            IAlog.e("Couldn't find content in the view tree", new Object[0]);
            iVar.a(g.RESIZE, "Ad can be resized only if it's state is default or resized.");
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public boolean b() {
        return true;
    }
}
