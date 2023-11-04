package com.fyber.marketplace.fairbid.impl;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.config.l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.f0;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements MarketplaceAuctionParameters {
    public HashMap<String, s> a = new HashMap<>();
    public final HashMap<String, com.fyber.inneractive.sdk.dv.g> b = new HashMap<>();
    public final com.fyber.inneractive.sdk.serverapi.c c;
    public String d;

    /* loaded from: classes.dex */
    public enum a {
        KEY_AVAILABLE_DISK_SPACE("available_disk", "dsk_a", Integer.class),
        KEY_HEADSET("headset", "headset", Boolean.class),
        KEY_BATTERY_CONNECTED("battery_charging", "btry_c", Boolean.class),
        KEY_BATTERY_LEVEL("battery_level", "btry_l", Integer.class),
        KEY_BLUETOOTH_CONNECTED("bluetooth_connected", "bt_con", Boolean.class),
        KEY_ANDROID_LEVEL("d_api", "d_api", Integer.class),
        KEY_AIRPLANE_MODE("apnm", "apnm", Boolean.class),
        KEY_DO_NOT_DISTURB("dnd", "dnd", Boolean.class),
        KEY_IS_MUTED("is_muted", "is_muted", Boolean.class),
        KEY_TOTAL_DISK_SPACE("total_disk", "dsk_t", Integer.class),
        KEY_TIME_OF_DAY("time_difference", "tod", Integer.class),
        KEY_LOW_POWER_MODE("low_power_mode", "low_power_mode", Boolean.class),
        KEY_DARK_MODE("dark_mode", "dark_mode", Boolean.class),
        KEY_LAST_DOMAIN_SHOWED("last_adomain", "ldomain", String.class),
        KEY_LAST_BUNDLE_SHOWED("last_bundle", "lbundle", String.class),
        KEY_IGNITE_VERSION(ClientCookie.VERSION_ATTR, "ignitev", String.class),
        KEY_IGNITE_PACKAGE_NAME("package_name", "ignitep", String.class);
        
        public String fairBidParam;
        public String marketPlaceParam;
        public Object type;

        a(String str, String str2, Object obj) {
            this.fairBidParam = str;
            this.marketPlaceParam = str2;
            this.type = obj;
        }
    }

    public b(com.fyber.inneractive.sdk.serverapi.c cVar) {
        this.c = cVar;
    }

    public final JSONObject a(HashMap<String, String> hashMap, a... aVarArr) {
        JSONObject jSONObject = new JSONObject();
        for (a aVar : aVarArr) {
            String str = hashMap.get(aVar.marketPlaceParam);
            if (!TextUtils.isEmpty(str)) {
                try {
                    Object a2 = a(str, aVar.type);
                    if (a2 != null) {
                        jSONObject.put(aVar.fairBidParam, a2);
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public String getAdvertisingId() {
        if (l.b()) {
            return null;
        }
        ((com.fyber.inneractive.sdk.serverapi.b) this.c).getClass();
        int i = com.fyber.inneractive.sdk.config.f.a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.device");
        return TextUtils.isEmpty(property) ? l.a() : property;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public String getAmazonAdvertisingId() {
        if (l.b()) {
            ((com.fyber.inneractive.sdk.serverapi.b) this.c).getClass();
            int i = com.fyber.inneractive.sdk.config.f.a;
            String property = System.getProperty("ia.testEnvironmentConfiguration.device");
            return TextUtils.isEmpty(property) ? l.a() : property;
        }
        return null;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public String getAppVersion() {
        return ((com.fyber.inneractive.sdk.serverapi.b) this.c).f();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public String getBundleId() {
        ((com.fyber.inneractive.sdk.serverapi.b) this.c).getClass();
        return com.fyber.inneractive.sdk.util.l.a.getPackageName();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public String getCarrier() {
        return ((com.fyber.inneractive.sdk.serverapi.b) this.c).a();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public String getDeviceModel() {
        return ((com.fyber.inneractive.sdk.serverapi.b) this.c).b();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public s getFeatureProvider(String str) {
        return this.a.get(str);
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public int getHeight() {
        ((com.fyber.inneractive.sdk.serverapi.b) this.c).getClass();
        return com.fyber.inneractive.sdk.util.l.c(com.fyber.inneractive.sdk.util.l.d());
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public String getHorizontalAccuracy() {
        return null;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public List<String> getInputLanguages() {
        ((com.fyber.inneractive.sdk.serverapi.b) this.c).getClass();
        return IAConfigManager.M.q;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public String getLanguage() {
        ((com.fyber.inneractive.sdk.serverapi.b) this.c).getClass();
        return IAConfigManager.M.p;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public String getLatitudeLongitude() {
        return null;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public JSONObject getMarketplaceEntry() {
        HashMap<String, String> hashMap = new HashMap<>();
        ((com.fyber.inneractive.sdk.serverapi.b) this.c).a(hashMap, this.d);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_params", a(hashMap, a.KEY_TIME_OF_DAY));
        } catch (Exception unused) {
        }
        try {
            jSONObject.put("device_params", a(hashMap, a.KEY_AVAILABLE_DISK_SPACE, a.KEY_DO_NOT_DISTURB, a.KEY_AIRPLANE_MODE, a.KEY_ANDROID_LEVEL, a.KEY_IS_MUTED, a.KEY_HEADSET, a.KEY_BATTERY_CONNECTED, a.KEY_BATTERY_LEVEL, a.KEY_BLUETOOTH_CONNECTED, a.KEY_LOW_POWER_MODE, a.KEY_DARK_MODE, a.KEY_TOTAL_DISK_SPACE));
        } catch (Exception unused2) {
        }
        try {
            jSONObject.put("content_params", a(hashMap, a.KEY_LAST_BUNDLE_SHOWED, a.KEY_LAST_DOMAIN_SHOWED));
        } catch (Exception unused3) {
        }
        s b = s.b();
        this.a.put(this.d, b);
        b.a(this.d, false);
        JSONArray d = b.d();
        if (d != null && d.length() > 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("experiments", d);
            } catch (Exception unused4) {
            }
            try {
                jSONObject.put("sdk_experiments", jSONObject2);
            } catch (Exception unused5) {
            }
        }
        com.fyber.inneractive.sdk.serverapi.c cVar = this.c;
        String str = this.d;
        ((com.fyber.inneractive.sdk.serverapi.b) cVar).getClass();
        com.fyber.inneractive.sdk.dv.g a2 = IAConfigManager.M.F.a(com.fyber.inneractive.sdk.serverapi.a.a(str));
        String str2 = this.d;
        if (a2 != null) {
            this.b.put(str2, a2);
            try {
                jSONObject.put("gdem_signal", a2.a.getQuery());
            } catch (JSONException unused6) {
            }
        }
        try {
            jSONObject.put(ClientCookie.VERSION_ATTR, ((com.fyber.inneractive.sdk.serverapi.b) this.c).a("2.2.0"));
        } catch (JSONException unused7) {
        }
        com.fyber.inneractive.sdk.ignite.c cVar2 = IAConfigManager.M.E;
        if (cVar2 != null) {
            String str3 = cVar2.d;
            String str4 = cVar2.c;
            JSONObject jSONObject3 = new JSONObject();
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                try {
                    jSONObject3.put(ClientCookie.VERSION_ATTR, str3);
                } catch (JSONException unused8) {
                }
                try {
                    jSONObject3.put("package_name", str4);
                } catch (JSONException unused9) {
                }
                try {
                    jSONObject.put("ignite_params", jSONObject3);
                } catch (Exception unused10) {
                }
            }
        }
        IAlog.a("getMarketplaceEntry:Json object - %s", jSONObject.toString());
        return jSONObject;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public String getMobileCountryCode() {
        return ((com.fyber.inneractive.sdk.serverapi.b) this.c).c();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public String getMobileNetworkCode() {
        return ((com.fyber.inneractive.sdk.serverapi.b) this.c).d();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public String getNetwork() {
        ((com.fyber.inneractive.sdk.serverapi.b) this.c).getClass();
        return f0.e().key;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public List<Integer> getSupportedApis() {
        ((com.fyber.inneractive.sdk.serverapi.b) this.c).getClass();
        return com.fyber.inneractive.sdk.serverapi.b.c;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public List<String> getSupportedMimes() {
        ((com.fyber.inneractive.sdk.serverapi.b) this.c).getClass();
        return com.fyber.inneractive.sdk.serverapi.b.e;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public List<Integer> getSupportedProtocols() {
        ((com.fyber.inneractive.sdk.serverapi.b) this.c).getClass();
        return com.fyber.inneractive.sdk.serverapi.b.d;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public int getSupportedTypesBitwise() {
        this.c.getClass();
        return 372;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public String getTimeAccuracy() {
        return null;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public String getVerticalAccuracy() {
        return null;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public int getWidth() {
        ((com.fyber.inneractive.sdk.serverapi.b) this.c).getClass();
        return com.fyber.inneractive.sdk.util.l.c(com.fyber.inneractive.sdk.util.l.e());
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public com.fyber.inneractive.sdk.dv.g getWrapperQueryInfo(String str) {
        com.fyber.inneractive.sdk.dv.g gVar = this.b.get(this.d);
        this.b.remove(this.d);
        return gVar;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public boolean hasAmazonAdvertisingId() {
        return l.b();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public Boolean isLimitTrackingEnabled() {
        ((com.fyber.inneractive.sdk.serverapi.b) this.c).getClass();
        return Boolean.valueOf(l.c());
    }

    public static Object a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String obj2 = obj.toString();
        if (TextUtils.equals(obj2, Integer.class.toString())) {
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return null;
            }
        } else if (TextUtils.equals(obj2, String.class.toString())) {
            return str;
        } else {
            if (TextUtils.equals(obj2, Boolean.class.toString())) {
                if (str.equalsIgnoreCase("1")) {
                    return Boolean.TRUE;
                }
                if (str.equalsIgnoreCase("0")) {
                    return Boolean.FALSE;
                }
            }
            return null;
        }
    }
}
