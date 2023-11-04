package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzju {
    private final zzck zza = new zzck();
    private final zzcm zzb = new zzcm();
    private final zzlb zzc;
    private final zzdv zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjr zzh;
    private zzjr zzi;
    private zzjr zzj;
    private int zzk;
    private Object zzl;
    private long zzm;

    public zzju(zzlb zzlbVar, zzdv zzdvVar) {
        this.zzc = zzlbVar;
        this.zzd = zzdvVar;
    }

    private final boolean zzA(zzcn zzcnVar, zzss zzssVar) {
        if (zzC(zzssVar)) {
            return zzcnVar.zze(zzcnVar.zzn(zzssVar.zza, this.zza).zzd, this.zzb, 0L).zzp == zzcnVar.zza(zzssVar.zza);
        }
        return false;
    }

    private final boolean zzB(zzcn zzcnVar) {
        zzjr zzjrVar = this.zzh;
        if (zzjrVar == null) {
            return true;
        }
        int zza = zzcnVar.zza(zzjrVar.zzb);
        while (true) {
            zza = zzcnVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg);
            while (zzjrVar.zzg() != null && !zzjrVar.zzf.zzg) {
                zzjrVar = zzjrVar.zzg();
            }
            zzjr zzg = zzjrVar.zzg();
            if (zza == -1 || zzg == null || zzcnVar.zza(zzg.zzb) != zza) {
                break;
            }
            zzjrVar = zzg;
        }
        boolean zzm = zzm(zzjrVar);
        zzjrVar.zzf = zzg(zzcnVar, zzjrVar.zzf);
        return !zzm;
    }

    private static final boolean zzC(zzss zzssVar) {
        return !zzssVar.zzb() && zzssVar.zze == -1;
    }

    private final long zzs(zzcn zzcnVar, Object obj, int i) {
        zzcnVar.zzn(obj, this.zza);
        this.zza.zzh(i);
        this.zza.zzj(i);
        return 0L;
    }

    private final zzjs zzt(zzcn zzcnVar, zzjr zzjrVar, long j) {
        long j2;
        zzjs zzjsVar = zzjrVar.zzf;
        long zze = (zzjrVar.zze() + zzjsVar.zze) - j;
        if (zzjsVar.zzg) {
            long j3 = 0;
            int zzi = zzcnVar.zzi(zzcnVar.zza(zzjsVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi == -1) {
                return null;
            }
            int i = zzcnVar.zzd(zzi, this.zza, true).zzd;
            Object obj = this.zza.zzc;
            Objects.requireNonNull(obj);
            long j4 = zzjsVar.zza.zzd;
            if (zzcnVar.zze(i, this.zzb, 0L).zzo == zzi) {
                Pair zzm = zzcnVar.zzm(this.zzb, this.zza, i, -9223372036854775807L, Math.max(0L, zze));
                if (zzm == null) {
                    return null;
                }
                obj = zzm.first;
                long longValue = ((Long) zzm.second).longValue();
                zzjr zzg = zzjrVar.zzg();
                if (zzg != null && zzg.zzb.equals(obj)) {
                    j4 = zzg.zzf.zza.zzd;
                } else {
                    j4 = this.zze;
                    this.zze = 1 + j4;
                }
                j2 = longValue;
                j3 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            zzss zzx = zzx(zzcnVar, obj, j2, j4, this.zzb, this.zza);
            if (j3 != -9223372036854775807L && zzjsVar.zzc != -9223372036854775807L) {
                zzcnVar.zzn(zzjsVar.zza.zza, this.zza).zzb();
            }
            return zzu(zzcnVar, zzx, j3, j2);
        }
        zzss zzssVar = zzjsVar.zza;
        zzcnVar.zzn(zzssVar.zza, this.zza);
        if (zzssVar.zzb()) {
            int i2 = zzssVar.zzb;
            if (this.zza.zza(i2) == -1) {
                return null;
            }
            int zzf = this.zza.zzf(i2, zzssVar.zzc);
            if (zzf < 0) {
                return zzv(zzcnVar, zzssVar.zza, i2, zzf, zzjsVar.zzc, zzssVar.zzd);
            }
            long j5 = zzjsVar.zzc;
            if (j5 == -9223372036854775807L) {
                zzcm zzcmVar = this.zzb;
                zzck zzckVar = this.zza;
                Pair zzm2 = zzcnVar.zzm(zzcmVar, zzckVar, zzckVar.zzd, -9223372036854775807L, Math.max(0L, zze));
                if (zzm2 == null) {
                    return null;
                }
                j5 = ((Long) zzm2.second).longValue();
            }
            zzs(zzcnVar, zzssVar.zza, zzssVar.zzb);
            return zzw(zzcnVar, zzssVar.zza, Math.max(0L, j5), zzjsVar.zzc, zzssVar.zzd);
        }
        int zze2 = this.zza.zze(zzssVar.zze);
        this.zza.zzl(zzssVar.zze);
        if (zze2 == this.zza.zza(zzssVar.zze)) {
            zzs(zzcnVar, zzssVar.zza, zzssVar.zze);
            return zzw(zzcnVar, zzssVar.zza, 0L, zzjsVar.zze, zzssVar.zzd);
        }
        return zzv(zzcnVar, zzssVar.zza, zzssVar.zze, zze2, zzjsVar.zze, zzssVar.zzd);
    }

    private final zzjs zzu(zzcn zzcnVar, zzss zzssVar, long j, long j2) {
        zzcnVar.zzn(zzssVar.zza, this.zza);
        if (zzssVar.zzb()) {
            return zzv(zzcnVar, zzssVar.zza, zzssVar.zzb, zzssVar.zzc, j, zzssVar.zzd);
        }
        return zzw(zzcnVar, zzssVar.zza, j2, j, zzssVar.zzd);
    }

    private final zzjs zzv(zzcn zzcnVar, Object obj, int i, int i2, long j, long j2) {
        zzss zzssVar = new zzss(obj, i, i2, j2);
        long zzg = zzcnVar.zzn(zzssVar.zza, this.zza).zzg(zzssVar.zzb, zzssVar.zzc);
        if (i2 == this.zza.zze(i)) {
            this.zza.zzi();
        }
        this.zza.zzl(zzssVar.zzb);
        long j3 = 0;
        if (zzg != -9223372036854775807L && zzg <= 0) {
            j3 = Math.max(0L, (-1) + zzg);
        }
        return new zzjs(zzssVar, j3, j, -9223372036854775807L, zzg, false, false, false, false);
    }

    private final zzjs zzw(zzcn zzcnVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long j7 = j;
        zzcnVar.zzn(obj, this.zza);
        int zzc = this.zza.zzc(j7);
        if (zzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzl(zzc);
        }
        zzss zzssVar = new zzss(obj, j3, zzc);
        boolean zzC = zzC(zzssVar);
        boolean zzA = zzA(zzcnVar, zzssVar);
        boolean zzz = zzz(zzcnVar, zzssVar, zzC);
        if (zzc != -1) {
            this.zza.zzl(zzc);
        }
        if (zzc != -1) {
            this.zza.zzh(zzc);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = this.zza.zze;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && j7 >= j5) {
            j7 = Math.max(0L, j5 - 1);
        }
        return new zzjs(zzssVar, j7, j2, j6, j5, false, zzC, zzA, zzz);
    }

    private static zzss zzx(zzcn zzcnVar, Object obj, long j, long j2, zzcm zzcmVar, zzck zzckVar) {
        zzcnVar.zzn(obj, zzckVar);
        zzcnVar.zze(zzckVar.zzd, zzcmVar, 0L);
        zzcnVar.zza(obj);
        if (zzckVar.zze == 0) {
            zzckVar.zzb();
        }
        zzcnVar.zzn(obj, zzckVar);
        int zzd = zzckVar.zzd(j);
        if (zzd == -1) {
            return new zzss(obj, j2, zzckVar.zzc(j));
        }
        return new zzss(obj, zzd, zzckVar.zze(zzd), j2);
    }

    private final void zzy() {
        final zzfqh zzi = zzfqk.zzi();
        for (zzjr zzjrVar = this.zzh; zzjrVar != null; zzjrVar = zzjrVar.zzg()) {
            zzi.zzf(zzjrVar.zzf.zza);
        }
        zzjr zzjrVar2 = this.zzi;
        final zzss zzssVar = zzjrVar2 == null ? null : zzjrVar2.zzf.zza;
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjt
            @Override // java.lang.Runnable
            public final void run() {
                zzju.this.zzj(zzi, zzssVar);
            }
        });
    }

    private final boolean zzz(zzcn zzcnVar, zzss zzssVar, boolean z) {
        int zza = zzcnVar.zza(zzssVar.zza);
        return !zzcnVar.zze(zzcnVar.zzd(zza, this.zza, false).zzd, this.zzb, 0L).zzi && zzcnVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z;
    }

    public final zzjr zza() {
        zzjr zzjrVar = this.zzh;
        if (zzjrVar == null) {
            return null;
        }
        if (zzjrVar == this.zzi) {
            this.zzi = zzjrVar.zzg();
        }
        zzjrVar.zzn();
        int i = this.zzk - 1;
        this.zzk = i;
        if (i == 0) {
            this.zzj = null;
            zzjr zzjrVar2 = this.zzh;
            this.zzl = zzjrVar2.zzb;
            this.zzm = zzjrVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzjr zzb() {
        zzjr zzjrVar = this.zzi;
        boolean z = false;
        if (zzjrVar != null && zzjrVar.zzg() != null) {
            z = true;
        }
        zzdl.zzf(z);
        this.zzi = this.zzi.zzg();
        zzy();
        return this.zzi;
    }

    public final zzjr zzc() {
        return this.zzj;
    }

    public final zzjr zzd() {
        return this.zzh;
    }

    public final zzjr zze() {
        return this.zzi;
    }

    public final zzjs zzf(long j, zzkh zzkhVar) {
        zzjr zzjrVar = this.zzj;
        return zzjrVar == null ? zzu(zzkhVar.zza, zzkhVar.zzb, zzkhVar.zzc, zzkhVar.zzr) : zzt(zzkhVar.zza, zzjrVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzjs zzg(com.google.android.gms.internal.ads.zzcn r19, com.google.android.gms.internal.ads.zzjs r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzss r3 = r2.zza
            boolean r12 = zzC(r3)
            boolean r13 = r0.zzA(r1, r3)
            boolean r14 = r0.zzz(r1, r3, r12)
            com.google.android.gms.internal.ads.zzss r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzck r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L37
            int r1 = r3.zze
            if (r1 != r4) goto L30
            goto L37
        L30:
            com.google.android.gms.internal.ads.zzck r9 = r0.zza
            r9.zzh(r1)
            r9 = r5
            goto L38
        L37:
            r9 = r7
        L38:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzck r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzg(r5, r6)
        L48:
            r7 = r9
            r9 = r5
            goto L57
        L4b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L52
            r7 = r5
            r9 = r7
            goto L57
        L52:
            com.google.android.gms.internal.ads.zzck r1 = r0.zza
            long r5 = r1.zze
            goto L48
        L57:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L65
            com.google.android.gms.internal.ads.zzck r1 = r0.zza
            int r4 = r3.zzb
            r1.zzl(r4)
            goto L6e
        L65:
            int r1 = r3.zze
            if (r1 == r4) goto L6e
            com.google.android.gms.internal.ads.zzck r4 = r0.zza
            r4.zzl(r1)
        L6e:
            com.google.android.gms.internal.ads.zzjs r15 = new com.google.android.gms.internal.ads.zzjs
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzju.zzg(com.google.android.gms.internal.ads.zzcn, com.google.android.gms.internal.ads.zzjs):com.google.android.gms.internal.ads.zzjs");
    }

    public final zzss zzh(zzcn zzcnVar, Object obj, long j) {
        long j2;
        int zza;
        int i = zzcnVar.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 == null || (zza = zzcnVar.zza(obj2)) == -1 || zzcnVar.zzd(zza, this.zza, false).zzd != i) {
            zzjr zzjrVar = this.zzh;
            while (true) {
                if (zzjrVar == null) {
                    zzjr zzjrVar2 = this.zzh;
                    while (true) {
                        if (zzjrVar2 != null) {
                            int zza2 = zzcnVar.zza(zzjrVar2.zzb);
                            if (zza2 != -1 && zzcnVar.zzd(zza2, this.zza, false).zzd == i) {
                                j2 = zzjrVar2.zzf.zza.zzd;
                                break;
                            }
                            zzjrVar2 = zzjrVar2.zzg();
                        } else {
                            j2 = this.zze;
                            this.zze = 1 + j2;
                            if (this.zzh == null) {
                                this.zzl = obj;
                                this.zzm = j2;
                            }
                        }
                    }
                } else if (zzjrVar.zzb.equals(obj)) {
                    j2 = zzjrVar.zzf.zza.zzd;
                    break;
                } else {
                    zzjrVar = zzjrVar.zzg();
                }
            }
        } else {
            j2 = this.zzm;
        }
        long j3 = j2;
        zzcnVar.zzn(obj, this.zza);
        zzcnVar.zze(this.zza.zzd, this.zzb, 0L);
        int zza3 = zzcnVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzcm zzcmVar = this.zzb;
            if (zza3 >= zzcmVar.zzo) {
                zzcnVar.zzd(zza3, this.zza, true);
                this.zza.zzb();
                zzck zzckVar = this.zza;
                if (zzckVar.zzd(zzckVar.zze) != -1) {
                    obj3 = this.zza.zzc;
                    Objects.requireNonNull(obj3);
                }
                zza3--;
            } else {
                return zzx(zzcnVar, obj3, j, j3, zzcmVar, this.zza);
            }
        }
    }

    public final void zzi() {
        if (this.zzk == 0) {
            return;
        }
        zzjr zzjrVar = this.zzh;
        zzdl.zzb(zzjrVar);
        this.zzl = zzjrVar.zzb;
        this.zzm = zzjrVar.zzf.zza.zzd;
        while (zzjrVar != null) {
            zzjrVar.zzn();
            zzjrVar = zzjrVar.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzy();
    }

    public final /* synthetic */ void zzj(zzfqh zzfqhVar, zzss zzssVar) {
        this.zzc.zzT(zzfqhVar.zzi(), zzssVar);
    }

    public final void zzk(long j) {
        zzjr zzjrVar = this.zzj;
        if (zzjrVar != null) {
            zzjrVar.zzm(j);
        }
    }

    public final boolean zzl(zzsq zzsqVar) {
        zzjr zzjrVar = this.zzj;
        return zzjrVar != null && zzjrVar.zza == zzsqVar;
    }

    public final boolean zzm(zzjr zzjrVar) {
        boolean z = false;
        zzdl.zzf(zzjrVar != null);
        if (zzjrVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzjrVar;
        while (zzjrVar.zzg() != null) {
            zzjrVar = zzjrVar.zzg();
            if (zzjrVar == this.zzi) {
                this.zzi = this.zzh;
                z = true;
            }
            zzjrVar.zzn();
            this.zzk--;
        }
        this.zzj.zzo(null);
        zzy();
        return z;
    }

    public final boolean zzn() {
        zzjr zzjrVar = this.zzj;
        if (zzjrVar != null) {
            return !zzjrVar.zzf.zzi && zzjrVar.zzr() && this.zzj.zzf.zze != -9223372036854775807L && this.zzk < 100;
        }
        return true;
    }

    public final boolean zzo(zzcn zzcnVar, long j, long j2) {
        zzjs zzjsVar;
        boolean z;
        zzjr zzjrVar = null;
        for (zzjr zzjrVar2 = this.zzh; zzjrVar2 != null; zzjrVar2 = zzjrVar2.zzg()) {
            zzjs zzjsVar2 = zzjrVar2.zzf;
            if (zzjrVar == null) {
                zzjsVar = zzg(zzcnVar, zzjsVar2);
            } else {
                zzjs zzt = zzt(zzcnVar, zzjrVar, j);
                if (zzt == null) {
                    return !zzm(zzjrVar);
                } else if (zzjsVar2.zzb != zzt.zzb || !zzjsVar2.zza.equals(zzt.zza)) {
                    return !zzm(zzjrVar);
                } else {
                    zzjsVar = zzt;
                }
            }
            zzjrVar2.zzf = zzjsVar.zza(zzjsVar2.zzc);
            long j3 = zzjsVar2.zze;
            int i = (j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1));
            long j4 = zzjsVar.zze;
            if (i == 0 || j3 == j4) {
                zzjrVar = zzjrVar2;
            } else {
                zzjrVar2.zzq();
                long j5 = zzjsVar.zze;
                long zze = j5 == -9223372036854775807L ? LongCompanionObject.MAX_VALUE : j5 + zzjrVar2.zze();
                if (zzjrVar2 == this.zzi) {
                    boolean z2 = zzjrVar2.zzf.zzf;
                    if (j2 == Long.MIN_VALUE || j2 >= zze) {
                        z = true;
                        return zzm(zzjrVar2) && !z;
                    }
                }
                z = false;
                if (zzm(zzjrVar2)) {
                }
            }
        }
        return true;
    }

    public final boolean zzp(zzcn zzcnVar, int i) {
        this.zzf = i;
        return zzB(zzcnVar);
    }

    public final boolean zzq(zzcn zzcnVar, boolean z) {
        this.zzg = z;
        return zzB(zzcnVar);
    }

    public final zzjr zzr(zzko[] zzkoVarArr, zzwk zzwkVar, zzwt zzwtVar, zzkg zzkgVar, zzjs zzjsVar, zzwl zzwlVar) {
        zzjr zzjrVar = this.zzj;
        zzjr zzjrVar2 = new zzjr(zzkoVarArr, zzjrVar == null ? 1000000000000L : (zzjrVar.zze() + zzjrVar.zzf.zze) - zzjsVar.zzb, zzwkVar, zzwtVar, zzkgVar, zzjsVar, zzwlVar, null);
        zzjr zzjrVar3 = this.zzj;
        if (zzjrVar3 != null) {
            zzjrVar3.zzo(zzjrVar2);
        } else {
            this.zzh = zzjrVar2;
            this.zzi = zzjrVar2;
        }
        this.zzl = null;
        this.zzj = zzjrVar2;
        this.zzk++;
        zzy();
        return zzjrVar2;
    }
}
