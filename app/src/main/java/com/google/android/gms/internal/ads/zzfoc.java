package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesStatusCodes;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
final class zzfoc extends zzfof {
    final /* synthetic */ zzfod zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfoc(zzfod zzfodVar, zzfoh zzfohVar, CharSequence charSequence) {
        super(zzfohVar, charSequence);
        this.zza = zzfodVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final int zzc(int i) {
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final int zzd(int i) {
        int length = this.zzb.length();
        int i2 = i + GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND;
        if (i2 < length) {
            return i2;
        }
        return -1;
    }
}
