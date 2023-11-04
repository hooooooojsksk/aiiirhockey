package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.games.GamesStatusCodes;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzabj implements zzzu {
    private static final int[] zzc;
    private static final int zzf;
    private final byte[] zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private zzzx zzp;
    private zzabb zzq;
    private zzaax zzr;
    private boolean zzs;
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzabi
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzabj.zza;
            return new zzzu[]{new zzabj(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private static final int[] zzb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final byte[] zzd = zzew.zzab("#!AMR\n");
    private static final byte[] zze = zzew.zzab("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        zzc = iArr;
        zzf = iArr[8];
    }

    public zzabj() {
        this(0);
    }

    public zzabj(int i) {
        this.zzg = new byte[1];
        this.zzm = -1;
    }

    private static boolean zzf(zzzv zzzvVar, byte[] bArr) throws IOException {
        zzzvVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zzzk) zzzvVar).zzm(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzg(zzzv zzzvVar) throws IOException {
        byte[] bArr = zzd;
        if (zzf(zzzvVar, bArr)) {
            this.zzh = false;
            ((zzzk) zzzvVar).zzo(bArr.length, false);
            return true;
        }
        byte[] bArr2 = zze;
        if (zzf(zzzvVar, bArr2)) {
            this.zzh = true;
            ((zzzk) zzzvVar).zzo(bArr2.length, false);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final int zza(zzzv zzzvVar, zzaau zzaauVar) throws IOException {
        zzdl.zzb(this.zzq);
        int i = zzew.zza;
        if (zzzvVar.zzf() != 0 || zzg(zzzvVar)) {
            if (!this.zzs) {
                this.zzs = true;
                boolean z = this.zzh;
                String str = true != z ? "audio/3gpp" : "audio/amr-wb";
                int i2 = true != z ? GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY : 16000;
                zzabb zzabbVar = this.zzq;
                zzad zzadVar = new zzad();
                zzadVar.zzS(str);
                zzadVar.zzL(zzf);
                zzadVar.zzw(1);
                zzadVar.zzT(i2);
                zzabbVar.zzk(zzadVar.zzY());
            }
            int zze2 = zze(zzzvVar);
            if (this.zzl) {
                return zze2;
            }
            zzaaw zzaawVar = new zzaaw(-9223372036854775807L, 0L);
            this.zzr = zzaawVar;
            this.zzp.zzN(zzaawVar);
            this.zzl = true;
            return zze2;
        }
        throw zzbu.zza("Could not find AMR header.", null);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzp = zzzxVar;
        this.zzq = zzzxVar.zzv(0, 1);
        zzzxVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        this.zzi = 0L;
        this.zzj = 0;
        this.zzk = 0;
        this.zzo = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        return zzg(zzzvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x003a A[Catch: EOFException -> 0x00b5, TryCatch #0 {EOFException -> 0x00b5, blocks: (B:51:0x0008, B:53:0x001c, B:67:0x003a, B:69:0x0043, B:68:0x003f, B:86:0x0081, B:87:0x009e, B:88:0x009f, B:89:0x00b4), top: B:91:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x003f A[Catch: EOFException -> 0x00b5, TryCatch #0 {EOFException -> 0x00b5, blocks: (B:51:0x0008, B:53:0x001c, B:67:0x003a, B:69:0x0043, B:68:0x003f, B:86:0x0081, B:87:0x009e, B:88:0x009f, B:89:0x00b4), top: B:91:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0050  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zze(com.google.android.gms.internal.ads.zzzv r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.zzk
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L8
            goto L55
        L8:
            r12.zzj()     // Catch: java.io.EOFException -> Lb5
            byte[] r0 = r11.zzg     // Catch: java.io.EOFException -> Lb5
            r4 = r12
            com.google.android.gms.internal.ads.zzzk r4 = (com.google.android.gms.internal.ads.zzzk) r4     // Catch: java.io.EOFException -> Lb5
            r4.zzm(r0, r3, r2, r3)     // Catch: java.io.EOFException -> Lb5
            byte[] r0 = r11.zzg     // Catch: java.io.EOFException -> Lb5
            r0 = r0[r3]     // Catch: java.io.EOFException -> Lb5
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L9f
            int r0 = r0 >> 3
            boolean r4 = r11.zzh     // Catch: java.io.EOFException -> Lb5
            r0 = r0 & 15
            if (r4 == 0) goto L2d
            r6 = 10
            if (r0 < r6) goto L38
            r6 = 13
            if (r0 <= r6) goto L2d
            goto L38
        L2d:
            if (r4 != 0) goto L7a
            r6 = 12
            if (r0 < r6) goto L38
            r6 = 14
            if (r0 > r6) goto L38
            goto L7a
        L38:
            if (r4 == 0) goto L3f
            int[] r4 = com.google.android.gms.internal.ads.zzabj.zzc     // Catch: java.io.EOFException -> Lb5
            r0 = r4[r0]     // Catch: java.io.EOFException -> Lb5
            goto L43
        L3f:
            int[] r4 = com.google.android.gms.internal.ads.zzabj.zzb     // Catch: java.io.EOFException -> Lb5
            r0 = r4[r0]     // Catch: java.io.EOFException -> Lb5
        L43:
            r11.zzj = r0     // Catch: java.io.EOFException -> Lb5
            r11.zzk = r0
            int r4 = r11.zzm
            if (r4 != r1) goto L4e
            r11.zzm = r0
            r4 = r0
        L4e:
            if (r4 != r0) goto L55
            int r4 = r11.zzn
            int r4 = r4 + r2
            r11.zzn = r4
        L55:
            com.google.android.gms.internal.ads.zzabb r4 = r11.zzq
            int r12 = com.google.android.gms.internal.ads.zzaaz.zza(r4, r12, r0, r2)
            if (r12 != r1) goto L5e
            return r1
        L5e:
            int r0 = r11.zzk
            int r0 = r0 - r12
            r11.zzk = r0
            if (r0 <= 0) goto L66
            return r3
        L66:
            com.google.android.gms.internal.ads.zzabb r4 = r11.zzq
            long r5 = r11.zzi
            r7 = 1
            int r8 = r11.zzj
            r9 = 0
            r10 = 0
            r4.zzs(r5, r7, r8, r9, r10)
            long r0 = r11.zzi
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.zzi = r0
            return r3
        L7a:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L81
            r12 = r3
        L81:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lb5
            r2.<init>()     // Catch: java.io.EOFException -> Lb5
            java.lang.String r3 = "Illegal AMR "
            r2.append(r3)     // Catch: java.io.EOFException -> Lb5
            r2.append(r12)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r12 = " frame type "
            r2.append(r12)     // Catch: java.io.EOFException -> Lb5
            r2.append(r0)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r12 = r2.toString()     // Catch: java.io.EOFException -> Lb5
            com.google.android.gms.internal.ads.zzbu r12 = com.google.android.gms.internal.ads.zzbu.zza(r12, r5)     // Catch: java.io.EOFException -> Lb5
            throw r12     // Catch: java.io.EOFException -> Lb5
        L9f:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lb5
            r12.<init>()     // Catch: java.io.EOFException -> Lb5
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch: java.io.EOFException -> Lb5
            r12.append(r0)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r12 = r12.toString()     // Catch: java.io.EOFException -> Lb5
            com.google.android.gms.internal.ads.zzbu r12 = com.google.android.gms.internal.ads.zzbu.zza(r12, r5)     // Catch: java.io.EOFException -> Lb5
            throw r12     // Catch: java.io.EOFException -> Lb5
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabj.zze(com.google.android.gms.internal.ads.zzzv):int");
    }
}
