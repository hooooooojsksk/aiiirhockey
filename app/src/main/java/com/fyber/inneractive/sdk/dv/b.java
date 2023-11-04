package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;

/* loaded from: classes.dex */
public class b extends com.fyber.inneractive.sdk.flow.g<f, com.fyber.inneractive.sdk.dv.a> implements d {
    public boolean h = !l.a("com.google.android.gms.ads.InterstitialAd");

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UnitDisplayType.values().length];
            a = iArr;
            try {
                iArr[UnitDisplayType.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UnitDisplayType.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[UnitDisplayType.MRECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[UnitDisplayType.REWARDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.g
    public String b() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.g
    public void e() {
        com.fyber.inneractive.sdk.dv.a cVar;
        Response response = this.b;
        if (response != 0 && ((f) response).s != null) {
            InneractiveAdRequest inneractiveAdRequest = this.a;
            if (inneractiveAdRequest != null) {
                boolean muteVideo = inneractiveAdRequest.getMuteVideo();
                try {
                    MobileAds.setAppMuted(muteVideo);
                    MobileAds.setAppVolume(muteVideo ? 0.0f : 1.0f);
                } catch (Throwable unused) {
                }
            }
            f fVar = (f) this.b;
            UnitDisplayType unitDisplayType = fVar.n;
            QueryInfo queryInfo = fVar.s.a;
            int i = a.a[unitDisplayType.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    cVar = new com.fyber.inneractive.sdk.dv.banner.a(c(), this.f, (f) this.b);
                } else if (i != 4) {
                    cVar = null;
                } else if (this.h) {
                    cVar = new com.fyber.inneractive.sdk.dv.rewarded.a(c(), this.f, (f) this.b);
                } else {
                    cVar = new com.fyber.inneractive.sdk.dv.rewarded.b(c(), this.f, (f) this.b);
                }
            } else if (this.h) {
                cVar = new com.fyber.inneractive.sdk.dv.interstitial.b(c(), this.f, (f) this.b);
            } else {
                cVar = new com.fyber.inneractive.sdk.dv.interstitial.c(c(), this.f, (f) this.b);
            }
            this.c = cVar;
            if (queryInfo != null && cVar != null && this.b != 0) {
                try {
                    AdRequest.Builder builder = new AdRequest.Builder();
                    try {
                        builder.getClass().getMethod("setAdString", String.class).invoke(builder, ((f) this.b).I);
                    } catch (Exception unused2) {
                        builder.setAdInfo(new AdInfo(queryInfo, ((f) this.b).I));
                    }
                    ((com.fyber.inneractive.sdk.dv.a) this.c).a(builder.build(), this);
                    return;
                } catch (Throwable unused3) {
                    f();
                    return;
                }
            }
            f();
            return;
        }
        f();
    }

    public void f() {
        a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.f.NETWORK_ERROR));
    }
}
