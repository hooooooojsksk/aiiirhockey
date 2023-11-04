package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.aW */
/* loaded from: assets/audience_network.dex */
public final class C0992aW implements C0G {
    public static byte[] A03;
    public File A00;
    public RandomAccessFile A01;
    public final C0B A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-99, -34, -16, -99, -31, -26, -16, -32, -99, -32, -34, -32, -27, -30, airhockey.J_GAME_STANDBY, -85, -76, -73, airhockey.J_GAME_STANDBY, -88, -76, -78, -75, -79, -86, -71, -82, -76, -77, 102, -65, 8, 18, -65, 2, 14, 12, 15, 11, 4, 19, 4, 3, -64, -59, 25, 20, -59, 102, -100, -89, -81, -90, -92, -89, -103, -100, airhockey.J_SAVEDGAME_RELOAD, -112, -99, 86, -93, 79, -110, -101, -108, -112, -99, 79, -107, -104, -101, -108, -94, -49, -49, -52, -49, 125, -66, -51, -51, -62, -53, -63, 125, -64, -66, -64, -59, -62, -105, 125, -64, -66, -64, -59, -62, 125, -61, -58, -55, -62, 125, -47, -2, -2, -5, -2, -84, -17, -8, -5, -1, -11, -6, -13, -84, -14, -11, -8, -15, -84, -22, 23, 23, 20, 23, -59, 20, 21, 10, 19, 14, 19, 12, -59, -65, -20, -20, -23, -20, -102, -20, -33, -37, -34, -29, -24, -31, -102, -26, -33, -24, -31, -18, -30, -102, -23, -32, -102, -32, -29, -26, -33, -102, -106, -61, -61, -64, -61, airhockey.J_BACK, -61, -74, -65, -78, -66, -70, -65, -72, airhockey.J_BACK, -73, -70, -67, -74, airhockey.J_BACK, -20, 25, 25, 22, 25, -57, 28, 26, 16, 21, 14, -57, 13, 16, 19, 12, -57, -41, 4, 4, 1, 4, -78, 9, 4, -5, 6, -5, 0, -7, -78, -73, -10, -78, -12, 11, 6, -9, 5, -78, 6, 1, -78, -73, 5, -78, -8, 4, 1, -1, -78, -12, 7, -8, -8, -9, 4, -78, 9, -5, 6, -6, -78, 5, -5, 12, -9, -78, -73, -10, -34, 18, 23};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A07() throws C0990aU {
        if (A09()) {
            return;
        }
        A06();
        File file = new File(this.A00.getParentFile(), this.A00.getName().substring(0, this.A00.getName().length() - A00(48, 9, 15).length()));
        if (!this.A00.renameTo(file)) {
            throw new C0990aU(A00(166, 20, 40) + this.A00 + A00(44, 4, 124) + file + A00(14, 16, 28));
        }
        this.A00 = file;
        try {
            this.A01 = new RandomAccessFile(this.A00, A00(256, 1, 67));
        } catch (IOException e) {
            throw new C0990aU(A00(123, 14, 124) + this.A00 + A00(0, 14, 84), e);
        }
    }

    public C0992aW(File file, C0B c0b) throws C0990aU {
        File file2;
        try {
            if (c0b != null) {
                this.A02 = c0b;
                File directory = file.getParentFile();
                C0E.A06(directory);
                boolean exists = file.exists();
                if (exists) {
                    file2 = file;
                } else {
                    File parentFile = file.getParentFile();
                    file2 = new File(parentFile, file.getName() + A00(48, 9, 15));
                }
                this.A00 = file2;
                this.A01 = new RandomAccessFile(this.A00, exists ? A00(256, 1, 67) : A00(257, 2, 119));
                return;
            }
            throw new NullPointerException();
        } catch (IOException e) {
            throw new C0990aU(A00(186, 17, 126) + file + A00(0, 14, 84), e);
        }
    }

    private boolean A02(File file) {
        return file.getName().endsWith(A00(48, 9, 15));
    }

    public final synchronized int A03() throws C0990aU {
        try {
        } catch (IOException e) {
            throw new C0990aU(A00(137, 29, 81) + this.A00, e);
        }
        return (int) this.A01.length();
    }

    public final File A04() {
        return this.A00;
    }

    public final synchronized void A05() throws C0990aU {
        try {
            this.A01.setLength(0L);
        } catch (IOException e) {
            throw new C0990aU(A00(57, 16, 6), e);
        }
    }

    public final synchronized void A06() throws C0990aU {
        try {
            this.A01.close();
            this.A02.AFb(this.A00);
        } catch (IOException e) {
            throw new C0990aU(A00(104, 19, 99) + this.A00, e);
        }
    }

    public final synchronized void A08(byte[] bArr, int i) throws C0990aU {
        try {
            if (!A09()) {
                this.A01.seek(A03());
                this.A01.write(bArr, 0, i);
            } else {
                throw new C0990aU(A00(73, 31, 52) + this.A00 + A00(30, 14, 118));
            }
        } catch (IOException e) {
            throw new C0990aU(String.format(Locale.US, A00(HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 53, 105), Integer.valueOf(i), this.A01, Integer.valueOf(bArr.length)), e);
        }
    }

    public final synchronized boolean A09() {
        return !A02(this.A00);
    }
}
