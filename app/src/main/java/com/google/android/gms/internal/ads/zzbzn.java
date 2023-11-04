package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbzn {
    public static final zzfuu zza;
    public static final zzfuu zzb;
    public static final zzfuu zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzfuu zze;
    public static final zzfuu zzf;

    static {
        Executor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        ThreadPoolExecutor threadPoolExecutor3;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfkq.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzbzj("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbzj("Default"));
        }
        zza = new zzbzm(threadPoolExecutor, null);
        if (ClientLibraryUtils.isPackageSide()) {
            threadPoolExecutor2 = zzfkq.zza().zzc(5, new zzbzj("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzj("Loader"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            threadPoolExecutor2 = threadPoolExecutor4;
        }
        zzb = new zzbzm(threadPoolExecutor2, null);
        if (ClientLibraryUtils.isPackageSide()) {
            threadPoolExecutor3 = zzfkq.zza().zzb(new zzbzj("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor5 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzj("Activeview"));
            threadPoolExecutor5.allowCoreThreadTimeOut(true);
            threadPoolExecutor3 = threadPoolExecutor5;
        }
        zzc = new zzbzm(threadPoolExecutor3, null);
        zzd = new zzbzi(3, new zzbzj("Schedule"));
        zze = new zzbzm(new zzbzk(), null);
        zzf = new zzbzm(zzfva.zzb(), null);
    }
}
