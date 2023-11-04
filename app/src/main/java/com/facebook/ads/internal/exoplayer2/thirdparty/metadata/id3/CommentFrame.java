package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0499Hs;
import com.facebook.ads.redexgen.X.DJ;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CommentFrame extends Id3Frame {
    public static byte[] A03;
    public static String[] A04 = {"ZVxUvK3AVi8zNScJhnmsLSS8hdN9xGDP", "Sae5o8laqnaebHn0b5geSb", "di4VUyGUb0d2J3QUghf3nDKNpnAqdf", "nECZWQbQBeThiHkpci6eDFW5ke8cOEa4", "rLBxaDDsQGVx7mkozrVDErjzNKQrb0tz", "A0mDb7f35yqHYU5MpyZzu", "exPti4GjcfqcVzI7iQU1DQBToqhmep4Y", "Dp89LAvAt"};
    public static final Parcelable.Creator<CommentFrame> CREATOR;
    public final String A00;
    public final String A01;
    public final String A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 61);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {6, 10, 78, 79, 89, airhockey.P_GAME_REMATCH, 88, airhockey.P_GAME_MYSCORE, 90, 94, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_STANDBY, airhockey.P_GAME_SELECTMAP, 23, 60, 38, airhockey.J_GAME_EXIT, airhockey.J_ENEMYWIN, airhockey.J_ENEMYLOSE, airhockey.J_SDKVER, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ENEMYWIN, airhockey.J_SDKVER, 99, 59, 58, 54, 52, 52};
        String[] strArr = A04;
        if (strArr[0].charAt(13) == strArr[3].charAt(13)) {
            throw new RuntimeException();
        }
        A04[5] = "50zzeDfdVqwFNgLXNKNlO";
        A03 = bArr;
    }

    static {
        A01();
        CREATOR = new DJ();
    }

    public CommentFrame(Parcel parcel) {
        super(A00(25, 4, 68));
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public CommentFrame(String str, String str2, String str3) {
        super(A00(25, 4, 68));
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        if (C0499Hs.A0g(this.A00, commentFrame.A00) && C0499Hs.A0g(this.A01, commentFrame.A01)) {
            boolean A0g = C0499Hs.A0g(this.A02, commentFrame.A02);
            if (A04[2].length() != 30) {
                throw new RuntimeException();
            }
            A04[4] = "6AjxNG6cPhdOIPoSxR67Sn9BDbBmgEKA";
            if (A0g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17 * 31;
        String str = this.A01;
        int result = str != null ? str.hashCode() : 0;
        int result2 = (i + result) * 31;
        String str2 = this.A00;
        int result3 = (result2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.A02;
        return result3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(14, 11, 59) + this.A01 + A00(0, 14, 23) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
