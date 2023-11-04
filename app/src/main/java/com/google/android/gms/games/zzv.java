package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzv extends com.google.android.gms.games.internal.zzc implements PlayerRelationshipInfo {
    public static final Parcelable.Creator<zzv> CREATOR = new zzw();
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    public zzv(int i, String str, String str2, String str3) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    public static int zzd(PlayerRelationshipInfo playerRelationshipInfo) {
        return Objects.hashCode(Integer.valueOf(playerRelationshipInfo.getFriendStatus()), playerRelationshipInfo.zzb(), playerRelationshipInfo.zza(), playerRelationshipInfo.zzc());
    }

    public static String zze(PlayerRelationshipInfo playerRelationshipInfo) {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(playerRelationshipInfo);
        stringHelper.add("FriendStatus", Integer.valueOf(playerRelationshipInfo.getFriendStatus()));
        if (playerRelationshipInfo.zzb() != null) {
            stringHelper.add("Nickname", playerRelationshipInfo.zzb());
        }
        if (playerRelationshipInfo.zza() != null) {
            stringHelper.add("InvitationNickname", playerRelationshipInfo.zza());
        }
        if (playerRelationshipInfo.zzc() != null) {
            stringHelper.add("NicknameAbuseReportToken", playerRelationshipInfo.zza());
        }
        return stringHelper.toString();
    }

    public static boolean zzf(PlayerRelationshipInfo playerRelationshipInfo, Object obj) {
        if (obj instanceof PlayerRelationshipInfo) {
            if (obj == playerRelationshipInfo) {
                return true;
            }
            PlayerRelationshipInfo playerRelationshipInfo2 = (PlayerRelationshipInfo) obj;
            return playerRelationshipInfo2.getFriendStatus() == playerRelationshipInfo.getFriendStatus() && Objects.equal(playerRelationshipInfo2.zzb(), playerRelationshipInfo.zzb()) && Objects.equal(playerRelationshipInfo2.zza(), playerRelationshipInfo.zza()) && Objects.equal(playerRelationshipInfo2.zzc(), playerRelationshipInfo.zzc());
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return zzf(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ PlayerRelationshipInfo freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final int getFriendStatus() {
        return this.zza;
    }

    public final int hashCode() {
        return zzd(this);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final String toString() {
        return zze(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzw.zza(this, parcel, i);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzc() {
        return this.zzd;
    }

    public zzv(PlayerRelationshipInfo playerRelationshipInfo) {
        this.zza = playerRelationshipInfo.getFriendStatus();
        this.zzb = playerRelationshipInfo.zzb();
        this.zzc = playerRelationshipInfo.zza();
        this.zzd = playerRelationshipInfo.zzc();
    }
}
