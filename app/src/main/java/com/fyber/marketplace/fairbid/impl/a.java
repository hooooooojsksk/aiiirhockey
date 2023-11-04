package com.fyber.marketplace.fairbid.impl;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.factories.b;
import com.fyber.inneractive.sdk.interfaces.a;
import com.fyber.inneractive.sdk.network.l;
import com.fyber.inneractive.sdk.network.m;
import com.fyber.inneractive.sdk.network.o;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.response.k;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters;
import com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a {
    public e adSpot;
    public MarketplaceAuctionParameters mMarketplaceAuctionParameters;
    private com.fyber.marketplace.fairbid.impl.c mMarketplaceAuctionResponse;
    private boolean mMuted;
    public String mPlacementId;
    public com.fyber.inneractive.sdk.dv.g mWrapperQueryInfo;

    /* renamed from: com.fyber.marketplace.fairbid.impl.a$a */
    /* loaded from: classes.dex */
    public class RunnableC0060a implements Runnable {
        public final /* synthetic */ MarketplaceAdLoadListener a;
        public final /* synthetic */ com.fyber.inneractive.sdk.response.a b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Map d;
        public final /* synthetic */ InneractiveUnitController e;

        public RunnableC0060a(MarketplaceAdLoadListener marketplaceAdLoadListener, com.fyber.inneractive.sdk.response.a aVar, String str, Map map, InneractiveUnitController inneractiveUnitController) {
            a.this = r1;
            this.a = marketplaceAdLoadListener;
            this.b = aVar;
            this.c = str;
            this.d = map;
            this.e = inneractiveUnitController;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.loadParsedData(this.e, this.a, a.this.parseResponseData(this.a, this.b, this.c, this.d), a.this.getAdContentLoader(this.a, this.b));
        }
    }

    /* loaded from: classes.dex */
    public class c implements m {
        public final /* synthetic */ Map a;
        public final /* synthetic */ String b;

        public c(a aVar, Map map, String str) {
            this.a = map;
            this.b = str;
        }

        @Override // com.fyber.inneractive.sdk.network.m
        public StringBuffer d() {
            return new StringBuffer(this.b);
        }

        @Override // com.fyber.inneractive.sdk.network.m
        public Map<String, String> p() {
            return this.a;
        }
    }

    public a(String str, JSONObject jSONObject, Map<String, String> map, boolean z, MarketplaceAuctionParameters marketplaceAuctionParameters) {
        Map<String, String> lowerCaseHeaders = lowerCaseHeaders(map);
        com.fyber.inneractive.sdk.response.a responseAdType = getResponseAdType(lowerCaseHeaders);
        this.mMarketplaceAuctionParameters = marketplaceAuctionParameters;
        this.mPlacementId = str;
        if (responseAdType != null) {
            this.mMarketplaceAuctionResponse = new com.fyber.marketplace.fairbid.impl.c(jSONObject, responseAdType, lowerCaseHeaders);
        }
        this.mMuted = z;
    }

    private void fireAdLoadFailedEvent(MarketplaceAdLoadError marketplaceAdLoadError) {
        if (isFullscreen()) {
            IAlog.a("Firing Event 801 - AdLoadFailed - errorCode - %s", marketplaceAdLoadError.getErrorMessage());
            q.a aVar = new q.a(o.IA_AD_LOAD_FAILED, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null, (JSONArray) null);
            JSONObject jSONObject = new JSONObject();
            String str = marketplaceAdLoadError.toString();
            try {
                jSONObject.put("message", str);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", "message", str);
            }
            String errorMessage = marketplaceAdLoadError.getErrorMessage();
            try {
                jSONObject.put("extra_description", errorMessage);
            } catch (Exception unused2) {
                IAlog.e("Got exception adding param to json object: %s, %s", "extra_description", errorMessage);
            }
            aVar.f.put(jSONObject);
            aVar.a((String) null);
        }
    }

    private com.fyber.inneractive.sdk.response.b generateParser(com.fyber.inneractive.sdk.response.a aVar, String str, Map<String, String> map) {
        com.fyber.inneractive.sdk.response.b a = b.a.a.a(aVar);
        IAlog.a("IA Exchange response handler: final headers: %s", map);
        if (a != null) {
            c cVar = new c(this, map, str);
            a.a = a.a();
            a.c = new k(cVar);
        }
        return a;
    }

    public void loadParsedData(InneractiveUnitController<?> inneractiveUnitController, MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.interfaces.a aVar) {
        if (eVar == null || aVar == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.m.b.post(new b(eVar, aVar, inneractiveUnitController, marketplaceAdLoadListener));
    }

    public com.fyber.inneractive.sdk.interfaces.a getAdContentLoader(MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener, com.fyber.inneractive.sdk.response.a aVar) {
        b.InterfaceC0016b interfaceC0016b = b.a.a.a.get(aVar);
        com.fyber.inneractive.sdk.interfaces.a a = interfaceC0016b != null ? interfaceC0016b.a() : null;
        if (a == null) {
            notifyFailToListener(MarketplaceAdLoadError.UNSUPPORTED_AD_TYPE, marketplaceAdLoadListener);
            return null;
        }
        return a;
    }

    public com.fyber.inneractive.sdk.response.a getResponseAdType(Map<String, String> map) {
        String str = map.get(l.RETURNED_AD_TYPE.key.toLowerCase(Locale.ENGLISH));
        if (str != null) {
            try {
                return com.fyber.inneractive.sdk.response.a.a(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public abstract void internalOnAdLoaded(a aVar, e eVar);

    public abstract boolean isFullscreen();

    public boolean isMuted() {
        return this.mMuted;
    }

    public void loadAd(InneractiveUnitController<?> inneractiveUnitController, MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener) {
        com.fyber.marketplace.fairbid.impl.c cVar = this.mMarketplaceAuctionResponse;
        if (cVar == null) {
            notifyFailToListener(MarketplaceAdLoadError.FAILED_TO_PARSE_AD_CONTENT, marketplaceAdLoadListener);
            return;
        }
        com.fyber.inneractive.sdk.response.a aVar = cVar.b;
        String str = cVar.a;
        Map<String, String> map = cVar.c;
        if (aVar != null && str != null && !map.isEmpty()) {
            com.fyber.inneractive.sdk.util.m.a(new RunnableC0060a(marketplaceAdLoadListener, aVar, str, map, inneractiveUnitController));
        } else {
            notifyFailToListener(MarketplaceAdLoadError.FAILED_TO_PARSE_AD_CONTENT, marketplaceAdLoadListener);
        }
    }

    public Map<String, String> lowerCaseHeaders(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (String str : map.keySet()) {
                hashMap.put(TextUtils.isEmpty(str) ? str : str.toLowerCase(Locale.ENGLISH), map.get(str));
            }
        }
        return hashMap;
    }

    public void notifyFailToListener(MarketplaceAdLoadError marketplaceAdLoadError, MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener) {
        fireAdLoadFailedEvent(marketplaceAdLoadError);
        marketplaceAdLoadListener.onAdLoadFailed(marketplaceAdLoadError);
    }

    public com.fyber.inneractive.sdk.response.e parseResponseData(MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener, com.fyber.inneractive.sdk.response.a aVar, String str, Map<String, String> map) {
        try {
            com.fyber.inneractive.sdk.response.e a = generateParser(aVar, str, map).a(str);
            com.fyber.inneractive.sdk.dv.g gVar = this.mWrapperQueryInfo;
            if (gVar != null) {
                a.s = gVar;
            }
            InneractiveErrorCode a2 = a.a((InneractiveAdRequest) null);
            if (a2 != null) {
                notifyFailToListener(MarketplaceAdLoadError.RESPONSE_VALIDATION_FAILED, marketplaceAdLoadListener);
                IAlog.a("failed parsing response data with error: %s", a2.toString());
                return null;
            }
            return a;
        } catch (Exception e) {
            notifyFailToListener(MarketplaceAdLoadError.FAILED_TO_PARSE_AD_CONTENT, marketplaceAdLoadListener);
            if (e.getMessage() != null) {
                IAlog.a("failed parsing response data with error: %s", e.getMessage());
            }
            return null;
        }
    }

    public void setQueryInfo(com.fyber.inneractive.sdk.dv.g gVar) {
        this.mWrapperQueryInfo = gVar;
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ com.fyber.inneractive.sdk.response.e a;
        public final /* synthetic */ com.fyber.inneractive.sdk.interfaces.a b;
        public final /* synthetic */ InneractiveUnitController c;
        public final /* synthetic */ MarketplaceAdLoadListener d;

        public b(com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.interfaces.a aVar, InneractiveUnitController inneractiveUnitController, MarketplaceAdLoadListener marketplaceAdLoadListener) {
            a.this = r1;
            this.a = eVar;
            this.b = aVar;
            this.c = inneractiveUnitController;
            this.d = marketplaceAdLoadListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            s featureProvider = aVar.mMarketplaceAuctionParameters.getFeatureProvider(aVar.mPlacementId);
            if (featureProvider == null) {
                featureProvider = s.b();
            }
            com.fyber.inneractive.sdk.response.e eVar = this.a;
            com.fyber.inneractive.sdk.config.global.e eVar2 = new com.fyber.inneractive.sdk.config.global.e();
            ImpressionData impressionData = eVar.r;
            eVar2.a = impressionData != null ? impressionData.getDemandId() : null;
            try {
                eVar2.b = Long.valueOf(IAConfigManager.M.d);
            } catch (NumberFormatException unused) {
                IAlog.a("invalid publisherId", new Object[0]);
            }
            featureProvider.a(eVar2);
            com.fyber.inneractive.sdk.interfaces.a aVar2 = this.b;
            com.fyber.inneractive.sdk.response.e eVar3 = this.a;
            boolean z = a.this.mMuted;
            C0061a c0061a = new C0061a();
            com.fyber.inneractive.sdk.flow.g gVar = (com.fyber.inneractive.sdk.flow.g) aVar2;
            gVar.g = z;
            gVar.a(null, eVar3, featureProvider, c0061a);
        }

        /* renamed from: com.fyber.marketplace.fairbid.impl.a$b$a */
        /* loaded from: classes.dex */
        public class C0061a implements a.InterfaceC0019a {
            public C0061a() {
                b.this = r1;
            }

            @Override // com.fyber.inneractive.sdk.interfaces.a.InterfaceC0019a
            public void a() {
                b bVar = b.this;
                a.this.adSpot = new e(bVar.c, ((com.fyber.inneractive.sdk.flow.g) bVar.b).c);
                a aVar = a.this;
                aVar.internalOnAdLoaded(aVar, aVar.adSpot);
            }

            @Override // com.fyber.inneractive.sdk.interfaces.a.InterfaceC0019a
            public void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
                b.this.d.onAdLoadFailed(MarketplaceAdLoadError.FAILED_TO_LOAD_AD);
            }
        }
    }
}
