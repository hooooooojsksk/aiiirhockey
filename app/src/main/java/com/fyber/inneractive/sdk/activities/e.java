package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* loaded from: classes.dex */
public class e implements View.OnClickListener {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    public e(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.a.e.canGoBack()) {
            this.a.e.goBack();
        }
    }
}
