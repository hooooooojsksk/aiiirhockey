package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.gms.drive.DriveFile;
import com.google.firebase.FirebaseError;
import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.internal.ByteCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzaeu implements zzzu {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzaeq
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzaeu.zza;
            return new zzzu[]{new zzaeu(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc = zzew.zzab("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] zzd = {airhockey.P_GAME_SELECTMAP, airhockey.J_GAME_REMATCH, airhockey.J_SDKVER, airhockey.J_GAME_DISCONNECT, 111, airhockey.J_ENEMYWIN, airhockey.J_ERROR, airhockey.J_GAME_STANDBY, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] zze = {87, airhockey.P_GAME_STANDBY, airhockey.P_NATION, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    private static final UUID zzf = new UUID(72057594037932032L, -9223371306706625679L);
    private static final Map zzg;
    private long zzA;
    private zzaet zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    private zzef zzJ;
    private zzef zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzzx zzai;
    private final zzaep zzh;
    private final zzaew zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzen zzl;
    private final zzen zzm;
    private final zzen zzn;
    private final zzen zzo;
    private final zzen zzp;
    private final zzen zzq;
    private final zzen zzr;
    private final zzen zzs;
    private final zzen zzt;
    private final zzen zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(hashMap);
    }

    public zzaeu() {
        this(0);
    }

    public static final int zzn(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public static final boolean zzo(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @RequiresNonNull({"#2.output"})
    private final int zzp(zzzv zzzvVar, zzaet zzaetVar, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzaetVar.zzb)) {
            zzx(zzzvVar, zzb, i);
            int i3 = this.zzaa;
            zzw();
            return i3;
        } else if ("S_TEXT/ASS".equals(zzaetVar.zzb)) {
            zzx(zzzvVar, zzd, i);
            int i4 = this.zzaa;
            zzw();
            return i4;
        } else if ("S_TEXT/WEBVTT".equals(zzaetVar.zzb)) {
            zzx(zzzvVar, zze, i);
            int i5 = this.zzaa;
            zzw();
            return i5;
        } else {
            zzabb zzabbVar = zzaetVar.zzV;
            if (!this.zzac) {
                if (zzaetVar.zzg) {
                    this.zzV &= -1073741825;
                    if (!this.zzad) {
                        ((zzzk) zzzvVar).zzn(this.zzn.zzH(), 0, 1, false);
                        this.zzZ++;
                        if ((this.zzn.zzH()[0] & ByteCompanionObject.MIN_VALUE) == 128) {
                            throw zzbu.zza("Extension bit is set in signal byte", null);
                        }
                        this.zzag = this.zzn.zzH()[0];
                        this.zzad = true;
                    }
                    byte b = this.zzag;
                    if ((b & 1) == 1) {
                        int i6 = b & 2;
                        this.zzV |= 1073741824;
                        if (!this.zzah) {
                            ((zzzk) zzzvVar).zzn(this.zzs.zzH(), 0, 8, false);
                            this.zzZ += 8;
                            this.zzah = true;
                            this.zzn.zzH()[0] = (byte) ((i6 != 2 ? 0 : 128) | 8);
                            this.zzn.zzF(0);
                            zzabbVar.zzr(this.zzn, 1, 1);
                            this.zzaa++;
                            this.zzs.zzF(0);
                            zzabbVar.zzr(this.zzs, 8, 1);
                            this.zzaa += 8;
                        }
                        if (i6 == 2) {
                            if (!this.zzae) {
                                ((zzzk) zzzvVar).zzn(this.zzn.zzH(), 0, 1, false);
                                this.zzZ++;
                                this.zzn.zzF(0);
                                this.zzaf = this.zzn.zzk();
                                this.zzae = true;
                            }
                            int i7 = this.zzaf * 4;
                            this.zzn.zzC(i7);
                            ((zzzk) zzzvVar).zzn(this.zzn.zzH(), 0, i7, false);
                            this.zzZ += i7;
                            int i8 = (this.zzaf >> 1) + 1;
                            int i9 = (i8 * 6) + 2;
                            ByteBuffer byteBuffer = this.zzv;
                            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                                this.zzv = ByteBuffer.allocate(i9);
                            }
                            this.zzv.position(0);
                            this.zzv.putShort((short) i8);
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                i2 = this.zzaf;
                                if (i10 >= i2) {
                                    break;
                                }
                                int zzn = this.zzn.zzn();
                                if (i10 % 2 == 0) {
                                    this.zzv.putShort((short) (zzn - i11));
                                } else {
                                    this.zzv.putInt(zzn - i11);
                                }
                                i10++;
                                i11 = zzn;
                            }
                            int i12 = (i - this.zzZ) - i11;
                            if ((i2 & 1) == 1) {
                                this.zzv.putInt(i12);
                            } else {
                                this.zzv.putShort((short) i12);
                                this.zzv.putInt(0);
                            }
                            this.zzt.zzD(this.zzv.array(), i9);
                            zzabbVar.zzr(this.zzt, i9, 1);
                            this.zzaa += i9;
                        }
                    }
                } else {
                    byte[] bArr = zzaetVar.zzh;
                    if (bArr != null) {
                        this.zzq.zzD(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(zzaetVar.zzb) ? zzaetVar.zzf > 0 : z) {
                    this.zzV |= DriveFile.MODE_READ_ONLY;
                    this.zzu.zzC(0);
                    int zzd2 = (this.zzq.zzd() + i) - this.zzZ;
                    this.zzn.zzC(4);
                    this.zzn.zzH()[0] = (byte) ((zzd2 >> 24) & 255);
                    this.zzn.zzH()[1] = (byte) ((zzd2 >> 16) & 255);
                    this.zzn.zzH()[2] = (byte) ((zzd2 >> 8) & 255);
                    this.zzn.zzH()[3] = (byte) (zzd2 & 255);
                    zzabbVar.zzr(this.zzn, 4, 2);
                    this.zzaa += 4;
                }
                this.zzac = true;
            }
            int zzd3 = i + this.zzq.zzd();
            if ("V_MPEG4/ISO/AVC".equals(zzaetVar.zzb) || "V_MPEGH/ISO/HEVC".equals(zzaetVar.zzb)) {
                byte[] zzH = this.zzm.zzH();
                zzH[0] = 0;
                zzH[1] = 0;
                zzH[2] = 0;
                int i13 = zzaetVar.zzW;
                int i14 = 4 - i13;
                while (this.zzZ < zzd3) {
                    int i15 = this.zzab;
                    if (i15 == 0) {
                        int min = Math.min(i13, this.zzq.zza());
                        ((zzzk) zzzvVar).zzn(zzH, i14 + min, i13 - min, false);
                        if (min > 0) {
                            this.zzq.zzB(zzH, i14, min);
                        }
                        this.zzZ += i13;
                        this.zzm.zzF(0);
                        this.zzab = this.zzm.zzn();
                        this.zzl.zzF(0);
                        zzaaz.zzb(zzabbVar, this.zzl, 4);
                        this.zzaa += 4;
                    } else {
                        int zzq = zzq(zzzvVar, zzabbVar, i15);
                        this.zzZ += zzq;
                        this.zzaa += zzq;
                        this.zzab -= zzq;
                    }
                }
            } else {
                if (zzaetVar.zzS != null) {
                    zzdl.zzf(this.zzq.zzd() == 0);
                    zzaetVar.zzS.zzd(zzzvVar);
                }
                while (true) {
                    int i16 = this.zzZ;
                    if (i16 >= zzd3) {
                        break;
                    }
                    int zzq2 = zzq(zzzvVar, zzabbVar, zzd3 - i16);
                    this.zzZ += zzq2;
                    this.zzaa += zzq2;
                }
            }
            if ("A_VORBIS".equals(zzaetVar.zzb)) {
                this.zzo.zzF(0);
                zzaaz.zzb(zzabbVar, this.zzo, 4);
                this.zzaa += 4;
            }
            int i17 = this.zzaa;
            zzw();
            return i17;
        }
    }

    private final int zzq(zzzv zzzvVar, zzabb zzabbVar, int i) throws IOException {
        int zza2 = this.zzq.zza();
        if (zza2 <= 0) {
            return zzaaz.zza(zzabbVar, zzzvVar, i, false);
        }
        int min = Math.min(i, zza2);
        zzaaz.zzb(zzabbVar, this.zzq, min);
        return min;
    }

    private final long zzr(long j) throws zzbu {
        long j2 = this.zzy;
        if (j2 == -9223372036854775807L) {
            throw zzbu.zza("Can't scale timecode prior to timecodeScale being set.", null);
        }
        return zzew.zzw(j, j2, 1000L);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzs(int i) throws zzbu {
        if (this.zzJ == null || this.zzK == null) {
            throw zzbu.zza("Element " + i + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzt(int i) throws zzbu {
        if (this.zzB != null) {
            return;
        }
        throw zzbu.zza("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00e0 A[EDGE_INSN: B:125:0x00e0->B:114:0x00e0 ?: BREAK  , SYNTHETIC] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzu(com.google.android.gms.internal.ads.zzaet r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeu.zzu(com.google.android.gms.internal.ads.zzaet, long, int, int, int):void");
    }

    private final void zzv(zzzv zzzvVar, int i) throws IOException {
        if (this.zzn.zzd() >= i) {
            return;
        }
        if (this.zzn.zzb() < i) {
            zzen zzenVar = this.zzn;
            int zzb2 = zzenVar.zzb();
            zzenVar.zzz(Math.max(zzb2 + zzb2, i));
        }
        ((zzzk) zzzvVar).zzn(this.zzn.zzH(), this.zzn.zzd(), i - this.zzn.zzd(), false);
        this.zzn.zzE(i);
    }

    private final void zzw() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = (byte) 0;
        this.zzah = false;
        this.zzq.zzC(0);
    }

    private final void zzx(zzzv zzzvVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.zzr.zzb() < i2) {
            zzen zzenVar = this.zzr;
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzenVar.zzD(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzH(), 0, length);
        }
        ((zzzk) zzzvVar).zzn(this.zzr.zzH(), length, i, false);
        this.zzr.zzF(0);
        this.zzr.zzE(i2);
    }

    private static byte[] zzy(long j, String str, long j2) {
        zzdl.zzd(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        return zzew.zzab(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    private static int[] zzz(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final int zza(zzzv zzzvVar, zzaau zzaauVar) throws IOException {
        this.zzM = false;
        while (!this.zzM) {
            if (!this.zzh.zzc(zzzvVar)) {
                for (int i = 0; i < this.zzj.size(); i++) {
                    zzaet zzaetVar = (zzaet) this.zzj.valueAt(i);
                    Objects.requireNonNull(zzaetVar.zzV);
                    zzabc zzabcVar = zzaetVar.zzS;
                    if (zzabcVar != null) {
                        zzabcVar.zza(zzaetVar.zzV, zzaetVar.zzi);
                    }
                }
                return -1;
            }
            long zzf2 = zzzvVar.zzf();
            if (this.zzF) {
                this.zzH = zzf2;
                zzaauVar.zza = this.zzG;
                this.zzF = false;
                return 1;
            } else if (this.zzC) {
                long j = this.zzH;
                if (j != -1) {
                    zzaauVar.zza = j;
                    this.zzH = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzai = zzzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        this.zzI = -9223372036854775807L;
        this.zzN = 0;
        this.zzh.zzb();
        this.zzi.zze();
        zzw();
        for (int i = 0; i < this.zzj.size(); i++) {
            zzabc zzabcVar = ((zzaet) this.zzj.valueAt(i)).zzS;
            if (zzabcVar != null) {
                zzabcVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        return new zzaev().zza(zzzvVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x01e8, code lost:
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(int r22) throws com.google.android.gms.internal.ads.zzbu {
        /*
            Method dump skipped, instructions count: 1152
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeu.zzh(int):void");
    }

    public final void zzk(int i, long j, long j2) throws zzbu {
        zzdl.zzb(this.zzai);
        if (i == 160) {
            this.zzX = false;
            this.zzY = 0L;
        } else if (i == 174) {
            this.zzB = new zzaet();
        } else if (i == 187) {
            this.zzL = false;
        } else if (i == 19899) {
            this.zzD = -1;
            this.zzE = -1L;
        } else if (i == 20533) {
            zzt(i);
            this.zzB.zzg = true;
        } else if (i == 21968) {
            zzt(i);
            this.zzB.zzw = true;
        } else if (i == 408125543) {
            long j3 = this.zzx;
            if (j3 != -1 && j3 != j) {
                throw zzbu.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j;
            this.zzw = j2;
        } else if (i == 475249515) {
            this.zzJ = new zzef(32);
            this.zzK = new zzef(32);
        } else if (i == 524531317 && !this.zzC) {
            if (this.zzk && this.zzG != -1) {
                this.zzF = true;
                return;
            }
            this.zzai.zzN(new zzaaw(this.zzA, 0L));
            this.zzC = true;
        }
    }

    public zzaeu(int i) {
        zzaen zzaenVar = new zzaen();
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = -9223372036854775807L;
        this.zzh = zzaenVar;
        zzaenVar.zza(new zzaes(this, null));
        this.zzk = true;
        this.zzi = new zzaew();
        this.zzj = new SparseArray();
        this.zzn = new zzen(4);
        this.zzo = new zzen(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzen(4);
        this.zzl = new zzen(zzaar.zza);
        this.zzm = new zzen(4);
        this.zzq = new zzen();
        this.zzr = new zzen();
        this.zzs = new zzen(8);
        this.zzt = new zzen();
        this.zzu = new zzen();
        this.zzS = new int[1];
    }

    public final void zzl(int i, String str) throws zzbu {
        if (i == 134) {
            zzt(i);
            this.zzB.zzb = str;
        } else if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzbu.zza("DocType " + str + " not supported", null);
        } else if (i == 21358) {
            zzt(i);
            this.zzB.zza = str;
        } else if (i != 2274716) {
        } else {
            zzt(i);
            this.zzB.zzY = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:0x0283, code lost:
        throw com.google.android.gms.internal.ads.zzbu.zza("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(int r20, int r21, com.google.android.gms.internal.ads.zzzv r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeu.zzg(int, int, com.google.android.gms.internal.ads.zzzv):void");
    }

    public final void zzj(int i, long j) throws zzbu {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw zzbu.zza("ContentEncodingOrder " + j + " not supported", null);
        } else if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw zzbu.zza("ContentEncodingScope " + j + " not supported", null);
        } else {
            switch (i) {
                case 131:
                    zzt(i);
                    this.zzB.zzd = (int) j;
                    return;
                case 136:
                    zzt(i);
                    this.zzB.zzU = j == 1;
                    return;
                case 155:
                    this.zzP = zzr(j);
                    return;
                case 159:
                    zzt(i);
                    this.zzB.zzN = (int) j;
                    return;
                case 176:
                    zzt(i);
                    this.zzB.zzl = (int) j;
                    return;
                case 179:
                    zzs(i);
                    this.zzJ.zzc(zzr(j));
                    return;
                case 186:
                    zzt(i);
                    this.zzB.zzm = (int) j;
                    return;
                case 215:
                    zzt(i);
                    this.zzB.zzc = (int) j;
                    return;
                case 231:
                    this.zzI = zzr(j);
                    return;
                case 238:
                    this.zzW = (int) j;
                    return;
                case 241:
                    if (this.zzL) {
                        return;
                    }
                    zzs(i);
                    this.zzK.zzc(j);
                    this.zzL = true;
                    return;
                case 251:
                    this.zzX = true;
                    return;
                case 16871:
                    zzt(i);
                    this.zzB.zzX = (int) j;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw zzbu.zza("ContentCompAlgo " + j + " not supported", null);
                case 17029:
                    if (j < 1 || j > 2) {
                        throw zzbu.zza("DocTypeReadVersion " + j + " not supported", null);
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw zzbu.zza("EBMLReadVersion " + j + " not supported", null);
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw zzbu.zza("ContentEncAlgo " + j + " not supported", null);
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw zzbu.zza("AESSettingsCipherMode " + j + " not supported", null);
                case 21420:
                    this.zzE = j + this.zzx;
                    return;
                case 21432:
                    int i2 = (int) j;
                    zzt(i);
                    if (i2 == 0) {
                        this.zzB.zzv = 0;
                        return;
                    } else if (i2 == 1) {
                        this.zzB.zzv = 2;
                        return;
                    } else if (i2 == 3) {
                        this.zzB.zzv = 1;
                        return;
                    } else if (i2 != 15) {
                        return;
                    } else {
                        this.zzB.zzv = 3;
                        return;
                    }
                case 21680:
                    zzt(i);
                    this.zzB.zzn = (int) j;
                    return;
                case 21682:
                    zzt(i);
                    this.zzB.zzp = (int) j;
                    return;
                case 21690:
                    zzt(i);
                    this.zzB.zzo = (int) j;
                    return;
                case 21930:
                    zzt(i);
                    this.zzB.zzT = j == 1;
                    return;
                case 21998:
                    zzt(i);
                    this.zzB.zzf = (int) j;
                    return;
                case 22186:
                    zzt(i);
                    this.zzB.zzQ = j;
                    return;
                case 22203:
                    zzt(i);
                    this.zzB.zzR = j;
                    return;
                case 25188:
                    zzt(i);
                    this.zzB.zzO = (int) j;
                    return;
                case 30114:
                    this.zzY = j;
                    return;
                case 30321:
                    zzt(i);
                    int i3 = (int) j;
                    if (i3 == 0) {
                        this.zzB.zzq = 0;
                        return;
                    } else if (i3 == 1) {
                        this.zzB.zzq = 1;
                        return;
                    } else if (i3 == 2) {
                        this.zzB.zzq = 2;
                        return;
                    } else if (i3 != 3) {
                        return;
                    } else {
                        this.zzB.zzq = 3;
                        return;
                    }
                case 2352003:
                    zzt(i);
                    this.zzB.zze = (int) j;
                    return;
                case 2807729:
                    this.zzy = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            zzt(i);
                            int i4 = (int) j;
                            if (i4 == 1) {
                                this.zzB.zzz = 2;
                                return;
                            } else if (i4 != 2) {
                                return;
                            } else {
                                this.zzB.zzz = 1;
                                return;
                            }
                        case 21946:
                            zzt(i);
                            int zzb2 = zzq.zzb((int) j);
                            if (zzb2 != -1) {
                                this.zzB.zzy = zzb2;
                                return;
                            }
                            return;
                        case 21947:
                            zzt(i);
                            this.zzB.zzw = true;
                            int zza2 = zzq.zza((int) j);
                            if (zza2 != -1) {
                                this.zzB.zzx = zza2;
                                return;
                            }
                            return;
                        case 21948:
                            zzt(i);
                            this.zzB.zzA = (int) j;
                            return;
                        case 21949:
                            zzt(i);
                            this.zzB.zzB = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    public final void zzi(int i, double d) throws zzbu {
        if (i == 181) {
            zzt(i);
            this.zzB.zzP = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    zzt(i);
                    this.zzB.zzC = (float) d;
                    return;
                case 21970:
                    zzt(i);
                    this.zzB.zzD = (float) d;
                    return;
                case 21971:
                    zzt(i);
                    this.zzB.zzE = (float) d;
                    return;
                case 21972:
                    zzt(i);
                    this.zzB.zzF = (float) d;
                    return;
                case 21973:
                    zzt(i);
                    this.zzB.zzG = (float) d;
                    return;
                case 21974:
                    zzt(i);
                    this.zzB.zzH = (float) d;
                    return;
                case 21975:
                    zzt(i);
                    this.zzB.zzI = (float) d;
                    return;
                case 21976:
                    zzt(i);
                    this.zzB.zzJ = (float) d;
                    return;
                case 21977:
                    zzt(i);
                    this.zzB.zzK = (float) d;
                    return;
                case 21978:
                    zzt(i);
                    this.zzB.zzL = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            zzt(i);
                            this.zzB.zzr = (float) d;
                            return;
                        case 30324:
                            zzt(i);
                            this.zzB.zzs = (float) d;
                            return;
                        case 30325:
                            zzt(i);
                            this.zzB.zzt = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.zzz = (long) d;
        }
    }
}
