package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.u0;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class l extends e {
    public static l c(Node node) {
        l lVar = new l();
        super.b(node);
        u0.a(u0.d(node, "AdTitle"));
        u0.a(u0.d(node, "Description"));
        return lVar;
    }
}
