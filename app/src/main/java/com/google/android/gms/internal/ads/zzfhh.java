package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfhh extends zzfhc {
    public zzfhh(zzfgv zzfgvVar, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzfgvVar, hashSet, jSONObject, j, null);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfgp.zzj(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfhd, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfhd
    public final void zza(String str) {
        zzffz zza;
        if (!TextUtils.isEmpty(str) && (zza = zzffz.zza()) != null) {
            for (zzffo zzffoVar : zza.zzc()) {
                if (this.zza.contains(zzffoVar.zzh())) {
                    zzffoVar.zzg().zze(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
