package com.google.android.gms.internal.ads;

import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
abstract class zzfsv extends zzftz implements Runnable {
    @CheckForNull
    zzfut zza;
    @CheckForNull
    Class zzb;
    @CheckForNull
    Object zzc;

    public zzfsv(zzfut zzfutVar, Class cls, Object obj) {
        Objects.requireNonNull(zzfutVar);
        this.zza = zzfutVar;
        this.zzb = cls;
        Objects.requireNonNull(obj);
        this.zzc = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0080  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.zzfut r0 = r9.zza
            java.lang.Class r1 = r9.zzb
            java.lang.Object r2 = r9.zzc
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Lc
            r5 = 1
            goto Ld
        Lc:
            r5 = 0
        Ld:
            if (r1 != 0) goto L11
            r6 = 1
            goto L12
        L11:
            r6 = 0
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            goto L17
        L16:
            r3 = 0
        L17:
            r3 = r3 | r5
            if (r3 != 0) goto La7
            boolean r3 = r9.isCancelled()
            if (r3 == 0) goto L22
            goto La7
        L22:
            r3 = 0
            r9.zza = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfvm     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3e
            if (r4 == 0) goto L31
            r4 = r0
            com.google.android.gms.internal.ads.zzfvm r4 = (com.google.android.gms.internal.ads.zzfvm) r4     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3e
            java.lang.Throwable r4 = r4.zzm()     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3e
            goto L32
        L31:
            r4 = r3
        L32:
            if (r4 != 0) goto L3c
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzfuj.zzo(r0)     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3e
            goto L7a
        L39:
            r4 = move-exception
            goto L3c
        L3b:
            r4 = move-exception
        L3c:
            r5 = r3
            goto L7a
        L3e:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L78
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Future type "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = " threw "
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = " without a cause"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r5.<init>(r4)
        L78:
            r4 = r5
            goto L3c
        L7a:
            if (r4 != 0) goto L80
            r9.zzd(r5)
            return
        L80:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto La4
            java.lang.Object r0 = r9.zzf(r2, r4)     // Catch: java.lang.Throwable -> L92
            r9.zzb = r3
            r9.zzc = r3
            r9.zzg(r0)
            return
        L92:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzfvb.zza(r0)     // Catch: java.lang.Throwable -> L9e
            r9.zze(r0)     // Catch: java.lang.Throwable -> L9e
            r9.zzb = r3
            r9.zzc = r3
            return
        L9e:
            r0 = move-exception
            r9.zzb = r3
            r9.zzc = r3
            throw r0
        La4:
            r9.zzt(r0)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsv.run():void");
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    @CheckForNull
    public final String zza() {
        String str;
        zzfut zzfutVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String zza = super.zza();
        if (zzfutVar != null) {
            str = "inputFuture=[" + zzfutVar.toString() + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (zza != null) {
                return str.concat(zza);
            }
            return null;
        }
        return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    protected final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    abstract Object zzf(Object obj, Throwable th) throws Exception;

    abstract void zzg(Object obj);
}
