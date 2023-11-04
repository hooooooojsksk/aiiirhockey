package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcdd extends zzccu implements zzcaz {
    public static final /* synthetic */ int zzd = 0;
    private zzcba zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzccm zzi;
    private long zzj;
    private long zzk;

    public zzcdd(zzcbj zzcbjVar, zzcbi zzcbiVar) {
        super(zzcbjVar);
        zzcdv zzcdvVar = new zzcdv(zzcbjVar.getContext(), zzcbiVar, (zzcbj) this.zzc.get());
        zzbza.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcdvVar;
        zzcdvVar.zzK(this);
    }

    protected static final String zzc(String str) {
        return "cache:".concat(String.valueOf(zzbyt.zze(str)));
    }

    private static String zzd(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + "/" + canonicalName + ":" + message;
    }

    private final void zzx(long j) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdc
            @Override // java.lang.Runnable
            public final void run() {
                zzcdd.this.zzb();
            }
        }, j);
    }

    @Override // com.google.android.gms.internal.ads.zzccu, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcba zzcbaVar = this.zze;
        if (zzcbaVar != null) {
            zzcbaVar.zzK(null);
            this.zze.zzG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzC(int i, int i2) {
    }

    public final zzcba zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzK(null);
        zzcba zzcbaVar = this.zze;
        this.zze = null;
        return zzcbaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.google.android.gms.internal.ads.zzccu, com.google.android.gms.internal.ads.zzcdd] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.zzcdd] */
    /* JADX WARN: Type inference failed for: r2v31 */
    public final /* synthetic */ void zzb() {
        String str;
        zzcdd zzcddVar;
        zzcdd zzcddVar2;
        zzbap zzc;
        long longValue;
        long intValue;
        zzcdd zzcddVar3;
        long j;
        long j2;
        String str2;
        long j3;
        String zzc2 = zzc(this.zzf);
        String str3 = "error";
        try {
            zzbaj zzbajVar = zzbar.zzv;
            zzc = com.google.android.gms.ads.internal.client.zzba.zzc();
            longValue = ((Long) zzc.zzb(zzbajVar)).longValue() * 1000;
            intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzu)).intValue();
            zzcddVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbG)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            str = zzc2;
            zzcddVar = this;
        }
        synchronized (this) {
            try {
                int i = ((com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zzj) > longValue ? 1 : ((com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zzj) == longValue ? 0 : -1));
                if (i <= 0) {
                    try {
                        if (!this.zzg) {
                            if (!this.zzh) {
                                if (!this.zze.zzT()) {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                                long zzz = this.zze.zzz();
                                if (zzz > 0) {
                                    long zzv = this.zze.zzv();
                                    if (zzv != this.zzk) {
                                        try {
                                            j2 = intValue;
                                            str2 = zzc2;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            zzcddVar = this;
                                            str = zzc2;
                                        }
                                        try {
                                            zzo(this.zzf, zzc2, zzv, zzz, zzv > 0, zzcddVar != 0 ? this.zze.zzA() : -1L, zzcddVar != 0 ? this.zze.zzx() : -1L, zzcddVar != 0 ? this.zze.zzB() : -1L, zzcba.zzs(), zzcba.zzu());
                                            zzcddVar = this;
                                            j = zzv;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            zzcddVar = this;
                                            str = str2;
                                            throw th;
                                        }
                                        try {
                                            zzcddVar.zzk = j;
                                            j3 = zzz;
                                            zzcddVar = zzcddVar;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            str = str2;
                                            throw th;
                                        }
                                    } else {
                                        j = zzv;
                                        j2 = intValue;
                                        str2 = zzc2;
                                        zzcddVar = this;
                                        j3 = zzz;
                                    }
                                    if (j >= j3) {
                                        zzcddVar.zzj(zzcddVar.zzf, str2, j3);
                                        zzcddVar2 = zzcddVar;
                                    } else {
                                        int i2 = (zzcddVar.zze.zzw() > j2 ? 1 : (zzcddVar.zze.zzw() == j2 ? 0 : -1));
                                        zzcddVar3 = zzcddVar;
                                        if (i2 >= 0) {
                                            zzcddVar3 = zzcddVar;
                                            if (j > 0) {
                                                zzcddVar2 = zzcddVar;
                                            }
                                        }
                                    }
                                } else {
                                    zzcddVar3 = this;
                                }
                                zzcddVar3.zzx(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzw)).longValue());
                                return;
                            }
                            zzcddVar2 = this;
                            com.google.android.gms.ads.internal.zzt.zzy().zzc(zzcddVar2.zzi);
                        }
                        throw new IOException("Abort requested before buffering finished. ");
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = zzc;
                        str = i;
                    }
                } else {
                    str = zzc2;
                    zzcddVar = this;
                    try {
                        throw new IOException("Timeout reached. Limit: " + longValue + " ms");
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = "downloadTimeout";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str = zzc2;
                zzcddVar = this;
            }
            try {
                throw th;
            } catch (Exception e2) {
                e = e2;
                String str4 = str3;
                zzbza.zzj("Failed to preload url " + zzcddVar.zzf + " Exception: " + e.getMessage());
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoStreamExoPlayerCache.preload");
                release();
                zzcddVar.zzg(zzcddVar.zzf, str, str4, zzd(str4, e));
                zzcddVar2 = zzcddVar;
                com.google.android.gms.ads.internal.zzt.zzy().zzc(zzcddVar2.zzi);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzi(final boolean z, final long j) {
        final zzcbj zzcbjVar = (zzcbj) this.zzc.get();
        if (zzcbjVar != null) {
            zzbzn.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdb
                @Override // java.lang.Runnable
                public final void run() {
                    zzcbj zzcbjVar2 = zzcbj.this;
                    boolean z2 = z;
                    long j2 = j;
                    int i = zzcdd.zzd;
                    zzcbjVar2.zzv(z2, j2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzk(String str, Exception exc) {
        zzbza.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzl(String str, Exception exc) {
        zzbza.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzm(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final void zzp(int i) {
        this.zze.zzI(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final void zzq(int i) {
        this.zze.zzJ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final void zzr(int i) {
        this.zze.zzL(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final void zzs(int i) {
        this.zze.zzM(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzccu] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r6v19 */
    @Override // com.google.android.gms.internal.ads.zzccu
    public final boolean zzu(String str, String[] strArr) {
        String str2;
        String str3;
        zzcdd zzcddVar;
        long j;
        long j2;
        long j3;
        ?? r1;
        long j4;
        String str4;
        long j5;
        long j6;
        zzcdd zzcddVar2 = this;
        String str5 = str;
        zzcddVar2.zzf = str5;
        String str6 = "error";
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            zzcddVar2.zze.zzE(uriArr, zzcddVar2.zzb);
            zzcbj zzcbjVar = (zzcbj) zzcddVar2.zzc.get();
            if (zzcbjVar != null) {
                zzcbjVar.zzt(zzc, zzcddVar2);
            }
            Clock zzB = com.google.android.gms.ads.internal.zzt.zzB();
            long currentTimeMillis = zzB.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzw)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzv)).longValue() * 1000;
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzu)).intValue();
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbG)).booleanValue();
            long j7 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzB.currentTimeMillis() - currentTimeMillis > longValue2) {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        } else if (!zzcddVar2.zzg) {
                            if (zzcddVar2.zzh) {
                                break;
                            } else if (zzcddVar2.zze.zzT()) {
                                long zzz = zzcddVar2.zze.zzz();
                                if (zzz > 0) {
                                    long zzv = zzcddVar2.zze.zzv();
                                    if (zzv != j7) {
                                        try {
                                            j = intValue;
                                            long j8 = zzz;
                                            j2 = longValue2;
                                            j4 = longValue;
                                            str4 = zzc;
                                            try {
                                                zzo(str, zzc, zzv, j8, zzv > 0, booleanValue ? zzcddVar2.zze.zzA() : -1L, booleanValue ? zzcddVar2.zze.zzx() : -1L, booleanValue ? zzcddVar2.zze.zzB() : -1L, zzcba.zzs(), zzcba.zzu());
                                                j6 = zzv;
                                                j5 = zzz;
                                                str2 = j8;
                                            } catch (Throwable th) {
                                                th = th;
                                                zzcddVar = this;
                                                str2 = str;
                                                str3 = str4;
                                                try {
                                                    throw th;
                                                } catch (Exception e) {
                                                    e = e;
                                                    String str7 = str6;
                                                    zzbza.zzj("Failed to preload url " + str2 + " Exception: " + e.getMessage());
                                                    com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoStreamExoPlayerCache.preload");
                                                    release();
                                                    zzcddVar.zzg(str2, str3, str7, zzd(str7, e));
                                                    return false;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            zzcddVar = this;
                                            str2 = str;
                                            str3 = zzc;
                                        }
                                    } else {
                                        j = intValue;
                                        j2 = longValue2;
                                        j4 = longValue;
                                        str4 = zzc;
                                        j5 = zzz;
                                        j6 = j7;
                                        str2 = intValue;
                                    }
                                    zzcddVar = (zzv > j5 ? 1 : (zzv == j5 ? 0 : -1));
                                    if (zzcddVar < 0) {
                                        try {
                                            zzcdd zzcddVar3 = this;
                                            str2 = str;
                                            str3 = str4;
                                            if (zzcddVar3.zze.zzw() < j || zzv <= 0) {
                                                j3 = j4;
                                                r1 = j6;
                                                zzcddVar = zzcddVar3;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            throw th;
                                        }
                                    } else {
                                        zzj(str, str4, j5);
                                    }
                                } else {
                                    j = intValue;
                                    j2 = longValue2;
                                    str2 = str5;
                                    str3 = zzc;
                                    zzcddVar = zzcddVar2;
                                    j3 = longValue;
                                    r1 = j7;
                                }
                                try {
                                    try {
                                        zzcddVar.wait(j3);
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str6 = r1;
                                        throw th;
                                    }
                                } catch (InterruptedException unused) {
                                    throw new IOException("Wait interrupted.");
                                }
                            } else {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                        } else {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        str2 = str5;
                        str3 = zzc;
                        zzcddVar = zzcddVar2;
                    }
                }
                longValue = j3;
                zzcddVar2 = zzcddVar;
                str5 = str2;
                zzc = str3;
                intValue = j;
                longValue2 = j2;
                j7 = r1;
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            str2 = str5;
            str3 = zzc;
            zzcddVar = zzcddVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzv() {
        zzbza.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final boolean zzw(String str, String[] strArr, zzccm zzccmVar) {
        this.zzf = str;
        this.zzi = zzccmVar;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzE(uriArr, this.zzb);
            zzcbj zzcbjVar = (zzcbj) this.zzc.get();
            if (zzcbjVar != null) {
                zzcbjVar.zzt(zzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            zzbza.zzj("Failed to preload url " + str + " Exception: " + message);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, zzc, "error", zzd("error", e));
            return false;
        }
    }
}
