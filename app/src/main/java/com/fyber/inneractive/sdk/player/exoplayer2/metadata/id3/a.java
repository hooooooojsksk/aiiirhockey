package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends h {
    public static final Parcelable.Creator<a> CREATOR = new C0044a();
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a$a */
    /* loaded from: classes.dex */
    public class C0044a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    public a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.d == aVar.d && u.a(this.b, aVar.b) && u.a(this.c, aVar.c) && Arrays.equals(this.e, aVar.e);
    }

    public int hashCode() {
        int i = (this.d + 527) * 31;
        String str = this.b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.e);
    }

    public a(Parcel parcel) {
        super("APIC");
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.createByteArray();
    }
}
