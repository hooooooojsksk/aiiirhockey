package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbxj implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbxk zza;
    private final String zzb;

    public zzbxj(zzbxk zzbxkVar, String str) {
        this.zza = zzbxkVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzbxi> list;
        synchronized (this.zza) {
            list = this.zza.zzb;
            for (zzbxi zzbxiVar : list) {
                zzbxiVar.zza.zzb(zzbxiVar.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
