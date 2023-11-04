package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class PlayerRef extends zzq implements Player {
    private final com.google.android.gms.games.internal.player.zzd zza;
    private final PlayerLevelInfo zzb;
    private final com.google.android.gms.games.internal.player.zzc zzc;
    private final zzx zzd;
    private final zzc zze;

    public PlayerRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i);
        com.google.android.gms.games.internal.player.zzd zzdVar = new com.google.android.gms.games.internal.player.zzd(null);
        this.zza = zzdVar;
        this.zzc = new com.google.android.gms.games.internal.player.zzc(dataHolder, i, zzdVar);
        this.zzd = new zzx(dataHolder, i, zzdVar);
        this.zze = new zzc(dataHolder, i, zzdVar);
        if (hasNull(zzdVar.zzk) || getLong(zzdVar.zzk) == -1) {
            this.zzb = null;
            return;
        }
        int integer = getInteger(zzdVar.zzl);
        int integer2 = getInteger(zzdVar.zzo);
        PlayerLevel playerLevel = new PlayerLevel(integer, getLong(zzdVar.zzm), getLong(zzdVar.zzn));
        this.zzb = new PlayerLevelInfo(getLong(zzdVar.zzk), getLong(zzdVar.zzq), playerLevel, integer != integer2 ? new PlayerLevel(integer2, getLong(zzdVar.zzn), getLong(zzdVar.zzp)) : playerLevel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(Object obj) {
        return PlayerEntity.zzo(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ Player freeze() {
        return new PlayerEntity(this);
    }

    @Override // com.google.android.gms.games.Player
    public final Uri getBannerImageLandscapeUri() {
        return parseUri(this.zza.zzC);
    }

    @Override // com.google.android.gms.games.Player
    public String getBannerImageLandscapeUrl() {
        return getString(this.zza.zzD);
    }

    @Override // com.google.android.gms.games.Player
    public final Uri getBannerImagePortraitUri() {
        return parseUri(this.zza.zzE);
    }

    @Override // com.google.android.gms.games.Player
    public String getBannerImagePortraitUrl() {
        return getString(this.zza.zzF);
    }

    @Override // com.google.android.gms.games.Player
    public final CurrentPlayerInfo getCurrentPlayerInfo() {
        if (this.zze.zza()) {
            return this.zze;
        }
        return null;
    }

    @Override // com.google.android.gms.games.Player
    public final String getDisplayName() {
        return getString(this.zza.zzc);
    }

    @Override // com.google.android.gms.games.Player
    public final Uri getHiResImageUri() {
        return parseUri(this.zza.zzf);
    }

    @Override // com.google.android.gms.games.Player
    public String getHiResImageUrl() {
        return getString(this.zza.zzg);
    }

    @Override // com.google.android.gms.games.Player
    public final Uri getIconImageUri() {
        return parseUri(this.zza.zzd);
    }

    @Override // com.google.android.gms.games.Player
    public String getIconImageUrl() {
        return getString(this.zza.zze);
    }

    @Override // com.google.android.gms.games.Player
    public final long getLastPlayedWithTimestamp() {
        if (!hasColumn(this.zza.zzj) || hasNull(this.zza.zzj)) {
            return -1L;
        }
        return getLong(this.zza.zzj);
    }

    @Override // com.google.android.gms.games.Player
    public final PlayerLevelInfo getLevelInfo() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.Player
    public final String getPlayerId() {
        return getString(this.zza.zza);
    }

    @Override // com.google.android.gms.games.Player
    public final PlayerRelationshipInfo getRelationshipInfo() {
        zzx zzxVar = this.zzd;
        if (zzxVar.getFriendStatus() == -1 && zzxVar.zzb() == null && zzxVar.zza() == null) {
            return null;
        }
        return this.zzd;
    }

    @Override // com.google.android.gms.games.Player
    public final long getRetrievedTimestamp() {
        return getLong(this.zza.zzh);
    }

    @Override // com.google.android.gms.games.Player
    public final String getTitle() {
        return getString(this.zza.zzr);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean hasHiResImage() {
        return getHiResImageUri() != null;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean hasIconImage() {
        return getIconImageUri() != null;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return PlayerEntity.zzj(this);
    }

    public final String toString() {
        return PlayerEntity.zzl(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new PlayerEntity(this).writeToParcel(parcel, i);
    }

    @Override // com.google.android.gms.games.Player
    public final int zza() {
        return getInteger(this.zza.zzi);
    }

    @Override // com.google.android.gms.games.Player
    public final long zzb() {
        String str = this.zza.zzG;
        if (!hasColumn(str) || hasNull(str)) {
            return -1L;
        }
        return getLong(str);
    }

    @Override // com.google.android.gms.games.Player
    public final com.google.android.gms.games.internal.player.zza zzc() {
        if (hasNull(this.zza.zzt)) {
            return null;
        }
        return this.zzc;
    }

    @Override // com.google.android.gms.games.Player
    public final String zzd() {
        return zzr(this.zza.zzb, null);
    }

    @Override // com.google.android.gms.games.Player
    public final String zze() {
        return getString(this.zza.zzA);
    }

    @Override // com.google.android.gms.games.Player
    public final String zzf() {
        return getString(this.zza.zzB);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzg() {
        return getBoolean(this.zza.zzz);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzh() {
        return hasColumn(this.zza.zzM) && getBoolean(this.zza.zzM);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzi() {
        return getBoolean(this.zza.zzs);
    }

    @Override // com.google.android.gms.games.Player
    public final void getDisplayName(CharArrayBuffer charArrayBuffer) {
        copyToBuffer(this.zza.zzc, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Player
    public final void getTitle(CharArrayBuffer charArrayBuffer) {
        copyToBuffer(this.zza.zzr, charArrayBuffer);
    }
}
