package cz.msebera.android.httpclient.client;

import cz.msebera.android.httpclient.auth.AuthScope;
import cz.msebera.android.httpclient.auth.Credentials;

/* loaded from: classes2.dex */
public interface CredentialsProvider {
    void clear();

    Credentials getCredentials(AuthScope authScope);

    void setCredentials(AuthScope authScope, Credentials credentials);
}
