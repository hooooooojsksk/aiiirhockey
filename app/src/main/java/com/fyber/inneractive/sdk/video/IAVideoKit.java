package com.fyber.inneractive.sdk.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.a;
import com.fyber.inneractive.sdk.factories.b;
import com.fyber.inneractive.sdk.factories.c;
import com.fyber.inneractive.sdk.flow.d0;
import com.fyber.inneractive.sdk.flow.m;
import com.fyber.inneractive.sdk.player.cache.n;
import com.fyber.inneractive.sdk.renderers.h;
import com.fyber.inneractive.sdk.renderers.j;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.s;
import com.fyber.inneractive.sdk.util.t;

/* loaded from: classes.dex */
public class IAVideoKit extends BroadcastReceiver {
    private static final s sProvider = new a();

    /* loaded from: classes.dex */
    public class b implements b.InterfaceC0016b {
        public b(IAVideoKit iAVideoKit) {
        }

        @Override // com.fyber.inneractive.sdk.factories.b.InterfaceC0016b
        public com.fyber.inneractive.sdk.interfaces.a a() {
            return new m("Interstitial");
        }

        @Override // com.fyber.inneractive.sdk.factories.b.InterfaceC0016b
        public com.fyber.inneractive.sdk.response.b b() {
            return new com.fyber.inneractive.sdk.response.d();
        }
    }

    /* loaded from: classes.dex */
    public class c implements c.a {
        public c(IAVideoKit iAVideoKit) {
        }

        @Override // com.fyber.inneractive.sdk.factories.c.a
        public boolean a(InneractiveAdSpot inneractiveAdSpot) {
            return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof d0);
        }

        @Override // com.fyber.inneractive.sdk.factories.c.a
        public com.fyber.inneractive.sdk.interfaces.c b(InneractiveAdSpot inneractiveAdSpot) {
            InneractiveAdRequest inneractiveAdRequest = inneractiveAdSpot.getAdContent().a;
            boolean z = inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen();
            if (inneractiveAdSpot.getAdContent().e() && z) {
                return new com.fyber.inneractive.sdk.renderers.m();
            }
            return new j();
        }
    }

    /* loaded from: classes.dex */
    public class d implements a.InterfaceC0015a {
        public d(IAVideoKit iAVideoKit) {
        }

        @Override // com.fyber.inneractive.sdk.factories.a.InterfaceC0015a
        public boolean a(InneractiveAdSpot inneractiveAdSpot) {
            return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof d0);
        }

        @Override // com.fyber.inneractive.sdk.factories.a.InterfaceC0015a
        public com.fyber.inneractive.sdk.interfaces.b b(InneractiveAdSpot inneractiveAdSpot) {
            return new h();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        s sVar = sProvider;
        IAConfigManager.M.I.put(sVar.a(), sVar);
        n nVar = n.f;
        Context applicationContext = context.getApplicationContext();
        nVar.getClass();
        if (applicationContext == null) {
            IAlog.e("context is null, would not start the video cache.", new Object[0]);
        } else if (!nVar.a()) {
            nVar.a = applicationContext;
            new Thread(nVar.e, "VideoCache").start();
        }
        IAlog.a("IAVideoKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        b.a.a.a(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST, new b(this));
        c.b.a.a.add(new c(this));
        a.b.a.a.add(new d(this));
    }

    /* loaded from: classes.dex */
    public class a implements s {
        @Override // com.fyber.inneractive.sdk.util.s
        public boolean a(String str) {
            if (TextUtils.equals(str, "vid_cache")) {
                return n.f.a();
            }
            return false;
        }

        @Override // com.fyber.inneractive.sdk.util.s
        public t a() {
            return t.Video;
        }
    }
}
