package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.u0;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class e {
    public String a;
    public k e;
    public List<com.fyber.inneractive.sdk.measurement.f> d = new ArrayList();
    public List<String> b = new ArrayList();
    public List<j> c = new ArrayList();

    public final void a(Node node) {
        com.fyber.inneractive.sdk.measurement.f fVar;
        Node d = u0.d(node, "AdVerifications");
        if (d != null) {
            Iterator it = ((ArrayList) u0.c(d, "Verification")).iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                if (node2 == null) {
                    fVar = null;
                } else {
                    com.fyber.inneractive.sdk.measurement.f fVar2 = new com.fyber.inneractive.sdk.measurement.f();
                    fVar2.e = u0.b(node2, "vendor");
                    Node d2 = u0.d(node2, "JavaScriptResource");
                    if (d2 != null) {
                        fVar2.g = true;
                        try {
                            fVar2.f = u0.a(d2);
                            fVar2.b = u0.b(d2, "apiFramework");
                            fVar2.a = new URL(fVar2.f);
                        } catch (MalformedURLException unused) {
                        }
                    }
                    Node d3 = u0.d(node2, "TrackingEvents");
                    if (d3 != null) {
                        Iterator it2 = ((ArrayList) u0.c(d3, "Tracking")).iterator();
                        while (it2.hasNext()) {
                            Node node3 = (Node) it2.next();
                            r a = r.a(node3);
                            if (node3 != null && a.a.equalsIgnoreCase("verificationNotExecuted")) {
                                fVar2.a(s.EVENT_VERIFICATION_NOT_EXECUTED, a.b);
                            }
                        }
                    }
                    Node d4 = u0.d(node2, "VerificationParameters");
                    if (d4 != null) {
                        fVar2.d = u0.a(d4);
                    }
                    fVar = fVar2;
                }
                if (fVar != null) {
                    IAlog.a("Verification Found - %s", fVar.toString());
                    this.d.add(fVar);
                }
            }
        }
    }

    public void b(Node node) {
        Iterator it;
        j jVar;
        f fVar;
        Iterator it2;
        n nVar;
        Iterator it3;
        if (node == null) {
            return;
        }
        Node d = u0.d(node, "AdSystem");
        if (d != null) {
            u0.b(d, ClientCookie.VERSION_ATTR);
            u0.a(d);
        }
        Node d2 = u0.d(node, "Error");
        if (d2 != null) {
            String a = u0.a(d2);
            if (!TextUtils.isEmpty(a)) {
                this.a = a;
            }
        }
        Iterator it4 = ((ArrayList) u0.c(node, "Impression")).iterator();
        while (it4.hasNext()) {
            String a2 = u0.a((Node) it4.next());
            if (!TextUtils.isEmpty(a2)) {
                this.b.add(a2);
            }
        }
        Node d3 = u0.d(node, "Creatives");
        if (d3 != null) {
            Iterator it5 = ((ArrayList) u0.c(d3, "Creative")).iterator();
            while (it5.hasNext()) {
                Node node2 = (Node) it5.next();
                if (node2 == null) {
                    it = it5;
                    jVar = null;
                } else {
                    j jVar2 = new j();
                    u0.b(node2, "AdID");
                    u0.b(node2, FacebookMediationAdapter.KEY_ID);
                    u0.a(node2, "sequence");
                    Node d4 = u0.d(node2, "Linear");
                    if (d4 != null) {
                        m mVar = new m();
                        Node d5 = u0.d(d4, "MediaFiles");
                        if (d5 != null) {
                            ArrayList arrayList = (ArrayList) u0.c(d5, "MediaFile");
                            if (!arrayList.isEmpty()) {
                                mVar.a = new ArrayList();
                                Iterator it6 = arrayList.iterator();
                                while (it6.hasNext()) {
                                    Node node3 = (Node) it6.next();
                                    if (node3 == null) {
                                        it2 = it5;
                                        it3 = it6;
                                        nVar = null;
                                    } else {
                                        it2 = it5;
                                        nVar = new n();
                                        it3 = it6;
                                        nVar.a = u0.b(node3, "delivery");
                                        nVar.b = u0.a(node3, "width");
                                        nVar.c = u0.a(node3, "height");
                                        nVar.d = u0.b(node3, "type");
                                        u0.b(node3, FacebookMediationAdapter.KEY_ID);
                                        nVar.f = u0.b(node3, "apiFramework");
                                        nVar.e = u0.a(node3, "bitrate");
                                        String b = u0.b(node3, "maintainAspectRatio");
                                        if (!TextUtils.isEmpty(b)) {
                                            try {
                                                Boolean.valueOf(b);
                                            } catch (NumberFormatException unused) {
                                            }
                                        }
                                        String b2 = u0.b(node3, "scalable");
                                        if (!TextUtils.isEmpty(b2)) {
                                            try {
                                                Boolean.valueOf(b2);
                                            } catch (NumberFormatException unused2) {
                                            }
                                        }
                                        nVar.g = u0.a(node3);
                                    }
                                    if (nVar != null) {
                                        mVar.a.add(nVar);
                                    }
                                    it5 = it2;
                                    it6 = it3;
                                }
                            }
                        }
                        it = it5;
                        Node d6 = u0.d(d4, "VideoClicks");
                        if (d6 != null) {
                            mVar.c = u0.a(u0.d(d6, "ClickThrough"));
                            ArrayList arrayList2 = (ArrayList) u0.c(d6, "ClickTracking");
                            if (!arrayList2.isEmpty()) {
                                mVar.d = new ArrayList();
                                Iterator it7 = arrayList2.iterator();
                                while (it7.hasNext()) {
                                    String a3 = u0.a((Node) it7.next());
                                    if (!TextUtils.isEmpty(a3)) {
                                        mVar.d.add(a3);
                                    }
                                }
                            }
                        }
                        Node d7 = u0.d(d4, "TrackingEvents");
                        if (d7 != null) {
                            ArrayList arrayList3 = (ArrayList) u0.c(d7, "Tracking");
                            if (!arrayList3.isEmpty()) {
                                mVar.b = new ArrayList();
                                Iterator it8 = arrayList3.iterator();
                                while (it8.hasNext()) {
                                    r a4 = r.a((Node) it8.next());
                                    if (a4 != null) {
                                        mVar.b.add(a4);
                                    }
                                }
                            }
                        }
                        Node d8 = u0.d(d4, "Duration");
                        if (d8 != null) {
                            mVar.e = u0.a(d8);
                        }
                        jVar2.a = mVar;
                    } else {
                        it = it5;
                    }
                    Node d9 = u0.d(node2, "CompanionAds");
                    if (d9 != null) {
                        List<Node> c = u0.c(d9, "Companion");
                        jVar2.b = new ArrayList();
                        Iterator it9 = ((ArrayList) c).iterator();
                        while (it9.hasNext()) {
                            Node node4 = (Node) it9.next();
                            if (node4 == null) {
                                fVar = null;
                            } else {
                                fVar = new f();
                                fVar.a = u0.a(node4, "width");
                                fVar.b = u0.a(node4, "height");
                                fVar.c = u0.b(node4, FacebookMediationAdapter.KEY_ID);
                                u0.b(node4, "apiFramework");
                                u0.a(node4, "expandedWidth");
                                u0.a(node4, "expandedHeight");
                                Node d10 = u0.d(node4, "StaticResource");
                                if (d10 != null) {
                                    i iVar = new i();
                                    iVar.a = u0.b(d10, "creativeType");
                                    iVar.b = u0.a(d10);
                                    fVar.d = iVar;
                                }
                                Node d11 = u0.d(node4, "HTMLResource");
                                if (d11 != null) {
                                    fVar.f = u0.a(d11);
                                }
                                Node d12 = u0.d(node4, "IFrameResource");
                                if (d12 != null) {
                                    fVar.e = u0.a(d12);
                                }
                                Node d13 = u0.d(node4, "CompanionClickThrough");
                                if (d13 != null) {
                                    fVar.g = u0.a(d13);
                                }
                                ArrayList arrayList4 = (ArrayList) u0.c(node4, "CompanionClickTracking");
                                if (arrayList4.size() > 0) {
                                    fVar.h = new ArrayList();
                                    Iterator it10 = arrayList4.iterator();
                                    while (it10.hasNext()) {
                                        String a5 = u0.a((Node) it10.next());
                                        if (!TextUtils.isEmpty(a5)) {
                                            fVar.h.add(a5);
                                        }
                                    }
                                }
                                Node d14 = u0.d(node4, "TrackingEvents");
                                if (d14 != null) {
                                    ArrayList arrayList5 = (ArrayList) u0.c(d14, "Tracking");
                                    if (!arrayList5.isEmpty()) {
                                        fVar.j = new ArrayList();
                                        Iterator it11 = arrayList5.iterator();
                                        while (it11.hasNext()) {
                                            r a6 = r.a((Node) it11.next());
                                            if (a6 != null) {
                                                fVar.j.add(a6);
                                            }
                                        }
                                    }
                                }
                            }
                            if (fVar != null) {
                                jVar2.b.add(fVar);
                            }
                        }
                    }
                    jVar = jVar2;
                }
                if (jVar != null) {
                    this.c.add(jVar);
                }
                it5 = it;
            }
        }
        Node d15 = u0.d(node, "Extensions");
        if (d15 != null) {
            Iterator it12 = ((ArrayList) u0.c(d15, "Extension")).iterator();
            while (it12.hasNext()) {
                Node node5 = (Node) it12.next();
                if ("AdVerifications".equalsIgnoreCase(u0.b(node5, "type"))) {
                    a(node5);
                }
                if ("FMPCompanionAssets".equalsIgnoreCase(u0.b(node5, "type"))) {
                    IAlog.a("parseFMPCompanionAssetsTag", new Object[0]);
                    Node d16 = u0.d(node5, "FMPCompanionAssets");
                    if (d16 != null) {
                        k kVar = new k();
                        Node d17 = u0.d(d16, "Name");
                        if (d17 != null) {
                            kVar.a = u0.a(d17);
                        }
                        Node d18 = u0.d(d16, "Description");
                        if (d18 != null) {
                            kVar.b = u0.a(d18);
                        }
                        Node d19 = u0.d(d16, "Icons");
                        if (d19 != null) {
                            kVar.c = new ArrayList();
                            Iterator it13 = ((ArrayList) u0.c(d19, "Icon")).iterator();
                            while (it13.hasNext()) {
                                kVar.c.add(u0.a((Node) it13.next()));
                            }
                        }
                        Node d20 = u0.d(d16, "Rating");
                        if (d20 != null) {
                            try {
                                kVar.d = Float.parseFloat(u0.a(d20));
                            } catch (Exception unused3) {
                            }
                        }
                        Node d21 = u0.d(d16, "Screenshots");
                        if (d21 != null) {
                            kVar.e = new ArrayList();
                            Iterator it14 = ((ArrayList) u0.c(d21, "Screenshot")).iterator();
                            while (it14.hasNext()) {
                                String a7 = u0.a((Node) it14.next());
                                if (!TextUtils.isEmpty(a7)) {
                                    kVar.e.add(a7);
                                }
                            }
                        }
                        this.e = kVar;
                    }
                }
            }
        }
        a(node);
    }
}
