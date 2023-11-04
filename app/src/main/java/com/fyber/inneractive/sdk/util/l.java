package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.UByte;

/* loaded from: classes.dex */
public class l {
    public static Application a;

    /* loaded from: classes.dex */
    public static class a {
        public static Map<String, String> a = new HashMap();
    }

    public static Application a() {
        return a;
    }

    public static boolean b(String str) {
        try {
            return a.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int c(int i) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) IAConfigManager.M.v.a().getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return (int) ((i / displayMetrics.density) + 0.5f);
        }
        return i;
    }

    public static int d() {
        int i;
        WindowManager windowManager;
        Display defaultDisplay;
        if (a == null || (windowManager = (WindowManager) IAConfigManager.M.v.a().getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            i = -1;
        } else {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.y;
        }
        if (i == -1) {
            try {
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                if (displayMetrics != null) {
                    i = displayMetrics.heightPixels;
                }
            } catch (Throwable unused) {
            }
            if (i == -1) {
                return 480;
            }
            return i;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e() {
        /*
            r0 = -1
            android.app.Application r1 = com.fyber.inneractive.sdk.util.l.a     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L28
            com.fyber.inneractive.sdk.config.IAConfigManager r1 = com.fyber.inneractive.sdk.config.IAConfigManager.M     // Catch: java.lang.Throwable -> L28
            com.fyber.inneractive.sdk.config.e r1 = r1.v     // Catch: java.lang.Throwable -> L28
            android.content.Context r1 = r1.a()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L28
            android.view.WindowManager r1 = (android.view.WindowManager) r1     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L28
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L28
            android.graphics.Point r2 = new android.graphics.Point     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            r1.getSize(r2)     // Catch: java.lang.Throwable -> L28
            int r1 = r2.x     // Catch: java.lang.Throwable -> L28
            goto L29
        L28:
            r1 = -1
        L29:
            if (r1 != r0) goto L3d
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()     // Catch: java.lang.Throwable -> L38
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L39
            int r1 = r2.widthPixels     // Catch: java.lang.Throwable -> L38
            goto L39
        L38:
        L39:
            if (r1 != r0) goto L3d
            r1 = 320(0x140, float:4.48E-43)
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.l.e():int");
    }

    public static String f() {
        IAConfigManager iAConfigManager;
        int i = 0;
        while (true) {
            iAConfigManager = IAConfigManager.M;
            if (iAConfigManager.y.c.compareAndSet(true, true) || i >= 25) {
                break;
            }
            IAlog.a("UserAgentProvider | waiting on user agent", new Object[0]);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            i++;
        }
        return iAConfigManager.y.a();
    }

    public static int a(int i) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) IAConfigManager.M.v.a().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return Math.round((i * displayMetrics.density) + 0.5f);
    }

    public static int b(int i) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) IAConfigManager.M.v.a().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return (int) ((i * displayMetrics.density) + 0.5f);
    }

    public static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static int c() {
        Application application = a;
        int i = (application == null || application.getResources() == null || application.getResources().getConfiguration() == null) ? 1 : application.getResources().getConfiguration().orientation;
        try {
            if (Settings.System.getInt(application.getContentResolver(), "accelerometer_rotation", 0) != 1) {
                i = 1;
            }
        } catch (Throwable th) {
            IAlog.a("failed getOrientation. returning portrait orientation", th, new Object[0]);
        }
        Object[] objArr = new Object[1];
        objArr[0] = i == 1 ? "portrait" : "landscape";
        IAlog.a("The device orientation: %s", objArr);
        return i;
    }

    public static boolean a(String... strArr) {
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= strArr.length) {
                return true;
            }
            try {
                Class.forName(strArr[i]);
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }

    public static String b(String str, Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            return l$$ExternalSyntheticBackport0.m(str, collection);
        }
        return TextUtils.join(str, collection);
    }

    public static void a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static int a(float f) {
        return (int) (TypedValue.applyDimension(1, f, IAConfigManager.M.v.a().getResources().getDisplayMetrics()) + 0.5f);
    }

    public static String a(String str, Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : collection) {
            arrayList.add(String.valueOf(num));
        }
        return b(str, arrayList);
    }

    public static String b() {
        try {
            return Environment.getExternalStorageState();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b(Context context) {
        if (context != null) {
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                if (signatureArr.length > 0) {
                    Signature signature = signatureArr[0];
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(signature.toByteArray());
                    byte[] digest = messageDigest.digest();
                    StringBuilder sb = new StringBuilder();
                    for (byte b : digest) {
                        String hexString = Integer.toHexString(b & UByte.MAX_VALUE);
                        if (hexString.length() == 1) {
                            sb.append("0");
                        }
                        sb.append(hexString);
                    }
                    return sb.toString();
                }
                return "";
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    public static boolean a(String str, Context context, byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = context.openFileOutput(str, 0);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                return true;
            } catch (Throwable unused) {
                try {
                    IAlog.a("writeFileWithContext failed writing %s", str);
                    q.a(fileOutputStream);
                    return false;
                } finally {
                    q.a(fileOutputStream);
                }
            }
        } catch (Throwable unused2) {
            fileOutputStream = null;
        }
    }

    public static Drawable d(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return IAConfigManager.M.v.a().getDrawable(i);
        }
        return IAConfigManager.M.v.a().getResources().getDrawable(i);
    }

    public static String c(String str) {
        String str2 = (String) ((HashMap) a.a).get(str);
        if (TextUtils.isEmpty(str2)) {
            IAlog.a("Assets cache: reading file: %s", str);
            try {
                InputStream open = a.getAssets().open(str, 3);
                StringBuffer stringBuffer = new StringBuffer();
                byte[] bArr = new byte[4096];
                for (int i = 0; i != -1; i = open.read(bArr)) {
                    stringBuffer.append(new String(bArr, 0, i));
                }
                open.close();
                str2 = stringBuffer.toString();
                IAlog.a("Assets cache: success - %s", str);
            } catch (IOException e) {
                IAlog.a("Assets cache: Could not read response from file", new Object[0]);
                IAlog.d(q.b(e), new Object[0]);
            }
            if (!TextUtils.isEmpty(str2)) {
                ((HashMap) a.a).put(str, str2);
            }
        } else {
            IAlog.a("Assets cache: returning cached assets for %s", str);
        }
        return str2;
    }

    public static void a(View view, int i, int i2) {
        if (view == null || view.getLayoutParams() == null) {
            return;
        }
        view.getLayoutParams().width = b(i);
        view.getLayoutParams().height = b(i2);
    }

    public static int a(Context context) {
        Window window;
        Rect rect = new Rect();
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null) {
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
        }
        return rect.top;
    }

    public static int a(Context context, int i) {
        Window window;
        View findViewById = (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null) ? null : window.findViewById(16908290);
        if (findViewById != null) {
            return findViewById.getTop() - i;
        }
        return 0;
    }
}
