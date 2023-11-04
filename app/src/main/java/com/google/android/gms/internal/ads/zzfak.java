package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfak implements zzfaj {
    private final ConcurrentHashMap zza;
    private final zzfaq zzb;
    private final zzfam zzc = new zzfam();

    public zzfak(zzfaq zzfaqVar) {
        this.zza = new ConcurrentHashMap(zzfaqVar.zzd);
        this.zzb = zzfaqVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfaq> creator = zzfaq.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfU)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfat) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfai) entry.getValue()).zzb(); i2++) {
                    sb.append("[O]");
                }
                for (int zzb = ((zzfai) entry.getValue()).zzb(); zzb < this.zzb.zzd; zzb++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfai) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            zzbza.zze(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfaj
    public final zzfaq zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfaj
    public final synchronized zzfas zzb(zzfat zzfatVar) {
        zzfas zzfasVar;
        zzfai zzfaiVar = (zzfai) this.zza.get(zzfatVar);
        if (zzfaiVar != null) {
            zzfasVar = zzfaiVar.zze();
            if (zzfasVar == null) {
                this.zzc.zze();
            }
            zzfbg zzf = zzfaiVar.zzf();
            if (zzfasVar != null) {
                zzawt zza = zzawz.zza();
                zzawr zza2 = zzaws.zza();
                zza2.zzd(2);
                zzawv zza3 = zzaww.zza();
                zza3.zza(zzf.zza);
                zza3.zzb(zzf.zzb);
                zza2.zza(zza3);
                zza.zza(zza2);
                zzfasVar.zza.zzb().zzc().zze((zzawz) zza.zzal());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfasVar = null;
        }
        return zzfasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfaj
    @Deprecated
    public final zzfat zzc(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        return new zzfau(zzlVar, str, new zzbtr(this.zzb.zza).zza().zzk, this.zzb.zzf, zzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfaj
    public final synchronized boolean zzd(zzfat zzfatVar, zzfas zzfasVar) {
        boolean zzh;
        zzfai zzfaiVar = (zzfai) this.zza.get(zzfatVar);
        zzfasVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        if (zzfaiVar == null) {
            zzfaq zzfaqVar = this.zzb;
            zzfaiVar = new zzfai(zzfaqVar.zzd, zzfaqVar.zze * 1000);
            int size = this.zza.size();
            zzfaq zzfaqVar2 = this.zzb;
            if (size == zzfaqVar2.zzc) {
                int i = zzfaqVar2.zzg;
                int i2 = i - 1;
                zzfat zzfatVar2 = null;
                if (i == 0) {
                    throw null;
                }
                long j = LongCompanionObject.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry entry : this.zza.entrySet()) {
                        if (((zzfai) entry.getValue()).zzc() < j) {
                            j = ((zzfai) entry.getValue()).zzc();
                            zzfatVar2 = (zzfat) entry.getKey();
                        }
                    }
                    if (zzfatVar2 != null) {
                        this.zza.remove(zzfatVar2);
                    }
                } else if (i2 == 1) {
                    for (Map.Entry entry2 : this.zza.entrySet()) {
                        if (((zzfai) entry2.getValue()).zzd() < j) {
                            j = ((zzfai) entry2.getValue()).zzd();
                            zzfatVar2 = (zzfat) entry2.getKey();
                        }
                    }
                    if (zzfatVar2 != null) {
                        this.zza.remove(zzfatVar2);
                    }
                } else if (i2 == 2) {
                    int i3 = Integer.MAX_VALUE;
                    for (Map.Entry entry3 : this.zza.entrySet()) {
                        if (((zzfai) entry3.getValue()).zza() < i3) {
                            i3 = ((zzfai) entry3.getValue()).zza();
                            zzfatVar2 = (zzfat) entry3.getKey();
                        }
                    }
                    if (zzfatVar2 != null) {
                        this.zza.remove(zzfatVar2);
                    }
                }
                this.zzc.zzg();
            }
            this.zza.put(zzfatVar, zzfaiVar);
            this.zzc.zzd();
        }
        zzh = zzfaiVar.zzh(zzfasVar);
        this.zzc.zzc();
        zzfal zza = this.zzc.zza();
        zzfbg zzf = zzfaiVar.zzf();
        if (zzfasVar != null) {
            zzawt zza2 = zzawz.zza();
            zzawr zza3 = zzaws.zza();
            zza3.zzd(2);
            zzawx zza4 = zzawy.zza();
            zza4.zza(zza.zza);
            zza4.zzb(zza.zzb);
            zza4.zzc(zzf.zzb);
            zza3.zzc(zza4);
            zza2.zza(zza3);
            zzfasVar.zza.zzb().zzc().zzf((zzawz) zza2.zzal());
        }
        zzf();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfaj
    public final synchronized boolean zze(zzfat zzfatVar) {
        zzfai zzfaiVar = (zzfai) this.zza.get(zzfatVar);
        if (zzfaiVar != null) {
            return zzfaiVar.zzb() < this.zzb.zzd;
        }
        return true;
    }
}
