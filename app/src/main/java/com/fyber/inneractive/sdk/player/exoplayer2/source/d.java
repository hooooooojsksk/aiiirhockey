package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.source.f;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;

/* loaded from: classes.dex */
public class d implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ IOException d;
    public final /* synthetic */ f.a e;

    public d(f.a aVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar, int i, int i2, com.fyber.inneractive.sdk.player.exoplayer2.i iVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        this.e = aVar;
        this.a = obj;
        this.b = j;
        this.c = j2;
        this.d = iOException;
    }

    @Override // java.lang.Runnable
    public void run() {
        f.a aVar = this.e;
        f fVar = aVar.b;
        f.a.a(aVar, this.b);
        f.a.a(this.e, this.c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadError called. with exception %s", ((com.fyber.inneractive.sdk.player.controller.s) fVar).b(), this.d);
    }
}
