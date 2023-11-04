package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends h {
    public static final Parcelable.Creator<f> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public f[] newArray(int i) {
            return new f[i];
        }
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return u.a(this.b, fVar.b) && u.a(this.c, fVar.c) && u.a(this.d, fVar.d) && Arrays.equals(this.e, fVar.e);
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public f(Parcel parcel) {
        super("GEOB");
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.createByteArray();
    }
}
