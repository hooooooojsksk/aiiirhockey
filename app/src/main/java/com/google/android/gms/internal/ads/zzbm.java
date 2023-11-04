package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbm {
    public final CharSequence zzc;
    public final CharSequence zzd;
    public final CharSequence zze;
    public final CharSequence zzf;
    public final CharSequence zzg;
    public final byte[] zzh;
    public final Integer zzi;
    public final Integer zzj;
    public final Integer zzk;
    public final Integer zzl;
    public final Boolean zzm;
    @Deprecated
    public final Integer zzn;
    public final Integer zzo;
    public final Integer zzp;
    public final Integer zzq;
    public final Integer zzr;
    public final Integer zzs;
    public final Integer zzt;
    public final CharSequence zzu;
    public final CharSequence zzv;
    public final CharSequence zzw;
    public final CharSequence zzx;
    public final CharSequence zzy;
    public final Integer zzz;
    public static final zzbm zza = new zzbm(new zzbk());
    private static final String zzA = zzew.zzP(0);
    private static final String zzB = zzew.zzP(1);
    private static final String zzC = zzew.zzP(2);
    private static final String zzD = zzew.zzP(3);
    private static final String zzE = zzew.zzP(4);
    private static final String zzF = zzew.zzP(5);
    private static final String zzG = zzew.zzP(6);
    private static final String zzH = zzew.zzP(8);
    private static final String zzI = zzew.zzP(9);
    private static final String zzJ = zzew.zzP(10);
    private static final String zzK = zzew.zzP(11);
    private static final String zzL = zzew.zzP(12);
    private static final String zzM = zzew.zzP(13);
    private static final String zzN = zzew.zzP(14);
    private static final String zzO = zzew.zzP(15);
    private static final String zzP = zzew.zzP(16);
    private static final String zzQ = zzew.zzP(17);
    private static final String zzR = zzew.zzP(18);
    private static final String zzS = zzew.zzP(19);
    private static final String zzT = zzew.zzP(20);
    private static final String zzU = zzew.zzP(21);
    private static final String zzV = zzew.zzP(22);
    private static final String zzW = zzew.zzP(23);
    private static final String zzX = zzew.zzP(24);
    private static final String zzY = zzew.zzP(25);
    private static final String zzZ = zzew.zzP(26);
    private static final String zzaa = zzew.zzP(27);
    private static final String zzab = zzew.zzP(28);
    private static final String zzac = zzew.zzP(29);
    private static final String zzad = zzew.zzP(30);
    private static final String zzae = zzew.zzP(31);
    private static final String zzaf = zzew.zzP(32);
    private static final String zzag = zzew.zzP(1000);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzbi
    };

    /* JADX INFO: Access modifiers changed from: private */
    public zzbm(zzbk zzbkVar) {
        Boolean bool;
        Integer num;
        Integer num2;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        byte[] bArr;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        Integer num12;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        CharSequence charSequence10;
        bool = zzbkVar.zzk;
        num = zzbkVar.zzj;
        num2 = zzbkVar.zzw;
        int i = 1;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    num = Integer.valueOf(i);
                }
                i = 0;
                num = Integer.valueOf(i);
            }
        } else if (num != null) {
            bool = Boolean.valueOf(num.intValue() != -1);
            if (bool.booleanValue() && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num2 = Integer.valueOf(i2);
            }
        }
        charSequence = zzbkVar.zza;
        this.zzc = charSequence;
        charSequence2 = zzbkVar.zzb;
        this.zzd = charSequence2;
        charSequence3 = zzbkVar.zzc;
        this.zze = charSequence3;
        charSequence4 = zzbkVar.zzd;
        this.zzf = charSequence4;
        charSequence5 = zzbkVar.zze;
        this.zzg = charSequence5;
        bArr = zzbkVar.zzf;
        this.zzh = bArr;
        num3 = zzbkVar.zzg;
        this.zzi = num3;
        num4 = zzbkVar.zzh;
        this.zzj = num4;
        num5 = zzbkVar.zzi;
        this.zzk = num5;
        this.zzl = num;
        this.zzm = bool;
        num6 = zzbkVar.zzl;
        this.zzn = num6;
        num7 = zzbkVar.zzl;
        this.zzo = num7;
        num8 = zzbkVar.zzm;
        this.zzp = num8;
        num9 = zzbkVar.zzn;
        this.zzq = num9;
        num10 = zzbkVar.zzo;
        this.zzr = num10;
        num11 = zzbkVar.zzp;
        this.zzs = num11;
        num12 = zzbkVar.zzq;
        this.zzt = num12;
        charSequence6 = zzbkVar.zzr;
        this.zzu = charSequence6;
        charSequence7 = zzbkVar.zzs;
        this.zzv = charSequence7;
        charSequence8 = zzbkVar.zzt;
        this.zzw = charSequence8;
        charSequence9 = zzbkVar.zzu;
        this.zzx = charSequence9;
        charSequence10 = zzbkVar.zzv;
        this.zzy = charSequence10;
        this.zzz = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzbm zzbmVar = (zzbm) obj;
            if (zzew.zzU(this.zzc, zzbmVar.zzc) && zzew.zzU(this.zzd, zzbmVar.zzd) && zzew.zzU(this.zze, zzbmVar.zze) && zzew.zzU(this.zzf, zzbmVar.zzf) && zzew.zzU(null, null) && zzew.zzU(null, null) && zzew.zzU(this.zzg, zzbmVar.zzg) && zzew.zzU(null, null) && zzew.zzU(null, null) && Arrays.equals(this.zzh, zzbmVar.zzh) && zzew.zzU(this.zzi, zzbmVar.zzi) && zzew.zzU(null, null) && zzew.zzU(this.zzj, zzbmVar.zzj) && zzew.zzU(this.zzk, zzbmVar.zzk) && zzew.zzU(this.zzl, zzbmVar.zzl) && zzew.zzU(this.zzm, zzbmVar.zzm) && zzew.zzU(null, null) && zzew.zzU(this.zzo, zzbmVar.zzo) && zzew.zzU(this.zzp, zzbmVar.zzp) && zzew.zzU(this.zzq, zzbmVar.zzq) && zzew.zzU(this.zzr, zzbmVar.zzr) && zzew.zzU(this.zzs, zzbmVar.zzs) && zzew.zzU(this.zzt, zzbmVar.zzt) && zzew.zzU(this.zzu, zzbmVar.zzu) && zzew.zzU(this.zzv, zzbmVar.zzv) && zzew.zzU(this.zzw, zzbmVar.zzw) && zzew.zzU(null, null) && zzew.zzU(null, null) && zzew.zzU(this.zzx, zzbmVar.zzx) && zzew.zzU(null, null) && zzew.zzU(this.zzy, zzbmVar.zzy) && zzew.zzU(this.zzz, zzbmVar.zzz)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzc, this.zzd, this.zze, this.zzf, null, null, this.zzg, null, null, Integer.valueOf(Arrays.hashCode(this.zzh)), this.zzi, null, this.zzj, this.zzk, this.zzl, this.zzm, null, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzw, null, null, this.zzx, null, this.zzy, this.zzz});
    }

    public final zzbk zza() {
        return new zzbk(this, null);
    }
}
