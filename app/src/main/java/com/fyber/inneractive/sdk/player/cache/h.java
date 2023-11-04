package com.fyber.inneractive.sdk.player.cache;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.webkit.MimeTypeMap;
import com.fyber.inneractive.sdk.config.global.features.r;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.player.cache.b;
import com.fyber.inneractive.sdk.player.cache.c;
import com.fyber.inneractive.sdk.player.cache.d;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.j0;
import com.fyber.inneractive.sdk.util.q;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.UByte;

/* loaded from: classes.dex */
public class h implements j0 {
    public com.fyber.inneractive.sdk.player.cache.c b;
    public c.f c;
    public com.fyber.inneractive.sdk.player.cache.b d;
    public final String e;
    public com.fyber.inneractive.sdk.player.cache.a f;
    public i g;
    public f h;
    public Handler j;
    public String l;
    public InterfaceC0027h q;
    public final s r;
    public String a = "MediaDownloader-" + hashCode();
    public final Object k = new Object();
    public volatile boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public String p = null;
    public HandlerThread i = new HandlerThread(String.format("MediaDownloader-%s-A", a()));

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            h.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            i iVar = hVar.g;
            if (iVar != null) {
                ((d.a) iVar).a(hVar, hVar.f, null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ Exception a;

        public b(Exception exc) {
            h.this = r1;
            this.a = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            i iVar = hVar.g;
            if (iVar != null) {
                ((d.a) iVar).a(hVar, hVar.f, this.a);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
            h.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.a(false);
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[r.d.values().length];
            a = iArr;
            try {
                iArr[r.d.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[r.d.EXTRACTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[r.d.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e extends Exception {
        public e(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public class f extends Thread {
        public AtomicBoolean a;
        public InputStream b;
        public boolean c;
        public boolean d;
        public long e;
        public long f;
        public c.C0026c g;
        public int h;
        public int i;
        public int j;
        public int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, int i) {
            super(str);
            h.this = r3;
            this.a = new AtomicBoolean(false);
            this.c = false;
            this.d = false;
            this.e = -1L;
            this.f = 0L;
            this.h = i;
            this.i = r3.r != null ? ((r) r3.r.a(r.class)).d() : 10;
            this.j = r3.r != null ? ((r) r3.r.a(r.class)).e() : HttpStatus.SC_INTERNAL_SERVER_ERROR;
            this.k = r3.r != null ? ((r) r3.r.a(r.class)).g() : 25;
        }

        /* JADX WARN: Removed duplicated region for block: B:135:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x01dd A[EDGE_INSN: B:169:0x01dd->B:164:0x01dd ?: BREAK  , SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.net.HttpURLConnection a(java.io.OutputStream r23, java.net.URL r24, java.nio.ByteBuffer r25, long r26, int r28) throws java.io.IOException, com.fyber.inneractive.sdk.player.cache.h.e {
            /*
                Method dump skipped, instructions count: 516
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.h.f.a(java.io.OutputStream, java.net.URL, java.nio.ByteBuffer, long, int):java.net.HttpURLConnection");
        }

        /* JADX WARN: Finally extract failed */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            OutputStream outputStream;
            HttpURLConnection httpURLConnection;
            Handler handler;
            h hVar = h.this;
            IAlog.d("%s | Starting a fresh download for %s", hVar.a, hVar.a());
            ByteBuffer b = com.fyber.inneractive.sdk.util.d.b.b();
            try {
                try {
                    URL url = new URL(h.this.e);
                    h hVar2 = h.this;
                    IAlog.d("%s | opening an editor for %s", hVar2.a, hVar2.a());
                    h hVar3 = h.this;
                    c.C0026c a = hVar3.b.a(hVar3.a());
                    this.g = a;
                    outputStream = a.a(0);
                    try {
                        int i = this.i - 1;
                        httpURLConnection = null;
                        while (i > 0) {
                            try {
                                if (!this.a.compareAndSet(false, false)) {
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Throwable unused) {
                                    }
                                }
                                int i2 = i - 1;
                                long currentTimeMillis = System.currentTimeMillis();
                                try {
                                    httpURLConnection = a(outputStream, url, b, this.e, this.h);
                                } catch (g e) {
                                    throw e;
                                } catch (Throwable unused2) {
                                }
                                m.a(this.b);
                                IAlog.d("%s Downloaded %d out of %d for key %s", h.this.a, Long.valueOf(this.e), Long.valueOf(this.f), h.this.a());
                                if (this.e >= this.f) {
                                    i = 0;
                                } else {
                                    long j = this.j;
                                    if (System.currentTimeMillis() - currentTimeMillis < j) {
                                        Thread.sleep(j - (System.currentTimeMillis() - currentTimeMillis));
                                    }
                                    i = i2;
                                }
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    IAlog.a("%s | mDownloadRunnable exception raised during download", th, h.this.a);
                                    com.fyber.inneractive.sdk.network.r.a("mDownloadRunnable exception raised during download", th.getMessage(), null, null);
                                    try {
                                        this.g.a();
                                    } catch (Exception unused3) {
                                    }
                                    Handler handler2 = h.this.j;
                                    if (handler2 != null) {
                                        handler2.sendMessage(handler2.obtainMessage(1, th));
                                    }
                                    m.a(outputStream);
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    com.fyber.inneractive.sdk.util.d.b.a.offer(b);
                                } catch (Throwable th2) {
                                    m.a(outputStream);
                                    if (httpURLConnection != null) {
                                        try {
                                            httpURLConnection.disconnect();
                                        } catch (Throwable unused4) {
                                        }
                                    }
                                    com.fyber.inneractive.sdk.util.d.b.a.offer(b);
                                    throw th2;
                                }
                            }
                        }
                        synchronized (h.this.k) {
                            if (this.f <= this.e && !this.a.compareAndSet(true, true)) {
                                h hVar4 = h.this;
                                IAlog.d("%s | committing to cache - %s", hVar4.a, hVar4.a());
                                m.a(outputStream);
                                h hVar5 = h.this;
                                com.fyber.inneractive.sdk.player.cache.a aVar = hVar5.f;
                                if (aVar != null) {
                                    synchronized (aVar.d) {
                                        c.C0026c c0026c = this.g;
                                        if (c0026c.c) {
                                            com.fyber.inneractive.sdk.player.cache.c.a(com.fyber.inneractive.sdk.player.cache.c.this, c0026c, false);
                                            com.fyber.inneractive.sdk.player.cache.c.this.d(c0026c.a.a);
                                        } else {
                                            com.fyber.inneractive.sdk.player.cache.c.a(com.fyber.inneractive.sdk.player.cache.c.this, c0026c, true);
                                        }
                                        com.fyber.inneractive.sdk.player.cache.c cVar = h.this.b;
                                        synchronized (cVar) {
                                            cVar.a();
                                            cVar.f();
                                            cVar.i.flush();
                                        }
                                        h hVar6 = h.this;
                                        hVar6.f.a = hVar6.b.a(hVar6.a(), 0);
                                    }
                                    h.this.f.c = false;
                                } else {
                                    String a2 = hVar5.a();
                                    h hVar7 = h.this;
                                    hVar5.f = new com.fyber.inneractive.sdk.player.cache.a(a2, hVar7.e, hVar7.b.a(hVar7.a(), 0), true, h.this.l);
                                }
                            }
                            this.g.a();
                            h hVar8 = h.this;
                            hVar8.b.d(hVar8.a());
                            h hVar9 = h.this;
                            IAlog.d("%s | aborting cache - %s", hVar9.a, hVar9.a());
                        }
                        h.this.o = false;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (this.a.compareAndSet(false, false) && (handler = h.this.j) != null && this.e >= this.f) {
                            handler.sendEmptyMessage(2);
                        }
                        m.a(outputStream);
                    } catch (Throwable th3) {
                        th = th3;
                        httpURLConnection = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    outputStream = null;
                    httpURLConnection = null;
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable unused5) {
            }
            com.fyber.inneractive.sdk.util.d.b.a.offer(b);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends e {
        public g(String str) {
            super(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.h$h */
    /* loaded from: classes.dex */
    public interface InterfaceC0027h {
    }

    /* loaded from: classes.dex */
    public interface i {
    }

    public h(com.fyber.inneractive.sdk.player.cache.c cVar, String str, com.fyber.inneractive.sdk.player.cache.b bVar, int i2, s sVar) {
        this.b = cVar;
        this.e = str;
        this.l = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str).toLowerCase(Locale.US));
        this.d = bVar;
        this.r = sVar;
        this.h = new f(String.format("MediaDownloader-%s-A", a()), i2);
    }

    /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.isRegister()" because "arg" is null
        	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
        	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static /* synthetic */ boolean c(com.fyber.inneractive.sdk.player.cache.h r0, boolean r1) {
        /*
            r0.getClass()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.h.c(com.fyber.inneractive.sdk.player.cache.h, boolean):boolean");
    }

    public final void b() {
        com.fyber.inneractive.sdk.util.m.b.post(new a());
    }

    @Override // com.fyber.inneractive.sdk.util.j0
    public void handleMessage(Message message) {
        if (message.what == 4 && !this.f.f) {
            synchronized (this.k) {
                IAlog.d("%s | reading from cache 1 - %s", this.a, a());
                b.a a2 = this.d.a(this.f, this.l);
                if (a2 == b.a.INVALID) {
                    a(new e("Failed cache validation"));
                    a(true);
                } else if (a2 == b.a.PARTIAL_CANNOT_VALIDATE) {
                    this.m = true;
                } else {
                    this.f.f = true;
                    a(this.f);
                    this.f.e.putAll(this.d.a);
                    b();
                }
            }
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            Object obj = message.obj;
            if (obj instanceof Exception) {
                a((Exception) obj);
            } else {
                a(new e("download failed"));
            }
            a(false);
        } else if (i2 == 2) {
            if (this.m) {
                synchronized (this.k) {
                    IAlog.d("%s | reading from cache 2 - %s", this.a, a());
                    if (this.d.a(this.f, this.l) == b.a.INVALID) {
                        a(new e("Failed cache validation after downloading complete file"));
                        a(true);
                    } else {
                        a(this.f);
                        this.f.e.putAll(this.d.a);
                        b();
                    }
                }
            } else {
                com.fyber.inneractive.sdk.util.m.b.post(new c());
            }
            IAlog.d("%s | Download success for cache key %s", this.a, a());
        }
    }

    public static void b(h hVar, boolean z) {
        com.fyber.inneractive.sdk.player.cache.g gVar = new com.fyber.inneractive.sdk.player.cache.g(hVar);
        Handler handler = hVar.j;
        if (handler != null) {
            if (z) {
                handler.postAtFrontOfQueue(gVar);
            } else {
                handler.postDelayed(gVar, 4L);
            }
        }
    }

    public final void a(Exception exc) {
        com.fyber.inneractive.sdk.util.m.b.post(new b(exc));
    }

    public final void a(boolean z) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.a.compareAndSet(false, true);
            this.h = null;
        }
        HandlerThread handlerThread = this.i;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.j = null;
        if (z) {
            try {
                this.b.d(a());
            } catch (IOException e2) {
                IAlog.a("failed to remove cache key", e2, new Object[0]);
            }
        }
    }

    public String a() {
        String str = "";
        if (this.p == null) {
            String str2 = this.e;
            try {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(str2.getBytes());
                    byte[] digest = messageDigest.digest();
                    StringBuffer stringBuffer = new StringBuffer();
                    for (byte b2 : digest) {
                        stringBuffer.append(Integer.toHexString((b2 & UByte.MAX_VALUE) | 256).substring(1));
                    }
                    str = stringBuffer.toString();
                } catch (NullPointerException unused) {
                } catch (NoSuchAlgorithmException unused2) {
                    MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
                    messageDigest2.update(str2.getBytes());
                    byte[] digest2 = messageDigest2.digest();
                    StringBuffer stringBuffer2 = new StringBuffer();
                    for (byte b3 : digest2) {
                        stringBuffer2.append(Integer.toHexString((b3 & UByte.MAX_VALUE) | 256).substring(1));
                    }
                    str = stringBuffer2.toString();
                }
            } catch (NoSuchAlgorithmException unused3) {
                str = str2.replaceAll("\\W+", "");
            }
            this.p = str;
        }
        return this.p;
    }

    public final void a(com.fyber.inneractive.sdk.player.cache.a aVar) {
        InterfaceC0027h interfaceC0027h;
        if (aVar == null || (interfaceC0027h = this.q) == null) {
            return;
        }
        File a2 = aVar.a();
        File file = ((com.fyber.inneractive.sdk.util.f) interfaceC0027h).a;
        if ((file == null || a2 == null || !file.getAbsolutePath().equals(a2.getAbsolutePath())) ? false : true) {
            return;
        }
        InterfaceC0027h interfaceC0027h2 = this.q;
        File a3 = aVar.a();
        com.fyber.inneractive.sdk.util.f fVar = (com.fyber.inneractive.sdk.util.f) interfaceC0027h2;
        fVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    mediaMetadataRetriever.setDataSource(a3.getPath());
                    mediaMetadataRetriever.extractMetadata(8192);
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(1L);
                    fVar.b = frameAtTime;
                    if (frameAtTime != null && frameAtTime.getWidth() > 0 && fVar.b.getHeight() > 0) {
                        fVar.a = a3;
                    }
                    mediaMetadataRetriever.release();
                } catch (Exception e2) {
                    IAlog.a("Failed getting frame from video file%s", q.b(e2));
                    mediaMetadataRetriever.release();
                    IAlog.d("FirstFrameDownloadMediaProcessor processing finished in %dms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
            } catch (Throwable th) {
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable unused2) {
        }
    }
}
