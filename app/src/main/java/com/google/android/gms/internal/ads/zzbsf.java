package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbsf implements zzbsh {
    static zzbsh zza;
    static zzbsh zzb;
    private static final Object zzc = new Object();
    private final Context zze;
    private final ExecutorService zzg;
    private final zzbzg zzh;
    private final Object zzd = new Object();
    private final WeakHashMap zzf = new WeakHashMap();

    protected zzbsf(Context context, zzbzg zzbzgVar) {
        zzfkq.zza();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zze = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzh = zzbzgVar;
    }

    public static zzbsh zza(Context context) {
        synchronized (zzc) {
            if (zza == null) {
                if (((Boolean) zzbct.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhf)).booleanValue()) {
                        zza = new zzbsf(context, zzbzg.zza());
                    }
                }
                zza = new zzbsg();
            }
        }
        return zza;
    }

    public static zzbsh zzb(Context context, zzbzg zzbzgVar) {
        synchronized (zzc) {
            if (zzb == null) {
                if (((Boolean) zzbct.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhf)).booleanValue()) {
                        zzbsf zzbsfVar = new zzbsf(context, zzbzgVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzbsfVar.zzd) {
                                zzbsfVar.zzf.put(thread, true);
                            }
                            thread.setUncaughtExceptionHandler(new zzbse(zzbsfVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzbsd(zzbsfVar, Thread.getDefaultUncaughtExceptionHandler()));
                        zzb = zzbsfVar;
                    }
                }
                zzb = new zzbsg();
            }
        }
        return zzb;
    }

    public static String zzc(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzd(Throwable th) {
        return zzfoj.zzc(zzbyt.zzf(zzc(th)));
    }

    public final void zze(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= zzbyt.zzp(stackTraceElement.getClassName());
                    z2 |= getClass().getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z || z2) {
                return;
            }
            zzg(th, "", 1.0f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzf(Throwable th, String str) {
        zzg(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzg(Throwable th, String str, float f) {
        boolean z;
        String str2;
        if (zzbyt.zzg(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        String zzc2 = zzc(th);
        String zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzib)).booleanValue() ? zzd(th) : "";
        double d = f;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        double random = Math.random();
        int i2 = i > 0 ? (int) (1.0f / f) : 1;
        if (random < d) {
            ArrayList<String> arrayList = new ArrayList();
            try {
                z = Wrappers.packageManager(this.zze).isCallerInstantApp();
            } catch (Throwable th2) {
                zzbza.zzh("Error fetching instant app info", th2);
                z = false;
            }
            try {
                str2 = this.zze.getPackageName();
            } catch (Throwable unused) {
                zzbza.zzj("Cannot obtain package name, proceeding.");
                str2 = EnvironmentCompat.MEDIA_UNKNOWN;
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter(FacebookMediationAdapter.KEY_ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str3 = Build.MANUFACTURER;
            String str4 = Build.MODEL;
            if (!str4.startsWith(str3)) {
                str4 = str3 + " " + str4;
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.zzh.zza).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zzc2).appendQueryParameter("eids", TextUtils.join(",", zzbar.zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "513548808").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i2)).appendQueryParameter("pb_tm", String.valueOf(zzbct.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze))).appendQueryParameter("lite", true != this.zzh.zze ? "0" : "1");
            if (!TextUtils.isEmpty(zzd)) {
                appendQueryParameter2.appendQueryParameter("hash", zzd);
            }
            arrayList.add(appendQueryParameter2.toString());
            for (final String str5 : arrayList) {
                final zzbzf zzbzfVar = new zzbzf(null);
                this.zzg.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbzf.this.zza(str5);
                    }
                });
            }
        }
    }
}
