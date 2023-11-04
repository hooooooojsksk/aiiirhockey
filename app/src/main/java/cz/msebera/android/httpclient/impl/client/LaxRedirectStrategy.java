package cz.msebera.android.httpclient.impl.client;

/* loaded from: classes2.dex */
public class LaxRedirectStrategy extends DefaultRedirectStrategy {
    private static final String[] REDIRECT_METHODS = {"GET", "POST", "HEAD"};

    @Override // cz.msebera.android.httpclient.impl.client.DefaultRedirectStrategy
    protected boolean isRedirectable(String str) {
        for (String str2 : REDIRECT_METHODS) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
