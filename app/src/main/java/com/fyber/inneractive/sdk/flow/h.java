package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h extends i implements IAConfigManager.OnConfigurationReadyAndValidListener {
    public h(String str) {
        super(str);
    }

    public final void a(boolean z, com.fyber.inneractive.sdk.response.e eVar) {
        String format;
        String spotId = this.e.getSpotId();
        IAConfigManager iAConfigManager = IAConfigManager.M;
        String str = iAConfigManager.x.c.get("KEY_MISSMATCH_STATS_SPOTS");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (str.contains(String.format("-%s-", spotId))) {
            return;
        }
        q.a aVar = new q.a(com.fyber.inneractive.sdk.network.o.MISSMATCH_SPOTID, this.e, eVar, (JSONArray) null);
        if (z) {
            format = String.format("There is no %s spot ID in current app config", spotId);
        } else {
            format = String.format("spot ID %s is not active in current app config", spotId);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", format);
        } catch (Exception unused) {
            IAlog.e("Got exception adding param to json object: %s, %s", "reason", format);
        }
        aVar.f.put(jSONObject);
        aVar.a((String) null);
        iAConfigManager.x.c.put("KEY_MISSMATCH_STATS_SPOTS", String.format("%s -%s-", str, spotId));
    }

    @Override // com.fyber.inneractive.sdk.flow.i
    public String d() {
        return IAlog.a(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.i
    public void f() {
        super.f();
        b(this.e, c(), new InneractiveInfrastructureError(InneractiveErrorCode.IN_FLIGHT_TIMEOUT, f.NO_APP_CONFIG_AVAILABLE));
        g();
    }

    public void g() {
        IAConfigManager.removeListener(this);
        com.fyber.inneractive.sdk.network.n nVar = this.g;
        if (nVar != null) {
            nVar.e = true;
            nVar.c = null;
            nVar.f.a = true;
            this.g = null;
        }
        this.e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.h.h():void");
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        InneractiveErrorCode inneractiveErrorCode;
        IAConfigManager.removeListener(this);
        if (z) {
            h();
            return;
        }
        if (exc instanceof com.fyber.inneractive.sdk.network.b) {
            inneractiveErrorCode = InneractiveErrorCode.CONNECTION_ERROR;
        } else {
            inneractiveErrorCode = InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR;
        }
        b(this.e, c(), new InneractiveInfrastructureError(inneractiveErrorCode, f.NO_APP_CONFIG_AVAILABLE, exc));
    }
}
