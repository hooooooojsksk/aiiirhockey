package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.i;

/* loaded from: classes.dex */
public class p implements Runnable {
    public final /* synthetic */ i.c a;

    public p(i.c cVar) {
        this.a = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        i iVar = i.this;
        iVar.getClass();
        com.fyber.inneractive.sdk.util.m.b.post(new o(iVar, "Image failed to download."));
        i.this.a(com.fyber.inneractive.sdk.mraid.g.STORE_PICTURE, "Error downloading and saving image file.");
        IAlog.a("failed to download and save the image file.", new Object[0]);
    }
}
