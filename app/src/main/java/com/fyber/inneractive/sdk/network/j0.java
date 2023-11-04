package com.fyber.inneractive.sdk.network;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class j0 extends d0<a> {
    public final String i;

    /* loaded from: classes.dex */
    public static class a {
        public Bitmap a = null;
        public String b = null;

        public a(Bitmap bitmap, String str) {
        }
    }

    public j0(u<a> uVar, String str, com.fyber.inneractive.sdk.config.global.s sVar) {
        super(uVar, v.a().c(), sVar);
        this.i = str;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public String a() {
        return this.i;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public l0 g() {
        return l0.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public boolean l() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public x o() {
        return x.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public int r() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.fyber.inneractive.sdk.network.j0$a] */
    @Override // com.fyber.inneractive.sdk.network.a0
    public z a(j jVar, Map<String, List<String>> map, int i) throws Exception {
        boolean z;
        z zVar = new z();
        ?? aVar = new a(null, null);
        try {
            InputStream inputStream = jVar.c;
            if (inputStream != null) {
                List<String> list = map != null ? map.get("Content-Length") : null;
                int i2 = -1;
                int a2 = list != null ? com.fyber.inneractive.sdk.util.q.a(list.get(0), -1) : -1;
                AtomicInteger atomicInteger = new AtomicInteger(0);
                Bitmap decodeStream = atomicInteger.get() == a2 ? BitmapFactory.decodeStream(new com.fyber.inneractive.sdk.util.d0(inputStream, atomicInteger)) : null;
                try {
                    if (decodeStream != null) {
                        int width = decodeStream.getWidth();
                        int height = decodeStream.getHeight();
                        int i3 = width * height;
                        int[] iArr = new int[i3];
                        decodeStream.getPixels(iArr, 0, width, 0, 0, width, height);
                        int i4 = 0;
                        while (true) {
                            if (i4 >= i3) {
                                z = false;
                                break;
                            }
                            int i5 = iArr[i4];
                            if (i4 == 0) {
                                i2 = i5;
                            } else if (i5 != i2) {
                                z = true;
                                break;
                            }
                            i4++;
                        }
                        if (z) {
                            aVar.a = decodeStream;
                            Object[] objArr = new Object[1];
                            objArr[0] = this.i;
                            IAlog.a("SimpleImageLoader: Got a valid bitmap %s", objArr);
                        }
                    }
                    IAlog.a("SimpleImageLoader: Got an invalid bitmap", new Object[0]);
                    aVar.b = "Got an invalid bitmap";
                } catch (Exception e) {
                    e = e;
                    IAlog.c("SimpleImageLoader: Exception on load image %s %s", e.getMessage(), e.toString());
                    aVar.b = e.getMessage();
                    zVar.a = aVar;
                    return zVar;
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    IAlog.c("SimpleImageLoader: OutOfMemoryError on load image %s", e.getMessage());
                    Bitmap bitmap = aVar.a;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    aVar.b = e.getMessage();
                    zVar.a = aVar;
                    return zVar;
                }
            }
        } catch (Exception e3) {
            e = e3;
        } catch (OutOfMemoryError e4) {
            e = e4;
        }
        zVar.a = aVar;
        return zVar;
    }
}
