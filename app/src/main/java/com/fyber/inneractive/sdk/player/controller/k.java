package com.fyber.inneractive.sdk.player.controller;

import android.animation.ObjectAnimator;
import android.app.Application;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.b0;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.f0;
import com.fyber.inneractive.sdk.config.global.features.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.d0;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.player.controller.g;
import com.fyber.inneractive.sdk.player.controller.u;
import com.fyber.inneractive.sdk.player.e;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.util.y;
import com.fyber.inneractive.sdk.web.c0;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import cz.msebera.android.httpclient.HttpStatus;

/* loaded from: classes.dex */
public abstract class k<ListenerT extends u> implements com.fyber.inneractive.sdk.player.controller.b<ListenerT>, g.f, g.e, com.fyber.inneractive.sdk.player.ui.i {
    public Skip A;
    public boolean B;
    public com.fyber.inneractive.sdk.player.b a;
    public b0 b;
    public com.fyber.inneractive.sdk.config.global.s c;
    public com.fyber.inneractive.sdk.player.ui.l d;
    public g.InterfaceC0028g e;
    public int f;
    public ListenerT g;
    public boolean h;
    public float i;
    public Runnable j;
    public boolean k;
    public boolean l;
    public Application.ActivityLifecycleCallbacks m;
    public boolean n;
    public boolean o;
    public Bitmap p;
    public AsyncTask<?, ?, ?> q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public com.fyber.inneractive.sdk.ignite.k w;
    public com.fyber.inneractive.sdk.player.ui.f x;
    public String y;
    public boolean z;

