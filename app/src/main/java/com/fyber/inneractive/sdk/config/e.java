package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class e {
    public final Context a;
    public WeakReference<Context> b;

    /* loaded from: classes.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
            e.this = r1;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            e.this.b = new WeakReference<>(activity);
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

    public e(Context context, Context context2) {
        a aVar = new a();
        this.a = context2;
        if (context instanceof Activity) {
            this.b = new WeakReference<>(context);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(aVar);
        }
    }

    public Context a() {
        Context context = (Context) com.fyber.inneractive.sdk.util.q.a(this.b);
        return context != null ? context : this.a;
    }
}
