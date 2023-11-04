package com.fyber.inneractive.sdk.bidder;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.cache.session.h;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.f0;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class a implements d, f0.a {
    public static final a i = new a();
    public final TokenParametersOuterClass$TokenParameters.b a;
    public final com.fyber.inneractive.sdk.serverapi.b b;
    public final c c;
    public e d;
    public final Map<String, String> e = new C0006a(this);
    public final AtomicReference<String> f = new AtomicReference<>(null);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final Object h = new Object();

    /* renamed from: com.fyber.inneractive.sdk.bidder.a$a */
    /* loaded from: classes.dex */
    public class C0006a extends HashMap<String, String> {
        public C0006a(a aVar) {
            put(InneractiveMediationNameConsts.MAX, "token_size_limit_max");
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            a.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a();
        }
    }

    public a() {
        com.fyber.inneractive.sdk.serverapi.b bVar = new com.fyber.inneractive.sdk.serverapi.b(s.b());
        this.b = bVar;
        c cVar = new c(bVar);
        this.c = cVar;
        this.a = TokenParametersOuterClass$TokenParameters.newBuilder();
        IAConfigManager.f().a(this);
        c();
        if (IAConfigManager.c().a().a("bidding_token_wait_for_ua", true)) {
            IAConfigManager.g().d();
            cVar.a(IAConfigManager.g().a());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x04b9, code lost:
        if (r8.equals("3") == false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 1540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.bidder.a.a():void");
    }

    public void b() {
        m.a(new b());
    }

    public final void c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) l.a.getSystemService("connectivity");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24 && !InneractiveAdManager.isCurrentUserAChild()) {
            connectivityManager.registerDefaultNetworkCallback(new com.fyber.inneractive.sdk.bidder.b(this));
        }
        e eVar = new e(this);
        this.d = eVar;
        l.a.registerReceiver(eVar, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        l.a.registerReceiver(eVar, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (i2 >= 23) {
            l.a.registerReceiver(eVar, new IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED"));
        }
        if (i2 >= 21) {
            l.a.registerReceiver(eVar, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
        }
        if (i2 >= 17) {
            l.a.registerReceiver(eVar, new IntentFilter("android.intent.action.AIRPLANE_MODE"));
        }
        if (l.b("android.permission.BLUETOOTH")) {
            l.a.registerReceiver(eVar, new IntentFilter("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"));
            l.a.registerReceiver(eVar, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
    }

    public final void a(String str, UnitDisplayType unitDisplayType, TokenParametersOuterClass$TokenParameters.k kVar) {
        ArrayList arrayList;
        TokenParametersOuterClass$TokenParameters.j jVar;
        com.fyber.inneractive.sdk.cache.session.d dVar = IAConfigManager.M.x.a;
        if (dVar != null) {
            h hVar = dVar.b.get(com.fyber.inneractive.sdk.cache.session.enums.b.a(unitDisplayType.value(), str));
            TokenParametersOuterClass$TokenParameters.UserSession userSession = null;
            if (hVar != null) {
                ArrayList arrayList2 = new ArrayList(hVar);
                Collections.sort(arrayList2, new com.fyber.inneractive.sdk.cache.session.g(hVar));
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = null;
            }
            int a = dVar.a();
            if (a > 0 && arrayList != null && arrayList.size() >= a) {
                if (str.equals("video")) {
                    jVar = TokenParametersOuterClass$TokenParameters.j.VIDEO;
                } else if (!str.equals("display")) {
                    jVar = TokenParametersOuterClass$TokenParameters.j.UNITCONTENTTYPEUNKNOWN;
                } else {
                    jVar = TokenParametersOuterClass$TokenParameters.j.DISPLAY;
                }
                TokenParametersOuterClass$TokenParameters.UserSession.a newBuilder = TokenParametersOuterClass$TokenParameters.UserSession.newBuilder();
                newBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) newBuilder.b).setSubType(jVar);
                int i2 = 0;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.fyber.inneractive.sdk.cache.session.e eVar = (com.fyber.inneractive.sdk.cache.session.e) it.next();
                    TokenParametersOuterClass$TokenParameters.SessionData.a newBuilder2 = TokenParametersOuterClass$TokenParameters.SessionData.newBuilder();
                    int i3 = eVar.b;
                    newBuilder2.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) newBuilder2.b).setClicks(i3);
                    int i4 = eVar.a;
                    newBuilder2.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) newBuilder2.b).setImpressions(i4);
                    if (str.equals("video") || kVar.equals(TokenParametersOuterClass$TokenParameters.k.REWARDED)) {
                        int i5 = eVar.c;
                        newBuilder2.c();
                        ((TokenParametersOuterClass$TokenParameters.SessionData) newBuilder2.b).setCompletions(i5);
                    }
                    newBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.UserSession) newBuilder.b).addSessionDataItems(newBuilder2.a());
                    i2++;
                    if (i2 >= a) {
                        break;
                    }
                }
                newBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) newBuilder.b).setType(kVar);
                userSession = newBuilder.a();
            }
            if (userSession == null || userSession.getSessionDataItemsList().size() <= 0) {
                return;
            }
            TokenParametersOuterClass$TokenParameters.b bVar = this.a;
            bVar.c();
            ((TokenParametersOuterClass$TokenParameters) bVar.b).addUserSessions(userSession);
        }
    }
}