    /* loaded from: classes.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public a(k kVar) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class b extends AsyncTask<Integer, Void, Bitmap> {
        public b() {
            k.this = r1;
        }

        @Override // android.os.AsyncTask
        public Bitmap doInBackground(Integer[] numArr) {
            Integer[] numArr2 = numArr;
            int intValue = numArr2[0].intValue();
            int intValue2 = numArr2[1].intValue();
            k.this.getClass();
            Application application = com.fyber.inneractive.sdk.util.l.a;
            Bitmap bitmap = null;
            if (application != null && application.getResources() != null && application.getResources().getDisplayMetrics() != null) {
                DisplayMetrics displayMetrics = application.getResources().getDisplayMetrics();
                try {
                    bitmap = Bitmap.createBitmap(intValue, intValue2, Bitmap.Config.ARGB_8888);
                    if (bitmap != null) {
                        bitmap.setDensity(displayMetrics.densityDpi);
                    }
                } catch (Throwable unused) {
                }
            }
            return bitmap;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            super.onPostExecute(bitmap2);
            k kVar = k.this;
            kVar.p = bitmap2;
            kVar.q = null;
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.fyber.inneractive.sdk.player.enums.b.values().length];
            a = iArr;
            try {
                iArr[com.fyber.inneractive.sdk.player.enums.b.Prepared.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Buffering.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Playing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Paused.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Completed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Error.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Preparing.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Seeking.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public k(com.fyber.inneractive.sdk.player.b bVar, com.fyber.inneractive.sdk.player.ui.l lVar, b0 b0Var, com.fyber.inneractive.sdk.config.global.s sVar, boolean z, String str, boolean z2) {
        this(bVar, lVar, b0Var, sVar, z, null, str, z2);
    }

    public void A() {
        g gVar;
        this.d.a(false);
        this.d.c(false);
        com.fyber.inneractive.sdk.player.ui.l lVar = this.d;
        com.fyber.inneractive.sdk.player.ui.c cVar = new com.fyber.inneractive.sdk.player.ui.c();
        cVar.b = false;
        lVar.d(new com.fyber.inneractive.sdk.player.ui.b(cVar));
        j();
        if (this.a != null && B() && !this.h) {
            int d = this.a.b.d();
            com.fyber.inneractive.sdk.player.b bVar = this.a;
            if (com.fyber.inneractive.sdk.player.b.a(d, ((com.fyber.inneractive.sdk.player.e) bVar).A, com.fyber.inneractive.sdk.player.b.a(bVar))) {
                if (this.f <= 0) {
                    this.d.d(true);
                    n();
                } else {
                    com.fyber.inneractive.sdk.player.b bVar2 = this.a;
                    if (bVar2 != null && (gVar = bVar2.b) != null) {
                        if (this.f >= gVar.d() / 1000) {
                            this.d.d(false);
                        }
                    }
                    if (!this.s) {
                        this.d.d(true);
                        c(this.f);
                        this.s = true;
                    }
                }
            }
        }
        ListenerT listenert = this.g;
        if (listenert != null && !this.k) {
            this.k = true;
            listenert.l();
        }
        this.o = false;
        this.t = false;
    }

    public abstract boolean B();

    public void C() {
        com.fyber.inneractive.sdk.config.global.s sVar;
        com.fyber.inneractive.sdk.config.global.s sVar2 = this.c;
        String str = null;
        com.fyber.inneractive.sdk.config.global.features.r rVar = sVar2 != null ? (com.fyber.inneractive.sdk.config.global.features.r) sVar2.a(com.fyber.inneractive.sdk.config.global.features.r.class) : null;
        boolean a2 = rVar != null ? rVar.a("show_cta", true) : true;
        ListenerT listenert = this.g;
        if (listenert != null) {
            this.w = listenert.q();
        }
        com.fyber.inneractive.sdk.ignite.k kVar = this.w;
        boolean z = kVar == com.fyber.inneractive.sdk.ignite.k.NONE ? a2 : true;
        com.fyber.inneractive.sdk.player.ui.l lVar = this.d;
        if (lVar.k != null) {
            lVar.k.setAllCaps((!z || (sVar = lVar.K) == null || sVar.a(com.fyber.inneractive.sdk.config.global.features.r.class) == null) ? false : ((com.fyber.inneractive.sdk.config.global.features.r) lVar.K.a(com.fyber.inneractive.sdk.config.global.features.r.class)).c());
            com.fyber.inneractive.sdk.config.global.s sVar3 = lVar.K;
            com.fyber.inneractive.sdk.config.global.features.d dVar = sVar3 != null ? (com.fyber.inneractive.sdk.config.global.features.d) sVar3.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
            if (dVar != null) {
                dVar.e(IAConfigManager.M.p);
                com.fyber.inneractive.sdk.model.vast.a aVar = dVar.e;
                if (aVar != null && aVar.d) {
                    str = aVar.a;
                }
            }
            if (IAConfigManager.M.E.d() && kVar.e()) {
                lVar.k.setText(R.string.ia_video_instant_install_text);
            } else if (!TextUtils.isEmpty(str)) {
                lVar.k.setText(str);
            } else {
                lVar.k.setText(R.string.ia_video_install_now_text);
            }
            if (!TextUtils.isEmpty(lVar.N)) {
                lVar.k.setText(lVar.N);
            }
            lVar.k.setVisibility(z ? 0 : 4);
        }
    }

    public void D() {
        Bitmap bitmap;
        String string;
        ListenerT listenert;
        com.fyber.inneractive.sdk.flow.k kVar;
        g gVar;
        g gVar2;
        com.fyber.inneractive.sdk.measurement.d dVar;
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar != null && ((((gVar2 = bVar.b) != null && gVar2.e.equals(com.fyber.inneractive.sdk.player.enums.b.Completed)) || this.t) && (dVar = this.a.i) != null)) {
            dVar.a();
        }
        IAConfigManager iAConfigManager = IAConfigManager.M;
        boolean z = false;
        boolean a2 = iAConfigManager.u.b.a("endcard").a("dsos", false);
        com.fyber.inneractive.sdk.player.b bVar2 = this.a;
        if ((bVar2 != null && (gVar = bVar2.b) != null && gVar.e.equals(com.fyber.inneractive.sdk.player.enums.b.Completed)) || (this.t && !a2) || this.u) {
            com.fyber.inneractive.sdk.player.b bVar3 = this.a;
            View c2 = bVar3 != null ? bVar3.c() : null;
            boolean z2 = c2 != null;
            this.d.d();
            com.fyber.inneractive.sdk.config.global.s sVar = this.c;
            com.fyber.inneractive.sdk.config.global.features.r rVar = sVar != null ? (com.fyber.inneractive.sdk.config.global.features.r) sVar.a(com.fyber.inneractive.sdk.config.global.features.r.class) : null;
            if (z2) {
                if (c2 instanceof com.fyber.inneractive.sdk.web.g) {
                    com.fyber.inneractive.sdk.player.b bVar4 = this.a;
                    com.fyber.inneractive.sdk.player.controller.c cVar = (bVar4 == null || (kVar = ((com.fyber.inneractive.sdk.player.e) bVar4).B) == null) ? null : kVar.m;
                    if (cVar != null) {
                        o oVar = new o(this);
                        c0 c0Var = cVar.a;
                        if (c0Var != null) {
                            c0Var.setListener(oVar);
                        }
                        c0 c0Var2 = cVar.a;
                        if (c0Var2 != null) {
                            y.a(cVar.c);
                            c0Var2.o();
                        }
                        c0 c0Var3 = cVar.a;
                        if (c0Var3 != null) {
                            c0Var3.a(true);
                        }
                    }
                    if (cVar != null) {
                        c0 c0Var4 = cVar.a;
                        if (c0Var4 != null && c0Var4.p()) {
                            return;
                        }
                    }
                }
                l();
                this.d.b(false);
                ViewGroup viewGroup = this.d.j;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                this.d.c(false);
                com.fyber.inneractive.sdk.player.ui.l lVar = this.d;
                com.fyber.inneractive.sdk.player.b bVar5 = this.a;
                com.fyber.inneractive.sdk.model.vast.c d = bVar5 != null ? bVar5.d() : null;
                com.fyber.inneractive.sdk.player.ui.c cVar2 = new com.fyber.inneractive.sdk.player.ui.c();
                cVar2.b = true;
                cVar2.g = c2;
                cVar2.h = d != null ? d.a : null;
                cVar2.c = rVar != null && rVar.c();
                r.c b2 = b(rVar);
                int a3 = a(rVar);
                cVar2.i = b2;
                cVar2.j = a3;
                if (d(rVar)) {
                    com.fyber.inneractive.sdk.flow.vast.e c3 = c();
                    if (!((c3 == null || !c3.a || c3.b == null) ? false : true)) {
                        z = true;
                    }
                }
                Integer valueOf = Integer.valueOf(c(rVar));
                if (z) {
                    cVar2.f = valueOf;
                }
                lVar.a(new com.fyber.inneractive.sdk.player.ui.b(cVar2));
                a(com.fyber.inneractive.sdk.model.vast.g.Other, 1);
                c2.requestFocus();
            } else if (!this.z && (listenert = this.g) != null) {
                listenert.k();
            } else {
                if (this.x != null) {
                    bitmap = h(true);
                } else {
                    com.fyber.inneractive.sdk.player.b bVar6 = this.a;
                    bitmap = bVar6 != null ? bVar6.l : null;
                }
                if (bitmap != null) {
                    this.d.setLastFrameBitmap(bitmap);
                }
                com.fyber.inneractive.sdk.flow.vast.e c4 = c();
                if ((c4 == null || !c4.a || c4.b == null) ? false : true) {
                    com.fyber.inneractive.sdk.player.controller.c cVar3 = c4.g;
                    o oVar2 = new o(this);
                    c0 c0Var5 = cVar3.a;
                    if (c0Var5 != null) {
                        c0Var5.setListener(oVar2);
                    }
                    com.fyber.inneractive.sdk.player.ui.l lVar2 = this.d;
                    com.fyber.inneractive.sdk.player.ui.c cVar4 = new com.fyber.inneractive.sdk.player.ui.c();
                    cVar4.b = true;
                    cVar4.g = c4.b;
                    com.fyber.inneractive.sdk.model.vast.g gVar3 = com.fyber.inneractive.sdk.model.vast.g.FMP_End_Card;
                    cVar4.h = gVar3;
                    boolean d2 = d(rVar);
                    Integer valueOf2 = Integer.valueOf(c(rVar));
                    if (d2) {
                        cVar4.f = valueOf2;
                    }
                    lVar2.a(new com.fyber.inneractive.sdk.player.ui.b(cVar4));
                    a(gVar3, 1);
                    return;
                }
                this.d.b(true);
                this.d.c(false);
                com.fyber.inneractive.sdk.player.ui.c cVar5 = new com.fyber.inneractive.sdk.player.ui.c();
                cVar5.b = this.z;
                cVar5.c = rVar != null && rVar.c();
                String str = this.y;
                if (str == null) {
                    com.fyber.inneractive.sdk.config.global.s sVar2 = this.c;
                    if (sVar2 != null) {
                        com.fyber.inneractive.sdk.config.global.features.d dVar2 = (com.fyber.inneractive.sdk.config.global.features.d) sVar2.a(com.fyber.inneractive.sdk.config.global.features.d.class);
                        dVar2.e(iAConfigManager.p);
                        com.fyber.inneractive.sdk.model.vast.a aVar = dVar2.e;
                        if (aVar != null && aVar.d) {
                            str = aVar.a;
                        }
                    }
                    str = null;
                }
                cVar5.e = str;
                boolean d3 = d(rVar);
                Integer valueOf3 = Integer.valueOf(c(rVar));
                if (d3) {
                    cVar5.f = valueOf3;
                }
                r.c b3 = b(rVar);
                int a4 = a(rVar);
                cVar5.i = b3;
                cVar5.j = a4;
                com.fyber.inneractive.sdk.config.global.s sVar3 = this.c;
                com.fyber.inneractive.sdk.config.global.features.i iVar = sVar3 != null ? (com.fyber.inneractive.sdk.config.global.features.i) sVar3.a(com.fyber.inneractive.sdk.config.global.features.i.class) : null;
                if (iVar != null) {
                    cVar5.a = iVar.a("should_show_hand", false);
                    Double a5 = iVar.a("scale_up_to");
                    float doubleValue = (float) (a5 != null ? a5.doubleValue() : 1.2999999523162842d);
                    cVar5.d = (doubleValue > 1.7f || doubleValue < 1.1f) ? 1.3f : 1.3f;
                }
                com.fyber.inneractive.sdk.player.b bVar7 = this.a;
                if (bVar7 != null && bVar7.a(this.c, this.w)) {
                    z = true;
                }
                cVar5.l = z;
                com.fyber.inneractive.sdk.config.global.s sVar4 = this.c;
                com.fyber.inneractive.sdk.config.global.features.n nVar = sVar4 != null ? (com.fyber.inneractive.sdk.config.global.features.n) sVar4.a(com.fyber.inneractive.sdk.config.global.features.n.class) : null;
                if (nVar != null) {
                    string = nVar.c();
                } else {
                    string = this.d.getContext().getString(R.string.ia_video_app_info_text);
                }
                cVar5.m = string;
                ListenerT listenert2 = this.g;
                if (listenert2 != null) {
                    cVar5.k = listenert2.q();
                }
                this.d.d(new com.fyber.inneractive.sdk.player.ui.b(cVar5));
                a(com.fyber.inneractive.sdk.model.vast.g.Default_End_Card, 1);
            }
        } else if (this.t && a2) {
            this.d.b(false);
            this.d.c(false);
        } else {
            this.d.c(true);
        }
    }

    public void E() {
        com.fyber.inneractive.sdk.player.ui.l lVar = this.d;
        if (lVar.u != null) {
            lVar.setMuteButtonState(t());
        }
    }

    public final int a(com.fyber.inneractive.sdk.config.global.features.r rVar) {
        if (rVar != null) {
            Integer b2 = rVar.b("endcard_animation_duration");
            int intValue = b2 != null ? b2.intValue() : HttpStatus.SC_INTERNAL_SERVER_ERROR;
            return (intValue < 500 || intValue > 3000) ? HttpStatus.SC_INTERNAL_SERVER_ERROR : intValue;
        }
        return HttpStatus.SC_INTERNAL_SERVER_ERROR;
    }

    public abstract void a(k0 k0Var);

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void a(Exception exc) {
    }

    public final r.c b(com.fyber.inneractive.sdk.config.global.features.r rVar) {
        r.c[] values;
        if (rVar != null) {
            String a2 = rVar.a("endcard_animation_type", com.fyber.inneractive.sdk.config.global.features.r.f.mKey);
            for (r.c cVar : r.c.values()) {
                if (a2.equalsIgnoreCase(cVar.mKey)) {
                    return cVar;
                }
            }
            return r.c.NONE;
        }
        return com.fyber.inneractive.sdk.config.global.features.r.f;
    }

    public void b() {
    }

    public final int c(com.fyber.inneractive.sdk.config.global.features.r rVar) {
        if (rVar != null) {
            Integer b2 = rVar.b("autoClickDelay");
            int intValue = b2 != null ? b2.intValue() : 3;
            if (intValue < 0 || intValue > 10) {
                return 3;
            }
            return intValue;
        }
        return 3;
    }

    public final boolean d(com.fyber.inneractive.sdk.config.global.features.r rVar) {
        return rVar != null && rVar.a("shouldEnableEndCardAutoClick", false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void destroy() {
        g gVar;
        Application application;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.m;
        if (activityLifecycleCallbacks != null && (application = com.fyber.inneractive.sdk.util.l.a) != null) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        IAlog.a("%sdestroy called", IAlog.a(this));
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar != null && (gVar = bVar.b) != null) {
            gVar.b.remove(this);
            this.a.b.c.remove(this);
        }
        l();
        j();
        AsyncTask<?, ?, ?> asyncTask = this.q;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        this.g = null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void e(boolean z) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x002d, code lost:
        if ((r2 != null && r2.getVisibility() == 0 && r0.o.isEnabled()) == false) goto L22;
     */
    @Override // com.fyber.inneractive.sdk.player.controller.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e() {
        /*
            r5 = this;
            com.fyber.inneractive.sdk.player.b r0 = r5.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r5.h
            r3 = 1
            if (r2 != 0) goto L50
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.b
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L50
            com.fyber.inneractive.sdk.player.ui.l r0 = r5.d
            if (r0 == 0) goto L2f
            android.widget.TextView r2 = r0.o
            if (r2 == 0) goto L2c
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L2c
            android.widget.TextView r0 = r0.o
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            if (r0 != 0) goto L50
        L2f:
            com.fyber.inneractive.sdk.player.b r0 = r5.a
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.b
            int r0 = r0.d()
            com.fyber.inneractive.sdk.player.b r2 = r5.a
            r4 = r2
            com.fyber.inneractive.sdk.player.e r4 = (com.fyber.inneractive.sdk.player.e) r4
            com.fyber.inneractive.sdk.config.b0 r4 = r4.A
            int r2 = com.fyber.inneractive.sdk.player.b.a(r2)
            boolean r0 = com.fyber.inneractive.sdk.player.b.a(r0, r4, r2)
            if (r0 == 0) goto L51
            boolean r0 = r5.h
            if (r0 != 0) goto L51
            int r0 = r5.f
            if (r0 != 0) goto L51
        L50:
            r1 = 1
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.k.e():boolean");
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void g() {
        if (this.r && !this.l) {
            this.l = true;
            this.d.b(false);
        }
    }

    public Bitmap h(boolean z) {
        com.fyber.inneractive.sdk.player.b bVar;
        g gVar;
        if (this.p != null && (bVar = this.a) != null && (gVar = bVar.b) != null) {
            if (this.o) {
                return bVar.l;
            }
            TextureView textureView = gVar.j;
            Object[] objArr = new Object[3];
            objArr[0] = IAlog.a(this);
            objArr[1] = textureView;
            objArr[2] = Boolean.valueOf(textureView != null && textureView.isAvailable());
            IAlog.a("%sSave snapshot entered: tv = %s avail = %s", objArr);
            if (textureView != null && textureView.isAvailable()) {
                try {
                    IAlog.d("creating bitmap on object - %s", this.p);
                    Bitmap bitmap = textureView.getBitmap(this.p);
                    if (this.d.getVideoWidth() > 0 && this.d.getVideoHeight() > 0) {
                        this.p = null;
                        a(this.d.getVideoWidth(), this.d.getVideoHeight());
                    }
                    if (z) {
                        com.fyber.inneractive.sdk.util.c cVar = new com.fyber.inneractive.sdk.util.c();
                        cVar.c = 20;
                        cVar.d = 1;
                        cVar.a = bitmap.getWidth();
                        cVar.b = bitmap.getHeight();
                        this.a.a(com.fyber.inneractive.sdk.util.b.a(this.d.getContext(), bitmap, cVar));
                        this.o = true;
                    } else {
                        this.a.a(bitmap);
                    }
                    IAlog.d("%ssave snapshot succeeded", IAlog.a(this));
                    return this.a.l;
                } catch (Exception unused) {
                    IAlog.d("%ssave snapshot failed with exception", IAlog.a(this));
                }
            }
        }
        return null;
    }

    public void i() {
        g gVar;
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar == null || (gVar = bVar.b) == null) {
            return;
        }
        if (!gVar.b.contains(this)) {
            gVar.b.add(this);
        }
        g gVar2 = this.a.b;
        if (gVar2.c.contains(this)) {
            return;
        }
        gVar2.c.add(this);
    }

    public final void j() {
        Runnable runnable = this.j;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.j = null;
        }
    }

    public boolean k() {
        g gVar;
        g gVar2;
        com.fyber.inneractive.sdk.player.ui.f fVar;
        TextureView textureView;
        com.fyber.inneractive.sdk.measurement.d dVar;
        if (this.x == null) {
            com.fyber.inneractive.sdk.player.ui.f fVar2 = new com.fyber.inneractive.sdk.player.ui.f(this.d);
            this.x = fVar2;
            com.fyber.inneractive.sdk.player.b bVar = this.a;
            if (bVar != null && (dVar = bVar.i) != null) {
                View[] trackingFriendlyView = this.d.getTrackingFriendlyView();
                AdSession adSession = dVar.a;
                if (adSession != null) {
                    try {
                        adSession.registerAdView(fVar2);
                    } catch (Throwable th) {
                        dVar.a(th);
                    }
                }
                if (dVar.a != null && trackingFriendlyView != null) {
                    for (View view : trackingFriendlyView) {
                        if (view != null) {
                            try {
                                dVar.a.addFriendlyObstruction(view, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
                            } catch (Throwable th2) {
                                dVar.a(th2);
                            }
                        }
                    }
                }
                View[] trackingFriendlyViewObstructionPurposeOther = this.d.getTrackingFriendlyViewObstructionPurposeOther();
                if (dVar.a != null) {
                    for (View view2 : trackingFriendlyViewObstructionPurposeOther) {
                        if (view2 != null) {
                            try {
                                dVar.a.addFriendlyObstruction(view2, FriendlyObstructionPurpose.OTHER, null);
                            } catch (Throwable th3) {
                                dVar.a(th3);
                            }
                        }
                    }
                }
            }
        }
        IAlog.a("%sconnectToTextureView called %s", IAlog.a(this), this.d.getTextureHost());
        if (this.x != null && this.d.getTextureHost().equals(this.x.getParent())) {
            IAlog.a("%sconnectToTextureView called but already connected", IAlog.a(this));
        } else {
            com.fyber.inneractive.sdk.player.b bVar2 = this.a;
            if (bVar2 != null && (gVar2 = bVar2.b) != null && (textureView = gVar2.j) != (fVar = this.x)) {
                if (textureView != null) {
                    textureView.setSurfaceTextureListener(null);
                }
                gVar2.j = fVar;
                if (gVar2.m == null) {
                    gVar2.m = new f(gVar2);
                }
                if (fVar != null) {
                    fVar.setSurfaceTextureListener(gVar2.m);
                }
                if (gVar2.k != null) {
                    IAlog.a("%scalling setSurfaceTexture with cached texture", IAlog.a(gVar2));
                    if (gVar2.j.getSurfaceTexture() != null && gVar2.j.getSurfaceTexture().equals(gVar2.k)) {
                        IAlog.a("%scalling setSurfaceTexture with cached texture failed", IAlog.a(gVar2));
                    } else {
                        IAlog.a("%scalling setSurfaceTexture with cached texture success", IAlog.a(gVar2));
                        gVar2.j.setSurfaceTexture(gVar2.k);
                    }
                }
            }
            com.fyber.inneractive.sdk.player.ui.f fVar3 = this.x;
            if (fVar3 != null) {
                fVar3.setId(R.id.inn_texture_view);
            }
            IAlog.a("%supdateView adding texture to parent", IAlog.a(this));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams.gravity = 17;
            if (this.x.getParent() == null) {
                this.d.getTextureHost().addView(this.x, layoutParams);
            }
            this.l = false;
            q qVar = new q(this);
            this.e = qVar;
            com.fyber.inneractive.sdk.player.b bVar3 = this.a;
            if (bVar3 != null && (gVar = bVar3.b) != null) {
                gVar.d = qVar;
            }
        }
        return true;
    }

    public void l() {
        Bitmap h;
        if (this.x != null) {
            IAlog.a("%sdestroyTextureView", IAlog.a(this));
            if (!(this.p != null) || (h = h(false)) == null) {
                return;
            }
            this.d.setLastFrameBitmap(h);
            this.d.b(true);
        }
    }

    public final void m() {
        com.fyber.inneractive.sdk.player.ui.l lVar = this.d;
        if (lVar != null) {
            lVar.g();
            lVar.H = true;
        }
    }

    public void n() {
        if (B()) {
            com.fyber.inneractive.sdk.config.global.s sVar = this.c;
            String str = null;
            com.fyber.inneractive.sdk.config.global.features.d dVar = sVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) sVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
            if (dVar != null) {
                dVar.e(IAConfigManager.M.p);
                com.fyber.inneractive.sdk.model.vast.a aVar = dVar.e;
                if (aVar != null && aVar.d) {
                    str = aVar.b;
                }
            }
            if (TextUtils.isEmpty(this.y) && str != null) {
                this.d.setSkipText(str);
            } else {
                com.fyber.inneractive.sdk.player.ui.l lVar = this.d;
                lVar.setSkipText(lVar.getContext().getString(R.string.ia_video_skip_text));
            }
            this.d.c();
            this.f = 0;
            ListenerT listenert = this.g;
            if (listenert != null) {
                listenert.e();
            }
        }
    }

    public abstract int o();

    public com.fyber.inneractive.sdk.config.global.features.c p() {
        com.fyber.inneractive.sdk.config.global.s sVar = this.c;
        if ((sVar == null || sVar.a(com.fyber.inneractive.sdk.config.global.features.c.class) == null || ((com.fyber.inneractive.sdk.config.global.features.c) this.c.a(com.fyber.inneractive.sdk.config.global.features.c.class)).c.size() <= 0) ? false : true) {
            return (com.fyber.inneractive.sdk.config.global.features.c) this.c.a(com.fyber.inneractive.sdk.config.global.features.c.class);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void pauseVideo() {
        g gVar;
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar == null || (gVar = bVar.b) == null) {
            return;
        }
        if (gVar.e != com.fyber.inneractive.sdk.player.enums.b.Paused) {
            IAlog.a("%spauseVideo %s", IAlog.a(this), this.d);
            TextureView textureView = this.a.b.j;
            if (textureView == null || textureView.getParent() == null || !textureView.getParent().equals(this.d.getTextureHost())) {
                return;
            }
            this.a.b.k();
            return;
        }
        IAlog.a("%spauseVideo called in bad state! %s", IAlog.a(this), this.a.b.e);
    }

    public int q() {
        int i;
        com.fyber.inneractive.sdk.config.i iVar = IAConfigManager.M.u.b;
        String num = Integer.toString(30);
        if (iVar.a.containsKey("max_rv_tsec")) {
            num = iVar.a.get("max_rv_tsec");
        }
        try {
            i = Integer.parseInt(num);
        } catch (Throwable unused) {
            i = 30;
        }
        if (i < 1) {
            return 30;
        }
        return i;
    }

    public final float r() {
        try {
            return ((AudioManager) this.d.getContext().getSystemService("audio")).getStreamVolume(3);
        } catch (Throwable unused) {
            return 1.0f;
        }
    }

    public abstract int s();

    public boolean t() {
        g gVar;
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar == null || (gVar = bVar.b) == null) {
            return false;
        }
        return gVar.i() || r() == 0.0f;
    }

    public abstract void u();

    public void v() {
        if (this.d.f()) {
            return;
        }
        this.d.a(false);
        j();
        D();
        this.k = false;
        this.h = true;
    }

    public abstract void w();

    public void x() {
        j();
        this.d.a(false);
        D();
    }

    public abstract void y();

    public void z() {
    }

    public k(com.fyber.inneractive.sdk.player.b bVar, com.fyber.inneractive.sdk.player.ui.l lVar, b0 b0Var, com.fyber.inneractive.sdk.config.global.s sVar, boolean z, Skip skip, String str, boolean z2) {
        this.f = 0;
        this.h = false;
        this.i = -0.1f;
        this.l = false;
        this.o = false;
        this.p = null;
        this.q = null;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = com.fyber.inneractive.sdk.ignite.k.NONE;
        this.B = false;
        this.A = skip;
        this.a = bVar;
        this.b = b0Var;
        this.c = sVar;
        this.d = lVar;
        this.n = z;
        this.y = str;
        this.z = z2;
        lVar.setListener(this);
        i();
        new GestureDetector(lVar.getContext(), new a(this));
    }

    public void f() {
        IAlog.a("%sonVideoViewDetachedFromWindow", IAlog.a(this));
        l();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void d(boolean z) {
        IAlog.a("%sinitUI", IAlog.a(this));
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar == null || bVar.b == null) {
            return;
        }
        this.d.setUnitConfig(this.b);
        com.fyber.inneractive.sdk.player.ui.l lVar = this.d;
        int h = this.a.b.h();
        int g = this.a.b.g();
        boolean z2 = this.n;
        lVar.r = h;
        lVar.s = g;
        lVar.t = z2;
        if (this.a.b.h() > 0 && this.a.b.g() > 0) {
            a(this.a.b.h(), this.a.b.g());
        }
        if (B()) {
            this.f = s();
        } else {
            this.d.d(false);
        }
        if (!z) {
            a(this.a.b.c());
            a(this.a.b.e, false);
        }
        E();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void a(ListenerT listenert) {
        this.g = listenert;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0040, code lost:
        if (r0 >= r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0060  */
    @Override // com.fyber.inneractive.sdk.player.controller.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(boolean r6) {
        /*
            r5 = this;
            com.fyber.inneractive.sdk.config.b0 r0 = r5.b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L14
            com.fyber.inneractive.sdk.config.a0 r0 = (com.fyber.inneractive.sdk.config.a0) r0
            com.fyber.inneractive.sdk.config.c0 r0 = r0.f
            if (r0 == 0) goto L14
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r0 = r0.j
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r3 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r0 != r3) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            boolean r3 = com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()
            if (r3 == 0) goto L43
            if (r0 == 0) goto L43
            com.fyber.inneractive.sdk.player.ui.l r0 = r5.d
            if (r0 == 0) goto L43
            com.fyber.inneractive.sdk.player.b r0 = r5.a
            if (r0 == 0) goto L43
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.b
            if (r0 == 0) goto L43
            int r0 = r0.c()
            int r0 = r0 / 1000
            int r3 = r5.q()
            com.fyber.inneractive.sdk.player.b r4 = r5.a
            com.fyber.inneractive.sdk.player.controller.g r4 = r4.b
            int r4 = r4.d()
            int r4 = r4 / 1000
            int r4 = r4 - r0
            if (r4 <= 0) goto L44
            if (r0 >= r3) goto L43
            goto L44
        L43:
            r1 = 0
        L44:
            if (r1 == 0) goto L60
            com.fyber.inneractive.sdk.player.controller.t r0 = new com.fyber.inneractive.sdk.player.controller.t
            com.fyber.inneractive.sdk.player.ui.l r1 = r5.d
            android.content.Context r1 = r1.getContext()
            com.fyber.inneractive.sdk.config.global.features.c r2 = r5.p()
            com.fyber.inneractive.sdk.player.controller.n r3 = new com.fyber.inneractive.sdk.player.controller.n
            r3.<init>(r5, r6)
            r0.<init>(r1, r2, r3)
            android.app.Dialog r6 = r0.c
            r6.show()
            goto L63
        L60:
            r5.f(r6)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.k.c(boolean):void");
    }

    public void j(boolean z) {
        g gVar;
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar != null && (gVar = bVar.b) != null) {
            gVar.d(z);
        }
        this.d.setMuteButtonState(false);
    }

    public final void a(int i, int i2) {
        Bitmap bitmap = this.p;
        if (!(bitmap != null && bitmap.getWidth() == i && this.p.getHeight() == i2) && i2 > 0 && i > 0) {
            AsyncTask<?, ?, ?> asyncTask = this.q;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            this.p = null;
            b bVar = new b();
            this.q = bVar;
            bVar.executeOnExecutor(com.fyber.inneractive.sdk.util.m.a, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public final void f(boolean z) {
        com.fyber.inneractive.sdk.player.b bVar;
        g gVar;
        com.fyber.inneractive.sdk.config.c0 c0Var;
        ListenerT listenert;
        com.fyber.inneractive.sdk.player.b bVar2;
        g gVar2;
        g gVar3;
        com.fyber.inneractive.sdk.measurement.d dVar;
        b0 b0Var;
        com.fyber.inneractive.sdk.config.c0 c0Var2;
        this.t = true;
        f0 f0Var = IAConfigManager.M.x;
        if (z && f0Var != null && (b0Var = this.b) != null && (c0Var2 = ((a0) b0Var).f) != null) {
            f0Var.a(c0Var2.j, "LAST_VAST_SKIPED", "1");
        }
        com.fyber.inneractive.sdk.player.b bVar3 = this.a;
        boolean z2 = false;
        if (bVar3 != null && (gVar3 = bVar3.b) != null) {
            gVar3.m();
            this.a.b.k();
            if (z && (dVar = this.a.i) != null && dVar.c != null) {
                IAlog.a("%s skipped", "OMVideo");
                try {
                    dVar.c.skipped();
                } catch (Throwable th) {
                    dVar.a(th);
                }
            }
        }
        if (!this.d.f()) {
            this.d.a(false);
            j();
            D();
            this.k = false;
            this.h = true;
            b0 b0Var2 = this.b;
            if (b0Var2 != null && (c0Var = ((a0) b0Var2).f) != null && c0Var.j == UnitDisplayType.REWARDED && (listenert = this.g) != null) {
                if (this.t && (bVar2 = this.a) != null && (gVar2 = bVar2.b) != null) {
                    int c2 = gVar2.c();
                    if ((gVar2.d() - c2 <= 0 || c2 >= q() * 1000) ? true : true) {
                        this.g.onCompleted();
                    } else {
                        this.B = true;
                    }
                } else {
                    listenert.onCompleted();
                }
            }
        }
        if (this.g != null && (this.f <= 0 || this.h || ((bVar = this.a) != null && (gVar = bVar.b) != null && gVar.e.equals(com.fyber.inneractive.sdk.player.enums.b.Completed)))) {
            this.g.a(z);
        }
        l();
    }

    public void g(boolean z) {
        g gVar;
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar != null && (gVar = bVar.b) != null) {
            gVar.b(z);
        }
        this.d.setMuteButtonState(true);
    }

    public void i(boolean z) {
        g gVar;
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar != null) {
            if (!bVar.k) {
                D();
            } else if (z && (gVar = bVar.b) != null) {
                gVar.a(0, true);
            } else {
                bVar.e();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public com.fyber.inneractive.sdk.flow.vast.e c() {
        com.fyber.inneractive.sdk.flow.k kVar;
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar == null || (kVar = ((com.fyber.inneractive.sdk.player.e) bVar).B) == null) {
            return null;
        }
        return kVar.l;
    }

    public final void c(int i) {
        if (this.d != null) {
            com.fyber.inneractive.sdk.config.global.s sVar = this.c;
            String str = null;
            com.fyber.inneractive.sdk.config.global.features.d dVar = sVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) sVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
            if (dVar != null) {
                dVar.e(IAConfigManager.M.p);
                com.fyber.inneractive.sdk.model.vast.a aVar = dVar.e;
                if (aVar != null && aVar.d) {
                    str = aVar.c;
                }
            }
            if (TextUtils.isEmpty(this.y) && str != null) {
                this.d.setSkipText(str.replaceFirst("\\[TIME\\]", Integer.toString(i)));
            } else {
                this.d.setSkipText(String.valueOf(i));
            }
        }
    }

    public final void a(String str) {
        f0 f0Var = IAConfigManager.M.x;
        b0 b0Var = this.b;
        if (b0Var != null) {
            a0 a0Var = (a0) b0Var;
            if (a0Var.f != null) {
                f0Var.a(a0Var.f.j, "LAST_VAST_CLICKED_TYPE", str);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.a("%sonPlayerStateChanged with %s", IAlog.a(this), bVar);
        a(bVar, true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void h() {
        com.fyber.inneractive.sdk.player.ui.f fVar;
        com.fyber.inneractive.sdk.player.ui.l lVar = this.d;
        if (lVar != null) {
            lVar.j();
        }
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar != null && bVar.b != null && (fVar = this.x) != null) {
            fVar.invalidate();
            this.x.requestLayout();
        }
        com.fyber.inneractive.sdk.player.ui.l lVar2 = this.d;
        if (lVar2 != null) {
            lVar2.invalidate();
            this.d.requestLayout();
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar, boolean z) {
        ListenerT listenert;
        switch (c.a[bVar.ordinal()]) {
            case 1:
                if (this.r) {
                    this.d.b(true);
                    D();
                    z();
                    return;
                }
                return;
            case 2:
                if (this.r) {
                    this.d.a(true);
                    this.d.c(false);
                    Runnable runnable = this.j;
                    if (runnable == null) {
                        if (runnable == null) {
                            this.j = new l(this);
                        }
                        int o = o();
                        IAlog.a("%s Starting buffering timeout with %d", IAlog.a(this), Integer.valueOf(o));
                        this.d.postDelayed(this.j, o);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (this.r) {
                    A();
                    return;
                }
                return;
            case 4:
                x();
                return;
            case 5:
                if (this.r || !(this.z || this.v)) {
                    this.v = true;
                    v();
                    if (!z || (listenert = this.g) == null) {
                        return;
                    }
                    listenert.onCompleted();
                    return;
                }
                return;
            case 6:
                if (this.r) {
                    c(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public boolean d() {
        return this.z;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.e
    public void a(int i) {
        b0 b0Var;
        g gVar;
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar == null || bVar.b == null) {
            return;
        }
        float r = r();
        com.fyber.inneractive.sdk.player.b bVar2 = this.a;
        if (bVar2 != null && (gVar = bVar2.b) != null && gVar.j()) {
            float f = this.i;
            if (r != f) {
                int i2 = (r > 0.0f ? 1 : (r == 0.0f ? 0 : -1));
                if (i2 > 0 && f >= 0.0f && t()) {
                    j(true);
                } else if (i2 == 0 && !t()) {
                    g(true);
                }
            }
            E();
        }
        this.i = r;
        int d = this.a.b.d();
        int c2 = this.a.b.c();
        int i3 = c2 / 1000;
        int i4 = d / 1000;
        int i5 = i4 - i3;
        if (i5 < 0 || (!this.a.b.j() && c2 == d)) {
            i5 = 0;
        }
        com.fyber.inneractive.sdk.player.ui.l lVar = this.d;
        if (lVar.n == null && lVar.w == null) {
            return;
        }
        lVar.setRemainingTime(Integer.toString(i5));
        if (this.f < i4) {
            if (B()) {
                int d2 = this.a.b.d();
                com.fyber.inneractive.sdk.player.b bVar3 = this.a;
                if (com.fyber.inneractive.sdk.player.b.a(d2, ((com.fyber.inneractive.sdk.player.e) bVar3).A, com.fyber.inneractive.sdk.player.b.a(bVar3)) && !this.h) {
                    int i6 = this.f;
                    if (i3 < i6) {
                        c(i6 - i3);
                    } else {
                        this.f = 0;
                        n();
                    }
                    this.d.d(true);
                }
            }
            this.d.d(false);
        } else {
            this.d.d(false);
            c(i5);
        }
        if (this.a.b.e != com.fyber.inneractive.sdk.player.enums.b.Paused) {
            com.fyber.inneractive.sdk.player.ui.l lVar2 = this.d;
            if (lVar2.w != null) {
                Runnable runnable = lVar2.F;
                if (runnable != null) {
                    lVar2.removeCallbacks(runnable);
                    lVar2.F = null;
                }
                int i7 = i4 * 1000;
                lVar2.w.setMax(i7);
                int i8 = i7 - (i5 * 1000);
                int i9 = i8 + 1000;
                lVar2.E = i9;
                int i10 = i8 + 200;
                if (i9 > 0 && i9 <= i7) {
                    int i11 = lVar2.D;
                    if (i10 < i11 && i11 > 0) {
                        lVar2.w.setProgress(i9);
                    } else {
                        lVar2.D = i10;
                        lVar2.w.setProgress(i10);
                        com.fyber.inneractive.sdk.player.ui.n nVar = new com.fyber.inneractive.sdk.player.ui.n(lVar2);
                        lVar2.F = nVar;
                        lVar2.postDelayed(nVar, 200L);
                    }
                }
            }
            int q = q();
            if (i4 > q && i3 > q && (b0Var = this.b) != null) {
                a0 a0Var = (a0) b0Var;
                if (a0Var.f != null && a0Var.f.j == UnitDisplayType.REWARDED) {
                    n();
                    this.d.d(true);
                }
            }
        }
        ListenerT listenert = this.g;
        if (listenert != null) {
            listenert.onProgress(d, c2);
        }
    }

    public void a(boolean z) {
        com.fyber.inneractive.sdk.player.b bVar;
        g gVar;
        g.InterfaceC0028g interfaceC0028g;
        com.fyber.inneractive.sdk.player.ui.l lVar;
        Application application;
        if (this.r == z || (bVar = this.a) == null || bVar.b == null) {
            return;
        }
        IAlog.a("%sonVisibilityChanged: %s my video view is%s", IAlog.a(this), Boolean.valueOf(z), this.d);
        if (z) {
            this.r = true;
            com.fyber.inneractive.sdk.player.enums.b bVar2 = this.a.b.e;
            if (!bVar2.equals(com.fyber.inneractive.sdk.player.enums.b.Completed) && !this.d.f()) {
                if (!bVar2.equals(com.fyber.inneractive.sdk.player.enums.b.Error)) {
                    if (!bVar2.equals(com.fyber.inneractive.sdk.player.enums.b.Idle)) {
                        if (bVar2 == com.fyber.inneractive.sdk.player.enums.b.Start_in_progress || bVar2 == com.fyber.inneractive.sdk.player.enums.b.Playing) {
                            A();
                        }
                        com.fyber.inneractive.sdk.player.b bVar3 = this.a;
                        if (!bVar3.q) {
                            com.fyber.inneractive.sdk.player.e eVar = (com.fyber.inneractive.sdk.player.e) bVar3;
                            eVar.a(eVar.x, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.s.EVENT_CREATIVE_VIEW);
                            bVar3.q = true;
                        }
                        k();
                        if (this.m != null || (application = com.fyber.inneractive.sdk.util.l.a) == null) {
                            return;
                        }
                        m mVar = new m(this);
                        this.m = mVar;
                        application.registerActivityLifecycleCallbacks(mVar);
                        return;
                    }
                    this.a.getClass();
                }
                c(false);
                return;
            }
            if (!this.v) {
                this.v = true;
                if (!this.B) {
                    v();
                    ListenerT listenert = this.g;
                    if (listenert != null) {
                        listenert.onCompleted();
                    }
                }
            }
            com.fyber.inneractive.sdk.player.ui.l lVar2 = this.d;
            if (lVar2 == null || lVar2.G == null) {
                return;
            }
            IAlog.a("Autoclick resumed", new Object[0]);
            lVar2.G.b();
            return;
        }
        this.r = false;
        com.fyber.inneractive.sdk.player.b bVar4 = this.a;
        if (bVar4 != null && (gVar = bVar4.b) != null && (interfaceC0028g = gVar.d) != null && interfaceC0028g.equals(this.e)) {
            IAlog.a("%sonVisibilityChanged pausing video", IAlog.a(this));
            pauseVideo();
            if (this.a.b.e == com.fyber.inneractive.sdk.player.enums.b.Completed || ((lVar = this.d) != null && lVar.f())) {
                com.fyber.inneractive.sdk.player.ui.l lVar3 = this.d;
                if (lVar3.G != null) {
                    IAlog.a("Autoclick paused", new Object[0]);
                    lVar3.G.a();
                }
            }
        }
        l();
    }

    public void a(int i, k0 k0Var) {
        String str;
        IAlog.a("onClicked called with %d", Integer.valueOf(i));
        switch (i) {
            case 1:
                if (t()) {
                    j(true);
                    com.fyber.inneractive.sdk.player.b bVar = this.a;
                    if (bVar != null) {
                        com.fyber.inneractive.sdk.player.e eVar = (com.fyber.inneractive.sdk.player.e) bVar;
                        eVar.a(eVar.x, VideoClickOrigin.MUTE, com.fyber.inneractive.sdk.model.vast.s.EVENT_UNMUTE);
                    }
                } else {
                    g(true);
                    com.fyber.inneractive.sdk.player.b bVar2 = this.a;
                    if (bVar2 != null) {
                        com.fyber.inneractive.sdk.player.e eVar2 = (com.fyber.inneractive.sdk.player.e) bVar2;
                        eVar2.a(eVar2.x, VideoClickOrigin.MUTE, com.fyber.inneractive.sdk.model.vast.s.EVENT_MUTE);
                    }
                }
                E();
                return;
            case 2:
                y();
                return;
            case 3:
                a(f0.b.CTA_BUTTON.value);
                a(false, VideoClickOrigin.CTA, k0Var);
                return;
            case 4:
                a(f0.b.COMPANION.value);
                com.fyber.inneractive.sdk.player.b bVar3 = this.a;
                com.fyber.inneractive.sdk.model.vast.c d = bVar3 != null ? bVar3.d() : null;
                if (d == null || d.a != com.fyber.inneractive.sdk.model.vast.g.Static) {
                    str = null;
                } else {
                    str = d.g;
                    com.fyber.inneractive.sdk.player.b bVar4 = this.a;
                    if (bVar4 != null) {
                        bVar4.a(d, VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.s.EVENT_CLICK);
                    }
                }
                m();
                ListenerT listenert = this.g;
                if (listenert != null) {
                    listenert.a(str, k0Var, null, false);
                    return;
                }
                return;
            case 5:
                w();
                return;
            case 6:
                c(true);
                return;
            case 7:
                a(k0Var);
                return;
            case 8:
                a(f0.b.COMPANION.value);
                a(true, VideoClickOrigin.COMPANION, k0Var);
                return;
            case 9:
                com.fyber.inneractive.sdk.player.b bVar5 = this.a;
                if (bVar5 == null || this.d.h) {
                    return;
                }
                bVar5.k = true;
                i(false);
                return;
            case 10:
                a(f0.b.APP_INFO.value);
                a(false, VideoClickOrigin.APP_INFO, k0Var);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0077, code lost:
        if (r5.a != com.fyber.inneractive.sdk.util.x.d.FAILED) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(boolean r5, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin r6, com.fyber.inneractive.sdk.util.k0 r7) {
        /*
            r4 = this;
            r4.m()
            ListenerT extends com.fyber.inneractive.sdk.player.controller.u r0 = r4.g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L7a
            if (r5 == 0) goto L2d
            com.fyber.inneractive.sdk.player.b r5 = r4.a
            if (r5 == 0) goto L7a
            com.fyber.inneractive.sdk.player.e r5 = (com.fyber.inneractive.sdk.player.e) r5
            com.fyber.inneractive.sdk.model.vast.b r5 = r5.x
            r3 = 0
            if (r5 == 0) goto L19
            java.lang.String r5 = r5.b
            goto L1a
        L19:
            r5 = r3
        L1a:
            r0.a(r5, r7, r3, r1)
            com.fyber.inneractive.sdk.player.b r5 = r4.a
            com.fyber.inneractive.sdk.model.vast.s[] r7 = new com.fyber.inneractive.sdk.model.vast.s[r1]
            com.fyber.inneractive.sdk.model.vast.s r0 = com.fyber.inneractive.sdk.model.vast.s.EVENT_CLICK
            r7[r2] = r0
            com.fyber.inneractive.sdk.player.e r5 = (com.fyber.inneractive.sdk.player.e) r5
            com.fyber.inneractive.sdk.model.vast.b r0 = r5.x
            r5.a(r0, r6, r7)
            goto L7a
        L2d:
            com.fyber.inneractive.sdk.player.enums.VideoClickOrigin r5 = com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.VIDEO
            if (r6 != r5) goto L34
            com.fyber.inneractive.sdk.util.e r5 = com.fyber.inneractive.sdk.util.e.VIDEO_CLICK
            goto L3d
        L34:
            com.fyber.inneractive.sdk.player.enums.VideoClickOrigin r5 = com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.APP_INFO
            if (r6 != r5) goto L3b
            com.fyber.inneractive.sdk.util.e r5 = com.fyber.inneractive.sdk.util.e.VIDEO_APP_INFO
            goto L3d
        L3b:
            com.fyber.inneractive.sdk.util.e r5 = com.fyber.inneractive.sdk.util.e.VIDEO_CTA
        L3d:
            com.fyber.inneractive.sdk.util.x$a r5 = r0.a(r7, r5)
            com.fyber.inneractive.sdk.player.b r7 = r4.a
            if (r7 == 0) goto L73
            com.fyber.inneractive.sdk.model.vast.s[] r0 = new com.fyber.inneractive.sdk.model.vast.s[r1]
            com.fyber.inneractive.sdk.model.vast.s r3 = com.fyber.inneractive.sdk.model.vast.s.EVENT_CLICK
            r0[r2] = r3
            com.fyber.inneractive.sdk.player.e r7 = (com.fyber.inneractive.sdk.player.e) r7
            com.fyber.inneractive.sdk.model.vast.b r3 = r7.x
            r7.a(r3, r6, r0)
            com.fyber.inneractive.sdk.player.b r7 = r4.a
            com.fyber.inneractive.sdk.measurement.d r7 = r7.i
            if (r7 == 0) goto L73
            com.iab.omid.library.fyber.adsession.media.MediaEvents r0 = r7.c
            if (r0 == 0) goto L73
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r3 = "OMVideo"
            r0[r2] = r3
            java.lang.String r3 = "%s click"
            com.fyber.inneractive.sdk.util.IAlog.a(r3, r0)
            com.iab.omid.library.fyber.adsession.media.MediaEvents r0 = r7.c     // Catch: java.lang.Throwable -> L6f
            com.iab.omid.library.fyber.adsession.media.InteractionType r3 = com.iab.omid.library.fyber.adsession.media.InteractionType.CLICK     // Catch: java.lang.Throwable -> L6f
            r0.adUserInteraction(r3)     // Catch: java.lang.Throwable -> L6f
            goto L73
        L6f:
            r0 = move-exception
            r7.a(r0)
        L73:
            com.fyber.inneractive.sdk.util.x$d r5 = r5.a
            com.fyber.inneractive.sdk.util.x$d r7 = com.fyber.inneractive.sdk.util.x.d.FAILED
            if (r5 == r7) goto L7a
            goto L7b
        L7a:
            r1 = 0
        L7b:
            com.fyber.inneractive.sdk.player.enums.VideoClickOrigin r5 = com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.VIDEO
            if (r6 != r5) goto L86
            com.fyber.inneractive.sdk.config.f0$b r5 = com.fyber.inneractive.sdk.config.f0.b.VIDEO
            java.lang.String r5 = r5.value
            r4.a(r5)
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.k.a(boolean, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin, com.fyber.inneractive.sdk.util.k0):boolean");
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void a(com.fyber.inneractive.sdk.model.vast.g gVar, int i) {
        com.fyber.inneractive.sdk.config.global.s sVar;
        com.fyber.inneractive.sdk.flow.vast.c cVar;
        com.fyber.inneractive.sdk.web.b bVar;
        com.fyber.inneractive.sdk.flow.k kVar;
        com.fyber.inneractive.sdk.model.vast.c cVar2;
        com.fyber.inneractive.sdk.player.b bVar2 = this.a;
        if (bVar2 != null) {
            com.fyber.inneractive.sdk.player.e eVar = (com.fyber.inneractive.sdk.player.e) bVar2;
            eVar.getClass();
            IAlog.a("notifyCompanionDisplayed", new Object[0]);
            int i2 = e.b.a[gVar.ordinal()];
            if (i2 == 1) {
                if (eVar.C) {
                    return;
                }
                com.fyber.inneractive.sdk.network.p pVar = com.fyber.inneractive.sdk.network.p.VAST_DEFAULT_COMPANION_DISPLAYED;
                InneractiveAdRequest inneractiveAdRequest = eVar.g;
                d0 d0Var = eVar.f;
                new q.a(pVar, inneractiveAdRequest, d0Var != null ? (com.fyber.inneractive.sdk.response.g) d0Var.b : null, (d0Var == null || (sVar = d0Var.c) == null) ? null : sVar.c()).a((String) null);
                eVar.C = true;
            } else if (i2 != 2) {
                if (eVar.c() == null || (kVar = eVar.B) == null || kVar.g || (cVar2 = eVar.x.h) == null) {
                    return;
                }
                eVar.a(cVar2, VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.s.EVENT_CREATIVE_VIEW);
                com.fyber.inneractive.sdk.flow.k kVar2 = eVar.B;
                if (!kVar2.g) {
                    com.fyber.inneractive.sdk.network.p pVar2 = com.fyber.inneractive.sdk.network.p.VAST_COMPANION_DISPLAYED;
                    InneractiveAdRequest inneractiveAdRequest2 = kVar2.b;
                    com.fyber.inneractive.sdk.response.g gVar2 = kVar2.c;
                    com.fyber.inneractive.sdk.config.global.s sVar2 = kVar2.d;
                    q.a aVar = new q.a(pVar2, inneractiveAdRequest2, gVar2, sVar2 == null ? null : sVar2.c());
                    aVar.a("companion_data", kVar2.e.h.a());
                    aVar.a((String) null);
                }
                kVar2.g = true;
            } else {
                com.fyber.inneractive.sdk.flow.k kVar3 = eVar.B;
                if (kVar3 == null || (cVar = kVar3.l) == null) {
                    return;
                }
                cVar.c = true;
                InneractiveAdRequest inneractiveAdRequest3 = kVar3.b;
                com.fyber.inneractive.sdk.response.g gVar3 = kVar3.c;
                com.fyber.inneractive.sdk.config.global.s sVar3 = kVar3.d;
                cVar.d = i;
                c0 c0Var = cVar.g.a;
                cVar.e = (!(c0Var instanceof com.fyber.inneractive.sdk.web.c) || (bVar = ((com.fyber.inneractive.sdk.web.c) c0Var).Q) == null) ? null : bVar.b;
                if (cVar.h) {
                    return;
                }
                q.a aVar2 = new q.a(com.fyber.inneractive.sdk.network.p.FMP_COMPANION_SUCCESSFULLY_SHOWN, inneractiveAdRequest3, gVar3, sVar3 == null ? null : sVar3.c());
                cVar.a(aVar2);
                aVar2.a((String) null);
                cVar.h = true;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void a(com.fyber.inneractive.sdk.player.controller.c cVar) {
        o oVar = new o(this);
        c0 c0Var = cVar.a;
        if (c0Var != null) {
            c0Var.setListener(oVar);
        }
    }

    public static boolean a(k kVar) {
        return kVar.c() != null && kVar.c().c;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void a(Bitmap bitmap) {
        g gVar;
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar == null || (gVar = bVar.b) == null || gVar.e == com.fyber.inneractive.sdk.player.enums.b.Completed) {
            return;
        }
        this.d.a(bVar.k);
        this.d.b(true);
        this.d.setLastFrameBitmap(bitmap);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void a(long j) {
        View view;
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        View c2 = bVar != null ? bVar.c() : null;
        com.fyber.inneractive.sdk.player.ui.l lVar = this.d;
        boolean z = c2 == null;
        ObjectAnimator objectAnimator = lVar.L;
        if (objectAnimator != null) {
            if (objectAnimator.getDuration() <= j) {
                ViewGroup viewGroup = lVar.z;
                if (viewGroup != null) {
                    lVar.a((View) viewGroup.getParent(), 4);
                }
                lVar.L.start();
                lVar.L.addListener(new com.fyber.inneractive.sdk.player.ui.m(lVar));
            } else {
                lVar.M = true;
                lVar.L = null;
                ViewGroup viewGroup2 = lVar.z;
                if (viewGroup2 != null && viewGroup2.getParent() != null) {
                    ((View) lVar.z.getParent()).setOnTouchListener(null);
                }
            }
            if (z && (view = lVar.y) != null) {
                view.setVisibility(0);
                return;
            }
            ViewGroup viewGroup3 = lVar.z;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(0);
            }
        }
    }
}
