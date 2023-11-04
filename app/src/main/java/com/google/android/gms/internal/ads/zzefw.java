package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzefw implements zzeat {
    private final zzeav zza;
    private final zzeba zzb;
    private final zzfda zzc;
    private final zzfuu zzd;

    public zzefw(zzfda zzfdaVar, zzfuu zzfuuVar, zzeav zzeavVar, zzeba zzebaVar) {
        this.zzc = zzfdaVar;
        this.zzd = zzfuuVar;
        this.zzb = zzebaVar;
        this.zza = zzeavVar;
    }

    public static final String zze(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final zzfut zza(final zzeyo zzeyoVar, final zzeyc zzeycVar) {
        final zzeaw zzeawVar;
        Iterator it = zzeycVar.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzeawVar = null;
                break;
            }
            try {
                zzeawVar = this.zza.zza((String) it.next(), zzeycVar.zzw);
                break;
            } catch (zzezc unused) {
            }
        }
        if (zzeawVar == null) {
            return zzfuj.zzg(new zzedw("Unable to instantiate mediation adapter class."));
        }
        zzbzs zzbzsVar = new zzbzs();
        zzeawVar.zzc.zza(new zzefv(this, zzeawVar, zzbzsVar));
        if (zzeycVar.zzN) {
            Bundle bundle = zzeyoVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfda zzfdaVar = this.zzc;
        return zzfck.zzd(new zzfce() { // from class: com.google.android.gms.internal.ads.zzeft
            @Override // com.google.android.gms.internal.ads.zzfce
            public final void zza() {
                zzefw.this.zzd(zzeyoVar, zzeycVar, zzeawVar);
            }
        }, this.zzd, zzfcu.ADAPTER_LOAD_AD_SYN, zzfdaVar).zzb(zzfcu.ADAPTER_LOAD_AD_ACK).zzd(zzbzsVar).zzb(zzfcu.ADAPTER_WRAP_ADAPTER).zze(new zzfcd() { // from class: com.google.android.gms.internal.ads.zzefu
            @Override // com.google.android.gms.internal.ads.zzfcd
            public final Object zza(Object obj) {
                return zzefw.this.zzc(zzeyoVar, zzeycVar, zzeawVar, (Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final boolean zzb(zzeyo zzeyoVar, zzeyc zzeycVar) {
        return !zzeycVar.zzu.isEmpty();
    }

    public final /* synthetic */ Object zzc(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar, Void r4) throws Exception {
        return this.zzb.zza(zzeyoVar, zzeycVar, zzeawVar);
    }

    public final /* synthetic */ void zzd(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws Exception {
        this.zzb.zzb(zzeyoVar, zzeycVar, zzeawVar);
    }
}
