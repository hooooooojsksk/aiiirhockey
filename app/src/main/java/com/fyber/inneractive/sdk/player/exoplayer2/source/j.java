package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.source.i;

/* loaded from: classes.dex */
public class j implements Runnable {
    public final /* synthetic */ i.d a;
    public final /* synthetic */ i b;

    public j(i iVar, i.d dVar) {
        this.b = iVar;
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        i.d dVar = this.a;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.f fVar = dVar.c;
        if (fVar != null) {
            fVar.b();
            dVar.c = null;
        }
        int size = this.b.o.size();
        for (int i = 0; i < size; i++) {
            this.b.o.valueAt(i).b();
        }
    }
}
