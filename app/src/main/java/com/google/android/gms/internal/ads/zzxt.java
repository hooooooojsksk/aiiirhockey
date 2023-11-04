package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzxt extends HandlerThread implements Handler.Callback {
    private zzdr zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzxv zze;

    public zzxt() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    zzdr zzdrVar = this.zza;
                    Objects.requireNonNull(zzdrVar);
                    zzdrVar.zzc();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                int i2 = message.arg1;
                zzdr zzdrVar2 = this.zza;
                Objects.requireNonNull(zzdrVar2);
                zzdrVar2.zzb(i2);
                this.zze = new zzxv(this, this.zza.zza(), i2 != 0, null);
                synchronized (this) {
                    notify();
                }
            } catch (zzds e) {
                zzee.zzc("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                this.zzd = new IllegalStateException(e);
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                zzee.zzc("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.zzc = e2;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e3) {
                zzee.zzc("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                this.zzd = e3;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzxv zza(int i) {
        boolean z;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzdr(this.zzb, null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzxv zzxvVar = this.zze;
                Objects.requireNonNull(zzxvVar);
                return zzxvVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        handler.sendEmptyMessage(2);
    }
}
