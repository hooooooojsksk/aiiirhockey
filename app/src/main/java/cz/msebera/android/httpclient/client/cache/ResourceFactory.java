package cz.msebera.android.httpclient.client.cache;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public interface ResourceFactory {
    Resource copy(String str, Resource resource) throws IOException;

    Resource generate(String str, InputStream inputStream, InputLimit inputLimit) throws IOException;
}
