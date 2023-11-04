package com.fyber.inneractive.sdk.renderers;

import android.graphics.Rect;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.util.i;

/* loaded from: classes.dex */
public class b {
    public final com.fyber.inneractive.sdk.response.e b;
    public final RelativeLayout c;
    public final c j;
    public float d = 0.0f;
    public int e = 1;
    public float f = 0.0f;
    public long g = 0;
    public boolean h = false;
    public boolean i = false;
    public final Runnable k = new a();
    public com.fyber.inneractive.sdk.util.i<Rect> a = new com.fyber.inneractive.sdk.util.i<>(4, new C0053b(this));

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            b.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.renderers.b$b */
    /* loaded from: classes.dex */
    public class C0053b implements i.a<Rect> {
        public C0053b(b bVar) {
        }

        @Override // com.fyber.inneractive.sdk.util.i.a
        public Rect a() {
            return new Rect();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    public b(com.fyber.inneractive.sdk.response.e eVar, RelativeLayout relativeLayout, c cVar) {
        this.b = eVar;
        this.c = relativeLayout;
        this.j = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.b.a():void");
    }

    public void b() {
        if (this.i || this.h || this.g == 0) {
            return;
        }
        this.g = 0L;
        this.h = true;
        a();
    }

    public void c() {
        this.h = false;
        com.fyber.inneractive.sdk.util.m.b.removeCallbacks(this.k);
    }
}
