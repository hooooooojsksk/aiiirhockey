package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzwq {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzwr zzwrVar) {
        zzc(zzwrVar);
        this.zza.add(new zzwp(handler, zzwrVar));
    }

    public final void zzb(final int i, final long j, final long j2) {
        boolean z;
        Handler handler;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzwp zzwpVar = (zzwp) it.next();
            z = zzwpVar.zzc;
            if (!z) {
                handler = zzwpVar.zza;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzwo
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzwr zzwrVar;
                        zzwp zzwpVar2 = zzwp.this;
                        int i2 = i;
                        long j3 = j;
                        long j4 = j2;
                        zzwrVar = zzwpVar2.zzb;
                        zzwrVar.zzY(i2, j3, j4);
                    }
                });
            }
        }
    }

    public final void zzc(zzwr zzwrVar) {
        zzwr zzwrVar2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzwp zzwpVar = (zzwp) it.next();
            zzwrVar2 = zzwpVar.zzb;
            if (zzwrVar2 == zzwrVar) {
                zzwpVar.zzc();
                this.zza.remove(zzwpVar);
            }
        }
    }
}
