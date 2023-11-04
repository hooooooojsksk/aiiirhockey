package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzxb extends Handler implements Runnable {
    final /* synthetic */ zzxg zza;
    private final zzxc zzb;
    private final long zzc;
    private zzwy zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzxb(zzxg zzxgVar, Looper looper, zzxc zzxcVar, zzwy zzwyVar, int i, long j) {
        super(looper);
        this.zza = zzxgVar;
        this.zzb = zzxcVar;
        this.zzd = zzwyVar;
        this.zzc = j;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        int i2;
        int i3;
        long j;
        if (this.zzi) {
            return;
        }
        if (message.what == 0) {
            zzd();
        } else if (message.what != 3) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.zzc;
            zzwy zzwyVar = this.zzd;
            Objects.requireNonNull(zzwyVar);
            if (this.zzh) {
                zzwyVar.zzI(this.zzb, elapsedRealtime, j2, false);
                return;
            }
            int i4 = message.what;
            if (i4 == 1) {
                try {
                    zzwyVar.zzJ(this.zzb, elapsedRealtime, j2);
                } catch (RuntimeException e) {
                    zzee.zzc("LoadTask", "Unexpected exception handling load completed", e);
                    this.zza.zzg = new zzxf(e);
                }
            } else if (i4 != 2) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.zze = iOException;
                int i5 = this.zzf + 1;
                this.zzf = i5;
                zzxa zzt = zzwyVar.zzt(this.zzb, elapsedRealtime, j2, iOException, i5);
                i = zzt.zza;
                if (i == 3) {
                    this.zza.zzg = this.zze;
                    return;
                }
                i2 = zzt.zza;
                if (i2 != 2) {
                    i3 = zzt.zza;
                    if (i3 == 1) {
                        this.zzf = 1;
                    }
                    j = zzt.zzb;
                    zzc(j != -9223372036854775807L ? zzt.zzb : Math.min((this.zzf - 1) * 1000, 5000));
                }
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z) {
                int i = zzew.zza;
                Trace.beginSection("load:" + this.zzb.getClass().getSimpleName());
                try {
                    this.zzb.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (Exception e2) {
            if (this.zzi) {
                return;
            }
            zzee.zzc("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(2, new zzxf(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.zzi) {
                return;
            }
            zzee.zzc("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(2, new zzxf(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.zzi) {
                zzee.zzc("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzwy zzwyVar = this.zzd;
            Objects.requireNonNull(zzwyVar);
            zzwyVar.zzI(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzc(long j) {
        zzxb zzxbVar;
        zzxbVar = this.zza.zzf;
        zzdl.zzf(zzxbVar == null);
        this.zza.zzf = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            zzd();
        }
    }

    private final void zzd() {
        ExecutorService executorService;
        zzxb zzxbVar;
        this.zze = null;
        zzxg zzxgVar = this.zza;
        executorService = zzxgVar.zze;
        zzxbVar = zzxgVar.zzf;
        Objects.requireNonNull(zzxbVar);
        executorService.execute(zzxbVar);
    }
}
