package com.fyber.inneractive.sdk.mraid;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.web.i;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;

/* loaded from: classes.dex */
public class e extends a {
    public e(Map<String, String> map, com.fyber.inneractive.sdk.web.i iVar, k0 k0Var) {
        super(map, iVar, k0Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public void a() {
        RelativeLayout relativeLayout;
        int a = a("w");
        int a2 = a("h");
        String str = this.b.get(ImagesContract.URL);
        boolean equals = InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equals(this.b.get("shouldUseCustomClose"));
        boolean equals2 = InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equals(this.b.get("lockOrientation"));
        if (a <= 0) {
            a = -1;
        }
        if (a2 <= 0) {
            a2 = -1;
        }
        com.fyber.inneractive.sdk.web.i iVar = this.c;
        if (iVar.b == null || iVar.R == i.d.DISABLED || iVar.Q != b0.DEFAULT) {
            return;
        }
        if (str != null && !URLUtil.isValidUrl(str)) {
            iVar.a(g.EXPAND, "URL passed to expand() was invalid.");
            return;
        }
        try {
            ViewGroup viewGroup = (ViewGroup) iVar.b.getRootView().findViewById(16908290);
            iVar.U = viewGroup;
            if (viewGroup == null) {
                IAlog.e("Couldn't find content in the view tree", new Object[0]);
                iVar.a(g.RESIZE, "Ad can be resized only if it's state is default or resized.");
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                iVar.p0 = new com.fyber.inneractive.sdk.web.m(iVar);
                if (iVar.m() instanceof Activity) {
                    ((Activity) iVar.m()).getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, iVar.p0);
                }
            }
            iVar.a0 = equals;
            L l = iVar.g;
            if (l != 0) {
                ((i.f) l).a(iVar, equals);
            }
            iVar.e(equals2);
            if (iVar.h0 >= 0) {
                iVar.h0 = com.fyber.inneractive.sdk.util.l.b(a2);
            }
            if (iVar.g0 >= 0) {
                iVar.g0 = com.fyber.inneractive.sdk.util.l.b(a);
            }
            com.fyber.inneractive.sdk.web.g gVar = iVar.b;
            if (str != null) {
                com.fyber.inneractive.sdk.web.g gVar2 = new com.fyber.inneractive.sdk.web.g(iVar.m());
                iVar.V = gVar2;
                gVar2.setId(R.id.inneractive_webview_mraid);
                iVar.V.loadUrl(str);
                iVar.V.setWebChromeClient(iVar.c);
                iVar.V.setWebViewClient(iVar.d);
                gVar = iVar.V;
                gVar.setOnKeyListener(new com.fyber.inneractive.sdk.web.n(iVar));
            } else {
                ViewGroup viewGroup2 = (ViewGroup) gVar.getParent();
                if (viewGroup2 != null) {
                    int childCount = viewGroup2.getChildCount();
                    int i = 0;
                    while (i < childCount && viewGroup2.getChildAt(i) != iVar.b) {
                        i++;
                    }
                    iVar.j0 = i;
                    com.fyber.inneractive.sdk.util.q.a(iVar.k0);
                    viewGroup2.addView(iVar.k0, i, com.fyber.inneractive.sdk.util.q.a(iVar.b.getWidth(), iVar.b.getHeight(), 13));
                    viewGroup2.removeView(iVar.b);
                }
            }
            float f = iVar.b0;
            int i2 = (int) ((50.0f * f) + 0.5f);
            if (a2 >= 0 && a >= 0) {
                a = (int) (a * f);
                a2 = (int) (a2 * f);
                if (a < i2) {
                    a = i2;
                }
                if (a2 < i2) {
                    a2 = i2;
                }
            }
            View view = new View(iVar.m());
            view.setBackgroundColor(iVar.m().getResources().getColor(R.color.ia_mraid_expanded_dimmed_bk));
            view.setOnTouchListener(new com.fyber.inneractive.sdk.web.h(iVar));
            iVar.m0.addView(view, new RelativeLayout.LayoutParams(-1, -1));
            com.fyber.inneractive.sdk.util.q.a(gVar);
            iVar.l0.addView(gVar, new RelativeLayout.LayoutParams(-1, -1));
            com.fyber.inneractive.sdk.util.q.a(iVar.l0);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a, a2);
            layoutParams.addRule(13);
            iVar.m0.addView(iVar.l0, layoutParams);
            com.fyber.inneractive.sdk.util.q.a(iVar.m0);
            iVar.U.addView(iVar.m0, new ViewGroup.LayoutParams(-1, -1));
            if (!gVar.hasFocus()) {
                gVar.requestFocus();
            }
            i.h hVar = iVar.S;
            if (hVar == i.h.ALWAYS_VISIBLE || (!iVar.a0 && hVar != i.h.ALWAYS_HIDDEN)) {
                iVar.d(true);
            }
            b0 b0Var = b0.EXPANDED;
            iVar.Q = b0Var;
            iVar.a(new z(b0Var));
            int i3 = iVar.g0;
            if (i3 != -1 && iVar.h0 != -1) {
                iVar.a(new t(com.fyber.inneractive.sdk.util.l.c(i3), com.fyber.inneractive.sdk.util.l.c(iVar.h0)));
            }
            iVar.a(g.EXPAND);
            if (iVar.m() != null) {
                int dimension = (int) iVar.m().getResources().getDimension(R.dimen.identifier_padding);
                com.fyber.inneractive.sdk.web.g gVar3 = iVar.b;
                if (gVar3 != null && (relativeLayout = (RelativeLayout) gVar3.findViewById(R.id.ia_identifier_overlay)) != null) {
                    relativeLayout.setPadding(dimension, 0, 0, dimension);
                }
            }
            L l2 = iVar.g;
            if (l2 != 0) {
                ((i.f) l2).a(iVar);
            }
        } catch (Exception unused) {
            IAlog.e("Couldn't find content in the view tree", new Object[0]);
            iVar.a(g.RESIZE, "Ad can be resized only if it's state is default or resized.");
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.a
    public String c() {
        return this.b.get(ImagesContract.URL);
    }
}
