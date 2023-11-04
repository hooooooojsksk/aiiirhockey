package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.games.GamesStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzjc extends zzm implements zzhu {
    public static final /* synthetic */ int zzd = 0;
    private final zzkz zzA;
    private final zzla zzB;
    private final long zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private int zzG;
    private zzkq zzH;
    private zzcc zzI;
    private zzbm zzJ;
    private zzbm zzK;
    private zzaf zzL;
    private zzaf zzM;
    private AudioTrack zzN;
    private Object zzO;
    private Surface zzP;
    private int zzQ;
    private zzeo zzR;
    private zzhb zzS;
    private zzhb zzT;
    private int zzU;
    private zzk zzV;
    private float zzW;
    private boolean zzX;
    private zzdk zzY;
    private boolean zzZ;
    private boolean zzaa;
    private zzt zzab;
    private zzda zzac;
    private zzbm zzad;
    private zzkh zzae;
    private int zzaf;
    private long zzag;
    private final zzip zzah;
    private zzum zzai;
    final zzwl zzb;
    final zzcc zzc;
    private final zzdo zze;
    private final Context zzf;
    private final zzcg zzg;
    private final zzkn[] zzh;
    private final zzwk zzi;
    private final zzdv zzj;
    private final zzjm zzk;
    private final zzeb zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzck zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzsr zzq;
    private final zzlb zzr;
    private final Looper zzs;
    private final zzws zzt;
    private final zzdm zzu;
    private final zziy zzv;
    private final zzja zzw;
    private final zzgv zzx;
    private final zzgz zzy;
    private final zzky zzz;

    static {
        zzbh.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.zzwr, java.lang.Object, com.google.android.gms.internal.ads.zzlb] */
    public zzjc(zzht zzhtVar, zzcg zzcgVar) {
        zzno zza;
        Object obj;
        zzdo zzdoVar = new zzdo(zzdm.zza);
        this.zze = zzdoVar;
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzew.zze;
            zzee.zzd("ExoPlayerImpl", "Init " + hexString + " [AndroidXMedia3/1.0.0-beta03] [" + str + "]");
            Context applicationContext = zzhtVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? apply = zzhtVar.zzh.apply(zzhtVar.zzb);
            this.zzr = apply;
            this.zzV = zzhtVar.zzj;
            this.zzQ = zzhtVar.zzk;
            this.zzX = false;
            this.zzC = zzhtVar.zzo;
            zziy zziyVar = new zziy(this, null);
            this.zzv = zziyVar;
            zzja zzjaVar = new zzja(null);
            this.zzw = zzjaVar;
            Handler handler = new Handler(zzhtVar.zzi);
            zzkn[] zza2 = ((zzhn) zzhtVar.zzc).zza.zza(handler, zziyVar, zziyVar, zziyVar, zziyVar);
            this.zzh = zza2;
            int length = zza2.length;
            zzwk zzwkVar = (zzwk) zzhtVar.zze.zza();
            this.zzi = zzwkVar;
            this.zzq = zzht.zza(((zzho) zzhtVar.zzd).zza);
            zzww zzg = zzww.zzg(((zzhr) zzhtVar.zzg).zza);
            this.zzt = zzg;
            this.zzp = zzhtVar.zzl;
            this.zzH = zzhtVar.zzm;
            Looper looper = zzhtVar.zzi;
            this.zzs = looper;
            zzdm zzdmVar = zzhtVar.zzb;
            this.zzu = zzdmVar;
            this.zzg = zzcgVar;
            zzeb zzebVar = new zzeb(looper, zzdmVar, new zzdz() { // from class: com.google.android.gms.internal.ads.zzio
                @Override // com.google.android.gms.internal.ads.zzdz
                public final void zza(Object obj2, zzaa zzaaVar) {
                    zzcd zzcdVar = (zzcd) obj2;
                }
            });
            this.zzl = zzebVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzai = new zzum(0);
            int length2 = zza2.length;
            zzwl zzwlVar = new zzwl(new zzkp[2], new zzwe[2], zzcy.zza, null);
            this.zzb = zzwlVar;
            this.zzn = new zzck();
            zzca zzcaVar = new zzca();
            zzcaVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            zzwkVar.zzl();
            zzcaVar.zzd(29, true);
            zzcc zze = zzcaVar.zze();
            this.zzc = zze;
            zzca zzcaVar2 = new zzca();
            zzcaVar2.zzb(zze);
            zzcaVar2.zza(4);
            zzcaVar2.zza(10);
            this.zzI = zzcaVar2.zze();
            this.zzj = zzdmVar.zzb(looper, null);
            zzip zzipVar = new zzip(this);
            this.zzah = zzipVar;
            this.zzae = zzkh.zzg(zzwlVar);
            apply.zzS(zzcgVar, looper);
            if (zzew.zza < 31) {
                zza = new zzno();
            } else {
                zza = zzir.zza(applicationContext, this, zzhtVar.zzp);
            }
            this.zzk = new zzjm(zza2, zzwkVar, zzwlVar, (zzjp) zzhtVar.zzf.zza(), zzg, 0, false, apply, this.zzH, zzhtVar.zzr, zzhtVar.zzn, false, looper, zzdmVar, zzipVar, zza, null, null);
            this.zzW = 1.0f;
            this.zzJ = zzbm.zza;
            zzbm zzbmVar = zzbm.zza;
            this.zzK = zzbmVar;
            this.zzad = zzbmVar;
            this.zzaf = -1;
            if (zzew.zza >= 21) {
                this.zzU = zzew.zzi(applicationContext);
                obj = null;
            } else {
                AudioTrack audioTrack = this.zzN;
                if (audioTrack == null || audioTrack.getAudioSessionId() == 0) {
                    obj = null;
                } else {
                    this.zzN.release();
                    obj = null;
                    this.zzN = null;
                }
                if (this.zzN == null) {
                    this.zzN = new AudioTrack(3, GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND, 4, 2, 2, 0, 0);
                }
                this.zzU = this.zzN.getAudioSessionId();
            }
            this.zzY = zzdk.zza;
            this.zzZ = true;
            Objects.requireNonNull(apply);
            zzebVar.zzb(apply);
            zzg.zze(new Handler(looper), apply);
            copyOnWriteArraySet.add(zziyVar);
            this.zzx = new zzgv(zzhtVar.zza, handler, zziyVar);
            this.zzy = new zzgz(zzhtVar.zza, handler, zziyVar);
            zzew.zzU(obj, obj);
            zzky zzkyVar = new zzky(zzhtVar.zza, handler, zziyVar);
            this.zzz = zzkyVar;
            int i = this.zzV.zzc;
            zzkyVar.zzf(3);
            this.zzA = new zzkz(zzhtVar.zza);
            this.zzB = new zzla(zzhtVar.zza);
            this.zzab = zzal(zzkyVar);
            this.zzac = zzda.zza;
            this.zzR = zzeo.zza;
            zzwkVar.zzi(this.zzV);
            zzap(1, 10, Integer.valueOf(this.zzU));
            zzap(2, 10, Integer.valueOf(this.zzU));
            zzap(1, 3, this.zzV);
            zzap(2, 4, Integer.valueOf(this.zzQ));
            zzap(2, 5, 0);
            zzap(1, 9, Boolean.valueOf(this.zzX));
            zzap(2, 7, zzjaVar);
            zzap(6, 8, zzjaVar);
            zzdoVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    public static /* bridge */ /* synthetic */ void zzW(zzjc zzjcVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzjcVar.zzar(surface);
        zzjcVar.zzP = surface;
    }

    private final int zzaf() {
        if (this.zzae.zza.zzo()) {
            return this.zzaf;
        }
        zzkh zzkhVar = this.zzae;
        return zzkhVar.zza.zzn(zzkhVar.zzb.zza, this.zzn).zzd;
    }

    public static int zzag(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    private final long zzah(zzkh zzkhVar) {
        if (zzkhVar.zza.zzo()) {
            return zzew.zzv(this.zzag);
        }
        if (zzkhVar.zzb.zzb()) {
            return zzkhVar.zzr;
        }
        zzcn zzcnVar = zzkhVar.zza;
        zzss zzssVar = zzkhVar.zzb;
        long j = zzkhVar.zzr;
        zzaj(zzcnVar, zzssVar, j);
        return j;
    }

    private static long zzai(zzkh zzkhVar) {
        zzcm zzcmVar = new zzcm();
        zzck zzckVar = new zzck();
        zzkhVar.zza.zzn(zzkhVar.zzb.zza, zzckVar);
        long j = zzkhVar.zzc;
        if (j == -9223372036854775807L) {
            long j2 = zzkhVar.zza.zze(zzckVar.zzd, zzcmVar, 0L).zzm;
            return 0L;
        }
        return j;
    }

    private final long zzaj(zzcn zzcnVar, zzss zzssVar, long j) {
        zzcnVar.zzn(zzssVar.zza, this.zzn);
        return j;
    }

    private final Pair zzak(zzcn zzcnVar, int i, long j) {
        if (zzcnVar.zzo()) {
            this.zzaf = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzag = j;
            return null;
        }
        if (i == -1 || i >= zzcnVar.zzc()) {
            i = zzcnVar.zzg(false);
            long j2 = zzcnVar.zze(i, this.zza, 0L).zzm;
            j = zzew.zzz(0L);
        }
        return zzcnVar.zzl(this.zza, this.zzn, i, zzew.zzv(j));
    }

    public static zzt zzal(zzky zzkyVar) {
        return new zzt(0, zzkyVar.zzb(), zzkyVar.zza());
    }

    private final zzkh zzam(zzkh zzkhVar, zzcn zzcnVar, Pair pair) {
        zzss zzssVar;
        zzwl zzwlVar;
        zzkh zzb;
        zzdl.zzd(zzcnVar.zzo() || pair != null);
        zzcn zzcnVar2 = zzkhVar.zza;
        zzkh zzf = zzkhVar.zzf(zzcnVar);
        if (zzcnVar.zzo()) {
            zzss zzh = zzkh.zzh();
            long zzv = zzew.zzv(this.zzag);
            zzkh zza = zzf.zzb(zzh, zzv, zzv, zzv, 0L, zzur.zza, this.zzb, zzfqk.zzo()).zza(zzh);
            zza.zzp = zza.zzr;
            return zza;
        }
        Object obj = zzf.zzb.zza;
        int i = zzew.zza;
        boolean z = !obj.equals(pair.first);
        zzss zzssVar2 = z ? new zzss(pair.first) : zzf.zzb;
        long longValue = ((Long) pair.second).longValue();
        long zzv2 = zzew.zzv(zzm());
        if (!zzcnVar2.zzo()) {
            zzcnVar2.zzn(obj, this.zzn);
        }
        if (z || longValue < zzv2) {
            zzdl.zzf(!zzssVar2.zzb());
            zzur zzurVar = z ? zzur.zza : zzf.zzh;
            if (z) {
                zzssVar = zzssVar2;
                zzwlVar = this.zzb;
            } else {
                zzssVar = zzssVar2;
                zzwlVar = zzf.zzi;
            }
            zzkh zza2 = zzf.zzb(zzssVar, longValue, longValue, longValue, 0L, zzurVar, zzwlVar, z ? zzfqk.zzo() : zzf.zzj).zza(zzssVar);
            zza2.zzp = longValue;
            return zza2;
        }
        if (longValue == zzv2) {
            int zza3 = zzcnVar.zza(zzf.zzk.zza);
            if (zza3 != -1 && zzcnVar.zzd(zza3, this.zzn, false).zzd == zzcnVar.zzn(zzssVar2.zza, this.zzn).zzd) {
                return zzf;
            }
            zzcnVar.zzn(zzssVar2.zza, this.zzn);
            long zzg = zzssVar2.zzb() ? this.zzn.zzg(zzssVar2.zzb, zzssVar2.zzc) : this.zzn.zze;
            zzb = zzf.zzb(zzssVar2, zzf.zzr, zzf.zzr, zzf.zzd, zzg - zzf.zzr, zzf.zzh, zzf.zzi, zzf.zzj).zza(zzssVar2);
            zzb.zzp = zzg;
        } else {
            zzdl.zzf(!zzssVar2.zzb());
            long max = Math.max(0L, zzf.zzq - (longValue - zzv2));
            long j = zzf.zzp;
            if (zzf.zzk.equals(zzf.zzb)) {
                j = longValue + max;
            }
            zzb = zzf.zzb(zzssVar2, longValue, longValue, longValue, max, zzf.zzh, zzf.zzi, zzf.zzj);
            zzb.zzp = j;
        }
        return zzb;
    }

    private final zzkk zzan(zzkj zzkjVar) {
        int zzaf = zzaf();
        zzjm zzjmVar = this.zzk;
        return new zzkk(zzjmVar, zzkjVar, this.zzae.zza, zzaf == -1 ? 0 : zzaf, this.zzu, zzjmVar.zzb());
    }

    public final void zzao(final int i, final int i2) {
        if (i == this.zzR.zzb() && i2 == this.zzR.zza()) {
            return;
        }
        this.zzR = new zzeo(i, i2);
        zzeb zzebVar = this.zzl;
        zzebVar.zzd(24, new zzdy() { // from class: com.google.android.gms.internal.ads.zzhw
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                int i3 = i;
                int i4 = i2;
                int i5 = zzjc.zzd;
                ((zzcd) obj).zzr(i3, i4);
            }
        });
        zzebVar.zzc();
        zzap(2, 13, new zzeo(i, i2));
    }

    private final void zzap(int i, int i2, Object obj) {
        zzkn[] zzknVarArr = this.zzh;
        int length = zzknVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzkn zzknVar = zzknVarArr[i3];
            if (zzknVar.zzb() == i) {
                zzkk zzan = zzan(zzknVar);
                zzan.zzf(i2);
                zzan.zze(obj);
                zzan.zzd();
            }
        }
    }

    public final void zzaq() {
        zzap(1, 2, Float.valueOf(this.zzW * this.zzy.zza()));
    }

    public final void zzar(Object obj) {
        boolean z;
        ArrayList<zzkk> arrayList = new ArrayList();
        zzkn[] zzknVarArr = this.zzh;
        int length = zzknVarArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= 2) {
                break;
            }
            zzkn zzknVar = zzknVarArr[i];
            if (zzknVar.zzb() == 2) {
                zzkk zzan = zzan(zzknVar);
                zzan.zzf(1);
                zzan.zze(obj);
                zzan.zzd();
                arrayList.add(zzan);
            }
            i++;
        }
        Object obj2 = this.zzO;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                for (zzkk zzkkVar : arrayList) {
                    zzkkVar.zzi(this.zzC);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.zzO;
            Surface surface = this.zzP;
            if (obj3 == surface) {
                surface.release();
                this.zzP = null;
            }
        }
        this.zzO = obj;
        if (z) {
            zzas(false, zzhj.zzd(new zzjn(3), 1003));
        }
    }

    private final void zzas(boolean z, zzhj zzhjVar) {
        zzkh zzkhVar = this.zzae;
        zzkh zza = zzkhVar.zza(zzkhVar.zzb);
        zza.zzp = zza.zzr;
        zza.zzq = 0L;
        zzkh zze = zza.zze(1);
        if (zzhjVar != null) {
            zze = zze.zzd(zzhjVar);
        }
        zzkh zzkhVar2 = zze;
        this.zzD++;
        this.zzk.zzo();
        zzau(zzkhVar2, 0, 1, false, zzkhVar2.zza.zzo() && !this.zzae.zza.zzo(), 4, zzah(zzkhVar2), -1, false);
    }

    public final void zzat(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        zzkh zzkhVar = this.zzae;
        if (zzkhVar.zzl == z2 && zzkhVar.zzm == i3) {
            return;
        }
        this.zzD++;
        zzkh zzc = zzkhVar.zzc(z2, i3);
        this.zzk.zzn(z2, i3);
        zzau(zzc, 0, i2, false, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:378:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzau(final com.google.android.gms.internal.ads.zzkh r42, final int r43, final int r44, boolean r45, boolean r46, final int r47, long r48, int r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 997
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjc.zzau(com.google.android.gms.internal.ads.zzkh, int, int, boolean, boolean, int, long, int, boolean):void");
    }

    public final void zzav() {
        int zzi = zzi();
        if (zzi == 2 || zzi == 3) {
            zzaw();
            boolean z = this.zzae.zzo;
            zzy();
            zzy();
        }
    }

    private final void zzaw() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String zzI = zzew.zzI("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (this.zzZ) {
                throw new IllegalStateException(zzI);
            }
            zzee.zzf("ExoPlayerImpl", zzI, this.zzaa ? null : new IllegalStateException());
            this.zzaa = true;
        }
    }

    public static boolean zzax(zzkh zzkhVar) {
        return zzkhVar.zze == 3 && zzkhVar.zzl && zzkhVar.zzm == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzA() {
        zzaw();
        return this.zzae.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final int zzB() {
        zzaw();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final void zzD(zzle zzleVar) {
        zzaw();
        this.zzr.zzR(zzleVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final void zzE(zzsu zzsuVar) {
        zzaw();
        List singletonList = Collections.singletonList(zzsuVar);
        zzaw();
        zzaw();
        zzaf();
        zzn();
        this.zzD++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzo.remove(i);
            }
            this.zzai = this.zzai.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            zzke zzkeVar = new zzke((zzsu) singletonList.get(i2), this.zzp);
            arrayList.add(zzkeVar);
            this.zzo.add(i2, new zzjb(zzkeVar.zzb, zzkeVar.zza.zzB()));
        }
        this.zzai = this.zzai.zzg(0, arrayList.size());
        zzkl zzklVar = new zzkl(this.zzo, this.zzai, null);
        if (zzklVar.zzo() || zzklVar.zzc() >= 0) {
            int zzg = zzklVar.zzg(false);
            zzkh zzam = zzam(this.zzae, zzklVar, zzak(zzklVar, zzg, -9223372036854775807L));
            int i3 = zzam.zze;
            if (zzg != -1 && i3 != 1) {
                i3 = (zzklVar.zzo() || zzg >= zzklVar.zzc()) ? 4 : 2;
            }
            zzkh zze = zzam.zze(i3);
            this.zzk.zzq(arrayList, zzg, zzew.zzv(-9223372036854775807L), this.zzai);
            zzau(zze, 0, 1, false, (this.zzae.zzb.zza.equals(zze.zzb.zza) || this.zzae.zza.zzo()) ? false : true, 4, zzah(zze), -1, false);
            return;
        }
        throw new zzag(zzklVar, -1, -9223372036854775807L);
    }

    public final zzhj zzJ() {
        zzaw();
        return this.zzae.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final void zza(int i, long j, int i2, boolean z) {
        zzaw();
        zzdl.zzd(i >= 0);
        this.zzr.zzx();
        zzcn zzcnVar = this.zzae.zza;
        if (zzcnVar.zzo() || i < zzcnVar.zzc()) {
            this.zzD++;
            if (zzA()) {
                zzee.zze("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzjk zzjkVar = new zzjk(this.zzae);
                zzjkVar.zza(1);
                this.zzah.zza.zzab(zzjkVar);
                return;
            }
            int i3 = zzi() != 1 ? 2 : 1;
            int zzg = zzg();
            zzkh zzam = zzam(this.zzae.zze(i3), zzcnVar, zzak(zzcnVar, i, j));
            this.zzk.zzl(zzcnVar, i, zzew.zzv(j));
            zzau(zzam, 0, 1, true, true, 1, zzah(zzam), zzg, false);
        }
    }

    public final /* synthetic */ void zzaa(zzjk zzjkVar) {
        long j;
        boolean z;
        long j2;
        int i = this.zzD - zzjkVar.zzb;
        this.zzD = i;
        boolean z2 = true;
        if (zzjkVar.zzc) {
            this.zzE = zzjkVar.zzd;
            this.zzF = true;
        }
        if (zzjkVar.zze) {
            this.zzG = zzjkVar.zzf;
        }
        if (i == 0) {
            zzcn zzcnVar = zzjkVar.zza.zza;
            if (!this.zzae.zza.zzo() && zzcnVar.zzo()) {
                this.zzaf = -1;
                this.zzag = 0L;
            }
            if (!zzcnVar.zzo()) {
                List zzw = ((zzkl) zzcnVar).zzw();
                zzdl.zzf(zzw.size() == this.zzo.size());
                for (int i2 = 0; i2 < zzw.size(); i2++) {
                    ((zzjb) this.zzo.get(i2)).zzb = (zzcn) zzw.get(i2);
                }
            }
            if (this.zzF) {
                if (zzjkVar.zza.zzb.equals(this.zzae.zzb) && zzjkVar.zza.zzd == this.zzae.zzr) {
                    z2 = false;
                }
                if (z2) {
                    if (zzcnVar.zzo() || zzjkVar.zza.zzb.zzb()) {
                        j2 = zzjkVar.zza.zzd;
                    } else {
                        zzkh zzkhVar = zzjkVar.zza;
                        zzss zzssVar = zzkhVar.zzb;
                        j2 = zzkhVar.zzd;
                        zzaj(zzcnVar, zzssVar, j2);
                    }
                    z = z2;
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                    z = z2;
                }
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.zzF = false;
            zzau(zzjkVar.zza, 1, this.zzG, false, z, this.zzE, j, -1, false);
        }
    }

    public final /* synthetic */ void zzab(final zzjk zzjkVar) {
        this.zzj.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zziq
            @Override // java.lang.Runnable
            public final void run() {
                zzjc.this.zzaa(zzjkVar);
            }
        });
    }

    public final /* synthetic */ void zzac(zzcd zzcdVar) {
        zzcdVar.zza(this.zzI);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zze() {
        zzaw();
        if (zzA()) {
            return this.zzae.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzf() {
        zzaw();
        if (zzA()) {
            return this.zzae.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzg() {
        zzaw();
        int zzaf = zzaf();
        if (zzaf == -1) {
            return 0;
        }
        return zzaf;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzh() {
        zzaw();
        if (this.zzae.zza.zzo()) {
            return 0;
        }
        zzkh zzkhVar = this.zzae;
        return zzkhVar.zza.zza(zzkhVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzi() {
        zzaw();
        return this.zzae.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzj() {
        zzaw();
        return this.zzae.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzk() {
        zzaw();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zzl() {
        zzaw();
        if (!zzA()) {
            zzaw();
            if (this.zzae.zza.zzo()) {
                return this.zzag;
            }
            zzkh zzkhVar = this.zzae;
            long j = 0;
            if (zzkhVar.zzk.zzd != zzkhVar.zzb.zzd) {
                return zzew.zzz(zzkhVar.zza.zze(zzg(), this.zza, 0L).zzn);
            }
            long j2 = zzkhVar.zzp;
            if (this.zzae.zzk.zzb()) {
                zzkh zzkhVar2 = this.zzae;
                zzkhVar2.zza.zzn(zzkhVar2.zzk.zza, this.zzn).zzh(this.zzae.zzk.zzb);
            } else {
                j = j2;
            }
            zzkh zzkhVar3 = this.zzae;
            zzaj(zzkhVar3.zza, zzkhVar3.zzk, j);
            return zzew.zzz(j);
        }
        zzkh zzkhVar4 = this.zzae;
        if (zzkhVar4.zzk.equals(zzkhVar4.zzb)) {
            return zzew.zzz(this.zzae.zzp);
        }
        return zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zzm() {
        zzaw();
        if (zzA()) {
            zzkh zzkhVar = this.zzae;
            zzkhVar.zza.zzn(zzkhVar.zzb.zza, this.zzn);
            zzkh zzkhVar2 = this.zzae;
            if (zzkhVar2.zzc != -9223372036854775807L) {
                int i = zzew.zza;
                return zzew.zzz(this.zzae.zzc) + zzew.zzz(0L);
            }
            long j = zzkhVar2.zza.zze(zzg(), this.zza, 0L).zzm;
            return zzew.zzz(0L);
        }
        return zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zzn() {
        zzaw();
        return zzew.zzz(zzah(this.zzae));
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zzo() {
        zzaw();
        if (!zzA()) {
            zzcn zzq = zzq();
            if (zzq.zzo()) {
                return -9223372036854775807L;
            }
            return zzew.zzz(zzq.zze(zzg(), this.zza, 0L).zzn);
        }
        zzkh zzkhVar = this.zzae;
        zzss zzssVar = zzkhVar.zzb;
        zzkhVar.zza.zzn(zzssVar.zza, this.zzn);
        return zzew.zzz(this.zzn.zzg(zzssVar.zzb, zzssVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zzp() {
        zzaw();
        return zzew.zzz(this.zzae.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzcn zzq() {
        zzaw();
        return this.zzae.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzcy zzr() {
        zzaw();
        return this.zzae.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzs() {
        zzaw();
        boolean zzy = zzy();
        int zzb = this.zzy.zzb(zzy, 2);
        zzat(zzy, zzb, zzag(zzy, zzb));
        zzkh zzkhVar = this.zzae;
        if (zzkhVar.zze != 1) {
            return;
        }
        zzkh zzd2 = zzkhVar.zzd(null);
        zzkh zze = zzd2.zze(true == zzd2.zza.zzo() ? 4 : 2);
        this.zzD++;
        this.zzk.zzk();
        zzau(zze, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzt() {
        AudioTrack audioTrack;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzew.zze;
        String zza = zzbh.zza();
        zzee.zzd("ExoPlayerImpl", "Release " + hexString + " [AndroidXMedia3/1.0.0-beta03] [" + str + "] [" + zza + "]");
        zzaw();
        if (zzew.zza < 21 && (audioTrack = this.zzN) != null) {
            audioTrack.release();
            this.zzN = null;
        }
        this.zzz.zze();
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzeb zzebVar = this.zzl;
            zzebVar.zzd(10, new zzdy() { // from class: com.google.android.gms.internal.ads.zzhv
                @Override // com.google.android.gms.internal.ads.zzdy
                public final void zza(Object obj) {
                    ((zzcd) obj).zzl(zzhj.zzd(new zzjn(1), 1003));
                }
            });
            zzebVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzt.zzf(this.zzr);
        zzkh zze = this.zzae.zze(1);
        this.zzae = zze;
        zzkh zza2 = zze.zza(zze.zzb);
        this.zzae = zza2;
        zza2.zzp = zza2.zzr;
        this.zzae.zzq = 0L;
        this.zzr.zzQ();
        this.zzi.zzh();
        Surface surface = this.zzP;
        if (surface != null) {
            surface.release();
            this.zzP = null;
        }
        this.zzY = zzdk.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzu(boolean z) {
        zzaw();
        int zzb = this.zzy.zzb(z, zzi());
        zzat(z, zzb, zzag(z, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzv(Surface surface) {
        zzaw();
        zzar(surface);
        int i = surface == null ? 0 : -1;
        zzao(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzw(float f) {
        zzaw();
        final float zza = zzew.zza(f, 0.0f, 1.0f);
        if (this.zzW == zza) {
            return;
        }
        this.zzW = zza;
        zzaq();
        zzeb zzebVar = this.zzl;
        zzebVar.zzd(22, new zzdy() { // from class: com.google.android.gms.internal.ads.zzim
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                float f2 = zza;
                int i = zzjc.zzd;
                ((zzcd) obj).zzv(f2);
            }
        });
        zzebVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzx() {
        zzaw();
        zzaw();
        this.zzy.zzb(zzy(), 1);
        zzas(false, null);
        this.zzY = new zzdk(zzfqk.zzo(), this.zzae.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzy() {
        zzaw();
        return this.zzae.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzz() {
        zzaw();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final void zzC(zzle zzleVar) {
        zzlb zzlbVar = this.zzr;
        Objects.requireNonNull(zzleVar);
        zzlbVar.zzw(zzleVar);
    }
}
