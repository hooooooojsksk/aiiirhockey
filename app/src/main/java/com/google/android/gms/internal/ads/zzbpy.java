package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbpy implements View.OnClickListener {
    final /* synthetic */ zzbpz zza;

    public zzbpy(zzbpz zzbpzVar) {
        this.zza = zzbpzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zza(true);
    }
}
