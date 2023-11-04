package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzyd {
    private final zzxn zza = new zzxn();
    private final zzxz zzb;
    private final zzyc zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzyd(Context context) {
        zzxz zzxzVar;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i = zzew.zza;
            zzxzVar = zzyb.zzc(applicationContext);
            if (zzxzVar == null) {
                zzxzVar = zzya.zzc(applicationContext);
            }
        } else {
            zzxzVar = null;
        }
        this.zzb = zzxzVar;
        this.zzc = zzxzVar != null ? zzyc.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* synthetic */ void zzb(zzyd zzydVar, Display display) {
        if (display != null) {
            double refreshRate = display.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            zzydVar.zzk = j;
            zzydVar.zzl = (j * 80) / 100;
            return;
        }
        zzee.zze("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        zzydVar.zzk = -9223372036854775807L;
        zzydVar.zzl = -9223372036854775807L;
    }

    private final void zzk() {
        Surface surface;
        if (zzew.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzxy.zza(surface, 0.0f);
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0055, code lost:
        if (java.lang.Math.abs(r0 - r9.zzg) >= r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0062, code lost:
        if (r9.zza.zzb() >= 30) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0065, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0066, code lost:
        if (r3 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0069, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzm() {
        /*
            r9 = this;
            int r0 = com.google.android.gms.internal.ads.zzew.zza
            r1 = 30
            if (r0 < r1) goto L6f
            android.view.Surface r0 = r9.zze
            if (r0 != 0) goto Lb
            goto L6f
        Lb:
            com.google.android.gms.internal.ads.zzxn r0 = r9.zza
            boolean r0 = r0.zzg()
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzxn r0 = r9.zza
            float r0 = r0.zza()
            goto L1c
        L1a:
            float r0 = r9.zzf
        L1c:
            float r2 = r9.zzg
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L23
            return
        L23:
            r3 = 1
            r4 = 0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 == 0) goto L58
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L58
            com.google.android.gms.internal.ads.zzxn r1 = r9.zza
            boolean r1 = r1.zzg()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzxn r1 = r9.zza
            long r5 = r1.zzd()
            r7 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L4b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L4b:
            float r1 = r9.zzg
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L65
            goto L66
        L58:
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L6a
            com.google.android.gms.internal.ads.zzxn r2 = r9.zza
            int r2 = r2.zzb()
            if (r2 < r1) goto L65
            goto L66
        L65:
            r3 = 0
        L66:
            if (r3 == 0) goto L69
            goto L6a
        L69:
            return
        L6a:
            r9.zzg = r0
            r9.zzn(r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyd.zzm():void");
    }

    private final void zzn(boolean z) {
        Surface surface;
        if (zzew.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.zzd) {
            float f2 = this.zzg;
            if (f2 != -1.0f) {
                f = this.zzi * f2;
            }
        }
        if (z || this.zzh != f) {
            this.zzh = f;
            zzxy.zza(surface, f);
        }
    }

    public final long zza(long j) {
        long j2;
        if (this.zzp != -1 && this.zza.zzg()) {
            long zzc = this.zza.zzc();
            long j3 = this.zzq + (((float) (zzc * (this.zzm - this.zzp))) / this.zzi);
            if (Math.abs(j - j3) > 20000000) {
                zzl();
            } else {
                j = j3;
            }
        }
        this.zzn = this.zzm;
        this.zzo = j;
        zzyc zzycVar = this.zzc;
        if (zzycVar == null || this.zzk == -9223372036854775807L) {
            return j;
        }
        long j4 = zzycVar.zza;
        if (j4 == -9223372036854775807L) {
            return j;
        }
        long j5 = this.zzk;
        long j6 = j4 + (((j - j4) / j5) * j5);
        if (j <= j6) {
            j2 = j6 - j5;
        } else {
            j6 = j5 + j6;
            j2 = j6;
        }
        long j7 = this.zzl;
        if (j6 - j >= j - j2) {
            j6 = j2;
        }
        return j6 - j7;
    }

    public final void zzc(float f) {
        this.zzf = f;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzp = j2;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j * 1000);
        zzm();
    }

    public final void zze(float f) {
        this.zzi = f;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            zzyc zzycVar = this.zzc;
            Objects.requireNonNull(zzycVar);
            zzycVar.zzb();
            this.zzb.zzb(new zzxx(this));
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzxz zzxzVar = this.zzb;
        if (zzxzVar != null) {
            zzxzVar.zza();
            zzyc zzycVar = this.zzc;
            Objects.requireNonNull(zzycVar);
            zzycVar.zzc();
        }
        zzk();
    }

    public final void zzi(Surface surface) {
        if (true == (surface instanceof zzxv)) {
            surface = null;
        }
        if (this.zze == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzn(true);
    }
}
