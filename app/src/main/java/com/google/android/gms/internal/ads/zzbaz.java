package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class zzbaz {
    String zzd;
    Context zze;
    String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    final BlockingQueue zza = new ArrayBlockingQueue(100);
    final LinkedHashMap zzb = new LinkedHashMap();
    final Map zzc = new HashMap();
    private final HashSet zzg = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void zzc(zzbaz zzbazVar) {
        while (true) {
            try {
                zzbbj zzbbjVar = (zzbbj) zzbazVar.zza.take();
                zzbbi zza = zzbbjVar.zza();
                if (!TextUtils.isEmpty(zza.zzb())) {
                    zzbazVar.zzg(zzbazVar.zzb(zzbazVar.zzb, zzbbjVar.zzb()), zza);
                }
            } catch (InterruptedException e) {
                zzbza.zzk("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    private final void zzg(Map map, zzbbi zzbbiVar) {
        Uri.Builder buildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (zzbbiVar != null) {
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty(zzbbiVar.zzb())) {
                sb.append("&it=");
                sb.append(zzbbiVar.zzb());
            }
            if (!TextUtils.isEmpty(zzbbiVar.zza())) {
                sb.append("&blat=");
                sb.append(zzbbiVar.zza());
            }
            uri = sb.toString();
        }
        if (!this.zzh.get()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzH(this.zze, this.zzf, uri);
            return;
        }
        File file = this.zzi;
        if (file != null) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                    try {
                        fileOutputStream2.write(uri.getBytes());
                        fileOutputStream2.write(10);
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e) {
                            zzbza.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        zzbza.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e3) {
                                zzbza.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                zzbza.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } else {
            zzbza.zzj("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
        }
    }

    public final zzbbf zza(String str) {
        zzbbf zzbbfVar = (zzbbf) this.zzc.get(str);
        return zzbbfVar != null ? zzbbfVar : zzbbf.zza;
    }

    final Map zzb(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, zza(str).zza(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    public final void zzd(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbcf.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzbzn.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbay
            @Override // java.lang.Runnable
            public final void run() {
                zzbaz.zzc(zzbaz.this);
            }
        });
        this.zzc.put("action", zzbbf.zzb);
        this.zzc.put(FirebaseAnalytics.Param.AD_FORMAT, zzbbf.zzb);
        this.zzc.put("e", zzbbf.zzc);
    }

    public final void zze(String str) {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzb(this.zzb, linkedHashMap), null);
    }

    public final boolean zzf(zzbbj zzbbjVar) {
        return this.zza.offer(zzbbjVar);
    }
}
