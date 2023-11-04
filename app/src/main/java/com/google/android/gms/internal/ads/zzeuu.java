package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeuu implements zzevt {
    private zzctw zza;
    private final Executor zzb = zzfva.zzb();

    public final zzctw zza() {
        return this.zza;
    }

    public final zzfut zzb(zzevu zzevuVar, zzevs zzevsVar, zzctw zzctwVar) {
        zzctv zza = zzevsVar.zza(zzevuVar.zzb);
        zza.zzb(new zzevx(true));
        zzctw zzctwVar2 = (zzctw) zza.zzh();
        this.zza = zzctwVar2;
        final zzcrt zzb = zzctwVar2.zzb();
        final zzfas zzfasVar = new zzfas();
        return zzfuj.zzl(zzfuj.zzm(zzfua.zzv(zzb.zzj()), new zzftq() { // from class: com.google.android.gms.internal.ads.zzeus
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                zzfas zzfasVar2 = zzfasVar;
                zzcrt zzcrtVar = zzb;
                zzeyo zzeyoVar = (zzeyo) obj;
                zzfasVar2.zzb = zzeyoVar;
                Iterator it = zzeyoVar.zzb.zza.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        for (String str : ((zzeyc) it.next()).zza) {
                            if (!str.contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return zzcrtVar.zzi(zzfuj.zzh(zzeyoVar));
                    }
                }
                return zzfuj.zzh(null);
            }
        }, this.zzb), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzeut
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                zzfas zzfasVar2 = zzfas.this;
                zzfasVar2.zzc = (zzcqm) obj;
                return zzfasVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    public final /* bridge */ /* synthetic */ zzfut zzc(zzevu zzevuVar, zzevs zzevsVar, Object obj) {
        return zzb(zzevuVar, zzevsVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
