package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zztv implements zzsq, zzzx, zzwy, zzxd, zzuh {
    private static final Map zzb;
    private static final zzaf zzc;
    private boolean zzA;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;
    private long zzG;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private boolean zzL;
    private final zzwx zzM;
    private final zzwt zzN;
    private final Uri zzd;
    private final zzfg zze;
    private final zzpz zzf;
    private final zztb zzg;
    private final zzpt zzh;
    private final zztr zzi;
    private final long zzj;
    private final zztl zzl;
    private zzsp zzq;
    private zzacy zzr;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zztu zzx;
    private zzaax zzy;
    private final zzxg zzk = new zzxg("ProgressiveMediaPeriod");
    private final zzdo zzm = new zzdo(zzdm.zza);
    private final Runnable zzn = new Runnable() { // from class: com.google.android.gms.internal.ads.zztm
        @Override // java.lang.Runnable
        public final void run() {
            zztv.this.zzT();
        }
    };
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zztn
        @Override // java.lang.Runnable
        public final void run() {
            zztv.this.zzD();
        }
    };
    private final Handler zzp = zzew.zzD(null);
    private zztt[] zzt = new zztt[0];
    private zzui[] zzs = new zzui[0];
    private long zzH = -9223372036854775807L;
    private long zzz = -9223372036854775807L;
    private int zzB = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzad zzadVar = new zzad();
        zzadVar.zzH("icy");
        zzadVar.zzS("application/x-icy");
        zzc = zzadVar.zzY();
    }

    public zztv(Uri uri, zzfg zzfgVar, zztl zztlVar, zzpz zzpzVar, zzpt zzptVar, zzwx zzwxVar, zztb zztbVar, zztr zztrVar, zzwt zzwtVar, String str, int i, byte[] bArr) {
        this.zzd = uri;
        this.zze = zzfgVar;
        this.zzf = zzpzVar;
        this.zzh = zzptVar;
        this.zzM = zzwxVar;
        this.zzg = zztbVar;
        this.zzi = zztrVar;
        this.zzN = zzwtVar;
        this.zzj = i;
        this.zzl = zztlVar;
    }

    private final int zzP() {
        int i = 0;
        for (zzui zzuiVar : this.zzs) {
            i += zzuiVar.zzc();
        }
        return i;
    }

    public final long zzQ(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (true) {
            zzui[] zzuiVarArr = this.zzs;
            if (i >= zzuiVarArr.length) {
                return j;
            }
            if (!z) {
                zztu zztuVar = this.zzx;
                Objects.requireNonNull(zztuVar);
                i = zztuVar.zzc[i] ? 0 : i + 1;
            }
            j = Math.max(j, zzuiVarArr[i].zzg());
        }
    }

    private final zzabb zzR(zztt zzttVar) {
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            if (zzttVar.equals(this.zzt[i])) {
                return this.zzs[i];
            }
        }
        zzui zzuiVar = new zzui(this.zzN, this.zzf, this.zzh, null);
        zzuiVar.zzu(this);
        int i2 = length + 1;
        zztt[] zzttVarArr = (zztt[]) Arrays.copyOf(this.zzt, i2);
        zzttVarArr[length] = zzttVar;
        this.zzt = (zztt[]) zzew.zzad(zzttVarArr);
        zzui[] zzuiVarArr = (zzui[]) Arrays.copyOf(this.zzs, i2);
        zzuiVarArr[length] = zzuiVar;
        this.zzs = (zzui[]) zzew.zzad(zzuiVarArr);
        return zzuiVar;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzS() {
        zzdl.zzf(this.zzv);
        Objects.requireNonNull(this.zzx);
        Objects.requireNonNull(this.zzy);
    }

    public final void zzT() {
        zzbq zzc2;
        int i;
        if (this.zzL || this.zzv || !this.zzu || this.zzy == null) {
            return;
        }
        for (zzui zzuiVar : this.zzs) {
            if (zzuiVar.zzh() == null) {
                return;
            }
        }
        this.zzm.zzc();
        int length = this.zzs.length;
        zzcp[] zzcpVarArr = new zzcp[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzaf zzh = this.zzs[i2].zzh();
            Objects.requireNonNull(zzh);
            String str = zzh.zzm;
            boolean zzg = zzbt.zzg(str);
            boolean z = zzg || zzbt.zzh(str);
            zArr[i2] = z;
            this.zzw = z | this.zzw;
            zzacy zzacyVar = this.zzr;
            if (zzacyVar != null) {
                if (zzg || this.zzt[i2].zzb) {
                    zzbq zzbqVar = zzh.zzk;
                    if (zzbqVar == null) {
                        zzc2 = new zzbq(-9223372036854775807L, zzacyVar);
                    } else {
                        zzc2 = zzbqVar.zzc(zzacyVar);
                    }
                    zzad zzb2 = zzh.zzb();
                    zzb2.zzM(zzc2);
                    zzh = zzb2.zzY();
                }
                if (zzg && zzh.zzg == -1 && zzh.zzh == -1 && (i = zzacyVar.zza) != -1) {
                    zzad zzb3 = zzh.zzb();
                    zzb3.zzv(i);
                    zzh = zzb3.zzY();
                }
            }
            zzcpVarArr[i2] = new zzcp(Integer.toString(i2), zzh.zzc(this.zzf.zza(zzh)));
        }
        this.zzx = new zztu(new zzur(zzcpVarArr), zArr);
        this.zzv = true;
        zzsp zzspVar = this.zzq;
        Objects.requireNonNull(zzspVar);
        zzspVar.zzi(this);
    }

    private final void zzU(int i) {
        zzS();
        zztu zztuVar = this.zzx;
        boolean[] zArr = zztuVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzaf zzb2 = zztuVar.zza.zzb(i).zzb(0);
        this.zzg.zzd(zzbt.zzb(zzb2.zzm), zzb2, 0, null, this.zzG);
        zArr[i] = true;
    }

    private final void zzV(int i) {
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzI && zArr[i] && !this.zzs[i].zzx(false)) {
            this.zzH = 0L;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0L;
            this.zzJ = 0;
            for (zzui zzuiVar : this.zzs) {
                zzuiVar.zzp(false);
            }
            zzsp zzspVar = this.zzq;
            Objects.requireNonNull(zzspVar);
            zzspVar.zzg(this);
        }
    }

    private final void zzW() {
        zzfl zzflVar;
        long j;
        long j2;
        zztq zztqVar = new zztq(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzv) {
            zzdl.zzf(zzX());
            long j3 = this.zzz;
            if (j3 == -9223372036854775807L || this.zzH <= j3) {
                zzaax zzaaxVar = this.zzy;
                Objects.requireNonNull(zzaaxVar);
                zztq.zzf(zztqVar, zzaaxVar.zzg(this.zzH).zza.zzc, this.zzH);
                for (zzui zzuiVar : this.zzs) {
                    zzuiVar.zzt(this.zzH);
                }
                this.zzH = -9223372036854775807L;
            } else {
                this.zzK = true;
                this.zzH = -9223372036854775807L;
                return;
            }
        }
        this.zzJ = zzP();
        long zza = this.zzk.zza(zztqVar, this, zzwx.zza(this.zzB));
        zzflVar = zztqVar.zzl;
        zztb zztbVar = this.zzg;
        j = zztqVar.zzb;
        zzsj zzsjVar = new zzsj(j, zzflVar, zzflVar.zza, Collections.emptyMap(), zza, 0L, 0L);
        j2 = zztqVar.zzk;
        zztbVar.zzl(zzsjVar, 1, -1, null, 0, null, j2, this.zzz);
    }

    private final boolean zzX() {
        return this.zzH != -9223372036854775807L;
    }

    private final boolean zzY() {
        return this.zzD || zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzzx
    public final void zzC() {
        this.zzu = true;
        this.zzp.post(this.zzn);
    }

    public final /* synthetic */ void zzE() {
        this.zzF = true;
    }

    final void zzG() throws IOException {
        this.zzk.zzi(zzwx.zza(this.zzB));
    }

    public final void zzH(int i) throws IOException {
        this.zzs[i].zzm();
        zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final /* bridge */ /* synthetic */ void zzI(zzxc zzxcVar, long j, long j2, boolean z) {
        zzgh zzghVar;
        long j3;
        zzfl zzflVar;
        long j4;
        long unused;
        zztq zztqVar = (zztq) zzxcVar;
        zzghVar = zztqVar.zzd;
        j3 = zztqVar.zzb;
        zzflVar = zztqVar.zzl;
        zzsj zzsjVar = new zzsj(j3, zzflVar, zzghVar.zzh(), zzghVar.zzi(), j, j2, zzghVar.zzg());
        unused = zztqVar.zzb;
        zztb zztbVar = this.zzg;
        j4 = zztqVar.zzk;
        zztbVar.zzf(zzsjVar, 1, -1, null, 0, null, j4, this.zzz);
        if (z) {
            return;
        }
        for (zzui zzuiVar : this.zzs) {
            zzuiVar.zzp(false);
        }
        if (this.zzE > 0) {
            zzsp zzspVar = this.zzq;
            Objects.requireNonNull(zzspVar);
            zzspVar.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final /* bridge */ /* synthetic */ void zzJ(zzxc zzxcVar, long j, long j2) {
        zzgh zzghVar;
        long j3;
        zzfl zzflVar;
        long j4;
        zzaax zzaaxVar;
        long unused;
        if (this.zzz == -9223372036854775807L && (zzaaxVar = this.zzy) != null) {
            boolean zzh = zzaaxVar.zzh();
            long zzQ = zzQ(true);
            long j5 = zzQ == Long.MIN_VALUE ? 0L : zzQ + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzz = j5;
            this.zzi.zza(j5, zzh, this.zzA);
        }
        zztq zztqVar = (zztq) zzxcVar;
        zzghVar = zztqVar.zzd;
        j3 = zztqVar.zzb;
        zzflVar = zztqVar.zzl;
        zzsj zzsjVar = new zzsj(j3, zzflVar, zzghVar.zzh(), zzghVar.zzi(), j, j2, zzghVar.zzg());
        unused = zztqVar.zzb;
        zztb zztbVar = this.zzg;
        j4 = zztqVar.zzk;
        zztbVar.zzh(zzsjVar, 1, -1, null, 0, null, j4, this.zzz);
        this.zzK = true;
        zzsp zzspVar = this.zzq;
        Objects.requireNonNull(zzspVar);
        zzspVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzK() {
        for (zzui zzuiVar : this.zzs) {
            zzuiVar.zzo();
        }
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final void zzL(zzaf zzafVar) {
        this.zzp.post(this.zzn);
    }

    public final void zzM() {
        if (this.zzv) {
            for (zzui zzuiVar : this.zzs) {
                zzuiVar.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzq = null;
        this.zzL = true;
    }

    @Override // com.google.android.gms.internal.ads.zzzx
    public final void zzN(final zzaax zzaaxVar) {
        this.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zztp
            @Override // java.lang.Runnable
            public final void run() {
                zztv.this.zzF(zzaaxVar);
            }
        });
    }

    public final boolean zzO(int i) {
        return !zzY() && this.zzs[i].zzx(this.zzK);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zza(long j, zzkq zzkqVar) {
        long j2;
        zzS();
        if (this.zzy.zzh()) {
            zzaav zzg = this.zzy.zzg(j);
            long j3 = zzg.zza.zzb;
            long j4 = zzg.zzb.zzb;
            long j5 = zzkqVar.zzf;
            if (j5 != 0) {
                j2 = j5;
            } else if (zzkqVar.zzg == 0) {
                return j;
            } else {
                j2 = 0;
            }
            long zzx = zzew.zzx(j, j2, Long.MIN_VALUE);
            long zzq = zzew.zzq(j, zzkqVar.zzg, LongCompanionObject.MAX_VALUE);
            boolean z = true;
            boolean z2 = zzx <= j3 && j3 <= zzq;
            z = (zzx > j4 || j4 > zzq) ? false : false;
            if (z2 && z) {
                if (Math.abs(j3 - j) > Math.abs(j4 - j)) {
                    return j4;
                }
            } else if (!z2) {
                return z ? j4 : zzx;
            }
            return j3;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final long zzb() {
        long j;
        zzS();
        if (this.zzK || this.zzE == 0) {
            return Long.MIN_VALUE;
        }
        if (zzX()) {
            return this.zzH;
        }
        if (this.zzw) {
            int length = this.zzs.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zztu zztuVar = this.zzx;
                if (zztuVar.zzb[i] && zztuVar.zzc[i] && !this.zzs[i].zzw()) {
                    j = Math.min(j, this.zzs[i].zzg());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            j = zzQ(false);
        }
        return j == Long.MIN_VALUE ? this.zzG : j;
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zzd() {
        if (this.zzD) {
            if (this.zzK || zzP() > this.zzJ) {
                this.zzD = false;
                return this.zzG;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zze(long j) {
        int i;
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (true != this.zzy.zzh()) {
            j = 0;
        }
        this.zzD = false;
        this.zzG = j;
        if (zzX()) {
            this.zzH = j;
            return j;
        }
        if (this.zzB != 7) {
            int length = this.zzs.length;
            while (i < length) {
                i = (this.zzs[i].zzy(j, false) || (!zArr[i] && this.zzw)) ? i + 1 : 0;
            }
            return j;
        }
        this.zzI = false;
        this.zzH = j;
        this.zzK = false;
        zzxg zzxgVar = this.zzk;
        if (zzxgVar.zzl()) {
            for (zzui zzuiVar : this.zzs) {
                zzuiVar.zzj();
            }
            this.zzk.zzg();
        } else {
            zzxgVar.zzh();
            for (zzui zzuiVar2 : this.zzs) {
                zzuiVar2.zzp(false);
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x003c, code lost:
        if (r2 == 0) goto L77;
     */
    @Override // com.google.android.gms.internal.ads.zzsq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzf(com.google.android.gms.internal.ads.zzwe[] r8, boolean[] r9, com.google.android.gms.internal.ads.zzuj[] r10, boolean[] r11, long r12) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztv.zzf(com.google.android.gms.internal.ads.zzwe[], boolean[], com.google.android.gms.internal.ads.zzuj[], boolean[], long):long");
    }

    public final int zzg(int i, zzjo zzjoVar, zzgr zzgrVar, int i2) {
        if (zzY()) {
            return -3;
        }
        zzU(i);
        int zzd = this.zzs[i].zzd(zzjoVar, zzgrVar, i2, this.zzK);
        if (zzd == -3) {
            zzV(i);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final zzur zzh() {
        zzS();
        return this.zzx.zza;
    }

    public final int zzi(int i, long j) {
        if (zzY()) {
            return 0;
        }
        zzU(i);
        zzui zzuiVar = this.zzs[i];
        int zzb2 = zzuiVar.zzb(j, this.zzK);
        zzuiVar.zzv(zzb2);
        if (zzb2 == 0) {
            zzV(i);
            return 0;
        }
        return zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzj(long j, boolean z) {
        zzS();
        if (zzX()) {
            return;
        }
        boolean[] zArr = this.zzx.zzc;
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            this.zzs[i].zzi(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzk() throws IOException {
        zzG();
        if (this.zzK && !this.zzv) {
            throw zzbu.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzl(zzsp zzspVar, long j) {
        this.zzq = zzspVar;
        this.zzm.zze();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final void zzm(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final boolean zzo(long j) {
        if (this.zzK || this.zzk.zzk() || this.zzI) {
            return false;
        }
        if (this.zzv && this.zzE == 0) {
            return false;
        }
        boolean zze = this.zzm.zze();
        if (this.zzk.zzl()) {
            return zze;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0070  */
    @Override // com.google.android.gms.internal.ads.zzwy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzxa zzt(com.google.android.gms.internal.ads.zzxc r28, long r29, long r31, java.io.IOException r33, int r34) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztv.zzt(com.google.android.gms.internal.ads.zzxc, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzxa");
    }

    public final zzabb zzu() {
        return zzR(new zztt(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzzx
    public final zzabb zzv(int i, int i2) {
        return zzR(new zztt(i, false));
    }

    public final /* synthetic */ void zzD() {
        if (this.zzL) {
            return;
        }
        zzsp zzspVar = this.zzq;
        Objects.requireNonNull(zzspVar);
        zzspVar.zzg(this);
    }

    public final /* synthetic */ void zzF(zzaax zzaaxVar) {
        this.zzy = this.zzr == null ? zzaaxVar : new zzaaw(-9223372036854775807L, 0L);
        this.zzz = zzaaxVar.zze();
        boolean z = false;
        if (!this.zzF && zzaaxVar.zze() == -9223372036854775807L) {
            z = true;
        }
        this.zzA = z;
        this.zzB = true == z ? 7 : 1;
        this.zzi.zza(this.zzz, zzaaxVar.zzh(), this.zzA);
        if (this.zzv) {
            return;
        }
        zzT();
    }
}
