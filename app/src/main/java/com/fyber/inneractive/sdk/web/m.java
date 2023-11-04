package com.fyber.inneractive.sdk.web;

import android.window.OnBackInvokedCallback;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class m implements OnBackInvokedCallback {
    public final /* synthetic */ i a;

    public m(i iVar) {
        this.a = iVar;
    }

    public void onBackInvoked() {
        i iVar = this.a;
        if (iVar.p()) {
            IAlog.d("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
            iVar.s();
        }
    }
}
