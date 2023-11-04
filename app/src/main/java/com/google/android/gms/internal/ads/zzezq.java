package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzezq {
    private static zzezq zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcl zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzezq(Context context, com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.zzb = context;
        this.zzc = zzclVar;
    }

    static com.google.android.gms.ads.internal.client.zzcl zza(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzck.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            zzbza.zzh("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static zzezq zzd(Context context) {
        synchronized (zzezq.class) {
            zzezq zzezqVar = zza;
            if (zzezqVar != null) {
                return zzezqVar;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbcn.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcl zzclVar = null;
            if (longValue > 0 && longValue <= 230500000) {
                zzclVar = zza(applicationContext);
            }
            zzezq zzezqVar2 = new zzezq(applicationContext, zzclVar);
            zza = zzezqVar2;
            return zzezqVar2;
        }
    }

    public final zzbnf zzb() {
        return (zzbnf) this.zzd.get();
    }

    public final zzbzg zzc(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzA = com.google.android.gms.ads.internal.util.zzs.zzA(this.zzb);
        zzbzg zzbzgVar = new zzbzg(ModuleDescriptor.MODULE_VERSION, i2, true, zzA);
        if (((Boolean) zzbcn.zzc.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzc;
            com.google.android.gms.ads.internal.client.zzen zzenVar = null;
            if (zzclVar != null) {
                try {
                    zzenVar = zzclVar.getLiteSdkVersion();
                } catch (RemoteException unused) {
                }
            }
            return zzenVar == null ? zzbzgVar : new zzbzg(ModuleDescriptor.MODULE_VERSION, zzenVar.zza(), true, zzA);
        }
        return zzbzgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(com.google.android.gms.internal.ads.zzbnf r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbbw r0 = com.google.android.gms.internal.ads.zzbcn.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L22
            com.google.android.gms.ads.internal.client.zzcl r0 = r3.zzc
            if (r0 != 0) goto L15
        L13:
            r0 = r1
            goto L19
        L15:
            com.google.android.gms.internal.ads.zzbnf r0 = r0.getAdapterCreator()     // Catch: android.os.RemoteException -> L13
        L19:
            java.util.concurrent.atomic.AtomicReference r2 = r3.zzd
            if (r0 == 0) goto L1e
            r4 = r0
        L1e:
            com.google.android.gms.internal.ads.zzezp.zza(r2, r1, r4)
            return
        L22:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd
            com.google.android.gms.internal.ads.zzezp.zza(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzezq.zze(com.google.android.gms.internal.ads.zzbnf):void");
    }
}
