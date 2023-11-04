package com.fyber.inneractive.sdk.player.cache;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.r;
import com.fyber.inneractive.sdk.player.cache.c;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.p;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class n implements c.e {
    public static final n f = new n();
    public Context a;
    public c b;
    public boolean c = false;
    public final List<String> d = new CopyOnWriteArrayList();
    public final Runnable e = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            n.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            long j;
            File a = n.a(n.this.a, "fyb.vamp.vid.cache");
            if (a != null) {
                try {
                    IAlog.a("VideoCache opening the cache in directory - %s", a);
                    n.this.b = c.a(a, 0, 1, 52428800L);
                    c cVar = n.this.b;
                    cVar.getClass();
                    IAlog.d("DiskLruCache delete cache", new Object[0]);
                    cVar.close();
                    m.a(cVar.a);
                    n.this.b = c.a(a, 0, 1, 52428800L);
                    Object[] objArr = new Object[2];
                    objArr[0] = a;
                    c cVar2 = n.this.b;
                    synchronized (cVar2) {
                        j = cVar2.h;
                    }
                    objArr[1] = Long.valueOf(j);
                    IAlog.a("VideoCache opened the cache in directory - %s current size is %d", objArr);
                    n nVar = n.this;
                    nVar.b.l = nVar;
                    nVar.c = true;
                    n.this.getClass();
                } catch (Throwable th) {
                    r.a("Failed to open cache directory", th.getMessage(), null, null);
                    IAlog.a("Failed to open cache directory", th, new Object[0]);
                }
            }
        }
    }

    public static File a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        boolean z = true;
        if (com.fyber.inneractive.sdk.util.l.a != null && com.fyber.inneractive.sdk.util.l.b("android.permission.WRITE_EXTERNAL_STORAGE") && "mounted".equals(com.fyber.inneractive.sdk.util.l.b())) {
            String b = com.fyber.inneractive.sdk.util.l.b();
            if ("mounted".equals(b) || "mounted_ro".equals(b)) {
                File externalCacheDir = context.getExternalCacheDir();
                if (externalCacheDir != null && externalCacheDir.getFreeSpace() > 52428800) {
                    return new File(context.getExternalCacheDir(), str);
                }
            }
        }
        File cacheDir = context.getCacheDir();
        if ((cacheDir == null || cacheDir.getFreeSpace() <= 52428800) ? false : false) {
            return new File(context.getCacheDir(), str);
        }
        return null;
    }

    public boolean a() {
        return this.c && p.a();
    }

    public boolean a(c cVar, String str) {
        for (String str2 : this.d) {
            if (str2.equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }
}
