package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeob implements zzepn {
    private final Context zza;
    private final zzfuu zzb;
    private final zzeyx zzc;

    public zzeob(Context context, zzfuu zzfuuVar, zzeyx zzeyxVar) {
        this.zza = context;
        this.zzb = zzfuuVar;
        this.zzc = zzeyxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeob.this.zzc();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0040, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbar.zzcy)).booleanValue() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0054, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbar.zzcA)).booleanValue() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0056, code lost:
        r1 = com.google.android.gms.internal.ads.zzfkv.zzj(r0).zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbar.zzcJ)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbar.zzcz)).booleanValue() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbar.zzcB)).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a2, code lost:
        r0 = com.google.android.gms.internal.ads.zzfkw.zzi(r0);
        r2 = r0.zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbar.zzcK)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP());
        r3 = r0.zzo();
        r6 = r0.zzp();
        r4 = r2;
        r5 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzeoc zzc() throws java.lang.Exception {
        /*
            r8 = this;
            android.content.Context r0 = r8.zza     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.zzeyx r1 = r8.zzc     // Catch: java.io.IOException -> Ldd
            boolean r7 = r1.zzb()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.zzfks r1 = new com.google.android.gms.internal.ads.zzfks     // Catch: java.io.IOException -> Ldd
            r1.<init>()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.zzfks r2 = new com.google.android.gms.internal.ads.zzfks     // Catch: java.io.IOException -> Ldd
            r2.<init>()     // Catch: java.io.IOException -> Ldd
            r3 = 1
            if (r7 == 0) goto L2e
            com.google.android.gms.internal.ads.zzbaj r4 = com.google.android.gms.internal.ads.zzbar.zzcC     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.zzbap r5 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r4 = r5.zzb(r4)     // Catch: java.io.IOException -> Ldd
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> Ldd
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> Ldd
            if (r4 != 0) goto L2e
            com.google.android.gms.internal.ads.zzeoc r0 = new com.google.android.gms.internal.ads.zzeoc     // Catch: java.io.IOException -> Ldd
            r0.<init>(r3)     // Catch: java.io.IOException -> Ldd
            goto Ldc
        L2e:
            if (r7 != 0) goto L42
            com.google.android.gms.internal.ads.zzbaj r4 = com.google.android.gms.internal.ads.zzbar.zzcy     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.zzbap r5 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r4 = r5.zzb(r4)     // Catch: java.io.IOException -> Ldd
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> Ldd
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> Ldd
            if (r4 != 0) goto L56
        L42:
            if (r7 == 0) goto L7a
            com.google.android.gms.internal.ads.zzbaj r4 = com.google.android.gms.internal.ads.zzbar.zzcA     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.zzbap r5 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r4 = r5.zzb(r4)     // Catch: java.io.IOException -> Ldd
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> Ldd
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> Ldd
            if (r4 == 0) goto L7a
        L56:
            com.google.android.gms.internal.ads.zzfkv r1 = com.google.android.gms.internal.ads.zzfkv.zzj(r0)     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.zzbaj r4 = com.google.android.gms.internal.ads.zzbar.zzcJ     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.zzbap r5 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r4 = r5.zzb(r4)     // Catch: java.io.IOException -> Ldd
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.io.IOException -> Ldd
            long r4 = r4.longValue()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.zzbyj r6 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.ads.internal.util.zzg r6 = r6.zzh()     // Catch: java.io.IOException -> Ldd
            boolean r6 = r6.zzP()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.zzfks r1 = r1.zzh(r4, r6)     // Catch: java.io.IOException -> Ldd
        L7a:
            if (r7 != 0) goto L8e
            com.google.android.gms.internal.ads.zzbaj r4 = com.google.android.gms.internal.ads.zzbar.zzcz     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.zzbap r5 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r4 = r5.zzb(r4)     // Catch: java.io.IOException -> Ldd
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> Ldd
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> Ldd
            if (r4 != 0) goto La2
        L8e:
            if (r7 == 0) goto Ld2
            com.google.android.gms.internal.ads.zzbaj r4 = com.google.android.gms.internal.ads.zzbar.zzcB     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.zzbap r5 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r4 = r5.zzb(r4)     // Catch: java.io.IOException -> Ldd
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> Ldd
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> Ldd
            if (r4 == 0) goto Ld2
        La2:
            com.google.android.gms.internal.ads.zzfkw r0 = com.google.android.gms.internal.ads.zzfkw.zzi(r0)     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.zzbaj r2 = com.google.android.gms.internal.ads.zzbar.zzcK     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.zzbap r3 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r2 = r3.zzb(r2)     // Catch: java.io.IOException -> Ldd
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.io.IOException -> Ldd
            long r2 = r2.longValue()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.zzbyj r4 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.ads.internal.util.zzg r4 = r4.zzh()     // Catch: java.io.IOException -> Ldd
            boolean r4 = r4.zzP()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.zzfks r2 = r0.zzh(r2, r4)     // Catch: java.io.IOException -> Ldd
            boolean r3 = r0.zzo()     // Catch: java.io.IOException -> Ldd
            boolean r0 = r0.zzp()     // Catch: java.io.IOException -> Ldd
            r6 = r0
            r4 = r2
            r5 = r3
            goto Ld5
        Ld2:
            r4 = r2
            r5 = 1
            r6 = 1
        Ld5:
            com.google.android.gms.internal.ads.zzeoc r0 = new com.google.android.gms.internal.ads.zzeoc     // Catch: java.io.IOException -> Ldd
            r2 = r0
            r3 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.io.IOException -> Ldd
        Ldc:
            return r0
        Ldd:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzbyj r1 = com.google.android.gms.ads.internal.zzt.zzo()
            java.lang.String r2 = "PerAppIdSignal"
            r1.zzu(r0, r2)
            com.google.android.gms.internal.ads.zzeoc r0 = new com.google.android.gms.internal.ads.zzeoc
            com.google.android.gms.internal.ads.zzeyx r1 = r8.zzc
            boolean r1 = r1.zzb()
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeob.zzc():com.google.android.gms.internal.ads.zzeoc");
    }
}
