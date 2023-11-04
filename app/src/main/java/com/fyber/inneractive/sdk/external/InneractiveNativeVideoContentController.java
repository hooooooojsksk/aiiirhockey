package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.e0;
import com.fyber.inneractive.sdk.util.q;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class InneractiveNativeVideoContentController extends e0 {
    public WeakReference<Renderer> a;

    /* loaded from: classes.dex */
    public interface Renderer {
        void pauseVideo();

        void playVideo();
    }

    @Override // com.fyber.inneractive.sdk.flow.v
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent().isVideoAd();
    }

    public void pauseVideo() {
        if (((Renderer) q.a(this.a)) != null) {
            this.a.get().pauseVideo();
        }
    }

    public void playVideo() {
        Renderer renderer = (Renderer) q.a(this.a);
        if (renderer != null) {
            renderer.playVideo();
        }
    }

    public void setControlledRenderer(Renderer renderer) {
        this.a = new WeakReference<>(renderer);
    }
}
