package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.util.x;
import com.fyber.inneractive.sdk.web.b;

/* loaded from: classes.dex */
public interface u {
    x.a a(k0 k0Var, com.fyber.inneractive.sdk.util.e eVar);

    x.a a(String str, k0 k0Var, b.a aVar, boolean z);

    void a(View view, String str);

    void a(String str, String str2);

    void a(boolean z);

    void a(boolean z, Orientation orientation);

    void e();

    void g();

    void h();

    void j();

    void k();

    void l();

    void onCompleted();

    void onPlayerError();

    void onProgress(int i, int i2);

    com.fyber.inneractive.sdk.ignite.k q();

    void s();
}
