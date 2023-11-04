package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcbi {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final boolean zzm;
    public final long zzn;
    public final long zzo;

    public zzcbi(String str) {
        String string;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zza = zza(jSONObject, "aggressive_media_codec_release", zzbar.zzG);
        this.zzb = zzb(jSONObject, "byte_buffer_precache_limit", zzbar.zzj);
        this.zzc = zzb(jSONObject, "exo_cache_buffer_size", zzbar.zzu);
        this.zzd = zzb(jSONObject, "exo_connect_timeout_millis", zzbar.zzf);
        zzbaj zzbajVar = zzbar.zze;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.zze = string;
            this.zzf = zzb(jSONObject, "exo_read_timeout_millis", zzbar.zzg);
            this.zzg = zzb(jSONObject, "load_check_interval_bytes", zzbar.zzh);
            this.zzh = zzb(jSONObject, "player_precache_limit", zzbar.zzi);
            this.zzi = zzb(jSONObject, "socket_receive_buffer_size", zzbar.zzk);
            this.zzj = zza(jSONObject, "use_cache_data_source", zzbar.zzdP);
            zzb(jSONObject, "min_retry_count", zzbar.zzl);
            this.zzk = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbar.zzo);
            this.zzl = zza(jSONObject, "enable_multiple_video_playback", zzbar.zzbH);
            this.zzm = zza(jSONObject, "use_range_http_data_source", zzbar.zzbJ);
            this.zzn = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbar.zzbK);
            this.zzo = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbar.zzbL);
        }
        string = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbajVar);
        this.zze = string;
        this.zzf = zzb(jSONObject, "exo_read_timeout_millis", zzbar.zzg);
        this.zzg = zzb(jSONObject, "load_check_interval_bytes", zzbar.zzh);
        this.zzh = zzb(jSONObject, "player_precache_limit", zzbar.zzi);
        this.zzi = zzb(jSONObject, "socket_receive_buffer_size", zzbar.zzk);
        this.zzj = zza(jSONObject, "use_cache_data_source", zzbar.zzdP);
        zzb(jSONObject, "min_retry_count", zzbar.zzl);
        this.zzk = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbar.zzo);
        this.zzl = zza(jSONObject, "enable_multiple_video_playback", zzbar.zzbH);
        this.zzm = zza(jSONObject, "use_range_http_data_source", zzbar.zzbJ);
        this.zzn = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbar.zzbK);
        this.zzo = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbar.zzbL);
    }

    private static final boolean zza(JSONObject jSONObject, String str, zzbaj zzbajVar) {
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbajVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
                return booleanValue;
            }
        }
        return booleanValue;
    }

    private static final int zzb(JSONObject jSONObject, String str, zzbaj zzbajVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbajVar)).intValue();
    }

    private static final long zzc(JSONObject jSONObject, String str, zzbaj zzbajVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbajVar)).longValue();
    }
}
