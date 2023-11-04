package com.fyber.inneractive.sdk.activities;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.flow.o;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.x;
import com.google.android.gms.drive.DriveFile;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public class InneractiveInternalBrowserActivity extends InneractiveBaseActivity {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";
    public static final String URL_EXTRA = "extra_url";
    public static String j;
    public static InternalBrowserListener k;
    public o b;
    public String c;
    public LinearLayout d;
    public WebView e;
    public ImageButton f;
    public ImageButton g;
    public ImageButton h;
    public ImageButton i;

    /* loaded from: classes.dex */
    public interface InternalBrowserListener {
        void onApplicationInBackground();

        void onInternalBrowserDismissed();
    }

    public static void disableWebviewZoomControls(WebView webView) {
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
    }

    public static void setHtmlExtra(String str) {
        j = str;
    }

    public static void setInternalBrowserListener(InternalBrowserListener internalBrowserListener) {
        k = internalBrowserListener;
    }

    public final View a() {
        this.d = new LinearLayout(this);
        this.d.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.d.setOrientation(1);
        this.d.setContentDescription("IAInternalBrowserView");
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.d.addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, l.b(getResources().getInteger(R.integer.ia_ib_toolbar_height_dp)));
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackground(l.d(R.drawable.ia_ib_background));
        relativeLayout.addView(linearLayout);
        this.f = a(l.d(R.drawable.ia_ib_left_arrow));
        this.g = a(l.d(R.drawable.ia_ib_right_arrow));
        this.h = a(l.d(R.drawable.ia_ib_refresh));
        this.i = a(l.d(R.drawable.ia_ib_close));
        linearLayout.addView(this.f);
        linearLayout.addView(this.g);
        linearLayout.addView(this.h);
        linearLayout.addView(this.i);
        WebView webView = new WebView(this);
        this.e = webView;
        webView.setId(R.id.inneractive_webview_internal_browser);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, 1);
        this.e.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.e);
        return this.d;
    }

    @Override // android.app.Activity
    public void finish() {
        InternalBrowserListener internalBrowserListener = k;
        super.finish();
        if (internalBrowserListener != null) {
            internalBrowserListener.onInternalBrowserDismissed();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        InternalBrowserListener internalBrowserListener;
        InneractiveAdSpot spot;
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        super.onCreate(bundle);
        if (getActionBar() != null) {
            getActionBar().hide();
        }
        try {
            setContentView(a());
            String stringExtra = getIntent().getStringExtra("spotId");
            this.c = stringExtra;
            if (!TextUtils.isEmpty(stringExtra) && (spot = InneractiveAdSpotManager.get().getSpot(this.c)) != null) {
                this.b = spot.getAdContent();
            }
            Intent intent = getIntent();
            WebSettings settings = this.e.getSettings();
            boolean z = true;
            settings.setJavaScriptEnabled(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            disableWebviewZoomControls(this.e);
            this.e.setWebViewClient(new c(this));
            this.e.setWebChromeClient(new d(this));
            String stringExtra2 = intent.getStringExtra(URL_EXTRA);
            if (!TextUtils.isEmpty(j)) {
                this.e.loadDataWithBaseURL(stringExtra2, j, "text/html", "UTF-8", null);
            } else if (x.e(stringExtra2)) {
                if (x.d(stringExtra2)) {
                    try {
                        stringExtra2 = URLDecoder.decode(stringExtra2, "utf-8");
                        this.e.loadUrl(stringExtra2);
                    } catch (Exception unused) {
                        IAlog.e("Failed to open Url: %s", stringExtra2);
                        finish();
                    }
                } else {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra2));
                    intent2.addFlags(DriveFile.MODE_READ_ONLY);
                    try {
                        startActivity(intent2);
                    } catch (ActivityNotFoundException unused2) {
                        IAlog.e("Failed to start activity for %s. Please ensure that your phone can handle this intent.", stringExtra2);
                        z = false;
                    }
                    if (z && (internalBrowserListener = k) != null) {
                        internalBrowserListener.onApplicationInBackground();
                    }
                    finish();
                }
            } else {
                this.e.loadUrl(stringExtra2);
            }
            this.f.setBackgroundColor(0);
            this.f.setOnClickListener(new e(this));
            this.f.setContentDescription("IABackButton");
            this.g.setBackgroundColor(0);
            this.g.setOnClickListener(new f(this));
            this.g.setContentDescription("IAForwardButton");
            this.h.setBackgroundColor(0);
            this.h.setOnClickListener(new g(this));
            this.h.setContentDescription("IARefreshButton");
            this.i.setBackgroundColor(0);
            this.i.setOnClickListener(new h(this));
            this.i.setContentDescription("IACloseButton");
            int i = Build.VERSION.SDK_INT;
            if (i < 21) {
                CookieSyncManager.createInstance(l.a);
                CookieSyncManager.getInstance().startSync();
            }
            if (i < 21) {
                CookieSyncManager.getInstance().startSync();
            }
        } catch (Exception unused3) {
            finish();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        WebView webView = this.e;
        if (webView != null) {
            webView.destroy();
            this.e = null;
        }
        super.onDestroy();
        setHtmlExtra(null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisible(false);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.getInstance().stopSync();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.getInstance().startSync();
        }
    }

    public final ImageButton a(Drawable drawable) {
        ImageButton imageButton = new ImageButton(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(l.b(getResources().getInteger(R.integer.ia_ib_button_size_dp)), l.b(getResources().getInteger(R.integer.ia_ib_button_size_dp)), 1.0f);
        layoutParams.gravity = 16;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setImageDrawable(drawable);
        return imageButton;
    }
}
