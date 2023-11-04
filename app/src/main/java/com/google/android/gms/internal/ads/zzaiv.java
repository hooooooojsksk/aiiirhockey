package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaiv implements zzzu {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzais
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzaiv.zza;
            return new zzzu[]{new zzaiv(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private final List zzb;
    private final zzen zzc;
    private final SparseIntArray zzd;
    private final zzaiy zze;
    private final SparseArray zzf;
    private final SparseBooleanArray zzg;
    private final SparseBooleanArray zzh;
    private final zzair zzi;
    private zzaiq zzj;
    private zzzx zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;

    public zzaiv() {
        this(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0194, code lost:
        if (r1 == false) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzzv r19, com.google.android.gms.internal.ads.zzaau r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiv.zza(com.google.android.gms.internal.ads.zzzv, com.google.android.gms.internal.ads.zzaau):int");
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzk = zzzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        zzaiq zzaiqVar;
        int size = this.zzb.size();
        for (int i = 0; i < size; i++) {
            zzeu zzeuVar = (zzeu) this.zzb.get(i);
            if (zzeuVar.zze() != -9223372036854775807L) {
                long zzc = zzeuVar.zzc();
                if (zzc != -9223372036854775807L) {
                    if (zzc != 0) {
                        if (zzc == j2) {
                        }
                    }
                }
            }
            zzeuVar.zzf(j2);
        }
        if (j2 != 0 && (zzaiqVar = this.zzj) != null) {
            zzaiqVar.zzd(j2);
        }
        this.zzc.zzC(0);
        this.zzd.clear();
        for (int i2 = 0; i2 < this.zzf.size(); i2++) {
            ((zzaja) this.zzf.valueAt(i2)).zzc();
        }
        this.zzp = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0020, code lost:
        r2 = r2 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzd(com.google.android.gms.internal.ads.zzzv r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzen r0 = r6.zzc
            byte[] r0 = r0.zzH()
            com.google.android.gms.internal.ads.zzzk r7 = (com.google.android.gms.internal.ads.zzzk) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.zzm(r0, r1, r2, r1)
            r2 = 0
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L2b
            r3 = 0
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r2 = r2 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.zzo(r2, r1)
            r7 = 1
            return r7
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiv.zzd(com.google.android.gms.internal.ads.zzzv):boolean");
    }

    public zzaiv(int i) {
        this(1, new zzeu(0L), new zzahk(0), 112800);
    }

    public zzaiv(int i, zzeu zzeuVar, zzaiy zzaiyVar, int i2) {
        this.zze = zzaiyVar;
        this.zzb = Collections.singletonList(zzeuVar);
        this.zzc = new zzen(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzg = sparseBooleanArray;
        this.zzh = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzf = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzi = new zzair(112800);
        this.zzk = zzzx.zza;
        this.zzq = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.zzf.put(sparseArray2.keyAt(i3), (zzaja) sparseArray2.valueAt(i3));
        }
        this.zzf.put(0, new zzain(new zzait(this)));
    }
}
