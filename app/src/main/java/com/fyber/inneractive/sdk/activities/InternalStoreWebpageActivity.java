package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.global.features.p;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.flow.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.web.t;
import com.google.android.gms.drive.DriveFile;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* loaded from: classes.dex */
public class InternalStoreWebpageActivity extends InneractiveBaseActivity {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";
    public ViewGroup b;
    public t c;
    public p.a d = p.a.FullScreen;

    public static void startActivity(Context context, String str) {
        Intent intent = new Intent(context, InternalStoreWebpageActivity.class);
        intent.putExtra("spotId", str);
        if (!(context instanceof Activity)) {
            intent.setFlags(DriveFile.MODE_READ_ONLY);
        }
        context.startActivity(intent);
    }

    public final InneractiveAdSpot a() {
        String stringExtra = getIntent().getStringExtra("spotId");
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.e("%sSpot id is empty", IAlog.a(this));
            return null;
        }
        return InneractiveAdSpotManager.get().getSpot(stringExtra);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        t tVar = this.c;
        if (tVar != null) {
            tVar.C = false;
            t.g gVar = tVar.i;
            if (gVar != null) {
                IAlog.a("onInternalStoreWebpageDismissed callback called", new Object[0]);
                ((com.fyber.inneractive.sdk.flow.p) gVar).F();
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        t tVar = this.c;
        if (tVar != null) {
            boolean z = true;
            if (!tVar.x) {
                if (tVar.w) {
                    tVar.f("navigateBack();");
                } else {
                    z = false;
                }
            }
            if (z) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes.width == l.e() || this.d != p.a.Modal) {
            return;
        }
        attributes.gravity = 83;
        attributes.height = (int) (l.d() * 0.8f);
        attributes.width = l.e();
        getWindow().setAttributes(attributes);
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        p.a aVar;
        InneractiveAdSpot a = a();
        if (a != null && a.getAdContent() != null) {
            p pVar = (p) a.getAdContent().c.a(p.class);
            if (pVar != null) {
                String a2 = pVar.a("presentation_mode", (String) null);
                if (a2 != null) {
                    p.a[] values = p.a.values();
                    int length = values.length;
                    for (int i = 0; i < length; i++) {
                        aVar = values[i];
                        Locale locale = Locale.US;
                        if (a2.toLowerCase(locale).equals(aVar.value.toLowerCase(locale))) {
                            break;
                        }
                    }
                }
                aVar = p.a.FullScreen;
            } else {
                aVar = p.a.FullScreen;
            }
            this.d = aVar;
            if (aVar == p.a.Modal) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.gravity = 83;
                attributes.height = (int) (l.d() * 0.8f);
                attributes.width = l.e();
                attributes.dimAmount = 0.3f;
                getWindow().setAttributes(attributes);
                getWindow().getDecorView().setBackgroundColor(0);
                getWindow().addFlags(514);
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            } else {
                setTheme(16973831);
            }
            super.onCreate(bundle);
            setContentView(R.layout.activity_internal_store_webpage);
            this.b = (ViewGroup) findViewById(R.id.internal_store_content);
            t c = a.getAdContent().c();
            this.c = c;
            if (c != null) {
                c.getClass();
                c.q = new WeakReference<>(this);
                t tVar = this.c;
                com.fyber.inneractive.sdk.ignite.j jVar = tVar.h;
                if (jVar != null) {
                    ((n.a) jVar).a(com.fyber.inneractive.sdk.network.p.IGNITE_FLOW_STORE_PAGE_OPENED, tVar.B ? com.fyber.inneractive.sdk.ignite.k.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.k.SINGLE_TAP);
                }
                this.c.t.set(0);
                return;
            }
            return;
        }
        super.onCreate(bundle);
        finish();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        t tVar;
        super.onDestroy();
        InneractiveAdSpot a = a();
        if (a == null || a.getAdContent() == null || a.getAdContent().e() || (tVar = this.c) == null) {
            return;
        }
        tVar.a();
        this.c = null;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        t tVar = this.c;
        if (tVar != null) {
            this.b.addView(tVar.a, new ViewGroup.LayoutParams(-1, -1));
        }
    }
}
