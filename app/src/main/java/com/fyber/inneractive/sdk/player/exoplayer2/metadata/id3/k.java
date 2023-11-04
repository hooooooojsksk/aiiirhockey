package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;

/* loaded from: classes.dex */
public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new a();
    public final String b;
    public final String c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public k[] newArray(int i) {
            return new k[i];
        }
    }

    public k(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.a.equals(kVar.a) && u.a(this.b, kVar.b) && u.a(this.c, kVar.c);
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() + 527) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public k(Parcel parcel) {
        super(parcel.readString());
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
