package com.fyber.inneractive.sdk.dv.banner;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.dv.f;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.flow.o;
import com.fyber.inneractive.sdk.flow.p;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l;
import com.google.android.gms.ads.AdView;

/* loaded from: classes.dex */
public class b extends p<a, InneractiveAdViewEventsListener> implements com.fyber.inneractive.sdk.interfaces.b {
    public ViewGroup l;

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a(int i) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a(ViewGroup viewGroup) {
        AdContent adcontent;
        if (this.a == null) {
            IAlog.e("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
        } else if (viewGroup == null || (adcontent = this.b) == 0) {
        } else {
            a aVar = (a) adcontent;
            if (aVar.i != 0) {
                aVar.h = this;
                if (aVar.j) {
                    w();
                    aVar.j = false;
                }
                this.l = viewGroup;
                viewGroup.addView((View) ((a) this.b).i);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        AdContent adcontent = this.b;
        if (adcontent != 0) {
            a aVar = (a) adcontent;
            if (aVar.i != 0) {
                ((AdView) aVar.i).destroy();
            }
            ((a) this.b).a();
        }
        ViewGroup viewGroup = this.l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.l = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public int f() {
        AdContent adcontent = this.b;
        if (adcontent != 0) {
            a aVar = (a) adcontent;
            if (aVar.i == 0 || ((AdView) aVar.i).getAdSize() == null) {
                return 0;
            }
            return l.b(((AdView) ((a) this.b).i).getAdSize().getWidth());
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void n() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public int p() {
        AdContent adcontent = this.b;
        if (adcontent != 0) {
            a aVar = (a) adcontent;
            if (aVar.i == 0 || ((AdView) aVar.i).getAdSize() == null) {
                return 0;
            }
            return l.b(((AdView) ((a) this.b).i).getAdSize().getHeight());
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void r() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void u() {
        ViewGroup viewGroup = this.l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.l = null;
        }
    }

    public void w() {
        com.fyber.inneractive.sdk.cache.session.enums.b bVar;
        E();
        AdContent adcontent = this.b;
        if (adcontent != 0) {
            a aVar = (a) adcontent;
            if (((f) aVar.b) != null) {
                b((f) aVar.b);
                a aVar2 = (a) this.b;
                if (aVar2.d == null || ((a0) aVar2.d).c == null) {
                    return;
                }
                com.fyber.inneractive.sdk.cache.session.enums.a aVar3 = com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION;
                if (((a0) aVar2.d).c.b == UnitDisplayType.MRECT) {
                    bVar = com.fyber.inneractive.sdk.cache.session.enums.b.RECTANGLE_DISPLAY;
                } else {
                    bVar = com.fyber.inneractive.sdk.cache.session.enums.b.BANNER_DISPLAY;
                }
                a(aVar3, bVar);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p
    public View y() {
        return this.l;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public boolean a(o oVar) {
        return oVar instanceof com.fyber.inneractive.sdk.dv.a;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public boolean a(View view) {
        ViewGroup viewGroup = this.l;
        return viewGroup != null && viewGroup.equals(view);
    }
}
