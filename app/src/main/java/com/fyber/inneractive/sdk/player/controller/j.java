package com.fyber.inneractive.sdk.player.controller;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.player.controller.r;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k0;

/* loaded from: classes.dex */
public class j extends k<r.a> implements r {
    public Runnable C;
    public float D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            j.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.i(false);
            j.this.C = null;
        }
    }

    public j(com.fyber.inneractive.sdk.player.b bVar, com.fyber.inneractive.sdk.player.ui.l lVar, a0 a0Var, com.fyber.inneractive.sdk.config.global.s sVar, boolean z, String str, boolean z2) {
        super(bVar, lVar, a0Var, sVar, z, str, z2);
        this.E = 0.0f;
        this.F = false;
        this.G = false;
        this.H = false;
        this.D = ((a0) this.b).b().b().intValue() / 100.0f;
        I();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void A() {
        super.A();
        J();
        this.d.b(false);
        this.F = true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public boolean B() {
        return false;
    }

    public final void F() {
        if (this.g == 0 || this.H) {
            return;
        }
        H();
        super.l();
        ((r.a) this.g).c();
        IAlog.a("%sopening fullscreen", IAlog.a(this));
        this.H = true;
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar != null) {
            com.fyber.inneractive.sdk.player.e eVar = (com.fyber.inneractive.sdk.player.e) bVar;
            eVar.a(eVar.x, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.s.EVENT_FULLSCREEN, com.fyber.inneractive.sdk.model.vast.s.EVENT_EXPAND);
        }
    }

    public final void G() {
        com.fyber.inneractive.sdk.player.b bVar;
        g gVar;
        com.fyber.inneractive.sdk.player.ui.l lVar;
        if (this.E < this.D || (bVar = this.a) == null || (gVar = bVar.b) == null || gVar.e.equals(com.fyber.inneractive.sdk.player.enums.b.Completed) || (lVar = this.d) == null || lVar.f() || this.a.b.j == null) {
            return;
        }
        if (((a0) this.b).f.a.booleanValue() || this.F) {
            b(IAConfigManager.M.i.b);
        }
    }

    public final void H() {
        if (this.C != null) {
            IAlog.a("%sCancelling play runnable", IAlog.a(this));
            this.d.removeCallbacks(this.C);
            this.C = null;
        }
    }

    public final void I() {
        g gVar;
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar == null || (gVar = bVar.b) == null || gVar.n) {
            return;
        }
        if (((a0) this.b).f.d.booleanValue()) {
            this.a.b.b(false);
        } else if (t()) {
        } else {
            this.a.b.d(false);
        }
    }

    public void J() {
        com.fyber.inneractive.sdk.player.ui.l lVar;
        ImageView imageView;
        if (((a0) this.b).f.i != TapAction.FULLSCREEN && (imageView = (lVar = this.d).v) != null) {
            imageView.setVisibility(0);
            lVar.v.setSelected(false);
        }
        C();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k, com.fyber.inneractive.sdk.player.ui.i
    public void a(boolean z) {
        if (z) {
            a(this.E);
        }
        super.a(z);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void b(int i) {
        g gVar;
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar == null || (gVar = bVar.b) == null || gVar.e == com.fyber.inneractive.sdk.player.enums.b.Playing || this.C != null) {
            return;
        }
        IAlog.a("%splayVideo %s", IAlog.a(this), this.d);
        if (i == 0) {
            i(false);
            return;
        }
        a aVar = new a();
        this.C = aVar;
        this.d.postDelayed(aVar, i);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k, com.fyber.inneractive.sdk.player.controller.b
    public void d(boolean z) {
        g gVar;
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar != null && (gVar = bVar.b) != null && !gVar.e.equals(com.fyber.inneractive.sdk.player.enums.b.Completed)) {
            J();
        }
        com.fyber.inneractive.sdk.player.b bVar2 = this.a;
        Bitmap bitmap = bVar2 != null ? bVar2.l : null;
        if (bitmap != null) {
            this.d.b(true);
            this.d.setLastFrameBitmap(bitmap);
        }
        super.d(z);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k, com.fyber.inneractive.sdk.player.controller.b
    public void destroy() {
        H();
        this.g = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k, com.fyber.inneractive.sdk.player.controller.b
    public boolean e() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void i(boolean z) {
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar == null || bVar.b == null) {
            return;
        }
        I();
        super.i(z);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public boolean k() {
        super.k();
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar != null && bVar.b != null) {
            IAlog.a("%sconnectToTextureView playing state = %s", IAlog.a(this), this.a.b.e);
            if (this.a.b.j()) {
                this.d.c(!this.a.k);
                com.fyber.inneractive.sdk.player.ui.l lVar = this.d;
                com.fyber.inneractive.sdk.player.ui.c cVar = new com.fyber.inneractive.sdk.player.ui.c();
                cVar.b = false;
                lVar.d(new com.fyber.inneractive.sdk.player.ui.b(cVar));
                this.d.b(false);
                I();
            }
        }
        a(this.E);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void l() {
        H();
        super.l();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public int o() {
        return IAConfigManager.M.u.b.a("VideoAdBufferingTimeout", 5, 1) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k, com.fyber.inneractive.sdk.player.controller.b
    public void pauseVideo() {
        H();
        super.pauseVideo();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public int s() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void w() {
        F();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void x() {
        j();
        this.d.a(false);
        D();
        H();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void y() {
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar == null || bVar.b == null) {
            return;
        }
        k();
        i(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void z() {
        G();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k, com.fyber.inneractive.sdk.player.ui.i
    public void f() {
        IAlog.a("%sonVideoViewDetachedFromWindow", IAlog.a(this));
        l();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void u() {
        IAlog.a("%s onBufferingTimeout reached. Skipping to end card", IAlog.a(this));
        if (this.d.e) {
            this.u = true;
            c(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void a(k0 k0Var) {
        TapAction tapAction = ((a0) this.b).f.i;
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar == null || bVar.b == null || this.E >= this.D) {
            if (tapAction == TapAction.CTR) {
                Bitmap h = h(false);
                if (!a(false, VideoClickOrigin.CTA, k0Var) || h == null) {
                    return;
                }
                this.d.setLastFrameBitmap(h);
                this.d.b(true);
            } else if (tapAction == TapAction.FULLSCREEN) {
                F();
            } else if (tapAction != TapAction.DO_NOTHING) {
                IAlog.a("%sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.a(this), tapAction);
            } else if (bVar != null) {
                bVar.e();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.r
    public void b(boolean z) {
        com.fyber.inneractive.sdk.player.b bVar;
        g gVar;
        this.G = z;
        if (!z || (bVar = this.a) == null || (gVar = bVar.b) == null || gVar.j != null || !this.d.e || gVar.e.equals(com.fyber.inneractive.sdk.player.enums.b.Completed)) {
            return;
        }
        k();
        a(this.E);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.r
    public void a(float f) {
        g gVar;
        this.E = f;
        if (IAlog.a >= 3) {
            IAlog.c("%sonVisibilityChanged called with: %s vfpl = %s vfpa = %s", IAlog.a(this), Float.valueOf(f), Float.valueOf(this.D), Float.valueOf(1.0f - this.D));
        }
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar == null || (gVar = bVar.b) == null) {
            return;
        }
        if (gVar.e == com.fyber.inneractive.sdk.player.enums.b.Playing) {
            if (f <= this.D) {
                IAlog.d("%sonVisibilityChanged pausing player", IAlog.a(this));
                if (this.a.b.j != null) {
                    this.F = false;
                    h(false);
                    H();
                    super.pauseVideo();
                    g(false);
                    return;
                }
                return;
            }
            return;
        }
        G();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.r
    public void a() {
        g gVar;
        IAlog.a("%sfullscreenExited called", IAlog.a(this));
        this.H = false;
        b(this.G);
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar == null || (gVar = bVar.b) == null) {
            return;
        }
        a(gVar.e);
        a(this.a.b.c());
    }
}
