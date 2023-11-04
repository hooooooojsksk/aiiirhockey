package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {
    public final Set<InterfaceC0015a> a = new HashSet();

    /* renamed from: com.fyber.inneractive.sdk.factories.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0015a {
        boolean a(InneractiveAdSpot inneractiveAdSpot);

        com.fyber.inneractive.sdk.interfaces.b b(InneractiveAdSpot inneractiveAdSpot);
    }

    /* loaded from: classes.dex */
    public static class b {
        public static a a = new a();
    }
}
