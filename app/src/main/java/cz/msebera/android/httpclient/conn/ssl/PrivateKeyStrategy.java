package cz.msebera.android.httpclient.conn.ssl;

import java.net.Socket;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public interface PrivateKeyStrategy {
    String chooseAlias(Map<String, PrivateKeyDetails> map, Socket socket);
}
