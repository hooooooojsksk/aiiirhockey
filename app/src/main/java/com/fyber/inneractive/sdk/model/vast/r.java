package com.fyber.inneractive.sdk.model.vast;

import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.util.u0;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class r {
    public String a;
    public String b;

    public static r a(Node node) {
        if (node == null) {
            return null;
        }
        r rVar = new r();
        rVar.a = u0.b(node, NotificationCompat.CATEGORY_EVENT);
        rVar.b = u0.a(node);
        return rVar;
    }

    public String toString() {
        return "VTracking:  name:" + this.a + " url:" + this.b;
    }
}
