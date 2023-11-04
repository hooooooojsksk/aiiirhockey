package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzceu {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.gms.internal.ads.zzcei] */
    public static final zzcei zza(Context context, zzcfx zzcfxVar, String str, boolean z, boolean z2, zzapw zzapwVar, zzbbt zzbbtVar, zzbzg zzbzgVar, zzbbj zzbbjVar, com.google.android.gms.ads.internal.zzl zzlVar, com.google.android.gms.ads.internal.zza zzaVar, zzawe zzaweVar, zzeyc zzeycVar, zzeyf zzeyfVar) throws zzcet {
        zzbar.zzc(context);
        try {
            zzfok zzfokVar = new zzfok(context, zzcfxVar, str, z, z2, zzapwVar, zzbbtVar, zzbzgVar, null, zzlVar, zzaVar, zzaweVar, zzeycVar, zzeyfVar) { // from class: com.google.android.gms.internal.ads.zzceq
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzcfx zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzapw zzf;
                public final /* synthetic */ zzbbt zzg;
                public final /* synthetic */ zzbzg zzh;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzl zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                public final /* synthetic */ zzawe zzk;
                public final /* synthetic */ zzeyc zzl;
                public final /* synthetic */ zzeyf zzm;

                {
                    this.zzi = zzlVar;
                    this.zzj = zzaVar;
                    this.zzk = zzaweVar;
                    this.zzl = zzeycVar;
                    this.zzm = zzeyfVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfok
                public final Object zza() {
                    Context context2 = this.zza;
                    zzcfx zzcfxVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z3 = this.zzd;
                    boolean z4 = this.zze;
                    zzapw zzapwVar2 = this.zzf;
                    zzbbt zzbbtVar2 = this.zzg;
                    zzbzg zzbzgVar2 = this.zzh;
                    com.google.android.gms.ads.internal.zzl zzlVar2 = this.zzi;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzawe zzaweVar2 = this.zzk;
                    zzeyc zzeycVar2 = this.zzl;
                    zzeyf zzeyfVar2 = this.zzm;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = zzcfb.zza;
                        zzcex zzcexVar = new zzcex(new zzcfb(new zzcfw(context2), zzcfxVar2, str2, z3, z4, zzapwVar2, zzbbtVar2, zzbzgVar2, null, zzlVar2, zzaVar2, zzaweVar2, zzeycVar2, zzeyfVar2));
                        zzcexVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.zzq().zzd(zzcexVar, zzaweVar2, z4));
                        zzcexVar.setWebChromeClient(new zzceh(zzcexVar));
                        return zzcexVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ?? zza = zzfokVar.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza;
        } catch (Throwable th) {
            throw new zzcet("Webview initialization failed.", th);
        }
    }
}
