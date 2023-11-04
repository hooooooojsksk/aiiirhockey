package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbjr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public final class zzei extends zzbjr {
    final /* synthetic */ zzej zza;

    public /* synthetic */ zzei(zzej zzejVar, zzeh zzehVar) {
        this.zza = zzejVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzb(List list) throws RemoteException {
        Object obj;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        InitializationStatus zzx;
        obj = this.zza.zzb;
        synchronized (obj) {
            this.zza.zzd = false;
            this.zza.zze = true;
            arrayList2 = this.zza.zzc;
            arrayList = new ArrayList(arrayList2);
            arrayList3 = this.zza.zzc;
            arrayList3.clear();
        }
        zzx = zzej.zzx(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(zzx);
        }
    }
}
