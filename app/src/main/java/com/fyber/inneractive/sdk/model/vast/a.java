package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class a {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public a(String str, String str2, String str3) {
        String trim = str != null ? str.trim() : null;
        this.a = trim;
        String trim2 = str2 != null ? str2.trim() : null;
        this.b = trim2;
        String trim3 = str3 != null ? str3.trim() : null;
        this.c = trim3;
        this.d = (TextUtils.isEmpty(trim) || TextUtils.isEmpty(trim2) || TextUtils.isEmpty(trim3) || !trim3.contains("[TIME]")) ? false : true;
    }
}
