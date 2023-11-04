package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.factories.b;
import com.fyber.inneractive.sdk.flow.vast.a;
import com.fyber.inneractive.sdk.network.j0;
import com.fyber.inneractive.sdk.network.n0;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.s0;
import com.fyber.inneractive.sdk.web.d;
import java.net.UnknownHostException;
import java.util.PriorityQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k {
    public final InneractiveAdRequest b;
    public final com.fyber.inneractive.sdk.response.g c;
    public com.fyber.inneractive.sdk.config.global.s d;
    public com.fyber.inneractive.sdk.model.vast.b e;
    public Context f;
    public boolean g;
    public j0 h;
    public final com.fyber.inneractive.sdk.flow.vast.b i;
    public int j;
    public final com.fyber.inneractive.sdk.flow.vast.c l;
    public final PriorityQueue<com.fyber.inneractive.sdk.flow.vast.a> k = new PriorityQueue<>(10, new a.b());
    public com.fyber.inneractive.sdk.player.controller.c m = null;
    public final d.e n = new a();
    public final com.fyber.inneractive.sdk.network.u<String> o = new b();
    public final int a = IAConfigManager.c().a().a("companion_retry_count", 2, 0);

    /* loaded from: classes.dex */
    public class b implements com.fyber.inneractive.sdk.network.u<String> {
        public b() {
            k.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.network.u
        public void a(String str, Exception exc, boolean z) {
            String str2 = str;
            if (str2 != null) {
                k kVar = k.this;
                if (kVar.e != null) {
                    com.fyber.inneractive.sdk.flow.vast.c cVar = kVar.l;
                    if (!cVar.i) {
                        IAlog.a("FmpEndcardLoadingStarted", new Object[0]);
                        cVar.i = true;
                        k kVar2 = k.this;
                        kVar2.l.g.a(str2, kVar2.n);
                        return;
                    }
                }
            }
            if (exc == null || (exc instanceof com.fyber.inneractive.sdk.network.f) || z) {
                return;
            }
            k.a(k.this, exc);
        }
    }

    /* loaded from: classes.dex */
    public class d implements com.fyber.inneractive.sdk.network.u<j0.a> {
        public final /* synthetic */ com.fyber.inneractive.sdk.model.vast.c a;

        public d(com.fyber.inneractive.sdk.model.vast.c cVar) {
            k.this = r1;
            this.a = cVar;
        }

        @Override // com.fyber.inneractive.sdk.network.u
        public void a(j0.a aVar, Exception exc, boolean z) {
            View view;
            j0.a aVar2 = aVar;
            k.this.getClass();
            com.fyber.inneractive.sdk.flow.vast.a aVar3 = new com.fyber.inneractive.sdk.flow.vast.a();
            ImageView imageView = new ImageView(IAConfigManager.M.v.a());
            aVar3.b = imageView;
            imageView.setId(R.id.inneractive_vast_endcard_static);
            aVar3.b.setContentDescription("inneractive_vast_endcard_static");
            if (k.a(k.this, aVar2, exc) && (view = aVar3.b) != null) {
                ((ImageView) view).setImageBitmap(aVar2.a);
                aVar3.a = true;
                k.this.k.add(aVar3);
                return;
            }
            IAlog.a("%s Fetching companion image failed!", IAlog.a(k.this));
            com.fyber.inneractive.sdk.model.vast.c cVar = this.a;
            boolean a = s0.a(cVar.f, cVar.b);
            if (k.b(k.this, aVar2, exc) && a) {
                k kVar = k.this;
                if (kVar.j <= kVar.a) {
                    IAlog.a("%sloadStaticCompanion retry", IAlog.a(this));
                    k.this.b(this.a);
                    return;
                }
            }
            String str = null;
            if (!a) {
                k kVar2 = k.this;
                kVar2.getClass();
                new q.a(com.fyber.inneractive.sdk.network.o.VAST_COMPANION_INCOMPATIBLE_MIMETYPE, kVar2.b, kVar2.c, (JSONArray) null).a((String) null);
            }
            if (aVar2 != null && !TextUtils.isEmpty(aVar2.b)) {
                str = aVar2.b;
            }
            k.a(k.this, this.a.a(), str);
            k.this.a();
        }
    }

    public k(Context context, com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.config.global.s sVar, com.fyber.inneractive.sdk.flow.vast.b bVar) {
        this.e = gVar.e();
        this.f = context;
        this.c = gVar;
        this.b = inneractiveAdRequest;
        this.d = sVar;
        this.i = bVar;
        com.fyber.inneractive.sdk.web.b bVar2 = new com.fyber.inneractive.sdk.web.b(inneractiveAdRequest, gVar, this.d, this.e);
        com.fyber.inneractive.sdk.flow.vast.c cVar = new com.fyber.inneractive.sdk.flow.vast.c(new com.fyber.inneractive.sdk.player.controller.c(this.f, bVar, com.fyber.inneractive.sdk.model.vast.g.FMP_End_Card, bVar2));
        this.l = cVar;
        bVar2.a(cVar);
    }

    public static boolean a(k kVar, j0.a aVar, Exception exc) {
        kVar.getClass();
        return exc == null && aVar != null && aVar.b == null && aVar.a != null;
    }

    public static boolean b(k kVar, j0.a aVar, Exception exc) {
        kVar.getClass();
        return aVar == null || (aVar.b != null && ((exc instanceof com.fyber.inneractive.sdk.network.b) || (exc instanceof UnknownHostException)));
    }

    public void c() {
        com.fyber.inneractive.sdk.config.global.s sVar = this.d;
        if ((sVar == null || !((com.fyber.inneractive.sdk.config.global.features.g) sVar.a(com.fyber.inneractive.sdk.config.global.features.g.class)).a("enabled_fmp_endcard", false) || this.e.f == null) ? false : true) {
            IAlog.a("sending fmpHtmlRequest", new Object[0]);
            int i = IAlog.a;
            IAlog.a(1, null, "%s: %s", "COMPANION_TYPE", com.fyber.inneractive.sdk.model.vast.g.FMP_End_Card.name());
            com.fyber.inneractive.sdk.config.global.s sVar2 = this.d;
            String a2 = sVar2 != null ? ((com.fyber.inneractive.sdk.config.global.features.g) sVar2.a(com.fyber.inneractive.sdk.config.global.features.g.class)).a("endcard_url", "") : null;
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            com.fyber.inneractive.sdk.network.e0 e0Var = new com.fyber.inneractive.sdk.network.e0(this.o, this.f, new com.fyber.inneractive.sdk.cache.b(a2));
            IAConfigManager.M.s.a.offer(e0Var);
            e0Var.a(n0.QUEUED);
        }
    }

    public static void a(k kVar, JSONObject jSONObject, String str) {
        kVar.getClass();
        q.a aVar = new q.a(com.fyber.inneractive.sdk.network.o.VAST_COMPANION_FAILED_LOADING, kVar.b, kVar.c, kVar.d.c());
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("companion_data", jSONObject);
        } catch (Exception unused) {
            IAlog.e("Got exception adding param to json object: %s, %s", "companion_data", jSONObject);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject2.put("reason", str);
            } catch (Exception unused2) {
                IAlog.e("Got exception adding param to json object: %s, %s", "reason", str);
            }
        }
        aVar.f.put(jSONObject2);
        aVar.a((String) null);
    }

    public final void b() {
        com.fyber.inneractive.sdk.network.p pVar = com.fyber.inneractive.sdk.network.p.VAST_COMPANION_LOAD_ATTEMPT;
        InneractiveAdRequest inneractiveAdRequest = this.b;
        com.fyber.inneractive.sdk.response.g gVar = this.c;
        com.fyber.inneractive.sdk.config.global.s sVar = this.d;
        new q.a(pVar, inneractiveAdRequest, gVar, sVar == null ? null : sVar.c()).a((String) null);
    }

    /* loaded from: classes.dex */
    public class c implements d.e {
        public final /* synthetic */ com.fyber.inneractive.sdk.flow.vast.e a;
        public final /* synthetic */ com.fyber.inneractive.sdk.model.vast.c b;

        public c(com.fyber.inneractive.sdk.flow.vast.e eVar, com.fyber.inneractive.sdk.model.vast.c cVar) {
            k.this = r1;
            this.a = eVar;
            this.b = cVar;
        }

        @Override // com.fyber.inneractive.sdk.web.d.e
        public void a(com.fyber.inneractive.sdk.web.d dVar) {
            com.fyber.inneractive.sdk.flow.vast.e eVar = this.a;
            eVar.a = true;
            k.this.k.add(eVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
        @Override // com.fyber.inneractive.sdk.web.d.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.fyber.inneractive.sdk.web.d r5, com.fyber.inneractive.sdk.external.InneractiveInfrastructureError r6) {
            /*
                r4 = this;
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                com.fyber.inneractive.sdk.flow.k r6 = com.fyber.inneractive.sdk.flow.k.this
                java.lang.String r6 = com.fyber.inneractive.sdk.util.IAlog.a(r6)
                r5.append(r6)
                java.lang.String r6 = " Fetching companion html failed!"
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r6 = 0
                java.lang.Object[] r0 = new java.lang.Object[r6]
                com.fyber.inneractive.sdk.util.IAlog.a(r5, r0)
                com.fyber.inneractive.sdk.model.vast.h r5 = com.fyber.inneractive.sdk.model.vast.h.Gif
                com.fyber.inneractive.sdk.model.vast.c r0 = r4.b
                com.fyber.inneractive.sdk.model.vast.h r0 = r0.b
                boolean r5 = r5.equals(r0)
                r0 = 1
                if (r5 == 0) goto L39
                com.fyber.inneractive.sdk.model.vast.c r5 = r4.b
                java.lang.String r1 = r5.f
                com.fyber.inneractive.sdk.model.vast.h r5 = r5.b
                boolean r5 = com.fyber.inneractive.sdk.util.s0.a(r1, r5)
                if (r5 == 0) goto L37
                goto L39
            L37:
                r5 = 0
                goto L3a
            L39:
                r5 = 1
            L3a:
                com.fyber.inneractive.sdk.flow.vast.e r1 = r4.a
                r1.a = r6
                com.fyber.inneractive.sdk.flow.k r1 = com.fyber.inneractive.sdk.flow.k.this
                int r2 = r1.j
                int r3 = r1.a
                if (r2 > r3) goto L5d
                if (r5 == 0) goto L5d
                java.lang.Object[] r5 = new java.lang.Object[r0]
                java.lang.String r0 = com.fyber.inneractive.sdk.util.IAlog.a(r4)
                r5[r6] = r0
                java.lang.String r6 = "%sloadHtmlCompanion retry"
                com.fyber.inneractive.sdk.util.IAlog.a(r6, r5)
                com.fyber.inneractive.sdk.flow.k r5 = com.fyber.inneractive.sdk.flow.k.this
                com.fyber.inneractive.sdk.model.vast.c r6 = r4.b
                r5.a(r6)
                goto L82
            L5d:
                r0 = 0
                if (r5 != 0) goto L6e
                com.fyber.inneractive.sdk.network.q$a r5 = new com.fyber.inneractive.sdk.network.q$a
                com.fyber.inneractive.sdk.network.o r2 = com.fyber.inneractive.sdk.network.o.VAST_COMPANION_INCOMPATIBLE_MIMETYPE
                com.fyber.inneractive.sdk.external.InneractiveAdRequest r3 = r1.b
                com.fyber.inneractive.sdk.response.g r1 = r1.c
                r5.<init>(r2, r3, r1, r0)
                r5.a(r0)
            L6e:
                com.fyber.inneractive.sdk.flow.k r5 = com.fyber.inneractive.sdk.flow.k.this
                com.fyber.inneractive.sdk.model.vast.c r1 = r4.b
                org.json.JSONObject r1 = r1.a()
                com.fyber.inneractive.sdk.flow.k.a(r5, r1, r0)
                com.fyber.inneractive.sdk.flow.vast.e r5 = r4.a
                r5.a = r6
                com.fyber.inneractive.sdk.flow.k r5 = com.fyber.inneractive.sdk.flow.k.this
                r5.a()
            L82:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.k.c.a(com.fyber.inneractive.sdk.web.d, com.fyber.inneractive.sdk.external.InneractiveInfrastructureError):void");
        }
    }

    /* loaded from: classes.dex */
    public class a implements d.e {
        public a() {
            k.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.web.d.e
        public void a(com.fyber.inneractive.sdk.web.d dVar) {
            IAlog.a("%s Fetching companion fmp successfully ", IAlog.a(k.this));
            k.this.l.a = true;
        }

        @Override // com.fyber.inneractive.sdk.web.d.e
        public void a(com.fyber.inneractive.sdk.web.d dVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
            IAlog.a("%s Fetching companion fmp failed! will load default companion", IAlog.a(k.this));
            k kVar = k.this;
            kVar.l.a = false;
            k.a(kVar, inneractiveInfrastructureError.getCause());
        }
    }

    public final void b(com.fyber.inneractive.sdk.model.vast.c cVar) {
        b();
        int i = IAlog.a;
        IAlog.a(1, null, "%s: %s", "COMPANION_TYPE", cVar.a.name());
        this.j++;
        j0 j0Var = new j0(new d(cVar), cVar.f, this.d);
        this.h = j0Var;
        IAConfigManager.M.s.a.offer(j0Var);
        j0Var.a(n0.QUEUED);
    }

    public void a() {
        boolean z;
        if (this.k.size() == 1) {
            return;
        }
        IAlog.a("%sloadNextVastCompanion called", IAlog.a(this));
        this.g = false;
        if (this.e == null) {
            IAlog.a("%svast data is null! Object must have already been destroyed", IAlog.a(this));
            z = false;
        } else {
            z = true;
        }
        if (this.e.g.size() == 0) {
            IAlog.b("%sgetNextIAvastCompanion - No companion ads found", IAlog.a(this));
            z = false;
        }
        if (!z) {
            IAlog.a("%sno more companion ads available.", IAlog.a(this));
            return;
        }
        com.fyber.inneractive.sdk.model.vast.b bVar = this.e;
        com.fyber.inneractive.sdk.model.vast.c poll = bVar.g.poll();
        bVar.h = poll;
        IAlog.a("%sgetNextIAvastCompanion returning: %s", IAlog.a(this), poll);
        this.j = 0;
        if (poll != null) {
            if (poll.a == com.fyber.inneractive.sdk.model.vast.g.Static && !com.fyber.inneractive.sdk.model.vast.h.Gif.equals(poll.b)) {
                b(poll);
            } else {
                a(poll);
            }
        }
    }

    public static void a(k kVar, Throwable th) {
        com.fyber.inneractive.sdk.config.global.s sVar = kVar.d;
        JSONArray c2 = sVar == null ? null : sVar.c();
        com.fyber.inneractive.sdk.flow.vast.c cVar = kVar.l;
        InneractiveAdRequest inneractiveAdRequest = kVar.b;
        com.fyber.inneractive.sdk.response.g gVar = kVar.c;
        cVar.getClass();
        IAlog.a("sending FMP_COMPANION_FAILED_LOADING event", new Object[0]);
        q.a aVar = new q.a(com.fyber.inneractive.sdk.network.o.FMP_COMPANION_FAILED_LOADING, inneractiveAdRequest, gVar, c2);
        String message = th != null ? th.getMessage() : null;
        if (!TextUtils.isEmpty(message)) {
            aVar.a("error", message);
        }
        cVar.a(aVar);
        aVar.a((String) null);
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.c cVar) {
        boolean containsKey;
        com.fyber.inneractive.sdk.web.g gVar;
        int i = com.fyber.inneractive.sdk.util.r.a[com.fyber.inneractive.sdk.util.t.Mraid.ordinal()];
        if (i != 1) {
            containsKey = i != 2 ? false : b.a.a.a.containsKey(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST);
        } else {
            containsKey = b.a.a.a.containsKey(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_HTML);
        }
        if (containsKey) {
            b();
            this.j++;
            int i2 = IAlog.a;
            IAlog.a(1, null, "%s: %s", "COMPANION_TYPE", cVar.a.name());
            com.fyber.inneractive.sdk.player.controller.c cVar2 = new com.fyber.inneractive.sdk.player.controller.c(this.f, this.i, cVar.a, null);
            com.fyber.inneractive.sdk.flow.vast.e eVar = new com.fyber.inneractive.sdk.flow.vast.e(cVar2);
            c cVar3 = new c(eVar, cVar);
            String str = cVar.f;
            com.fyber.inneractive.sdk.model.vast.g gVar2 = cVar.a;
            if (gVar2 == com.fyber.inneractive.sdk.model.vast.g.Iframe) {
                String c2 = com.fyber.inneractive.sdk.util.l.c("fyb_iframe_endcard_tmpl.html");
                if (!TextUtils.isEmpty(c2)) {
                    str = c2.replace("$__IMGSRC__$", cVar.f).replace("$__SrcIframeUrl__$", cVar.f);
                }
            } else if (gVar2 == com.fyber.inneractive.sdk.model.vast.g.Static && cVar.b == com.fyber.inneractive.sdk.model.vast.h.Gif) {
                com.fyber.inneractive.sdk.web.c0 c0Var = eVar.g.a;
                if (c0Var != null && (gVar = c0Var.b) != null) {
                    WebSettings settings = gVar.getSettings();
                    if (Build.VERSION.SDK_INT >= 17) {
                        settings.setMediaPlaybackRequiresUserGesture(false);
                    }
                    settings.setLoadWithOverviewMode(true);
                    settings.setUseWideViewPort(true);
                }
                com.fyber.inneractive.sdk.web.c0 c0Var2 = eVar.g.a;
                if (c0Var2 != null) {
                    c0Var2.H = false;
                }
                String c3 = com.fyber.inneractive.sdk.util.l.c("fyb_static_endcard_tmpl.html");
                if (!TextUtils.isEmpty(c3)) {
                    str = c3.replace("$__IMGSRC__$", cVar.f);
                }
                String str2 = cVar.g;
                if (str2 != null) {
                    str = str.replace("$__IMGHREF__$", str2.replace("\"", "\\\""));
                }
            }
            cVar2.a(str, cVar3);
        }
    }
}
