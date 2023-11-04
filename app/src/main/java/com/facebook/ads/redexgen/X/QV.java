package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;

/* loaded from: assets/audience_network.dex */
public interface QV {
    boolean AAy(QT qt);

    HttpURLConnection ADI(String str, @Nullable Proxy proxy) throws IOException;

    InputStream ADJ(HttpURLConnection httpURLConnection) throws IOException;

    OutputStream ADK(HttpURLConnection httpURLConnection) throws IOException;

    void ADa(HttpURLConnection httpURLConnection, QR qr, String str) throws IOException;

    byte[] ADw(InputStream inputStream) throws IOException;

    void AGA(OutputStream outputStream, byte[] bArr) throws IOException;
}
