package com.fyber.inneractive.sdk.player;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.b0;
import com.fyber.inneractive.sdk.config.c0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.r;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.d0;
import com.fyber.inneractive.sdk.flow.k;
import com.fyber.inneractive.sdk.flow.m;
import com.fyber.inneractive.sdk.model.vast.n;
import com.fyber.inneractive.sdk.model.vast.s;
import com.fyber.inneractive.sdk.network.g0;
import com.fyber.inneractive.sdk.network.p;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.player.a;
import com.fyber.inneractive.sdk.player.b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.h;
import com.fyber.inneractive.sdk.response.i;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.j;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.common.internal.ImagesContract;
import com.iab.omid.library.fyber.adsession.media.Position;
import com.iab.omid.library.fyber.adsession.media.VastProperties;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends com.fyber.inneractive.sdk.player.b implements a.InterfaceC0024a {
    public static final HashMap<String, c> D = new a();
    public b0 A;
    public k B;
    public boolean C;
    public final com.fyber.inneractive.sdk.model.vast.b x;
    public com.fyber.inneractive.sdk.player.enums.a y;
    public boolean z;

    /* loaded from: classes.dex */
    public class a extends HashMap<String, c> {

        /* renamed from: com.fyber.inneractive.sdk.player.e$a$a */
        /* loaded from: classes.dex */
        public class C0029a implements c {
            public C0029a(a aVar) {
            }

            @Override // com.fyber.inneractive.sdk.player.e.c
            public String a(com.fyber.inneractive.sdk.player.controller.g gVar, VideoClickOrigin videoClickOrigin) {
                return videoClickOrigin.name().toLowerCase();
            }
        }

        /* loaded from: classes.dex */
        public class b implements c {
            public b(a aVar) {
            }

            @Override // com.fyber.inneractive.sdk.player.e.c
            public String a(com.fyber.inneractive.sdk.player.controller.g gVar, VideoClickOrigin videoClickOrigin) {
                int c;
                if (gVar == null || (c = gVar.c()) <= 0) {
                    return "00:00:00.000";
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j = c;
                long hours = timeUnit.toHours(j);
                TimeUnit timeUnit2 = TimeUnit.HOURS;
                long minutes = timeUnit.toMinutes(j - timeUnit2.toMillis(hours));
                TimeUnit timeUnit3 = TimeUnit.MINUTES;
                long seconds = timeUnit.toSeconds((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes));
                return String.format("%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(timeUnit.toMillis(((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds))));
            }
        }

        public a() {
            put("[CLICKAREA]", new C0029a(this));
            put("[ADPLAYHEAD]", new b(this));
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[com.fyber.inneractive.sdk.player.enums.a.values().length];
            c = iArr;
            try {
                iArr[com.fyber.inneractive.sdk.player.enums.a.Uninitialized.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[com.fyber.inneractive.sdk.player.enums.a.Started.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[com.fyber.inneractive.sdk.player.enums.a.FirstQuarter.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[com.fyber.inneractive.sdk.player.enums.a.MidPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[com.fyber.inneractive.sdk.player.enums.a.ThirdPQuarter.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[com.fyber.inneractive.sdk.player.enums.a.Completed.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[com.fyber.inneractive.sdk.player.enums.b.values().length];
            b = iArr2;
            try {
                iArr2[com.fyber.inneractive.sdk.player.enums.b.Prepared.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[com.fyber.inneractive.sdk.player.enums.b.Playing.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[com.fyber.inneractive.sdk.player.enums.b.Completed.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[com.fyber.inneractive.sdk.model.vast.g.values().length];
            a = iArr3;
            try {
                iArr3[com.fyber.inneractive.sdk.model.vast.g.Default_End_Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[com.fyber.inneractive.sdk.model.vast.g.FMP_End_Card.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        String a(com.fyber.inneractive.sdk.player.controller.g gVar, VideoClickOrigin videoClickOrigin);
    }

    public e(Context context, com.fyber.inneractive.sdk.response.g gVar, b0 b0Var, InneractiveAdRequest inneractiveAdRequest, d0 d0Var, com.fyber.inneractive.sdk.measurement.a aVar) {
        super(context, b0Var == null ? null : ((a0) b0Var).b().c(), d0Var != null ? d0Var.b() : null);
        this.y = com.fyber.inneractive.sdk.player.enums.a.Uninitialized;
        this.C = false;
        if (gVar != null && gVar.e() != null) {
            this.h = aVar;
            this.f = d0Var;
            this.x = gVar.e();
            this.g = inneractiveAdRequest;
            k kVar = new k(context, gVar, inneractiveAdRequest, this.f.b(), a(gVar, b0Var));
            this.B = kVar;
            kVar.c();
            if (IAlog.a <= 3) {
                IAlog.d("IAVastMediaPlayerFlowManager:ctor - got media files: ", new Object[0]);
                for (int i = 0; i < this.x.a(); i++) {
                    n nVar = (n) ((ArrayList) this.x.b()).get(i);
                    if (nVar != null) {
                        IAlog.a("IAVastMediaPlayerFlowManager(%d): %s", Integer.valueOf(i), nVar.a());
                    }
                }
            }
            if (b0Var != null) {
                a(b0Var);
                a0 a0Var = (a0) b0Var;
                if (a0Var.a() != null) {
                    a(((c0) a0Var.a()).b().booleanValue());
                }
            }
            if (d0Var != null && d0Var.b() != null) {
                this.u = ((r) d0Var.b().a(r.class)).a(gVar.a());
                return;
            } else {
                this.u = IAConfigManager.c().a().a(gVar.a() == UnitDisplayType.INTERSTITIAL ? "prebuffer_interstitial" : "prebuffer_rewarded", 10, 0);
                return;
            }
        }
        throw new IllegalArgumentException("IAVastMediaPlayerFlowManager ctor - vastData can't be null");
    }

    public final com.fyber.inneractive.sdk.flow.vast.b a(com.fyber.inneractive.sdk.response.g gVar, b0 b0Var) {
        UnitDisplayType unitDisplayType = gVar.n;
        InneractiveAdRequest inneractiveAdRequest = this.g;
        return new com.fyber.inneractive.sdk.flow.vast.b(unitDisplayType, inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen(), gVar.e, gVar.f, b0Var);
    }

    @Override // com.fyber.inneractive.sdk.player.b
    public View c() {
        PriorityQueue<com.fyber.inneractive.sdk.flow.vast.a> priorityQueue;
        com.fyber.inneractive.sdk.flow.vast.a peek;
        k kVar = this.B;
        if (kVar == null || (priorityQueue = kVar.k) == null || priorityQueue.size() <= 0 || (peek = this.B.k.peek()) == null || !peek.a) {
            return null;
        }
        if (peek instanceof com.fyber.inneractive.sdk.flow.vast.e) {
            this.B.m = ((com.fyber.inneractive.sdk.flow.vast.e) peek).g;
        }
        return peek.b;
    }

    @Override // com.fyber.inneractive.sdk.player.b
    public com.fyber.inneractive.sdk.model.vast.c d() {
        com.fyber.inneractive.sdk.model.vast.b bVar = this.x;
        if (bVar != null) {
            return bVar.h;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void g() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        boolean z;
        String str;
        int i;
        T t;
        T t2;
        b0 b0Var;
        VastProperties createVastPropertiesForNonSkippableMedia;
        int i2 = 0;
        IAlog.a("IAMediaPlayerFlowManager: onPlayerStateChanged with - %s", bVar);
        f fVar = this.j;
        if (fVar != null && bVar != com.fyber.inneractive.sdk.player.enums.b.Prepared) {
            fVar.a(bVar);
        } else if (bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared && fVar != null) {
            fVar.d = true;
        }
        int i3 = b.c.a[bVar.ordinal()];
        if (i3 == 1) {
            IAlog.a("IAMediaPlayerFlowManager: onPlayerPrepared called", new Object[0]);
            if (this.p) {
                IAlog.a("IMediaPlayerFlowManager: onPlayerPrepared is called, but object is already destroyed?? ignore", new Object[0]);
            } else {
                if (this.b.a() && this.b.e() != null) {
                    a(this.b.e());
                }
                this.o = true;
                a();
                if (this.i != null && this.f != null && (b0Var = this.A) != null) {
                    int intValue = ((a0) b0Var).f.h.value().intValue();
                    boolean a2 = com.fyber.inneractive.sdk.player.b.a(this.b.d(), this.A, ((com.fyber.inneractive.sdk.response.g) this.f.b).w);
                    boolean booleanValue = ((a0) this.A).f.a.booleanValue();
                    com.fyber.inneractive.sdk.measurement.d dVar = this.i;
                    if (!a2) {
                        intValue = 0;
                    }
                    if (dVar.b != null) {
                        try {
                            if (a2) {
                                createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForSkippableMedia(intValue, booleanValue, Position.STANDALONE);
                            } else {
                                createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(booleanValue, Position.STANDALONE);
                            }
                            dVar.b.loaded(createVastPropertiesForNonSkippableMedia);
                        } catch (Throwable th) {
                            dVar.a(th);
                        }
                    }
                }
                if (this.t != null) {
                    d0 d0Var = this.f;
                    if (d0Var == null || d0Var.b == 0 || this.g == null) {
                        z = false;
                    } else {
                        z = com.fyber.inneractive.sdk.player.b.a(this.b.d(), this.A, ((com.fyber.inneractive.sdk.response.g) this.f.b).w) && this.g.getAllowFullscreen();
                        ((com.fyber.inneractive.sdk.response.g) this.f.b).r.setVideo(new ImpressionData.Video(z, (int) TimeUnit.MILLISECONDS.toSeconds(this.b.d())));
                    }
                    try {
                        d0 d0Var2 = this.f;
                        com.fyber.inneractive.sdk.response.g gVar = d0Var2 != null ? (com.fyber.inneractive.sdk.response.g) d0Var2.b : null;
                        p pVar = p.EVENT_READY_ON_CLIENT;
                        InneractiveAdRequest inneractiveAdRequest = this.g;
                        d0 d0Var3 = this.f;
                        q.a aVar = new q.a(pVar, inneractiveAdRequest, gVar, d0Var3 == null ? null : d0Var3.c.c());
                        if (this.v != null && gVar != null) {
                            long currentTimeMillis = System.currentTimeMillis() - gVar.I;
                            IAlog.a("Video content loader: Vast load took: " + currentTimeMillis + " msec", new Object[0]);
                            d0 d0Var4 = this.f;
                            if (d0Var4 == null || (t2 = d0Var4.b) == 0 || ((com.fyber.inneractive.sdk.response.g) t2).J == null) {
                                str = "";
                                i = 0;
                            } else {
                                i2 = ((com.fyber.inneractive.sdk.response.g) t2).J.i;
                                i = ((com.fyber.inneractive.sdk.response.g) t2).J.j;
                                str = ((com.fyber.inneractive.sdk.response.g) t2).J.a;
                            }
                            String str2 = "0";
                            if (d0Var4 != null && (t = d0Var4.b) != 0 && !TextUtils.isEmpty(((com.fyber.inneractive.sdk.response.g) t).C)) {
                                str2 = ((com.fyber.inneractive.sdk.response.g) this.f.b).C;
                            }
                            q.b bVar2 = new q.b();
                            bVar2.a("duration", Integer.valueOf(this.b.d() / 1000)).a(ImagesContract.URL, this.v.g).a("bitrate", this.v.e).a("mime", TextUtils.isEmpty(this.v.d) ? "na" : this.v.d).a("delivery", this.v.a).a("load_time", Long.valueOf(System.currentTimeMillis() - gVar.I)).a("media_file_index", Integer.valueOf(this.s)).a("player", this.b.f()).a("is_video_skippable", Boolean.valueOf(z)).a("supported_media_files", Integer.valueOf(i2)).a("total_media_files", Integer.valueOf(i)).a("vast_version", str);
                            if (str2 != null && str2.equals("1")) {
                                bVar2.a("hide_endcard", str2);
                            }
                            aVar.f.put(bVar2.a);
                        }
                        aVar.a((String) null);
                    } catch (Exception unused) {
                    }
                    h hVar = (h) this.t;
                    if (!hVar.g) {
                        hVar.g = true;
                        h.b bVar3 = hVar.d;
                        if (bVar3 != null) {
                            ((m) bVar3).d();
                        }
                    }
                }
            }
            a();
        } else if (i3 != 2) {
            if (i3 == 3) {
                this.b.c();
                a();
            } else if (i3 == 4) {
                a();
            } else if (i3 == 5) {
                a();
            }
        } else if (this.e == null) {
            j.m();
            a(IAConfigManager.M.i.a * 1000);
        }
        int i4 = b.b[bVar.ordinal()];
        if (i4 != 2) {
            if (i4 != 3) {
                return;
            }
            a(com.fyber.inneractive.sdk.player.enums.a.Completed);
        } else if (this.y.equals(com.fyber.inneractive.sdk.player.enums.a.Completed)) {
            a(com.fyber.inneractive.sdk.player.enums.a.Restarted);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.e
    public void a(int i) {
        int d = this.b.d();
        int i2 = b.c[this.y.ordinal()];
        if (i2 == 1) {
            if (this.b.e != com.fyber.inneractive.sdk.player.enums.b.Buffering) {
                a(com.fyber.inneractive.sdk.player.enums.a.Started);
                com.fyber.inneractive.sdk.measurement.d dVar = this.i;
                if (dVar != null) {
                    if (dVar.b != null && !dVar.e) {
                        IAlog.a("%s impression", "OMVideo");
                        dVar.e = true;
                        try {
                            dVar.b.impressionOccurred();
                        } catch (Throwable th) {
                            dVar.a(th);
                        }
                    }
                    com.fyber.inneractive.sdk.measurement.d dVar2 = this.i;
                    long d2 = this.b.d();
                    float f = this.b.i() ? 0.0f : 1.0f;
                    if (dVar2.c == null || dVar2.d) {
                        return;
                    }
                    dVar2.d = true;
                    IAlog.a("%s start", "OMVideo");
                    try {
                        dVar2.c.start((float) d2, f);
                    } catch (Throwable th2) {
                        dVar2.a(th2);
                    }
                }
            }
        } else if (i2 == 2) {
            if (i > d / 4) {
                a(com.fyber.inneractive.sdk.player.enums.a.FirstQuarter);
                com.fyber.inneractive.sdk.measurement.d dVar3 = this.i;
                if (dVar3 == null || dVar3.c == null) {
                    return;
                }
                IAlog.a("%s firstQuartile", "OMVideo");
                try {
                    dVar3.c.firstQuartile();
                } catch (Throwable th3) {
                    dVar3.a(th3);
                }
            }
        } else if (i2 != 3) {
            if (i2 == 4 && i > (d / 4) * 3) {
                a(com.fyber.inneractive.sdk.player.enums.a.ThirdPQuarter);
                com.fyber.inneractive.sdk.measurement.d dVar4 = this.i;
                if (dVar4 == null || dVar4.c == null) {
                    return;
                }
                IAlog.a("%s thirdQuartile", "OMVideo");
                try {
                    dVar4.c.thirdQuartile();
                } catch (Throwable th4) {
                    dVar4.a(th4);
                }
            }
        } else if (i > d / 2) {
            a(com.fyber.inneractive.sdk.player.enums.a.MidPoint);
            com.fyber.inneractive.sdk.measurement.d dVar5 = this.i;
            if (dVar5 == null || dVar5.c == null) {
                return;
            }
            IAlog.a("%s midpoint", "OMVideo");
            try {
                dVar5.c.midpoint();
            } catch (Throwable th5) {
                dVar5.a(th5);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b
    public void a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject) {
        a(this.x, VideoClickOrigin.InvalidOrigin, s.EVENT_ERROR);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (this.v != null && inneractiveVideoError.getPlayerError() != InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES) {
                jSONObject.put(ImagesContract.URL, this.v.g);
                jSONObject.put("bitrate", this.v.e);
                jSONObject.put("mime", this.v.d);
                jSONObject.put("delivery", this.v.a);
            }
            com.fyber.inneractive.sdk.player.controller.g gVar = this.b;
            jSONObject.put("player", gVar != null ? gVar.f() : "");
            if (inneractiveVideoError.getCause() != null) {
                jSONObject.put("exception", inneractiveVideoError.getCause().getClass().getName());
                jSONObject.put("message", inneractiveVideoError.getCause().getMessage() == null ? "empty" : inneractiveVideoError.getCause().getMessage());
            }
        } catch (Exception unused) {
            IAlog.a("onReportError: Failed creating Json object from media file!", new Object[0]);
        }
        IAlog.e("IAMediaPlayerFlowManager: reporting error to listeners: %s", inneractiveVideoError.getPlayerError().toString());
        g gVar2 = this.t;
        if (gVar2 != null) {
            try {
                ((h) gVar2).a(inneractiveVideoError, null, jSONObject, this.r);
            } catch (Exception e) {
                if (IAlog.a <= 3) {
                    e.printStackTrace();
                }
            }
        }
        o oVar = this.m;
        if (oVar != null) {
            oVar.cancel(true);
            oVar.b = null;
            this.n = null;
        }
        a();
    }

    @Override // com.fyber.inneractive.sdk.player.b
    public void a(i iVar, VideoClickOrigin videoClickOrigin, s... sVarArr) {
        if (sVarArr.length == 0) {
            IAlog.e("IAVastMediaPlayerFlowManager: eventTypes array is empty", new Object[0]);
        } else if (iVar == null) {
            IAlog.e("IAVastMediaPlayerFlowManager: parser is null", new Object[0]);
        } else {
            ArrayList arrayList = new ArrayList();
            for (s sVar : sVarArr) {
                String e = sVar.e();
                IAlog.a("IAVastMediaPlayerFlowManager: Firing events for type: %s", e);
                List<String> a2 = iVar.a(sVar);
                if (a2 != null && a2.size() != 0) {
                    arrayList.addAll(a2);
                    IAlog.a("found %d events for type: %s", Integer.valueOf(a2.size()), e);
                    a(a2, sVar);
                } else {
                    IAlog.a("IAVastMediaPlayerFlowManager: no events for type: %s", e);
                }
                if (sVar == s.EVENT_CLICK) {
                    for (Map.Entry<String, c> entry : D.entrySet()) {
                        String key = entry.getKey();
                        String a3 = entry.getValue().a(this.b, videoClickOrigin);
                        for (int i = 0; i < arrayList.size(); i++) {
                            String str = (String) arrayList.get(i);
                            if (str.contains(key)) {
                                arrayList.set(i, str.replace(key, a3));
                            }
                        }
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!TextUtils.isEmpty(str2)) {
                    g0.b(str2);
                }
            }
        }
    }

    public static void a(i iVar, s... sVarArr) {
        ArrayList arrayList = new ArrayList();
        for (s sVar : sVarArr) {
            String e = sVar.e();
            IAlog.a("IAVastMediaPlayerFlowManager: Firing events for type: %s", e);
            List<String> a2 = ((com.fyber.inneractive.sdk.measurement.e) iVar).a(sVar);
            if (a2 != null && a2.size() != 0) {
                arrayList.addAll(a2);
                IAlog.a("found %d events for type: %s", Integer.valueOf(a2.size()), e);
                a(a2, sVar);
            } else {
                IAlog.a("IAVastMediaPlayerFlowManager: no events for type: %s", e);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str)) {
                g0.b(str);
            }
        }
    }

    public static void a(List<String> list, s sVar) {
        for (String str : list) {
            IAlog.a("   event url: %s", str);
            if (!TextUtils.isEmpty(str)) {
                int i = IAlog.a;
                IAlog.a(1, null, "%s %s %s", "VAST_EVENT", sVar.e(), str);
                IAlog.a(1, null, "Tracking URLs array: %s", "VPAID", str);
            }
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.a aVar) {
        if (this.y == aVar) {
            return;
        }
        if (aVar == com.fyber.inneractive.sdk.player.enums.a.Started) {
            this.z = false;
            a(this.x, VideoClickOrigin.InvalidOrigin, s.EVENT_IMPRESSION, s.EVENT_START);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.FirstQuarter) {
            a(this.x, VideoClickOrigin.InvalidOrigin, s.EVENT_FIRSTQ);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.MidPoint) {
            a(this.x, VideoClickOrigin.InvalidOrigin, s.EVENT_MID);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.ThirdPQuarter) {
            a(this.x, VideoClickOrigin.InvalidOrigin, s.EVENT_THIRDQ);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.Completed && !this.z) {
            this.z = true;
            a(this.x, VideoClickOrigin.InvalidOrigin, s.EVENT_COMPLETE);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.Restarted) {
            a(this.x, VideoClickOrigin.InvalidOrigin, s.EVENT_REWIND);
        }
        this.y = aVar;
    }

    public void a(b0 b0Var) {
        this.A = b0Var;
    }
}
