package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Hi */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0489Hi implements QV {
    public static byte[] A01;
    public static String[] A02 = {"rzjVC70O4bd9DzHjbWZgWXgUSmVLYSU4", "d5zo8W4K", "Hv98ROwnq0amXTKQof8zpMynpU6nXYzw", "m02wtPmJvn7xvEVIhgILVdsvYaekd1y1", "NwXA6aDXoJPzKJxJycW", "lujFiBBwg3lGF", "5iNla1hEs57TMoL8Mlh58N0Q757SBHKY", "iek06qmxI9TIJY"};
    public final QW A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{89, 123, 123, 125, -120, -116, airhockey.P_GAME_STANDBY, 91, ByteCompanionObject.MIN_VALUE, airhockey.J_WAIT, -118, -117, 125, -116, -98, -67, -49, -59, -65, -82, -63, -51, -47, -63, -49, -48, -92, -67, -54, -64, -56, -63, -50, -118, -53, -54, -95, -50, -50, -53, -50, -102, -58, -59, -53, -68, -59, -53, -124, -85, -48, -57, -68, -71, -72, -86, -111, -100};
    }

    static {
        A01();
    }

    public AbstractC0489Hi(QW qw) {
        this.A00 = qw;
    }

    @Override // com.facebook.ads.redexgen.X.QV
    public final boolean AAy(QT qt) {
        QF A00 = qt.A00();
        if (this.A00.A8o()) {
            Log.e(AbstractC0489Hi.class.getSimpleName(), A00(14, 27, 78), qt);
        }
        if (A00 != null && A00.A7m() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.QV
    public final HttpURLConnection ADI(String str, @Nullable Proxy proxy) throws IOException {
        URL url = new URL(str);
        if (proxy == null) {
            return (HttpURLConnection) url.openConnection();
        }
        return (HttpURLConnection) url.openConnection(proxy);
    }

    @Override // com.facebook.ads.redexgen.X.QV
    public final InputStream ADJ(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getInputStream();
    }

    @Override // com.facebook.ads.redexgen.X.QV
    public final OutputStream ADK(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    @Override // com.facebook.ads.redexgen.X.QV
    public final void ADa(HttpURLConnection httpURLConnection, QR qr, String str) throws IOException {
        httpURLConnection.setRequestMethod(qr.A02());
        httpURLConnection.setDoOutput(qr.A04());
        httpURLConnection.setDoInput(qr.A03());
        if (str != null) {
            httpURLConnection.setRequestProperty(A00(41, 12, 73), str);
        }
        httpURLConnection.setRequestProperty(A00(0, 14, 10), A00(53, 5, 86));
    }

    @Override // com.facebook.ads.redexgen.X.QV
    public final byte[] ADw(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                byteArrayOutputStream.flush();
                byte[] data = byteArrayOutputStream.toByteArray();
                return data;
            } else if (A02[4].length() != 19) {
                throw new RuntimeException();
            } else {
                String[] strArr = A02;
                strArr[2] = "eO7qbggyddGiOQuVn8N8jDULGwym82oB";
                strArr[6] = "iN6CFd4LV6hdOWp44ZZbGtT2nODAuDvC";
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.QV
    public final void AGA(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(bArr);
    }
}
