package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgro implements zzgsq {
    private static final zzgru zza = new zzgrm();
    private final zzgru zzb;

    public zzgro() {
        zzgru zzgruVar;
        zzgru[] zzgruVarArr = new zzgru[2];
        zzgruVarArr[0] = zzgqh.zza();
        try {
            zzgruVar = (zzgru) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzgruVar = zza;
        }
        zzgruVarArr[1] = zzgruVar;
        zzgrn zzgrnVar = new zzgrn(zzgruVarArr);
        zzgqw.zzf(zzgrnVar, "messageInfoFactory");
        this.zzb = zzgrnVar;
    }

    private static boolean zzb(zzgrt zzgrtVar) {
        return zzgrtVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgsq
    public final zzgsp zza(Class cls) {
        zzgsr.zzG(cls);
        zzgrt zzb = this.zzb.zzb(cls);
        if (!zzb.zzb()) {
            if (zzgqm.class.isAssignableFrom(cls)) {
                if (zzb(zzb)) {
                    return zzgrz.zzl(cls, zzb, zzgsc.zzb(), zzgrk.zze(), zzgsr.zzB(), zzgqb.zzb(), zzgrs.zzb());
                }
                return zzgrz.zzl(cls, zzb, zzgsc.zzb(), zzgrk.zze(), zzgsr.zzB(), null, zzgrs.zzb());
            } else if (zzb(zzb)) {
                return zzgrz.zzl(cls, zzb, zzgsc.zza(), zzgrk.zzd(), zzgsr.zzz(), zzgqb.zza(), zzgrs.zza());
            } else {
                return zzgrz.zzl(cls, zzb, zzgsc.zza(), zzgrk.zzd(), zzgsr.zzA(), null, zzgrs.zza());
            }
        } else if (zzgqm.class.isAssignableFrom(cls)) {
            return zzgsa.zzc(zzgsr.zzB(), zzgqb.zzb(), zzb.zza());
        } else {
            return zzgsa.zzc(zzgsr.zzz(), zzgqb.zza(), zzb.zza());
        }
    }
}
