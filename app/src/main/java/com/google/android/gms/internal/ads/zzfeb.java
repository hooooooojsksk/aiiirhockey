package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzfeb {
    public static zzfec zza(Context context, int i) {
        boolean booleanValue;
        if (zzfep.zza()) {
            int i2 = i - 2;
            if (i2 == 20 || i2 == 21) {
                booleanValue = ((Boolean) zzbcd.zze.zze()).booleanValue();
            } else {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) zzbcd.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) zzbcd.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) zzbcd.zzb.zze()).booleanValue();
                        break;
                }
            }
            if (booleanValue) {
                return new zzfee(context, i);
            }
        }
        return new zzfey();
    }

    public static zzfec zzb(Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zzfec zza = zza(context, i);
        if (zza instanceof zzfee) {
            zza.zzh();
            zza.zzm(i2);
            if (zzfem.zze(zzlVar.zzp)) {
                zza.zze(zzlVar.zzp);
            }
            return zza;
        }
        return zza;
    }
}
