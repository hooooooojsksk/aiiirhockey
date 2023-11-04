package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.model.vast.n;
import com.fyber.inneractive.sdk.model.vast.q;
import com.fyber.inneractive.sdk.model.vast.t;
import com.fyber.inneractive.sdk.model.vast.u;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.p;
import com.fyber.inneractive.sdk.util.x;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* loaded from: classes.dex */
public class d extends b {
    public g e;
    public a0 f;
    public com.fyber.inneractive.sdk.model.vast.d g;
    public List<com.fyber.inneractive.sdk.model.vast.d> h = new ArrayList();
    public int i;
    public t j;

    @Override // com.fyber.inneractive.sdk.response.b
    public e a() {
        g gVar = new g();
        this.a = gVar;
        this.e = gVar;
        return gVar;
    }

    public void b(String str) throws com.fyber.inneractive.sdk.flow.vast.i, Exception {
        q qVar;
        try {
            String replaceFirst = str.replaceFirst("<\\?.*\\?>", "");
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setCoalescing(true);
            Document parse = newInstance.newDocumentBuilder().parse(new InputSource(new StringReader(replaceFirst)));
            if (parse != null) {
                Node firstChild = parse.getFirstChild();
                if (firstChild.getNodeName().equalsIgnoreCase("VAST")) {
                    qVar = q.a(firstChild);
                } else {
                    IAlog.a("XML does not contain a VAST tag as its first child!", new Object[0]);
                    throw new Exception("XML does not contain a VAST tag as its first child!");
                }
            } else {
                qVar = null;
            }
            try {
                if (this.j == null) {
                    this.j = new t(qVar.a);
                } else {
                    t tVar = new t(qVar.a);
                    if (tVar.compareTo(this.j) >= 0) {
                        this.j = tVar;
                    }
                }
            } catch (t.a unused) {
            }
            List<com.fyber.inneractive.sdk.model.vast.d> list = qVar.b;
            if (list != null && list.size() != 0) {
                com.fyber.inneractive.sdk.model.vast.d dVar = list.get(0);
                u uVar = dVar.b;
                if (uVar != null) {
                    IAlog.a("Vast response parser: found VAST wrapper #%d", Integer.valueOf(this.h.size()));
                    int size = this.h.size();
                    int i = this.i;
                    if (size < i) {
                        this.h.add(dVar);
                        String str2 = uVar.f;
                        if (!TextUtils.isEmpty(str2)) {
                            if (x.f(str2)) {
                                String a = p.a(str2, 3000, 5000, 5);
                                if (!TextUtils.isEmpty(a)) {
                                    this.e.N.put(str2, a);
                                    b(a);
                                    return;
                                }
                                throw new com.fyber.inneractive.sdk.flow.vast.i("VastErrorInvalidFile", "Failed getting data from ad tag URI");
                            }
                            IAlog.a("Vast response parser: Unsecure Wrapper URL. Aborting! url: %s", str2);
                            throw new com.fyber.inneractive.sdk.flow.vast.i("VastErrorUnsecure", "Unsecure ad tag URI for wrapper");
                        }
                        IAlog.a("Vast response parser: found an empty tag uri in wrapper! aborting!", new Object[0]);
                        throw new com.fyber.inneractive.sdk.flow.vast.i("VastErrorInvalidFile", "No ad tag URI for wrapper");
                    }
                    IAlog.a("Vast response parser: too many vast wrappers! Only %dallowed. stopping", Integer.valueOf(i));
                    throw new com.fyber.inneractive.sdk.flow.vast.i("VastErrorTooManyWrappers", "More than " + this.i + " found");
                } else if (dVar.c != null) {
                    this.g = dVar;
                    return;
                } else {
                    throw new com.fyber.inneractive.sdk.flow.vast.i("VastErrorInvalidFile", "A top level ad with no wrapper on inline found!");
                }
            }
            IAlog.a("Vast response parser: no ads found in model. aborting", new Object[0]);
            throw new com.fyber.inneractive.sdk.flow.vast.i("ErrorNoMediaFiles", "No ads found in model. Empty Vast?");
        } catch (Exception e) {
            IAlog.a("Failed parsing Vast file! parsing error = %s", e.getMessage());
            throw new com.fyber.inneractive.sdk.flow.vast.i("VastErrorInvalidFile", e.getMessage());
        }
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public boolean b() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public void a(String str, a0 a0Var) throws Exception {
        this.f = a0Var;
        if (a0Var != null && a0Var.f != null) {
            this.e.I = System.currentTimeMillis();
            this.i = IAConfigManager.M.i.c;
            this.e.getClass();
            try {
                b(str);
                a(this.g, this.h);
                return;
            } catch (com.fyber.inneractive.sdk.flow.vast.i e) {
                this.e.i = e.getMessage();
                this.e.j = e.getCause().getMessage();
                return;
            } catch (InterruptedException e2) {
                throw e2;
            } catch (Exception e3) {
                this.e.j = String.format("%s", e3.getMessage());
                g gVar = this.e;
                gVar.i = "VastErrorInvalidFile";
                gVar.x = e3;
                if (IAlog.a == 2) {
                    e3.printStackTrace();
                    return;
                }
                return;
            }
        }
        this.a.i = "ErrorConfigurationMismatch";
    }

    public void a(com.fyber.inneractive.sdk.model.vast.d dVar, List<com.fyber.inneractive.sdk.model.vast.d> list) throws com.fyber.inneractive.sdk.flow.vast.i {
        com.fyber.inneractive.sdk.flow.vast.d dVar2 = new com.fyber.inneractive.sdk.flow.vast.d();
        int intValue = this.f.f.c.intValue();
        int intValue2 = this.f.f.b.intValue();
        int intValue3 = this.f.f.g.intValue();
        dVar2.a = intValue;
        dVar2.b = intValue2;
        dVar2.c = intValue3;
        if (UnitDisplayType.VERTICAL.equals(this.f.f.j)) {
            dVar2.d = true;
        }
        if (this.f.f.k.contains(2)) {
            dVar2.e = true;
        }
        try {
            t tVar = this.j;
            this.e.J = dVar2.a(dVar, list, tVar != null ? tVar.b : "");
        } catch (com.fyber.inneractive.sdk.flow.vast.i e) {
            g gVar = this.e;
            gVar.getClass();
            gVar.i = e.getMessage();
        }
        g gVar2 = this.e;
        Map<n, com.fyber.inneractive.sdk.flow.vast.g> map = dVar2.f;
        gVar2.getClass();
        if (map != null) {
            gVar2.K.putAll(map);
        }
        g gVar3 = this.e;
        List<com.fyber.inneractive.sdk.model.vast.f> list2 = dVar2.g;
        gVar3.getClass();
        if (list2 != null) {
            gVar3.L.addAll(list2);
        }
        g gVar4 = this.e;
        List<com.fyber.inneractive.sdk.measurement.f> list3 = dVar2.i;
        gVar4.getClass();
        if (list3 != null) {
            gVar4.M.addAll(list3);
        }
        if (IAlog.a == 2) {
            Map<n, com.fyber.inneractive.sdk.flow.vast.g> map2 = dVar2.f;
            if (map2.size() > 0) {
                IAlog.d(" VParser: Unsupported media files:", new Object[0]);
                for (n nVar : map2.keySet()) {
                    IAlog.d("VParser: %s", nVar);
                    IAlog.d("VParser: reason = %s", map2.get(nVar));
                }
                return;
            }
            IAlog.d("VParser: Unsupported media files: none", new Object[0]);
        }
    }
}
