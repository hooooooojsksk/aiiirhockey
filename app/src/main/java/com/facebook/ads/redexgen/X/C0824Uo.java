package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Base64;
import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Uo */
/* loaded from: assets/audience_network.dex */
public final class C0824Uo implements GX {
    public static byte[] A03;
    public static String[] A04 = {"Qh9bmuunZVNjCxMfQqp1TPZ6eQf7WY7l", "EJ3Pv4RmuS56E2GEtVJWqE7", "JL6QL60SCyNREhkJiPjX9lCI5sSEdh3E", "fY9V1T4K", "nskea9", "zswUenOt1n5zUjvxlDGbljbldmkP", "RjSf", "SzU1Hp8PCROGflUtYYCmDG"};
    public int A00;
    public C0458Gb A01;
    public byte[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A04;
            if (strArr[5].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[0] = "HPeuzqUxaD1vBlGbyXeTZfZGNJglEGHQ";
            strArr2[2] = "qkhW3lOqTV0ckWqWQ8OcwzSw2chzxPMS";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 53);
            i4++;
        }
    }

    public static void A01() {
        A03 = new byte[]{ByteCompanionObject.MAX_VALUE, airhockey.J_SAVEDGAME_RELOAD, 43, 40, 58, 44, ByteCompanionObject.MAX_VALUE, 125, 24, 47, 47, 50, 47, 125, 42, 53, 52, 49, 56, 125, 45, 60, 47, 46, 52, 51, 58, 125, 31, 60, 46, 56, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_REMATCH, 125, 56, 51, 62, 50, 57, 56, 57, 125, 46, 41, 47, 52, 51, 58, airhockey.J_ENEMYWIN, 125, airhockey.J_INVITE, airhockey.J_ENEMYLOSE, 22, airhockey.J_PURCHASE, airhockey.J_ENEMYLOSE, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 95, airhockey.J_ONREWARDED, 111, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_PURCHASE, 111, airhockey.J_GAME_REMATCH, 126, 111, airhockey.J_INVITE, 42, 95, 88, airhockey.P_GAME_MYSCORE, 42, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_STANDBY, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ENEMYWIN, airhockey.J_GAME_ENEMYEXIT, 126, 48, 42, 55, 12, 17, 23, 18, 18, 13, 16, 22, 7, 6, airhockey.P_NATION, 17, 1, 10, 7, 15, 7, 88, airhockey.P_NATION, 1, 4, 17, 4};
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final Uri A7w() {
        C0458Gb c0458Gb = this.A01;
        if (c0458Gb != null) {
            return c0458Gb.A04;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final long ADF(C0458Gb c0458Gb) throws IOException {
        this.A01 = c0458Gb;
        Uri uri = c0458Gb.A04;
        String scheme = uri.getScheme();
        if (A00(102, 4, 80).equals(scheme)) {
            String[] uriParts = C0499Hs.A0l(uri.getSchemeSpecificPart(), A00(0, 1, 102));
            if (uriParts.length == 2) {
                String str = uriParts[1];
                String dataString = uriParts[0];
                if (dataString.contains(A00(1, 7, 124))) {
                    try {
                        this.A02 = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e) {
                        String scheme2 = A00(8, 43, 104) + str;
                        throw new C9Y(scheme2, e);
                    }
                } else {
                    this.A02 = URLDecoder.decode(str, A00(51, 8, 14)).getBytes();
                }
                return this.A02.length;
            }
            String scheme3 = A00(59, 23, 63) + uri;
            throw new C9Y(scheme3);
        }
        String scheme4 = A00(82, 20, 87) + scheme;
        throw new C9Y(scheme4);
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final void close() throws IOException {
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int length = this.A02.length - this.A00;
        if (length == 0) {
            return -1;
        }
        int min = Math.min(i2, length);
        byte[] bArr2 = this.A02;
        int remainingBytes = this.A00;
        System.arraycopy(bArr2, remainingBytes, bArr, i, min);
        int remainingBytes2 = this.A00;
        this.A00 = remainingBytes2 + min;
        return min;
    }
}
