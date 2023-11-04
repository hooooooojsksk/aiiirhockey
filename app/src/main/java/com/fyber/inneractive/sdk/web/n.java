package com.fyber.inneractive.sdk.web;

import android.view.KeyEvent;
import android.view.View;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class n implements View.OnKeyListener {
    public final /* synthetic */ i a;

    public n(i iVar) {
        this.a = iVar;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i == 4 && this.a.p()) {
            IAlog.d("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
            this.a.s();
            return true;
        }
        return false;
    }
}
