package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeyn {
    public final List zza;
    public final zzeyf zzb;
    public final List zzc;

    zzeyn(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        List emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzeyf zzeyfVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new zzeyc(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        zzeyfVar = new zzeyf(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if (AppMeasurementSdk.ConditionalUserProperty.NAME.equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new zzeym(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList;
        this.zza = emptyList;
        this.zzb = zzeyfVar == null ? new zzeyf(new JsonReader(new StringReader("{}"))) : zzeyfVar;
    }

    public static zzeyn zza(Reader reader) throws zzeyg {
        try {
            try {
                return new zzeyn(new JsonReader(reader));
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
                throw new zzeyg("unable to parse ServerResponse", e);
            }
        } finally {
            IOUtils.closeQuietly(reader);
        }
    }
}
