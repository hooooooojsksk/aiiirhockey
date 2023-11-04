package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbg {
    public final String zzc;
    public final zzay zzd;
    @Deprecated
    public final zzba zze;
    public final zzaw zzf;
    public final zzbm zzg;
    public final zzan zzh;
    @Deprecated
    public final zzap zzi;
    public final zzbd zzj;
    public static final zzbg zza = new zzaj().zzc();
    private static final String zzk = zzew.zzP(0);
    private static final String zzl = zzew.zzP(1);
    private static final String zzm = zzew.zzP(2);
    private static final String zzn = zzew.zzP(3);
    private static final String zzo = zzew.zzP(4);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzah
    };

    public /* synthetic */ zzbg(String str, zzap zzapVar, zzba zzbaVar, zzaw zzawVar, zzbm zzbmVar, zzbd zzbdVar, zzbf zzbfVar) {
        this.zzc = str;
        this.zzd = zzbaVar;
        this.zze = zzbaVar;
        this.zzf = zzawVar;
        this.zzg = zzbmVar;
        this.zzh = zzapVar;
        this.zzi = zzapVar;
        this.zzj = zzbdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbg) {
            zzbg zzbgVar = (zzbg) obj;
            return zzew.zzU(this.zzc, zzbgVar.zzc) && this.zzh.equals(zzbgVar.zzh) && zzew.zzU(this.zzd, zzbgVar.zzd) && zzew.zzU(this.zzf, zzbgVar.zzf) && zzew.zzU(this.zzg, zzbgVar.zzg) && zzew.zzU(this.zzj, zzbgVar.zzj);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzc.hashCode() * 31;
        zzay zzayVar = this.zzd;
        return (((((((hashCode + (zzayVar != null ? zzayVar.hashCode() : 0)) * 31) + this.zzf.hashCode()) * 31) + this.zzh.hashCode()) * 31) + this.zzg.hashCode()) * 31;
    }
}
