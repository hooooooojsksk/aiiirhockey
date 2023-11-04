package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public final class UP extends H1 {
    public static byte[] A00;
    public static final Pattern A01;
    public static final Pattern A02;
    public static final Pattern A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Nullable
    public static UP A00(File file, H5 h5) {
        String name = file.getName();
        if (!name.endsWith(A06(1, 7, 12))) {
            file = A05(file, h5);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        Matcher matcher = A03.matcher(name);
        if (matcher.matches()) {
            long length = file.length();
            String A0C = h5.A0C(Integer.parseInt(matcher.group(1)));
            if (A0C == null) {
                return null;
            }
            return new UP(A0C, Long.parseLong(matcher.group(2)), length, Long.parseLong(matcher.group(3)), file);
        }
        return null;
    }

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 9);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{64, airhockey.P_GAME_MYSCORE, -117, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYSCORE, airhockey.J_PURCHASE, -115, -124, -96, airhockey.J_GAME_EXIT, airhockey.J_GOO, 109, airhockey.J_GAME_ENEMYEXIT, -98, airhockey.J_GOO, airhockey.J_GAME_EXIT, -98, -90, 109, airhockey.J_GAME_ENEMYEXIT, -98, airhockey.J_GOO, airhockey.J_GAME_EXIT, -98, -90, 109, airhockey.J_GAME_ENEMYEXIT, -98, airhockey.J_GOO, -72, airhockey.J_SAVEDGAME_SAVE, -98, airhockey.J_GOO, -89, -70, -79, 102, -93, 109, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GOO, airhockey.J_INVITE, -95, airhockey.J_SAVEDGAME_SAVE, 109, -95, -87, airhockey.J_GOO, airhockey.J_INVITE, -95, airhockey.J_SAVEDGAME_SAVE, 109, -95, -87, airhockey.J_GOO, airhockey.J_INVITE, -95, airhockey.J_SAVEDGAME_SAVE, -69, 119, -95, airhockey.J_SAVEDGAME_SAVE, -86, -67, -76, airhockey.J_GAME_REMATCH, -107, 95, -109, -101, airhockey.J_NATION, 96, -109, airhockey.J_GAME_STANDBY, 95, -109, -101, airhockey.J_NATION, 96, -109, airhockey.J_GAME_STANDBY, 95, -109, -101, airhockey.J_NATION, 96, -109, airhockey.J_GAME_STANDBY, -83, airhockey.J_GAME_EXIT, -109, airhockey.J_GAME_STANDBY, -100, -81, -90, 91};
    }

    static {
        A07();
        A01 = Pattern.compile(A06(8, 29, 57), 32);
        A02 = Pattern.compile(A06(37, 29, 60), 32);
        A03 = Pattern.compile(A06(66, 30, 46), 32);
    }

    public UP(String str, long j, long j2, long j3, @Nullable File file) {
        super(str, j, j2, j3, file);
    }

    public static UP A01(String str, long j) {
        return new UP(str, j, -1L, -9223372036854775807L, null);
    }

    public static UP A02(String str, long j) {
        return new UP(str, j, -1L, -9223372036854775807L, null);
    }

    public static UP A03(String str, long j, long j2) {
        return new UP(str, j, j2, -9223372036854775807L, null);
    }

    public static File A04(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        String A06 = A06(0, 1, 9);
        sb.append(A06);
        sb.append(j);
        sb.append(A06);
        sb.append(j2);
        sb.append(A06(1, 7, 12));
        return new File(file, sb.toString());
    }

    @Nullable
    public static File A05(File file, H5 h5) {
        String filename;
        String name = file.getName();
        Matcher matcher = A02.matcher(name);
        if (matcher.matches()) {
            String filename2 = matcher.group(1);
            filename = C0499Hs.A0O(filename2);
            if (filename == null) {
                return null;
            }
        } else {
            matcher = A01.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            filename = matcher.group(1);
        }
        File parentFile = file.getParentFile();
        int A08 = h5.A08(filename);
        String filename3 = matcher.group(2);
        long parseLong = Long.parseLong(filename3);
        String filename4 = matcher.group(3);
        File A04 = A04(parentFile, A08, parseLong, Long.parseLong(filename4));
        if (file.renameTo(A04)) {
            return A04;
        }
        return null;
    }

    public final UP A08(int i) {
        HD.A04(this.A05);
        long currentTimeMillis = System.currentTimeMillis();
        return new UP(this.A04, this.A02, this.A01, currentTimeMillis, A04(this.A03.getParentFile(), i, this.A02, currentTimeMillis));
    }
}
