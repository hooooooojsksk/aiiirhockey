package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* loaded from: classes.dex */
public class i implements View.OnClickListener {
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore a;

    public i(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.finish();
    }
}
