package com.fyber.inneractive.sdk.dv.rewarded;

import android.app.Activity;
import com.fyber.inneractive.sdk.dv.f;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class c extends x<com.fyber.inneractive.sdk.a, InneractiveFullscreenAdEventsListener> implements com.fyber.inneractive.sdk.dv.interstitial.a {
    public c.b x;
    public boolean y = false;

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean J() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public int L() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public int M() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public long N() {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean O() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public long a(long j) {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.flow.x, com.fyber.inneractive.sdk.interfaces.c
    public void a(c.a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        super.a(aVar, activity);
        if (activity != null) {
            AdContent adcontent = this.b;
            if (adcontent != 0) {
                com.fyber.inneractive.sdk.a aVar2 = (com.fyber.inneractive.sdk.a) adcontent;
                if (aVar2.i != 0) {
                    aVar2.a(this, activity);
                    return;
                }
            }
            IAlog.e("%sad content is null aborting", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("Ad content is null");
        }
        IAlog.e("%sYou must pass activity in order to show rewarded", IAlog.a(this));
        throw new InneractiveUnitController.AdDisplayError("No activity context");
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public /* bridge */ /* synthetic */ boolean b(com.fyber.inneractive.sdk.a aVar) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.dv.interstitial.a
    public void d() {
        AdContent adcontent = this.b;
        if (adcontent != 0) {
            com.fyber.inneractive.sdk.a aVar = (com.fyber.inneractive.sdk.a) adcontent;
            if (((f) aVar.b) != null) {
                a((f) aVar.b);
            }
        }
        a(com.fyber.inneractive.sdk.cache.session.enums.a.CLICK, com.fyber.inneractive.sdk.cache.session.enums.b.REWARDED_VIDEO);
        D();
    }

    @Override // com.fyber.inneractive.sdk.dv.interstitial.a
    public void i() {
        EventsListener eventslistener;
        if (this.y || (eventslistener = this.c) == 0) {
            return;
        }
        this.y = true;
        ((InneractiveFullscreenAdEventsListener) eventslistener).onAdDismissed(this.a);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void m() {
    }

    @Override // com.fyber.inneractive.sdk.dv.interstitial.a
    public void onReward() {
        c.b bVar = this.x;
        if (bVar != null) {
            ((InneractiveFullscreenUnitController.a) bVar).a();
            I();
        }
        a(com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION, com.fyber.inneractive.sdk.cache.session.enums.b.REWARDED_VIDEO);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public boolean v() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.dv.interstitial.a
    public void w() {
        AdContent adcontent = this.b;
        if (adcontent != 0) {
            b((f) ((com.fyber.inneractive.sdk.a) adcontent).b);
        }
        a(com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION, com.fyber.inneractive.sdk.cache.session.enums.b.REWARDED_VIDEO);
        E();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void a(c.b bVar) {
        this.x = bVar;
    }
}
