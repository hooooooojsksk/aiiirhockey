package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfmv {
    private static final Map zza = new HashMap();
    private final Context zzb;
    private final zzfmk zzc;
    private boolean zzh;
    private final Intent zzi;
    private ServiceConnection zzm;
    private IInterface zzn;
    private final zzfls zzo;
    private final List zze = new ArrayList();
    private final Set zzf = new HashSet();
    private final Object zzg = new Object();
    private final IBinder.DeathRecipient zzk = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzfmn
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzfmv.zzj(zzfmv.this);
        }
    };
    private final AtomicInteger zzl = new AtomicInteger(0);
    private final String zzd = "OverlayDisplayService";
    private final WeakReference zzj = new WeakReference(null);

    public zzfmv(Context context, zzfmk zzfmkVar, String str, Intent intent, zzfls zzflsVar, zzfmq zzfmqVar, byte[] bArr) {
        this.zzb = context;
        this.zzc = zzfmkVar;
        this.zzi = intent;
        this.zzo = zzflsVar;
    }

    public static /* synthetic */ void zzj(zzfmv zzfmvVar) {
        zzfmvVar.zzc.zzc("reportBinderDeath", new Object[0]);
        zzfmq zzfmqVar = (zzfmq) zzfmvVar.zzj.get();
        if (zzfmqVar == null) {
            zzfmvVar.zzc.zzc("%s : Binder has died.", zzfmvVar.zzd);
            for (zzfml zzfmlVar : zzfmvVar.zze) {
                zzfmlVar.zzc(zzfmvVar.zzv());
            }
            zzfmvVar.zze.clear();
        } else {
            zzfmvVar.zzc.zzc("calling onBinderDied", new Object[0]);
            zzfmqVar.zza();
        }
        synchronized (zzfmvVar.zzg) {
            zzfmvVar.zzw();
        }
    }

    public static /* bridge */ /* synthetic */ void zzn(zzfmv zzfmvVar, final TaskCompletionSource taskCompletionSource) {
        zzfmvVar.zzf.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfmm
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                zzfmv.this.zzt(taskCompletionSource, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void zzq(zzfmv zzfmvVar) {
        zzfmvVar.zzc.zzc("linkToDeath", new Object[0]);
        try {
            zzfmvVar.zzn.asBinder().linkToDeath(zzfmvVar.zzk, 0);
        } catch (RemoteException e) {
            zzfmvVar.zzc.zzb(e, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void zzr(zzfmv zzfmvVar) {
        zzfmvVar.zzc.zzc("unlinkToDeath", new Object[0]);
        zzfmvVar.zzn.asBinder().unlinkToDeath(zzfmvVar.zzk, 0);
    }

    private final RemoteException zzv() {
        return new RemoteException(String.valueOf(this.zzd).concat(" : Binder has died."));
    }

    public final void zzw() {
        for (TaskCompletionSource taskCompletionSource : this.zzf) {
            taskCompletionSource.trySetException(zzv());
        }
        this.zzf.clear();
    }

    public final Handler zzc() {
        Handler handler;
        Map map = zza;
        synchronized (map) {
            if (!map.containsKey(this.zzd)) {
                HandlerThread handlerThread = new HandlerThread(this.zzd, 10);
                handlerThread.start();
                map.put(this.zzd, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.zzd);
        }
        return handler;
    }

    public final IInterface zze() {
        return this.zzn;
    }

    public final void zzs(zzfml zzfmlVar, TaskCompletionSource taskCompletionSource) {
        zzc().post(new zzfmo(this, zzfmlVar.zzb(), taskCompletionSource, zzfmlVar));
    }

    public final /* synthetic */ void zzt(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
    }

    public final void zzu() {
        zzc().post(new zzfmp(this));
    }

    public static /* bridge */ /* synthetic */ void zzp(zzfmv zzfmvVar, zzfml zzfmlVar) {
        if (zzfmvVar.zzn != null || zzfmvVar.zzh) {
            if (zzfmvVar.zzh) {
                zzfmvVar.zzc.zzc("Waiting to bind to the service.", new Object[0]);
                zzfmvVar.zze.add(zzfmlVar);
                return;
            }
            zzfmlVar.run();
            return;
        }
        zzfmvVar.zzc.zzc("Initiate binding to the service.", new Object[0]);
        zzfmvVar.zze.add(zzfmlVar);
        zzfmu zzfmuVar = new zzfmu(zzfmvVar, null);
        zzfmvVar.zzm = zzfmuVar;
        zzfmvVar.zzh = true;
        if (zzfmvVar.zzb.bindService(zzfmvVar.zzi, zzfmuVar, 1)) {
            return;
        }
        zzfmvVar.zzc.zzc("Failed to bind to the service.", new Object[0]);
        zzfmvVar.zzh = false;
        for (zzfml zzfmlVar2 : zzfmvVar.zze) {
            zzfmlVar2.zzc(new zzfmw());
        }
        zzfmvVar.zze.clear();
    }
}
