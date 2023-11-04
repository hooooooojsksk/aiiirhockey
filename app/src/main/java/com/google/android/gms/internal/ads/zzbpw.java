package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbpw implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbpx zza;

    public zzbpw(zzbpx zzbpxVar) {
        this.zza = zzbpxVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("Operation denied by user.");
    }
}
