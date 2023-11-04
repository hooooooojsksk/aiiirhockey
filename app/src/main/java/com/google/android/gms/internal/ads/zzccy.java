package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzccy extends zzccu {
    public zzccy(zzcbj zzcbjVar) {
        super(zzcbjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final boolean zzt(String str) {
        String zze = zzbyt.zze(str);
        zzcbj zzcbjVar = (zzcbj) this.zzc.get();
        if (zzcbjVar != null && zze != null) {
            zzcbjVar.zzt(zze, this);
        }
        zzbza.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, zze, "noop", "Noop cache is a noop.");
        return false;
    }
}
