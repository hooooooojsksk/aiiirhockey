package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzepk implements zzepn {
    private final zzfuu zza;
    private final Context zzb;

    public zzepk(zzfuu zzfuuVar, Context context) {
        this.zza = zzfuuVar;
        this.zzb = context;
    }

    public static Bundle zzc(Context context, JSONArray jSONArray) {
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("bk");
            String optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt("type", -1);
            int i2 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i2 != 0) {
                String[] split = optString2.split("/");
                int length = split.length;
                Object obj = null;
                if (length <= 2 && length != 0) {
                    if (length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = split[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(split[0], 0);
                        str = split[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i3 = i2 - 1;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(optString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(optString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(optString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepk.this.zzd();
            }
        });
    }

    public final /* synthetic */ zzepm zzd() throws Exception {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfH);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            final Bundle zzc = zzc(this.zzb, new JSONArray(str));
            return new zzepm() { // from class: com.google.android.gms.internal.ads.zzepj
                @Override // com.google.android.gms.internal.ads.zzepm
                public final void zzh(Object obj) {
                    ((Bundle) obj).putBundle("shared_pref", zzc);
                }
            };
        } catch (JSONException e) {
            zzbza.zzf("JSON parsing error", e);
            return null;
        }
    }
}
