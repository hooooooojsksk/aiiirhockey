package com.fyber.inneractive.sdk.player;

import android.view.View;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.r;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.d0;
import com.fyber.inneractive.sdk.flow.k;
import com.fyber.inneractive.sdk.model.vast.n;
import com.fyber.inneractive.sdk.network.j0;
import com.fyber.inneractive.sdk.network.o;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.player.a;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.j;
import com.fyber.inneractive.sdk.util.m;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h implements g {
    public com.fyber.inneractive.sdk.player.a a;
    public InneractiveAdRequest b;
    public com.fyber.inneractive.sdk.response.g c;
    public b d;
    public n e;
    public a.InterfaceC0024a f;
    public boolean g = false;
    public s h;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[InneractiveVideoError.Error.values().length];
            a = iArr;
            try {
                iArr[InneractiveVideoError.Error.ERROR_NO_MEDIA_FILES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[InneractiveVideoError.Error.ERROR_PRE_BUFFER_TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[InneractiveVideoError.Error.ERROR_BUFFER_TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public h(com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest, d0 d0Var, b bVar) {
        this.b = inneractiveAdRequest;
        this.c = gVar;
        this.d = bVar;
        this.h = d0Var.b();
        this.a = new com.fyber.inneractive.sdk.player.a(d0Var);
    }

    public final o a(InneractiveVideoError.Error error) {
        int i = a.a[error.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            IAlog.a("IAReportError, Does not know player error " + error.getErrorString(), new Object[0]);
                            return o.VAST_UNKNOWN_PLAYER_ERROR;
                        }
                        return o.VAST_ERROR_BUFFER_TIMEOUT;
                    }
                    return o.VAST_ERROR_PRE_BUFFER_TIMEOUT;
                }
                return o.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
            }
            return o.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
        }
        return o.VAST_ERROR_NO_MEDIA_FILES;
    }

    public final void b() {
        new q.a(a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES).getPlayerError()), this.b, this.c, this.h.c()).a((String) null);
    }

    public a.InterfaceC0024a c() {
        return this.f;
    }

    public final void d() {
        a.InterfaceC0024a interfaceC0024a = this.f;
        if (interfaceC0024a != null) {
            n nVar = this.e;
            e eVar = (e) interfaceC0024a;
            eVar.t = this;
            if (nVar != null) {
                String str = nVar.g;
                eVar.v = nVar;
                eVar.s++;
                eVar.o = false;
                eVar.q = false;
                eVar.c = str;
                IAlog.a("IAMediaPlayerFlowManager: playNextMediaFile - loading video url: %s", str);
                com.fyber.inneractive.sdk.util.o oVar = eVar.m;
                if (oVar != null) {
                    oVar.cancel(true);
                    oVar.b = null;
                    eVar.n = null;
                }
                if (eVar.n == null) {
                    eVar.n = new c(eVar);
                }
                IAlog.a("IAMediaPlayerFlowManager: start - start fetching video frame", new Object[0]);
                if (!eVar.b.a()) {
                    com.fyber.inneractive.sdk.util.o oVar2 = new com.fyber.inneractive.sdk.util.o(eVar.a, eVar.n, eVar.c, null, 81920);
                    eVar.m = oVar2;
                    oVar2.executeOnExecutor(m.a, new Void[0]);
                }
                if (!eVar.p) {
                    eVar.b.a(str, eVar.u);
                }
                int i = 10;
                if (j.m()) {
                    s sVar = eVar.d;
                    int a2 = IAConfigManager.M.u.b.a("VASTLoadTimeoutWiFi", 10, 1);
                    if (sVar != null) {
                        Integer b2 = ((r) sVar.a(r.class)).b("load_timeout_wifi");
                        if (b2 != null) {
                            i = b2.intValue();
                        }
                    } else {
                        i = a2;
                    }
                } else {
                    s sVar2 = eVar.d;
                    i = IAConfigManager.M.u.b.a("VASTLoadTimeout3G", 30, 1);
                    if (sVar2 != null) {
                        Integer b3 = ((r) sVar2.a(r.class)).b("load_timeout_3g");
                        i = b3 != null ? b3.intValue() : 30;
                    }
                }
                eVar.a(i * 1000);
                k kVar = eVar.B;
                if (kVar != null) {
                    kVar.a();
                    return;
                }
                return;
            }
            return;
        }
        b bVar = this.d;
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.f.COULD_NOT_LOAD_USING_FLOW_MANAGER, new Exception("loadNextMediaFile flowManager is null"));
        com.fyber.inneractive.sdk.flow.m mVar = (com.fyber.inneractive.sdk.flow.m) bVar;
        mVar.a((InneractiveError) inneractiveInfrastructureError);
        mVar.a(inneractiveInfrastructureError);
    }

    public final void e() {
        try {
            this.f = this.a.a();
        } catch (Throwable th) {
            b bVar = this.d;
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.f.COULD_NOT_CREATE_FLOW_MANAGER, th);
            com.fyber.inneractive.sdk.flow.m mVar = (com.fyber.inneractive.sdk.flow.m) bVar;
            mVar.a((InneractiveError) inneractiveInfrastructureError);
            mVar.a(inneractiveInfrastructureError);
        }
    }

    public void a() {
        a.InterfaceC0024a interfaceC0024a = this.a.b;
        if (interfaceC0024a != null) {
            e eVar = (e) interfaceC0024a;
            eVar.p = true;
            IAlog.a("IAMediaPlayerFlowManager: destroy", new Object[0]);
            View c = eVar.c();
            if (c != null && (c instanceof com.fyber.inneractive.sdk.web.g)) {
                ((com.fyber.inneractive.sdk.web.g) c).destroy();
            }
            com.fyber.inneractive.sdk.util.o oVar = eVar.m;
            if (oVar != null) {
                oVar.cancel(true);
                oVar.b = null;
                eVar.n = null;
            }
            eVar.a();
            com.fyber.inneractive.sdk.player.controller.g gVar = eVar.b;
            if (gVar != null) {
                gVar.b();
                eVar.b = null;
            }
            eVar.l = null;
            eVar.t = null;
            Runnable runnable = eVar.e;
            if (runnable != null) {
                m.b.removeCallbacks(runnable);
            }
            k kVar = eVar.B;
            if (kVar != null) {
                Iterator<com.fyber.inneractive.sdk.flow.vast.a> it = kVar.k.iterator();
                while (it.hasNext()) {
                    com.fyber.inneractive.sdk.flow.vast.a next = it.next();
                    if (next.b != null && (next instanceof com.fyber.inneractive.sdk.flow.vast.e)) {
                        next.a();
                    }
                }
                j0 j0Var = kVar.h;
                if (j0Var != null) {
                    j0Var.a = true;
                }
            }
            eVar.B = null;
        }
    }

    public void a(InneractiveVideoError inneractiveVideoError, InneractiveErrorCode inneractiveErrorCode, JSONObject jSONObject, boolean z) {
        com.fyber.inneractive.sdk.flow.f fVar;
        InneractiveErrorCode inneractiveErrorCode2;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        com.fyber.inneractive.sdk.flow.f fVar2 = com.fyber.inneractive.sdk.flow.f.UNSPECIFIED;
        q.a aVar = new q.a(a(inneractiveVideoError.getPlayerError()), this.b, this.c, this.h.c());
        if (jSONObject != null) {
            try {
                aVar.f.put(new JSONObject(jSONObject.toString()));
            } catch (Exception unused) {
            }
        }
        aVar.a((String) null);
        IAlog.a("got onMediaPlayerLoadError with: " + inneractiveVideoError.getPlayerError(), new Object[0]);
        if (z) {
            inneractiveErrorCode2 = InneractiveErrorCode.LOAD_TIMEOUT;
            fVar = com.fyber.inneractive.sdk.flow.f.VIDEO_AD_LOAD_TIMEOUT;
        } else {
            fVar = fVar2;
            inneractiveErrorCode2 = null;
        }
        IAlog.a("got onMediaPlayerLoadError with: " + inneractiveVideoError.description(), new Object[0]);
        if (inneractiveVideoError.getPlayerError().isFatal()) {
            inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            fVar = com.fyber.inneractive.sdk.flow.f.VIDEO_FATAL_ERROR;
        }
        if (inneractiveErrorCode2 == null) {
            inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            fVar = com.fyber.inneractive.sdk.flow.f.VIDEO_ERROR_UNSPECIFIED;
        }
        if (InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED == null) {
            new q.a(o.VPAID_ERROR_UNSECURE_CONTENT, this.b, this.c, this.h.c()).a((String) null);
        }
        this.e = null;
        com.fyber.inneractive.sdk.response.g gVar = this.c;
        if (gVar != null && (bVar = gVar.J) != null) {
            this.e = bVar.d.poll();
        }
        if (this.e == null) {
            b();
            b bVar2 = this.d;
            if (bVar2 != null) {
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode2, fVar, inneractiveVideoError.getCause());
                com.fyber.inneractive.sdk.flow.m mVar = (com.fyber.inneractive.sdk.flow.m) bVar2;
                mVar.a((InneractiveError) inneractiveInfrastructureError);
                mVar.a(inneractiveInfrastructureError);
                a();
            }
        } else if (this.g) {
        } else {
            e();
            d();
        }
    }

    public void a(String str, String... strArr) {
        a.InterfaceC0024a interfaceC0024a = this.f;
        if (interfaceC0024a != null) {
            e eVar = (e) interfaceC0024a;
            eVar.getClass();
            if ("TRACKING_COMPLETED".equalsIgnoreCase(str)) {
                eVar.z = true;
            } else if ("EVENT_TRACKING".equalsIgnoreCase(str)) {
                for (String str2 : strArr) {
                    eVar.a(eVar.x, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.s.a(str2));
                }
            }
        }
    }
}
