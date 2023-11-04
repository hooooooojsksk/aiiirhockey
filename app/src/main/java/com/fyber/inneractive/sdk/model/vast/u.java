package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.u0;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class u extends e {
    public String f;

    public static u c(Node node) {
        u uVar = new u();
        super.b(node);
        uVar.f = u0.a(u0.d(node, "VASTAdTagURI"));
        return uVar;
    }
}
