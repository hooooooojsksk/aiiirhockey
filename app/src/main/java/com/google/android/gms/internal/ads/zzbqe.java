package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbqe extends zzbqf implements zzbhp {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcei zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbab zzk;
    private float zzl;
    private int zzm;

    public zzbqe(zzcei zzceiVar, Context context, zzbab zzbabVar) {
        super(zzceiVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzceiVar;
        this.zzi = context;
        this.zzk = zzbabVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* synthetic */ void zza(Object obj, Map map) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        JSONObject jSONObject;
        zzcei zzceiVar = (zzcei) obj;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = zzbyt.zzw(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = zzbyt.zzw(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzi = this.zzh.zzi();
        if (zzi == null || zzi.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzt.zzp();
            int[] zzN = com.google.android.gms.ads.internal.util.zzs.zzN(zzi);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            this.zzd = zzbyt.zzw(this.zza, zzN[0]);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            this.zze = zzbyt.zzw(this.zza, zzN[1]);
        }
        if (this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzi(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbqd zzbqdVar = new zzbqd();
        zzbab zzbabVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbqdVar.zze(zzbabVar.zza(intent));
        zzbab zzbabVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbqdVar.zzc(zzbabVar2.zza(intent2));
        zzbqdVar.zza(this.zzk.zzb());
        zzbqdVar.zzd(this.zzk.zzc());
        zzbqdVar.zzb(true);
        z = zzbqdVar.zza;
        z2 = zzbqdVar.zzb;
        z3 = zzbqdVar.zzc;
        z4 = zzbqdVar.zzd;
        z5 = zzbqdVar.zze;
        zzcei zzceiVar2 = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", z4).put("inlineVideo", z5);
        } catch (JSONException e) {
            zzbza.zzh("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        zzceiVar2.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, iArr[0]), com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, iArr[1]));
        if (com.google.android.gms.ads.internal.util.zze.zzm(2)) {
            zzbza.zzi("Dispatching Ready Event.");
        }
        zzh(this.zzh.zzn().zza);
    }

    public final void zzb(int i, int i2) {
        int i3;
        int i4 = 0;
        if (this.zzi instanceof Activity) {
            com.google.android.gms.ads.internal.zzt.zzp();
            i3 = com.google.android.gms.ads.internal.util.zzs.zzO((Activity) this.zzi)[0];
        } else {
            i3 = 0;
        }
        if (this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            int width = this.zzh.getWidth();
            int height = this.zzh.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzP)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzO() != null ? this.zzh.zzO().zzb : 0;
                }
                if (height == 0) {
                    if (this.zzh.zzO() != null) {
                        i4 = this.zzh.zzO().zza;
                    }
                    this.zzf = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, width);
                    this.zzg = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, i4);
                }
            }
            i4 = height;
            this.zzf = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, width);
            this.zzg = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, i4);
        }
        zzf(i, i2 - i3, this.zzf, this.zzg);
        this.zzh.zzN().zzB(i, i2);
    }
}
