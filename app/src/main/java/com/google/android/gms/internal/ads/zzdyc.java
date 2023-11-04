package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdyc {
    public int zza = 0;
    public Map zzb = new HashMap();
    public String zzc = "";
    public long zzd = -1;

    public static zzdyc zza(Reader reader) throws zzeyg {
        try {
            try {
                JsonReader jsonReader = new JsonReader(reader);
                HashMap hashMap = new HashMap();
                long j = -1;
                String str = "";
                jsonReader.beginObject();
                int i = 0;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if ("response".equals(nextName)) {
                        i = jsonReader.nextInt();
                    } else if ("body".equals(nextName)) {
                        str = jsonReader.nextString();
                    } else if ("latency".equals(nextName)) {
                        j = jsonReader.nextLong();
                    } else if ("headers".equals(nextName)) {
                        hashMap = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            hashMap.put(jsonReader.nextName(), com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                zzdyc zzdycVar = new zzdyc();
                zzdycVar.zza = i;
                if (str != null) {
                    zzdycVar.zzc = str;
                }
                zzdycVar.zzd = j;
                zzdycVar.zzb = hashMap;
                return zzdycVar;
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException e) {
                throw new zzeyg("Unable to parse Response", e);
            }
        } finally {
            IOUtils.closeQuietly(reader);
        }
    }
}
