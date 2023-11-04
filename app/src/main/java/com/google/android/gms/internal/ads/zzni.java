package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import kotlin.jvm.internal.LongCompanionObject;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzni implements zznm {
    public static final zzfok zza = new zzfok() { // from class: com.google.android.gms.internal.ads.zzng
        @Override // com.google.android.gms.internal.ads.zzfok
        public final Object zza() {
            String zzl;
            zzl = zzni.zzl();
            return zzl;
        }
    };
    private static final Random zzb = new Random();
    private final zzcm zzc;
    private final zzck zzd;
    private final HashMap zze;
    private final zzfok zzf;
    private zznl zzg;
    private zzcn zzh;
    private String zzi;

    public zzni() {
        throw null;
    }

    private final zznh zzk(int i, zzss zzssVar) {
        long j;
        zzss zzssVar2;
        zzss zzssVar3;
        long j2 = LongCompanionObject.MAX_VALUE;
        zznh zznhVar = null;
        for (zznh zznhVar2 : this.zze.values()) {
            zznhVar2.zzg(i, zzssVar);
            if (zznhVar2.zzj(i, zzssVar)) {
                j = zznhVar2.zzd;
                if (j == -1 || j < j2) {
                    zznhVar = zznhVar2;
                    j2 = j;
                } else if (j == j2) {
                    int i2 = zzew.zza;
                    zzssVar2 = zznhVar.zze;
                    if (zzssVar2 != null) {
                        zzssVar3 = zznhVar2.zze;
                        if (zzssVar3 != null) {
                            zznhVar = zznhVar2;
                        }
                    }
                }
            }
        }
        if (zznhVar == null) {
            String zzl = zzl();
            zznh zznhVar3 = new zznh(this, zzl, i, zzssVar);
            this.zze.put(zzl, zznhVar3);
            return zznhVar3;
        }
        return zznhVar;
    }

    public static String zzl() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzm(zzlc zzlcVar) {
        String str;
        long j;
        zzss zzssVar;
        zzss zzssVar2;
        zzss zzssVar3;
        String unused;
        String unused2;
        if (zzlcVar.zzb.zzo()) {
            this.zzi = null;
            return;
        }
        zznh zznhVar = (zznh) this.zze.get(this.zzi);
        zznh zzk = zzk(zzlcVar.zzc, zzlcVar.zzd);
        str = zzk.zzb;
        this.zzi = str;
        zzh(zzlcVar);
        zzss zzssVar4 = zzlcVar.zzd;
        if (zzssVar4 == null || !zzssVar4.zzb()) {
            return;
        }
        if (zznhVar != null) {
            j = zznhVar.zzd;
            if (j == zzlcVar.zzd.zzd) {
                zzssVar = zznhVar.zze;
                if (zzssVar != null) {
                    zzssVar2 = zznhVar.zze;
                    if (zzssVar2.zzb == zzlcVar.zzd.zzb) {
                        zzssVar3 = zznhVar.zze;
                        if (zzssVar3.zzc == zzlcVar.zzd.zzc) {
                            return;
                        }
                    }
                }
            }
        }
        zzss zzssVar5 = zzlcVar.zzd;
        unused = zzk(zzlcVar.zzc, new zzss(zzssVar5.zza, zzssVar5.zzd)).zzb;
        unused2 = zzk.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final synchronized String zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final synchronized String zze(zzcn zzcnVar, zzss zzssVar) {
        String str;
        str = zzk(zzcnVar.zzn(zzssVar.zza, this.zzd).zzd, zzssVar).zzb;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final synchronized void zzf(zzlc zzlcVar) {
        boolean z;
        zznl zznlVar;
        String str;
        this.zzi = null;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zznh zznhVar = (zznh) it.next();
            it.remove();
            z = zznhVar.zzf;
            if (z && (zznlVar = this.zzg) != null) {
                str = zznhVar.zzb;
                zznlVar.zzd(zzlcVar, str, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzg(zznl zznlVar) {
        this.zzg = zznlVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x003d, code lost:
        if (r1 < r3) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zznm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzh(com.google.android.gms.internal.ads.zzlc r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zznl r0 = r9.zzg     // Catch: java.lang.Throwable -> Lcb
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzcn r0 = r10.zzb     // Catch: java.lang.Throwable -> Lcb
            boolean r0 = r0.zzo()     // Catch: java.lang.Throwable -> Lcb
            if (r0 == 0) goto L10
            monitor-exit(r9)
            return
        L10:
            java.util.HashMap r0 = r9.zze     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r9.zzi     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zznh r0 = (com.google.android.gms.internal.ads.zznh) r0     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzss r1 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto L41
            if (r0 == 0) goto L41
            long r1 = com.google.android.gms.internal.ads.zznh.zzb(r0)     // Catch: java.lang.Throwable -> Lcb
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L33
            int r0 = com.google.android.gms.internal.ads.zznh.zza(r0)     // Catch: java.lang.Throwable -> Lcb
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lcb
            if (r0 != r1) goto L3f
            goto L41
        L33:
            com.google.android.gms.internal.ads.zzss r1 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            long r1 = r1.zzd     // Catch: java.lang.Throwable -> Lcb
            long r3 = com.google.android.gms.internal.ads.zznh.zzb(r0)     // Catch: java.lang.Throwable -> Lcb
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L41
        L3f:
            monitor-exit(r9)
            return
        L41:
            int r0 = r10.zzc     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzss r1 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zznh r0 = r9.zzk(r0, r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r9.zzi     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto L53
            java.lang.String r1 = com.google.android.gms.internal.ads.zznh.zzd(r0)     // Catch: java.lang.Throwable -> Lcb
            r9.zzi = r1     // Catch: java.lang.Throwable -> Lcb
        L53:
            com.google.android.gms.internal.ads.zzss r1 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            r2 = 1
            if (r1 == 0) goto L9d
            boolean r3 = r1.zzb()     // Catch: java.lang.Throwable -> Lcb
            if (r3 == 0) goto L9d
            com.google.android.gms.internal.ads.zzss r3 = new com.google.android.gms.internal.ads.zzss     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r4 = r1.zza     // Catch: java.lang.Throwable -> Lcb
            long r5 = r1.zzd     // Catch: java.lang.Throwable -> Lcb
            int r1 = r1.zzb     // Catch: java.lang.Throwable -> Lcb
            r3.<init>(r4, r5, r1)     // Catch: java.lang.Throwable -> Lcb
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zznh r1 = r9.zzk(r1, r3)     // Catch: java.lang.Throwable -> Lcb
            boolean r3 = com.google.android.gms.internal.ads.zznh.zzi(r1)     // Catch: java.lang.Throwable -> Lcb
            if (r3 != 0) goto L9d
            com.google.android.gms.internal.ads.zznh.zzf(r1, r2)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzcn r3 = r10.zzb     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzss r4 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r4 = r4.zza     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzck r5 = r9.zzd     // Catch: java.lang.Throwable -> Lcb
            r3.zzn(r4, r5)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzck r3 = r9.zzd     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzss r4 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            int r4 = r4.zzb     // Catch: java.lang.Throwable -> Lcb
            r3.zzh(r4)     // Catch: java.lang.Throwable -> Lcb
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.zzew.zzz(r3)     // Catch: java.lang.Throwable -> Lcb
            long r7 = com.google.android.gms.internal.ads.zzew.zzz(r3)     // Catch: java.lang.Throwable -> Lcb
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zznh.zzd(r1)     // Catch: java.lang.Throwable -> Lcb
        L9d:
            boolean r1 = com.google.android.gms.internal.ads.zznh.zzi(r0)     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto La9
            com.google.android.gms.internal.ads.zznh.zzf(r0, r2)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zznh.zzd(r0)     // Catch: java.lang.Throwable -> Lcb
        La9:
            java.lang.String r1 = com.google.android.gms.internal.ads.zznh.zzd(r0)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r3 = r9.zzi     // Catch: java.lang.Throwable -> Lcb
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto Lc9
            boolean r1 = com.google.android.gms.internal.ads.zznh.zzh(r0)     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto Lc9
            com.google.android.gms.internal.ads.zznh.zze(r0, r2)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zznl r1 = r9.zzg     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r0 = com.google.android.gms.internal.ads.zznh.zzd(r0)     // Catch: java.lang.Throwable -> Lcb
            r1.zzc(r10, r0)     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r9)
            return
        Lc9:
            monitor-exit(r9)
            return
        Lcb:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzni.zzh(com.google.android.gms.internal.ads.zzlc):void");
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final synchronized void zzi(zzlc zzlcVar, int i) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        Objects.requireNonNull(this.zzg);
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zznh zznhVar = (zznh) it.next();
            if (zznhVar.zzk(zzlcVar)) {
                it.remove();
                z = zznhVar.zzf;
                if (z) {
                    str = zznhVar.zzb;
                    boolean equals = str.equals(this.zzi);
                    boolean z3 = false;
                    if (i == 0 && equals) {
                        z2 = zznhVar.zzg;
                        if (z2) {
                            z3 = true;
                        }
                    }
                    if (equals) {
                        this.zzi = null;
                    }
                    zznl zznlVar = this.zzg;
                    str2 = zznhVar.zzb;
                    zznlVar.zzd(zzlcVar, str2, z3);
                }
            }
        }
        zzm(zzlcVar);
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final synchronized void zzj(zzlc zzlcVar) {
        boolean z;
        String str;
        String str2;
        Objects.requireNonNull(this.zzg);
        zzcn zzcnVar = this.zzh;
        this.zzh = zzlcVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zznh zznhVar = (zznh) it.next();
            if (!zznhVar.zzl(zzcnVar, this.zzh) || zznhVar.zzk(zzlcVar)) {
                it.remove();
                z = zznhVar.zzf;
                if (z) {
                    str = zznhVar.zzb;
                    if (str.equals(this.zzi)) {
                        this.zzi = null;
                    }
                    zznl zznlVar = this.zzg;
                    str2 = zznhVar.zzb;
                    zznlVar.zzd(zzlcVar, str2, false);
                }
            }
        }
        zzm(zzlcVar);
    }

    public zzni(zzfok zzfokVar) {
        this.zzf = zzfokVar;
        this.zzc = new zzcm();
        this.zzd = new zzck();
        this.zze = new HashMap();
        this.zzh = zzcn.zza;
    }
}
