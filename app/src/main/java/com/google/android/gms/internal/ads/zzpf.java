package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzpf implements zzoi {
    private static final Object zza = new Object();
    private static ExecutorService zzb;
    private static int zzc;
    private long zzA;
    private long zzB;
    private long zzC;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private long zzG;
    private float zzH;
    private ByteBuffer zzI;
    private int zzJ;
    private ByteBuffer zzK;
    private byte[] zzL;
    private int zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private int zzR;
    private zzl zzS;
    private zzor zzT;
    private long zzU;
    private boolean zzV;
    private boolean zzW;
    private final zzov zzX;
    private final zznq zzd;
    private final zzon zze;
    private final zzpo zzf;
    private final zzfqk zzg;
    private final zzfqk zzh;
    private final zzdo zzi;
    private final zzom zzj;
    private final ArrayDeque zzk;
    private zzpd zzl;
    private final zzoy zzm;
    private final zzoy zzn;
    private final zzos zzo;
    private zzno zzp;
    private zzof zzq;
    private zzou zzr;
    private zzou zzs;
    private zzdb zzt;
    private AudioTrack zzu;
    private zzk zzv;
    private zzox zzw;
    private zzox zzx;
    private final zzby zzy;
    private long zzz;

    public /* synthetic */ zzpf(zzot zzotVar, zzpe zzpeVar) {
        zznq zznqVar;
        zzov zzovVar;
        zznqVar = zzotVar.zzb;
        this.zzd = zznqVar;
        zzovVar = zzotVar.zzc;
        this.zzX = zzovVar;
        int i = zzew.zza;
        this.zzo = zzotVar.zza;
        zzdo zzdoVar = new zzdo(zzdm.zza);
        this.zzi = zzdoVar;
        zzdoVar.zze();
        this.zzj = new zzom(new zzpa(this, null));
        zzon zzonVar = new zzon();
        this.zze = zzonVar;
        zzpo zzpoVar = new zzpo();
        this.zzf = zzpoVar;
        this.zzg = zzfqk.zzr(new zzdi(), zzonVar, zzpoVar);
        this.zzh = zzfqk.zzp(new zzpn());
        this.zzH = 1.0f;
        this.zzv = zzk.zza;
        this.zzR = 0;
        this.zzS = new zzl(0, 0.0f);
        this.zzx = new zzox(zzby.zza, false, 0L, 0L, null);
        this.zzy = zzby.zza;
        this.zzk = new ArrayDeque();
        this.zzm = new zzoy(100L);
        this.zzn = new zzoy(100L);
    }

    public static /* synthetic */ void zzD(AudioTrack audioTrack, zzdo zzdoVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            zzdoVar.zze();
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            zzdoVar.zze();
            synchronized (zza) {
                int i2 = zzc - 1;
                zzc = i2;
                if (i2 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    public final long zzF() {
        zzou zzouVar = this.zzs;
        return zzouVar.zzc == 0 ? this.zzz / zzouVar.zzb : this.zzA;
    }

    public final long zzG() {
        zzou zzouVar = this.zzs;
        return zzouVar.zzc == 0 ? this.zzB / zzouVar.zzd : this.zzC;
    }

    private final AudioTrack zzH(zzou zzouVar) throws zzoe {
        try {
            return zzouVar.zzb(false, this.zzv, this.zzR);
        } catch (zzoe e) {
            zzof zzofVar = this.zzq;
            if (zzofVar != null) {
                zzofVar.zza(e);
            }
            throw e;
        }
    }

    private final zzox zzI() {
        zzox zzoxVar = this.zzw;
        return zzoxVar != null ? zzoxVar : !this.zzk.isEmpty() ? (zzox) this.zzk.getLast() : this.zzx;
    }

    private final void zzJ(long j) {
        zzby zzbyVar;
        boolean z;
        zzob zzobVar;
        if (zzT()) {
            zzov zzovVar = this.zzX;
            zzbyVar = zzI().zza;
            zzovVar.zzc(zzbyVar);
        } else {
            zzbyVar = zzby.zza;
        }
        zzby zzbyVar2 = zzbyVar;
        if (zzT()) {
            zzov zzovVar2 = this.zzX;
            z = zzI().zzb;
            zzovVar2.zzd(z);
        } else {
            z = false;
        }
        this.zzk.add(new zzox(zzbyVar2, z, Math.max(0L, j), this.zzs.zza(zzG()), null));
        zzO();
        zzof zzofVar = this.zzq;
        if (zzofVar != null) {
            zzobVar = ((zzpk) zzofVar).zza.zzc;
            zzobVar.zzs(z);
        }
    }

    private final void zzK() {
        if (this.zzO) {
            return;
        }
        this.zzO = true;
        this.zzj.zzc(zzG());
        this.zzu.stop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0026, code lost:
        r0 = r2.zzI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0028, code lost:
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x002e, code lost:
        if (r0.hasRemaining() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0031, code lost:
        r2.zzt.zze(r2.zzI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0039, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzL(long r3) throws com.google.android.gms.internal.ads.zzoh {
        /*
            r2 = this;
            com.google.android.gms.internal.ads.zzdb r0 = r2.zzt
            boolean r0 = r0.zzh()
            if (r0 == 0) goto L3a
        L8:
            com.google.android.gms.internal.ads.zzdb r0 = r2.zzt
            boolean r0 = r0.zzg()
            if (r0 != 0) goto L39
        L10:
            com.google.android.gms.internal.ads.zzdb r0 = r2.zzt
            java.nio.ByteBuffer r0 = r0.zzb()
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L26
            r2.zzP(r0, r3)
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L10
            return
        L26:
            java.nio.ByteBuffer r0 = r2.zzI
            if (r0 == 0) goto L39
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L31
            goto L39
        L31:
            com.google.android.gms.internal.ads.zzdb r0 = r2.zzt
            java.nio.ByteBuffer r1 = r2.zzI
            r0.zze(r1)
            goto L8
        L39:
            return
        L3a:
            java.nio.ByteBuffer r0 = r2.zzI
            if (r0 != 0) goto L40
            java.nio.ByteBuffer r0 = com.google.android.gms.internal.ads.zzde.zza
        L40:
            r2.zzP(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpf.zzL(long):void");
    }

    private final void zzM(zzby zzbyVar, boolean z) {
        zzox zzI = zzI();
        if (zzbyVar.equals(zzI.zza) && z == zzI.zzb) {
            return;
        }
        zzox zzoxVar = new zzox(zzbyVar, z, -9223372036854775807L, -9223372036854775807L, null);
        if (zzR()) {
            this.zzw = zzoxVar;
        } else {
            this.zzx = zzoxVar;
        }
    }

    private final void zzN() {
        if (zzR()) {
            if (zzew.zza >= 21) {
                this.zzu.setVolume(this.zzH);
                return;
            }
            AudioTrack audioTrack = this.zzu;
            float f = this.zzH;
            audioTrack.setStereoVolume(f, f);
        }
    }

    private final void zzO() {
        zzdb zzdbVar = this.zzs.zzi;
        this.zzt = zzdbVar;
        zzdbVar.zzc();
    }

    private final void zzP(ByteBuffer byteBuffer, long j) throws zzoh {
        int write;
        zzof zzofVar;
        zzkm zzkmVar;
        zzkm zzkmVar2;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzK;
            if (byteBuffer2 != null) {
                zzdl.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzK = byteBuffer;
                if (zzew.zza < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.zzL;
                    if (bArr == null || bArr.length < remaining) {
                        this.zzL = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.zzL, 0, remaining);
                    byteBuffer.position(position);
                    this.zzM = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (zzew.zza < 21) {
                int zza2 = this.zzj.zza(this.zzB);
                if (zza2 > 0) {
                    write = this.zzu.write(this.zzL, this.zzM, Math.min(remaining2, zza2));
                    if (write > 0) {
                        this.zzM += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.zzu.write(byteBuffer, remaining2, 1);
            }
            this.zzU = SystemClock.elapsedRealtime();
            if (write < 0) {
                zzoh zzohVar = new zzoh(write, this.zzs.zza, (((zzew.zza < 24 || write != -6) && write != -32) || this.zzC <= 0) ? false : false);
                zzof zzofVar2 = this.zzq;
                if (zzofVar2 != null) {
                    zzofVar2.zza(zzohVar);
                }
                if (zzohVar.zzb) {
                    throw zzohVar;
                }
                this.zzn.zzb(zzohVar);
                return;
            }
            this.zzn.zza();
            if (zzS(this.zzu)) {
                if (this.zzC > 0) {
                    this.zzW = false;
                }
                if (this.zzP && (zzofVar = this.zzq) != null && write < remaining2 && !this.zzW) {
                    zzpl zzplVar = ((zzpk) zzofVar).zza;
                    zzkmVar = zzplVar.zzl;
                    if (zzkmVar != null) {
                        zzkmVar2 = zzplVar.zzl;
                        zzkmVar2.zza();
                    }
                }
            }
            int i = this.zzs.zzc;
            if (i == 0) {
                this.zzB += write;
            }
            if (write == remaining2) {
                if (i != 0) {
                    zzdl.zzf(byteBuffer == this.zzI);
                    this.zzC += this.zzD * this.zzJ;
                }
                this.zzK = null;
            }
        }
    }

    private final boolean zzQ() throws zzoh {
        if (!this.zzt.zzh()) {
            ByteBuffer byteBuffer = this.zzK;
            if (byteBuffer == null) {
                return true;
            }
            zzP(byteBuffer, Long.MIN_VALUE);
            return this.zzK == null;
        }
        this.zzt.zzd();
        zzL(Long.MIN_VALUE);
        if (this.zzt.zzg()) {
            ByteBuffer byteBuffer2 = this.zzK;
            return byteBuffer2 == null || !byteBuffer2.hasRemaining();
        }
        return false;
    }

    private final boolean zzR() {
        return this.zzu != null;
    }

    private static boolean zzS(AudioTrack audioTrack) {
        return zzew.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzT() {
        if ("audio/raw".equals(this.zzs.zza.zzm)) {
            int i = this.zzs.zza.zzB;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final int zza(zzaf zzafVar) {
        if (!"audio/raw".equals(zzafVar.zzm)) {
            if (!this.zzV) {
                int i = zzew.zza;
            }
            return this.zzd.zza(zzafVar) != null ? 2 : 0;
        } else if (zzew.zzW(zzafVar.zzB)) {
            return zzafVar.zzB != 2 ? 1 : 2;
        } else {
            int i2 = zzafVar.zzB;
            zzee.zze("DefaultAudioSink", "Invalid PCM encoding: " + i2);
            return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final long zzb(boolean z) {
        long zzs;
        if (!zzR() || this.zzF) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzj.zzb(z), this.zzs.zza(zzG()));
        while (!this.zzk.isEmpty() && min >= ((zzox) this.zzk.getFirst()).zzd) {
            this.zzx = (zzox) this.zzk.remove();
        }
        zzox zzoxVar = this.zzx;
        long j = min - zzoxVar.zzd;
        if (zzoxVar.zza.equals(zzby.zza)) {
            zzs = this.zzx.zzc + j;
        } else if (this.zzk.isEmpty()) {
            zzs = this.zzX.zza(j) + this.zzx.zzc;
        } else {
            zzox zzoxVar2 = (zzox) this.zzk.getFirst();
            zzs = zzoxVar2.zzc - zzew.zzs(zzoxVar2.zzd - min, this.zzx.zza.zzc);
        }
        return zzs + this.zzs.zza(this.zzX.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final zzby zzc() {
        return zzI().zza;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015d  */
    @Override // com.google.android.gms.internal.ads.zzoi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzaf r19, int r20, int[] r21) throws com.google.android.gms.internal.ads.zzod {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpf.zzd(com.google.android.gms.internal.ads.zzaf, int, int[]):void");
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zze() {
        if (zzR()) {
            this.zzz = 0L;
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzC = 0L;
            this.zzW = false;
            this.zzD = 0;
            this.zzx = new zzox(zzI().zza, zzI().zzb, 0L, 0L, null);
            this.zzG = 0L;
            this.zzw = null;
            this.zzk.clear();
            this.zzI = null;
            this.zzJ = 0;
            this.zzK = null;
            this.zzO = false;
            this.zzN = false;
            this.zzf.zzp();
            zzO();
            if (this.zzj.zzh()) {
                this.zzu.pause();
            }
            if (zzS(this.zzu)) {
                zzpd zzpdVar = this.zzl;
                Objects.requireNonNull(zzpdVar);
                zzpdVar.zzb(this.zzu);
            }
            if (zzew.zza < 21 && !this.zzQ) {
                this.zzR = 0;
            }
            zzou zzouVar = this.zzr;
            if (zzouVar != null) {
                this.zzs = zzouVar;
                this.zzr = null;
            }
            this.zzj.zzd();
            final AudioTrack audioTrack = this.zzu;
            final zzdo zzdoVar = this.zzi;
            zzdoVar.zzc();
            synchronized (zza) {
                if (zzb == null) {
                    zzb = zzew.zzR("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoo
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzpf.zzD(audioTrack, zzdoVar);
                    }
                });
            }
            this.zzu = null;
        }
        this.zzn.zza();
        this.zzm.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzf() {
        this.zzE = true;
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzg() {
        this.zzP = false;
        if (zzR() && this.zzj.zzk()) {
            this.zzu.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzh() {
        this.zzP = true;
        if (zzR()) {
            this.zzj.zzf();
            this.zzu.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzi() throws zzoh {
        if (!this.zzN && zzR() && zzQ()) {
            zzK();
            this.zzN = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzj() {
        zze();
        zzfqk zzfqkVar = this.zzg;
        int size = zzfqkVar.size();
        for (int i = 0; i < size; i++) {
            ((zzde) zzfqkVar.get(i)).zzf();
        }
        zzfqk zzfqkVar2 = this.zzh;
        int size2 = zzfqkVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((zzde) zzfqkVar2.get(i2)).zzf();
        }
        zzdb zzdbVar = this.zzt;
        if (zzdbVar != null) {
            zzdbVar.zzf();
        }
        this.zzP = false;
        this.zzV = false;
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzk(zzk zzkVar) {
        if (this.zzv.equals(zzkVar)) {
            return;
        }
        this.zzv = zzkVar;
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzl(int i) {
        if (this.zzR != i) {
            this.zzR = i;
            this.zzQ = i != 0;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzm(zzl zzlVar) {
        if (this.zzS.equals(zzlVar)) {
            return;
        }
        int i = zzlVar.zza;
        float f = zzlVar.zzb;
        if (this.zzu != null) {
            int i2 = this.zzS.zza;
        }
        this.zzS = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzn(zzof zzofVar) {
        this.zzq = zzofVar;
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzo(zzby zzbyVar) {
        zzM(new zzby(zzew.zza(zzbyVar.zzc, 0.1f, 8.0f), zzew.zza(zzbyVar.zzd, 0.1f, 8.0f)), zzI().zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzp(zzno zznoVar) {
        this.zzp = zznoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzr(boolean z) {
        zzM(zzI().zza, z);
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzs(float f) {
        if (this.zzH != f) {
            this.zzH = f;
            zzN();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:382:0x0396 A[Catch: zzoe -> 0x039a, TryCatch #2 {zzoe -> 0x039a, blocks: (B:238:0x0089, B:251:0x00d4, B:253:0x00dc, B:255:0x00e2, B:256:0x00e9, B:257:0x00fb, B:259:0x00ff, B:261:0x0103, B:262:0x0108, B:266:0x011e, B:268:0x0132, B:270:0x0138, B:271:0x013d, B:247:0x009e, B:249:0x00a7, B:380:0x038e, B:382:0x0396, B:383:0x0399, B:241:0x0092, B:243:0x0097), top: B:397:0x0089, inners: #3 }] */
    @Override // com.google.android.gms.internal.ads.zzoi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzt(java.nio.ByteBuffer r25, long r26, int r28) throws com.google.android.gms.internal.ads.zzoe, com.google.android.gms.internal.ads.zzoh {
        /*
            Method dump skipped, instructions count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpf.zzt(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final boolean zzu() {
        return zzR() && this.zzj.zzg(zzG());
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final boolean zzv() {
        return !zzR() || (this.zzN && !zzu());
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final boolean zzw(zzaf zzafVar) {
        return zza(zzafVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzq(AudioDeviceInfo audioDeviceInfo) {
        zzor zzorVar = audioDeviceInfo == null ? null : new zzor(audioDeviceInfo);
        this.zzT = zzorVar;
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzop.zza(audioTrack, zzorVar);
        }
    }
}
