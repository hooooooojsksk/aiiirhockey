package com.fyber.inneractive.sdk.bidder.adm;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.factories.b;
import com.fyber.inneractive.sdk.ignite.k;
import com.fyber.inneractive.sdk.network.k0;
import com.fyber.inneractive.sdk.network.m;
import com.fyber.inneractive.sdk.network.n0;
import com.fyber.inneractive.sdk.network.p0;
import com.fyber.inneractive.sdk.response.j;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class f implements j {
    public AdmParametersOuterClass$AdmParameters a;
    public final String b;
    public String c;
    public final String d;

    /* loaded from: classes.dex */
    public interface a {
    }

    public f(String str, String str2) {
        this.b = str;
        this.d = str2;
    }

    public static boolean a(f fVar, Exception exc) {
        fVar.getClass();
        return (exc instanceof p0) && ((p0) exc).a == 404;
    }

    public int b() {
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.a;
        if (admParametersOuterClass$AdmParameters != null) {
            return admParametersOuterClass$AdmParameters.getAdType().a();
        }
        return AdmParametersOuterClass$AdmParameters.a.UNRECOGNIZED.a();
    }

    public static void a(f fVar, a aVar) {
        int a2;
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = fVar.a;
        com.fyber.inneractive.sdk.response.e eVar = null;
        String markupUrl = (admParametersOuterClass$AdmParameters == null || !admParametersOuterClass$AdmParameters.hasMarkupUrl()) ? null : fVar.a.getMarkupUrl();
        if (!TextUtils.isEmpty(markupUrl)) {
            try {
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = fVar.a;
                if (admParametersOuterClass$AdmParameters2 != null) {
                    a2 = admParametersOuterClass$AdmParameters2.getAdType().a();
                } else {
                    a2 = AdmParametersOuterClass$AdmParameters.a.UNRECOGNIZED.a();
                }
                com.fyber.inneractive.sdk.response.a a3 = com.fyber.inneractive.sdk.response.a.a(a2);
                if (a3 == null) {
                    a3 = com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID;
                }
                com.fyber.inneractive.sdk.response.b a4 = b.a.a.a(a3);
                if (a4 != null) {
                    a4.a((m) null);
                    fVar.a(a4);
                    eVar = a4.a;
                } else {
                    IAlog.a("failed parse adm network request with no input stream - received ad type %s does not have an appropriate parser", Integer.valueOf(a2));
                }
            } catch (Exception e) {
                IAlog.a("failed parse adm network request with no input stream", e, new Object[0]);
            }
            com.fyber.inneractive.sdk.response.e eVar2 = eVar;
            c cVar = new c(fVar, aVar, eVar2);
            IAConfigManager iAConfigManager = IAConfigManager.M;
            k0 k0Var = new k0(cVar, markupUrl, fVar, iAConfigManager.L, eVar2);
            k0Var.d = new d(fVar);
            iAConfigManager.s.a.offer(k0Var);
            k0Var.a(n0.QUEUED);
            return;
        }
        com.fyber.inneractive.sdk.util.m.b.post(new e(fVar, aVar));
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public void a(com.fyber.inneractive.sdk.response.b bVar) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        String str5;
        String str6;
        long j;
        int i;
        int i2;
        int i3;
        String str7;
        bVar.a.B = true;
        IAConfigManager.M.x.e = true;
        ImpressionData impressionData = new ImpressionData();
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.a;
        if (admParametersOuterClass$AdmParameters == null) {
            return;
        }
        int a2 = admParametersOuterClass$AdmParameters.getAdType().a();
        if (this.a.hasErrorMessage()) {
            this.a.getErrorMessage();
        }
        String sessionId = this.a.hasSessionId() ? this.a.getSessionId() : null;
        Long valueOf = this.a.hasContentId() ? Long.valueOf(this.a.getContentId()) : null;
        if (this.a.hasPublisherId()) {
            this.a.getPublisherId();
        }
        Integer valueOf2 = this.a.hasAdWidth() ? Integer.valueOf(this.a.getAdWidth()) : null;
        Integer valueOf3 = this.a.hasAdHeight() ? Integer.valueOf(this.a.getAdHeight()) : null;
        String sdkImpressionUrl = this.a.hasSdkImpressionUrl() ? this.a.getSdkImpressionUrl() : null;
        String sdkClickUrl = this.a.hasSdkClickUrl() ? this.a.getSdkClickUrl() : null;
        Integer valueOf4 = this.a.hasAdExpirationInterval() ? Integer.valueOf(this.a.getAdExpirationInterval()) : null;
        String adCompletionUrl = this.a.hasAdCompletionUrl() ? this.a.getAdCompletionUrl() : null;
        bVar.b = this.a.hasAdUnitId() ? this.a.getAdUnitId() : null;
        this.a.getAdUnitType().name().toLowerCase();
        String lowerCase = this.a.hasAdUnitId() ? this.a.getAdUnitDisplayType().name().toLowerCase() : null;
        String adNetworkName = this.a.hasAdNetworkName() ? this.a.getAdNetworkName() : null;
        Long valueOf5 = this.a.hasAdNetworkId() ? Long.valueOf(this.a.getAdNetworkId()) : null;
        String creativeId = this.a.hasCreativeId() ? this.a.getCreativeId() : null;
        String adDomain = this.a.hasAdDomain() ? this.a.getAdDomain() : null;
        if (this.a.hasAppBundleId()) {
            str2 = this.a.getAppBundleId();
            str = lowerCase;
        } else {
            str = lowerCase;
            str2 = null;
        }
        String campaignId = this.a.hasCampaignId() ? this.a.getCampaignId() : null;
        if (this.a.hasPricingValue()) {
            str4 = Double.toString(this.a.getPricingValue());
            str3 = adCompletionUrl;
        } else {
            str3 = adCompletionUrl;
            str4 = null;
        }
        String valueOf6 = this.a.hasSpotId() ? String.valueOf(this.a.getSpotId()) : null;
        impressionData.setCpmValue(str4);
        impressionData.setCurrency("USD");
        if (this.a.hasMrcData()) {
            if (this.a.getMrcData().hasPixelPercent()) {
                i2 = this.a.getMrcData().getPixelPercent();
                str6 = sdkClickUrl;
            } else {
                str6 = sdkClickUrl;
                i2 = 0;
            }
            if (this.a.getMrcData().hasPixelDuration()) {
                i3 = this.a.getMrcData().getPixelDuration();
                str5 = sdkImpressionUrl;
            } else {
                str5 = sdkImpressionUrl;
                i3 = -1;
            }
            if (this.a.getMrcData().hasPixelImpressionUrl()) {
                str7 = this.a.getMrcData().getPixelImpressionUrl();
                num = valueOf3;
            } else {
                num = valueOf3;
                str7 = null;
            }
            com.fyber.inneractive.sdk.response.e eVar = bVar.a;
            eVar.t = i2;
            eVar.u = i3;
            eVar.v = str7;
        } else {
            num = valueOf3;
            str5 = sdkImpressionUrl;
            str6 = sdkClickUrl;
        }
        Boolean valueOf7 = this.a.hasSkipMode() ? Boolean.valueOf(this.a.getSkipMode()) : null;
        if (bVar.b()) {
            bVar.a.q = this.a.toString();
        }
        com.fyber.inneractive.sdk.response.e eVar2 = bVar.a;
        String num2 = valueOf4 != null ? valueOf4.toString() : "";
        eVar2.getClass();
        try {
            j = Long.parseLong(num2);
        } catch (NumberFormatException unused) {
            j = 20;
        }
        long j2 = j;
        eVar2.b = j2;
        Integer num3 = valueOf2;
        Boolean bool = valueOf7;
        eVar2.a = eVar2.c + TimeUnit.MINUTES.toMillis(j2);
        impressionData.setImpressionId(sessionId);
        impressionData.setDemandSource(adNetworkName);
        bVar.a.d = valueOf != null ? valueOf.toString() : "";
        bVar.a.getClass();
        bVar.a.getClass();
        com.fyber.inneractive.sdk.response.e eVar3 = bVar.a;
        eVar3.y = str2;
        eVar3.z = this.d;
        eVar3.A = valueOf6;
        if (valueOf5 != null) {
            impressionData.setDemandId(valueOf5);
        }
        com.fyber.inneractive.sdk.response.e eVar4 = bVar.a;
        eVar4.g = a2;
        if (num3 != null) {
            eVar4.e = num3.intValue();
        }
        if (num != null) {
            bVar.a.f = num.intValue();
        }
        com.fyber.inneractive.sdk.response.e eVar5 = bVar.a;
        eVar5.k = str5;
        eVar5.l = str6;
        eVar5.o = str3;
        eVar5.m = bVar.b;
        try {
            eVar5.n = UnitDisplayType.fromValue(str);
        } catch (IllegalArgumentException unused2) {
            bVar.a.n = UnitDisplayType.INTERSTITIAL;
        }
        if (!TextUtils.isEmpty(creativeId)) {
            impressionData.setCreativeId(creativeId);
        }
        if (!TextUtils.isEmpty(adDomain)) {
            impressionData.setAdvertiserDomain(adDomain);
        }
        if (!TextUtils.isEmpty(campaignId)) {
            impressionData.setCampaignId(campaignId);
        }
        impressionData.setCountry(com.fyber.inneractive.sdk.util.j.g());
        bVar.a.r = impressionData;
        if (bool == null) {
            i = -1;
        } else {
            i = bool.booleanValue() ? 1 : 0;
        }
        bVar.a.w = i;
        String igniteInstallUrl = this.a.hasIgniteInstallUrl() ? this.a.getIgniteInstallUrl() : null;
        if (!TextUtils.isEmpty(igniteInstallUrl)) {
            bVar.a.E = igniteInstallUrl;
        }
        com.fyber.inneractive.sdk.response.e eVar6 = bVar.a;
        k kVar = k.NONE;
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = this.a;
        if (admParametersOuterClass$AdmParameters2 != null) {
            AdmParametersOuterClass$AdmParameters.f igniteMode = admParametersOuterClass$AdmParameters2.hasIgniteMode() ? this.a.getIgniteMode() : null;
            if (igniteMode != null && !igniteMode.equals(AdmParametersOuterClass$AdmParameters.f.NONE)) {
                kVar = igniteMode.equals(AdmParametersOuterClass$AdmParameters.f.SINGLETAP) ? k.SINGLE_TAP : k.TRUE_SINGLE_TAP;
            }
        }
        eVar6.a(kVar);
        String igniteLauncherActivity = this.a.hasIgniteLauncherActivity() ? this.a.getIgniteLauncherActivity() : null;
        if (!TextUtils.isEmpty(igniteLauncherActivity)) {
            bVar.a.G = igniteLauncherActivity;
        }
        Boolean valueOf8 = this.a.hasBrandBidderDontShowEndcard() ? Boolean.valueOf(this.a.getBrandBidderDontShowEndcard()) : null;
        if (valueOf8 != null) {
            bVar.a.C = valueOf8.booleanValue() ? "1" : "0";
        }
        String brandBidderCtaText = this.a.getBrandBidderCtaText();
        if (!TextUtils.isEmpty(brandBidderCtaText)) {
            bVar.a.D = brandBidderCtaText;
        }
        Boolean valueOf9 = this.a.hasMraidVideoOMSignal() ? Boolean.valueOf(this.a.getMraidVideoOMSignal()) : null;
        if (valueOf9 != null) {
            bVar.a.H = valueOf9.booleanValue();
        }
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public String a() {
        return this.c;
    }
}
