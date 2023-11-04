package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.q;
import cz.msebera.android.httpclient.cookie.ClientCookie;

/* loaded from: classes.dex */
public class c extends e {
    public boolean h;
    public boolean i;

    public c(com.fyber.inneractive.sdk.player.controller.c cVar) {
        super(cVar);
        this.h = false;
        this.i = false;
    }

    public final void a(q.a aVar) {
        String str = this.e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        aVar.a(ClientCookie.VERSION_ATTR, str);
    }
}
