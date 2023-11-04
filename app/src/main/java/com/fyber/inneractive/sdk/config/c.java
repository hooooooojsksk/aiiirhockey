package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import cz.msebera.android.httpclient.HttpStatus;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements com.fyber.inneractive.sdk.cache.a<IAConfigManager.c> {
    public boolean a = false;

    @Override // com.fyber.inneractive.sdk.cache.a
    public String a() {
        String str = IAConfigManager.M.c;
        StringBuilder sb = new StringBuilder("https://");
        int i = f.a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.baseConfigUrl");
        if (TextUtils.isEmpty(property)) {
            sb.append("cdn2.inner-active.mobi/ia-sdk-config/apps/");
        } else {
            sb.append(property);
        }
        sb.append(str);
        sb.append('/');
        sb.append(str);
        sb.append(".json");
        String sb2 = sb.toString();
        int i2 = IAlog.a;
        IAlog.a(1, null, "%s: %s", "APP_CONFIG_REQUEST", sb2);
        return sb2;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public String b() {
        return "IALastModifiedFromHeader";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public String c() {
        return "inneractive.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public boolean d() {
        String string = com.fyber.inneractive.sdk.util.l.a.getSharedPreferences("IAConfigurationPreferences", 0).getString("cached.config.appid", null);
        return string != null && string.equalsIgnoreCase(IAConfigManager.M.c);
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public void a(IAConfigManager.c cVar) {
        IAConfigManager.c cVar2 = cVar;
        if (cVar2 == null || cVar2.a == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.l.a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("cached.config.appid", cVar2.a).apply();
    }

    public final void a(Throwable th, String str) {
        String str2;
        String str3;
        String str4;
        if (this.a) {
            return;
        }
        this.a = true;
        if (TextUtils.isEmpty(str)) {
            str2 = "Empty Json Data";
        } else {
            str2 = str.substring(0, str.length() > 501 ? HttpStatus.SC_INTERNAL_SERVER_ERROR : str.length() - 1);
        }
        if (th != null) {
            str3 = th.getClass().getName();
            str4 = th.getLocalizedMessage();
        } else {
            str3 = "Bad remote configuration";
            str4 = "Internal error";
        }
        String str5 = IAConfigManager.M.c;
        q.a aVar = new q.a(com.fyber.inneractive.sdk.network.o.FATAL_CONFIGURATION_ERROR);
        Object[] objArr = new Object[8];
        objArr[0] = "exception";
        objArr[1] = str3;
        objArr[2] = "message";
        if (str4 == null) {
            str4 = "No message";
        }
        objArr[3] = str4;
        objArr[4] = "data";
        objArr[5] = str2;
        objArr[6] = "appId";
        if (TextUtils.isEmpty(str5)) {
            str5 = "EMPTY_APP_ID";
        }
        objArr[7] = str5;
        aVar.a(objArr).a((String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:428:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fyber.inneractive.sdk.config.IAConfigManager.c a(com.fyber.inneractive.sdk.config.remote.e r24) {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.c.a(com.fyber.inneractive.sdk.config.remote.e):com.fyber.inneractive.sdk.config.IAConfigManager$c");
    }

    public static Object a(Object obj, Object... objArr) {
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                return obj2;
            }
        }
        return obj;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public IAConfigManager.c a(String str) throws Exception {
        try {
            IAConfigManager iAConfigManager = IAConfigManager.M;
            iAConfigManager.D.b();
            com.fyber.inneractive.sdk.config.remote.e a = com.fyber.inneractive.sdk.config.remote.e.a(new JSONObject(str));
            String str2 = iAConfigManager.c;
            if (a != null && str2.equals(a.a.a)) {
                a.d = str;
                return a(a);
            }
            IAlog.b("internal error while parsing local configuration", new Object[0]);
            if (a != null && !str2.equals(a.a.a)) {
                throw new InvalidAppIdException();
            }
            a((Throwable) null, str);
            return null;
        } catch (Throwable th) {
            a(th, str);
            IAlog.b("Exception Error while parsing local configuration", new Object[0]);
            throw th;
        }
    }
}
