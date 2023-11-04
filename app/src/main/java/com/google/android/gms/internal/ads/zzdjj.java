package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.games.GamesStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdjj {
    private final Context zza;
    private final zzdis zzb;
    private final zzapw zzc;
    private final zzbzg zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzawe zzf;
    private final Executor zzg;
    private final zzbdl zzh;
    private final zzdkb zzi;
    private final zzdmq zzj;
    private final ScheduledExecutorService zzk;
    private final zzdll zzl;
    private final zzdpi zzm;
    private final zzfdk zzn;
    private final zzfff zzo;
    private final zzeaf zzp;

    public zzdjj(Context context, zzdis zzdisVar, zzapw zzapwVar, zzbzg zzbzgVar, com.google.android.gms.ads.internal.zza zzaVar, zzawe zzaweVar, Executor executor, zzeyx zzeyxVar, zzdkb zzdkbVar, zzdmq zzdmqVar, ScheduledExecutorService scheduledExecutorService, zzdpi zzdpiVar, zzfdk zzfdkVar, zzfff zzfffVar, zzeaf zzeafVar, zzdll zzdllVar) {
        this.zza = context;
        this.zzb = zzdisVar;
        this.zzc = zzapwVar;
        this.zzd = zzbzgVar;
        this.zze = zzaVar;
        this.zzf = zzaweVar;
        this.zzg = executor;
        this.zzh = zzeyxVar.zzi;
        this.zzi = zzdkbVar;
        this.zzj = zzdmqVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdpiVar;
        this.zzn = zzfdkVar;
        this.zzo = zzfffVar;
        this.zzp = zzeafVar;
        this.zzl = zzdllVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzel zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfqk.zzo();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfqk.zzo();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzel zzr = zzr(optJSONArray.optJSONObject(i));
            if (zzr != null) {
                arrayList.add(zzr);
            }
        }
        return zzfqk.zzm(arrayList);
    }

    private static zzfut zzl(zzfut zzfutVar, Object obj) {
        return zzfuj.zzf(zzfutVar, Exception.class, new zzftq(null) { // from class: com.google.android.gms.internal.ads.zzdjg
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj2) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj2);
                return zzfuj.zzh(null);
            }
        }, zzbzn.zzf);
    }

    private static zzfut zzm(boolean z, final zzfut zzfutVar, Object obj) {
        if (z) {
            return zzfuj.zzm(zzfutVar, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdje
                @Override // com.google.android.gms.internal.ads.zzftq
                public final zzfut zza(Object obj2) {
                    return obj2 != null ? zzfut.this : zzfuj.zzg(new zzeek(1, "Retrieve required value in native ad response failed."));
                }
            }, zzbzn.zzf);
        }
        return zzl(zzfutVar, null);
    }

    private final zzfut zzn(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzfuj.zzh(null);
        }
        final String optString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(optString)) {
            return zzfuj.zzh(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzfuj.zzh(new zzbdj(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzfuj.zzl(this.zzb.zzb(optString, optDouble, optBoolean), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdjh
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                String str = optString;
                return new zzbdj(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), optDouble, optInt, optInt2);
            }
        }, this.zzg), null);
    }

    private final zzfut zzo(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzfuj.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z));
        }
        return zzfuj.zzl(zzfuj.zzd(arrayList), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdjf
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzbdj zzbdjVar : (List) obj) {
                    if (zzbdjVar != null) {
                        arrayList2.add(zzbdjVar);
                    }
                }
                return arrayList2;
            }
        }, this.zzg);
    }

    private final zzfut zzp(JSONObject jSONObject, zzeyc zzeycVar, zzeyf zzeyfVar) {
        final zzfut zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzeycVar, zzeyfVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzfuj.zzm(zzb, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdji
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                zzfut zzfutVar = zzfut.this;
                zzcei zzceiVar = (zzcei) obj;
                if (zzceiVar == null || zzceiVar.zzq() == null) {
                    throw new zzeek(1, "Retrieve video view in html5 ad response failed.");
                }
                return zzfutVar;
            }
        }, zzbzn.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final com.google.android.gms.ads.internal.client.zzel zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzel(optString, optString2);
    }

    public final /* synthetic */ zzbdg zza(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzq = zzq(jSONObject, "bg_color");
        Integer zzq2 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbdg(optString, list, zzq, zzq2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND) + optInt2, this.zzh.zze, optBoolean);
    }

    public final /* synthetic */ zzfut zzb(com.google.android.gms.ads.internal.client.zzq zzqVar, zzeyc zzeycVar, zzeyf zzeyfVar, String str, String str2, Object obj) throws Exception {
        zzcei zza = this.zzj.zza(zzqVar, zzeycVar, zzeyfVar);
        final zzbzr zza2 = zzbzr.zza(zza);
        zzdli zzb = this.zzl.zzb();
        zza.zzN().zzM(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzp, this.zzo, this.zzm, this.zzn, null, zzb, null, null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdo)).booleanValue()) {
            zza.zzad("/getNativeAdViewSignals", zzbho.zzs);
        }
        zza.zzad("/getNativeClickMeta", zzbho.zzt);
        zza.zzN().zzA(new zzcft() { // from class: com.google.android.gms.internal.ads.zzdjd
            @Override // com.google.android.gms.internal.ads.zzcft
            public final void zza(boolean z) {
                zzbzr zzbzrVar = zzbzr.this;
                if (z) {
                    zzbzrVar.zzb();
                } else {
                    zzbzrVar.zze(new zzeek(1, "Image Web View failed to load."));
                }
            }
        });
        zza.zzab(str, str2, null);
        return zza2;
    }

    public final /* synthetic */ zzfut zzc(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcei zza = zzceu.zza(this.zza, zzcfx.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null);
        final zzbzr zza2 = zzbzr.zza(zza);
        zza.zzN().zzA(new zzcft() { // from class: com.google.android.gms.internal.ads.zzdiz
            @Override // com.google.android.gms.internal.ads.zzcft
            public final void zza(boolean z) {
                zzbzr.this.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeF)).booleanValue()) {
            zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza.loadData(str, "text/html", "UTF-8");
        }
        return zza2;
    }

    public final zzfut zzd(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzfuj.zzh(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzfuj.zzl(zzo(optJSONArray, false, true), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdja
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                return zzdjj.this.zza(optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final zzfut zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final zzfut zzf(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        zzbdl zzbdlVar = this.zzh;
        return zzo(optJSONArray, zzbdlVar.zzb, zzbdlVar.zzd);
    }

    public final zzfut zzg(JSONObject jSONObject, String str, final zzeyc zzeycVar, final zzeyf zzeyfVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziT)).booleanValue()) {
            return zzfuj.zzh(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfuj.zzh(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzfuj.zzh(null);
        }
        final String optString = optJSONObject.optString("base_url");
        final String optString2 = optJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzq zzk = zzk(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (!TextUtils.isEmpty(optString2)) {
            final zzfut zzm = zzfuj.zzm(zzfuj.zzh(null), new zzftq() { // from class: com.google.android.gms.internal.ads.zzdjb
                @Override // com.google.android.gms.internal.ads.zzftq
                public final zzfut zza(Object obj) {
                    return zzdjj.this.zzb(zzk, zzeycVar, zzeyfVar, optString, optString2, obj);
                }
            }, zzbzn.zze);
            return zzfuj.zzm(zzm, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdjc
                @Override // com.google.android.gms.internal.ads.zzftq
                public final zzfut zza(Object obj) {
                    zzfut zzfutVar = zzfut.this;
                    if (((zzcei) obj) != null) {
                        return zzfutVar;
                    }
                    throw new zzeek(1, "Retrieve Web View from image ad response failed.");
                }
            }, zzbzn.zzf);
        }
        return zzfuj.zzh(null);
    }

    public final zzfut zzh(JSONObject jSONObject, zzeyc zzeycVar, zzeyf zzeyfVar) {
        zzfut zza;
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbu.zzg(jSONObject, "html_containers", "instream");
        if (zzg == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return zzfuj.zzh(null);
            }
            String optString = optJSONObject.optString("vast_xml");
            boolean z = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziS)).booleanValue() && optJSONObject.has("html")) {
                z = true;
            }
            if (TextUtils.isEmpty(optString)) {
                if (!z) {
                    zzbza.zzj("Required field 'vast_xml' or 'html' is missing");
                    return zzfuj.zzh(null);
                }
            } else if (!z) {
                zza = this.zzi.zza(optJSONObject);
                return zzl(zzfuj.zzn(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdp)).intValue(), TimeUnit.SECONDS, this.zzk), null);
            }
            zza = zzp(optJSONObject, zzeycVar, zzeyfVar);
            return zzl(zzfuj.zzn(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdp)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        return zzp(zzg, zzeycVar, zzeyfVar);
    }

    private final com.google.android.gms.ads.internal.client.zzq zzk(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzq.zzc();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzq(this.zza, new AdSize(i, i2));
    }
}
