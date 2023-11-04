package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.network.l;
import com.fyber.inneractive.sdk.network.m;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.q;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class k implements j {
    public final m a;

    public k(m mVar) {
        this.a = mVar;
    }

    public final String a(Map<String, String> map, l lVar) {
        String lowerCase = lVar.key.toLowerCase();
        String str = map.get(lowerCase);
        IAlog.d("%s%s extracted from response header: %s", IAlog.a(this), lowerCase, str);
        int i = IAlog.a;
        IAlog.a(1, null, "%s %s : %s", "RESPONSE_HEADER", lowerCase, str);
        return str;
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public void a(b bVar) {
        long j;
        bVar.a.B = false;
        IAConfigManager.M.x.e = false;
        ImpressionData impressionData = new ImpressionData();
        Map<String, String> p = this.a.p();
        String a = a(p, l.RETURNED_AD_TYPE);
        a(p, l.ERROR_CODE);
        String a2 = a(p, l.SESSION_ID);
        String a3 = a(p, l.CONTENT_ID);
        a(p, l.PUBLISHER_ID);
        String a4 = a(p, l.WIDTH);
        String a5 = a(p, l.HEIGHT);
        String a6 = a(p, l.SDK_IMPRESSION_URL);
        String a7 = a(p, l.SDK_CLICK_URL);
        String a8 = a(p, l.AD_TIMEOUT);
        String a9 = a(p, l.AD_COMPLETION_URL);
        bVar.b = a(p, l.AD_UNIT_ID);
        a(p, l.AD_UNIT_TYPE);
        String a10 = a(p, l.AD_UNIT_DISPLAY_TYPE);
        String a11 = a(p, l.AD_NETWORK);
        String a12 = a(p, l.AD_NETWORK_ID);
        String a13 = a(p, l.CREATIVE_ID);
        String a14 = a(p, l.AD_DOMAIN);
        String a15 = a(p, l.APP_BUNDLE);
        String a16 = a(p, l.CAMPAIGN_ID);
        String a17 = a(p, l.CPM_VALUE);
        String a18 = a(p, l.CPM_CURRENCY);
        impressionData.setCpmValue(a17);
        impressionData.setCurrency(a18);
        String a19 = a(p, l.BANNER_MRC_PERCENT);
        String a20 = a(p, l.BANNER_MRC_DURATION);
        String a21 = a(p, l.BANNER_MRC_IMPRESSION_URL);
        String a22 = a(p, l.INTERSTITIAL_SKIP_MODE);
        String a23 = a(p, l.IGNITE_INSTALL_URL);
        String a24 = a(p, l.IGNITE_MODE);
        String a25 = a(p, l.APP_BUNDLE_LAUNCHER);
        String a26 = a(p, l.BRAND_BIDDER_SHOW_ENDCARD);
        String a27 = a(p, l.BRAND_BIDDER_CTA_TEXT);
        String a28 = a(p, l.MRAID_VIDEO_SIGNAL);
        if (bVar.b()) {
            bVar.a.p = p;
        }
        e eVar = bVar.a;
        eVar.getClass();
        try {
            j = Long.parseLong(a8);
        } catch (NumberFormatException unused) {
            j = 20;
        }
        long j2 = j;
        eVar.b = j2;
        eVar.a = eVar.c + TimeUnit.MINUTES.toMillis(j2);
        impressionData.setImpressionId(a2);
        impressionData.setDemandSource(a11);
        e eVar2 = bVar.a;
        eVar2.d = a3;
        eVar2.getClass();
        bVar.a.y = a15;
        if (!TextUtils.isEmpty(a12)) {
            impressionData.setDemandId(Long.valueOf(a12));
        }
        if (!TextUtils.isEmpty(a)) {
            bVar.a.g = Integer.valueOf(a).intValue();
        }
        if (!TextUtils.isEmpty(a4)) {
            bVar.a.e = Integer.valueOf(a4).intValue();
        }
        if (!TextUtils.isEmpty(a5)) {
            bVar.a.f = Integer.valueOf(a5).intValue();
        }
        e eVar3 = bVar.a;
        eVar3.k = a6;
        eVar3.l = a7;
        eVar3.o = a9;
        eVar3.m = bVar.b;
        try {
            eVar3.n = UnitDisplayType.fromValue(a10);
        } catch (IllegalArgumentException unused2) {
            bVar.a.n = UnitDisplayType.INTERSTITIAL;
        }
        if (!TextUtils.isEmpty(a13)) {
            impressionData.setCreativeId(a13);
        }
        if (!TextUtils.isEmpty(a14)) {
            impressionData.setAdvertiserDomain(a14);
        }
        if (!TextUtils.isEmpty(a16)) {
            impressionData.setCampaignId(a16);
        }
        impressionData.setCountry(com.fyber.inneractive.sdk.util.j.g());
        e eVar4 = bVar.a;
        eVar4.r = impressionData;
        boolean z = false;
        eVar4.t = q.a(a19, 0);
        e eVar5 = bVar.a;
        float f = -1.0f;
        if (!TextUtils.isEmpty(a20)) {
            try {
                f = Float.parseFloat(a20);
            } catch (NumberFormatException unused3) {
            }
        }
        eVar5.u = f;
        e eVar6 = bVar.a;
        eVar6.v = a21;
        eVar6.w = q.a(a22, -1);
        if (!TextUtils.isEmpty(a23)) {
            bVar.a.E = a23;
        }
        if (!TextUtils.isEmpty(a24)) {
            bVar.a.a(com.fyber.inneractive.sdk.ignite.k.a(a24));
        }
        if (!TextUtils.isEmpty(a25)) {
            bVar.a.G = a25;
        }
        if (!TextUtils.isEmpty(a26)) {
            bVar.a.C = a26;
        }
        if (!TextUtils.isEmpty(a27)) {
            bVar.a.D = a27;
        }
        bVar.a.H = ("1".equals(a28) || Boolean.parseBoolean(a28)) ? true : true;
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public String a() {
        return this.a.d().toString();
    }
}
