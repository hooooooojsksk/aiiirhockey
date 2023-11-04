package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zziy implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzyp, zzoc, zzuu, zzrs, zzgy, zzgu, zzku, zzhk {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzjc zza;

    public /* synthetic */ zziy(zzjc zzjcVar, zzix zzixVar) {
        this.zza = zzjcVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzjc.zzW(this.zza, surfaceTexture);
        this.zza.zzao(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzar(null);
        this.zza.zzao(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzao(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzao(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzao(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zza(boolean z) {
        this.zza.zzav();
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzb(Exception exc) {
        zzlb zzlbVar;
        zzlbVar = this.zza.zzr;
        zzlbVar.zzy(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzc(String str, long j, long j2) {
        zzlb zzlbVar;
        zzlbVar = this.zza.zzr;
        zzlbVar.zzz(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzd(String str) {
        zzlb zzlbVar;
        zzlbVar = this.zza.zzr;
        zzlbVar.zzA(str);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zze(zzhb zzhbVar) {
        zzlb zzlbVar;
        zzlbVar = this.zza.zzr;
        zzlbVar.zzB(zzhbVar);
        this.zza.zzM = null;
        this.zza.zzT = null;
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzf(zzhb zzhbVar) {
        zzlb zzlbVar;
        this.zza.zzT = zzhbVar;
        zzlbVar = this.zza.zzr;
        zzlbVar.zzC(zzhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzg(zzaf zzafVar, zzhc zzhcVar) {
        zzlb zzlbVar;
        this.zza.zzM = zzafVar;
        zzlbVar = this.zza.zzr;
        zzlbVar.zzD(zzafVar, zzhcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzh(long j) {
        zzlb zzlbVar;
        zzlbVar = this.zza.zzr;
        zzlbVar.zzE(j);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzi(Exception exc) {
        zzlb zzlbVar;
        zzlbVar = this.zza.zzr;
        zzlbVar.zzF(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzj(int i, long j, long j2) {
        zzlb zzlbVar;
        zzlbVar = this.zza.zzr;
        zzlbVar.zzG(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzk(int i, long j) {
        zzlb zzlbVar;
        zzlbVar = this.zza.zzr;
        zzlbVar.zzH(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzl(Object obj, long j) {
        zzlb zzlbVar;
        Object obj2;
        zzeb zzebVar;
        zzlbVar = this.zza.zzr;
        zzlbVar.zzI(obj, j);
        zzjc zzjcVar = this.zza;
        obj2 = zzjcVar.zzO;
        if (obj2 == obj) {
            zzebVar = zzjcVar.zzl;
            zzebVar.zzd(26, new zzdy() { // from class: com.google.android.gms.internal.ads.zzis
                @Override // com.google.android.gms.internal.ads.zzdy
                public final void zza(Object obj22) {
                    zzcd zzcdVar = (zzcd) obj22;
                }
            });
            zzebVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzm(final boolean z) {
        boolean z2;
        zzeb zzebVar;
        zzjc zzjcVar = this.zza;
        z2 = zzjcVar.zzX;
        if (z2 == z) {
            return;
        }
        zzjcVar.zzX = z;
        zzebVar = this.zza.zzl;
        zzebVar.zzd(23, new zzdy() { // from class: com.google.android.gms.internal.ads.zziv
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                boolean z22 = z;
                int i = zziy.zzb;
                ((zzcd) obj).zzq(z22);
            }
        });
        zzebVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzn(Exception exc) {
        zzlb zzlbVar;
        zzlbVar = this.zza.zzr;
        zzlbVar.zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzo(String str, long j, long j2) {
        zzlb zzlbVar;
        zzlbVar = this.zza.zzr;
        zzlbVar.zzK(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzp(String str) {
        zzlb zzlbVar;
        zzlbVar = this.zza.zzr;
        zzlbVar.zzL(str);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzq(zzhb zzhbVar) {
        zzlb zzlbVar;
        zzlbVar = this.zza.zzr;
        zzlbVar.zzM(zzhbVar);
        this.zza.zzL = null;
        this.zza.zzS = null;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzr(zzhb zzhbVar) {
        zzlb zzlbVar;
        this.zza.zzS = zzhbVar;
        zzlbVar = this.zza.zzr;
        zzlbVar.zzN(zzhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzs(long j, int i) {
        zzlb zzlbVar;
        zzlbVar = this.zza.zzr;
        zzlbVar.zzO(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzt(zzaf zzafVar, zzhc zzhcVar) {
        zzlb zzlbVar;
        this.zza.zzL = zzafVar;
        zzlbVar = this.zza.zzr;
        zzlbVar.zzP(zzafVar, zzhcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzu(final zzda zzdaVar) {
        zzeb zzebVar;
        this.zza.zzac = zzdaVar;
        zzebVar = this.zza.zzl;
        zzebVar.zzd(25, new zzdy() { // from class: com.google.android.gms.internal.ads.zziw
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzda zzdaVar2 = zzda.this;
                int i = zziy.zzb;
                ((zzcd) obj).zzu(zzdaVar2);
            }
        });
        zzebVar.zzc();
    }
}
