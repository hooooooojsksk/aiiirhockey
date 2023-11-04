package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbvw implements zzbwb {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzgul zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbvy zzi;
    private final zzbvx zzn;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbvw(Context context, zzbzg zzbzgVar, zzbvy zzbvyVar, String str, zzbvx zzbvxVar, byte[] bArr) {
        Preconditions.checkNotNull(zzbvyVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzbvxVar;
        this.zzi = zzbvyVar;
        for (String str2 : zzbvyVar.zze) {
            this.zzk.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzgul zza = zzgvu.zza();
        zza.zzn(9);
        zza.zzj(str);
        zza.zzh(str);
        zzgum zza2 = zzgun.zza();
        String str3 = this.zzi.zza;
        if (str3 != null) {
            zza2.zza(str3);
        }
        zza.zzg((zzgun) zza2.zzal());
        zzgvp zza3 = zzgvq.zza();
        zza3.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str4 = zzbzgVar.zza;
        if (str4 != null) {
            zza3.zza(str4);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zza3.zzb(apkVersion);
        }
        zza.zzf((zzgvq) zza3.zzal());
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbwb
    public final zzbvy zza() {
        return this.zzi;
    }

    public final /* synthetic */ zzfut zzb(Map map) throws Exception {
        zzgvn zzgvnVar;
        zzfut zzl;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzgvnVar = (zzgvn) this.zze.get(str);
                            }
                            if (zzgvnVar == null) {
                                zzbwa.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i = 0; i < length; i++) {
                                    zzgvnVar.zza(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbcs.zzb.zze()).booleanValue()) {
                    zzbza.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return zzfuj.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if ((!z || !this.zzi.zzg) && ((!this.zzm || !this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzfuj.zzh(null);
        }
        synchronized (this.zzj) {
            for (zzgvn zzgvnVar2 : this.zze.values()) {
                this.zzd.zzc((zzgvo) zzgvnVar2.zzal());
            }
            this.zzd.zza(this.zzf);
            this.zzd.zzb(this.zzg);
            if (zzbwa.zzb()) {
                String zzl2 = this.zzd.zzl();
                String zzk = this.zzd.zzk();
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + zzl2 + "\n  clickUrl: " + zzk + "\n  resources: \n");
                for (zzgvo zzgvoVar : this.zzd.zzm()) {
                    sb.append("    [");
                    sb.append(zzgvoVar.zza());
                    sb.append("] ");
                    sb.append(zzgvoVar.zze());
                }
                zzbwa.zza(sb.toString());
            }
            zzfut zzb2 = new com.google.android.gms.ads.internal.util.zzbo(this.zzh).zzb(1, this.zzi.zzb, null, ((zzgvu) this.zzd.zzal()).zzax());
            if (zzbwa.zzb()) {
                zzb2.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbvr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbwa.zza("Pinged SB successfully.");
                    }
                }, zzbzn.zza);
            }
            zzl = zzfuj.zzl(zzb2, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzbvs
                @Override // com.google.android.gms.internal.ads.zzfnj
                public final Object apply(Object obj) {
                    String str2 = (String) obj;
                    int i2 = zzbvw.zzb;
                    return null;
                }
            }, zzbzn.zzf);
        }
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbwb
    public final void zzd(String str, Map map, int i) {
        int zza;
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i == 3 && (zza = zzgvm.zza(3)) != 0) {
                    ((zzgvn) this.zze.get(str)).zze(zza);
                }
                return;
            }
            zzgvn zzc2 = zzgvo.zzc();
            int zza2 = zzgvm.zza(i);
            if (zza2 != 0) {
                zzc2.zze(zza2);
            }
            zzc2.zzb(this.zze.size());
            zzc2.zzd(str);
            zzguy zza3 = zzgvb.zza();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzguw zza4 = zzgux.zza();
                        zza4.zza(zzgpe.zzx(str2));
                        zza4.zzb(zzgpe.zzx(str3));
                        zza3.zza((zzgux) zza4.zzal());
                    }
                }
            }
            zzc2.zzc((zzgvb) zza3.zzal());
            this.zze.put(str, zzc2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwb
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            zzfut zzm = zzfuj.zzm(zzfuj.zzh(Collections.emptyMap()), new zzftq() { // from class: com.google.android.gms.internal.ads.zzbvt
                @Override // com.google.android.gms.internal.ads.zzftq
                public final zzfut zza(Object obj) {
                    return zzbvw.this.zzb((Map) obj);
                }
            }, zzbzn.zzf);
            zzfut zzn = zzfuj.zzn(zzm, 10L, TimeUnit.SECONDS, zzbzn.zzd);
            zzfuj.zzq(zzm, new zzbvv(this, zzn), zzbzn.zzf);
            zzc.add(zzn);
        }
    }

    public final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgpb zzt = zzgpe.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzgul zzgulVar = this.zzd;
            zzgvg zza = zzgvi.zza();
            zza.zza(zzt.zzb());
            zza.zzb("image/png");
            zza.zzc(2);
            zzgulVar.zzi((zzgvi) zza.zzal());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbwb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbvy r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r7.zzl
            if (r0 == 0) goto Lc
            return
        Lc:
            com.google.android.gms.ads.internal.zzt.zzp()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6d
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r3 == 0) goto L26
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L27
        L26:
            r3 = r1
        L27:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2b
            goto L34
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r3 = r1
        L2f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.internal.ads.zzbza.zzh(r4, r2)
        L34:
            if (r3 != 0) goto L6c
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            if (r2 == 0) goto L5f
            if (r3 != 0) goto L43
            goto L5f
        L43:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L65
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L65
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L65
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L65
            r1 = r4
            goto L6d
        L5f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.internal.ads.zzbza.zzj(r8)     // Catch: java.lang.RuntimeException -> L65
            goto L6d
        L65:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.internal.ads.zzbza.zzh(r2, r8)
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r1 != 0) goto L75
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbwa.zza(r8)
            return
        L75:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbvu r8 = new com.google.android.gms.internal.ads.zzbvu
            r8.<init>()
            com.google.android.gms.ads.internal.util.zzs.zzf(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvw.zzg(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbwb
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwb
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
