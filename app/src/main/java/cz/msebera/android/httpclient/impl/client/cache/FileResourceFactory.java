package cz.msebera.android.httpclient.impl.client.cache;

import cz.msebera.android.httpclient.client.cache.Resource;
import cz.msebera.android.httpclient.client.cache.ResourceFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public class FileResourceFactory implements ResourceFactory {
    private final File cacheDir;
    private final BasicIdGenerator idgen = new BasicIdGenerator();

    public FileResourceFactory(File file) {
        this.cacheDir = file;
    }

    private File generateUniqueCacheFile(String str) {
        StringBuilder sb = new StringBuilder();
        this.idgen.generate(sb);
        sb.append('.');
        int min = Math.min(str.length(), 100);
        for (int i = 0; i < min; i++) {
            char charAt = str.charAt(i);
            if (Character.isLetterOrDigit(charAt) || charAt == '.') {
                sb.append(charAt);
            } else {
                sb.append('-');
            }
        }
        return new File(this.cacheDir, sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0026, code lost:
        r10.reached();
     */
    @Override // cz.msebera.android.httpclient.client.cache.ResourceFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cz.msebera.android.httpclient.client.cache.Resource generate(java.lang.String r8, java.io.InputStream r9, cz.msebera.android.httpclient.client.cache.InputLimit r10) throws java.io.IOException {
        /*
            r7 = this;
            java.io.File r8 = r7.generateUniqueCacheFile(r8)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r8)
            r1 = 2048(0x800, float:2.87E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L32
            r2 = 0
        Lf:
            int r4 = r9.read(r1)     // Catch: java.lang.Throwable -> L32
            r5 = -1
            if (r4 == r5) goto L29
            r5 = 0
            r0.write(r1, r5, r4)     // Catch: java.lang.Throwable -> L32
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L32
            long r2 = r2 + r4
            if (r10 == 0) goto Lf
            long r4 = r10.getValue()     // Catch: java.lang.Throwable -> L32
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto Lf
            r10.reached()     // Catch: java.lang.Throwable -> L32
        L29:
            r0.close()
            cz.msebera.android.httpclient.impl.client.cache.FileResource r9 = new cz.msebera.android.httpclient.impl.client.cache.FileResource
            r9.<init>(r8)
            return r9
        L32:
            r8 = move-exception
            r0.close()
            goto L38
        L37:
            throw r8
        L38:
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: cz.msebera.android.httpclient.impl.client.cache.FileResourceFactory.generate(java.lang.String, java.io.InputStream, cz.msebera.android.httpclient.client.cache.InputLimit):cz.msebera.android.httpclient.client.cache.Resource");
    }

    @Override // cz.msebera.android.httpclient.client.cache.ResourceFactory
    public Resource copy(String str, Resource resource) throws IOException {
        File generateUniqueCacheFile = generateUniqueCacheFile(str);
        if (resource instanceof FileResource) {
            IOUtils.copyFile(((FileResource) resource).getFile(), generateUniqueCacheFile);
        } else {
            IOUtils.copyAndClose(resource.getInputStream(), new FileOutputStream(generateUniqueCacheFile));
        }
        return new FileResource(generateUniqueCacheFile);
    }
}
