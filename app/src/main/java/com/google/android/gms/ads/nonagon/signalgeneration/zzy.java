package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbrr;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzfuf;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzy implements zzfuf {
    final /* synthetic */ zzbrr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzac zzc;

    public zzy(zzac zzacVar, zzbrr zzbrrVar, boolean z) {
        this.zzc = zzacVar;
        this.zza = zzbrrVar;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        try {
            zzbrr zzbrrVar = this.zza;
            String message = th.getMessage();
            zzbrrVar.zze("Internal error: " + message);
        } catch (RemoteException e) {
            zzbza.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        boolean z;
        String str;
        Uri zzX;
        zzfff zzfffVar;
        zzfff zzfffVar2;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.zza.zzf(arrayList);
            z = this.zzc.zzt;
            if (z || this.zzb) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (this.zzc.zzP(uri)) {
                        str = this.zzc.zzC;
                        zzX = zzac.zzX(uri, str, "1");
                        zzfffVar = this.zzc.zzs;
                        zzfffVar.zzc(zzX.toString(), null);
                    } else {
                        if (((Boolean) zzba.zzc().zzb(zzbar.zzgZ)).booleanValue()) {
                            zzfffVar2 = this.zzc.zzs;
                            zzfffVar2.zzc(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            zzbza.zzh("", e);
        }
    }
}
