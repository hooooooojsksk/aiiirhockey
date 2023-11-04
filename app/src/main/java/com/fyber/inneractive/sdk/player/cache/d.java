package com.fyber.inneractive.sdk.player.cache;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.r;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.player.cache.h;
import com.fyber.inneractive.sdk.util.i0;
import com.fyber.inneractive.sdk.util.q;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class d implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.g {
    public com.fyber.inneractive.sdk.player.cache.a b;
    public h c;
    public Uri d;
    public FileInputStream f;
    public FileInputStream g;
    public b h;
    public c i;
    public int j;
    public s k;
    public boolean a = false;
    public long e = 0;

    /* loaded from: classes.dex */
    public class a implements h.i {
        public final /* synthetic */ com.fyber.inneractive.sdk.util.f a;
        public final /* synthetic */ AtomicReference b;
        public final /* synthetic */ CountDownLatch c;

        public a(com.fyber.inneractive.sdk.util.f fVar, AtomicReference atomicReference, CountDownLatch countDownLatch) {
            d.this = r1;
            this.a = fVar;
            this.b = atomicReference;
            this.c = countDownLatch;
        }

        public void a(h hVar, com.fyber.inneractive.sdk.player.cache.a aVar, Exception exc) {
            b bVar;
            d dVar = d.this;
            if (!dVar.a) {
                if (exc == null) {
                    Bitmap bitmap = this.a.b;
                    if (bitmap != null && (bVar = dVar.h) != null) {
                        ((com.fyber.inneractive.sdk.player.controller.d) bVar).C = bitmap;
                    }
                    dVar.b = aVar;
                } else {
                    this.b.set(exc);
                }
            }
            this.c.countDown();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar) throws IOException {
        String valueOf;
        com.fyber.inneractive.sdk.player.cache.b jVar2;
        r.d dVar;
        if (this.b == null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            AtomicReference atomicReference = new AtomicReference();
            com.fyber.inneractive.sdk.util.f fVar = new com.fyber.inneractive.sdk.util.f();
            Uri uri = jVar.a;
            this.d = uri;
            n nVar = n.f;
            int i = this.j;
            String uri2 = uri.toString();
            s sVar = this.k;
            a aVar = new a(fVar, atomicReference, countDownLatch);
            com.fyber.inneractive.sdk.player.cache.c cVar = nVar.b;
            boolean a2 = IAConfigManager.M.u.b.a("validateHasVideoTracks", false);
            r rVar = sVar == null ? null : (r) sVar.a(r.class);
            if (rVar != null) {
                int[] iArr = h.d.a;
                r.d dVar2 = r.d.LEGACY;
                String a3 = rVar.a("v_type", dVar2.key);
                r.d[] values = r.d.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        dVar = dVar2;
                        break;
                    }
                    int i3 = length;
                    r.d dVar3 = values[i2];
                    r.d[] dVarArr = values;
                    if (TextUtils.equals(dVar3.key, a3.toLowerCase(Locale.US))) {
                        dVar = dVar3;
                        break;
                    }
                    i2++;
                    length = i3;
                    values = dVarArr;
                }
                int i4 = iArr[dVar.ordinal()];
                if (i4 == 1) {
                    jVar2 = new k();
                } else if (i4 != 2) {
                    jVar2 = new j(a2);
                } else {
                    jVar2 = new i();
                }
            } else {
                jVar2 = new j(a2);
            }
            h hVar = new h(cVar, uri2, jVar2, i, sVar);
            hVar.g = aVar;
            nVar.d.add(hVar.a());
            this.c = hVar;
            hVar.q = fVar;
            hVar.o = true;
            HandlerThread handlerThread = hVar.i;
            if (handlerThread != null) {
                handlerThread.start();
                i0 i0Var = new i0(hVar.i.getLooper(), hVar);
                hVar.j = i0Var;
                i0Var.post(new f(hVar));
            }
            c cVar2 = this.i;
            if (cVar2 != null) {
                ((com.fyber.inneractive.sdk.player.controller.d) cVar2).F.add(this.c);
            }
            try {
                countDownLatch.await(7L, TimeUnit.SECONDS);
                if (this.b == null) {
                    if (atomicReference.get() == null) {
                        throw new IOException("Cache has failed to download");
                    }
                    throw new IOException((Throwable) atomicReference.get());
                }
            } catch (InterruptedException e) {
                h hVar2 = this.c;
                hVar2.a(hVar2.o);
                throw new IOException(e);
            }
        }
        this.e = jVar.d;
        com.fyber.inneractive.sdk.player.cache.a aVar2 = this.b;
        if (aVar2.c) {
            valueOf = aVar2.e.get("http.file.length");
        } else {
            valueOf = String.valueOf(aVar2.a().length());
        }
        if (valueOf == null || !TextUtils.isDigitsOnly(valueOf)) {
            return -1L;
        }
        return Long.parseLong(valueOf);
    }

    public final int b(byte[] bArr, int i, int i2) throws IOException {
        InputStream inputStream;
        InputStream inputStream2;
        InputStream inputStream3;
        HttpURLConnection httpURLConnection;
        String str = this.b.b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        int i3 = (int) this.e;
        ByteBuffer b2 = com.fyber.inneractive.sdk.util.d.b.b();
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (IOException e) {
            e = e;
            inputStream2 = null;
        } catch (Throwable unused) {
            inputStream = null;
        }
        try {
            httpURLConnection.setRequestProperty("Range", String.format(Locale.ENGLISH, "bytes=%d-", Integer.valueOf(i3)));
            httpURLConnection.connect();
        } catch (IOException e2) {
            e = e2;
            inputStream2 = null;
            httpURLConnection2 = httpURLConnection;
            try {
                throw e;
            } catch (Throwable th) {
                if (httpURLConnection2 != null) {
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception unused2) {
                    }
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable unused4) {
            httpURLConnection2 = httpURLConnection;
            inputStream = null;
            if (httpURLConnection2 != null) {
                try {
                    httpURLConnection2.disconnect();
                } catch (Exception unused5) {
                }
            }
            if (inputStream != null) {
                inputStream3 = inputStream;
                try {
                    inputStream3.close();
                } catch (Exception unused6) {
                }
            }
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr, i, i2);
            return i2;
        }
        if (httpURLConnection.getResponseCode() == 206) {
            inputStream3 = httpURLConnection.getInputStream();
            byte[] array = b2.array();
            while (inputStream3.read(array) != -1) {
                byteArrayOutputStream.write(array);
            }
            inputStream3.close();
            httpURLConnection.disconnect();
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused7) {
            }
            inputStream3.close();
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr, i, i2);
            return i2;
        }
        throw new IOException("Server did not reply with proper range.");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public void close() throws IOException {
        this.a = true;
        this.e = 0L;
        q.b(this.f);
        q.b(this.g);
        this.f = null;
        this.g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0083 A[Catch: all -> 0x00b6, TryCatch #0 {, blocks: (B:67:0x000c, B:69:0x0019, B:70:0x001d, B:72:0x001f, B:78:0x002f, B:79:0x0032, B:81:0x003f, B:82:0x0044, B:83:0x0045, B:85:0x0049, B:90:0x007f, B:92:0x0083, B:93:0x0085, B:96:0x008d, B:99:0x0098, B:100:0x009f, B:101:0x00a0, B:102:0x00ae, B:87:0x0058, B:89:0x005c), top: B:110:0x000c, inners: #1 }] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(byte[] r10, int r11, int r12) throws java.io.IOException {
        /*
            r9 = this;
            com.fyber.inneractive.sdk.player.cache.a r0 = r9.b
            if (r0 != 0) goto L6
            r10 = -1
            return r10
        L6:
            if (r12 != 0) goto L9
            return r12
        L9:
            java.lang.Object r0 = r0.d
            monitor-enter(r0)
            com.fyber.inneractive.sdk.player.cache.a r1 = r9.b     // Catch: java.lang.Throwable -> Lb6
            java.io.File r1 = r1.a()     // Catch: java.lang.Throwable -> Lb6
            long r1 = r1.length()     // Catch: java.lang.Throwable -> Lb6
            int r2 = (int) r1     // Catch: java.lang.Throwable -> Lb6
            if (r11 <= r2) goto L1f
            int r10 = r9.b(r10, r11, r12)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            return r10
        L1f:
            com.fyber.inneractive.sdk.player.cache.a r1 = r9.b     // Catch: java.lang.Throwable -> Lb6
            boolean r1 = r1.c     // Catch: java.lang.Throwable -> Lb6
            r3 = 0
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L58
        L29:
            int r1 = r2 - r11
            if (r1 > 0) goto L45
            r1 = 50
            r9.wait(r3, r1)     // Catch: java.lang.InterruptedException -> L3e java.lang.Throwable -> Lb6
            com.fyber.inneractive.sdk.player.cache.a r1 = r9.b     // Catch: java.lang.Throwable -> Lb6
            java.io.File r1 = r1.a()     // Catch: java.lang.Throwable -> Lb6
            long r1 = r1.length()     // Catch: java.lang.Throwable -> Lb6
            int r2 = (int) r1     // Catch: java.lang.Throwable -> Lb6
            goto L29
        L3e:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> Lb6
            r11.<init>(r10)     // Catch: java.lang.Throwable -> Lb6
            throw r11     // Catch: java.lang.Throwable -> Lb6
        L45:
            java.io.FileInputStream r1 = r9.g     // Catch: java.lang.Throwable -> Lb6
            if (r1 != 0) goto L7f
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lb6
            com.fyber.inneractive.sdk.player.cache.a r5 = r9.b     // Catch: java.lang.Throwable -> Lb6
            java.io.File r5 = r5.a()     // Catch: java.lang.Throwable -> Lb6
            r1.<init>(r5)     // Catch: java.lang.Throwable -> Lb6
            r9.g = r1     // Catch: java.lang.Throwable -> Lb6
        L56:
            r5 = 1
            goto L7f
        L58:
            java.io.FileInputStream r1 = r9.f     // Catch: java.lang.Throwable -> Lb6
            if (r1 != 0) goto L7f
            java.lang.String r1 = "%s creating a single instance of fis"
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> Lb6
            r7[r5] = r8     // Catch: java.lang.Throwable -> Lb6
            com.fyber.inneractive.sdk.util.IAlog.a(r1, r7)     // Catch: java.lang.Throwable -> Lb6
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lb6
            com.fyber.inneractive.sdk.player.cache.a r5 = r9.b     // Catch: java.lang.Throwable -> Lb6
            java.io.File r5 = r5.a()     // Catch: java.lang.Throwable -> Lb6
            r1.<init>(r5)     // Catch: java.lang.Throwable -> Lb6
            r9.f = r1     // Catch: java.lang.Throwable -> Lb6
            java.io.FileInputStream r1 = r9.g     // Catch: java.lang.Throwable -> Lb6
            com.fyber.inneractive.sdk.util.q.b(r1)     // Catch: java.lang.Throwable -> Lb6
            r1 = 0
            r9.g = r1     // Catch: java.lang.Throwable -> Lb6
            goto L56
        L7f:
            java.io.FileInputStream r1 = r9.f     // Catch: java.lang.Throwable -> Lb6
            if (r1 != 0) goto L85
            java.io.FileInputStream r1 = r9.g     // Catch: java.lang.Throwable -> Lb6
        L85:
            long r6 = r9.e     // Catch: java.lang.Throwable -> Lb6
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 <= 0) goto La0
            if (r5 == 0) goto La0
            long r3 = r1.skip(r6)     // Catch: java.lang.Throwable -> Lb6
            long r5 = r9.e     // Catch: java.lang.Throwable -> Lb6
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L98
            goto La0
        L98:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r11 = "Failed to skip the stream"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> Lb6
            throw r10     // Catch: java.lang.Throwable -> Lb6
        La0:
            int r2 = r2 - r11
            int r3 = r10.length     // Catch: java.lang.Throwable -> Lb6
            int r2 = java.lang.Math.min(r3, r2)     // Catch: java.lang.Throwable -> Lb6
            int r12 = java.lang.Math.min(r2, r12)     // Catch: java.lang.Throwable -> Lb6
            int r10 = r1.read(r10, r11, r12)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            long r11 = r9.e
            long r0 = (long) r10
            long r11 = r11 + r0
            r9.e = r11
            return r10
        Lb6:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            goto Lba
        Lb9:
            throw r10
        Lba:
            goto Lb9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.d.a(byte[], int, int):int");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public Uri a() {
        return this.d;
    }
}
