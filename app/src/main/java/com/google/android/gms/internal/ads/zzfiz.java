package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfiz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfiz> CREATOR = new zzfja();
    public final int zza;
    private zzans zzb = null;
    private byte[] zzc;

    public zzfiz(int i, byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        zzb();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzax();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzans zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzans.zze(this.zzc, zzgpy.zza());
                this.zzc = null;
            } catch (zzgqy | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.zzb;
    }

    private final void zzb() {
        zzans zzansVar = this.zzb;
        if (zzansVar != null || this.zzc == null) {
            if (zzansVar == null || this.zzc != null) {
                if (zzansVar == null || this.zzc == null) {
                    if (zzansVar != null || this.zzc != null) {
                        throw new IllegalStateException("Impossible");
                    }
                    throw new IllegalStateException("Invalid internal representation - empty");
                }
                throw new IllegalStateException("Invalid internal representation - full");
            }
        }
    }
}
