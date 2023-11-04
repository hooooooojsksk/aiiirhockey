package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcpz implements zzcwc, zzcvi {
    private final Context zza;
    private final zzcei zzb;
    private final zzeyc zzc;
    private final zzbzg zzd;
    private IObjectWrapper zze;
    private boolean zzf;

    public zzcpz(Context context, zzcei zzceiVar, zzeyc zzeycVar, zzbzg zzbzgVar) {
        this.zza = context;
        this.zzb = zzceiVar;
        this.zzc = zzeycVar;
        this.zzd = zzbzgVar;
    }

    private final synchronized void zza() {
        zzear zzearVar;
        zzeas zzeasVar;
        if (this.zzc.zzU) {
            if (this.zzb == null) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzt.zzA().zze(this.zza)) {
                zzbzg zzbzgVar = this.zzd;
                String str = zzbzgVar.zzb + "." + zzbzgVar.zzc;
                String zza = this.zzc.zzW.zza();
                if (this.zzc.zzW.zzb() == 1) {
                    zzearVar = zzear.VIDEO;
                    zzeasVar = zzeas.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzearVar = zzear.HTML_DISPLAY;
                    if (this.zzc.zzf == 1) {
                        zzeasVar = zzeas.ONE_PIXEL;
                    } else {
                        zzeasVar = zzeas.BEGIN_TO_RENDER;
                    }
                }
                IObjectWrapper zza2 = com.google.android.gms.ads.internal.zzt.zzA().zza(str, this.zzb.zzG(), "", "javascript", zza, zzeasVar, zzearVar, this.zzc.zzam);
                this.zze = zza2;
                zzcei zzceiVar = this.zzb;
                if (zza2 != null) {
                    com.google.android.gms.ads.internal.zzt.zzA().zzc(this.zze, (View) zzceiVar);
                    this.zzb.zzap(this.zze);
                    com.google.android.gms.ads.internal.zzt.zzA().zzd(this.zze);
                    this.zzf = true;
                    this.zzb.zzd("onSdkLoaded", new ArrayMap());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final synchronized void zzl() {
        zzcei zzceiVar;
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzU || this.zze == null || (zzceiVar = this.zzb) == null) {
            return;
        }
        zzceiVar.zzd("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final synchronized void zzn() {
        if (this.zzf) {
            return;
        }
        zza();
    }
}
