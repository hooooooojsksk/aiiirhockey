package cz.msebera.android.httpclient;

import java.net.InetAddress;

/* loaded from: classes2.dex */
public interface HttpInetConnection extends HttpConnection {
    InetAddress getLocalAddress();

    int getLocalPort();

    InetAddress getRemoteAddress();

    int getRemotePort();
}
