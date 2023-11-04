package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.web.i;
import java.util.Map;

/* loaded from: classes.dex */
public class n extends a {
    public n(Map<String, String> map, com.fyber.inneractive.sdk.web.i iVar, k0 k0Var) {
        super(map, iVar, k0Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public void a() {
        String str = this.b.get("uri");
        if (str != null && !"".equals(str)) {
            L l = ((IAmraidWebViewController) this.c).g;
            if (l != 0) {
                ((i.f) l).a(str);
                return;
            }
            return;
        }
        this.c.a(g.PLAY_VIDEO, "Video can't be played with null or empty URL");
    }

    @Override // com.fyber.inneractive.sdk.mraid.a
    public String c() {
        return this.b.get("uri");
    }
}
