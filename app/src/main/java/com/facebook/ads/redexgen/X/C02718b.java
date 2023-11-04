package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.8b */
/* loaded from: assets/audience_network.dex */
public final class C02718b implements Closeable {
    public static byte[] A03;
    public static String[] A04 = {"SDO1JVQRVztc05U6wH4HJTiF5V86WLZV", "JUkWBi3mNnUEcI1zFAO0icxdG8wRWdD7", "QP9Vd5zf9OYRCERvVtyUemXpYBL6EKiE", "xOOYiIXMxQksUvny4QEKcKXl4UDniIsU", "x87Ktc1IWjLpjjicmuhI7Z2IzrOHGBC3", "WGZ", "wfI1QUU7hCcnQ3hBelCxr5juQnjBiotI", "E2gfbhu1TU9ChELgnqQ3ne7CNBbav8TU"};
    public C02728c A00;
    public boolean A01;
    public final RandomAccessFile A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A04[5].length() != 3) {
                throw new RuntimeException();
            }
            A04[6] = "pH7cradwiFTKLrbheOx3UovjSmwH9sX8";
            copyOfRange[i4] = (byte) ((b ^ i3) ^ 38);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{95, airhockey.J_GAME_REMATCH, airhockey.J_INVITE, 111, airhockey.J_SAVEDGAME_SAVE, airhockey.J_INVITE, 90, airhockey.J_ERROR, airhockey.J_GOO, airhockey.J_WAIT, 60, airhockey.J_ERROR, 111, 60, 125, airhockey.J_GOO, airhockey.J_INVITE, airhockey.J_WAIT, 125, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_STANDBY, 60, ByteCompanionObject.MAX_VALUE, airhockey.J_GOO, airhockey.J_SAVEDGAME_SAVE, 111, airhockey.J_WAIT, airhockey.J_ACHIEVEMENTCALLBACK, 15, 40, 48, 39, 42, 47, 34, 102, 54, 41, 53, 47, 50, 47, 41, 40, 124, 102, airhockey.J_INVITE, 99, 34, airhockey.J_GAME_EXIT, 99, 34, 111, 94, 91, 95};
    }

    static {
        A02();
    }

    public C02718b(File file) throws IOException {
        this.A02 = new RandomAccessFile(file, A00(53, 3, 10));
        if (this.A02.length() != 8) {
            this.A02.setLength(8L);
            this.A00 = new C02728c(0, 0);
            A01();
            return;
        }
        int readInt = this.A02.readInt();
        int index = this.A02.readInt();
        if (readInt < 0 || index < 0) {
            readInt = 0;
            index = 0;
        }
        this.A00 = new C02728c(readInt, index);
    }

    private void A01() throws IOException {
        this.A02.seek(0L);
        this.A02.writeInt(this.A00.A02());
        this.A02.writeInt(this.A00.A03());
        this.A02.getFD().sync();
    }

    public final C02728c A03() throws IOException {
        if (!this.A01) {
            return this.A00;
        }
        throw new IOException(A00(0, 28, 58));
    }

    public final void A04(C02728c c02728c) throws IOException {
        if (!this.A01) {
            if (c02728c.A02() >= 0 && c02728c.A03() >= 0) {
                this.A00 = c02728c;
                A01();
                return;
            }
            throw new IOException(String.format(Locale.US, A00(28, 25, 96), Integer.valueOf(c02728c.A02()), Integer.valueOf(c02728c.A03())));
        }
        throw new IOException(A00(0, 28, 58));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        this.A02.close();
    }
}
