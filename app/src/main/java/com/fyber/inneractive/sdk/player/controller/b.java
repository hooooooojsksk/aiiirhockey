package com.fyber.inneractive.sdk.player.controller;

import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.player.controller.u;

/* loaded from: classes.dex */
public interface b<ListenerT extends u> {
    void a(long j);

    void a(Bitmap bitmap);

    void a(com.fyber.inneractive.sdk.model.vast.g gVar, int i);

    void a(c cVar);

    void a(ListenerT listenert);

    void b(int i);

    com.fyber.inneractive.sdk.flow.vast.e c();

    void c(boolean z);

    void d(boolean z);

    boolean d();

    void destroy();

    boolean e();

    void h();

    void pauseVideo();
}
