package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public final class zzac extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbnf zzb;

    public zzac(zzaw zzawVar, Context context, zzbnf zzbnfVar) {
        this.zza = context;
        this.zzb = zzbnfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zza);
        zzbar.zzc(this.zza);
        if (((Boolean) zzba.zzc().zzb(zzbar.zziC)).booleanValue()) {
            return zzceVar.zzh(wrap, this.zzb, ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zza);
        zzbar.zzc(this.zza);
        if (((Boolean) zzba.zzc().zzb(zzbar.zziC)).booleanValue()) {
            try {
                return ((zzdk) zzbze.zzb(this.zza, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new zzbzc() { // from class: com.google.android.gms.ads.internal.client.zzab
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzbzc
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        return queryLocalInterface instanceof zzdk ? (zzdk) queryLocalInterface : new zzdk(obj);
                    }
                })).zze(wrap, this.zzb, ModuleDescriptor.MODULE_VERSION);
            } catch (RemoteException | zzbzd | NullPointerException e) {
                zzbsf.zza(this.zza).zzf(e, "ClientApiBroker.getOutOfContextTester");
                return null;
            }
        }
        return null;
    }
}
