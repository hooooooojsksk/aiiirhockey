package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.games.GamesStatusCodes;
import cz.msebera.android.httpclient.message.TokenParser;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzaet {
    public byte[] zzM;
    public zzabc zzS;
    public boolean zzT;
    public zzabb zzV;
    public int zzW;
    private int zzX;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzaba zzi;
    public byte[] zzj;
    public zzx zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = 0;
    public int zzq = -1;
    public float zzr = 0.0f;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public byte[] zzu = null;
    public int zzv = -1;
    public boolean zzw = false;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = 1000;
    public int zzB = 200;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public int zzN = 1;
    public int zzO = -1;
    public int zzP = GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY;
    public long zzQ = 0;
    public long zzR = 0;
    public boolean zzU = true;
    private String zzY = "eng";

    private static Pair zzf(zzen zzenVar) throws zzbu {
        try {
            zzenVar.zzG(16);
            long zzq = zzenVar.zzq();
            if (zzq == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzq == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (zzq != 826496599) {
                zzee.zze("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int zzc = zzenVar.zzc() + 20;
            byte[] zzH = zzenVar.zzH();
            while (true) {
                int length = zzH.length;
                if (zzc < length - 4) {
                    if (zzH[zzc] == 0 && zzH[zzc + 1] == 0 && zzH[zzc + 2] == 1 && zzH[zzc + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzH, zzc, length)));
                    }
                    zzc++;
                } else {
                    throw zzbu.zza("Failed to find FourCC VC1 initialization data", null);
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzbu {
        int i;
        int i2;
        try {
            if (bArr[0] == 2) {
                int i3 = 1;
                int i4 = 0;
                while (true) {
                    i = bArr[i3] & 255;
                    if (i != 255) {
                        break;
                    }
                    i3++;
                    i4 += 255;
                }
                int i5 = i4 + i;
                int i6 = i3 + 1;
                int i7 = 0;
                while (true) {
                    i2 = bArr[i6] & 255;
                    if (i2 != 255) {
                        break;
                    }
                    i6++;
                    i7 += 255;
                }
                int i8 = i6 + 1;
                int i9 = i7 + i2;
                if (bArr[i8] != 1) {
                    throw zzbu.zza("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i5];
                System.arraycopy(bArr, i8, bArr2, 0, i5);
                int i10 = i8 + i5;
                if (bArr[i10] != 3) {
                    throw zzbu.zza("Error parsing vorbis codec private", null);
                }
                int i11 = i10 + i9;
                if (bArr[i11] == 5) {
                    int length = bArr.length - i11;
                    byte[] bArr3 = new byte[length];
                    System.arraycopy(bArr, i11, bArr3, 0, length);
                    ArrayList arrayList = new ArrayList(2);
                    arrayList.add(bArr2);
                    arrayList.add(bArr3);
                    return arrayList;
                }
                throw zzbu.zza("Error parsing vorbis codec private", null);
            }
            throw zzbu.zza("Error parsing vorbis codec private", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzen zzenVar) throws zzbu {
        UUID uuid;
        UUID uuid2;
        try {
            int zzi = zzenVar.zzi();
            if (zzi == 1) {
                return true;
            }
            if (zzi == 65534) {
                zzenVar.zzF(24);
                long zzr = zzenVar.zzr();
                uuid = zzaeu.zzf;
                if (zzr == uuid.getMostSignificantBits()) {
                    long zzr2 = zzenVar.zzr();
                    uuid2 = zzaeu.zzf;
                    if (zzr2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.zza("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzbu {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzbu.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    public final void zze(zzzx zzzxVar, int i) throws zzbu {
        char c;
        List singletonList;
        List list;
        String str;
        int i2;
        String str2;
        byte[] bArr;
        int i3;
        int i4;
        Map map;
        Map map2;
        int i5;
        Map map3;
        zzzq zza;
        String str3 = this.zzb;
        int i6 = 1;
        int i7 = 4;
        int i8 = 0;
        switch (str3.hashCode()) {
            case -2095576542:
                if (str3.equals("V_MPEG4/ISO/AP")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str3.equals("V_MPEG4/ISO/SP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str3.equals("A_MS/ACM")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str3.equals("A_TRUEHD")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str3.equals("A_VORBIS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str3.equals("A_MPEG/L2")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str3.equals("A_MPEG/L3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str3.equals("V_MS/VFW/FOURCC")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str3.equals("S_DVBSUB")) {
                    c = TokenParser.SP;
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str3.equals("V_MPEG4/ISO/ASP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str3.equals("V_MPEG4/ISO/AVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str3.equals("S_VOBSUB")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str3.equals("A_DTS/LOSSLESS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str3.equals("A_AAC")) {
                    c = TokenParser.CR;
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str3.equals("A_AC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str3.equals("A_DTS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str3.equals("V_AV1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str3.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str3.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str3.equals("S_HDMV/PGS")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str3.equals("V_THEORA")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str3.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                if (str3.equals("A_PCM/FLOAT/IEEE")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 725948237:
                if (str3.equals("A_PCM/INT/BIG")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str3.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str3.equals("S_TEXT/ASS")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str3.equals("V_MPEGH/ISO/HEVC")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1045209816:
                if (str3.equals("S_TEXT/WEBVTT")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str3.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str3.equals("V_MPEG2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str3.equals("A_EAC3")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str3.equals("A_FLAC")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str3.equals("A_OPUS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str4 = "audio/raw";
        zzq zzqVar = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        byte[] bArr2 = null;
        switch (c) {
            case 0:
                str4 = "video/x-vnd.on2.vp8";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i7 = -1;
                break;
            case 1:
                str4 = "video/x-vnd.on2.vp9";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i7 = -1;
                break;
            case 2:
                str4 = "video/av01";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i7 = -1;
                break;
            case 3:
                str4 = "video/mpeg2";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i7 = -1;
                break;
            case 4:
            case 5:
            case 6:
                byte[] bArr3 = this.zzj;
                singletonList = bArr3 == null ? null : Collections.singletonList(bArr3);
                str4 = "video/mp4v-es";
                str2 = null;
                i2 = -1;
                i7 = -1;
                break;
            case 7:
                zzyz zza2 = zzyz.zza(new zzen(zzi(this.zzb)));
                list = zza2.zza;
                this.zzW = zza2.zzb;
                str = zza2.zzf;
                str4 = "video/avc";
                i2 = -1;
                i7 = -1;
                List list2 = list;
                str2 = str;
                singletonList = list2;
                break;
            case '\b':
                zzaak zza3 = zzaak.zza(new zzen(zzi(this.zzb)));
                list = zza3.zza;
                this.zzW = zza3.zzb;
                str = zza3.zzd;
                str4 = "video/hevc";
                i2 = -1;
                i7 = -1;
                List list22 = list;
                str2 = str;
                singletonList = list22;
                break;
            case '\t':
                Pair zzf = zzf(new zzen(zzi(this.zzb)));
                str4 = (String) zzf.first;
                singletonList = (List) zzf.second;
                str2 = null;
                i2 = -1;
                i7 = -1;
                break;
            case '\n':
                str4 = "video/x-unknown";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i7 = -1;
                break;
            case 11:
                singletonList = zzg(zzi(str3));
                str4 = "audio/vorbis";
                str2 = null;
                i2 = 8192;
                i7 = -1;
                break;
            case '\f':
                singletonList = new ArrayList(3);
                singletonList.add(zzi(this.zzb));
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzQ).array());
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzR).array());
                str4 = "audio/opus";
                str2 = null;
                i2 = 5760;
                i7 = -1;
                break;
            case '\r':
                singletonList = Collections.singletonList(zzi(str3));
                zzyr zza4 = zzys.zza(this.zzj);
                this.zzP = zza4.zza;
                this.zzN = zza4.zzb;
                str2 = zza4.zzc;
                str4 = "audio/mp4a-latm";
                i2 = -1;
                i7 = -1;
                break;
            case 14:
                str4 = "audio/mpeg-L2";
                singletonList = null;
                str2 = null;
                i2 = 4096;
                i7 = -1;
                break;
            case 15:
                str4 = "audio/mpeg";
                singletonList = null;
                str2 = null;
                i2 = 4096;
                i7 = -1;
                break;
            case 16:
                str4 = "audio/ac3";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i7 = -1;
                break;
            case 17:
                str4 = "audio/eac3";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i7 = -1;
                break;
            case 18:
                this.zzS = new zzabc();
                str4 = "audio/true-hd";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i7 = -1;
                break;
            case 19:
            case 20:
                str4 = "audio/vnd.dts";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i7 = -1;
                break;
            case 21:
                str4 = "audio/vnd.dts.hd";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i7 = -1;
                break;
            case 22:
                singletonList = Collections.singletonList(zzi(str3));
                str4 = "audio/flac";
                str2 = null;
                i2 = -1;
                i7 = -1;
                break;
            case 23:
                if (zzh(new zzen(zzi(this.zzb)))) {
                    i7 = zzew.zzn(this.zzO);
                    if (i7 == 0) {
                        zzee.zze("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzO + ". Setting mimeType to audio/x-unknown");
                    }
                    singletonList = null;
                    str2 = null;
                    i2 = -1;
                    break;
                } else {
                    zzee.zze("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                }
                singletonList = null;
                str2 = null;
                str4 = "audio/x-unknown";
                i2 = -1;
                i7 = -1;
                break;
            case 24:
                i7 = zzew.zzn(this.zzO);
                if (i7 == 0) {
                    zzee.zze("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzO + ". Setting mimeType to audio/x-unknown");
                    singletonList = null;
                    str2 = null;
                    str4 = "audio/x-unknown";
                    i2 = -1;
                    i7 = -1;
                    break;
                }
                singletonList = null;
                str2 = null;
                i2 = -1;
                break;
            case 25:
                int i9 = this.zzO;
                if (i9 != 8) {
                    if (i9 != 16) {
                        zzee.zze("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i9 + ". Setting mimeType to audio/x-unknown");
                        singletonList = null;
                        str2 = null;
                        str4 = "audio/x-unknown";
                        i2 = -1;
                        i7 = -1;
                        break;
                    } else {
                        i7 = DriveFile.MODE_READ_ONLY;
                        singletonList = null;
                        str2 = null;
                        i2 = -1;
                        break;
                    }
                } else {
                    singletonList = null;
                    str2 = null;
                    i2 = -1;
                    i7 = 3;
                    break;
                }
            case 26:
                int i10 = this.zzO;
                if (i10 != 32) {
                    zzee.zze("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i10 + ". Setting mimeType to audio/x-unknown");
                    singletonList = null;
                    str2 = null;
                    str4 = "audio/x-unknown";
                    i2 = -1;
                    i7 = -1;
                    break;
                }
                singletonList = null;
                str2 = null;
                i2 = -1;
                break;
            case 27:
                str4 = "application/x-subrip";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i7 = -1;
                break;
            case 28:
                bArr = zzaeu.zzc;
                singletonList = zzfqk.zzq(bArr, zzi(this.zzb));
                str2 = null;
                str4 = "text/x-ssa";
                i2 = -1;
                i7 = -1;
                break;
            case 29:
                singletonList = null;
                str2 = null;
                str4 = "text/vtt";
                i2 = -1;
                i7 = -1;
                break;
            case 30:
                singletonList = zzfqk.zzp(zzi(str3));
                str4 = "application/vobsub";
                str2 = null;
                i2 = -1;
                i7 = -1;
                break;
            case 31:
                str4 = "application/pgs";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i7 = -1;
                break;
            case ' ':
                byte[] bArr4 = new byte[4];
                System.arraycopy(zzi(str3), 0, bArr4, 0, 4);
                singletonList = zzfqk.zzp(bArr4);
                str4 = "application/dvbsubs";
                str2 = null;
                i2 = -1;
                i7 = -1;
                break;
            default:
                throw zzbu.zza("Unrecognized codec identifier.", null);
        }
        if (this.zzM != null && (zza = zzzq.zza(new zzen(this.zzM))) != null) {
            str2 = zza.zza;
            str4 = "video/dolby-vision";
        }
        String str5 = str4;
        int i11 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
        zzad zzadVar = new zzad();
        if (zzbt.zzg(str5)) {
            zzadVar.zzw(this.zzN);
            zzadVar.zzT(this.zzP);
            zzadVar.zzN(i7);
        } else if (zzbt.zzh(str5)) {
            if (this.zzp == 0) {
                int i12 = this.zzn;
                i3 = -1;
                if (i12 == -1) {
                    i12 = this.zzl;
                }
                this.zzn = i12;
                int i13 = this.zzo;
                if (i13 == -1) {
                    i13 = this.zzm;
                }
                this.zzo = i13;
            } else {
                i3 = -1;
            }
            float f = (this.zzn == i3 || (i5 = this.zzo) == i3) ? -1.0f : (this.zzm * i4) / (this.zzl * i5);
            if (this.zzw) {
                if (this.zzC != -1.0f && this.zzD != -1.0f && this.zzE != -1.0f && this.zzF != -1.0f && this.zzG != -1.0f && this.zzH != -1.0f && this.zzI != -1.0f && this.zzJ != -1.0f && this.zzK != -1.0f && this.zzL != -1.0f) {
                    bArr2 = new byte[25];
                    ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                    order.put((byte) 0);
                    order.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                    order.putShort((short) (this.zzK + 0.5f));
                    order.putShort((short) (this.zzL + 0.5f));
                    order.putShort((short) this.zzA);
                    order.putShort((short) this.zzB);
                }
                zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
            }
            if (this.zza != null) {
                map = zzaeu.zzg;
                if (map.containsKey(this.zza)) {
                    map2 = zzaeu.zzg;
                    i3 = ((Integer) map2.get(this.zza)).intValue();
                }
            }
            if (this.zzq == 0 && Float.compare(this.zzr, 0.0f) == 0 && Float.compare(this.zzs, 0.0f) == 0) {
                if (Float.compare(this.zzt, 0.0f) != 0) {
                    if (Float.compare(this.zzs, 90.0f) == 0) {
                        i8 = 90;
                    } else if (Float.compare(this.zzs, -180.0f) == 0 || Float.compare(this.zzs, 180.0f) == 0) {
                        i8 = 180;
                    } else if (Float.compare(this.zzs, -90.0f) == 0) {
                        i8 = 270;
                    }
                }
                zzadVar.zzX(this.zzl);
                zzadVar.zzF(this.zzm);
                zzadVar.zzP(f);
                zzadVar.zzR(i8);
                zzadVar.zzQ(this.zzu);
                zzadVar.zzV(this.zzv);
                zzadVar.zzy(zzqVar);
                i6 = 2;
            }
            i8 = i3;
            zzadVar.zzX(this.zzl);
            zzadVar.zzF(this.zzm);
            zzadVar.zzP(f);
            zzadVar.zzR(i8);
            zzadVar.zzQ(this.zzu);
            zzadVar.zzV(this.zzv);
            zzadVar.zzy(zzqVar);
            i6 = 2;
        } else if (!"application/x-subrip".equals(str5) && !"text/x-ssa".equals(str5) && !"text/vtt".equals(str5) && !"application/vobsub".equals(str5) && !"application/pgs".equals(str5) && !"application/dvbsubs".equals(str5)) {
            throw zzbu.zza("Unexpected MIME type.", null);
        } else {
            i6 = 3;
        }
        if (this.zza != null) {
            map3 = zzaeu.zzg;
            if (!map3.containsKey(this.zza)) {
                zzadVar.zzJ(this.zza);
            }
        }
        zzadVar.zzG(i);
        zzadVar.zzS(str5);
        zzadVar.zzL(i2);
        zzadVar.zzK(this.zzY);
        zzadVar.zzU(i11);
        zzadVar.zzI(singletonList);
        zzadVar.zzx(str2);
        zzadVar.zzB(this.zzk);
        zzaf zzY = zzadVar.zzY();
        zzabb zzv = zzzxVar.zzv(this.zzc, i6);
        this.zzV = zzv;
        zzv.zzk(zzY);
    }
}
