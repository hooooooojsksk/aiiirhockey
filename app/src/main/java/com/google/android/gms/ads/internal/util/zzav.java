package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzav implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    public zzav(zzaw zzawVar, Context context, String str, boolean z, boolean z2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzG = zzs.zzG(this.zza);
        zzG.setMessage(this.zzb);
        if (this.zzc) {
            zzG.setTitle("Error");
        } else {
            zzG.setTitle("Info");
        }
        if (this.zzd) {
            zzG.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            zzG.setPositiveButton("Learn More", new zzau(this));
            zzG.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        zzG.create().show();
    }
}
