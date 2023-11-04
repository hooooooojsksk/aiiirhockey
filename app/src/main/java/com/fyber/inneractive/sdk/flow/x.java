package com.fyber.inneractive.sdk.flow;

import android.app.Activity;
import android.content.res.Resources;
import android.os.CountDownTimer;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.flow.o;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t0;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class x<AdContent extends o, EventsListener extends InneractiveUnitController.EventsListener> extends p<AdContent, EventsListener> implements com.fyber.inneractive.sdk.interfaces.c {
    public c.a l;
    public Runnable m;
    public t0 n;
    public Runnable o;
    public t0 p;
    public long s;
    public CountDownTimer w;
    public boolean q = false;
    public boolean r = false;
    public boolean t = false;
    public boolean u = false;
    public final com.fyber.inneractive.sdk.util.a v = new com.fyber.inneractive.sdk.util.a();

    /* loaded from: classes.dex */
    public class a extends CountDownTimer {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, long j2) {
            super(j, j2);
            x.this = r1;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CountDownTimer countDownTimer = x.this.w;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            x.this.e(false);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            int i = ((int) j) / 1000;
            c.a aVar = x.this.l;
            if (aVar != null) {
                aVar.updateCloseCountdown(i);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements t0.b {
        public b() {
            x.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.util.t0.b
        public void a(t0 t0Var) {
            com.fyber.inneractive.sdk.util.m.b.post(x.this.m);
            x xVar = x.this;
            t0 t0Var2 = xVar.n;
            if (t0Var2 != null) {
                t0Var2.e = null;
                xVar.n = null;
            }
            xVar.r = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p
    public int A() {
        c.a aVar = this.l;
        if (aVar == null || aVar.getLayout() == null) {
            return 1;
        }
        return this.l.getLayout().getWidth();
    }

    @Override // com.fyber.inneractive.sdk.flow.p
    public void D() {
        super.D();
    }

    public abstract boolean J();

    public void K() {
        if (this.m == null) {
            long N = N();
            this.s = N;
            this.m = new w(this, N);
            IAlog.a("%senabling close with delay %d", IAlog.a(this), Long.valueOf(this.s));
            AdContent adcontent = this.b;
            boolean b2 = adcontent != null ? b((x<AdContent, EventsListener>) adcontent) : false;
            if (!b2 || J()) {
                Q();
            } else if (b2) {
                c.a aVar = this.l;
                if (aVar != null) {
                    aVar.showCloseCountdown();
                }
                a aVar2 = new a(100 + this.s, 1000L);
                this.w = aVar2;
                aVar2.start();
            }
        }
    }

    public abstract int L();

    public abstract int M();

    public abstract long N();

    public abstract boolean O();

    public void P() {
        Runnable runnable = this.m;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.m.b.removeCallbacks(runnable);
            this.m = null;
        }
        Runnable runnable2 = this.o;
        if (runnable2 != null) {
            com.fyber.inneractive.sdk.util.m.b.removeCallbacks(runnable2);
            this.o = null;
        }
    }

    public void Q() {
        if (this.r) {
            return;
        }
        this.r = true;
        t0 t0Var = new t0(TimeUnit.MILLISECONDS, this.s);
        this.n = t0Var;
        t0Var.e = new b();
        t0Var.c();
    }

    public abstract long a(long j);

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void b(boolean z) {
    }

    public abstract boolean b(AdContent adcontent);

    public void d(boolean z) {
        q.a aVar;
        if (this.b == null) {
            aVar = new q.a(com.fyber.inneractive.sdk.network.p.MRAID_CUSTOM_CLOSE_DETECTED, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null, (JSONArray) null);
        } else {
            com.fyber.inneractive.sdk.network.p pVar = com.fyber.inneractive.sdk.network.p.MRAID_CUSTOM_CLOSE_DETECTED;
            AdContent adcontent = this.b;
            aVar = new q.a(pVar, adcontent.a, adcontent.d(), this.b.c.c());
        }
        JSONObject jSONObject = new JSONObject();
        Boolean valueOf = Boolean.valueOf(z);
        try {
            jSONObject.put("fyber_close_enabled", valueOf);
        } catch (Exception unused) {
            IAlog.e("Got exception adding param to json object: %s, %s", "fyber_close_enabled", valueOf);
        }
        aVar.f.put(jSONObject);
        aVar.a((String) null);
    }

    @Override // com.fyber.inneractive.sdk.flow.p, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        P();
        c.a aVar = this.l;
        if (aVar != null) {
            aVar.destroy();
        }
        this.l = null;
        CountDownTimer countDownTimer = this.w;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.w = null;
        }
        t0 t0Var = this.p;
        if (t0Var != null) {
            t0Var.e = null;
            this.p = null;
        }
        t0 t0Var2 = this.n;
        if (t0Var2 != null) {
            t0Var2.e = null;
            this.n = null;
        }
        super.destroy();
    }

    public void e(boolean z) {
        q.a aVar;
        this.q = true;
        if (z) {
            if (this.b == null) {
                aVar = new q.a(com.fyber.inneractive.sdk.network.p.FAIL_SAFE_ACTIVATED, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null, (JSONArray) null);
            } else {
                com.fyber.inneractive.sdk.network.p pVar = com.fyber.inneractive.sdk.network.p.FAIL_SAFE_ACTIVATED;
                AdContent adcontent = this.b;
                aVar = new q.a(pVar, adcontent.a, adcontent.d(), this.b.c.c());
            }
            JSONObject jSONObject = new JSONObject();
            Boolean valueOf = Boolean.valueOf(O());
            try {
                jSONObject.put("is_endcard", valueOf);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", "is_endcard", valueOf);
            }
            aVar.f.put(jSONObject);
            aVar.a((String) null);
        }
        c.a aVar2 = this.l;
        if (aVar2 != null) {
            aVar2.showCloseButton(z, M(), L());
            if (z) {
                return;
            }
            this.v.a();
            this.v.a(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.a = inneractiveAdSpot;
        this.b = (AdContent) inneractiveAdSpot.getAdContent();
        this.c = (EventsListener) inneractiveAdSpot.getSelectedUnitController().getEventsListener();
        this.v.a = inneractiveAdSpot;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void o() {
        t0 t0Var = this.n;
        if (t0Var != null) {
            t0Var.b();
        }
        t0 t0Var2 = this.p;
        if (t0Var2 != null) {
            t0Var2.b();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void t() {
        t0 t0Var = this.n;
        if (t0Var != null) {
            t0Var.a();
        }
        t0 t0Var2 = this.p;
        if (t0Var2 != null) {
            t0Var2.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p
    public View y() {
        c.a aVar = this.l;
        if (aVar != null) {
            return aVar.getLayout();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.p
    public int z() {
        c.a aVar = this.l;
        if (aVar == null || aVar.getLayout() == null) {
            return 1;
        }
        return this.l.getLayout().getHeight();
    }

    public void a(c.a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError, Resources.NotFoundException {
        if (this.a == null) {
            IAlog.e("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("No spot ad to render");
        } else if (aVar != null) {
            this.l = aVar;
        } else {
            IAlog.e("%srenderAd called with a null activity!", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("Activity is null");
        }
    }
}
