package com.fyber.inneractive.sdk.config.global.features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class h extends com.fyber.inneractive.sdk.config.global.p {
    public String b;
    public List<com.fyber.inneractive.sdk.config.global.b> c = new ArrayList();
    public Map<String, com.fyber.inneractive.sdk.config.global.k> d = new HashMap();

    public h(String str) {
        this.b = str;
    }

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public String a(String str, String str2) {
        String str3;
        Iterator<String> it = this.d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = null;
                break;
            }
            str3 = this.d.get(it.next()).c(str);
            if (str3 != null) {
                break;
            }
        }
        if (str3 == null) {
            com.fyber.inneractive.sdk.config.global.n nVar = this.a;
            return nVar != null ? nVar.a(str, str2) : str2;
        }
        return str3;
    }

    public abstract h b();

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public Integer b(String str) {
        Integer num;
        Iterator<String> it = this.d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = this.d.get(it.next()).b(str);
            if (num != null) {
                break;
            }
        }
        return num == null ? super.b(str) : num;
    }

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public String c(String str) {
        return a(str, (String) null);
    }

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public Boolean d(String str) {
        Boolean bool;
        Iterator<String> it = this.d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                bool = null;
                break;
            }
            bool = this.d.get(it.next()).d(str);
            if (bool != null) {
                break;
            }
        }
        return bool == null ? super.d(str) : bool;
    }

    public String toString() {
        return String.format("id: %s, params: %s exp: %s", this.b, this.a, this.c);
    }

    public int a(String str, int i) {
        Integer b = b(str);
        return b != null ? b.intValue() : i;
    }

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public Double a(String str) {
        Double d;
        Iterator<String> it = this.d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                d = null;
                break;
            }
            d = this.d.get(it.next()).a(str);
            if (d != null) {
                break;
            }
        }
        return d == null ? super.a(str) : d;
    }

    public boolean a(String str, boolean z) {
        Boolean d = d(str);
        return d != null ? d.booleanValue() : z;
    }

    public void a(h hVar) {
        hVar.b = this.b;
        hVar.a = this.a;
        hVar.c = new ArrayList(this.c);
        hVar.d = new HashMap(this.d);
    }
}
