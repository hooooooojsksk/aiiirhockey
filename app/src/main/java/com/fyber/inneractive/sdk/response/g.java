package com.fyber.inneractive.sdk.response;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.model.vast.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class g extends e {
    public long I;
    public com.fyber.inneractive.sdk.model.vast.b J;
    public final List<com.fyber.inneractive.sdk.measurement.f> M = new ArrayList();
    public Map<n, com.fyber.inneractive.sdk.flow.vast.g> K = new LinkedHashMap();
    public List<com.fyber.inneractive.sdk.model.vast.f> L = new ArrayList();
    public LinkedHashMap<String, String> N = new LinkedHashMap<>();

    @Override // com.fyber.inneractive.sdk.response.e
    public InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest) {
        return a(null, null);
    }

    public List<com.fyber.inneractive.sdk.measurement.f> d() {
        return this.M;
    }

    public com.fyber.inneractive.sdk.model.vast.b e() {
        return this.J;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(3:3|(1:5)|109)(2:110|(3:112|(4:118|(8:121|122|123|(1:125)(1:133)|126|(2:128|129)(2:131|132)|130|119)|136|137)|109)(2:138|(1:140)(3:141|(1:143)(2:144|(1:146)(2:147|(1:149)(16:150|(5:8|(1:10)(1:15)|11|(1:13)|14)|16|(9:20|(1:22)(1:58)|23|(14:26|27|28|29|(1:31)(1:46)|32|(1:34)|35|(1:37)|(1:39)|40|(2:42|43)(1:45)|44|24)|51|52|53|54|55)|59|(1:61)(1:108)|62|(1:64)(1:107)|65|(1:67)(1:106)|68|69|70|71|(2:73|(9:75|(1:77)(1:101)|78|(7:81|82|83|(1:85)|(3:87|88|89)(1:91)|90|79)|94|95|96|97|98))|102)))|109)))|6|(0)|16|(10:18|20|(0)(0)|23|(1:24)|51|52|53|54|55)|59|(0)(0)|62|(0)(0)|65|(0)(0)|68|69|70|71|(0)|102) */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0235, code lost:
        com.fyber.inneractive.sdk.util.IAlog.e("Got exception adding param to json object: %s, %s", "number_of_endcards", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x024d  */
    @Override // com.fyber.inneractive.sdk.response.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fyber.inneractive.sdk.external.InneractiveErrorCode a(com.fyber.inneractive.sdk.external.InneractiveAdRequest r18, com.fyber.inneractive.sdk.config.global.s r19) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.response.g.a(com.fyber.inneractive.sdk.external.InneractiveAdRequest, com.fyber.inneractive.sdk.config.global.s):com.fyber.inneractive.sdk.external.InneractiveErrorCode");
    }
}
