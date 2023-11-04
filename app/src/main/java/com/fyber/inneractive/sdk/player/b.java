package com.fyber.inneractive.sdk.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.b0;
import com.fyber.inneractive.sdk.config.c0;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.config.global.features.r;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.d0;
import com.fyber.inneractive.sdk.ignite.k;
import com.fyber.inneractive.sdk.model.vast.n;
import com.fyber.inneractive.sdk.network.p;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.player.controller.g;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.response.i;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.m;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b implements g.f, g.e {
    public Context a;
    public com.fyber.inneractive.sdk.player.controller.g b;
    public String c;
    public final s d;
    public Runnable e;
    public d0 f;
    public InneractiveAdRequest g;
    public com.fyber.inneractive.sdk.measurement.a h;
    public com.fyber.inneractive.sdk.measurement.d i;
    public Bitmap l;
    public o m;
    public o.a n;
    public g t;
    public int u;
    public n v;
    public f j = null;
    public boolean k = true;
    public boolean o = false;
    public volatile boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public int s = 0;
    public g.d w = new C0025b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            b.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = b.this;
            IAlog.a("IAMediaPlayerFlowManager: onBufferTimeout reached: mBufferTimeoutRunnable = %s isDestroyed = %s", bVar.e, Boolean.valueOf(bVar.p));
            if (bVar.e == null || bVar.p) {
                return;
            }
            bVar.r = true;
            int c = bVar.b.c();
            int d = bVar.b.d();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", d);
                jSONObject.put("position", c);
            } catch (JSONException unused) {
            }
            bVar.e = null;
            if (!bVar.o) {
                com.fyber.inneractive.sdk.player.controller.g gVar = bVar.b;
                if (gVar != null) {
                    gVar.b();
                    bVar.b = null;
                    bVar.b();
                }
                bVar.a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_PRE_BUFFER_TIMEOUT), (JSONObject) null);
                return;
            }
            bVar.a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_BUFFER_TIMEOUT), jSONObject);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.b$b */
    /* loaded from: classes.dex */
    public class C0025b implements g.d {
        public C0025b() {
            b.this = r1;
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
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(b bVar);
    }

    /* loaded from: classes.dex */
    public class e extends Exception {
    }

    public b(Context context, Set<Vendor> set, s sVar) {
        this.a = context;
        this.d = sVar;
        b();
    }

    public void a(Bitmap bitmap) {
        IAlog.a("IAMediaPlayerFlowManager: saving snapshot %s", bitmap);
        this.l = bitmap;
    }

    public abstract void a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject);

    public abstract void a(i iVar, VideoClickOrigin videoClickOrigin, com.fyber.inneractive.sdk.model.vast.s... sVarArr);

    public final void b() {
        boolean a2;
        com.fyber.inneractive.sdk.player.controller.g gVar;
        Context context = this.a;
        s sVar = this.d;
        if (sVar != null) {
            try {
                a2 = ((r) sVar.a(r.class)).a("use_fmp_cache_mechanism", false);
            } catch (Throwable th) {
                if (IAlog.a <= 3) {
                    IAlog.a("Failed creating exo player", new Object[0]);
                    th.printStackTrace();
                }
                gVar = null;
            }
        } else {
            a2 = false;
        }
        gVar = new com.fyber.inneractive.sdk.player.controller.d(context, a2, sVar);
        if (gVar == null) {
            gVar = new com.fyber.inneractive.sdk.player.controller.a(context);
        }
        this.b = gVar;
        if (!gVar.b.contains(this)) {
            gVar.b.add(this);
        }
        com.fyber.inneractive.sdk.player.controller.g gVar2 = this.b;
        if (!gVar2.c.contains(this)) {
            gVar2.c.add(this);
        }
        this.b.f = this.w;
    }

    public abstract View c();

    public abstract com.fyber.inneractive.sdk.model.vast.c d();

    public void e() {
        com.fyber.inneractive.sdk.player.controller.g gVar = this.b;
        if (gVar != null) {
            com.fyber.inneractive.sdk.player.enums.b bVar = gVar.e;
            if (bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && bVar != com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                gVar.l();
            } else {
                gVar.a(1, true);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void a(Exception exc) {
        Object[] objArr = new Object[1];
        objArr[0] = exc != null ? exc.getMessage() : "no exception";
        IAlog.a("IMediaPlayerFlowManager: onPlayerError called with: %s", objArr);
        InneractiveVideoError inneractiveVideoError = new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, exc);
        if (exc instanceof e) {
            ((e) exc).getClass();
        }
        a(inneractiveVideoError, (JSONObject) null);
        if (this.o) {
            IAlog.a("IMediaPlayerFlowManager: onPlayerError video was prepared. This is a critical error. Aborting!", new Object[0]);
            a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, exc), (JSONObject) null);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void e(boolean z) {
        try {
            d0 d0Var = this.f;
            com.fyber.inneractive.sdk.response.g gVar = d0Var != null ? (com.fyber.inneractive.sdk.response.g) d0Var.b : null;
            p pVar = p.VAST_MEDIA_LOAD_RETRY_ATTEMPTED;
            InneractiveAdRequest inneractiveAdRequest = this.g;
            d0 d0Var2 = this.f;
            q.a aVar = new q.a(pVar, inneractiveAdRequest, gVar, d0Var2 == null ? null : d0Var2.c.c());
            if (this.v != null && gVar != null) {
                aVar.f.put(new q.b().a("waudio", String.valueOf(z)).a(ImagesContract.URL, this.v.g).a("bitrate", this.v.e).a("mime", TextUtils.isEmpty(this.v.d) ? "na" : this.v.d).a("delivery", this.v.a).a("media_file_index", Integer.valueOf(this.s)).a("player", this.b.f()).a);
            }
            aVar.a((String) null);
        } catch (Exception unused) {
        }
    }

    public void a() {
        Runnable runnable = this.e;
        if (runnable != null) {
            m.b.removeCallbacks(runnable);
            this.e = null;
            IAlog.a("IMediaPlayerFlowManager:: cancelBufferTimeout - running timeout runnable cancelled", new Object[0]);
        }
    }

    public void a(long j) {
        a();
        a aVar = new a();
        this.e = aVar;
        m.b.postDelayed(aVar, j);
        IAlog.a("IMediaPlayerFlowManager:: startBufferTimeout called with %d m/sec", Long.valueOf(j));
    }

    public static boolean a(int i, b0 b0Var, int i2) {
        if (i2 == 1 || InneractiveAdManager.isCurrentUserAChild()) {
            return true;
        }
        if (i <= 15999) {
            return false;
        }
        c0 c0Var = b0Var != null ? ((a0) b0Var).f : null;
        return (c0Var == null || c0Var.h == Skip.DEFAULT || c0Var.j == UnitDisplayType.REWARDED) ? false : true;
    }

    public void a(boolean z) {
        this.k = z;
    }

    public static int a(b bVar) {
        T t;
        d0 d0Var = bVar.f;
        if (d0Var == null || (t = d0Var.b) == 0) {
            return -1;
        }
        return ((com.fyber.inneractive.sdk.response.g) t).w;
    }

    public boolean a(s sVar, k kVar) {
        return kVar.e() && IAConfigManager.M.E.d() && sVar != null && sVar.a(com.fyber.inneractive.sdk.config.global.features.n.class) != null && ((com.fyber.inneractive.sdk.config.global.features.n) sVar.a(com.fyber.inneractive.sdk.config.global.features.n.class)).a("enable_app_info_button", true);
    }
}
