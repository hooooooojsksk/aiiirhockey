package com.fyber.inneractive.sdk.dv.interstitial;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.b0;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.dv.f;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.l;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/* loaded from: classes.dex */
public class c extends com.fyber.inneractive.sdk.a<InterstitialAd> {
    public final AdListener k;
    public final AdListener l;

    /* loaded from: classes.dex */
    public class a extends AdListener {
        public a() {
            c.this = r1;
        }

        public void onAdFailedToLoad(int i) {
            com.fyber.inneractive.sdk.dv.d dVar = c.this.g;
            if (dVar != null) {
                ((com.fyber.inneractive.sdk.dv.b) dVar).f();
                InneractiveAdRequest inneractiveAdRequest = c.this.a;
                String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
                com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
                c cVar = c.this;
                com.fyber.inneractive.sdk.dv.handler.c.a(spotId, aVar, cVar.a, (f) cVar.b, String.format("errorCode - %d", Integer.valueOf(i)));
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            c cVar = c.this;
            if (cVar.g != null) {
                cVar.j();
                ((com.fyber.inneractive.sdk.dv.b) c.this.g).d();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends AdListener {
        public b() {
            c.this = r1;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            com.fyber.inneractive.sdk.dv.interstitial.a aVar = c.this.j;
            if (aVar != null) {
                aVar.d();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            com.fyber.inneractive.sdk.dv.interstitial.a aVar = c.this.j;
            if (aVar != null) {
                aVar.i();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            com.fyber.inneractive.sdk.dv.interstitial.a aVar = c.this.j;
            if (aVar != null) {
                aVar.w();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            com.fyber.inneractive.sdk.dv.interstitial.a aVar = c.this.j;
            if (aVar != null) {
                aVar.w();
            }
        }
    }

    public c(b0 b0Var, s sVar, f fVar) {
        super(b0Var, sVar, fVar);
        this.k = new a();
        this.l = new b();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.google.android.gms.ads.InterstitialAd] */
    @Override // com.fyber.inneractive.sdk.dv.a
    public void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.d dVar) {
        this.g = dVar;
        ?? interstitialAd = new InterstitialAd(l.a);
        this.i = interstitialAd;
        interstitialAd.setAdListener(this.k);
        ((InterstitialAd) this.i).setAdUnitId("FyberInterstitial");
        ((InterstitialAd) this.i).loadAd(adRequest);
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public boolean e() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.dv.a, com.fyber.inneractive.sdk.flow.o
    public boolean g() {
        T t = this.i;
        return t != 0 && ((InterstitialAd) t).isLoaded();
    }

    @Override // com.fyber.inneractive.sdk.a
    public void a(com.fyber.inneractive.sdk.dv.interstitial.a aVar, Activity activity) {
        this.j = aVar;
        T t = this.i;
        if (t != 0) {
            ((InterstitialAd) t).setAdListener(this.l);
            ((InterstitialAd) this.i).show();
        }
    }
}
