package com.google.android.gms.games.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.games.zzfn;
import com.google.android.gms.internal.games.zzft;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzam extends zzfn {
    final /* synthetic */ zzbz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzbz zzbzVar) {
        super(zzbzVar.getContext().getMainLooper(), 1000);
        this.zza = zzbzVar;
    }

    @Override // com.google.android.gms.internal.games.zzfn
    protected final void zza(String str, int i) {
        try {
            if (this.zza.isConnected()) {
                ((zzce) this.zza.getService()).zzD(str, i);
                return;
            }
            zzft.zza("GamesGmsClientImpl", "Unable to increment event " + str + " by " + i + " because the games client is no longer connected");
        } catch (RemoteException e) {
            zzbz.zzbf(e);
        } catch (SecurityException e2) {
            int i2 = zzbz.zze;
            zzft.zzb("GamesGmsClientImpl", "Is player signed out?", e2);
        }
    }
}
