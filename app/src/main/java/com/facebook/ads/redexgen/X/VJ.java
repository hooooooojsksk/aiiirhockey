package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class VJ extends DownloadAction {
    public static byte[] A01;
    public static String[] A02 = {"46KZlysh", "v5JbI1zn9NtFmtUSNw1LX8qgRoLlRTf2", "7hsTeREa3OQkhlUjYSFE7Yjn3OMopZtq", "bIH7uFzN8pwIBPvvAc6jvDp34yKHOPZU", "2wsaknzvnlzVc88IfTqAZxXmGFxrjXmK", "D0CHBscM", "uBnM1bOV2oDm3jLZQVjZSmaYperPVq3J", "bW98koNIZcc09K7QNnn8hDaxiQx7kOVn"};
    public static final DownloadAction.Deserializer A03;
    @Nullable
    public final String A00;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[7].charAt(4) != strArr[4].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "QG69phFI";
            strArr2[0] = "e1bZ87VO";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 84);
            i4++;
        }
    }

    public static void A06() {
        A01 = new byte[]{20, 22, 11, 3, 22, 1, 23, 23, 13, 18, 1};
    }

    static {
        A06();
        A03 = new VK(A05(0, 11, 48), 0);
    }

    public VJ(Uri uri, boolean z, @Nullable byte[] bArr, @Nullable String str) {
        super(A05(0, 11, 48), 0, uri, z, bArr);
        this.A00 = str;
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    /* renamed from: A02 */
    public final VI A07(C0405Dy c0405Dy) {
        return new VI(this.A01, this.A00, c0405Dy);
    }

    private String A04() {
        String str = this.A00;
        return str != null ? str : H3.A01(this.A01);
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final void A08(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(this.A01.toString());
        dataOutputStream.writeBoolean(this.A03);
        dataOutputStream.writeInt(this.A04.length);
        dataOutputStream.write(this.A04);
        boolean z = this.A00 != null;
        dataOutputStream.writeBoolean(z);
        if (A02[2].charAt(20) == 'J') {
            throw new RuntimeException();
        }
        A02[6] = "acUvI36WXCZycPiwDJpirJRaYqE7nyij";
        if (z) {
            dataOutputStream.writeUTF(this.A00);
        }
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final boolean A09(DownloadAction downloadAction) {
        return (downloadAction instanceof VJ) && A04().equals(((VJ) downloadAction).A04());
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return C0499Hs.A0g(this.A00, ((VJ) obj).A00);
        } else if (A02[6].charAt(28) != 'H') {
            String[] strArr = A02;
            strArr[1] = "v5mwaZUoOiBJC9mXljSIGj8i3GxyffA1";
            strArr[3] = "RcK60WiDeUlnnWyZ6eoupL9HUr6ECWiO";
            return true;
        } else {
            throw new RuntimeException();
        }
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final int hashCode() {
        int result = super.hashCode();
        int i = result * 31;
        String str = this.A00;
        int result2 = str != null ? str.hashCode() : 0;
        return i + result2;
    }
}
