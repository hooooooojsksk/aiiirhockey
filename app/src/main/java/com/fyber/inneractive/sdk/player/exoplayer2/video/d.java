package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.WindowManager;
import com.fyber.inneractive.sdk.config.IAConfigManager;

/* loaded from: classes.dex */
public final class d {
    public final a a;
    public final long b;
    public final long c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public long h;
    public long i;
    public long j;

    /* loaded from: classes.dex */
    public static final class a implements Choreographer.FrameCallback, Handler.Callback {
        public static final a e = new a();
        public volatile long a;
        public final Handler b;
        public Choreographer c;
        public int d;

        public a() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.b = handler;
            handler.sendEmptyMessage(0);
        }

        public static a a() {
            return e;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.a = j;
            this.c.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.c = Choreographer.getInstance();
                return true;
            } else if (i == 1) {
                int i2 = this.d + 1;
                this.d = i2;
                if (i2 == 1) {
                    this.c.postFrameCallback(this);
                }
                return true;
            } else if (i != 2) {
                return false;
            } else {
                int i3 = this.d - 1;
                this.d = i3;
                if (i3 == 0) {
                    this.c.removeFrameCallback(this);
                    this.a = 0L;
                }
                return true;
            }
        }
    }

    public d(Context context) {
        this(a(), true);
    }

    public final boolean a(long j, long j2) {
        return Math.abs((j2 - this.h) - (j - this.i)) > 20000000;
    }

    public d(double d, boolean z) {
        if (z) {
            this.a = a.a();
            long j = (long) (1.0E9d / d);
            this.b = j;
            this.c = (j * 80) / 100;
            return;
        }
        this.a = null;
        this.b = -1L;
        this.c = -1L;
    }

    public static float a() {
        return ((WindowManager) IAConfigManager.M.v.a().getSystemService("window")).getDefaultDisplay().getRefreshRate();
    }
}
