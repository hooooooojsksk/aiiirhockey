package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.gms.games.GamesStatusCodes;
import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzra extends zzha {
    private static final byte[] zzb = {0, 0, 1, airhockey.J_ENEMYWIN, airhockey.P_NATION, -64, 11, -38, 37, -112, 0, 0, 1, airhockey.J_ENEMYLOSE, -50, 15, 19, 32, 0, 0, 1, airhockey.J_GAME_STANDBY, -120, -124, 13, -50, airhockey.J_BACK, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, airhockey.J_ACHIEVEMENTCALLBACK};
    private float zzA;
    private ArrayDeque zzB;
    private zzqz zzC;
    private zzqx zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private zzqp zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private ByteBuffer zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private boolean zzX;
    private boolean zzY;
    private int zzZ;
    protected zzhb zza;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private long zzaf;
    private long zzag;
    private boolean zzah;
    private boolean zzai;
    private boolean zzaj;
    private long zzak;
    private long zzal;
    private int zzam;
    private zzqa zzan;
    private zzqa zzao;
    private final zzqt zzc;
    private final zzrc zzd;
    private final float zze;
    private final zzgr zzf;
    private final zzgr zzg;
    private final zzgr zzh;
    private final zzqo zzi;
    private final zzet zzj;
    private final ArrayList zzk;
    private final MediaCodec.BufferInfo zzl;
    private final long[] zzm;
    private final long[] zzn;
    private final long[] zzo;
    private zzaf zzp;
    private zzaf zzq;
    private MediaCrypto zzr;
    private boolean zzs;
    private long zzt;
    private float zzu;
    private float zzv;
    private zzqu zzw;
    private zzaf zzx;
    private MediaFormat zzy;
    private boolean zzz;

    public zzra(int i, zzqt zzqtVar, zzrc zzrcVar, boolean z, float f) {
        super(i);
        this.zzc = zzqtVar;
        Objects.requireNonNull(zzrcVar);
        this.zzd = zzrcVar;
        this.zze = f;
        this.zzf = new zzgr(0, 0);
        this.zzg = new zzgr(0, 0);
        this.zzh = new zzgr(2, 0);
        zzqo zzqoVar = new zzqo();
        this.zzi = zzqoVar;
        this.zzj = new zzet(10);
        this.zzk = new ArrayList();
        this.zzl = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzm = new long[10];
        this.zzn = new long[10];
        this.zzo = new long[10];
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        zzqoVar.zzi(0);
        zzqoVar.zzb.order(ByteOrder.nativeOrder());
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzZ = 0;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzP = -9223372036854775807L;
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        this.zzaa = 0;
        this.zzab = 0;
    }

    private final void zzT() {
        this.zzX = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzW = false;
        this.zzV = false;
    }

    private final void zzU() throws zzhj {
        if (this.zzac) {
            this.zzaa = 1;
            this.zzab = 3;
            return;
        }
        zzaq();
        zzan();
    }

    private final void zzaA() {
        this.zzR = -1;
        this.zzS = null;
    }

    private final void zzaB() throws zzhj {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw zzbe(e, this.zzp, false, 6006);
        }
    }

    private final boolean zzaC() throws zzhj {
        if (this.zzac) {
            this.zzaa = 1;
            if (this.zzG || this.zzI) {
                this.zzab = 3;
                return false;
            }
            this.zzab = 2;
        } else {
            zzaB();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    private final boolean zzaD() throws zzhj {
        zzqu zzquVar = this.zzw;
        boolean z = 0;
        if (zzquVar == null || this.zzaa == 2 || this.zzah) {
            return false;
        }
        if (this.zzQ < 0) {
            int zza = zzquVar.zza();
            this.zzQ = zza;
            if (zza < 0) {
                return false;
            }
            this.zzg.zzb = this.zzw.zzf(zza);
            this.zzg.zzb();
        }
        if (this.zzaa == 1) {
            if (!this.zzN) {
                this.zzad = true;
                this.zzw.zzj(this.zzQ, 0, 0, 0L, 4);
                zzaz();
            }
            this.zzaa = 2;
            return false;
        } else if (this.zzL) {
            this.zzL = false;
            this.zzg.zzb.put(zzb);
            this.zzw.zzj(this.zzQ, 0, 38, 0L, 0);
            zzaz();
            this.zzac = true;
            return true;
        } else {
            if (this.zzZ == 1) {
                for (int i = 0; i < this.zzx.zzo.size(); i++) {
                    this.zzg.zzb.put((byte[]) this.zzx.zzo.get(i));
                }
                this.zzZ = 2;
            }
            int position = this.zzg.zzb.position();
            zzjo zzh = zzh();
            try {
                int zzbd = zzbd(zzh, this.zzg, 0);
                if (zzG()) {
                    this.zzag = this.zzaf;
                }
                if (zzbd == -3) {
                    return false;
                }
                if (zzbd == -5) {
                    if (this.zzZ == 2) {
                        this.zzg.zzb();
                        this.zzZ = 1;
                    }
                    zzS(zzh);
                    return true;
                }
                zzgr zzgrVar = this.zzg;
                if (!zzgrVar.zzg()) {
                    if (this.zzac || zzgrVar.zzh()) {
                        boolean zzk = zzgrVar.zzk();
                        if (zzk) {
                            zzgrVar.zza.zzb(position);
                        }
                        if (this.zzF && !zzk) {
                            ByteBuffer byteBuffer = this.zzg.zzb;
                            byte[] bArr = zzaar.zza;
                            int position2 = byteBuffer.position();
                            int i2 = 0;
                            int i3 = 0;
                            while (true) {
                                int i4 = i2 + 1;
                                if (i4 < position2) {
                                    int i5 = byteBuffer.get(i2) & UByte.MAX_VALUE;
                                    if (i3 == 3) {
                                        if (i5 == 1) {
                                            if ((byteBuffer.get(i4) & 31) == 7) {
                                                ByteBuffer duplicate = byteBuffer.duplicate();
                                                duplicate.position(i2 - 3);
                                                duplicate.limit(position2);
                                                byteBuffer.position(0);
                                                byteBuffer.put(duplicate);
                                                break;
                                            }
                                            i5 = 1;
                                        }
                                    } else if (i5 == 0) {
                                        i3++;
                                    }
                                    if (i5 != 0) {
                                        i3 = 0;
                                    }
                                    i2 = i4;
                                } else {
                                    byteBuffer.clear();
                                    break;
                                }
                            }
                            if (this.zzg.zzb.position() == 0) {
                                return true;
                            }
                            this.zzF = false;
                        }
                        zzgr zzgrVar2 = this.zzg;
                        long j = zzgrVar2.zzd;
                        zzqp zzqpVar = this.zzO;
                        if (zzqpVar != null) {
                            j = zzqpVar.zzb(this.zzp, zzgrVar2);
                            this.zzaf = Math.max(this.zzaf, this.zzO.zza(this.zzp));
                        }
                        long j2 = j;
                        if (this.zzg.zzf()) {
                            this.zzk.add(Long.valueOf(j2));
                        }
                        if (this.zzaj) {
                            this.zzj.zzd(j2, this.zzp);
                            this.zzaj = false;
                        }
                        this.zzaf = Math.max(this.zzaf, j2);
                        this.zzg.zzj();
                        zzgr zzgrVar3 = this.zzg;
                        if (zzgrVar3.zze()) {
                            zzam(zzgrVar3);
                        }
                        zzad(this.zzg);
                        try {
                            if (zzk) {
                                this.zzw.zzk(this.zzQ, 0, this.zzg.zza, j2, 0);
                            } else {
                                this.zzw.zzj(this.zzQ, 0, this.zzg.zzb.limit(), j2, 0);
                            }
                            zzaz();
                            this.zzac = true;
                            this.zzZ = 0;
                            zzhb zzhbVar = this.zza;
                            z = zzhbVar.zzc + 1;
                            zzhbVar.zzc = z;
                            return true;
                        } catch (MediaCodec.CryptoException e) {
                            throw zzbe(e, this.zzp, z, zzew.zzl(e.getErrorCode()));
                        }
                    } else {
                        zzgrVar.zzb();
                        if (this.zzZ == 2) {
                            this.zzZ = 1;
                        }
                        return true;
                    }
                }
                if (this.zzZ == 2) {
                    zzgrVar.zzb();
                    this.zzZ = 1;
                }
                this.zzah = true;
                if (!this.zzac) {
                    zzay();
                    return false;
                }
                try {
                    if (!this.zzN) {
                        this.zzad = true;
                        this.zzw.zzj(this.zzQ, 0, 0, 0L, 4);
                        zzaz();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e2) {
                    throw zzbe(e2, this.zzp, false, zzew.zzl(e2.getErrorCode()));
                }
            } catch (zzgq e3) {
                zzX(e3);
                zzaF(0);
                zzab();
                return true;
            }
        }
    }

    private final boolean zzaE() {
        return this.zzR >= 0;
    }

    private final boolean zzaF(int i) throws zzhj {
        zzjo zzh = zzh();
        this.zzf.zzb();
        int zzbd = zzbd(zzh, this.zzf, i | 4);
        if (zzbd == -5) {
            zzS(zzh);
            return true;
        } else if (zzbd == -4 && this.zzf.zzg()) {
            this.zzah = true;
            zzay();
            return false;
        } else {
            return false;
        }
    }

    private final boolean zzaG(long j) {
        return this.zzt == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.zzt;
    }

    private final boolean zzaH(zzaf zzafVar) throws zzhj {
        if (zzew.zza >= 23 && this.zzw != null && this.zzab != 3 && zzbc() != 0) {
            float zzP = zzP(this.zzv, zzafVar, zzJ());
            float f = this.zzA;
            if (f == zzP) {
                return true;
            }
            if (zzP == -1.0f) {
                zzU();
                return false;
            } else if (f == -1.0f && zzP <= this.zze) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", zzP);
                this.zzw.zzp(bundle);
                this.zzA = zzP;
            }
        }
        return true;
    }

    private final void zzab() {
        try {
            this.zzw.zzi();
        } finally {
            zzar();
        }
    }

    public static boolean zzaw(zzaf zzafVar) {
        return zzafVar.zzF == 0;
    }

    private final void zzax(zzqx zzqxVar, MediaCrypto mediaCrypto) throws Exception {
        zzqh zzrrVar;
        int i;
        String str = zzqxVar.zza;
        float zzP = zzew.zza < 23 ? -1.0f : zzP(this.zzv, this.zzp, zzJ());
        float f = zzP > this.zze ? zzP : -1.0f;
        zzap(this.zzp);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        MediaCodec mediaCodec = null;
        zzqs zzV = zzV(zzqxVar, this.zzp, null, f);
        if (zzew.zza >= 31) {
            zzqy.zza(zzV, zzl());
        }
        try {
            Trace.beginSection("createCodec:" + str);
            if (zzew.zza >= 23 && zzew.zza >= 31) {
                int zzb2 = zzbt.zzb(zzV.zzc.zzm);
                zzee.zzd("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzew.zzO(zzb2)));
                zzrrVar = new zzqf(zzb2, false).zzc(zzV);
            } else {
                try {
                    zzqx zzqxVar2 = zzV.zza;
                    Objects.requireNonNull(zzqxVar2);
                    String str2 = zzqxVar2.zza;
                    Trace.beginSection("createCodec:".concat(str2));
                    MediaCodec createByCodecName = MediaCodec.createByCodecName(str2);
                    Trace.endSection();
                    try {
                        Trace.beginSection("configureCodec");
                        createByCodecName.configure(zzV.zzb, zzV.zzd, (MediaCrypto) null, 0);
                        Trace.endSection();
                        Trace.beginSection("startCodec");
                        createByCodecName.start();
                        Trace.endSection();
                        zzrrVar = new zzrr(createByCodecName, null);
                    } catch (IOException | RuntimeException e) {
                        e = e;
                        mediaCodec = createByCodecName;
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (RuntimeException e3) {
                    e = e3;
                }
            }
            this.zzw = zzrrVar;
            Trace.endSection();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!zzqxVar.zze(this.zzp)) {
                zzee.zze("MediaCodecRenderer", zzew.zzI("Format exceeds selected codec's capabilities [%s, %s]", zzaf.zzd(this.zzp), str));
            }
            this.zzD = zzqxVar;
            this.zzA = f;
            this.zzx = this.zzp;
            if (zzew.zza <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (zzew.zzd.startsWith("SM-T585") || zzew.zzd.startsWith("SM-A510") || zzew.zzd.startsWith("SM-A520") || zzew.zzd.startsWith("SM-J700"))) {
                i = 2;
            } else {
                i = (zzew.zza >= 24 || !(("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) && ("flounder".equals(zzew.zzb) || "flounder_lte".equals(zzew.zzb) || "grouper".equals(zzew.zzb) || "tilapia".equals(zzew.zzb)))) ? 0 : 1;
            }
            this.zzE = i;
            this.zzF = zzew.zza < 21 && this.zzx.zzo.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
            this.zzG = zzew.zza == 19 && zzew.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str));
            this.zzH = zzew.zza == 29 && "c2.android.aac.decoder".equals(str);
            this.zzI = (zzew.zza <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (zzew.zza <= 19 && (("hb2000".equals(zzew.zzb) || "stvm8".equals(zzew.zzb)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))));
            this.zzJ = zzew.zza == 21 && "OMX.google.aac.decoder".equals(str);
            this.zzK = zzew.zza < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(zzew.zzc) && (zzew.zzb.startsWith("baffin") || zzew.zzb.startsWith("grand") || zzew.zzb.startsWith("fortuna") || zzew.zzb.startsWith("gprimelte") || zzew.zzb.startsWith("j2y18lte") || zzew.zzb.startsWith("ms01"));
            String str3 = zzqxVar.zza;
            this.zzN = (zzew.zza <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || (zzew.zza <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || ("Amazon".equals(zzew.zzc) && "AFTS".equals(zzew.zzd) && zzqxVar.zzf);
            this.zzw.zzr();
            if ("c2.android.mp3.decoder".equals(zzqxVar.zza)) {
                this.zzO = new zzqp();
            }
            if (zzbc() == 2) {
                this.zzP = SystemClock.elapsedRealtime() + 1000;
            }
            this.zza.zza++;
            zzY(str, zzV, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    private final void zzaz() {
        this.zzQ = -1;
        this.zzg.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzha, com.google.android.gms.internal.ads.zzkn
    public void zzD(float f, float f2) throws zzhj {
        this.zzu = f;
        this.zzv = f2;
        zzaH(this.zzx);
    }

    /* JADX WARN: Code restructure failed: missing block: B:423:0x026b, code lost:
        if (r15.zzq != null) goto L204;
     */
    /* JADX WARN: Removed duplicated region for block: B:450:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x031f A[LOOP:2: B:350:0x0139->B:458:0x031f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x032f A[Catch: IllegalStateException -> 0x0360, TryCatch #3 {IllegalStateException -> 0x0360, blocks: (B:455:0x0318, B:460:0x0329, B:462:0x032f, B:464:0x0335, B:451:0x0300, B:453:0x0312, B:471:0x0346), top: B:513:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x031e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0326 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    @Override // com.google.android.gms.internal.ads.zzkn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzL(long r24, long r26) throws com.google.android.gms.internal.ads.zzhj {
        /*
            Method dump skipped, instructions count: 950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzra.zzL(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public boolean zzM() {
        return this.zzai;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public boolean zzN() {
        if (this.zzp != null) {
            if (zzI() || zzaE()) {
                return true;
            }
            if (this.zzP != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzP) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final int zzO(zzaf zzafVar) throws zzhj {
        try {
            return zzQ(this.zzd, zzafVar);
        } catch (zzrj e) {
            throw zzbe(e, zzafVar, false, GamesStatusCodes.STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE);
        }
    }

    protected float zzP(float f, zzaf zzafVar, zzaf[] zzafVarArr) {
        throw null;
    }

    protected abstract int zzQ(zzrc zzrcVar, zzaf zzafVar) throws zzrj;

    protected zzhc zzR(zzqx zzqxVar, zzaf zzafVar, zzaf zzafVar2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0060, code lost:
        if (zzaC() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x008c, code lost:
        if (zzaC() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00a0, code lost:
        if (zzaC() == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zzhc zzS(com.google.android.gms.internal.ads.zzjo r12) throws com.google.android.gms.internal.ads.zzhj {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzra.zzS(com.google.android.gms.internal.ads.zzjo):com.google.android.gms.internal.ads.zzhc");
    }

    protected abstract zzqs zzV(zzqx zzqxVar, zzaf zzafVar, MediaCrypto mediaCrypto, float f);

    protected abstract List zzW(zzrc zzrcVar, zzaf zzafVar, boolean z) throws zzrj;

    protected void zzX(Exception exc) {
        throw null;
    }

    protected void zzY(String str, zzqs zzqsVar, long j, long j2) {
        throw null;
    }

    protected void zzZ(String str) {
        throw null;
    }

    protected void zzaa(zzaf zzafVar, MediaFormat mediaFormat) throws zzhj {
        throw null;
    }

    protected void zzac() {
    }

    protected void zzad(zzgr zzgrVar) throws zzhj {
        throw null;
    }

    protected void zzae() throws zzhj {
    }

    protected abstract boolean zzaf(long j, long j2, zzqu zzquVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzaf zzafVar) throws zzhj;

    protected boolean zzag(zzaf zzafVar) {
        return false;
    }

    public final float zzah() {
        return this.zzu;
    }

    public final long zzai() {
        return this.zzal;
    }

    public final zzqu zzaj() {
        return this.zzw;
    }

    protected zzqv zzak(Throwable th, zzqx zzqxVar) {
        return new zzqv(th, zzqxVar);
    }

    public final zzqx zzal() {
        return this.zzD;
    }

    protected void zzam(zzgr zzgrVar) throws zzhj {
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0100 A[Catch: zzqz -> 0x0123, TryCatch #3 {zzqz -> 0x0123, blocks: (B:122:0x0069, B:125:0x006e, B:127:0x0086, B:128:0x0091, B:133:0x00a0, B:135:0x00a8, B:136:0x00b0, B:138:0x00b4, B:149:0x00dc, B:151:0x0100, B:153:0x0109, B:156:0x0112, B:157:0x0114, B:152:0x0103, B:158:0x0115, B:160:0x0118, B:161:0x0122, B:131:0x0095, B:132:0x009f, B:146:0x00cc, B:147:0x00da, B:141:0x00c3), top: B:172:0x0069, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0103 A[Catch: zzqz -> 0x0123, TryCatch #3 {zzqz -> 0x0123, blocks: (B:122:0x0069, B:125:0x006e, B:127:0x0086, B:128:0x0091, B:133:0x00a0, B:135:0x00a8, B:136:0x00b0, B:138:0x00b4, B:149:0x00dc, B:151:0x0100, B:153:0x0109, B:156:0x0112, B:157:0x0114, B:152:0x0103, B:158:0x0115, B:160:0x0118, B:161:0x0122, B:131:0x0095, B:132:0x009f, B:146:0x00cc, B:147:0x00da, B:141:0x00c3), top: B:172:0x0069, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0112 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzan() throws com.google.android.gms.internal.ads.zzhj {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzra.zzan():void");
    }

    public void zzao(long j) {
        while (true) {
            int i = this.zzam;
            if (i == 0 || j < this.zzo[0]) {
                return;
            }
            long[] jArr = this.zzm;
            this.zzak = jArr[0];
            this.zzal = this.zzn[0];
            int i2 = i - 1;
            this.zzam = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.zzn;
            System.arraycopy(jArr2, 1, jArr2, 0, this.zzam);
            long[] jArr3 = this.zzo;
            System.arraycopy(jArr3, 1, jArr3, 0, this.zzam);
            zzac();
        }
    }

    protected void zzap(zzaf zzafVar) throws zzhj {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzqa, android.media.MediaCrypto, com.google.android.gms.internal.ads.zzqu] */
    public final void zzaq() {
        try {
            zzqu zzquVar = this.zzw;
            if (zzquVar != null) {
                zzquVar.zzl();
                this.zza.zzb++;
                zzZ(this.zzD.zza);
            }
        } finally {
            this.zzw = null;
            this.zzr = null;
            this.zzan = null;
            zzas();
        }
    }

    public void zzar() {
        zzaz();
        zzaA();
        this.zzP = -9223372036854775807L;
        this.zzad = false;
        this.zzac = false;
        this.zzL = false;
        this.zzM = false;
        this.zzT = false;
        this.zzU = false;
        this.zzk.clear();
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        zzqp zzqpVar = this.zzO;
        if (zzqpVar != null) {
            zzqpVar.zzc();
        }
        this.zzaa = 0;
        this.zzab = 0;
        this.zzZ = this.zzY ? 1 : 0;
    }

    protected final void zzas() {
        zzar();
        this.zzO = null;
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzae = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzN = false;
        this.zzY = false;
        this.zzZ = 0;
        this.zzs = false;
    }

    public final boolean zzat() throws zzhj {
        boolean zzau = zzau();
        if (zzau) {
            zzan();
        }
        return zzau;
    }

    protected final boolean zzau() {
        if (this.zzw == null) {
            return false;
        }
        int i = this.zzab;
        if (i != 3 && !this.zzG && ((!this.zzH || this.zzae) && (!this.zzI || !this.zzad))) {
            if (i == 2) {
                zzdl.zzf(zzew.zza >= 23);
                if (zzew.zza >= 23) {
                    try {
                        zzaB();
                    } catch (zzhj e) {
                        zzee.zzf("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                        zzaq();
                        return true;
                    }
                }
            }
            zzab();
            return false;
        }
        zzaq();
        return true;
    }

    protected boolean zzav(zzqx zzqxVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzha, com.google.android.gms.internal.ads.zzko
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public void zzs() {
        this.zzp = null;
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        this.zzam = 0;
        zzau();
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public void zzt(boolean z, boolean z2) throws zzhj {
        this.zza = new zzhb();
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public void zzu(long j, boolean z) throws zzhj {
        this.zzah = false;
        this.zzai = false;
        if (this.zzV) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzW = false;
        } else {
            zzat();
        }
        zzet zzetVar = this.zzj;
        if (zzetVar.zza() > 0) {
            this.zzaj = true;
        }
        zzetVar.zze();
        int i = this.zzam;
        if (i != 0) {
            int i2 = i - 1;
            this.zzal = this.zzn[i2];
            this.zzak = this.zzm[i2];
            this.zzam = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public void zzv() {
        try {
            zzT();
            zzaq();
        } finally {
            this.zzao = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzha
    protected final void zzy(zzaf[] zzafVarArr, long j, long j2) throws zzhj {
        if (this.zzal == -9223372036854775807L) {
            zzdl.zzf(this.zzak == -9223372036854775807L);
            this.zzak = j;
            this.zzal = j2;
            return;
        }
        int i = this.zzam;
        if (i == 10) {
            zzee.zze("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.zzn[9]);
        } else {
            this.zzam = i + 1;
        }
        long[] jArr = this.zzm;
        int i2 = this.zzam - 1;
        jArr[i2] = j;
        this.zzn[i2] = j2;
        this.zzo[i2] = this.zzaf;
    }

    private final void zzay() throws zzhj {
        int i = this.zzab;
        if (i == 1) {
            zzab();
        } else if (i == 2) {
            zzab();
            zzaB();
        } else if (i != 3) {
            this.zzai = true;
            zzae();
        } else {
            zzaq();
            zzan();
        }
    }
}
