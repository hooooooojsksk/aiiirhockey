package com.google.android.gms.internal.games;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzfr extends com.google.android.gms.games.internal.zzc {
    public static final Parcelable.Creator<zzfr> CREATOR = new zzfs();
    private final Bundle zza;
    private final IBinder zzb;

    public zzfr(Bundle bundle, IBinder iBinder) {
        this.zza = bundle;
        this.zzb = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zza, false);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzfr(zzfq zzfqVar) {
        this.zza = zzfqVar.zza();
        this.zzb = zzfqVar.zza;
    }
}
