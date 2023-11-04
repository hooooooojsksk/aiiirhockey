package com.iab.omid.library.fyber.walking.async;

import com.iab.omid.library.fyber.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a extends b {
    protected final HashSet<String> c;
    protected final JSONObject d;
    protected final long e;

    public a(b.InterfaceC0064b interfaceC0064b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0064b);
        this.c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
