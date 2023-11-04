package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public class zzcu {
    private static final String zzD;
    private static final String zzE;
    private static final String zzF;
    private static final String zzG;
    private static final String zzH;
    private static final String zzI;
    private static final String zzJ;
    private static final String zzK;
    private static final String zzL;
    private static final String zzM;
    private static final String zzN;
    private static final String zzO;
    private static final String zzP;
    private static final String zzQ;
    private static final String zzR;
    private static final String zzS;
    private static final String zzT;
    private static final String zzU;
    private static final String zzV;
    private static final String zzW;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    public static final zzcu zza;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    @Deprecated
    public static final zzcu zzb;
    @Deprecated
    public static final zzn zzc;
    public final boolean zzA;
    public final zzfqn zzB;
    public final zzfqp zzC;
    public final int zzd = Integer.MAX_VALUE;
    public final int zze = Integer.MAX_VALUE;
    public final int zzf = Integer.MAX_VALUE;
    public final int zzg = Integer.MAX_VALUE;
    public final int zzh = 0;
    public final int zzi = 0;
    public final int zzj = 0;
    public final int zzk = 0;
    public final int zzl;
    public final int zzm;
    public final boolean zzn;
    public final zzfqk zzo;
    public final int zzp;
    public final zzfqk zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final zzfqk zzu;
    public final zzfqk zzv;
    public final int zzw;
    public final int zzx;
    public final boolean zzy;
    public final boolean zzz;

    static {
        zzcu zzcuVar = new zzcu(new zzct());
        zza = zzcuVar;
        zzb = zzcuVar;
        zzD = zzew.zzP(1);
        zzE = zzew.zzP(2);
        zzF = zzew.zzP(3);
        zzG = zzew.zzP(4);
        zzH = zzew.zzP(5);
        zzI = zzew.zzP(6);
        zzJ = zzew.zzP(7);
        zzK = zzew.zzP(8);
        zzL = zzew.zzP(9);
        zzM = zzew.zzP(10);
        zzN = zzew.zzP(11);
        zzO = zzew.zzP(12);
        zzP = zzew.zzP(13);
        zzQ = zzew.zzP(14);
        zzR = zzew.zzP(15);
        zzS = zzew.zzP(16);
        zzT = zzew.zzP(17);
        zzU = zzew.zzP(18);
        zzV = zzew.zzP(19);
        zzW = zzew.zzP(20);
        zzX = zzew.zzP(21);
        zzY = zzew.zzP(22);
        zzZ = zzew.zzP(23);
        zzaa = zzew.zzP(24);
        zzab = zzew.zzP(25);
        zzac = zzew.zzP(26);
        zzc = new zzn() { // from class: com.google.android.gms.internal.ads.zzcs
        };
    }

    public zzcu(zzct zzctVar) {
        int i;
        int i2;
        boolean z;
        zzfqk zzfqkVar;
        zzfqk zzfqkVar2;
        zzfqk zzfqkVar3;
        zzfqk zzfqkVar4;
        int i3;
        HashMap hashMap;
        HashSet hashSet;
        i = zzctVar.zze;
        this.zzl = i;
        i2 = zzctVar.zzf;
        this.zzm = i2;
        z = zzctVar.zzg;
        this.zzn = z;
        zzfqkVar = zzctVar.zzh;
        this.zzo = zzfqkVar;
        this.zzp = 0;
        zzfqkVar2 = zzctVar.zzi;
        this.zzq = zzfqkVar2;
        this.zzr = 0;
        this.zzs = Integer.MAX_VALUE;
        this.zzt = Integer.MAX_VALUE;
        zzfqkVar3 = zzctVar.zzl;
        this.zzu = zzfqkVar3;
        zzfqkVar4 = zzctVar.zzm;
        this.zzv = zzfqkVar4;
        i3 = zzctVar.zzn;
        this.zzw = i3;
        this.zzx = 0;
        this.zzy = false;
        this.zzz = false;
        this.zzA = false;
        hashMap = zzctVar.zzo;
        this.zzB = zzfqn.zzc(hashMap);
        hashSet = zzctVar.zzp;
        this.zzC = zzfqp.zzl(hashSet);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzcu zzcuVar = (zzcu) obj;
            if (this.zzn == zzcuVar.zzn && this.zzl == zzcuVar.zzl && this.zzm == zzcuVar.zzm && this.zzo.equals(zzcuVar.zzo) && this.zzq.equals(zzcuVar.zzq) && this.zzu.equals(zzcuVar.zzu) && this.zzv.equals(zzcuVar.zzv) && this.zzw == zzcuVar.zzw && this.zzB.equals(zzcuVar.zzB) && this.zzC.equals(zzcuVar.zzC)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.zzn ? 1 : 0) - 1048002209) * 31) + this.zzl) * 31) + this.zzm) * 31) + this.zzo.hashCode()) * 961) + this.zzq.hashCode()) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.zzu.hashCode()) * 31) + this.zzv.hashCode()) * 31) + this.zzw) * 28629151) + this.zzB.hashCode()) * 31) + this.zzC.hashCode();
    }
}
