package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.8m */
/* loaded from: assets/audience_network.dex */
public class C02818m {
    public static byte[] A04;
    public int A00;
    public long A01;
    public final RandomAccessFile A02;
    public final long[] A03;

    static {
        A06();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C02818m A04(File file) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, A05(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE, 3, 41));
            if (file.length() >= A00()) {
                long readLong = randomAccessFile.readLong();
                if (readLong == -360011992771067903L) {
                    long readLong2 = randomAccessFile.readLong();
                    if (readLong2 < 0 || readLong2 > 100000) {
                        throw new IOException(String.format(Locale.US, A05(77, 40, 47), Long.valueOf(readLong2)));
                    }
                    if (randomAccessFile.length() >= A02((int) readLong2)) {
                        long[] jArr = new long[(int) readLong2];
                        for (int i = 0; i < jArr.length; i++) {
                            jArr[i] = randomAccessFile.readLong();
                        }
                        return new C02818m(randomAccessFile, jArr, randomAccessFile.length());
                    }
                    throw new IOException(String.format(Locale.US, A05(117, 63, 43), Long.valueOf(readLong2), Long.valueOf(file.length())));
                }
                throw new IOException(String.format(Locale.US, A05(180, 27, 8), Long.valueOf(readLong), -360011992771067903L));
            }
            throw new IOException(String.format(Locale.US, A05(50, 27, 73), Long.valueOf(file.length()), Long.valueOf(A00())));
        } catch (IOException unused) {
            if (0 != 0) {
                A07(null);
            }
            throw new IOException(String.format(Locale.US, A05(26, 24, 0), file.getCanonicalPath()));
        }
    }

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A04 = new byte[]{-57, -30, -22, -19, -26, -27, -95, -11, -16, -95, -28, -13, -26, -30, -11, -26, -95, -25, -22, -19, -26, -95, -88, -90, -12, -88, airhockey.J_SAVEDGAME_RELOAD, -115, -107, -104, -111, -112, 76, -96, -101, 76, -101, -100, -111, -102, 76, -110, -107, -104, -111, 76, 83, 81, -97, 83, -69, -34, -31, -38, -107, -102, -39, -107, -41, -18, -23, -38, -24, -95, -107, -31, -38, -24, -24, -107, -23, -35, -42, -29, -107, -102, -39, -95, -60, -57, -64, 123, -65, -64, -66, -57, -68, -51, -64, -50, 123, -68, 123, -49, -54, -49, -68, -57, 123, -54, -63, 123, ByteCompanionObject.MIN_VALUE, -65, 123, -51, -64, -66, -54, -51, -65, 123, -50, -57, -54, -49, -50, -99, -64, -61, -68, 119, -69, -68, -70, -61, -72, -55, -68, -54, 119, -72, 119, -53, -58, -53, -72, -61, 119, -58, -67, 119, 124, -69, 119, -55, -68, -70, -58, -55, -69, 119, -54, -61, -58, -53, -54, -125, 119, -71, -52, -53, 119, -58, -59, -61, -48, 119, -65, -72, -54, 119, 124, -69, 119, -71, -48, -53, -68, -54, airhockey.J_PURCHASE, -99, -96, -103, 84, -95, -107, -101, -99, -105, 84, 89, -104, 84, -99, -94, -89, -88, -103, -107, -104, 84, -93, -102, 84, 89, -104, -85, -66, -68, -56, -53, -67, airhockey.J_WAIT, 126, -67, airhockey.J_WAIT, -56, -65, -65, -52, -66, -51, airhockey.J_WAIT, -62, -52, airhockey.J_WAIT, 126, -67, -123, airhockey.J_WAIT, -69, -50, -51, airhockey.J_WAIT, -53, -66, -68, -56, -53, -67, airhockey.J_WAIT, 126, -67, airhockey.J_WAIT, -56, -65, -65, -52, -66, -51, airhockey.J_WAIT, -62, -52, airhockey.J_WAIT, 126, -67, -77, -58, -60, -48, -45, -59, -127, -122, -59, -127, -48, -57, -57, -44, -58, -43, -127, -44, -55, -48, -42, -51, -59, -127, -61, -58, -127, -111, -127, -61, -58, -60, -62, -42, -44, -58, -127, -45, -58, -60, -48, -45, -59, -127, -60, -48, -42, -49, -43, -127, -54, -44, -127, -122, -59, -115, -127, -61, -42, -43, -127, -54, -44, -127, -122, -59, -79, -60, -62, -50, -47, -61, ByteCompanionObject.MAX_VALUE, -124, -61, ByteCompanionObject.MAX_VALUE, -46, -45, -64, -47, -45, -46, ByteCompanionObject.MAX_VALUE, -64, -45, ByteCompanionObject.MAX_VALUE, -50, -59, -59, -46, -60, -45, ByteCompanionObject.MAX_VALUE, -124, -61, -117, ByteCompanionObject.MAX_VALUE, -63, -44, -45, ByteCompanionObject.MAX_VALUE, -59, -56, -53, -60, ByteCompanionObject.MAX_VALUE, -46, -56, -39, -60, ByteCompanionObject.MAX_VALUE, -56, -46, ByteCompanionObject.MAX_VALUE, -124, -61, -107, -88, -90, -78, -75, -89, 99, airhockey.J_SAVEDGAME_SAVE, 99, -78, -87, -87, -74, -88, -73, 99, -88, -69, -77, -88, -90, -73, -88, -89, 99, -92, -73, 99, airhockey.J_ENEMYLOSE, -89, 99, -91, -72, -73, 99, -84, -74, 99, -92, -73, 99, airhockey.J_ENEMYLOSE, -89, -57, -52, -56};
    }

    /* JADX WARN: Incorrect condition in loop: B:47:0x000e */
    /* JADX WARN: Incorrect condition in loop: B:57:0x0032 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C02818m(java.io.RandomAccessFile r12, long[] r13, long r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C02818m.<init>(java.io.RandomAccessFile, long[], long):void");
    }

    public static long A00() {
        return 16L;
    }

    private final long A01() {
        return A00() + (this.A03.length * 8);
    }

    public static long A02(int i) {
        return A00() + (i * 8);
    }

    public static C02818m A03(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, A05(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE, 3, 41));
        try {
            randomAccessFile.writeLong(-360011992771067903L);
            randomAccessFile.writeLong(C02828n.A03);
            randomAccessFile.write(new byte[C02828n.A03 * 8]);
            randomAccessFile.getFD().sync();
            return new C02818m(randomAccessFile, new long[C02828n.A03], randomAccessFile.length());
        } catch (IOException unused) {
            A07(randomAccessFile);
            throw new IOException(String.format(Locale.US, A05(0, 26, 85), file.getCanonicalPath()));
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A07(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }
}
