package com.google.android.gms.internal.drive;

/* loaded from: classes2.dex */
public class zznm {
    public static final zznm zzwu;
    public static final zznm zzwv;
    public static final zznm zzww;
    public static final zznm zzwx;
    public static final zznm zzwy;
    public static final zznm zzwz;
    public static final zznm zzxa;
    public static final zznm zzxb;
    public static final zznm zzxc;
    public static final zznm zzxd;
    public static final zznm zzxe;
    public static final zznm zzxf;
    public static final zznm zzxg;
    public static final zznm zzxh;
    public static final zznm zzxi;
    public static final zznm zzxj;
    public static final zznm zzxk;
    public static final zznm zzxl;
    private static final /* synthetic */ zznm[] zzxo;
    private final zznr zzxm;
    private final int zzxn;

    public static zznm[] values() {
        return (zznm[]) zzxo.clone();
    }

    private zznm(String str, int i, zznr zznrVar, int i2) {
        super(str, i);
        this.zzxm = zznrVar;
        this.zzxn = i2;
    }

    public final zznr zzfj() {
        return this.zzxm;
    }

    public final int zzfk() {
        return this.zzxn;
    }

    public /* synthetic */ zznm(String str, int i, zznr zznrVar, int i2, zznl zznlVar) {
        this(str, i, zznrVar, i2);
    }

    static {
        zznm zznmVar = new zznm("DOUBLE", 0, zznr.DOUBLE, 1);
        zzwu = zznmVar;
        zznm zznmVar2 = new zznm("FLOAT", 1, zznr.FLOAT, 5);
        zzwv = zznmVar2;
        zznm zznmVar3 = new zznm("INT64", 2, zznr.LONG, 0);
        zzww = zznmVar3;
        zznm zznmVar4 = new zznm("UINT64", 3, zznr.LONG, 0);
        zzwx = zznmVar4;
        zznm zznmVar5 = new zznm("INT32", 4, zznr.INT, 0);
        zzwy = zznmVar5;
        zznm zznmVar6 = new zznm("FIXED64", 5, zznr.LONG, 1);
        zzwz = zznmVar6;
        zznm zznmVar7 = new zznm("FIXED32", 6, zznr.INT, 5);
        zzxa = zznmVar7;
        zznm zznmVar8 = new zznm("BOOL", 7, zznr.BOOLEAN, 0);
        zzxb = zznmVar8;
        zznm zznmVar9 = new zznm("STRING", 8, zznr.STRING, 2) { // from class: com.google.android.gms.internal.drive.zznn
        };
        zzxc = zznmVar9;
        zznm zznmVar10 = new zznm("GROUP", 9, zznr.MESSAGE, 3) { // from class: com.google.android.gms.internal.drive.zzno
        };
        zzxd = zznmVar10;
        zznm zznmVar11 = new zznm("MESSAGE", 10, zznr.MESSAGE, 2) { // from class: com.google.android.gms.internal.drive.zznp
        };
        zzxe = zznmVar11;
        zznm zznmVar12 = new zznm("BYTES", 11, zznr.BYTE_STRING, 2) { // from class: com.google.android.gms.internal.drive.zznq
        };
        zzxf = zznmVar12;
        zznm zznmVar13 = new zznm("UINT32", 12, zznr.INT, 0);
        zzxg = zznmVar13;
        zznm zznmVar14 = new zznm("ENUM", 13, zznr.ENUM, 0);
        zzxh = zznmVar14;
        zznm zznmVar15 = new zznm("SFIXED32", 14, zznr.INT, 5);
        zzxi = zznmVar15;
        zznm zznmVar16 = new zznm("SFIXED64", 15, zznr.LONG, 1);
        zzxj = zznmVar16;
        zznm zznmVar17 = new zznm("SINT32", 16, zznr.INT, 0);
        zzxk = zznmVar17;
        zznm zznmVar18 = new zznm("SINT64", 17, zznr.LONG, 0);
        zzxl = zznmVar18;
        zzxo = new zznm[]{zznmVar, zznmVar2, zznmVar3, zznmVar4, zznmVar5, zznmVar6, zznmVar7, zznmVar8, zznmVar9, zznmVar10, zznmVar11, zznmVar12, zznmVar13, zznmVar14, zznmVar15, zznmVar16, zznmVar17, zznmVar18};
    }
}
