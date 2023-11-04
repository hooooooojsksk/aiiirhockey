package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzasl {
    protected static final String zza = "zzasl";
    private final zzaqx zzb;
    private final String zzc;
    private final String zzd;
    private final Class[] zzf;
    private volatile Method zze = null;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzasl(zzaqx zzaqxVar, String str, String str2, Class... clsArr) {
        this.zzb = zzaqxVar;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzaqxVar.zzk().submit(new zzask(this));
    }

    public static /* bridge */ /* synthetic */ void zzb(zzasl zzaslVar) {
        CountDownLatch countDownLatch;
        Class loadClass;
        try {
            zzaqx zzaqxVar = zzaslVar.zzb;
            loadClass = zzaqxVar.zzi().loadClass(zzaslVar.zzc(zzaqxVar.zzu(), zzaslVar.zzc));
        } catch (zzaqb | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
        } catch (NullPointerException unused2) {
            countDownLatch = zzaslVar.zzg;
        } catch (Throwable th) {
            zzaslVar.zzg.countDown();
            throw th;
        }
        if (loadClass == null) {
            countDownLatch = zzaslVar.zzg;
        } else {
            zzaslVar.zze = loadClass.getMethod(zzaslVar.zzc(zzaslVar.zzb.zzu(), zzaslVar.zzd), zzaslVar.zzf);
            if (zzaslVar.zze == null) {
                countDownLatch = zzaslVar.zzg;
            }
            countDownLatch = zzaslVar.zzg;
        }
        countDownLatch.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzaqb, UnsupportedEncodingException {
        return new String(this.zzb.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (this.zzg.await(2L, TimeUnit.SECONDS)) {
                return this.zze;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
