package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;

/* loaded from: classes.dex */
public interface InneractiveUnitController<EL extends EventsListener> {

    /* loaded from: classes.dex */
    public static class AdDisplayError extends Exception {
        public AdDisplayError() {
        }

        public AdDisplayError(String str) {
            super(str);
        }

        public AdDisplayError(String str, Throwable th) {
            super(str, th);
        }

        public AdDisplayError(Throwable th) {
            super(th);
        }

        public AdDisplayError(String str, Throwable th, boolean z, boolean z2) {
            super(str, th, z, z2);
        }
    }

    /* loaded from: classes.dex */
    public interface EventsListener {
        void onAdClicked(InneractiveAdSpot inneractiveAdSpot);

        void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, AdDisplayError adDisplayError);

        void onAdImpression(InneractiveAdSpot inneractiveAdSpot);

        void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot);

        void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot);
    }

    /* loaded from: classes.dex */
    public static abstract class EventsListenerAdapter implements EventsListener {
        @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        }
    }

    void addContentController(InneractiveContentController inneractiveContentController);

    void destroy();

    InneractiveAdSpot getAdSpot();

    EL getEventsListener();

    InneractiveContentController getSelectedContentController();

    void setEventsListener(EL el);
}
