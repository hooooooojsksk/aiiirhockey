package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i extends h {
    public static final Parcelable.Creator<i> CREATOR = new a();
    public final String b;
    public final byte[] c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public i[] newArray(int i) {
            return new i[i];
        }
    }

    public i(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return u.a(this.b, iVar.b) && Arrays.equals(this.c, iVar.c);
    }

    public int hashCode() {
        String str = this.b;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public i(Parcel parcel) {
        super("PRIV");
        this.b = parcel.readString();
        this.c = parcel.createByteArray();
    }
}
