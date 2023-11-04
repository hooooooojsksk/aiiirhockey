package com.fyber.inneractive.sdk.display;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class b extends a implements c.a {
    public InneractiveAdSpot a;
    public com.fyber.inneractive.sdk.interfaces.c b;

    /* JADX WARN: Type inference failed for: r1v0, types: [AdContent extends com.fyber.inneractive.sdk.flow.o, com.fyber.inneractive.sdk.flow.o] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.fyber.inneractive.sdk.external.InneractiveUnitController$EventsListener, EventsListener extends com.fyber.inneractive.sdk.external.InneractiveUnitController$EventsListener] */
    @Override // com.fyber.inneractive.sdk.display.a
    public void a(Activity activity, InneractiveAdSpot inneractiveAdSpot, String str) {
        InneractiveAdSpot inneractiveAdSpot2 = (TextUtils.isEmpty(str) || (inneractiveAdSpot2 = InneractiveAdSpotManager.get().getSpot(str)) == null || inneractiveAdSpot2.getAdContent() == null) ? null : null;
        this.a = inneractiveAdSpot2;
        if (inneractiveAdSpot2 != null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot2.getSelectedUnitController();
            if (selectedUnitController instanceof InneractiveFullscreenAdActivity.FullScreenRendererProvider) {
                com.fyber.inneractive.sdk.interfaces.c fullscreenRenderer = ((InneractiveFullscreenAdActivity.FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
                this.b = fullscreenRenderer;
                if (fullscreenRenderer != null) {
                    InneractiveAdSpot inneractiveAdSpot3 = this.a;
                    x xVar = (x) fullscreenRenderer;
                    xVar.a = inneractiveAdSpot3;
                    xVar.b = inneractiveAdSpot3.getAdContent();
                    xVar.c = inneractiveAdSpot3.getSelectedUnitController().getEventsListener();
                    xVar.v.a = inneractiveAdSpot3;
                    try {
                        this.b.a(this, activity);
                    } catch (Resources.NotFoundException e) {
                        IAlog.e("Interstitial Activity: %s", e.getMessage());
                    } catch (InneractiveUnitController.AdDisplayError e2) {
                        IAlog.e("Interstitial Activity: %s", e2.getMessage());
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void destroy() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void disableCloseButton() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void dismissAd(boolean z) {
        com.fyber.inneractive.sdk.interfaces.c cVar = this.b;
        if (cVar != null) {
            cVar.destroy();
            this.b = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public View getCloseButton() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public ViewGroup getLayout() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public boolean isCloseButtonDisplay() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void secondEndCardWasDisplayed() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void setActivityOrientation(boolean z, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void showCloseButton(boolean z, int i, int i2) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void showCloseCountdown() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void updateCloseCountdown(int i) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public boolean wasDismissedByUser() {
        return false;
    }
}
