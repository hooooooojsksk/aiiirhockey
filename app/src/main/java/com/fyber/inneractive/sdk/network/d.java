package com.fyber.inneractive.sdk.network;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.fyber.inneractive.sdk.network.c;

/* loaded from: classes.dex */
public class d implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ c a;

    public d(c cVar) {
        this.a = cVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        c cVar = this.a;
        Handler handler = cVar.d;
        if (handler != null) {
            handler.post(new c.a(20150330, 3500L));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Handler handler = this.a.d;
        if (handler != null) {
            handler.removeMessages(20150330);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
