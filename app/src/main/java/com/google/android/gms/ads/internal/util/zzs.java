package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbub;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzdmt;
import com.google.android.gms.internal.ads.zzeyc;
import com.google.android.gms.internal.ads.zzeyf;
import com.google.android.gms.internal.ads.zzfkr;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfut;
import com.google.android.gms.internal.ads.zzgxm;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzs {
    public static final zzfkr zza = new zzf(Looper.getMainLooper());
    private String zzf;
    private final AtomicReference zzb = new AtomicReference(null);
    private final AtomicReference zzc = new AtomicReference(null);
    private boolean zzd = true;
    private final Object zze = new Object();
    private boolean zzg = false;
    private boolean zzh = false;
    private final Executor zzi = Executors.newSingleThreadExecutor();

    public static final boolean zzA(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zzbza.zzh("Error loading class.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzB() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public static final boolean zzC(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzD(Context context) {
        Bundle zzV = zzV(context);
        return TextUtils.isEmpty(zzW(zzV)) && !TextUtils.isEmpty(zzV.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static final boolean zzE(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzF(View view, int i, MotionEvent motionEvent) {
        String str;
        int i2;
        int i3;
        int i4;
        String str2;
        zzeyc zzD;
        zzeyf zzP;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof zzdmt) {
                view2 = ((zzdmt) view2).getChildAt(0);
            }
            if ((view2 instanceof com.google.android.gms.ads.formats.zzg) || (view2 instanceof NativeAdView)) {
                str = "NATIVE";
                i2 = 1;
            } else {
                str = "UNKNOWN";
                i2 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i4 = rect.width();
                i3 = rect.height();
            } else {
                i3 = 0;
                i4 = 0;
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            long zzs = zzs(view2);
            view2.getLocationOnScreen(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            String str3 = "none";
            if (!(view2 instanceof zzcff) || (zzP = ((zzcff) view2).zzP()) == null) {
                str2 = "none";
            } else {
                str2 = zzP.zzb;
                int hashCode = view2.hashCode();
                view2.setContentDescription(str2 + ":" + hashCode);
            }
            if ((view2 instanceof zzcdz) && (zzD = ((zzcdz) view2).zzD()) != null) {
                str = zzeyc.zza(zzD.zzb);
                i2 = zzD.zzf;
                str3 = zzD.zzF;
            }
            zzbza.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i4), Integer.valueOf(i3), Long.valueOf(zzs), Integer.toString(i, 2)));
        } catch (Exception e) {
            zzbza.zzh("Failure getting view location.", e);
        }
    }

    public static final AlertDialog.Builder zzG(Context context) {
        return new AlertDialog.Builder(context, com.google.android.gms.ads.internal.zzt.zzq().zza());
    }

    public static final void zzH(Context context, String str, String str2) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(str2);
        for (String str3 : arrayList) {
            new zzby(context, str, str3).zzb();
        }
    }

    public static final void zzI(Context context, Throwable th) {
        if (context != null) {
            try {
                if (((Boolean) zzbct.zzb.zze()).booleanValue()) {
                    CrashUtils.addDynamiteErrorToDropBox(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final String zzJ(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    public static final int zzK(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            zzbza.zzj("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    public static final Map zzL(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static final WebResourceResponse zzM(HttpURLConnection httpURLConnection) throws IOException {
        com.google.android.gms.ads.internal.zzt.zzp();
        String contentType = httpURLConnection.getContentType();
        String str = "";
        String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
        com.google.android.gms.ads.internal.zzt.zzp();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        String str2 = str;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && !entry.getValue().isEmpty()) {
                hashMap.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return com.google.android.gms.ads.internal.zzt.zzq().zzc(trim, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    public static final int[] zzN(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(16908290)) == null) ? zzr() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final int[] zzO(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] zzr = (window == null || (findViewById = window.findViewById(16908290)) == null) ? zzr() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, zzr[0]), com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, zzr[1])};
    }

    public static final boolean zzP(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = com.google.android.gms.ads.internal.zzt.zzp().zzd || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzl(view);
        long zzs = zzs(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbe)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziW)).booleanValue()) {
                    return true;
                }
                if (zzs >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziY)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void zzQ(Context context, Intent intent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjo)).booleanValue()) {
            try {
                zzY(context, intent);
                return;
            } catch (SecurityException e) {
                zzbza.zzk("", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdUtil.startActivityWithUnknownContext");
                return;
            }
        }
        zzY(context, intent);
    }

    public static final void zzR(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzm(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            zzbza.zze("Opening " + uri2 + " in a new browser.");
        } catch (ActivityNotFoundException e) {
            zzbza.zzh("No browser is found.", e);
        }
    }

    public static final int[] zzS(Activity activity) {
        int[] zzN = zzN(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, zzN[0]), com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, zzN[1])};
    }

    public static final boolean zzT(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzP(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzU(context));
    }

    private static KeyguardManager zzU(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static Bundle zzV(Context context) {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zze.zzb("Error getting metadata", e);
            return null;
        }
    }

    private static String zzW(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return TextUtils.isEmpty(string) ? "" : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    private static boolean zzX(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static final void zzY(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(DriveFile.MODE_READ_ONLY);
            context.startActivity(intent);
        }
    }

    public static int zza(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i > 0) {
            zzbza.zzj("HTTP timeout too low: " + i + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
            return 60000;
        }
        return 60000;
    }

    public static void zzf(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzbzn.zza.execute(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzl(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.zzl(android.view.View):boolean");
    }

    public static final void zzm(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder(CustomTabsIntent.EXTRA_SESSION, null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String zzn(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzW(zzV(context));
    }

    static final String zzo() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String zzp() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    public static final DisplayMetrics zzq(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    protected static final int[] zzr() {
        return new int[]{0, 0};
    }

    public static final long zzs(View view) {
        int i;
        float f = Float.MAX_VALUE;
        ViewParent viewParent = view;
        do {
            if (!(viewParent instanceof View)) {
                break;
            }
            View view2 = viewParent;
            f = Math.min(f, view2.getAlpha());
            i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            viewParent = view2.getParent();
        } while (i > 0);
        return Math.round((f >= 0.0f ? f : 0.0f) * 100.0f);
    }

    public static final WebResourceResponse zzt(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbo(context).zzb(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            zzbza.zzk("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    public static final String zzu() {
        Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        return zzd != null ? zzd.getString(R.string.s7) : "Test Ad";
    }

    public static final zzbr zzv(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzbza.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof zzbr ? (zzbr) queryLocalInterface : new zzbp(iBinder);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzw(Context context, String str) {
        Context zza2 = zzbub.zza(context);
        return Wrappers.packageManager(zza2).checkPermission(str, zza2.getPackageName()) == 0;
    }

    public static final boolean zzx(Context context) {
        try {
            return DeviceProperties.isBstar(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzy(String str) {
        if (zzbyz.zzl()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzey)).booleanValue()) {
                String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeA);
                if (!str2.isEmpty()) {
                    for (String str3 : str2.split(";")) {
                        if (str3.equals(str)) {
                            return false;
                        }
                    }
                }
                String str4 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzez);
                if (str4.isEmpty()) {
                    return true;
                }
                for (String str5 : str4.split(";")) {
                    if (str5.equals(str)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean zzz(Context context) {
        KeyguardManager zzU;
        return (context == null || (zzU = zzU(context)) == null || !zzU.isKeyguardLocked()) ? false : true;
    }

    public final zzfut zzb(final Uri uri) {
        return zzfuj.zzj(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Uri uri2 = uri;
                zzfkr zzfkrVar = zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzp();
                return zzs.zzL(uri2);
            }
        }, this.zzi);
    }

    public final String zzc(final Context context, String str) {
        String str2;
        synchronized (this.zze) {
            String str3 = this.zzf;
            if (str3 != null) {
                return str3;
            }
            if (str != null) {
                try {
                    zzce zza2 = zzce.zza();
                    if (TextUtils.isEmpty(zza2.zza)) {
                        if (ClientLibraryUtils.isPackageSide()) {
                            str2 = (String) zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcc
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    Context context2 = context;
                                    SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                    String string = sharedPreferences.getString("user_agent", "");
                                    if (TextUtils.isEmpty(string)) {
                                        zze.zza("User agent is not initialized on Google Play Services. Initializing.");
                                        String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                                        SharedPreferencesUtils.publishWorldReadableSharedPreferences(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                                        return defaultUserAgent;
                                    }
                                    zze.zza("User agent is already initialized on Google Play Services.");
                                    return string;
                                }
                            });
                        } else {
                            final Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                            str2 = (String) zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcd
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    SharedPreferences sharedPreferences;
                                    Context context2 = remoteContext;
                                    Context context3 = context;
                                    boolean z = false;
                                    if (context2 != null) {
                                        zze.zza("Attempting to read user agent from Google Play Services.");
                                        sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                    } else {
                                        zze.zza("Attempting to read user agent from local cache.");
                                        sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                        z = true;
                                    }
                                    String string = sharedPreferences.getString("user_agent", "");
                                    if (TextUtils.isEmpty(string)) {
                                        zze.zza("Reading user agent from WebSettings");
                                        string = WebSettings.getDefaultUserAgent(context3);
                                        if (z) {
                                            sharedPreferences.edit().putString("user_agent", string).apply();
                                            zze.zza("Persisting user agent.");
                                        }
                                    }
                                    return string;
                                }
                            });
                        }
                        zza2.zza = str2;
                    }
                    this.zzf = zza2.zza;
                } catch (Exception unused) {
                }
                if (TextUtils.isEmpty(this.zzf)) {
                    this.zzf = WebSettings.getDefaultUserAgent(context);
                }
                if (TextUtils.isEmpty(this.zzf)) {
                    this.zzf = zzo();
                }
                this.zzf = this.zzf + " (Mobile; " + str;
                try {
                    if (Wrappers.packageManager(context).isCallerInstantApp()) {
                        this.zzf = this.zzf + ";aia";
                    }
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdUtil.getUserAgent");
                }
                String str4 = this.zzf + ")";
                this.zzf = str4;
                return str4;
            }
            return zzo();
        }
    }

    public final void zze(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int zza2 = zza(i);
        zzbza.zzi("HTTP timeout: " + zza2 + " milliseconds.");
        httpURLConnection.setConnectTimeout(zza2);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(zza2);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zzc(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final boolean zzg(String str) {
        return zzX(str, this.zzb, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzZ));
    }

    public final boolean zzh(String str) {
        return zzX(str, this.zzc, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaa));
    }

    public final boolean zzi(Context context) {
        if (this.zzh) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbar.zzc(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjn)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzp(this, null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzp(this, null), intentFilter, 4);
        }
        this.zzh = true;
        return true;
    }

    public final boolean zzj(Context context) {
        if (this.zzg) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbar.zzc(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjn)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzr(this, null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzr(this, null), intentFilter, 4);
        }
        this.zzg = true;
        return true;
    }

    public final int zzk(Context context, Uri uri) {
        int i;
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (context instanceof Activity) {
            i = 0;
        } else {
            zze.zza("Chrome Custom Tabs can only work with Activity context.");
            i = 2;
        }
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzee)).equals(com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzef))) {
            i = 9;
        }
        if (i != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(DriveFile.MODE_READ_ONLY);
            context.startActivity(intent);
            return i;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzee)).booleanValue()) {
            zzbbs zzbbsVar = new zzbbs();
            zzbbsVar.zze(new zzn(this, zzbbsVar, context, uri));
            zzbbsVar.zzb((Activity) context);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzef)).booleanValue()) {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setPackage(zzgxm.zza(context));
            build.launchUrl(context, uri);
            return 5;
        }
        return 5;
    }
}
