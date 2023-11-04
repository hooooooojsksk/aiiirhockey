package com.fyber.inneractive.sdk.dv.interstitial;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.b0;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.dv.f;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* loaded from: classes.dex */
public class b extends com.fyber.inneractive.sdk.a<InterstitialAd> {
    public final InterstitialAdLoadCallback k;
    public final FullScreenContentCallback l;

    /* loaded from: classes.dex */
    public class a extends InterstitialAdLoadCallback {
        public a() {
            b.this = r1;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            com.fyber.inneractive.sdk.dv.d dVar = b.this.g;
            if (dVar != null) {
                ((com.fyber.inneractive.sdk.dv.b) dVar).f();
                InneractiveAdRequest inneractiveAdRequest = b.this.a;
                String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
                com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
                b bVar = b.this;
                com.fyber.inneractive.sdk.dv.handler.c.a(spotId, aVar, bVar.a, (f) bVar.b, loadAdError.getMessage());
            }
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, com.google.android.gms.ads.interstitial.InterstitialAd] */
        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(InterstitialAd interstitialAd) {
            InterstitialAd interstitialAd2 = interstitialAd;
            b bVar = b.this;
            if (bVar.g != null) {
                bVar.i = interstitialAd2;
                bVar.j();
                ((com.fyber.inneractive.sdk.dv.b) b.this.g).d();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.interstitial.b$b */
    /* loaded from: classes.dex */
    public class C0012b extends FullScreenContentCallback {
        public C0012b() {
            b.this = r1;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            com.fyber.inneractive.sdk.dv.interstitial.a aVar = b.this.j;
            if (aVar != null) {
                aVar.i();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            com.fyber.inneractive.sdk.dv.interstitial.a aVar = b.this.j;
            if (aVar != null) {
                aVar.w();
            }
        }
    }

    public b(b0 b0Var, s sVar, f fVar) {
        super(b0Var, sVar, fVar);
        this.k = new a();
        this.l = new C0012b();
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.d dVar) {
        this.g = dVar;
        InterstitialAd.load(l.a, "FyberInterstitial", adRequest, this.k);
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public boolean e() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.dv.a, com.fyber.inneractive.sdk.flow.o
    public boolean g() {
        return this.i != 0;
    }

    @Override // com.fyber.inneractive.sdk.a
    public void a(com.fyber.inneractive.sdk.dv.interstitial.a aVar, Activity activity) {
        this.j = aVar;
        T t = this.i;
        if (t != 0) {
            ((InterstitialAd) t).setFullScreenContentCallback(this.l);
            ((InterstitialAd) this.i).show(activity);
        }
    }
}
