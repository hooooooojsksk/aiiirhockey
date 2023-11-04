package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class OS extends InputStream {
    public static byte[] A04;
    public static String[] A05 = {"5FxkjmViipfuOEmeGZRh1rWuAhi58BIY", "P0uDFh8HOwAWvDVGkGeATzc", "FQ2HPVuJ9Fju5P7EfteSFhbDkCSiUGCr", "lMnDCDrcSzZtU6RMhKfYe1rO633Hkzz8", "BZaCeAJ4mpNw1z6aTzzGkvXJAvKgKDg7", "gl5vlYV0aCgrCc0s0sEnhviYHRKbo8Yg", "Tgc0UJMQxUN8PgOF6KJ9ZKrej2a3tpw", "OSPCme8ftb56UzOVrw2bgiBSvmZFYlRk"};
    @Nullable
    public MessageDigest A00;
    public final C0886Xb A01;
    public final OR A02;
    public final FileInputStream A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[7].charAt(24) == 'i') {
                break;
            }
            A05[7] = "wkBtkBfOXubsKwfKzYpxBJzZI93GSJMw";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            byte b = copyOfRange[i4];
            String[] strArr = A05;
            if (strArr[0].charAt(11) == strArr[3].charAt(11)) {
                break;
            }
            String[] strArr2 = A05;
            strArr2[1] = "6MRboz4pfSS0DylRcsmX7nz";
            strArr2[6] = "Z3yJOYkAPU5AGas9ZlGFYfEzislvm9u";
            copyOfRange[i4] = (byte) ((b - i3) - 45);
            i4++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A04 = new byte[]{-104, -113, ByteCompanionObject.MIN_VALUE, 11, 26, 19};
    }

    static {
        A01();
    }

    public OS(C0886Xb c0886Xb, FileInputStream fileInputStream, OR or) {
        this.A03 = fileInputStream;
        this.A02 = or;
        this.A01 = c0886Xb;
        try {
            this.A00 = MessageDigest.getInstance(A00(0, 3, 30));
        } catch (NoSuchAlgorithmException unused) {
            this.A00 = null;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.A03.available();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b = new byte[1];
        return read(b);
    }

    @Override // java.io.InputStream
    @SuppressLint({"CatchGeneralException"})
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.A03.read(bArr, i, i2);
        MessageDigest messageDigest = this.A00;
        if (messageDigest != null) {
            if (A05[7].charAt(24) == 'i') {
                throw new RuntimeException();
            }
            A05[2] = "wFnf9K6AarqF2rYbRIkm3wGElU25UaCd";
            try {
                if (read > 0) {
                    messageDigest.update(bArr, i, read);
                } else if (read == -1) {
                    String hash = C0565Kn.A05(messageDigest.digest());
                    this.A02.A8K(hash);
                    this.A00 = null;
                }
            } catch (Exception e) {
                this.A00 = null;
                this.A01.A07().A9V(A00(3, 3, 122), C02627s.A13, new C02637t(e));
            }
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        int actuallyRead = (int) j;
        byte[] bArr = new byte[1024];
        long j2 = 0;
        while (actuallyRead > 0) {
            int bytesToRead = read(bArr, 0, Math.min(actuallyRead, 1024));
            if (bytesToRead <= 0) {
                break;
            }
            actuallyRead -= bytesToRead;
            j2 += bytesToRead;
        }
        return j2;
    }
}
