package com.fyber.inneractive.sdk.network;

import android.os.Environment;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class i0 extends d0<String> {
    public final String i;

    public i0(u<String> uVar, String str, com.fyber.inneractive.sdk.config.global.s sVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fyber.inneractive.sdk.network.a0
    public z a(j jVar, Map<String, List<String>> map, int i) throws Exception {
        FileOutputStream fileOutputStream;
        z zVar = new z();
        FileOutputStream fileOutputStream2 = null;
        T t = 0;
        FileOutputStream fileOutputStream3 = null;
        try {
            try {
                InputStream inputStream = jVar.c;
                File file = new File(Environment.getExternalStorageDirectory(), "Pictures");
                file.mkdirs();
                String a = a(URI.create(this.i), map);
                if (TextUtils.isEmpty(a)) {
                    fileOutputStream = null;
                } else {
                    File file2 = new File(file, a);
                    String file3 = file2.toString();
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        try {
                            com.fyber.inneractive.sdk.util.q.a(inputStream, fileOutputStream);
                            t = file3;
                        } catch (Throwable th) {
                            th = th;
                            com.fyber.inneractive.sdk.util.q.b(fileOutputStream);
                            throw th;
                        }
                    } catch (Exception unused) {
                        fileOutputStream2 = fileOutputStream;
                        IAlog.a("failed to download and save the image file.", new Object[0]);
                        fileOutputStream = fileOutputStream2;
                        com.fyber.inneractive.sdk.util.q.b(fileOutputStream);
                        return zVar;
                    }
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            zVar.a = t;
            com.fyber.inneractive.sdk.util.q.b(fileOutputStream);
            return zVar;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream3 = fileOutputStream;
            fileOutputStream = fileOutputStream3;
            com.fyber.inneractive.sdk.util.q.b(fileOutputStream);
            throw th;
        }
    }

    public final String a(URI uri, Map<String, List<String>> map) {
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        String name = new File(path).getName();
        List<String> list = map != null ? map.get("text/html") : null;
        String str = list != null ? list.get(0) : null;
        if (str != null) {
            for (String str2 : str.split(";")) {
                if (str2.contains("image/")) {
                    String str3 = "." + str2.split("/")[1];
                    if (name.endsWith(str3)) {
                        return name;
                    }
                    return name + str3;
                }
            }
            return name;
        }
        return name;
    }
}
