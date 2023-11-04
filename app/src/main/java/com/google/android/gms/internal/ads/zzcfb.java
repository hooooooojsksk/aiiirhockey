package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzfkr;
import com.google.firebase.analytics.FirebaseAnalytics;
import cz.msebera.android.httpclient.client.config.CookieSpecs;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcfb extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcei {
    public static final /* synthetic */ int zza = 0;
    private boolean zzA;
    private boolean zzB;
    private zzbdk zzC;
    private zzbdi zzD;
    private zzaus zzE;
    private int zzF;
    private int zzG;
    private zzbbg zzH;
    private final zzbbg zzI;
    private zzbbg zzJ;
    private final zzbbh zzK;
    private int zzL;
    private com.google.android.gms.ads.internal.overlay.zzl zzM;
    private boolean zzN;
    private final com.google.android.gms.ads.internal.util.zzci zzO;
    private int zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private Map zzT;
    private final WindowManager zzU;
    private final zzawe zzV;
    private final zzcfw zzb;
    private final zzapw zzc;
    private final zzbbt zzd;
    private final zzbzg zze;
    private com.google.android.gms.ads.internal.zzl zzf;
    private final com.google.android.gms.ads.internal.zza zzg;
    private final DisplayMetrics zzh;
    private final float zzi;
    private zzeyc zzj;
    private zzeyf zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcep zzn;
    private com.google.android.gms.ads.internal.overlay.zzl zzo;
    private IObjectWrapper zzp;
    private zzcfx zzq;
    private final String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private Boolean zzw;
    private boolean zzx;
    private final String zzy;
    private zzcfe zzz;

    public zzcfb(zzcfw zzcfwVar, zzcfx zzcfxVar, String str, boolean z, boolean z2, zzapw zzapwVar, zzbbt zzbbtVar, zzbzg zzbzgVar, zzbbj zzbbjVar, com.google.android.gms.ads.internal.zzl zzlVar, com.google.android.gms.ads.internal.zza zzaVar, zzawe zzaweVar, zzeyc zzeycVar, zzeyf zzeyfVar) {
        super(zzcfwVar);
        zzeyf zzeyfVar2;
        this.zzl = false;
        this.zzm = false;
        this.zzx = true;
        this.zzy = "";
        this.zzP = -1;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzS = -1;
        this.zzb = zzcfwVar;
        this.zzq = zzcfxVar;
        this.zzr = str;
        this.zzu = z;
        this.zzc = zzapwVar;
        this.zzd = zzbbtVar;
        this.zze = zzbzgVar;
        this.zzf = zzlVar;
        this.zzg = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzU = windowManager;
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics zzq = com.google.android.gms.ads.internal.util.zzs.zzq(windowManager);
        this.zzh = zzq;
        this.zzi = zzq.density;
        this.zzV = zzaweVar;
        this.zzj = zzeycVar;
        this.zzk = zzeyfVar;
        this.zzO = new com.google.android.gms.ads.internal.util.zzci(zzcfwVar.zza(), this, this, null);
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzbza.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjK)).booleanValue()) {
                settings.setMixedContentMode(1);
            } else {
                settings.setMixedContentMode(2);
            }
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzp().zzc(zzcfwVar, zzbzgVar.zza));
        com.google.android.gms.ads.internal.zzt.zzp();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WebSettings webSettings = settings;
                Context context2 = context;
                zzfkr zzfkrVar = zzs.zza;
                webSettings.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaE)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return true;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzaS();
        addJavascriptInterface(new zzcfi(this, new zzcfh(this), null), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzba();
        zzbbh zzbbhVar = new zzbbh(new zzbbj(true, "make_wv", this.zzr));
        this.zzK = zzbbhVar;
        zzbbhVar.zza().zzc(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbG)).booleanValue() && (zzeyfVar2 = this.zzk) != null && zzeyfVar2.zzb != null) {
            zzbbhVar.zza().zzd("gqi", this.zzk.zzb);
        }
        zzbbhVar.zza();
        zzbbg zzf = zzbbj.zzf();
        this.zzI = zzf;
        zzbbhVar.zzb("native:view_create", zzf);
        this.zzJ = null;
        this.zzH = null;
        com.google.android.gms.ads.internal.util.zzce.zza().zzb(zzcfwVar);
        com.google.android.gms.ads.internal.zzt.zzo().zzr();
    }

    private final synchronized void zzaS() {
        zzeyc zzeycVar = this.zzj;
        if (zzeycVar != null && zzeycVar.zzan) {
            zzbza.zze("Disabling hardware acceleration on an overlay.");
            zzaU();
            return;
        }
        if (!this.zzu && !this.zzq.zzi()) {
            zzbza.zze("Enabling hardware acceleration on an AdView.");
            zzaW();
            return;
        }
        zzbza.zze("Enabling hardware acceleration on an overlay.");
        zzaW();
    }

    private final synchronized void zzaT() {
        if (this.zzN) {
            return;
        }
        this.zzN = true;
        com.google.android.gms.ads.internal.zzt.zzo().zzq();
    }

    private final synchronized void zzaU() {
        if (!this.zzv) {
            setLayerType(1, null);
        }
        this.zzv = true;
    }

    private final void zzaV(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? "0" : "1");
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzaW() {
        if (this.zzv) {
            setLayerType(0, null);
        }
        this.zzv = false;
    }

    private final synchronized void zzaX(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "AdWebViewImpl.loadUrlUnsafe");
            zzbza.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzaY() {
        zzbbb.zza(this.zzK.zza(), this.zzI, "aeh2");
    }

    private final synchronized void zzaZ() {
        Map map = this.zzT;
        if (map != null) {
            for (zzccu zzccuVar : map.values()) {
                zzccuVar.release();
            }
        }
        this.zzT = null;
    }

    private final void zzba() {
        zzbbh zzbbhVar = this.zzK;
        if (zzbbhVar == null) {
            return;
        }
        zzbbj zza2 = zzbbhVar.zza();
        zzbaz zzf = com.google.android.gms.ads.internal.zzt.zzo().zzf();
        if (zzf != null) {
            zzf.zzf(zza2);
        }
    }

    private final synchronized void zzbb() {
        Boolean zzk = com.google.android.gms.ads.internal.zzt.zzo().zzk();
        this.zzw = zzk;
        if (zzk == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(true);
            } catch (IllegalStateException unused) {
                zzaQ(false);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcei
    public final synchronized void destroy() {
        zzba();
        this.zzO.zza();
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzb();
            this.zzo.zzl();
            this.zzo = null;
        }
        this.zzp = null;
        this.zzn.zzh();
        this.zzE = null;
        this.zzf = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzt) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
        zzaZ();
        this.zzt = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjg)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
            com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
            zzaX("about:blank");
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
        zzU();
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (!zzaz()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        zzbza.zzl("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzt) {
                    this.zzn.zzh();
                    com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
                    zzaZ();
                    zzaT();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcei
    public final synchronized void loadData(String str, String str2, String str3) {
        if (zzaz()) {
            zzbza.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcei
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (zzaz()) {
            zzbza.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcei
    public final synchronized void loadUrl(String str) {
        if (zzaz()) {
            zzbza.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadUrl(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcep zzcepVar = this.zzn;
        if (zzcepVar != null) {
            zzcepVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaz()) {
            this.zzO.zzc();
        }
        boolean z = this.zzA;
        zzcep zzcepVar = this.zzn;
        if (zzcepVar != null && zzcepVar.zzL()) {
            if (!this.zzB) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = true;
            }
            zzaR();
            z = true;
        }
        zzaV(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzcep zzcepVar;
        synchronized (this) {
            if (!zzaz()) {
                this.zzO.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzB && (zzcepVar = this.zzn) != null && zzcepVar.zzL() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = false;
            }
        }
        zzaV(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzQ(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            zzbza.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (zzaz()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaR = zzaR();
        com.google.android.gms.ads.internal.overlay.zzl zzL = zzL();
        if (zzL == null || !zzaR) {
            return;
        }
        zzL.zzm();
    }

    /* JADX WARN: Removed duplicated region for block: B:209:0x013e A[Catch: all -> 0x01e7, TryCatch #0 {, blocks: (B:125:0x0001, B:127:0x0008, B:130:0x000d, B:132:0x0013, B:134:0x0017, B:137:0x0021, B:139:0x0029, B:142:0x002e, B:144:0x0036, B:146:0x0048, B:149:0x004d, B:151:0x0054, B:155:0x005e, B:158:0x0063, B:161:0x0075, B:169:0x008c, B:163:0x007d, B:166:0x0082, B:172:0x0099, B:174:0x00a1, B:176:0x00b3, B:179:0x00b8, B:181:0x00d4, B:183:0x00dd, B:182:0x00d9, B:186:0x00e2, B:188:0x00ea, B:191:0x00f7, B:200:0x011d, B:202:0x0124, B:207:0x012c, B:209:0x013e, B:211:0x014c, B:215:0x0159, B:218:0x015e, B:220:0x01a9, B:221:0x01ad, B:223:0x01b4, B:228:0x01c1, B:230:0x01c7, B:231:0x01ca, B:233:0x01ce, B:234:0x01d7, B:237:0x01e2), top: B:243:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x015e A[Catch: all -> 0x01e7, TryCatch #0 {, blocks: (B:125:0x0001, B:127:0x0008, B:130:0x000d, B:132:0x0013, B:134:0x0017, B:137:0x0021, B:139:0x0029, B:142:0x002e, B:144:0x0036, B:146:0x0048, B:149:0x004d, B:151:0x0054, B:155:0x005e, B:158:0x0063, B:161:0x0075, B:169:0x008c, B:163:0x007d, B:166:0x0082, B:172:0x0099, B:174:0x00a1, B:176:0x00b3, B:179:0x00b8, B:181:0x00d4, B:183:0x00dd, B:182:0x00d9, B:186:0x00e2, B:188:0x00ea, B:191:0x00f7, B:200:0x011d, B:202:0x0124, B:207:0x012c, B:209:0x013e, B:211:0x014c, B:215:0x0159, B:218:0x015e, B:220:0x01a9, B:221:0x01ad, B:223:0x01b4, B:228:0x01c1, B:230:0x01c7, B:231:0x01ca, B:233:0x01ce, B:234:0x01d7, B:237:0x01e2), top: B:243:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01c1 A[Catch: all -> 0x01e7, TRY_ENTER, TryCatch #0 {, blocks: (B:125:0x0001, B:127:0x0008, B:130:0x000d, B:132:0x0013, B:134:0x0017, B:137:0x0021, B:139:0x0029, B:142:0x002e, B:144:0x0036, B:146:0x0048, B:149:0x004d, B:151:0x0054, B:155:0x005e, B:158:0x0063, B:161:0x0075, B:169:0x008c, B:163:0x007d, B:166:0x0082, B:172:0x0099, B:174:0x00a1, B:176:0x00b3, B:179:0x00b8, B:181:0x00d4, B:183:0x00dd, B:182:0x00d9, B:186:0x00e2, B:188:0x00ea, B:191:0x00f7, B:200:0x011d, B:202:0x0124, B:207:0x012c, B:209:0x013e, B:211:0x014c, B:215:0x0159, B:218:0x015e, B:220:0x01a9, B:221:0x01ad, B:223:0x01b4, B:228:0x01c1, B:230:0x01c7, B:231:0x01ca, B:233:0x01ce, B:234:0x01d7, B:237:0x01e2), top: B:243:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfb.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcei
    public final void onPause() {
        if (zzaz()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            zzbza.zzh("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcei
    public final void onResume() {
        if (zzaz()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            zzbza.zzh("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzn.zzL() || this.zzn.zzJ()) {
            zzapw zzapwVar = this.zzc;
            if (zzapwVar != null) {
                zzapwVar.zzd(motionEvent);
            }
            zzbbt zzbbtVar = this.zzd;
            if (zzbbtVar != null) {
                zzbbtVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbdk zzbdkVar = this.zzC;
                if (zzbdkVar != null) {
                    zzbdkVar.zzd(motionEvent);
                }
            }
        }
        if (zzaz()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcei
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcep) {
            this.zzn = (zzcep) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaz()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            zzbza.zzh("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized void zzA(int i) {
        this.zzL = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzB(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcbj
    public final synchronized void zzC(zzcfe zzcfeVar) {
        if (this.zzz != null) {
            zzbza.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzz = zzcfeVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcdz
    public final zzeyc zzD() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcfs
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final WebViewClient zzH() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcfq
    public final zzapw zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized zzaus zzJ() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized zzbdk zzK() {
        return this.zzC;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzL() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzM() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final /* synthetic */ zzcfv zzN() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcfp
    public final synchronized zzcfx zzO() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcff
    public final zzeyf zzP() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized IObjectWrapper zzQ() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final zzfut zzR() {
        zzbbt zzbbtVar = this.zzd;
        return zzbbtVar == null ? zzfuj.zzh(null) : zzbbtVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized String zzS() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzT(zzeyc zzeycVar, zzeyf zzeyfVar) {
        this.zzj = zzeycVar;
        this.zzk = zzeyfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzU() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzaT();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcfa(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzV() {
        zzaY();
        HashMap hashMap = new HashMap(1);
        hashMap.put(ClientCookie.VERSION_ATTR, this.zze.zza);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzW(int i) {
        if (i == 0) {
            zzbbb.zza(this.zzK.zza(), this.zzI, "aebb2");
        }
        zzaY();
        this.zzK.zza();
        this.zzK.zza().zzd("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put(ClientCookie.VERSION_ATTR, this.zze.zza);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzX() {
        if (this.zzH == null) {
            zzbbb.zza(this.zzK.zza(), this.zzI, "aes2");
            this.zzK.zza();
            zzbbg zzf = zzbbj.zzf();
            this.zzH = zzf;
            this.zzK.zzb("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(ClientCookie.VERSION_ATTR, this.zze.zza);
        zzd("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzY() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzZ(boolean z) {
        this.zzn.zzi(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbkv
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized boolean zzaA() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized boolean zzaC() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzaD(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        this.zzn.zzt(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzaE(com.google.android.gms.ads.internal.util.zzbr zzbrVar, zzeaf zzeafVar, zzdpi zzdpiVar, zzfdk zzfdkVar, String str, String str2, int i) {
        this.zzn.zzu(zzbrVar, zzeafVar, zzdpiVar, zzfdkVar, str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzaF(boolean z, int i, boolean z2) {
        this.zzn.zzv(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzaG(boolean z, int i, String str, boolean z2) {
        this.zzn.zzx(z, i, str, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzaH(boolean z, int i, String str, String str2, boolean z2) {
        this.zzn.zzy(z, i, str, str2, z2);
    }

    public final zzcep zzaJ() {
        return this.zzn;
    }

    final synchronized Boolean zzaK() {
        return this.zzw;
    }

    protected final synchronized void zzaN(String str, ValueCallback valueCallback) {
        if (zzaz()) {
            zzbza.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    public final void zzaO(String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            if (zzaK() == null) {
                zzbb();
            }
            if (zzaK().booleanValue()) {
                zzaN(str, null);
                return;
            } else {
                zzaP("javascript:".concat(str));
                return;
            }
        }
        zzaP("javascript:".concat(str));
    }

    protected final synchronized void zzaP(String str) {
        if (zzaz()) {
            zzbza.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzw = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzv(bool);
    }

    public final boolean zzaR() {
        int i;
        int i2;
        boolean z = false;
        if (this.zzn.zzK() || this.zzn.zzL()) {
            com.google.android.gms.ads.internal.client.zzay.zzb();
            DisplayMetrics displayMetrics = this.zzh;
            int zzw = zzbyt.zzw(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            DisplayMetrics displayMetrics2 = this.zzh;
            int zzw2 = zzbyt.zzw(displayMetrics2, displayMetrics2.heightPixels);
            Activity zza2 = this.zzb.zza();
            if (zza2 == null || zza2.getWindow() == null) {
                i = zzw;
                i2 = zzw2;
            } else {
                com.google.android.gms.ads.internal.zzt.zzp();
                int[] zzN = com.google.android.gms.ads.internal.util.zzs.zzN(zza2);
                com.google.android.gms.ads.internal.client.zzay.zzb();
                int zzw3 = zzbyt.zzw(this.zzh, zzN[0]);
                com.google.android.gms.ads.internal.client.zzay.zzb();
                i2 = zzbyt.zzw(this.zzh, zzN[1]);
                i = zzw3;
            }
            int i3 = this.zzQ;
            if (i3 == zzw && this.zzP == zzw2 && this.zzR == i && this.zzS == i2) {
                return false;
            }
            z = (i3 == zzw && this.zzP == zzw2) ? true : true;
            this.zzQ = zzw;
            this.zzP = zzw2;
            this.zzR = i;
            this.zzS = i2;
            new zzbqf(this, "").zzi(zzw, zzw2, i, i2, this.zzh.density, this.zzU.getDefaultDisplay().getRotation());
            return z;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzaa() {
        this.zzO.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzab(String str, String str2, String str3) {
        String str4;
        if (!zzaz()) {
            String[] strArr = new String[1];
            String str5 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzN);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ClientCookie.VERSION_ATTR, str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e) {
                zzbza.zzk("Unable to build MRAID_ENV", e);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, zzcfo.zza(str2, strArr), "text/html", "UTF-8", null);
            return;
        }
        zzbza.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzac() {
        if (this.zzJ == null) {
            this.zzK.zza();
            zzbbg zzf = zzbbj.zzf();
            this.zzJ = zzf;
            this.zzK.zzb("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzad(String str, zzbhp zzbhpVar) {
        zzcep zzcepVar = this.zzn;
        if (zzcepVar != null) {
            zzcepVar.zzz(str, zzbhpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzae() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzaf(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzo = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzag(zzcfx zzcfxVar) {
        this.zzq = zzcfxVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzah(zzaus zzausVar) {
        this.zzE = zzausVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzai(boolean z) {
        this.zzx = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzaj() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzak(Context context) {
        this.zzb.setBaseContext(context);
        this.zzO.zze(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzal(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzw(this.zzn.zzK(), z);
        } else {
            this.zzs = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzam(zzbdi zzbdiVar) {
        this.zzD = zzbdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzan(boolean z) {
        boolean z2 = this.zzu;
        this.zzu = z;
        zzaS();
        if (z != z2) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzO)).booleanValue() || !this.zzq.zzi()) {
                new zzbqf(this, "").zzk(true != z ? CookieSpecs.DEFAULT : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzao(zzbdk zzbdkVar) {
        this.zzC = zzbdkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzap(IObjectWrapper iObjectWrapper) {
        this.zzp = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzaq(int i) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzy(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzar(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzM = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzas(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        int i = this.zzF + (true != z ? -1 : 1);
        this.zzF = i;
        if (i > 0 || (zzlVar = this.zzo) == null) {
            return;
        }
        zzlVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzat(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzz(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzau(String str, zzbhp zzbhpVar) {
        zzcep zzcepVar = this.zzn;
        if (zzcepVar != null) {
            zzcepVar.zzH(str, zzbhpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzav(String str, Predicate predicate) {
        zzcep zzcepVar = this.zzn;
        if (zzcepVar != null) {
            zzcepVar.zzI(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized boolean zzaw() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized boolean zzax() {
        return this.zzF > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final boolean zzay(final boolean z, final int i) {
        destroy();
        this.zzV.zzb(new zzawd() { // from class: com.google.android.gms.internal.ads.zzcey
            @Override // com.google.android.gms.internal.ads.zzawd
            public final void zza(zzaxt zzaxtVar) {
                boolean z2 = z;
                int i2 = i;
                int i3 = zzcfb.zza;
                zzazy zza2 = zzazz.zza();
                if (zza2.zzc() != z2) {
                    zza2.zza(z2);
                }
                zza2.zzb(i2);
                zzaxtVar.zzj((zzazz) zza2.zzal());
            }
        });
        this.zzV.zzc(GamesActivityResultCodes.RESULT_LICENSE_FAILED);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized boolean zzaz() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbkv
    public final void zzb(String str, String str2) {
        zzaO(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbj() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbj();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbk() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized String zzbl() {
        zzeyf zzeyfVar = this.zzk;
        if (zzeyfVar != null) {
            return zzeyfVar.zzb;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized String zzbm() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zzc(zzate zzateVar) {
        synchronized (this) {
            this.zzA = zzateVar.zzj;
        }
        zzaV(zzateVar.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzj(map));
        } catch (JSONException unused) {
            zzbza.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        zzbza.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzaO(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized int zzf() {
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcfj, com.google.android.gms.internal.ads.zzcbj
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcbj
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final zzbbg zzk() {
        return this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzbkv
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcbj
    public final zzbbh zzm() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcfr, com.google.android.gms.internal.ads.zzcbj
    public final zzbzg zzn() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final zzcay zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized zzccu zzp(String str) {
        Map map = this.zzT;
        if (map == null) {
            return null;
        }
        return (zzccu) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcbj
    public final synchronized zzcfe zzq() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final void zzr() {
        zzcep zzcepVar = this.zzn;
        if (zzcepVar != null) {
            zzcepVar.zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final void zzs() {
        zzcep zzcepVar = this.zzn;
        if (zzcepVar != null) {
            zzcepVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcbj
    public final synchronized void zzt(String str, zzccu zzccuVar) {
        if (this.zzT == null) {
            this.zzT = new HashMap();
        }
        this.zzT.put(str, zzccuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzu() {
        com.google.android.gms.ads.internal.overlay.zzl zzL = zzL();
        if (zzL != null) {
            zzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzv(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(FirebaseAnalytics.Param.SUCCESS, true != z ? "0" : "1");
        hashMap.put("duration", Long.toString(j));
        zzd("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized void zzw() {
        zzbdi zzbdiVar = this.zzD;
        if (zzbdiVar != null) {
            final zzdkg zzdkgVar = (zzdkg) zzbdiVar;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdke
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdkg.this.zzd();
                    } catch (RemoteException e) {
                        zzbza.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzy(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzz(boolean z) {
        this.zzn.zzC(false);
    }
}
