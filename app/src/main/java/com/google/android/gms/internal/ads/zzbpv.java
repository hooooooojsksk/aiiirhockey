package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbpv implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbpx zza;

    public zzbpv(zzbpx zzbpxVar) {
        this.zza = zzbpxVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        Intent zzb = this.zza.zzb();
        com.google.android.gms.ads.internal.zzt.zzp();
        context = this.zza.zzb;
        com.google.android.gms.ads.internal.util.zzs.zzQ(context, zzb);
    }
}
