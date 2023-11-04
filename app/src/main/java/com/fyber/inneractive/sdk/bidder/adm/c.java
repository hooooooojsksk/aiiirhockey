package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.bidder.adm.f;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.h;
import com.fyber.inneractive.sdk.config.global.features.m;
import com.fyber.inneractive.sdk.config.global.k;
import com.fyber.inneractive.sdk.config.global.l;
import com.fyber.inneractive.sdk.config.global.q;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.flow.j;
import com.fyber.inneractive.sdk.flow.r;
import com.fyber.inneractive.sdk.network.n;
import com.fyber.inneractive.sdk.network.u;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class c implements u<com.fyber.inneractive.sdk.response.e> {
    public final /* synthetic */ f.a a;
    public final /* synthetic */ com.fyber.inneractive.sdk.response.e b;
    public final /* synthetic */ f c;

    public c(f fVar, f.a aVar, com.fyber.inneractive.sdk.response.e eVar) {
        this.c = fVar;
        this.a = aVar;
        this.b = eVar;
    }

    @Override // com.fyber.inneractive.sdk.network.u
    public void a(com.fyber.inneractive.sdk.response.e eVar, Exception exc, boolean z) {
        q a;
        com.fyber.inneractive.sdk.config.global.b bVar;
        k kVar;
        l lVar;
        q a2;
        com.fyber.inneractive.sdk.response.e eVar2 = eVar;
        if (exc == null) {
            com.fyber.inneractive.sdk.metrics.c.d.b(this.c.d).b(FirebaseAnalytics.Param.SUCCESS);
            f.a aVar = this.a;
            if (aVar != null) {
                r.a aVar2 = (r.a) aVar;
                s b = s.b();
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = aVar2.a.a;
                if (admParametersOuterClass$AdmParameters != null) {
                    List<AdmParametersOuterClass$AdmParameters.Experiment> abExperimentsList = admParametersOuterClass$AdmParameters.getAbExperimentsList();
                    com.fyber.inneractive.sdk.config.global.a aVar3 = IAConfigManager.M.z;
                    aVar3.getClass();
                    for (h hVar : b.c.values()) {
                        if (hVar != null && (lVar = aVar3.a) != null && (a2 = lVar.a(hVar.b)) != null) {
                            hVar.a = a2.a;
                        }
                    }
                    if (abExperimentsList != null && abExperimentsList.size() > 0) {
                        com.fyber.inneractive.sdk.config.global.a aVar4 = IAConfigManager.M.z;
                        aVar4.b = b;
                        for (h hVar2 : b.c.values()) {
                            for (AdmParametersOuterClass$AdmParameters.Experiment experiment : abExperimentsList) {
                                String identifier = experiment.getIdentifier();
                                String variant = experiment.getVariant();
                                l lVar2 = aVar4.a;
                                if (lVar2 != null && (a = lVar2.a(hVar2.b)) != null && (bVar = a.c.get(identifier)) != null) {
                                    Iterator<k> it = bVar.c.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            kVar = null;
                                            break;
                                        }
                                        kVar = it.next();
                                        if (kVar.b.equals(variant)) {
                                            break;
                                        }
                                    }
                                    hVar2.c.add(bVar);
                                    if (kVar != null) {
                                        hVar2.d.put(bVar.a, kVar);
                                    }
                                }
                            }
                        }
                    }
                }
                r rVar = r.this;
                long j = aVar2.b;
                i.b bVar2 = rVar.d;
                j jVar = rVar.l;
                jVar.e = null;
                jVar.d = bVar2;
                jVar.q = j;
                com.fyber.inneractive.sdk.metrics.c.d.b(rVar.getLocalUniqueId()).a();
                jVar.n = eVar2;
                String mediationNameString = rVar.getMediationNameString() == null ? "eo" : rVar.getMediationNameString();
                m mVar = (m) IAConfigManager.M.L.a(m.class);
                UnitDisplayType unitDisplayType = eVar2.n;
                mVar.getClass();
                Locale locale = Locale.ROOT;
                String format = String.format("%s_%s%s", unitDisplayType.value(), mediationNameString.toLowerCase(locale), "_mlt");
                long j2 = m.i;
                long a3 = mVar.a(format, (int) j2);
                jVar.r = (a3 < m.g || a3 > m.h) ? j2 : a3;
                String format2 = String.format("%s_%s%s", eVar2.n.value(), mediationNameString.toLowerCase(locale), "_alt");
                long j3 = m.l;
                long a4 = mVar.a(format2, (int) j3);
                if (a4 >= m.j && a4 <= m.k) {
                    j3 = a4;
                }
                jVar.o = j3;
                if (IAConfigManager.j()) {
                    jVar.f = b;
                    n nVar = new n(jVar.e, rVar.getLocalUniqueId(), b, jVar);
                    jVar.g = nVar;
                    nVar.a(eVar2);
                    return;
                }
                IAConfigManager.addListener(jVar);
                IAConfigManager.a();
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.metrics.c.d.b(this.c.d).b(exc.getMessage());
        f.a aVar5 = this.a;
        if (aVar5 != null) {
            ((r.a) aVar5).a(exc, f.a(this.c, exc) ? InneractiveErrorCode.NO_FILL : InneractiveErrorCode.CONNECTION_ERROR, this.b);
        }
    }
}
