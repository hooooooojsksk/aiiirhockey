package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class c0<EL extends InneractiveUnitController.EventsListener> implements InneractiveUnitController<EL> {
    public WeakReference<u> mAdSpot;
    public Set<InneractiveContentController> mContentControllers = new HashSet();
    public EL mEventsListener;
    public InneractiveContentController mSelectedContentController;

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void addContentController(InneractiveContentController inneractiveContentController) {
        this.mContentControllers.add(inneractiveContentController);
    }

    public boolean canRefreshAd() {
        return supportsRefresh();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        for (InneractiveContentController inneractiveContentController : this.mContentControllers) {
            inneractiveContentController.destroy();
        }
        this.mContentControllers.clear();
        this.mSelectedContentController = null;
        this.mAdSpot = null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public InneractiveAdSpot getAdSpot() {
        return (u) com.fyber.inneractive.sdk.util.q.a(this.mAdSpot);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public EL getEventsListener() {
        return this.mEventsListener;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    public String logPrefix() {
        return IAlog.a(this);
    }

    public void selectContentController() {
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) com.fyber.inneractive.sdk.util.q.a(this.mAdSpot);
        if (inneractiveAdSpot == null) {
            IAlog.e("selectContentController called, but ad spot is null", new Object[0]);
            return;
        }
        for (InneractiveContentController inneractiveContentController : this.mContentControllers) {
            v vVar = (v) inneractiveContentController;
            if (vVar.canControl(inneractiveAdSpot)) {
                this.mSelectedContentController = inneractiveContentController;
                vVar.setAdSpot(inneractiveAdSpot);
            }
        }
    }

    public void setAdSpot(u uVar) {
        this.mAdSpot = new WeakReference<>(uVar);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void setEventsListener(EL el) {
        this.mEventsListener = el;
    }

    public abstract boolean supports(InneractiveAdSpot inneractiveAdSpot);

    public abstract boolean supportsRefresh();
}
