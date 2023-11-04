package cz.msebera.android.httpclient.impl.client.cache;

import cz.msebera.android.httpclient.client.cache.HttpCacheInvalidator;
import cz.msebera.android.httpclient.client.cache.HttpCacheStorage;
import cz.msebera.android.httpclient.client.cache.ResourceFactory;
import cz.msebera.android.httpclient.impl.client.HttpClientBuilder;
import java.io.File;

/* loaded from: classes2.dex */
public class CachingHttpClientBuilder extends HttpClientBuilder {
    private CacheConfig cacheConfig;
    private File cacheDir;
    private boolean deleteCache = true;
    private HttpCacheInvalidator httpCacheInvalidator;
    private ResourceFactory resourceFactory;
    private SchedulingStrategy schedulingStrategy;
    private HttpCacheStorage storage;

    public static CachingHttpClientBuilder create() {
        return new CachingHttpClientBuilder();
    }

    protected CachingHttpClientBuilder() {
    }

    public final CachingHttpClientBuilder setResourceFactory(ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
        return this;
    }

    public final CachingHttpClientBuilder setHttpCacheStorage(HttpCacheStorage httpCacheStorage) {
        this.storage = httpCacheStorage;
        return this;
    }

    public final CachingHttpClientBuilder setCacheDir(File file) {
        this.cacheDir = file;
        return this;
    }

    public final CachingHttpClientBuilder setCacheConfig(CacheConfig cacheConfig) {
        this.cacheConfig = cacheConfig;
        return this;
    }

    public final CachingHttpClientBuilder setSchedulingStrategy(SchedulingStrategy schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
        return this;
    }

    public final CachingHttpClientBuilder setHttpCacheInvalidator(HttpCacheInvalidator httpCacheInvalidator) {
        this.httpCacheInvalidator = httpCacheInvalidator;
        return this;
    }

    public CachingHttpClientBuilder setDeleteCache(boolean z) {
        this.deleteCache = z;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004d  */
    @Override // cz.msebera.android.httpclient.impl.client.HttpClientBuilder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected cz.msebera.android.httpclient.impl.execchain.ClientExecChain decorateMainExec(cz.msebera.android.httpclient.impl.execchain.ClientExecChain r11) {
        /*
            r10 = this;
            cz.msebera.android.httpclient.impl.client.cache.CacheConfig r0 = r10.cacheConfig
            if (r0 == 0) goto L5
            goto L7
        L5:
            cz.msebera.android.httpclient.impl.client.cache.CacheConfig r0 = cz.msebera.android.httpclient.impl.client.cache.CacheConfig.DEFAULT
        L7:
            cz.msebera.android.httpclient.client.cache.ResourceFactory r1 = r10.resourceFactory
            if (r1 != 0) goto L1b
            java.io.File r1 = r10.cacheDir
            if (r1 != 0) goto L15
            cz.msebera.android.httpclient.impl.client.cache.HeapResourceFactory r1 = new cz.msebera.android.httpclient.impl.client.cache.HeapResourceFactory
            r1.<init>()
            goto L1b
        L15:
            cz.msebera.android.httpclient.impl.client.cache.FileResourceFactory r2 = new cz.msebera.android.httpclient.impl.client.cache.FileResourceFactory
            r2.<init>(r1)
            goto L1c
        L1b:
            r2 = r1
        L1c:
            cz.msebera.android.httpclient.client.cache.HttpCacheStorage r1 = r10.storage
            if (r1 != 0) goto L3f
            java.io.File r1 = r10.cacheDir
            if (r1 != 0) goto L2a
            cz.msebera.android.httpclient.impl.client.cache.BasicHttpCacheStorage r1 = new cz.msebera.android.httpclient.impl.client.cache.BasicHttpCacheStorage
            r1.<init>(r0)
            goto L3f
        L2a:
            cz.msebera.android.httpclient.impl.client.cache.ManagedHttpCacheStorage r1 = new cz.msebera.android.httpclient.impl.client.cache.ManagedHttpCacheStorage
            r1.<init>(r0)
            boolean r3 = r10.deleteCache
            if (r3 == 0) goto L3c
            cz.msebera.android.httpclient.impl.client.cache.CachingHttpClientBuilder$1 r3 = new cz.msebera.android.httpclient.impl.client.cache.CachingHttpClientBuilder$1
            r3.<init>()
            r10.addCloseable(r3)
            goto L3f
        L3c:
            r10.addCloseable(r1)
        L3f:
            r3 = r1
            cz.msebera.android.httpclient.impl.client.cache.AsynchronousValidator r7 = r10.createAsynchronousRevalidator(r0)
            cz.msebera.android.httpclient.impl.client.cache.CacheKeyGenerator r5 = new cz.msebera.android.httpclient.impl.client.cache.CacheKeyGenerator
            r5.<init>()
            cz.msebera.android.httpclient.client.cache.HttpCacheInvalidator r1 = r10.httpCacheInvalidator
            if (r1 != 0) goto L52
            cz.msebera.android.httpclient.impl.client.cache.CacheInvalidator r1 = new cz.msebera.android.httpclient.impl.client.cache.CacheInvalidator
            r1.<init>(r5, r3)
        L52:
            r6 = r1
            cz.msebera.android.httpclient.impl.client.cache.CachingExec r8 = new cz.msebera.android.httpclient.impl.client.cache.CachingExec
            cz.msebera.android.httpclient.impl.client.cache.BasicHttpCache r9 = new cz.msebera.android.httpclient.impl.client.cache.BasicHttpCache
            r1 = r9
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r8.<init>(r11, r9, r0, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cz.msebera.android.httpclient.impl.client.cache.CachingHttpClientBuilder.decorateMainExec(cz.msebera.android.httpclient.impl.execchain.ClientExecChain):cz.msebera.android.httpclient.impl.execchain.ClientExecChain");
    }

    private AsynchronousValidator createAsynchronousRevalidator(CacheConfig cacheConfig) {
        if (cacheConfig.getAsynchronousWorkersMax() > 0) {
            AsynchronousValidator asynchronousValidator = new AsynchronousValidator(createSchedulingStrategy(cacheConfig));
            addCloseable(asynchronousValidator);
            return asynchronousValidator;
        }
        return null;
    }

    private SchedulingStrategy createSchedulingStrategy(CacheConfig cacheConfig) {
        SchedulingStrategy schedulingStrategy = this.schedulingStrategy;
        return schedulingStrategy != null ? schedulingStrategy : new ImmediateSchedulingStrategy(cacheConfig);
    }
}
