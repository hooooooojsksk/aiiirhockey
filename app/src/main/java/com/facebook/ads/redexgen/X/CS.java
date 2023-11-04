package com.facebook.ads.redexgen.X;

import kotlin.UByte;

/* loaded from: assets/audience_network.dex */
public final class CS {
    public static String[] A04 = {"1Xip6MK3UX39SbdrhQxDlLsVDK2jyOlR", "AU2BHKQnn2fYqPG5g1tvrnNHtccLtsvW", "5fujN1flEc5Me9dyDOpwJW6OKLh1geLG", "d2hyRAFooTRyki1bdAaACMGjhokH1kbm", "1id0n4LmWumjAHQEVAwGAQFe8ZjykTcE", "nyz5FVBYTM1P8JU78hecVl8rttPnaVCa", "YJ", "Rq"};
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;

    public CS(byte[] bArr) {
        this.A03 = bArr;
        this.A02 = bArr.length;
    }

    private void A00() {
        int i;
        int i2 = this.A01;
        HD.A04(i2 >= 0 && (i2 < (i = this.A02) || (i2 == i && this.A00 == 0)));
    }

    public final int A01() {
        return (this.A01 * 8) + this.A00;
    }

    public final int A02(int i) {
        int bitsRead = this.A01;
        int tempByteOffset = Math.min(i, 8 - this.A00);
        int i2 = bitsRead + 1;
        int tempByteOffset2 = this.A03[bitsRead];
        int tempByteOffset3 = ((tempByteOffset2 & 255) >> this.A00) & (255 >> (8 - tempByteOffset));
        while (tempByteOffset < i) {
            int returnValue = this.A03[i2];
            tempByteOffset3 |= (returnValue & 255) << tempByteOffset;
            tempByteOffset += 8;
            i2++;
        }
        int returnValue2 = 32 - i;
        int tempByteOffset4 = tempByteOffset3 & ((-1) >>> returnValue2);
        A03(i);
        return tempByteOffset4;
    }

    public final void A03(int i) {
        int i2 = i / 8;
        int numBytes = this.A01;
        this.A01 = numBytes + i2;
        int numBytes2 = i2 * 8;
        this.A00 += i - numBytes2;
        int i3 = this.A00;
        if (i3 > 7) {
            int numBytes3 = this.A01;
            this.A01 = numBytes3 + 1;
            int numBytes4 = i3 - 8;
            this.A00 = numBytes4;
        }
        A00();
        String[] strArr = A04;
        String str = strArr[6];
        String str2 = strArr[7];
        int length = str.length();
        int numBytes5 = str2.length();
        if (length != numBytes5) {
            throw new RuntimeException();
        }
        A04[2] = "0KTU32mldvOu3DR9Ufqh7FWixRDNtvi7";
    }

    public final boolean A04() {
        boolean returnValue = (((this.A03[this.A01] & UByte.MAX_VALUE) >> this.A00) & 1) == 1;
        A03(1);
        return returnValue;
    }
}
