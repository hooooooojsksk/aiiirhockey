package com.fyber.inneractive.sdk.player.controller;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.fyber.inneractive.sdk.player.controller.g;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class f implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ g a;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            f.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = f.this.a;
            g.InterfaceC0028g interfaceC0028g = gVar.d;
            if (interfaceC0028g != null) {
                TextureView textureView = gVar.j;
                q qVar = (q) interfaceC0028g;
                qVar.a.d.post(new p(qVar));
            }
        }
    }

    public f(g gVar) {
        this.a = gVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        g gVar = this.a;
        gVar.getClass();
        IAlog.a("%sonSurfaceTextureAvailable", IAlog.a(gVar));
        g gVar2 = this.a;
        boolean z = !surfaceTexture.equals(gVar2.k);
        gVar2.k = surfaceTexture;
        if (gVar2.l == null || z) {
            gVar2.l = new Surface(gVar2.k);
        }
        gVar2.a(gVar2.l);
        g gVar3 = this.a;
        g.InterfaceC0028g interfaceC0028g = gVar3.d;
        if (interfaceC0028g != null) {
            TextureView textureView = gVar3.j;
            k kVar = ((q) interfaceC0028g).a;
            kVar.getClass();
            IAlog.a("%sonSurfaceTextureAvailable", IAlog.a(kVar));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        g gVar = this.a;
        gVar.getClass();
        IAlog.a("%s onSurfaceTextureDestroyed", IAlog.a(gVar));
        this.a.k();
        this.a.a((Surface) null);
        this.a.o = true;
        g gVar2 = this.a;
        com.fyber.inneractive.sdk.player.enums.b bVar = gVar2.e;
        if (bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && bVar != com.fyber.inneractive.sdk.player.enums.b.Error && bVar != com.fyber.inneractive.sdk.player.enums.b.Idle) {
            gVar2.getClass();
            IAlog.a("%s caching surface texture", IAlog.a(gVar2));
            g gVar3 = this.a;
            gVar3.k = surfaceTexture;
            gVar3.i.post(new a());
            return false;
        }
        gVar2.getClass();
        IAlog.a("%sReleasing surface texture", IAlog.a(gVar2));
        this.a.k = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Surface surface;
        com.fyber.inneractive.sdk.player.b bVar;
        g gVar;
        g.InterfaceC0028g interfaceC0028g = this.a.d;
        if (interfaceC0028g != null && (bVar = ((q) interfaceC0028g).a.a) != null && (gVar = bVar.b) != null) {
            gVar.i.post(new i(gVar));
        }
        g gVar2 = this.a;
        if (!gVar2.o || (surface = gVar2.l) == null) {
            return;
        }
        gVar2.a(surface);
        this.a.o = false;
    }
}
