package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcnc implements zzbly {
    private final Context zza;
    private final zzatb zzb;
    private final PowerManager zzc;

    public zzcnc(Context context, zzatb zzatbVar) {
        this.zza = context;
        this.zzb = zzatbVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    /* renamed from: zza */
    public final JSONObject zzb(zzcnf zzcnfVar) throws JSONException {
        boolean isScreenOn;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzate zzateVar = zzcnfVar.zzf;
        if (zzateVar == null) {
            jSONObject = new JSONObject();
        } else if (this.zzb.zzd() != null) {
            boolean z = zzateVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcnfVar.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false);
            boolean z2 = zzcnfVar.zzc;
            JSONObject put2 = put.put("isStopped", false).put("isPaused", zzcnfVar.zzb).put("isNative", this.zzb.zze());
            if (Build.VERSION.SDK_INT >= 20) {
                isScreenOn = this.zzc.isInteractive();
            } else {
                isScreenOn = this.zzc.isScreenOn();
            }
            put2.put("isScreenOn", isScreenOn).put("appMuted", com.google.android.gms.ads.internal.zzt.zzr().zze()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzr().zza()).put("deviceVolume", com.google.android.gms.ads.internal.util.zzab.zzb(this.zza.getApplicationContext()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfl)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.zza.getApplicationContext().getSystemService("audio");
                Integer valueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (valueOf != null) {
                    jSONObject3.put("audioMode", valueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzateVar.zzb).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", zzateVar.zzc.top).put("bottom", zzateVar.zzc.bottom).put("left", zzateVar.zzc.left).put("right", zzateVar.zzc.right)).put("adBox", new JSONObject().put("top", zzateVar.zzd.top).put("bottom", zzateVar.zzd.bottom).put("left", zzateVar.zzd.left).put("right", zzateVar.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzateVar.zze.top).put("bottom", zzateVar.zze.bottom).put("left", zzateVar.zze.left).put("right", zzateVar.zze.right)).put("globalVisibleBoxVisible", zzateVar.zzf).put("localVisibleBox", new JSONObject().put("top", zzateVar.zzg.top).put("bottom", zzateVar.zzg.bottom).put("left", zzateVar.zzg.left).put("right", zzateVar.zzg.right)).put("localVisibleBoxVisible", zzateVar.zzh).put("hitBox", new JSONObject().put("top", zzateVar.zzi.top).put("bottom", zzateVar.zzi.bottom).put("left", zzateVar.zzi.left).put("right", zzateVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcnfVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbi)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzateVar.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcnfVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
