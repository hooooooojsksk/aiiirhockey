package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaka extends Thread {
    private static final boolean zza = zzala.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzajy zzd;
    private volatile boolean zze = false;
    private final zzalb zzf;
    private final zzakf zzg;

    public zzaka(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzajy zzajyVar, zzakf zzakfVar, byte[] bArr) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzajyVar;
        this.zzg = zzakfVar;
        this.zzf = new zzalb(this, blockingQueue2, zzakfVar, null);
    }

    private void zzc() throws InterruptedException {
        zzako zzakoVar = (zzako) this.zzb.take();
        zzakoVar.zzm("cache-queue-take");
        zzakoVar.zzt(1);
        try {
            zzakoVar.zzw();
            zzajx zza2 = this.zzd.zza(zzakoVar.zzj());
            if (zza2 == null) {
                zzakoVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzakoVar)) {
                    this.zzc.put(zzakoVar);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (zza2.zza(currentTimeMillis)) {
                zzakoVar.zzm("cache-hit-expired");
                zzakoVar.zze(zza2);
                if (!this.zzf.zzc(zzakoVar)) {
                    this.zzc.put(zzakoVar);
                }
                return;
            }
            zzakoVar.zzm("cache-hit");
            zzaku zzh = zzakoVar.zzh(new zzakk(zza2.zza, zza2.zzg));
            zzakoVar.zzm("cache-hit-parsed");
            if (!zzh.zzc()) {
                zzakoVar.zzm("cache-parsing-failed");
                this.zzd.zzc(zzakoVar.zzj(), true);
                zzakoVar.zze(null);
                if (!this.zzf.zzc(zzakoVar)) {
                    this.zzc.put(zzakoVar);
                }
                return;
            }
            if (zza2.zzf < currentTimeMillis) {
                zzakoVar.zzm("cache-hit-refresh-needed");
                zzakoVar.zze(zza2);
                zzh.zzd = true;
                if (this.zzf.zzc(zzakoVar)) {
                    this.zzg.zzb(zzakoVar, zzh, null);
                } else {
                    this.zzg.zzb(zzakoVar, zzh, new zzajz(this, zzakoVar));
                }
            } else {
                this.zzg.zzb(zzakoVar, zzh, null);
            }
        } finally {
            zzakoVar.zzt(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzala.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (!this.zze) {
                    zzala.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
                } else {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
