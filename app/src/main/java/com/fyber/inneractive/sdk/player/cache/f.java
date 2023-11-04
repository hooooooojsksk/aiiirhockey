package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.network.r;
import com.fyber.inneractive.sdk.player.cache.c;
import com.fyber.inneractive.sdk.player.cache.h;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;

/* loaded from: classes.dex */
public class f implements Runnable {
    public final /* synthetic */ h a;

    public f(h hVar) {
        this.a = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            h hVar = this.a;
            c.f b = hVar.b.b(hVar.a());
            h hVar2 = this.a;
            hVar2.c = b;
            if (b == null) {
                c.C0026c a = hVar2.b.a(hVar2.a());
                if (a == null) {
                    this.a.n = true;
                }
                if (a != null) {
                    h hVar3 = this.a;
                    IAlog.d("%s | start | got an editor for %s", hVar3.a, hVar3.a());
                    a.a();
                }
            }
        } catch (IOException e) {
            h hVar4 = this.a;
            IAlog.a(String.format("%s | Exception raised starting a new caching process for %s", hVar4.a, hVar4.a()), e, new Object[0]);
            r.a("Exception raised starting a new caching process", e.getMessage(), null, null);
        }
        h hVar5 = this.a;
        if (hVar5.c == null && !hVar5.n) {
            h.f fVar = hVar5.h;
            if (fVar != null) {
                fVar.start();
                return;
            }
            return;
        }
        h.b(hVar5, true);
    }
}
