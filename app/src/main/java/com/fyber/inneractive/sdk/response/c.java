package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.util.b0;
import com.fyber.inneractive.sdk.util.l;
import java.io.IOException;

/* loaded from: classes.dex */
public class c extends b {
    @Override // com.fyber.inneractive.sdk.response.b
    public void a(String str, a0 a0Var) throws IOException {
        f fVar = (f) this.a;
        String a = str == null ? null : b0.g.a(str);
        int i = com.fyber.inneractive.sdk.config.f.a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.assetResponse");
        if (!TextUtils.isEmpty(property)) {
            String c = l.c(property);
            if (!TextUtils.isEmpty(c)) {
                a = c;
            }
        }
        fVar.I = a;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public boolean b() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public e a() {
        f fVar = new f();
        this.a = fVar;
        return fVar;
    }
}
