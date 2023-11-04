package com.fyber.inneractive.sdk.external;

import android.app.Activity;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.t;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.factories.c;
import com.fyber.inneractive.sdk.flow.c0;
import com.fyber.inneractive.sdk.flow.o;
import com.fyber.inneractive.sdk.flow.u;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.network.p;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.q;

/* loaded from: classes.dex */
public class InneractiveFullscreenUnitController extends c0<InneractiveFullscreenAdEventsListener> implements InneractiveFullscreenAdActivity.FullScreenRendererProvider, InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener {
    public InneractiveFullScreenAdRewardedListener b;
    public c mRenderer;
    public boolean a = false;
    public final c.b c = new a();

    /* loaded from: classes.dex */
    public static class AdExpiredError extends InneractiveUnitController.AdDisplayError {
        public AdExpiredError(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public class a implements c.b {
        public a() {
            InneractiveFullscreenUnitController.this = r1;
        }

        public void a() {
            u uVar = (u) q.a(InneractiveFullscreenUnitController.this.mAdSpot);
            InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener = InneractiveFullscreenUnitController.this.b;
            if (inneractiveFullScreenAdRewardedListener == null || uVar == null) {
                return;
            }
            inneractiveFullScreenAdRewardedListener.onAdRewarded(uVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.c0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        c cVar = this.mRenderer;
        if (cVar != null) {
            cVar.destroy();
            this.mRenderer = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider
    public c getFullscreenRenderer() {
        return this.mRenderer;
    }

    public InneractiveFullScreenAdRewardedListener getRewardedListener() {
        return this.b;
    }

    public boolean isAvailable() {
        u uVar = (u) q.a(this.mAdSpot);
        return uVar != null && uVar.isReady();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener
    public void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.a = false;
    }

    public void setRewardedListener(InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener) {
        this.b = inneractiveFullScreenAdRewardedListener;
    }

    public void show(Activity activity) {
        com.fyber.inneractive.sdk.display.a cVar;
        if (activity == null) {
            IAlog.e("show() called with a null activity", new Object[0]);
        } else if (!this.a) {
            InneractiveAdSpot adSpot = getAdSpot();
            if (adSpot == null) {
                IAlog.e("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
                return;
            }
            o adContent = adSpot.getAdContent();
            if (adContent != null) {
                new q.a(p.IA_PUBLISHER_REQUESTED_SHOW, adContent.a, adContent.d(), adContent.c.c()).a((String) null);
            }
            if (!adSpot.isReady()) {
                EL el = this.mEventsListener;
                if (el != 0) {
                    ((InneractiveFullscreenAdEventsListener) el).onAdEnteredErrorState(adSpot, new AdExpiredError("Ad Expired"));
                    return;
                }
                return;
            }
            if (this.mRenderer == null) {
                this.mRenderer = c.b.a.a(getAdSpot());
            }
            selectContentController();
            if (adContent instanceof com.fyber.inneractive.sdk.dv.a) {
                cVar = new com.fyber.inneractive.sdk.display.b();
            } else {
                cVar = new com.fyber.inneractive.sdk.display.c();
            }
            cVar.a(activity, adSpot, adSpot.getLocalUniqueId());
            this.a = true;
            com.fyber.inneractive.sdk.interfaces.c cVar2 = this.mRenderer;
            if (cVar2 != null) {
                cVar2.a(this.c);
            }
        } else {
            IAlog.e("InneractiveFullscreenUnitController->show(android.content.Context) called while an ad is already showing", new Object[0]);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.c0
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        a0 a0Var = (a0) inneractiveAdSpot.getAdContent().d;
        if (a0Var.e != null) {
            return false;
        }
        t tVar = a0Var.c;
        if (tVar == null || !UnitDisplayType.INTERSTITIAL.equals(tVar.b)) {
            com.fyber.inneractive.sdk.config.c0 c0Var = a0Var.f;
            return c0Var != null && (UnitDisplayType.REWARDED.equals(c0Var.j) || UnitDisplayType.INTERSTITIAL.equals(c0Var.j) || UnitDisplayType.VERTICAL.equals(c0Var.j));
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.c0
    public boolean supportsRefresh() {
        return false;
    }
}
