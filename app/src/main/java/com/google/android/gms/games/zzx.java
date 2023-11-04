package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzx extends zzq implements PlayerRelationshipInfo {
    private final com.google.android.gms.games.internal.player.zzd zza;

    public zzx(DataHolder dataHolder, int i, com.google.android.gms.games.internal.player.zzd zzdVar) {
        super(dataHolder, i);
        this.zza = zzdVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(Object obj) {
        return zzv.zzf(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ PlayerRelationshipInfo freeze() {
        return new zzv(this);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final int getFriendStatus() {
        return zzq(this.zza.zzH, -1);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return zzv.zzd(this);
    }

    public final String toString() {
        return zzv.zze(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzw.zza(new zzv(this), parcel, i);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zza() {
        return zzr(this.zza.zzJ, null);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzb() {
        return zzr(this.zza.zzI, null);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzc() {
        return zzr(this.zza.zzK, null);
    }
}
