package com.fyber.inneractive.sdk.dv.interstitial;

import android.app.Activity;
import com.fyber.inneractive.sdk.dv.f;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class d extends x<com.fyber.inneractive.sdk.a, InneractiveFullscreenAdEventsListener> implements a {
    public boolean x = false;

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
        IAlog.e("%sYou must pass activity in order to show interstitial", IAlog.a(this));
        throw new InneractiveUnitController.AdDisplayError("No activity context");
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void a(c.b bVar) {
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
        a(com.fyber.inneractive.sdk.cache.session.enums.a.CLICK, com.fyber.inneractive.sdk.cache.session.enums.b.INTERSTITIAL_VIDEO);
        D();
    }

    @Override // com.fyber.inneractive.sdk.dv.interstitial.a
    public void i() {
        EventsListener eventslistener;
        if (this.x || (eventslistener = this.c) == 0) {
            return;
        }
        this.x = true;
        ((InneractiveFullscreenAdEventsListener) eventslistener).onAdDismissed(this.a);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void m() {
    }

    @Override // com.fyber.inneractive.sdk.dv.interstitial.a
    public void onReward() {
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
        a(com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION, com.fyber.inneractive.sdk.cache.session.enums.b.INTERSTITIAL_VIDEO);
        E();
    }
}
