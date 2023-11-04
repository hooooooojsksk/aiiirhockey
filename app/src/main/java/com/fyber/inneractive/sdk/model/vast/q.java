package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.u0;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class q {
    public String a;
    public List<d> b;

    public static q a(Node node) {
        d dVar;
        q qVar = new q();
        qVar.a = u0.b(node, ClientCookie.VERSION_ATTR);
        ArrayList arrayList = (ArrayList) u0.c(node, "Ad");
        if (!arrayList.isEmpty()) {
            qVar.b = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                if (node2 == null) {
                    dVar = null;
                } else {
                    d dVar2 = new d();
                    dVar2.a = u0.b(node2, FacebookMediationAdapter.KEY_ID);
                    Node d = u0.d(node2, "Wrapper");
                    if (d != null) {
                        dVar2.b = u.c(d);
                    }
                    Node d2 = u0.d(node2, "InLine");
                    if (d2 != null) {
                        dVar2.c = l.c(d2);
                    }
                    dVar = dVar2;
                }
                qVar.b.add(dVar);
            }
        }
        return qVar;
    }

    public String toString() {
        return new StringBuilder("Vast: version - " + this.a + "\nAds: ").toString();
    }
}
