package com.google.android.gms.internal.ads;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.List;
import kotlin.UByte;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
final class zzagu extends zzagy {
    private static final byte[] zza = {79, airhockey.J_GOO, airhockey.J_ERROR, airhockey.J_SAVEDGAME_SAVE, airhockey.P_GAME_MYLOSE, airhockey.J_GAME_STANDBY, airhockey.J_SDKVER, airhockey.J_ONREWARDED};
    private static final byte[] zzb = {79, airhockey.J_GOO, airhockey.J_ERROR, airhockey.J_SAVEDGAME_SAVE, 84, airhockey.J_SDKVER, airhockey.J_ENEMYWIN, airhockey.J_SAVEDGAME_SAVE};
    private boolean zzc;

    public static boolean zzd(zzen zzenVar) {
        return zzk(zzenVar, zza);
    }

    private static boolean zzk(zzen zzenVar, byte[] bArr) {
        if (zzenVar.zza() < 8) {
            return false;
        }
        int zzc = zzenVar.zzc();
        byte[] bArr2 = new byte[8];
        zzenVar.zzB(bArr2, 0, 8);
        zzenVar.zzF(zzc);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    protected final long zza(zzen zzenVar) {
        return zzg(zzaas.zzb(zzenVar.zzH()));
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzen zzenVar, long j, zzagv zzagvVar) throws zzbu {
        if (zzk(zzenVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzenVar.zzH(), zzenVar.zzd());
            int i = copyOf[9] & UByte.MAX_VALUE;
            List zzc = zzaas.zzc(copyOf);
            if (zzagvVar.zza != null) {
                return true;
            }
            zzad zzadVar = new zzad();
            zzadVar.zzS("audio/opus");
            zzadVar.zzw(i);
            zzadVar.zzT(48000);
            zzadVar.zzI(zzc);
            zzagvVar.zza = zzadVar.zzY();
            return true;
        } else if (zzk(zzenVar, zzb)) {
            zzdl.zzb(zzagvVar.zza);
            if (this.zzc) {
                return true;
            }
            this.zzc = true;
            zzenVar.zzG(8);
            zzbq zzb2 = zzabh.zzb(zzfqk.zzn(zzabh.zzc(zzenVar, false, false).zzb));
            if (zzb2 == null) {
                return true;
            }
            zzad zzb3 = zzagvVar.zza.zzb();
            zzb3.zzM(zzb2.zzd(zzagvVar.zza.zzk));
            zzagvVar.zza = zzb3.zzY();
            return true;
        } else {
            zzdl.zzb(zzagvVar.zza);
            return false;
        }
    }
}
