package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public class t<ResultData> {
    public final Context a;
    public com.fyber.inneractive.sdk.cache.a<ResultData> b;
    public SharedPreferences c;

    /* loaded from: classes.dex */
    public static class a extends Exception {
    }

    public t(Context context, com.fyber.inneractive.sdk.cache.a<ResultData> aVar) {
        this.a = context;
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    public boolean a(String str, String str2) {
        boolean z;
        int i = 1;
        IAlog.a("caching file %s", str);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                fileOutputStream = this.a.openFileOutput(str, 0);
                fileOutputStream.write(str2.getBytes());
                try {
                    IAlog.a("File cached successfully", new Object[0]);
                    try {
                        fileOutputStream.close();
                        return true;
                    } catch (Exception e) {
                        IAlog.e("Failed closing cache file: %s", e.getMessage());
                        return true;
                    }
                } catch (Exception e2) {
                    e = e2;
                    z = true;
                    IAlog.e("Failed caching file: %s", e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e3) {
                            IAlog.e("Failed closing cache file: %s", e3.getMessage());
                        }
                    }
                    i = z;
                    return i;
                }
            } catch (Exception e4) {
                e = e4;
                z = false;
            }
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e5) {
                    Object[] objArr = new Object[i];
                    objArr[0] = e5.getMessage();
                    IAlog.e("Failed closing cache file: %s", objArr);
                }
            }
            throw th;
        }
    }

    public final String a(String str) throws FileNotFoundException {
        FileInputStream fileInputStream;
        IAlog.a("reading local file: %s", str);
        FileInputStream fileInputStream2 = null;
        r2 = null;
        r2 = null;
        String str2 = null;
        try {
            fileInputStream = this.a.openFileInput(str);
        } catch (Exception e) {
            e = e;
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                String str3 = new String(bArr, "UTF-8");
                try {
                    fileInputStream.close();
                } catch (Exception e2) {
                    IAlog.e("Failed closing local file: %s", e2.getMessage());
                }
                str2 = str3;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception e3) {
                        IAlog.e("Failed closing local file: %s", e3.getMessage());
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            if (!(e instanceof FileNotFoundException)) {
                IAlog.a("Failed reading local file: %s", e.getMessage());
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception e5) {
                        IAlog.e("Failed closing local file: %s", e5.getMessage());
                    }
                }
                IAlog.a("local file %s read successfully", str);
                return str2;
            }
            throw new FileNotFoundException();
        }
        IAlog.a("local file %s read successfully", str);
        return str2;
    }
}
