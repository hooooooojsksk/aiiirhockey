package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class x {
    public final ExecutorService a;
    public b<? extends c> b;
    public IOException c;

    /* loaded from: classes.dex */
    public interface a<T extends c> {
        int a(T t, long j, long j2, IOException iOException);

        void a(T t, long j, long j2);

        void a(T t, long j, long j2, boolean z);
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a();

        void b();

        void load() throws IOException, InterruptedException;
    }

    /* loaded from: classes.dex */
    public static final class d extends IOException {
        public d(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public x(String str) {
        this.a = com.fyber.inneractive.sdk.player.exoplayer2.util.u.b(str);
    }

    public <T extends c> long a(T t, a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new b(myLooper, t, aVar, i, elapsedRealtime).a(0L);
        return elapsedRealtime;
    }

    public boolean b() {
        return this.b != null;
    }

    public void c() throws IOException {
        IOException iOException = this.c;
        if (iOException == null) {
            b<? extends c> bVar = this.b;
            if (bVar != null) {
                int i = bVar.c;
                IOException iOException2 = bVar.e;
                if (iOException2 != null && bVar.f > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public void d() {
        b<? extends c> bVar = this.b;
        if (bVar != null) {
            bVar.a(true);
        }
        this.a.shutdown();
    }

    public void a() {
        this.b.a(false);
    }

    /* loaded from: classes.dex */
    public final class b<T extends c> extends Handler implements Runnable {
        public final T a;
        public final a<T> b;
        public final int c;
        public final long d;
        public IOException e;
        public int f;
        public volatile Thread g;
        public volatile boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Looper looper, T t, a<T> aVar, int i, long j) {
            super(looper);
            x.this = r1;
            this.a = t;
            this.b = aVar;
            this.c = i;
            this.d = j;
        }

        public void a(long j) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(x.this.b == null);
            x xVar = x.this;
            xVar.b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
                return;
            }
            this.e = null;
            xVar.a.execute(this);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.h) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                this.e = null;
                x xVar = x.this;
                xVar.a.execute(xVar.b);
            } else if (i != 4) {
                x.this.b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.d;
                if (this.a.a()) {
                    this.b.a((a<T>) this.a, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    this.b.a((a<T>) this.a, elapsedRealtime, j, false);
                } else if (i2 == 2) {
                    this.b.a(this.a, elapsedRealtime, j);
                } else if (i2 != 3) {
                } else {
                    IOException iOException = (IOException) message.obj;
                    this.e = iOException;
                    int a = this.b.a((a<T>) this.a, elapsedRealtime, j, iOException);
                    if (a == 3) {
                        x.this.c = this.e;
                    } else if (a != 2) {
                        int i3 = a == 1 ? 1 : this.f + 1;
                        this.f = i3;
                        a(Math.min((i3 - 1) * 1000, 5000));
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.g = Thread.currentThread();
                if (!this.a.a()) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.s.a("load:" + this.a.getClass().getSimpleName());
                    try {
                        this.a.load();
                        com.fyber.inneractive.sdk.player.exoplayer2.util.s.a();
                    } catch (Throwable th) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.s.a();
                        throw th;
                    }
                }
                if (this.h) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e) {
                if (this.h) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (OutOfMemoryError e2) {
                Log.e("LoadTask", "OutOfMemory error loading stream", e2);
                if (this.h) {
                    return;
                }
                obtainMessage(3, new d(e2)).sendToTarget();
            } catch (Error e3) {
                Log.e("LoadTask", "Unexpected error loading stream", e3);
                if (!this.h) {
                    obtainMessage(4, e3).sendToTarget();
                }
                throw e3;
            } catch (InterruptedException unused) {
                com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.a.a());
                if (this.h) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (Exception e4) {
                Log.e("LoadTask", "Unexpected exception loading stream", e4);
                if (this.h) {
                    return;
                }
                obtainMessage(3, new d(e4)).sendToTarget();
            }
        }

        public void a(boolean z) {
            this.h = z;
            this.e = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.a.b();
                if (this.g != null) {
                    this.g.interrupt();
                }
            }
            if (z) {
                x.this.b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.b.a((a<T>) this.a, elapsedRealtime, elapsedRealtime - this.d, true);
            }
        }
    }
}
