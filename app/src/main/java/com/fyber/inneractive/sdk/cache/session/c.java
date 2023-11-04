package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.d;
import com.fyber.inneractive.sdk.cache.session.e;
import com.fyber.inneractive.sdk.util.l;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements Runnable {
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.a a;
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.b b;
    public final /* synthetic */ d c;

    public c(d dVar, com.fyber.inneractive.sdk.cache.session.enums.a aVar, com.fyber.inneractive.sdk.cache.session.enums.b bVar) {
        this.c = dVar;
        this.a = aVar;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.c.c) {
            com.fyber.inneractive.sdk.cache.session.enums.a aVar = this.a;
            if (aVar != com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION) {
                e eVar = this.c.a.a.get(this.b);
                if (eVar != null) {
                    int i = e.a.a[aVar.ordinal()];
                    if (i == 1) {
                        eVar.b++;
                    } else if (i == 2) {
                        eVar.c++;
                    } else if (i == 3) {
                        eVar.a++;
                    }
                }
            } else {
                this.c.a = new f();
            }
            JSONObject a = d.a(this.c);
            boolean z = false;
            try {
                z = l.a("session_details.json", l.a, a.toString().getBytes("UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
            d dVar = this.c;
            d.a aVar2 = dVar.e;
            if (aVar2 != null) {
                aVar2.a(dVar, z, a);
            }
        }
    }
}
