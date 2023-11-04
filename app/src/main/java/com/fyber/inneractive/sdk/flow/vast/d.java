package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.vast.g;
import com.fyber.inneractive.sdk.model.vast.m;
import com.fyber.inneractive.sdk.model.vast.n;
import com.fyber.inneractive.sdk.model.vast.o;
import com.fyber.inneractive.sdk.model.vast.p;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.s;
import com.fyber.inneractive.sdk.model.vast.u;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d {
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public boolean d = false;
    public boolean e = false;
    public final List<com.fyber.inneractive.sdk.measurement.f> i = new ArrayList();
    public Map<n, g> f = new LinkedHashMap();
    public List<com.fyber.inneractive.sdk.model.vast.f> g = new ArrayList();
    public final List<com.fyber.inneractive.sdk.model.vast.f> h = new ArrayList();

    /* loaded from: classes.dex */
    public class a extends Exception {
        public int a;

        public a(d dVar, String str, int i) {
            super(str);
            this.a = i;
        }
    }

    public void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.f fVar, boolean z) throws a {
        String str;
        List<r> list;
        String str2;
        Integer num;
        Integer num2;
        List<String> list2 = fVar.h;
        if (list2 != null) {
            if (z) {
                this.h.add(fVar);
            }
            for (String str3 : list2) {
                if (!x.f(str3)) {
                    throw new a(this, "Found non secure click tracking url for companion: " + fVar, 0);
                }
            }
        }
        String str4 = fVar.g;
        if (x.f(str4)) {
            Integer num3 = fVar.a;
            Integer num4 = fVar.b;
            boolean z2 = true;
            if (num3 != null && num4 != null && num3.intValue() >= 100 && num4.intValue() >= 100) {
                String str5 = fVar.c;
                List<r> list3 = fVar.j;
                if (list3 != null) {
                    for (r rVar : list3) {
                        if (!x.f(rVar.b)) {
                            throw new a(this, "Found non secure tracking event: " + rVar, 0);
                        }
                    }
                }
                if (TextUtils.isEmpty(fVar.e) && TextUtils.isEmpty(fVar.f) && fVar.d == null) {
                    z2 = false;
                }
                if (z2) {
                    String str6 = fVar.e;
                    if (x.f(str6)) {
                        com.fyber.inneractive.sdk.model.vast.i iVar = fVar.d;
                        if (iVar != null) {
                            com.fyber.inneractive.sdk.model.vast.h a2 = com.fyber.inneractive.sdk.model.vast.h.a(iVar.a);
                            if (a2 != null) {
                                str = str6;
                                list = list3;
                                str2 = str5;
                                num = num4;
                                num2 = num3;
                                a(bVar, com.fyber.inneractive.sdk.model.vast.g.Static, z, num3.intValue(), num4.intValue(), str5, str4, list2, list, iVar.b, a2);
                            } else {
                                throw new a(this, "Found invalid creative type:" + iVar.a, 0);
                            }
                        } else {
                            str = str6;
                            list = list3;
                            str2 = str5;
                            num = num4;
                            num2 = num3;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            a(bVar, com.fyber.inneractive.sdk.model.vast.g.Iframe, z, num2.intValue(), num.intValue(), str2, str4, list2, list, str, null);
                        }
                        String str7 = fVar.f;
                        if (TextUtils.isEmpty(str7)) {
                            return;
                        }
                        a(bVar, com.fyber.inneractive.sdk.model.vast.g.Html, z, num2.intValue(), num.intValue(), str2, str4, list2, list, str7, null);
                        return;
                    }
                    throw new a(this, "Found non secure iframe url:" + str6, 0);
                }
                throw new a(this, "None sources of companion avaliable", 0);
            }
            throw new a(this, "Incompatible size: " + num3 + "," + num4, 16);
        }
        throw new a(this, "Found non secure click through url: " + str4, 0);
    }

    public com.fyber.inneractive.sdk.model.vast.b a(com.fyber.inneractive.sdk.model.vast.d dVar, List<com.fyber.inneractive.sdk.model.vast.d> list, String str) throws i {
        IAlog.a("%sprocess started", "VastProcessor: ");
        if (dVar != null && dVar.c != null) {
            int e = l.e();
            int d = l.d();
            com.fyber.inneractive.sdk.model.vast.b bVar = new com.fyber.inneractive.sdk.model.vast.b(new h(this.c, e, d), new f(e, d));
            bVar.a = str;
            List<com.fyber.inneractive.sdk.model.vast.j> list2 = dVar.c.c;
            if (list2 != null && !list2.isEmpty()) {
                if (list != null) {
                    for (com.fyber.inneractive.sdk.model.vast.d dVar2 : list) {
                        u uVar = dVar2.b;
                        if (uVar != null) {
                            a(bVar, (com.fyber.inneractive.sdk.model.vast.e) uVar, true);
                        }
                    }
                }
                a(bVar, (com.fyber.inneractive.sdk.model.vast.e) dVar.c, false);
                if (bVar.d.size() == 0) {
                    if (this.f.size() == 0) {
                        throw new i("ErrorNoMediaFiles", "No media files exist after merge");
                    }
                    throw new i("ErrorNoCompatibleMediaFile", "No compatible media files after filtering");
                }
                if (IAlog.a == 2) {
                    IAlog.d("%sLogging merged model media files: ", "VastProcessor: ");
                    Iterator it = new ArrayList(bVar.d).iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        IAlog.d("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i), (n) it.next());
                        i++;
                    }
                }
                if (IAlog.a == 2) {
                    IAlog.d("%sLogging merged model companion ads: ", "VastProcessor: ");
                    ArrayList arrayList = new ArrayList(bVar.g);
                    if (arrayList.size() > 0) {
                        Iterator it2 = arrayList.iterator();
                        int i2 = 0;
                        while (it2.hasNext()) {
                            IAlog.d("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i2), ((com.fyber.inneractive.sdk.model.vast.c) it2.next()).a());
                            i2++;
                        }
                    } else {
                        IAlog.d("%sNo companion ads found!", "VastProcessor: ");
                    }
                }
                return bVar;
            }
            throw new i("ErrorNoMediaFiles", "Empty inline with no creatives");
        }
        IAlog.a("%sno inline found", "VastProcessor: ");
        throw new i("ErrorNoMediaFiles", "Empty inline ad found");
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.e eVar, boolean z) {
        String[] split;
        g gVar;
        Integer num;
        Map<s, List<String>> map;
        List<String> list;
        IAlog.a("%sprocessing ad element: %s", "VastProcessor: ", eVar);
        List<String> list2 = eVar.b;
        if (list2 != null) {
            for (String str : list2) {
                IAlog.a("%sadding impression url: %s", "VastProcessor: ", str);
                a(bVar, s.EVENT_IMPRESSION, str);
            }
        }
        String str2 = eVar.a;
        if (!TextUtils.isEmpty(str2)) {
            IAlog.a("%sadding error url: %s", "VastProcessor: ", str2);
            bVar.a(s.EVENT_ERROR, str2);
        }
        if (IAConfigManager.M.J != null) {
            for (com.fyber.inneractive.sdk.measurement.f fVar : eVar.d) {
                if (fVar.b()) {
                    bVar.e.add(fVar);
                } else {
                    s sVar = s.EVENT_VERIFICATION_NOT_EXECUTED;
                    if (((sVar == null || (map = fVar.c) == null || (list = map.get(sVar)) == null) ? 0 : list.size()) > 0) {
                        com.fyber.inneractive.sdk.player.e.a(new com.fyber.inneractive.sdk.measurement.e(fVar, fVar.a(sVar), com.fyber.inneractive.sdk.measurement.g.VERIFICATION_NOT_SUPPORTED), sVar);
                    }
                    this.i.add(fVar);
                }
            }
        }
        com.fyber.inneractive.sdk.model.vast.k kVar = eVar.e;
        if (kVar != null) {
            bVar.f = kVar;
        }
        for (com.fyber.inneractive.sdk.model.vast.j jVar : eVar.c) {
            m mVar = jVar.a;
            if (mVar != null) {
                List<n> list3 = mVar.a;
                if (list3 != null) {
                    bVar.j = list3.size();
                    for (n nVar : list3) {
                        String str3 = nVar.a;
                        o oVar = o.progressive;
                        g gVar2 = null;
                        if (!str3.equals(oVar.mValue)) {
                            gVar2 = new g(g.a.UNSUPPORTED_DELIVERY, oVar.mValue);
                        } else {
                            if ((this.b > -1) && (num = nVar.e) != null && num.intValue() != 0) {
                                int intValue = nVar.e.intValue();
                                int i = this.a;
                                if (intValue < i) {
                                    gVar2 = new g(g.a.BITRATE_NOT_IN_RANGE, Integer.valueOf(i));
                                } else {
                                    int intValue2 = nVar.e.intValue();
                                    int i2 = this.b;
                                    if (intValue2 > i2) {
                                        gVar2 = new g(g.a.BITRATE_NOT_IN_RANGE, Integer.valueOf(i2));
                                    }
                                }
                            }
                            if (!(p.a(nVar.d) != p.UNKNOWN)) {
                                gVar = new g(g.a.UNSUPPORTED_MIME_TYPE, null);
                            } else if (this.d && nVar.b.intValue() >= nVar.c.intValue()) {
                                gVar = new g(g.a.VERTICAL_VIDEO_EXPECTED, null);
                            } else {
                                String str4 = nVar.f;
                                if (str4 != null && this.e && str4.equalsIgnoreCase("VPAID")) {
                                    gVar = new g(g.a.FILTERED_BY_APP_OR_UNIT, null);
                                } else if (TextUtils.isEmpty(nVar.g)) {
                                    gVar = new g(g.a.NO_CONTENT, null);
                                } else if (!x.f(nVar.g)) {
                                    gVar = new g(g.a.UNSECURED_VIDEO_URL, null);
                                }
                            }
                            gVar2 = gVar;
                        }
                        if (gVar2 != null) {
                            IAlog.a("%smedia file filtered!: %s", "VastProcessor: ", nVar);
                            IAlog.a("%s-- %s", "VastProcessor: ", nVar);
                            IAlog.a("%s-- %s", "VastProcessor: ", gVar2);
                            this.f.put(nVar, gVar2);
                        } else {
                            IAlog.a("%sadding media file: %s", "VastProcessor: ", nVar);
                            bVar.d.add(nVar);
                            bVar.k.add(nVar);
                            bVar.i++;
                        }
                    }
                }
                List<String> list4 = mVar.d;
                if (list4 != null) {
                    for (String str5 : list4) {
                        a(bVar, s.EVENT_CLICK, str5);
                    }
                }
                List<r> list5 = mVar.b;
                if (list5 != null) {
                    for (r rVar : list5) {
                        s a2 = s.a(rVar.a);
                        if (a2 != s.UNKNOWN) {
                            bVar.a(a2, rVar.b);
                        }
                    }
                }
                String str6 = mVar.c;
                if (str6 != null) {
                    bVar.b = str6;
                }
                String str7 = mVar.e;
                if (!TextUtils.isEmpty(str7) && (split = str7.split(":")) != null && split.length <= 3) {
                    if (split.length == 1) {
                        try {
                            Integer.parseInt(str7);
                        } catch (NumberFormatException unused) {
                        }
                    } else if (split.length == 2) {
                        Integer.parseInt(split[1]);
                        Integer.parseInt(split[0]);
                    } else {
                        Integer.parseInt(split[2]);
                        Integer.parseInt(split[1]);
                        Integer.parseInt(split[0]);
                    }
                }
            }
            List<com.fyber.inneractive.sdk.model.vast.f> list6 = jVar.b;
            if (list6 != null) {
                for (com.fyber.inneractive.sdk.model.vast.f fVar2 : list6) {
                    try {
                        a(bVar, fVar2, z);
                    } catch (a e) {
                        IAlog.a("Failed processing companion ad: %s error = %s", fVar2, e.getMessage());
                        fVar2.i = e;
                        this.g.add(fVar2);
                    }
                }
            }
        }
    }

    public final void a(com.fyber.inneractive.sdk.response.i iVar, s sVar, String str) throws i {
        if (x.f(str)) {
            ((com.fyber.inneractive.sdk.model.vast.b) iVar).a(sVar, str);
            return;
        }
        throw new i("VastErrorUnsecure", "found unsecure tracking event: " + sVar.e());
    }

    public void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.g gVar, boolean z, int i, int i2, String str, String str2, List<String> list, List<r> list2, String str3, com.fyber.inneractive.sdk.model.vast.h hVar) {
        com.fyber.inneractive.sdk.model.vast.c cVar = new com.fyber.inneractive.sdk.model.vast.c(gVar, i, i2, str);
        cVar.g = str2;
        if (list2 != null) {
            for (r rVar : list2) {
                cVar.a(s.a(rVar.a), rVar.b);
            }
        }
        if (list != null) {
            for (String str4 : list) {
                cVar.a(s.EVENT_CLICK, str4);
            }
        }
        a(cVar, z);
        cVar.f = str3;
        cVar.b = hVar;
        bVar.g.add(cVar);
        bVar.l.add(cVar);
    }

    public boolean a(com.fyber.inneractive.sdk.model.vast.c cVar, boolean z) {
        boolean z2 = false;
        if (!this.h.isEmpty()) {
            com.fyber.inneractive.sdk.model.vast.f fVar = null;
            if (z) {
                List<com.fyber.inneractive.sdk.model.vast.f> list = this.h;
                fVar = list.remove(list.size() - 1);
            }
            String str = cVar.e;
            for (com.fyber.inneractive.sdk.model.vast.f fVar2 : this.h) {
                String str2 = fVar2.c;
                if ((str != null && str.equals(str2)) || (str2 == null && cVar.c == fVar2.a.intValue() && cVar.d == fVar2.b.intValue())) {
                    List<String> list2 = fVar2.h;
                    if (list2 != null) {
                        for (String str3 : list2) {
                            if (x.f(str3)) {
                                cVar.a(s.EVENT_CLICK, str3);
                            }
                        }
                    }
                    z2 = true;
                }
            }
            if (fVar != null) {
                this.h.add(fVar);
            }
        }
        return z2;
    }
}
