package com.fyber.inneractive.sdk.config.global;

/* loaded from: classes.dex */
public class f implements d {
    public String a;
    public boolean b;

    public f(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public boolean a(e eVar) {
        String str = this.a;
        if (str != null) {
            if (str.equalsIgnoreCase("android")) {
                return !this.b;
            }
            return this.b;
        }
        return false;
    }

    public String toString() {
        return String.format("%s - %s include: %b", "os", this.a, Boolean.valueOf(this.b));
    }
}
