package com.google.android.gms.internal.ads;

import cz.msebera.android.httpclient.client.cache.HeaderConstants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzall {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzala.zzd("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzala.zzc(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static zzajx zzb(zzakk zzakkVar) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzakkVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long zza = str != null ? zza(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals(HeaderConstants.CACHE_CONTROL_NO_CACHE) || trim.equals(HeaderConstants.CACHE_CONTROL_NO_STORE)) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals(HeaderConstants.CACHE_CONTROL_MUST_REVALIDATE) || trim.equals(HeaderConstants.CACHE_CONTROL_PROXY_REVALIDATE)) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = (String) map.get("Expires");
        long zza2 = str3 != null ? zza(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long zza3 = str4 != null ? zza(str4) : 0L;
        String str5 = (String) map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j);
                j5 = (j * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (zza <= 0 || zza2 < zza) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (zza2 - zza);
                j3 = j4;
            }
        }
        zzajx zzajxVar = new zzajx();
        zzajxVar.zza = zzakkVar.zzb;
        zzajxVar.zzb = str5;
        zzajxVar.zzf = j4;
        zzajxVar.zze = j3;
        zzajxVar.zzc = zza;
        zzajxVar.zzd = zza3;
        zzajxVar.zzg = map;
        zzajxVar.zzh = zzakkVar.zzd;
        return zzajxVar;
    }

    public static String zzc(long j) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
