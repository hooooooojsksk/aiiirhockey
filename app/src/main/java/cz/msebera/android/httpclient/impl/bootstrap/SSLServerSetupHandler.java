package cz.msebera.android.httpclient.impl.bootstrap;

import javax.net.ssl.SSLException;
import javax.net.ssl.SSLServerSocket;

/* loaded from: classes2.dex */
public interface SSLServerSetupHandler {
    void initialize(SSLServerSocket sSLServerSocket) throws SSLException;
}
