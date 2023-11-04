package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public abstract class zzetk implements zzeir {
    protected final zzcgd zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzeua zzd;
    private final zzevt zze;
    private final zzbzg zzf;
    private final ViewGroup zzg;
    private final zzfep zzh;
    private final zzeyv zzi;
    @Nullable
    private zzfut zzj;

    public zzetk(Context context, Executor executor, zzcgd zzcgdVar, zzevt zzevtVar, zzeua zzeuaVar, zzeyv zzeyvVar, zzbzg zzbzgVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcgdVar;
        this.zze = zzevtVar;
        this.zzd = zzeuaVar;
        this.zzi = zzeyvVar;
        this.zzf = zzbzgVar;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcgdVar.zzy();
    }

    public final synchronized zzctv zzm(zzevr zzevrVar) {
        zzetj zzetjVar = (zzetj) zzevrVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhz)).booleanValue()) {
            zzcoh zzcohVar = new zzcoh(this.zzg);
            zzctx zzctxVar = new zzctx();
            zzctxVar.zzd(this.zzb);
            zzctxVar.zzh(zzetjVar.zza);
            zzctz zzi = zzctxVar.zzi();
            zzczz zzczzVar = new zzczz();
            zzczzVar.zzc(this.zzd, this.zzc);
            zzczzVar.zzl(this.zzd, this.zzc);
            return zze(zzcohVar, zzi, zzczzVar.zzn());
        }
        zzeua zzi2 = zzeua.zzi(this.zzd);
        zzczz zzczzVar2 = new zzczz();
        zzczzVar2.zzb(zzi2, this.zzc);
        zzczzVar2.zzg(zzi2, this.zzc);
        zzczzVar2.zzh(zzi2, this.zzc);
        zzczzVar2.zzi(zzi2, this.zzc);
        zzczzVar2.zzc(zzi2, this.zzc);
        zzczzVar2.zzl(zzi2, this.zzc);
        zzczzVar2.zzm(zzi2);
        zzcoh zzcohVar2 = new zzcoh(this.zzg);
        zzctx zzctxVar2 = new zzctx();
        zzctxVar2.zzd(this.zzb);
        zzctxVar2.zzh(zzetjVar.zza);
        return zze(zzcohVar2, zzctxVar2.zzi(), zzczzVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzeir
    public final boolean zza() {
        zzfut zzfutVar = this.zzj;
        return (zzfutVar == null || zzfutVar.isDone()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0045 A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #0 {, blocks: (B:42:0x0001, B:44:0x0011, B:48:0x0026, B:53:0x0045, B:56:0x0056, B:60:0x005c, B:62:0x006c, B:64:0x0074, B:66:0x0089, B:68:0x00a2, B:70:0x00a6, B:71:0x00af, B:51:0x003e), top: B:77:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0056 A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:42:0x0001, B:44:0x0011, B:48:0x0026, B:53:0x0045, B:56:0x0056, B:60:0x005c, B:62:0x006c, B:64:0x0074, B:66:0x0089, B:68:0x00a2, B:70:0x00a6, B:71:0x00af, B:51:0x003e), top: B:77:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzeir
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl r8, java.lang.String r9, com.google.android.gms.internal.ads.zzeip r10, com.google.android.gms.internal.ads.zzeiq r11) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzetk.zzb(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.google.android.gms.internal.ads.zzeip, com.google.android.gms.internal.ads.zzeiq):boolean");
    }

    protected abstract zzctv zze(zzcoh zzcohVar, zzctz zzctzVar, zzdab zzdabVar);

    public final /* synthetic */ void zzk() {
        this.zzd.zza(zzezx.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi.zzt(zzwVar);
    }
}
