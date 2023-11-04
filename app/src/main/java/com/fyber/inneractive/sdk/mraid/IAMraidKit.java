package com.fyber.inneractive.sdk.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.a;
import com.fyber.inneractive.sdk.factories.b;
import com.fyber.inneractive.sdk.factories.c;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class IAMraidKit extends BroadcastReceiver {
    private static final com.fyber.inneractive.sdk.util.s sProvider = new a();

    /* loaded from: classes.dex */
    public class a implements com.fyber.inneractive.sdk.util.s {
        @Override // com.fyber.inneractive.sdk.util.s
        public com.fyber.inneractive.sdk.util.t a() {
            return com.fyber.inneractive.sdk.util.t.Mraid;
        }

        @Override // com.fyber.inneractive.sdk.util.s
        public boolean a(String str) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements b.InterfaceC0016b {
        public b(IAMraidKit iAMraidKit) {
        }

        @Override // com.fyber.inneractive.sdk.factories.b.InterfaceC0016b
        public com.fyber.inneractive.sdk.interfaces.a a() {
            return new com.fyber.inneractive.sdk.flow.l();
        }

        @Override // com.fyber.inneractive.sdk.factories.b.InterfaceC0016b
        public com.fyber.inneractive.sdk.response.b b() {
            return new com.fyber.inneractive.sdk.response.c();
        }
    }

    /* loaded from: classes.dex */
    public class c implements c.a {
        public c() {
            IAMraidKit.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.factories.c.a
        public boolean a(InneractiveAdSpot inneractiveAdSpot) {
            return IAMraidKit.this.isMRaidSpotContent(inneractiveAdSpot);
        }

        @Override // com.fyber.inneractive.sdk.factories.c.a
        public com.fyber.inneractive.sdk.interfaces.c b(InneractiveAdSpot inneractiveAdSpot) {
            return new com.fyber.inneractive.sdk.renderers.k();
        }
    }

    /* loaded from: classes.dex */
    public class d implements a.InterfaceC0015a {
        public d() {
            IAMraidKit.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.factories.a.InterfaceC0015a
        public boolean a(InneractiveAdSpot inneractiveAdSpot) {
            return IAMraidKit.this.isMRaidSpotContent(inneractiveAdSpot);
        }

        @Override // com.fyber.inneractive.sdk.factories.a.InterfaceC0015a
        public com.fyber.inneractive.sdk.interfaces.b b(InneractiveAdSpot inneractiveAdSpot) {
            return new com.fyber.inneractive.sdk.renderers.g();
        }
    }

    public boolean isMRaidSpotContent(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof com.fyber.inneractive.sdk.flow.z);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IAlog.a("IAMraidKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        com.fyber.inneractive.sdk.util.s sVar = sProvider;
        IAConfigManager.M.I.put(sVar.a(), sVar);
        b bVar = new b(this);
        b.a.a.a(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_HTML, bVar);
        b.a.a.a(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID, bVar);
        c.b.a.a.add(new c());
        a.b.a.a.add(new d());
    }
}
