package com.iab.omid.library.fyber.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.fyber.adsession.DeviceCategory;

/* loaded from: classes2.dex */
public final class a {
    private static UiModeManager a;

    public static DeviceCategory a() {
        int currentModeType = a.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
    }

    public static void a(Context context) {
        if (context != null) {
            a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
