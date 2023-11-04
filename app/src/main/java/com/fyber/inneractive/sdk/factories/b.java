package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {
    public final HashMap<com.fyber.inneractive.sdk.response.a, InterfaceC0016b> a = new HashMap<>();

    /* loaded from: classes.dex */
    public static class a {
        public static b a = new b();
    }

    /* renamed from: com.fyber.inneractive.sdk.factories.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0016b {
        com.fyber.inneractive.sdk.interfaces.a a();

        com.fyber.inneractive.sdk.response.b b();
    }

    public com.fyber.inneractive.sdk.response.b a(com.fyber.inneractive.sdk.response.a aVar) {
        InterfaceC0016b interfaceC0016b = this.a.get(aVar);
        if (interfaceC0016b != null) {
            return interfaceC0016b.b();
        }
        return null;
    }

    public void a(com.fyber.inneractive.sdk.response.a aVar, InterfaceC0016b interfaceC0016b) {
        if (this.a.containsKey(aVar)) {
            IAlog.e("Handler already exists for ad type %s! : %s", aVar, this.a.get(aVar));
        } else {
            this.a.put(aVar, interfaceC0016b);
        }
    }
}
