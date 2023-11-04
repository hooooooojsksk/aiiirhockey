package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzajw;
import com.google.android.gms.internal.ads.zzakr;
import com.google.android.gms.internal.ads.zzalv;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzfut;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbo {
    private static zzakr zzb;
    private static final Object zzc = new Object();
    @Deprecated
    public static final zzbj zza = new zzbg();

    public zzbo(Context context) {
        zzakr zza2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            if (zzb == null) {
                zzbar.zzc(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdY)).booleanValue()) {
                        zza2 = zzax.zzb(context);
                        zzb = zza2;
                    }
                }
                zza2 = zzalv.zza(context, null);
                zzb = zza2;
            }
        }
    }

    public final zzfut zza(String str) {
        zzbzs zzbzsVar = new zzbzs();
        zzb.zza(new zzbn(str, null, zzbzsVar));
        return zzbzsVar;
    }

    public final zzfut zzb(int i, String str, Map map, byte[] bArr) {
        zzbl zzblVar = new zzbl(null);
        zzbh zzbhVar = new zzbh(this, str, zzblVar);
        zzbyz zzbyzVar = new zzbyz(null);
        zzbi zzbiVar = new zzbi(this, i, str, zzblVar, zzbhVar, bArr, map, zzbyzVar);
        if (zzbyz.zzl()) {
            try {
                zzbyzVar.zzd(str, "GET", zzbiVar.zzl(), zzbiVar.zzx());
            } catch (zzajw e) {
                zzbza.zzj(e.getMessage());
            }
        }
        zzb.zza(zzbiVar);
        return zzblVar;
    }
}
