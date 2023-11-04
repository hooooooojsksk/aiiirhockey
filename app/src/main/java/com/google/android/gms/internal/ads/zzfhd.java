package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzfhd extends AsyncTask {
    private zzfhe zza;
    protected final zzfgv zzd;

    public zzfhd(zzfgv zzfgvVar, byte[] bArr) {
        this.zzd = zzfgvVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public void onPostExecute(String str) {
        zzfhe zzfheVar = this.zza;
        if (zzfheVar != null) {
            zzfheVar.zza(this);
        }
    }

    public final void zzb(zzfhe zzfheVar) {
        this.zza = zzfheVar;
    }
}
