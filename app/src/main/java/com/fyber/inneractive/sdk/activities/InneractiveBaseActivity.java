package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class InneractiveBaseActivity extends Activity {
    public OnBackInvokedCallback a;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            this.a = new b(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.a);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                if (this.a != null) {
                    getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.a);
                    this.a = null;
                }
            } catch (Exception e) {
                IAlog.e("failed to unregisterOnBackInvokedCallback with error: %s", e.getMessage());
            }
        }
    }
}
