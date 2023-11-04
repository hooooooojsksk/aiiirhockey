package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgpn implements zzgsh {
    private final zzgpm zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgpn(zzgpm zzgpmVar) {
        zzgqw.zzf(zzgpmVar, "input");
        this.zza = zzgpmVar;
        zzgpmVar.zzc = this;
    }

    private final void zzP(Object obj, zzgsp zzgspVar, zzgpy zzgpyVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzgspVar.zzh(obj, this, zzgpyVar);
            if (this.zzb == this.zzc) {
                return;
            }
            throw zzgqy.zzg();
        } finally {
            this.zzc = i;
        }
    }

    private final void zzQ(Object obj, zzgsp zzgspVar, zzgpy zzgpyVar) throws IOException {
        zzgpm zzgpmVar;
        int zzn = this.zza.zzn();
        zzgpm zzgpmVar2 = this.zza;
        if (zzgpmVar2.zza >= zzgpmVar2.zzb) {
            throw new zzgqy("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zze = zzgpmVar2.zze(zzn);
        this.zza.zza++;
        zzgspVar.zzh(obj, this, zzgpyVar);
        this.zza.zzz(0);
        zzgpmVar.zza--;
        this.zza.zzA(zze);
    }

    private final void zzR(int i) throws IOException {
        if (this.zza.zzd() != i) {
            throw zzgqy.zzj();
        }
    }

    private final void zzS(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw zzgqy.zza();
        }
    }

    private static final void zzT(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzgqy.zzg();
        }
    }

    private static final void zzU(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzgqy.zzg();
        }
    }

    public static zzgpn zzq(zzgpm zzgpmVar) {
        zzgpn zzgpnVar = zzgpmVar.zzc;
        return zzgpnVar != null ? zzgpnVar : new zzgpn(zzgpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final void zzA(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgrl) {
            zzgrl zzgrlVar = (zzgrl) list;
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    zzgrlVar.zzg(this.zza.zzo());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzgrlVar.zzg(this.zza.zzo());
                } while (this.zza.zzd() < zzd);
                return;
            } else {
                throw zzgqy.zza();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i2 == 2) {
            int zzn2 = this.zza.zzn();
            zzU(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                list.add(Long.valueOf(this.zza.zzo()));
            } while (this.zza.zzd() < zzd2);
        } else {
            throw zzgqy.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final void zzB(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgqf)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < zzd);
                return;
            } else if (i != 5) {
                throw zzgqy.zza();
            } else {
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm = this.zza.zzm();
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
        }
        zzgqf zzgqfVar = (zzgqf) list;
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zzn2 = this.zza.zzn();
            zzT(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                zzgqfVar.zze(this.zza.zzc());
            } while (this.zza.zzd() < zzd2);
        } else if (i2 != 5) {
            throw zzgqy.zza();
        } else {
            do {
                zzgqfVar.zze(this.zza.zzc());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    @Deprecated
    public final void zzC(List list, zzgsp zzgspVar, zzgpy zzgpyVar) throws IOException {
        int zzm;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw zzgqy.zza();
        }
        do {
            Object zze = zzgspVar.zze();
            zzP(zze, zzgspVar, zzgpyVar);
            zzgspVar.zzf(zze);
            list.add(zze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == i);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final void zzD(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgqn) {
            zzgqn zzgqnVar = (zzgqn) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzgqnVar.zzh(this.zza.zzh());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i == 2) {
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    zzgqnVar.zzh(this.zza.zzh());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            } else {
                throw zzgqy.zza();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i2 == 2) {
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
        } else {
            throw zzgqy.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final void zzE(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgrl) {
            zzgrl zzgrlVar = (zzgrl) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzgrlVar.zzg(this.zza.zzp());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i == 2) {
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    zzgrlVar.zzg(this.zza.zzp());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            } else {
                throw zzgqy.zza();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i2 == 2) {
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
        } else {
            throw zzgqy.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final void zzF(List list, zzgsp zzgspVar, zzgpy zzgpyVar) throws IOException {
        int zzm;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw zzgqy.zza();
        }
        do {
            Object zze = zzgspVar.zze();
            zzQ(zze, zzgspVar, zzgpyVar);
            zzgspVar.zzf(zze);
            list.add(zze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == i);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final void zzG(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgqn)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < zzd);
                return;
            } else if (i != 5) {
                throw zzgqy.zza();
            } else {
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm = this.zza.zzm();
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
        }
        zzgqn zzgqnVar = (zzgqn) list;
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zzn2 = this.zza.zzn();
            zzT(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                zzgqnVar.zzh(this.zza.zzk());
            } while (this.zza.zzd() < zzd2);
        } else if (i2 != 5) {
            throw zzgqy.zza();
        } else {
            do {
                zzgqnVar.zzh(this.zza.zzk());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final void zzH(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgrl) {
            zzgrl zzgrlVar = (zzgrl) list;
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    zzgrlVar.zzg(this.zza.zzt());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzgrlVar.zzg(this.zza.zzt());
                } while (this.zza.zzd() < zzd);
                return;
            } else {
                throw zzgqy.zza();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i2 == 2) {
            int zzn2 = this.zza.zzn();
            zzU(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                list.add(Long.valueOf(this.zza.zzt()));
            } while (this.zza.zzd() < zzd2);
        } else {
            throw zzgqy.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final void zzI(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgqn) {
            zzgqn zzgqnVar = (zzgqn) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzgqnVar.zzh(this.zza.zzl());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i == 2) {
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    zzgqnVar.zzh(this.zza.zzl());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            } else {
                throw zzgqy.zza();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i2 == 2) {
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
        } else {
            throw zzgqy.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final void zzJ(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgrl) {
            zzgrl zzgrlVar = (zzgrl) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzgrlVar.zzg(this.zza.zzu());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i == 2) {
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    zzgrlVar.zzg(this.zza.zzu());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            } else {
                throw zzgqy.zza();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i2 == 2) {
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Long.valueOf(this.zza.zzu()));
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
        } else {
            throw zzgqy.zza();
        }
    }

    public final void zzK(List list, boolean z) throws IOException {
        int zzm;
        int zzm2;
        if ((this.zzb & 7) != 2) {
            throw zzgqy.zza();
        }
        if (!(list instanceof zzgre) || z) {
            do {
                list.add(z ? zzs() : zzr());
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzgre zzgreVar = (zzgre) list;
        do {
            zzgreVar.zzi(zzp());
            if (this.zza.zzC()) {
                return;
            }
            zzm2 = this.zza.zzm();
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final void zzL(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgqn) {
            zzgqn zzgqnVar = (zzgqn) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzgqnVar.zzh(this.zza.zzn());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i == 2) {
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    zzgqnVar.zzh(this.zza.zzn());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            } else {
                throw zzgqy.zza();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i2 == 2) {
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
        } else {
            throw zzgqy.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final void zzM(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgrl) {
            zzgrl zzgrlVar = (zzgrl) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzgrlVar.zzg(this.zza.zzv());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i == 2) {
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    zzgrlVar.zzg(this.zza.zzv());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            } else {
                throw zzgqy.zza();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzv()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i2 == 2) {
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Long.valueOf(this.zza.zzv()));
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
        } else {
            throw zzgqy.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final boolean zzN() throws IOException {
        zzS(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final boolean zzO() throws IOException {
        int i;
        if (this.zza.zzC() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final double zza() throws IOException {
        zzS(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final float zzb() throws IOException {
        zzS(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final int zzc() throws IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zzm();
            this.zzb = i;
        }
        if (i == 0 || i == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final int zze() throws IOException {
        zzS(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final int zzf() throws IOException {
        zzS(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final int zzg() throws IOException {
        zzS(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final int zzh() throws IOException {
        zzS(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final int zzi() throws IOException {
        zzS(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final int zzj() throws IOException {
        zzS(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final long zzk() throws IOException {
        zzS(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final long zzl() throws IOException {
        zzS(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final long zzm() throws IOException {
        zzS(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final long zzn() throws IOException {
        zzS(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final long zzo() throws IOException {
        zzS(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final zzgpe zzp() throws IOException {
        zzS(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final String zzr() throws IOException {
        zzS(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final String zzs() throws IOException {
        zzS(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final void zzt(Object obj, zzgsp zzgspVar, zzgpy zzgpyVar) throws IOException {
        zzS(3);
        zzP(obj, zzgspVar, zzgpyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final void zzu(Object obj, zzgsp zzgspVar, zzgpy zzgpyVar) throws IOException {
        zzS(2);
        zzQ(obj, zzgspVar, zzgpyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final void zzv(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgos) {
            zzgos zzgosVar = (zzgos) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzgosVar.zze(this.zza.zzD());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i == 2) {
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    zzgosVar.zze(this.zza.zzD());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            } else {
                throw zzgqy.zza();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i2 == 2) {
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
        } else {
            throw zzgqy.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final void zzw(List list) throws IOException {
        int zzm;
        if ((this.zzb & 7) != 2) {
            throw zzgqy.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final void zzx(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgpv) {
            zzgpv zzgpvVar = (zzgpv) list;
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    zzgpvVar.zze(this.zza.zzb());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzgpvVar.zze(this.zza.zzb());
                } while (this.zza.zzd() < zzd);
                return;
            } else {
                throw zzgqy.zza();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(this.zza.zzb()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i2 == 2) {
            int zzn2 = this.zza.zzn();
            zzU(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                list.add(Double.valueOf(this.zza.zzb()));
            } while (this.zza.zzd() < zzd2);
        } else {
            throw zzgqy.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final void zzy(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgqn) {
            zzgqn zzgqnVar = (zzgqn) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzgqnVar.zzh(this.zza.zzf());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            } else if (i == 2) {
                int zzd = this.zza.zzd() + this.zza.zzn();
                do {
                    zzgqnVar.zzh(this.zza.zzf());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            } else {
                throw zzgqy.zza();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
        } else if (i2 == 2) {
            int zzd2 = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzd() < zzd2);
            zzR(zzd2);
        } else {
            throw zzgqy.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsh
    public final void zzz(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgqn)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < zzd);
                return;
            } else if (i != 5) {
                throw zzgqy.zza();
            } else {
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm = this.zza.zzm();
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
        }
        zzgqn zzgqnVar = (zzgqn) list;
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zzn2 = this.zza.zzn();
            zzT(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                zzgqnVar.zzh(this.zza.zzg());
            } while (this.zza.zzd() < zzd2);
        } else if (i2 != 5) {
            throw zzgqy.zza();
        } else {
            do {
                zzgqnVar.zzh(this.zza.zzg());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
        }
    }
}
