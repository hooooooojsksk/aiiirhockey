package com.fyber.inneractive.sdk.external;

import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.o;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class BidTokenProvider {
    public static String getBidderToken() {
        boolean z = false;
        if (!InneractiveAdManager.wasInitialized()) {
            IAlog.b("BidTokenProvider: Cannot generate token. Please init Fyber Marketplace SDK.", new Object[0]);
            return null;
        }
        com.fyber.inneractive.sdk.bidder.a aVar = com.fyber.inneractive.sdk.bidder.a.i;
        if (aVar.f.get() == null) {
            synchronized (aVar.h) {
                aVar.a();
            }
        } else {
            aVar.b();
        }
        String str = aVar.f.get();
        IAConfigManager iAConfigManager = IAConfigManager.M;
        String str2 = iAConfigManager.m;
        int i = 2000;
        if (TextUtils.isEmpty(str2)) {
            str2 = EnvironmentCompat.MEDIA_UNKNOWN;
        } else {
            i = iAConfigManager.u.b.a(aVar.e.get(str2.toLowerCase()), 2000, 1);
        }
        if (str != null && str.getBytes().length > i) {
            q.a aVar2 = new q.a(o.TOKEN_EXCEEDS_LIMIT);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mediator", str2);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", "mediator", str2);
            }
            Integer valueOf = Integer.valueOf(str.getBytes().length);
            try {
                jSONObject.put("token_size", valueOf);
            } catch (Exception unused2) {
                IAlog.e("Got exception adding param to json object: %s, %s", "token_size", valueOf);
            }
            Integer valueOf2 = Integer.valueOf(i);
            try {
                jSONObject.put("token_limit", valueOf2);
            } catch (Exception unused3) {
                IAlog.e("Got exception adding param to json object: %s, %s", "token_limit", valueOf2);
            }
            aVar2.f.put(jSONObject);
            aVar2.a((String) null);
            z = true;
        }
        if (z) {
            return null;
        }
        return str;
    }
}
