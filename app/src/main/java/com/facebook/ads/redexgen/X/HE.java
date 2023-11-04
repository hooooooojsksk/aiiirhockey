package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.NonNull;
import com.mobirix.airhockey.airhockey;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class HE extends OutputStream {
    public static byte[] A02;
    public boolean A00 = false;
    public final FileOutputStream A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{111, 90, 65, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_MYWIN, 77, airhockey.J_ENEMYLOSE, airhockey.P_GAME_MYWIN, airhockey.P_NATION, 75, airhockey.P_GAME_MYLOSE, 111, airhockey.J_ENEMYWIN, airhockey.J_NATION, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_EXIT, 46, airhockey.J_PURCHASE, airhockey.J_SDKVER, 46, 125, 119, 96, 109, 46, airhockey.J_ENEMYLOSE, airhockey.J_ENEMYWIN, airhockey.J_NATION, airhockey.J_GAME_ENEMYEXIT, 46, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, 125, 109, 124, airhockey.J_ENEMYWIN, 126, airhockey.J_PURCHASE, airhockey.J_SDKVER, 124, 52};
    }

    public HE(File file) throws FileNotFoundException {
        this.A01 = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        flush();
        try {
            this.A01.getFD().sync();
        } catch (IOException e) {
            Log.w(A00(0, 10, 22), A00(10, 31, 54), e);
        }
        this.A01.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.A01.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.A01.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr) throws IOException {
        this.A01.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
        this.A01.write(bArr, i, i2);
    }
}
