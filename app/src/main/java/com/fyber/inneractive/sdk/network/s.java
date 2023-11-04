package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Calendar;
import java.util.TimeZone;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s {
    public SharedPreferences a = null;

    /* loaded from: classes.dex */
    public static final class a {
        public static s a = new s();
    }

    public static void a(Context context, String str, String str2, com.fyber.inneractive.sdk.flow.o<? extends com.fyber.inneractive.sdk.response.e> oVar) {
        int i;
        if (context != null && str != null && oVar.d() != null) {
            s sVar = a.a;
            if (sVar.a == null) {
                sVar.a = context.getSharedPreferences("AutoWebActionPrefs", 0);
            }
            IAlog.d("IAautoWebActionReporter: reporting action: %s", str);
            IAlog.d("IAautoWebActionReporter: url: %s", str2);
            IAConfigManager iAConfigManager = IAConfigManager.M;
            if (!iAConfigManager.i.d) {
                IAlog.a("IAautoWebActionReporter: Report of Non user web actions disabled!", new Object[0]);
                return;
            }
            q.a aVar = new q.a(o.MRAID_AUTO_ACTION_DETECTED, oVar.a, oVar.d(), oVar.c.c());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("action", str);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", "action", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    jSONObject.put(ImagesContract.URL, str2);
                } catch (Exception unused2) {
                    IAlog.e("Got exception adding param to json object: %s, %s", ImagesContract.URL, str2);
                }
            }
            long j = sVar.a.getLong("lastReportTS", 0L);
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            Calendar calendar = Calendar.getInstance(timeZone);
            Calendar calendar2 = Calendar.getInstance(timeZone);
            calendar2.setTimeInMillis(j);
            if (j <= 0 || calendar.get(6) != calendar2.get(6)) {
                i = 0;
            } else {
                IAlog.d("IAautoWebActionReporter: encountered same date", new Object[0]);
                i = sVar.a.getInt("numReportsToday", 0);
            }
            int i2 = iAConfigManager.i.e;
            int i3 = i + 1;
            IAlog.d("IAautoWebActionReporter: day counter: %d max: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            if (i < i2) {
                IAlog.d("IAautoWebActionReporter: adding ad data", new Object[0]);
                aVar.g = true;
            } else {
                IAlog.d("IAautoWebActionReporter: not adding ad data", new Object[0]);
            }
            Integer valueOf = Integer.valueOf(i3);
            try {
                jSONObject.put("daily_count", valueOf);
            } catch (Exception unused3) {
                IAlog.e("Got exception adding param to json object: %s, %s", "daily_count", valueOf);
            }
            aVar.f.put(jSONObject);
            aVar.a((String) null);
            SharedPreferences.Editor edit = sVar.a.edit();
            edit.putLong("lastReportTS", calendar.getTimeInMillis());
            edit.putInt("numReportsToday", i3);
            edit.apply();
            return;
        }
        IAlog.a("Invalid report request parameters!", new Object[0]);
    }
}
