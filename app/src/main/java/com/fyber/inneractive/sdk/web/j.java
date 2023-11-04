package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public class j implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ i b;

    public j(i iVar, Context context) {
        this.b = iVar;
        this.a = context;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        g gVar = this.b.b;
        if (gVar != null) {
            gVar.getViewTreeObserver().removeOnPreDrawListener(this);
            this.b.a(this.a, true);
            return false;
        }
        return false;
    }
}
