package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class H4 {
    public static byte[] A05;
    public static String[] A06 = {"j9EfDvchdu1KqySqOAnBSG3JWHZdS12U", "q23SQ5AypNqS8oaKOX4z", "zGl30nZzPzoLIdVG6oXXe73jwI6SvYzS", "XO0PMOb8qpQh9emdWW7Vnqfuo5cp8yJy", "hg0Ynef21ksm7drJYvbGXc6C6VdsLqYq", "sq8Z8cDX36Rb5yN4ZHuInHWL1DTNPmF7", "lpBmIRRiri9NKyd9o68rlNPCbyzvIw2I", "eicGPlwUgu"};
    public boolean A01;
    public final int A02;
    public final String A03;
    public UR A00 = UR.A04;
    public final TreeSet<UP> A04 = new TreeSet<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A06[6].charAt(21) != 'N') {
                throw new RuntimeException();
            }
            A06[6] = "ipIPz5SC6v0GmkIAozZhwN70MrudeMSU";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 100);
            i4++;
        }
    }

    public static void A02() {
        byte[] bArr = {-79, -9, -14, -6, -3, -10, -11, -65, -77, 7, 2, -77, 42, 61, airhockey.P_GAME_BREAKBALLCOUNT, 57, airhockey.P_GAME_STANDBY, 65, airhockey.P_GAME_BREAKBALLCOUNT, 63, -8, airhockey.P_GAME_MYWIN, 62, -8};
        String[] strArr = A06;
        if (strArr[4].charAt(2) != strArr[3].charAt(2)) {
            throw new RuntimeException();
        }
        A06[5] = "8leR2nWms8A7PmFgrtQ6nLfJYqb68GHr";
        A05 = bArr;
    }

    static {
        A02();
    }

    public H4(int i, String str) {
        this.A02 = i;
        this.A03 = str;
    }

    public static H4 A00(int i, DataInputStream dataInputStream) throws IOException {
        H4 h4 = new H4(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            H9 h9 = new H9();
            H8.A05(h9, readLong);
            h4.A0F(h9);
        } else {
            h4.A00 = UR.A00(dataInputStream);
        }
        return h4;
    }

    public final int A03(int i) {
        int result = this.A02;
        int i2 = result * 31;
        int result2 = this.A03.hashCode();
        int result3 = i2 + result2;
        if (i < 2) {
            long A00 = H8.A00(this.A00);
            return (result3 * 31) + ((int) ((A00 >>> 32) ^ A00));
        }
        return (result3 * 31) + this.A00.hashCode();
    }

    public final long A04(long j, long j2) {
        UP A062 = A06(j);
        if (A062.A01()) {
            return -Math.min(A062.A02() ? LongCompanionObject.MAX_VALUE : A062.A01, j2);
        }
        long j3 = j + j2;
        long queryEndPosition = A062.A02 + A062.A01;
        if (queryEndPosition < j3) {
            TreeSet<UP> treeSet = this.A04;
            if (A06[1].length() != 20) {
                throw new RuntimeException();
            }
            A06[1] = "RgZ5bXDLk5KqdLdfFSHI";
            for (UP up : treeSet.tailSet(A062, false)) {
                long currentEndPosition = up.A02;
                if (currentEndPosition > queryEndPosition) {
                    break;
                }
                long currentEndPosition2 = up.A02;
                queryEndPosition = Math.max(queryEndPosition, currentEndPosition2 + up.A01);
                if (queryEndPosition >= j3) {
                    break;
                }
            }
        }
        return Math.min(queryEndPosition - j, j2);
    }

    public final H7 A05() {
        return this.A00;
    }

    public final UP A06(long j) {
        UP A01 = UP.A01(this.A03, j);
        UP floor = this.A04.floor(A01);
        if (floor != null && floor.A02 + floor.A01 > j) {
            return floor;
        }
        TreeSet<UP> treeSet = this.A04;
        String[] strArr = A06;
        if (strArr[2].charAt(22) != strArr[0].charAt(22)) {
            throw new RuntimeException();
        }
        A06[6] = "nd2bgBSeUAsM9albd5et6NmdTACtd3AP";
        UP lookupSpan = treeSet.ceiling(A01);
        if (lookupSpan == null) {
            return UP.A02(this.A03, j);
        }
        return UP.A03(this.A03, j, lookupSpan.A02 - j);
    }

    public final UP A07(UP up) throws C0476Gv {
        HD.A04(this.A04.remove(up));
        UP A08 = up.A08(this.A02);
        if (up.A03.renameTo(A08.A03)) {
            this.A04.add(A08);
            return A08;
        }
        throw new C0476Gv(A01(12, 12, 116) + up.A03 + A01(8, 4, 47) + A08.A03 + A01(0, 8, 45));
    }

    public final TreeSet<UP> A08() {
        return this.A04;
    }

    public final void A09(UP up) {
        this.A04.add(up);
    }

    public final void A0A(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A02);
        dataOutputStream.writeUTF(this.A03);
        this.A00.A09(dataOutputStream);
    }

    public final void A0B(boolean z) {
        this.A01 = z;
    }

    public final boolean A0C() {
        return this.A04.isEmpty();
    }

    public final boolean A0D() {
        return this.A01;
    }

    public final boolean A0E(H1 h1) {
        if (this.A04.remove(h1)) {
            h1.A03.delete();
            return true;
        }
        return false;
    }

    public final boolean A0F(H9 h9) {
        UR ur = this.A00;
        UR oldMetadata = this.A00;
        this.A00 = oldMetadata.A08(h9);
        UR oldMetadata2 = this.A00;
        return !oldMetadata2.equals(ur);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        H4 h4 = (H4) obj;
        if (this.A02 == h4.A02 && this.A03.equals(h4.A03) && this.A04.equals(h4.A04) && this.A00.equals(h4.A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = A03(Integer.MAX_VALUE);
        int i = result * 31;
        int result2 = this.A04.hashCode();
        return i + result2;
    }
}
