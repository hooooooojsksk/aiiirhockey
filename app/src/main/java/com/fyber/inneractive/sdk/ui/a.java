package com.fyber.inneractive.sdk.ui;

import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.network.j0;
import com.fyber.inneractive.sdk.network.u;

/* loaded from: classes.dex */
public class a implements u<j0.a> {
    public final /* synthetic */ FyberAdIdentifier a;

    public a(FyberAdIdentifier fyberAdIdentifier) {
        this.a = fyberAdIdentifier;
    }

    @Override // com.fyber.inneractive.sdk.network.u
    public void a(j0.a aVar, Exception exc, boolean z) {
        Bitmap bitmap;
        j0.a aVar2 = aVar;
        if (exc != null || aVar2 == null || aVar2.b != null || (bitmap = aVar2.a) == null) {
            return;
        }
        this.a.h = bitmap;
    }
}
