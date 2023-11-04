package com.google.android.gms.internal.ads;

import cz.msebera.android.httpclient.client.config.CookieSpecs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaf {
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    private int zzal;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final String zzj;
    public final zzbq zzk;
    public final String zzl;
    public final String zzm;
    public final int zzn;
    public final List zzo;
    public final zzx zzp;
    public final long zzq;
    public final int zzr;
    public final int zzs;
    public final float zzt;
    public final int zzu;
    public final float zzv;
    public final byte[] zzw;
    public final int zzx;
    public final zzq zzy;
    public final int zzz;
    private static final zzaf zzG = new zzaf(new zzad());
    private static final String zzH = zzew.zzP(0);
    private static final String zzI = zzew.zzP(1);
    private static final String zzJ = zzew.zzP(2);
    private static final String zzK = zzew.zzP(3);
    private static final String zzL = zzew.zzP(4);
    private static final String zzM = zzew.zzP(5);
    private static final String zzN = zzew.zzP(6);
    private static final String zzO = zzew.zzP(7);
    private static final String zzP = zzew.zzP(8);
    private static final String zzQ = zzew.zzP(9);
    private static final String zzR = zzew.zzP(10);
    private static final String zzS = zzew.zzP(11);
    private static final String zzT = zzew.zzP(12);
    private static final String zzU = zzew.zzP(13);
    private static final String zzV = zzew.zzP(14);
    private static final String zzW = zzew.zzP(15);
    private static final String zzX = zzew.zzP(16);
    private static final String zzY = zzew.zzP(17);
    private static final String zzZ = zzew.zzP(18);
    private static final String zzaa = zzew.zzP(19);
    private static final String zzab = zzew.zzP(20);
    private static final String zzac = zzew.zzP(21);
    private static final String zzad = zzew.zzP(22);
    private static final String zzae = zzew.zzP(23);
    private static final String zzaf = zzew.zzP(24);
    private static final String zzag = zzew.zzP(25);
    private static final String zzah = zzew.zzP(26);
    private static final String zzai = zzew.zzP(27);
    private static final String zzaj = zzew.zzP(28);
    private static final String zzak = zzew.zzP(29);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzab
    };

    /* JADX INFO: Access modifiers changed from: private */
    public zzaf(zzad zzadVar) {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        String str4;
        zzbq zzbqVar;
        String str5;
        String str6;
        int i4;
        List list;
        zzx zzxVar;
        long j;
        int i5;
        int i6;
        float f;
        int i7;
        float f2;
        byte[] bArr;
        int i8;
        zzq zzqVar;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        str = zzadVar.zza;
        this.zzb = str;
        str2 = zzadVar.zzb;
        this.zzc = str2;
        str3 = zzadVar.zzc;
        this.zzd = zzew.zzQ(str3);
        i = zzadVar.zzd;
        this.zze = i;
        this.zzf = 0;
        i2 = zzadVar.zze;
        this.zzg = i2;
        i3 = zzadVar.zzf;
        this.zzh = i3;
        this.zzi = i3 != -1 ? i3 : i2;
        str4 = zzadVar.zzg;
        this.zzj = str4;
        zzbqVar = zzadVar.zzh;
        this.zzk = zzbqVar;
        str5 = zzadVar.zzi;
        this.zzl = str5;
        str6 = zzadVar.zzj;
        this.zzm = str6;
        i4 = zzadVar.zzk;
        this.zzn = i4;
        list = zzadVar.zzl;
        this.zzo = list == null ? Collections.emptyList() : zzadVar.zzl;
        zzxVar = zzadVar.zzm;
        this.zzp = zzxVar;
        j = zzadVar.zzn;
        this.zzq = j;
        i5 = zzadVar.zzo;
        this.zzr = i5;
        i6 = zzadVar.zzp;
        this.zzs = i6;
        f = zzadVar.zzq;
        this.zzt = f;
        i7 = zzadVar.zzr;
        this.zzu = i7 == -1 ? 0 : zzadVar.zzr;
        f2 = zzadVar.zzs;
        this.zzv = f2 == -1.0f ? 1.0f : zzadVar.zzs;
        bArr = zzadVar.zzt;
        this.zzw = bArr;
        i8 = zzadVar.zzu;
        this.zzx = i8;
        zzqVar = zzadVar.zzv;
        this.zzy = zzqVar;
        i9 = zzadVar.zzw;
        this.zzz = i9;
        i10 = zzadVar.zzx;
        this.zzA = i10;
        i11 = zzadVar.zzy;
        this.zzB = i11;
        i12 = zzadVar.zzz;
        this.zzC = i12 == -1 ? 0 : zzadVar.zzz;
        i13 = zzadVar.zzA;
        this.zzD = i13 != -1 ? zzadVar.zzA : 0;
        i14 = zzadVar.zzB;
        this.zzE = i14;
        i15 = zzadVar.zzC;
        this.zzF = (i15 != 0 || zzxVar == null) ? zzadVar.zzC : 1;
    }

    public static String zzd(zzaf zzafVar) {
        if (zzafVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(zzafVar.zzb);
        sb.append(", mimeType=");
        sb.append(zzafVar.zzm);
        if (zzafVar.zzi != -1) {
            sb.append(", bitrate=");
            sb.append(zzafVar.zzi);
        }
        if (zzafVar.zzj != null) {
            sb.append(", codecs=");
            sb.append(zzafVar.zzj);
        }
        if (zzafVar.zzp != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (true) {
                zzx zzxVar = zzafVar.zzp;
                if (i >= zzxVar.zzb) {
                    break;
                }
                UUID uuid = zzxVar.zza(i).zza;
                if (uuid.equals(zzo.zzb)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(zzo.zzc)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(zzo.zze)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(zzo.zzd)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(zzo.zza)) {
                    linkedHashSet.add("universal");
                } else {
                    String obj = uuid.toString();
                    linkedHashSet.add("unknown (" + obj + ")");
                }
                i++;
            }
            sb.append(", drm=[");
            zzfnk.zzb(sb, linkedHashSet, ",");
            sb.append(']');
        }
        if (zzafVar.zzr != -1 && zzafVar.zzs != -1) {
            sb.append(", res=");
            sb.append(zzafVar.zzr);
            sb.append("x");
            sb.append(zzafVar.zzs);
        }
        if (zzafVar.zzt != -1.0f) {
            sb.append(", fps=");
            sb.append(zzafVar.zzt);
        }
        if (zzafVar.zzz != -1) {
            sb.append(", channels=");
            sb.append(zzafVar.zzz);
        }
        if (zzafVar.zzA != -1) {
            sb.append(", sample_rate=");
            sb.append(zzafVar.zzA);
        }
        if (zzafVar.zzd != null) {
            sb.append(", language=");
            sb.append(zzafVar.zzd);
        }
        if (zzafVar.zzc != null) {
            sb.append(", label=");
            sb.append(zzafVar.zzc);
        }
        if (zzafVar.zze != 0) {
            ArrayList arrayList = new ArrayList();
            if ((zzafVar.zze & 1) != 0) {
                arrayList.add(CookieSpecs.DEFAULT);
            }
            if ((zzafVar.zze & 2) != 0) {
                arrayList.add("forced");
            }
            sb.append(", selectionFlags=[");
            zzfnk.zzb(sb, arrayList, ",");
            sb.append("]");
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaf zzafVar = (zzaf) obj;
            int i2 = this.zzal;
            if ((i2 == 0 || (i = zzafVar.zzal) == 0 || i2 == i) && this.zze == zzafVar.zze && this.zzg == zzafVar.zzg && this.zzh == zzafVar.zzh && this.zzn == zzafVar.zzn && this.zzq == zzafVar.zzq && this.zzr == zzafVar.zzr && this.zzs == zzafVar.zzs && this.zzu == zzafVar.zzu && this.zzx == zzafVar.zzx && this.zzz == zzafVar.zzz && this.zzA == zzafVar.zzA && this.zzB == zzafVar.zzB && this.zzC == zzafVar.zzC && this.zzD == zzafVar.zzD && this.zzE == zzafVar.zzE && this.zzF == zzafVar.zzF && Float.compare(this.zzt, zzafVar.zzt) == 0 && Float.compare(this.zzv, zzafVar.zzv) == 0 && zzew.zzU(this.zzb, zzafVar.zzb) && zzew.zzU(this.zzc, zzafVar.zzc) && zzew.zzU(this.zzj, zzafVar.zzj) && zzew.zzU(this.zzl, zzafVar.zzl) && zzew.zzU(this.zzm, zzafVar.zzm) && zzew.zzU(this.zzd, zzafVar.zzd) && Arrays.equals(this.zzw, zzafVar.zzw) && zzew.zzU(this.zzk, zzafVar.zzk) && zzew.zzU(this.zzy, zzafVar.zzy) && zzew.zzU(this.zzp, zzafVar.zzp) && zze(zzafVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zzc;
        String str3 = this.zzl;
        String str4 = this.zzm;
        String str5 = this.zzj;
        int i = this.zzi;
        String str6 = this.zzd;
        int i2 = this.zzr;
        int i3 = this.zzs;
        float f = this.zzt;
        int i4 = this.zzz;
        int i5 = this.zzA;
        return "Format(" + str + ", " + str2 + ", " + str3 + ", " + str4 + ", " + str5 + ", " + i + ", " + str6 + ", [" + i2 + ", " + i3 + ", " + f + "], [" + i4 + ", " + i5 + "])";
    }

    public final int zza() {
        int i;
        int i2 = this.zzr;
        if (i2 == -1 || (i = this.zzs) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final zzad zzb() {
        return new zzad(this, null);
    }

    public final zzaf zzc(int i) {
        zzad zzadVar = new zzad(this, null);
        zzadVar.zzA(i);
        return new zzaf(zzadVar);
    }

    public final boolean zze(zzaf zzafVar) {
        if (this.zzo.size() == zzafVar.zzo.size()) {
            for (int i = 0; i < this.zzo.size(); i++) {
                if (!Arrays.equals((byte[]) this.zzo.get(i), (byte[]) zzafVar.zzo.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzal;
        if (i == 0) {
            String str = this.zzb;
            int hashCode = str == null ? 0 : str.hashCode();
            String str2 = this.zzc;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            int i2 = hashCode + 527;
            String str3 = this.zzd;
            int hashCode3 = (((((((((i2 * 31) + hashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zze) * 961) + this.zzg) * 31) + this.zzh;
            String str4 = this.zzj;
            int hashCode4 = ((hashCode3 * 31) + (str4 == null ? 0 : str4.hashCode())) * 31;
            zzbq zzbqVar = this.zzk;
            int hashCode5 = (hashCode4 + (zzbqVar == null ? 0 : zzbqVar.hashCode())) * 31;
            String str5 = this.zzl;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.zzm;
            int hashCode7 = ((((((((((((((((((((((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.zzn) * 31) + ((int) this.zzq)) * 31) + this.zzr) * 31) + this.zzs) * 31) + Float.floatToIntBits(this.zzt)) * 31) + this.zzu) * 31) + Float.floatToIntBits(this.zzv)) * 31) + this.zzx) * 31) + this.zzz) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF;
            this.zzal = hashCode7;
            return hashCode7;
        }
        return i;
    }
}
