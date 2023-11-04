package com.fyber.inneractive.sdk.web;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.measurement.a;
import com.fyber.inneractive.sdk.measurement.tracker.c;
import com.fyber.inneractive.sdk.network.i0;
import com.fyber.inneractive.sdk.network.n0;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.ui.IAcloseButton;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.web.d;
import com.fyber.inneractive.sdk.web.i.f;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.fyber.adsession.Partner;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class i<T extends f> extends c0<T> {
    public static final String[] q0 = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};
    public com.fyber.inneractive.sdk.mraid.b0 Q;
    public final d R;
    public final h S;
    public g T;
    public ViewGroup U;
    public com.fyber.inneractive.sdk.web.g V;
    public boolean W;
    public int X;
    public i<T>.C0058i Y;
    public IAcloseButton Z;
    public boolean a0;
    public float b0;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public Orientation i0;
    public int j0;
    public FrameLayout k0;
    public FrameLayout l0;
    public RelativeLayout m0;
    public int n0;
    public int o0;
    public OnBackInvokedCallback p0;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
            i.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.s();
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnKeyListener {
        public b() {
            i.this = r1;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i == 4 && i.this.p()) {
                IAlog.d("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
                i.this.s();
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class c implements com.fyber.inneractive.sdk.network.u<String> {
        public c() {
            i.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.network.u
        public void a(String str, Exception exc, boolean z) {
            String str2 = str;
            if (exc == null && !TextUtils.isEmpty(str2)) {
                i iVar = i.this;
                if (iVar.m() != null) {
                    e eVar = new e(iVar, str2, null);
                    MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(iVar.m().getApplicationContext(), eVar);
                    eVar.b = mediaScannerConnection;
                    mediaScannerConnection.connect();
                    return;
                }
                return;
            }
            com.fyber.inneractive.sdk.util.m.b.post(new p(this));
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        ENABLED,
        DISABLED
    }

    /* loaded from: classes.dex */
    public class e implements MediaScannerConnection.MediaScannerConnectionClient {
        public final String a;
        public MediaScannerConnection b;

        public e(i iVar, String str, String str2) {
            this.a = str;
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public void onMediaScannerConnected() {
            MediaScannerConnection mediaScannerConnection = this.b;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.scanFile(this.a, null);
            }
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            MediaScannerConnection mediaScannerConnection = this.b;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.disconnect();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface f extends d0 {
        void a(InneractiveUnitController.AdDisplayError adDisplayError);

        void a(i iVar);

        void a(i iVar, com.fyber.inneractive.sdk.mraid.b0 b0Var);

        void a(i iVar, boolean z);

        void a(i iVar, boolean z, Orientation orientation);

        boolean a(String str);

        void b(i iVar);

        void c();
    }

    /* loaded from: classes.dex */
    public enum g {
        INLINE,
        INTERSTITIAL
    }

    /* loaded from: classes.dex */
    public enum h {
        ALWAYS_VISIBLE,
        ALWAYS_HIDDEN,
        AD_CONTROLLED
    }

    /* renamed from: com.fyber.inneractive.sdk.web.i$i */
    /* loaded from: classes.dex */
    public class C0058i extends BroadcastReceiver {
        public Context a;
        public int b = -1;

        public C0058i() {
            i.this = r1;
        }

        public void a() {
            try {
                i iVar = i.this;
                iVar.getClass();
                IAlog.a("%sunregister screen broadcast receiver called", IAlog.a(iVar));
                if (this.a != null) {
                    i iVar2 = i.this;
                    iVar2.getClass();
                    IAlog.a("%sunregistering broadcast receiver", IAlog.a(iVar2));
                    this.a.unregisterReceiver(this);
                    this.a = null;
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int rotation;
            if ((this.a != null) && "android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) && (rotation = ((WindowManager) IAConfigManager.M.v.a().getSystemService("window")).getDefaultDisplay().getRotation()) != this.b) {
                this.b = rotation;
                i iVar = i.this;
                com.fyber.inneractive.sdk.web.g gVar = iVar.b;
                if (gVar != null) {
                    gVar.getViewTreeObserver().addOnPreDrawListener(new com.fyber.inneractive.sdk.web.j(iVar, context));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class j implements d.InterfaceC0057d {
        public com.fyber.inneractive.sdk.mraid.a a;

        public j(com.fyber.inneractive.sdk.mraid.a aVar, k0 k0Var) {
            i.this = r1;
            this.a = aVar;
        }

        @Override // com.fyber.inneractive.sdk.web.d.InterfaceC0057d
        public String a() {
            return this.a.c();
        }

        @Override // com.fyber.inneractive.sdk.web.d.InterfaceC0057d
        public void b() {
            com.fyber.inneractive.sdk.mraid.a aVar = this.a;
            if (aVar != null) {
                aVar.d();
            }
        }

        @Override // com.fyber.inneractive.sdk.web.d.InterfaceC0057d
        public String c() {
            return this.a.a;
        }

        @Override // com.fyber.inneractive.sdk.web.d.InterfaceC0057d
        public void d() {
            IAmraidWebViewController iAmraidWebViewController = (IAmraidWebViewController) i.this;
            if (iAmraidWebViewController.L != null) {
                iAmraidWebViewController.L.b();
            }
            this.a.a();
        }

        public String toString() {
            return "action = " + this.a.a + " url = " + this.a.c();
        }
    }

    /* loaded from: classes.dex */
    public interface k extends f {
        void a();
    }

    /* loaded from: classes.dex */
    public static abstract class l implements f {
        @Override // com.fyber.inneractive.sdk.web.d0
        public void a(boolean z) {
        }
    }

    public i(Context context, boolean z, boolean z2, g gVar, d dVar, h hVar, com.fyber.inneractive.sdk.measurement.a aVar) {
        super(context, z, z2, gVar);
        this.Q = com.fyber.inneractive.sdk.mraid.b0.HIDDEN;
        this.W = false;
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = Orientation.NONE;
        this.K = aVar;
        this.T = gVar;
        this.R = dVar;
        this.S = hVar;
    }

    @Override // com.fyber.inneractive.sdk.web.d, com.fyber.inneractive.sdk.web.g.a
    public void a(boolean z) {
        a(new com.fyber.inneractive.sdk.mraid.c0(z));
        super.a(z);
    }

    @Override // com.fyber.inneractive.sdk.web.d
    public void b(boolean z) {
        com.fyber.inneractive.sdk.util.m.b.post(new com.fyber.inneractive.sdk.web.l(this));
        com.fyber.inneractive.sdk.web.g gVar = this.V;
        if (gVar != null && gVar.getParent() != null && (this.V.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.V.getParent()).removeView(this.V);
            this.V = null;
        }
        u();
        this.a = false;
        if (Build.VERSION.SDK_INT >= 33) {
            v();
        }
        super.b(z);
    }

    public final Date c(String str) {
        Date date = null;
        int i = 0;
        while (true) {
            String[] strArr = q0;
            if (i >= strArr.length) {
                break;
            }
            try {
                date = new SimpleDateFormat(strArr[i], Locale.getDefault()).parse(str);
            } catch (ParseException unused) {
            }
            if (date != null) {
                break;
            }
            i++;
        }
        return date;
    }

    public void d(boolean z) {
        if (this.U == null) {
            return;
        }
        if (z) {
            int b2 = com.fyber.inneractive.sdk.util.l.b(35);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b2, b2);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.rightMargin = com.fyber.inneractive.sdk.util.l.b(10);
            layoutParams.topMargin = com.fyber.inneractive.sdk.util.l.b(10);
            if (this.Z == null) {
                IAcloseButton iAcloseButton = new IAcloseButton(m(), b2, true);
                this.Z = iAcloseButton;
                iAcloseButton.setOnClickListener(new a());
            }
            com.fyber.inneractive.sdk.util.q.a(this.Z);
            this.m0.addView(this.Z, layoutParams);
        } else {
            this.m0.removeView(this.Z);
        }
        L l2 = this.g;
        if (l2 != 0) {
            ((f) l2).a(this, z);
        }
        this.a0 = !z;
    }

    public final void e(boolean z) {
        try {
            Activity activity = (Activity) m();
            if (activity != null) {
                if (z && activity.getResources() != null && activity.getResources().getConfiguration() != null) {
                    activity.setRequestedOrientation(activity.getResources().getConfiguration().orientation);
                } else {
                    activity.setRequestedOrientation(this.X);
                }
            }
        } catch (Exception unused) {
            IAlog.a("Failed to modify the device orientation.", new Object[0]);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.d
    public k0 f() {
        com.fyber.inneractive.sdk.web.g gVar;
        if (this.Q == com.fyber.inneractive.sdk.mraid.b0.EXPANDED && (gVar = this.V) != null) {
            return gVar.getLastClickedLocation();
        }
        com.fyber.inneractive.sdk.web.g gVar2 = this.b;
        return gVar2 != null ? gVar2.getLastClickedLocation() : k0.a();
    }

    @Override // com.fyber.inneractive.sdk.web.d
    public void g() {
        com.fyber.inneractive.sdk.measurement.tracker.c aVar;
        com.fyber.inneractive.sdk.measurement.tracker.c cVar;
        com.fyber.inneractive.sdk.measurement.a aVar2 = this.K;
        if (aVar2 != null) {
            com.fyber.inneractive.sdk.web.g gVar = this.b;
            com.fyber.inneractive.sdk.flow.o oVar = this.v;
            com.fyber.inneractive.sdk.measurement.b bVar = (com.fyber.inneractive.sdk.measurement.b) aVar2;
            bVar.getClass();
            boolean z = false;
            IAlog.a("omsdk initMraidSession", new Object[0]);
            if (bVar.e == null) {
                IAlog.a("omsdk partner is null", new Object[0]);
                cVar = null;
            } else {
                if (oVar != null && oVar.d() != null && oVar.d().H) {
                    z = true;
                }
                com.fyber.inneractive.sdk.measurement.tracker.d dVar = bVar.f;
                Partner partner = bVar.e;
                dVar.getClass();
                if (z) {
                    aVar = new com.fyber.inneractive.sdk.measurement.tracker.b(partner, gVar, oVar);
                } else {
                    aVar = new com.fyber.inneractive.sdk.measurement.tracker.a(partner, gVar, oVar);
                }
                cVar = aVar;
                cVar.a(gVar);
            }
            this.L = cVar;
        }
        super.g();
    }

    @Override // com.fyber.inneractive.sdk.web.d
    public void h() {
        super.h();
        this.Q = com.fyber.inneractive.sdk.mraid.b0.LOADING;
        Context m = m();
        this.X = m instanceof Activity ? ((Activity) m).getRequestedOrientation() : -1;
        IAConfigManager iAConfigManager = IAConfigManager.M;
        this.l0 = new FrameLayout(iAConfigManager.v.a());
        this.m0 = new RelativeLayout(iAConfigManager.v.a());
        FrameLayout frameLayout = new FrameLayout(iAConfigManager.v.a());
        frameLayout.setBackgroundColor(-858993460);
        this.k0 = frameLayout;
        a(m, false);
        this.b.setOnKeyListener(new b());
    }

    @Override // com.fyber.inneractive.sdk.web.c0
    public void l() {
        com.fyber.inneractive.sdk.web.g gVar = this.b;
        if (gVar != null) {
            gVar.a("window.mraidbridge.fireReadyEvent();");
        }
    }

    @Override // com.fyber.inneractive.sdk.web.c0
    public Context m() {
        com.fyber.inneractive.sdk.web.g gVar = this.b;
        if (gVar != null) {
            return gVar.getContext();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.web.c0
    public boolean p() {
        return this.Q == com.fyber.inneractive.sdk.mraid.b0.EXPANDED;
    }

    @Override // com.fyber.inneractive.sdk.web.c0
    public boolean q() {
        g gVar = this.T;
        return gVar != null && gVar.equals(g.INTERSTITIAL);
    }

    public void s() {
        RelativeLayout relativeLayout;
        this.W = false;
        com.fyber.inneractive.sdk.mraid.b0 b0Var = this.Q;
        com.fyber.inneractive.sdk.mraid.b0 b0Var2 = com.fyber.inneractive.sdk.mraid.b0.EXPANDED;
        if (b0Var != b0Var2 && b0Var != com.fyber.inneractive.sdk.mraid.b0.RESIZED) {
            if (b0Var == com.fyber.inneractive.sdk.mraid.b0.DEFAULT) {
                com.fyber.inneractive.sdk.web.g gVar = this.b;
                if (gVar != null) {
                    gVar.setVisibility(4);
                }
                com.fyber.inneractive.sdk.mraid.b0 b0Var3 = com.fyber.inneractive.sdk.mraid.b0.HIDDEN;
                this.Q = b0Var3;
                a(new com.fyber.inneractive.sdk.mraid.z(b0Var3));
            }
        } else {
            d(false);
            com.fyber.inneractive.sdk.web.g gVar2 = this.b;
            if (gVar2 != null) {
                com.fyber.inneractive.sdk.mraid.b0 b0Var4 = this.Q;
                if (b0Var4 == b0Var2) {
                    u();
                    ViewGroup viewGroup = (ViewGroup) this.k0.getParent();
                    if (viewGroup != null) {
                        viewGroup.addView(this.b, this.j0, com.fyber.inneractive.sdk.util.q.a(this.n0, this.o0, 13));
                        viewGroup.removeView(this.k0);
                        viewGroup.invalidate();
                        this.b.requestLayout();
                    }
                    this.g0 = this.n0;
                    this.h0 = this.o0;
                } else if (b0Var4 == com.fyber.inneractive.sdk.mraid.b0.RESIZED) {
                    this.g0 = this.n0;
                    this.h0 = this.o0;
                    ViewGroup.LayoutParams layoutParams = gVar2.getLayoutParams();
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        this.b.setLayoutParams(com.fyber.inneractive.sdk.util.q.a(this.n0, this.o0, 13));
                    } else if (layoutParams instanceof FrameLayout.LayoutParams) {
                        this.b.setLayoutParams(new FrameLayout.LayoutParams(this.n0, this.o0, 17));
                    }
                }
            }
            this.Q = com.fyber.inneractive.sdk.mraid.b0.DEFAULT;
            e(false);
            a(new com.fyber.inneractive.sdk.mraid.z(this.Q));
        }
        com.fyber.inneractive.sdk.web.g gVar3 = this.b;
        if (gVar3 != null && (relativeLayout = (RelativeLayout) gVar3.findViewById(R.id.ia_identifier_overlay)) != null) {
            relativeLayout.setPadding(0, 0, 0, 0);
        }
        L l2 = this.g;
        if (l2 != 0) {
            ((f) l2).a(this, this.Q);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            v();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.c0
    public void setAdDefaultSize(int i, int i2) {
        this.n0 = i;
        this.o0 = i2;
        this.g0 = i;
        this.h0 = i2;
    }

    public void setOrientationProperties(boolean z, String str) {
        if ("portrait".equals(str)) {
            this.i0 = Orientation.PORTRAIT;
        } else if ("landscape".equals(str)) {
            this.i0 = Orientation.LANDSCAPE;
        } else {
            this.i0 = Orientation.NONE;
        }
        L l2 = this.g;
        if (l2 != 0) {
            ((f) l2).a(this, z, this.i0);
        }
    }

    public void setResizeProperties() {
    }

    public boolean t() {
        return this.Q == com.fyber.inneractive.sdk.mraid.b0.RESIZED;
    }

    public final void u() {
        FrameLayout frameLayout = this.l0;
        if (frameLayout == null || this.m0 == null) {
            return;
        }
        frameLayout.removeAllViewsInLayout();
        this.m0.removeAllViewsInLayout();
        ViewGroup viewGroup = this.U;
        if (viewGroup != null) {
            viewGroup.removeView(this.m0);
        }
    }

    public final void v() {
        try {
            if (!(m() instanceof Activity) || this.p0 == null) {
                return;
            }
            ((Activity) m()).getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.p0);
            this.p0 = null;
        } catch (Exception e2) {
            IAlog.e("failed to unregisterOnBackInvokedCallback with error: %s", e2.getMessage());
        }
    }

    @Override // com.fyber.inneractive.sdk.web.g.a
    public void a() {
        com.fyber.inneractive.sdk.util.m.b.post(new com.fyber.inneractive.sdk.web.k(this));
    }

    public void c(boolean z) {
        this.a0 = z;
        L l2 = this.g;
        if (l2 != 0) {
            ((f) l2).a(this, z);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.d, com.fyber.inneractive.sdk.web.f
    public boolean a(WebView webView, String str) {
        IAlog.a("%shandle url for: %s webView = %s", IAlog.a(this), str, webView);
        if (this.Q == com.fyber.inneractive.sdk.mraid.b0.EXPANDED && !TextUtils.isEmpty(str) && webView.equals(this.V) && !this.W) {
            this.W = true;
            return false;
        }
        return super.a(webView, str);
    }

    @Override // com.fyber.inneractive.sdk.web.c0
    public void a(Context context, boolean z) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) IAConfigManager.M.v.a().getSystemService("window");
        if (Build.VERSION.SDK_INT >= 17) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        this.b0 = displayMetrics.density;
        int a2 = com.fyber.inneractive.sdk.util.l.a(context);
        int a3 = com.fyber.inneractive.sdk.util.l.a(context, a2);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        double d2 = i;
        double d3 = displayMetrics.densityDpi;
        Double.isNaN(d3);
        double d4 = 160.0d / d3;
        Double.isNaN(d2);
        int i3 = (int) (d2 * d4);
        double d5 = i2;
        Double.isNaN(d5);
        int i4 = (int) (d5 * d4);
        int i5 = (i2 - a2) - a3;
        com.fyber.inneractive.sdk.web.g gVar = this.b;
        if (gVar != null && gVar.getScaleX() != 1.0f && this.b.getScaleY() != 1.0f) {
            i3 = this.b.getWidthDp();
            i4 = this.b.getHeightDp();
            int b2 = (com.fyber.inneractive.sdk.util.l.b(this.b.getHeightDp()) - a2) - a3;
            this.e0 = this.c0;
            double d6 = b2;
            double d7 = displayMetrics.densityDpi;
            Double.isNaN(d7);
            Double.isNaN(d6);
            this.f0 = (int) (d6 * (160.0d / d7));
        } else {
            double d8 = displayMetrics.densityDpi;
            Double.isNaN(d8);
            double d9 = 160.0d / d8;
            Double.isNaN(d2);
            this.e0 = (int) (d2 * d9);
            double d10 = i5;
            Double.isNaN(d10);
            this.f0 = (int) (d10 * d9);
        }
        if (this.c0 == i3 && this.d0 == i4) {
            return;
        }
        this.c0 = i3;
        this.d0 = i4;
        if (z) {
            a(new com.fyber.inneractive.sdk.mraid.y(i3, i4));
            a(new com.fyber.inneractive.sdk.mraid.w(this.e0, this.f0));
            a(new com.fyber.inneractive.sdk.mraid.v(0, 0, this.e0, this.f0));
            int i6 = this.g0;
            if (i6 > 0 && this.h0 > 0) {
                a(new com.fyber.inneractive.sdk.mraid.t(com.fyber.inneractive.sdk.util.l.c(i6), com.fyber.inneractive.sdk.util.l.c(this.h0)));
                return;
            }
            com.fyber.inneractive.sdk.web.g gVar2 = this.b;
            if (gVar2 == null || gVar2.getWidth() <= 0 || this.b.getHeight() <= 0) {
                return;
            }
            a(new com.fyber.inneractive.sdk.mraid.t(com.fyber.inneractive.sdk.util.l.c(this.b.getWidth()), com.fyber.inneractive.sdk.util.l.c(this.b.getHeight())));
        }
    }

    @Override // com.fyber.inneractive.sdk.web.g.a
    public void b() {
        com.fyber.inneractive.sdk.util.m.b.post(new com.fyber.inneractive.sdk.web.l(this));
    }

    public void b(String str) {
        com.fyber.inneractive.sdk.web.g gVar = this.b;
        if (gVar != null) {
            gVar.a("window.mraidbridge.nativeCallComplete('" + str + "');");
        }
    }

    public final Map<String, Object> a(Map<String, String> map) throws Exception {
        String str;
        HashMap hashMap = new HashMap();
        if (map.containsKey("description") && map.containsKey("start")) {
            hashMap.put("title", map.get("description"));
            if (map.containsKey("start") && map.get("start") != null) {
                Date c2 = c(map.get("start"));
                if (c2 != null) {
                    hashMap.put("beginTime", Long.valueOf(c2.getTime()));
                    if (map.containsKey("end") && map.get("end") != null) {
                        Date c3 = c(map.get("end"));
                        if (c3 != null) {
                            hashMap.put("endTime", Long.valueOf(c3.getTime()));
                        } else {
                            throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                        }
                    }
                    if (map.containsKey(FirebaseAnalytics.Param.LOCATION)) {
                        hashMap.put("eventLocation", map.get(FirebaseAnalytics.Param.LOCATION));
                    }
                    if (map.containsKey("summary")) {
                        hashMap.put("description", map.get("summary"));
                    }
                    if (map.containsKey("transparency")) {
                        hashMap.put("availability", Integer.valueOf("transparent".equals(map.get("transparency")) ? 1 : 0));
                    }
                    StringBuilder sb = new StringBuilder();
                    if (map.containsKey("frequency")) {
                        String str2 = map.get("frequency");
                        int parseInt = map.containsKey("interval") ? Integer.parseInt(map.get("interval")) : -1;
                        if ("daily".equals(str2)) {
                            sb.append("FREQ=DAILY;");
                            if (parseInt != -1) {
                                sb.append("INTERVAL=" + parseInt + ";");
                            }
                        } else {
                            if ("weekly".equals(str2)) {
                                sb.append("FREQ=WEEKLY;");
                                if (parseInt != -1) {
                                    sb.append("INTERVAL=" + parseInt + ";");
                                }
                                if (map.containsKey("daysInWeek")) {
                                    StringBuilder sb2 = new StringBuilder();
                                    boolean[] zArr = new boolean[7];
                                    String[] split = map.get("daysInWeek").split(",");
                                    for (String str3 : split) {
                                        int parseInt2 = Integer.parseInt(str3);
                                        if (parseInt2 == 7) {
                                            parseInt2 = 0;
                                        }
                                        if (!zArr[parseInt2]) {
                                            StringBuilder sb3 = new StringBuilder();
                                            switch (parseInt2) {
                                                case 0:
                                                    str = "SU";
                                                    break;
                                                case 1:
                                                    str = "MO";
                                                    break;
                                                case 2:
                                                    str = "TU";
                                                    break;
                                                case 3:
                                                    str = "WE";
                                                    break;
                                                case 4:
                                                    str = "TH";
                                                    break;
                                                case 5:
                                                    str = "FR";
                                                    break;
                                                case 6:
                                                    str = "SA";
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException("invalid day of week " + parseInt2);
                                            }
                                            sb3.append(str);
                                            sb3.append(",");
                                            sb2.append(sb3.toString());
                                            zArr[parseInt2] = true;
                                        }
                                    }
                                    if (split.length != 0) {
                                        sb2.deleteCharAt(sb2.length() - 1);
                                        String sb4 = sb2.toString();
                                        if (sb4 == null) {
                                            throw new IllegalArgumentException("invalid ");
                                        }
                                        sb.append("BYDAY=" + sb4 + ";");
                                    } else {
                                        throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
                                    }
                                }
                            } else if ("monthly".equals(str2)) {
                                sb.append("FREQ=MONTHLY;");
                                if (parseInt != -1) {
                                    sb.append("INTERVAL=" + parseInt + ";");
                                }
                                if (map.containsKey("daysInMonth")) {
                                    StringBuilder sb5 = new StringBuilder();
                                    boolean[] zArr2 = new boolean[63];
                                    String[] split2 = map.get("daysInMonth").split(",");
                                    for (String str4 : split2) {
                                        int parseInt3 = Integer.parseInt(str4);
                                        int i = parseInt3 + 31;
                                        if (!zArr2[i]) {
                                            StringBuilder sb6 = new StringBuilder();
                                            if (parseInt3 != 0 && parseInt3 >= -31 && parseInt3 <= 31) {
                                                sb6.append("" + parseInt3);
                                                sb6.append(",");
                                                sb5.append(sb6.toString());
                                                zArr2[i] = true;
                                            } else {
                                                throw new IllegalArgumentException("invalid day of month " + parseInt3);
                                            }
                                        }
                                    }
                                    if (split2.length != 0) {
                                        sb5.deleteCharAt(sb5.length() - 1);
                                        String sb7 = sb5.toString();
                                        if (sb7 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        sb.append("BYMONTHDAY=" + sb7 + ";");
                                    } else {
                                        throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                            }
                        }
                    }
                    String sb8 = sb.toString();
                    if (!TextUtils.isEmpty(sb8)) {
                        hashMap.put("rrule", sb8);
                    }
                    return hashMap;
                }
                throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
            }
            throw new IllegalArgumentException("Invalid calendar event: start is null.");
        }
        throw new IllegalArgumentException("Missing start and description fields");
    }

    public final void a(String str) {
        new File(Environment.getExternalStorageDirectory(), "Pictures").mkdirs();
        com.fyber.inneractive.sdk.flow.o oVar = this.v;
        i0 i0Var = new i0(new c(), str, oVar != null ? oVar.c : null);
        IAConfigManager.M.s.a.offer(i0Var);
        i0Var.a(n0.QUEUED);
    }

    public void a(com.fyber.inneractive.sdk.mraid.g gVar, String str) {
        String e2 = gVar.e();
        com.fyber.inneractive.sdk.web.g gVar2 = this.b;
        if (gVar2 != null) {
            gVar2.a("window.mraidbridge.fireErrorEvent('" + e2 + "', '" + str + "');");
        }
    }

    public final Map<String, String> a(URI uri) throws UnsupportedEncodingException {
        String[] split;
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            for (String str : rawQuery.split("&")) {
                int indexOf = str.indexOf("=");
                linkedHashMap.put(indexOf > 0 ? URLDecoder.decode(str.substring(0, indexOf), "UTF-8") : str, (indexOf <= 0 || str.length() <= (i = indexOf + 1)) ? null : URLDecoder.decode(str.substring(i), "UTF-8"));
            }
        }
        return linkedHashMap;
    }

    public void a(View view, c.EnumC0022c enumC0022c) {
        a.InterfaceC0020a interfaceC0020a;
        if (view == null || (interfaceC0020a = this.L) == null) {
            return;
        }
        com.fyber.inneractive.sdk.measurement.tracker.c cVar = (com.fyber.inneractive.sdk.measurement.tracker.c) interfaceC0020a;
        cVar.getClass();
        try {
            AdSession adSession = cVar.a;
            if (adSession != null) {
                if (enumC0022c == c.EnumC0022c.CloseButton) {
                    adSession.addFriendlyObstruction(view, FriendlyObstructionPurpose.CLOSE_AD, null);
                } else {
                    adSession.addFriendlyObstruction(view, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        } catch (Throwable th) {
            cVar.a(th);
        }
    }

    public void a(View view) {
        a.InterfaceC0020a interfaceC0020a = this.L;
        if (interfaceC0020a != null) {
            com.fyber.inneractive.sdk.measurement.tracker.c cVar = (com.fyber.inneractive.sdk.measurement.tracker.c) interfaceC0020a;
            cVar.getClass();
            try {
                AdSession adSession = cVar.a;
                if (adSession == null || view == null) {
                    return;
                }
                adSession.removeFriendlyObstruction(view);
            } catch (Throwable th) {
                cVar.a(th);
            }
        }
    }

    public final void a(com.fyber.inneractive.sdk.mraid.g gVar) {
        com.fyber.inneractive.sdk.config.global.s sVar;
        com.fyber.inneractive.sdk.network.p pVar = com.fyber.inneractive.sdk.network.p.BANNER_RESIZE_EXPAND;
        InneractiveAdRequest inneractiveAdRequest = this.u;
        com.fyber.inneractive.sdk.flow.o oVar = this.v;
        com.fyber.inneractive.sdk.response.e d2 = oVar != null ? oVar.d() : null;
        com.fyber.inneractive.sdk.flow.o oVar2 = this.v;
        new q.a(pVar, inneractiveAdRequest, d2, (oVar2 == null || (sVar = oVar2.c) == null) ? null : sVar.c()).a("action", gVar.e()).a((String) null);
    }
}
