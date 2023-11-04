package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.s;
import com.fyber.inneractive.sdk.response.i;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class f implements i {
    public URL a;
    public String b;
    public String d;
    public String e;
    public String f;
    public Map<s, List<String>> c = new HashMap();
    public boolean g = false;

    public void a(s sVar, String str) {
        List<String> list = this.c.get(sVar);
        if (list == null) {
            list = new ArrayList<>();
            this.c.put(sVar, list);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }

    public boolean b() {
        String str;
        return this.g && this.a != null && ((str = this.b) == null || (!TextUtils.isEmpty(str) && this.b.equalsIgnoreCase("omid")));
    }

    public String toString() {
        return "Verification{mJavaScriptResource=" + this.a + ", mTrackingEvents=" + this.c + ", mVerificationParameters='" + this.d + "', mVendor='" + this.e + "'}";
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public List<String> a(s sVar) {
        Map<s, List<String>> map;
        if (sVar == null || (map = this.c) == null) {
            return null;
        }
        return map.get(sVar);
    }

    public String a() {
        if (this.g) {
            if (TextUtils.isEmpty(this.b)) {
                return "apiFramework = ";
            }
            if (this.b.equalsIgnoreCase("omid")) {
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(this.f) ? "" : this.f;
                return String.format("JavaScriptResource_url = %s", objArr);
            }
            return String.format("apiFramework = %s", this.b);
        }
        return "JavaScriptResource = ";
    }
}
