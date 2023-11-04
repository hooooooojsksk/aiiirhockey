package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzel {
    private static zzel zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
    private final Object zzd = new Object();
    private int zze = 0;

    private zzel(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        zzew.zzA(context, new zzek(this, null), intentFilter);
    }

    public static synchronized zzel zzb(Context context) {
        zzel zzelVar;
        synchronized (zzel.class) {
            if (zza == null) {
                zza = new zzel(context);
            }
            zzelVar = zza;
        }
        return zzelVar;
    }

    public static /* synthetic */ void zzc(zzel zzelVar, int i) {
        synchronized (zzelVar.zzd) {
            if (zzelVar.zze == i) {
                return;
            }
            zzelVar.zze = i;
            Iterator it = zzelVar.zzc.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zzwu zzwuVar = (zzwu) weakReference.get();
                if (zzwuVar != null) {
                    zzwuVar.zza.zzk(i);
                } else {
                    zzelVar.zzc.remove(weakReference);
                }
            }
        }
    }

    public final int zza() {
        int i;
        synchronized (this.zzd) {
            i = this.zze;
        }
        return i;
    }

    public final void zzd(zzwu zzwuVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.zzc.remove(weakReference);
            }
        }
        this.zzc.add(new WeakReference(zzwuVar));
        this.zzb.post(new Runnable(zzwuVar, null) { // from class: com.google.android.gms.internal.ads.zzeh
            public final /* synthetic */ zzwu zzb;

            @Override // java.lang.Runnable
            public final void run() {
                zzel zzelVar = zzel.this;
                zzwu zzwuVar2 = this.zzb;
                zzwuVar2.zza.zzk(zzelVar.zza());
            }
        });
    }
}
