package com.fyber.inneractive.sdk.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.measurement.a;
import com.fyber.inneractive.sdk.mraid.a0;
import com.fyber.inneractive.sdk.mraid.b0;
import com.fyber.inneractive.sdk.mraid.e;
import com.fyber.inneractive.sdk.mraid.f;
import com.fyber.inneractive.sdk.mraid.h;
import com.fyber.inneractive.sdk.mraid.j;
import com.fyber.inneractive.sdk.mraid.k;
import com.fyber.inneractive.sdk.mraid.l;
import com.fyber.inneractive.sdk.mraid.n;
import com.fyber.inneractive.sdk.mraid.o;
import com.fyber.inneractive.sdk.mraid.p;
import com.fyber.inneractive.sdk.mraid.q;
import com.fyber.inneractive.sdk.mraid.r;
import com.fyber.inneractive.sdk.mraid.s;
import com.fyber.inneractive.sdk.mraid.u;
import com.fyber.inneractive.sdk.mraid.v;
import com.fyber.inneractive.sdk.mraid.w;
import com.fyber.inneractive.sdk.mraid.x;
import com.fyber.inneractive.sdk.mraid.y;
import com.fyber.inneractive.sdk.mraid.z;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.util.m;
import com.fyber.inneractive.sdk.web.g;
import com.fyber.inneractive.sdk.web.i;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.net.URI;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public class IAmraidWebViewController extends i<i.f> {
    public i.g r0;
    public final Runnable s0;
    public final Runnable t0;

    /* loaded from: classes.dex */
    public static class MraidVideoFailedToDisplayError extends InneractiveUnitController.AdDisplayError {
        public MraidVideoFailedToDisplayError(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$a$a */
        /* loaded from: classes.dex */
        public class ViewTreeObserver$OnPreDrawListenerC0055a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$a$a$a */
            /* loaded from: classes.dex */
            public class RunnableC0056a implements Runnable {
                public RunnableC0056a() {
                    ViewTreeObserver$OnPreDrawListenerC0055a.this = r1;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.InterfaceC0020a interfaceC0020a;
                    IAmraidWebViewController iAmraidWebViewController = IAmraidWebViewController.this;
                    if (iAmraidWebViewController.K == null || (interfaceC0020a = iAmraidWebViewController.L) == null) {
                        return;
                    }
                    interfaceC0020a.a();
                }
            }

            public ViewTreeObserver$OnPreDrawListenerC0055a() {
                a.this = r1;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                g gVar;
                g gVar2 = IAmraidWebViewController.this.b;
                if (gVar2 != null) {
                    gVar2.getViewTreeObserver().removeOnPreDrawListener(this);
                    IAmraidWebViewController.this.n();
                    IAmraidWebViewController iAmraidWebViewController = IAmraidWebViewController.this;
                    iAmraidWebViewController.a(new x(iAmraidWebViewController.r0));
                    IAmraidWebViewController iAmraidWebViewController2 = IAmraidWebViewController.this;
                    if (iAmraidWebViewController2.r0 == i.g.INTERSTITIAL && (gVar = iAmraidWebViewController2.b) != null) {
                        gVar.a("if (window.showInterstitial) { showInterstitial(); }");
                    }
                    g gVar3 = IAmraidWebViewController.this.b;
                    if (gVar3 != null) {
                        gVar3.a("window.mraidbridge.fireReadyEvent();");
                    }
                    IAmraidWebViewController iAmraidWebViewController3 = IAmraidWebViewController.this;
                    iAmraidWebViewController3.a(iAmraidWebViewController3.b.getContext(), true);
                    IAmraidWebViewController.this.r();
                    m.b.postDelayed(new RunnableC0056a(), 100L);
                    return false;
                }
                return false;
            }
        }

        public a() {
            IAmraidWebViewController.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = IAmraidWebViewController.this.b;
            if (gVar != null) {
                gVar.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC0055a());
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            IAmraidWebViewController.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = IAmraidWebViewController.this.b;
            if (gVar != null) {
                gVar.a("if (FyberMraidVideoController.getCurrentTime() < 0.2) { var ifr = document.createElement('iframe'); var container = document.body || document.documentElement; container.appendChild(ifr); ifr.setAttribute('sandbox', ''); ifr.setAttribute('style', 'position: fixed; bottom: -20px; border: none; visibility: hidden; height: 20px; z-index: -99999'); ifr.setAttribute('src','FyMraidVideo://fyMraidVideoAdPlaybackFailure'); console.log('dispatched closure event'); } else { console.log('video has progressed'); };");
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
            IAmraidWebViewController.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = IAmraidWebViewController.this.b;
            if (gVar != null) {
                try {
                    gVar.invalidate();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public IAmraidWebViewController(Context context, boolean z, i.g gVar, i.d dVar, i.h hVar, boolean z2, com.fyber.inneractive.sdk.measurement.a aVar) {
        super(context, z, false, gVar, dVar, hVar, aVar);
        this.s0 = new a();
        this.t0 = new b();
        this.H = z2;
        this.b.setId(R.id.inneractive_webview_mraid);
        this.r0 = gVar;
    }

    @Override // com.fyber.inneractive.sdk.web.d
    public boolean a(String str, k0 k0Var) {
        com.fyber.inneractive.sdk.mraid.b cVar;
        g gVar;
        Uri parse = Uri.parse(str);
        String uri = parse.toString();
        parse.getScheme();
        if (uri.startsWith("iaadfinishedloading")) {
            if (uri.endsWith(FirebaseAnalytics.Param.SUCCESS)) {
                IAlog.d("received iaadfinishedloading success", new Object[0]);
                if (!this.a && this.f != null && (gVar = this.b) != null) {
                    gVar.a();
                    this.a = true;
                    g();
                }
            }
            return true;
        }
        String scheme = Uri.parse(str).getScheme();
        g gVar2 = this.b;
        if (gVar2 != null && gVar2.isShown()) {
            if (!"mraid".equals(scheme)) {
                return false;
            }
            URI create = URI.create(str);
            String host = create.getHost();
            try {
                Map<String, String> a2 = a(create);
                switch (f.a[com.fyber.inneractive.sdk.mraid.g.a(host).ordinal()]) {
                    case 1:
                        cVar = new com.fyber.inneractive.sdk.mraid.c(a2, this, k0Var);
                        break;
                    case 2:
                        cVar = new e(a2, this, k0Var);
                        break;
                    case 3:
                        cVar = new s(a2, this, k0Var);
                        break;
                    case 4:
                        cVar = new com.fyber.inneractive.sdk.mraid.m(a2, this, k0Var);
                        break;
                    case 5:
                        cVar = new o(a2, this, k0Var);
                        break;
                    case 6:
                        cVar = new k(a2, this, k0Var);
                        break;
                    case 7:
                        cVar = new q(a2, this, k0Var);
                        break;
                    case 8:
                        cVar = new p(a2, this, k0Var);
                        break;
                    case 9:
                        cVar = new n(a2, this, k0Var);
                        break;
                    case 10:
                        cVar = new r(a2, this, k0Var);
                        break;
                    case 11:
                        cVar = new h(a2, this, k0Var);
                        break;
                    case 12:
                        cVar = new com.fyber.inneractive.sdk.mraid.i(a2, this, k0Var);
                        break;
                    case 13:
                        cVar = new j(a2, this, k0Var);
                        break;
                    case 14:
                        cVar = new l(a2, this, k0Var);
                        break;
                    case 15:
                        cVar = new com.fyber.inneractive.sdk.mraid.d(a2, this, k0Var);
                        break;
                    default:
                        cVar = null;
                        break;
                }
                if (cVar != null && (!(cVar instanceof e) || this.T != i.g.INTERSTITIAL)) {
                    cVar.a = host;
                    IAlog.d("Processing MRaid command: %s", host);
                    if (cVar instanceof com.fyber.inneractive.sdk.mraid.a) {
                        a(new i.j((com.fyber.inneractive.sdk.mraid.a) cVar, k0Var));
                    } else {
                        if (cVar.b()) {
                            j();
                        }
                        cVar.a();
                    }
                    b(host);
                } else {
                    b(host);
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.web.d
    public void c() {
        b(false);
        Handler handler = m.b;
        handler.removeCallbacks(this.t0);
        handler.removeCallbacks(this.s0);
    }

    @Override // com.fyber.inneractive.sdk.web.d
    public a.InterfaceC0020a d() {
        return this.L;
    }

    @Override // com.fyber.inneractive.sdk.web.c0
    public void n() {
        int i;
        ArrayList<u> arrayList = new ArrayList<>();
        g gVar = this.b;
        if (gVar != null && gVar.getScaleX() != 1.0f && this.b.getScaleY() != 1.0f) {
            arrayList.add(new y(this.b.getWidthDp(), this.b.getHeightDp()));
            arrayList.add(new w(this.b.getWidthDp(), this.b.getHeightDp()));
        } else {
            arrayList.add(new y(this.c0, this.d0));
            arrayList.add(new w(this.e0, this.f0));
        }
        g gVar2 = this.b;
        int c2 = com.fyber.inneractive.sdk.util.l.c(gVar2 != null ? gVar2.getWidth() : this.e0);
        g gVar3 = this.b;
        if (gVar3 != null) {
            i = gVar3.getHeight();
        } else {
            i = this.f0;
        }
        boolean z = false;
        arrayList.add(new v(0, 0, c2, com.fyber.inneractive.sdk.util.l.c(i)));
        a(arrayList);
        b0 b0Var = b0.DEFAULT;
        this.Q = b0Var;
        a(new z(b0Var));
        g gVar4 = this.b;
        if (gVar4 != null && gVar4.getContext() != null) {
            z = com.fyber.inneractive.sdk.util.j.a(new Intent(this.b.getContext(), InneractiveRichMediaVideoPlayerActivityCore.class));
        }
        a0 a0Var = new a0();
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        a0Var.b = com.fyber.inneractive.sdk.util.j.a(intent);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        a0Var.a = com.fyber.inneractive.sdk.util.j.a(intent2);
        a0Var.c = com.fyber.inneractive.sdk.util.j.a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event"));
        a0Var.e = z;
        a0Var.d = com.fyber.inneractive.sdk.util.j.n();
        a(a0Var);
    }

    @Override // com.fyber.inneractive.sdk.web.c0
    public void r() {
        g gVar;
        if (this.E && this.F && this.C && (gVar = this.b) != null) {
            gVar.a("FyberMraidVideoController.play()");
            Runnable runnable = this.t0;
            if (runnable != null) {
                m.b.postDelayed(runnable, 5000L);
            }
            if (this.G) {
                this.b.a("FyberMraidVideoController.mute(true)");
            }
        }
    }

    public void setMuteMraidVideo(boolean z) {
        this.G = z;
    }

    public final void a(long j) {
        m.b.postDelayed(new c(), j);
    }

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.d, com.fyber.inneractive.sdk.web.f
    public boolean a(WebView webView, String str) {
        IAlog.a("IAmraidWebViewController: handleUrl = %s", str);
        if (this.b == null) {
            IAlog.a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        } else if (str != null && str.toLowerCase().startsWith("FyMraidVideo".toLowerCase())) {
            if (str.toLowerCase().endsWith("fyMraidVideoAd".toLowerCase())) {
                IAlog.d("Dispatching MRAID Video detection event", new Object[0]);
                com.fyber.inneractive.sdk.network.p pVar = com.fyber.inneractive.sdk.network.p.MRAID_VIDEO_DETECTED;
                InneractiveAdRequest inneractiveAdRequest = this.u;
                com.fyber.inneractive.sdk.flow.o oVar = this.v;
                com.fyber.inneractive.sdk.response.e d = oVar == null ? null : oVar.d();
                com.fyber.inneractive.sdk.flow.o oVar2 = this.v;
                new q.a(pVar, inneractiveAdRequest, d, oVar2 == null ? null : oVar2.c.c()).a((String) null);
                this.F = true;
                r();
            } else if (str.toLowerCase().endsWith("fyMraidVideoAdPlaybackFailure".toLowerCase())) {
                IAlog.b("MRAID Video has not started in a timely fashion, showing close button", new Object[0]);
                if (this.g != 0) {
                    c(false);
                    com.fyber.inneractive.sdk.network.o oVar3 = com.fyber.inneractive.sdk.network.o.MRAID_VIDEO_HAS_NOT_STARTED_PLAYING_IN_A_TIMELY_FASHION;
                    InneractiveAdRequest inneractiveAdRequest2 = this.u;
                    com.fyber.inneractive.sdk.flow.o oVar4 = this.v;
                    com.fyber.inneractive.sdk.response.e d2 = oVar4 == null ? null : oVar4.d();
                    com.fyber.inneractive.sdk.flow.o oVar5 = this.v;
                    new q.a(oVar3, inneractiveAdRequest2, d2, oVar5 == null ? null : oVar5.c.c()).a("video_timeout_in_msecs", String.valueOf(5000)).a((String) null);
                }
                L l = this.g;
                if (l != 0) {
                    ((i.f) l).a(new MraidVideoFailedToDisplayError("an MRAID video has not started playing in a timely fashion"));
                }
            } else if (str.toLowerCase().endsWith("fyMraidVideoAdCompleted".toLowerCase())) {
                L l2 = this.g;
                if (l2 instanceof i.k) {
                    ((i.k) l2).a();
                }
            }
            return true;
        } else {
            return super.a(webView, str);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.d, com.fyber.inneractive.sdk.web.g.a
    public void a(boolean z) {
        g gVar;
        super.a(z);
        if (this.F && this.E && this.C && (gVar = this.b) != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("FyberMraidVideoController.");
            sb.append(z ? "play" : "pause");
            sb.append("();");
            gVar.a(sb.toString());
        }
        if (this.b == null || !z) {
            return;
        }
        a(1L);
        a(100L);
        a(250L);
        a(1000L);
    }
}
