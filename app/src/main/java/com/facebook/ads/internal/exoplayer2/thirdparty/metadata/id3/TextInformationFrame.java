package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0499Hs;
import com.facebook.ads.redexgen.X.DP;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class TextInformationFrame extends Id3Frame {
    public static byte[] A02;
    public static String[] A03 = {"UHiWQkFfOP", "HaYaoJ92KMKNMlK5UxT2lxTBpVXkrTkt", "0y7H8d3o2K", "NCEzepVrk44eZcfll4dhPsyW7k9Q", "0", "8ivycKNC9UkpYGv", "31yIvEesXu", "8uXL860ipDF8qUSZKyPgrhTiCr3qczlP"};
    public static final Parcelable.Creator<TextInformationFrame> CREATOR;
    @Nullable
    public final String A00;
    public final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 109);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{6, 28, airhockey.P_GAME_EXIT, 93, 80, airhockey.P_GAME_REMATCH, 89, 1};
    }

    static {
        A01();
        CREATOR = new DP();
    }

    public TextInformationFrame(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public TextInformationFrame(String str, @Nullable String str2, String str3) {
        super(str);
        this.A00 = str2;
        this.A01 = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        boolean equals = super.A00.equals(((Id3Frame) textInformationFrame).A00);
        String[] strArr = A03;
        if (strArr[2].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        A03[4] = "bC2";
        if (equals && C0499Hs.A0g(this.A00, textInformationFrame.A00) && C0499Hs.A0g(this.A01, textInformationFrame.A01)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = super.A00.hashCode();
        int result2 = ((17 * 31) + result) * 31;
        String str = this.A00;
        int hashCode = (result2 + (str != null ? str.hashCode() : 0)) * 31;
        if (A03[4].length() != 14) {
            String[] strArr = A03;
            strArr[2] = "lCUsvvXmhk";
            strArr[6] = "KftcCyu3Cg";
            String str2 = this.A01;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(0, 8, 81) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
