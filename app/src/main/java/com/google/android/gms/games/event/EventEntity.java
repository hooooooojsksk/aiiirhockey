package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.zzc;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class EventEntity extends zzc implements Event {
    public static final Parcelable.Creator<EventEntity> CREATOR = new zza();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final Uri zzd;
    private final String zze;
    private final PlayerEntity zzf;
    private final long zzg;
    private final String zzh;
    private final boolean zzi;

    public EventEntity(Event event) {
        this.zza = event.getEventId();
        this.zzb = event.getName();
        this.zzc = event.getDescription();
        this.zzd = event.getIconImageUri();
        this.zze = event.getIconImageUrl();
        this.zzf = (PlayerEntity) event.getPlayer().freeze();
        this.zzg = event.getValue();
        this.zzh = event.getFormattedValue();
        this.zzi = event.isVisible();
    }

    public static int zza(Event event) {
        return Objects.hashCode(event.getEventId(), event.getName(), event.getDescription(), event.getIconImageUri(), event.getIconImageUrl(), event.getPlayer(), Long.valueOf(event.getValue()), event.getFormattedValue(), Boolean.valueOf(event.isVisible()));
    }

    public static String zzb(Event event) {
        return Objects.toStringHelper(event).add("Id", event.getEventId()).add("Name", event.getName()).add("Description", event.getDescription()).add("IconImageUri", event.getIconImageUri()).add("IconImageUrl", event.getIconImageUrl()).add("Player", event.getPlayer()).add("Value", Long.valueOf(event.getValue())).add("FormattedValue", event.getFormattedValue()).add("isVisible", Boolean.valueOf(event.isVisible())).toString();
    }

    public static boolean zzc(Event event, Object obj) {
        if (obj instanceof Event) {
            if (event == obj) {
                return true;
            }
            Event event2 = (Event) obj;
            return Objects.equal(event2.getEventId(), event.getEventId()) && Objects.equal(event2.getName(), event.getName()) && Objects.equal(event2.getDescription(), event.getDescription()) && Objects.equal(event2.getIconImageUri(), event.getIconImageUri()) && Objects.equal(event2.getIconImageUrl(), event.getIconImageUrl()) && Objects.equal(event2.getPlayer(), event.getPlayer()) && Objects.equal(Long.valueOf(event2.getValue()), Long.valueOf(event.getValue())) && Objects.equal(event2.getFormattedValue(), event.getFormattedValue()) && Objects.equal(Boolean.valueOf(event2.isVisible()), Boolean.valueOf(event.isVisible()));
        }
        return false;
    }

    public boolean equals(Object obj) {
        return zzc(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public Event freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ Event freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.event.Event
    public String getDescription() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.event.Event
    public void getDescription(CharArrayBuffer charArrayBuffer) {
        DataUtils.copyStringToBuffer(this.zzc, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.event.Event
    public String getEventId() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.event.Event
    public String getFormattedValue() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.event.Event
    public void getFormattedValue(CharArrayBuffer charArrayBuffer) {
        DataUtils.copyStringToBuffer(this.zzh, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.event.Event
    public Uri getIconImageUri() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.event.Event
    public String getIconImageUrl() {
        return this.zze;
    }

    @Override // com.google.android.gms.games.event.Event
    public String getName() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.event.Event
    public void getName(CharArrayBuffer charArrayBuffer) {
        DataUtils.copyStringToBuffer(this.zzb, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.event.Event
    public Player getPlayer() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.event.Event
    public long getValue() {
        return this.zzg;
    }

    public int hashCode() {
        return zza(this);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override // com.google.android.gms.games.event.Event
    public boolean isVisible() {
        return this.zzi;
    }

    public String toString() {
        return zzb(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getEventId(), false);
        SafeParcelWriter.writeString(parcel, 2, getName(), false);
        SafeParcelWriter.writeString(parcel, 3, getDescription(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, getIconImageUri(), i, false);
        SafeParcelWriter.writeString(parcel, 5, getIconImageUrl(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getPlayer(), i, false);
        SafeParcelWriter.writeLong(parcel, 7, getValue());
        SafeParcelWriter.writeString(parcel, 8, getFormattedValue(), false);
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public EventEntity(String str, String str2, String str3, Uri uri, String str4, Player player, long j, String str5, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = uri;
        this.zze = str4;
        this.zzf = new PlayerEntity(player);
        this.zzg = j;
        this.zzh = str5;
        this.zzi = z;
    }
}
