package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class I0 {
    public static byte[] A02;
    public static String[] A03 = {"ByJYsTLYuoR6uc8r", "JtyXwt9Aly6TcqGHtKIVJmBsk4OeLfoM", "a9HBAd1W81XiearAjjAT3V1ZsLEmO9Oi", "EXNlrjnsmLCbvnLTR5jNuRmyx9d0ZBX8", "CaQoJFxeqSTbWtIeh0kRdnuLPh9NlfCW", "NDFH7JBJhJBLaqfKHqozYt4fbxKVNhf7", "NTYlS1n6YEIgBX9wiCzSTuRNkv1W0ADe", "oBB1NAAyCwUYb6ONAQdFrjyju4xXh"};
    public final int A00;
    public final List<byte[]> A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{83, airhockey.J_ONREWARDED, airhockey.J_ONREWARDED, airhockey.J_WAIT, airhockey.J_ONREWARDED, 54, 102, 119, airhockey.J_ONREWARDED, airhockey.J_GAME_STANDBY, ByteCompanionObject.MAX_VALUE, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_BACK, 54, 94, 83, 64, 85, 54, airhockey.J_ERROR, airhockey.J_WAIT, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GOO, ByteCompanionObject.MAX_VALUE, airhockey.J_BACK};
    }

    static {
        A02();
    }

    public I0(List<byte[]> initializationData, int i) {
        this.A01 = initializationData;
        this.A00 = i;
    }

    public static I0 A00(C0483Hc c0483Hc) throws C9Y {
        try {
            c0483Hc.A0Z(21);
            int A0E = c0483Hc.A0E() & 3;
            int A0E2 = c0483Hc.A0E();
            int i = 0;
            int A06 = c0483Hc.A06();
            for (int i2 = 0; i2 < A0E2; i2++) {
                c0483Hc.A0Z(1);
                int csdStartPosition = c0483Hc.A0I();
                for (int csdLength = 0; csdLength < csdStartPosition; csdLength++) {
                    int numberOfArrays = c0483Hc.A0I();
                    int lengthSizeMinusOne = numberOfArrays + 4;
                    i += lengthSizeMinusOne;
                    c0483Hc.A0Z(numberOfArrays);
                }
            }
            c0483Hc.A0Y(A06);
            byte[] bArr = new byte[i];
            int bufferPosition = 0;
            String[] strArr = A03;
            String str = strArr[2];
            String str2 = strArr[4];
            int numberOfArrays2 = str.charAt(26);
            int lengthSizeMinusOne2 = str2.charAt(26);
            if (numberOfArrays2 != lengthSizeMinusOne2) {
                A03[7] = "2";
                for (int i3 = 0; i3 < A0E2; i3++) {
                    c0483Hc.A0Z(1);
                    int A0I = c0483Hc.A0I();
                    for (int csdStartPosition2 = 0; csdStartPosition2 < A0I; csdStartPosition2++) {
                        int csdLength2 = c0483Hc.A0I();
                        byte[] bArr2 = HY.A03;
                        int lengthSizeMinusOne3 = HY.A03.length;
                        System.arraycopy(bArr2, 0, bArr, bufferPosition, lengthSizeMinusOne3);
                        int lengthSizeMinusOne4 = HY.A03.length;
                        int bufferPosition2 = bufferPosition + lengthSizeMinusOne4;
                        byte[] bArr3 = c0483Hc.A00;
                        int lengthSizeMinusOne5 = c0483Hc.A06();
                        System.arraycopy(bArr3, lengthSizeMinusOne5, bArr, bufferPosition2, csdLength2);
                        bufferPosition = bufferPosition2 + csdLength2;
                        c0483Hc.A0Z(csdLength2);
                    }
                }
                int numberOfArrays3 = A0E + 1;
                return new I0(i == 0 ? null : Collections.singletonList(bArr), numberOfArrays3);
            }
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C9Y(A01(0, 25, 65), e);
        }
    }
}
