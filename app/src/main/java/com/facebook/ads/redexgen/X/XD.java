package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.bridge.fbsdk.FBLoginASID;
import com.facebook.ads.internal.bridge.gms.AdvertisingId;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XD implements C7S {
    public static byte[] A01;
    public static String[] A02 = {"5s7Vvh0NyBhQSPw27iRWGG1DtqQsP1Sv", "FrTyZebbkrmGpsa0d1dFSR1fbKrcWzi5", "vbBgTS8gp4295EX74czAq4g", "ai", "WolquZ0AL0Qdfn", "cakCtq0fnE5al5DYRrCiV1B2lu7xESbR", "HXQXhYUpdji2Kg3a54R03lC9IEJsCvaM", "NPxj8bqKiKcB9Z0ZqCVSMRQGt9eaxHA1"};
    public final C7N A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 16);
            String[] strArr = A02;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[0] = "3cPMFplOUK5Ssg4O5bRCUJRCJG4m75Bq";
            strArr2[6] = "bSCrfJrMY4RCrVdm5HRU5l61ngvuX2qf";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-81, -36, -46, -32, -35, -41, -46};
    }

    static {
        A01();
    }

    public XD(C7N c7n) {
        this.A00 = c7n;
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    @Nullable
    public final String A5x() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    public final String A6l() {
        return C0537Jh.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    @Nullable
    public final String A6m() {
        return FBLoginASID.getFBLoginASID();
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    @Nullable
    public final String A77() {
        return AdInternalSettings.getMediationService();
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    @Nullable
    public final String A7C() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    @Nullable
    public final C7R A7W() {
        AdvertisingId advertisingIdInfoDirectly = AdvertisingId.getAdvertisingIdInfoDirectly(this.A00);
        if (advertisingIdInfoDirectly == null) {
            return null;
        }
        return new XE(this, advertisingIdInfoDirectly);
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    @Nullable
    public final String A7x() {
        return AdInternalSettings.getUrlPrefix();
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    public final String A7z() {
        return A00(0, 7, 94);
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    public final String A80() {
        return BuildConfigApi.getVersionName(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    public final boolean A8f() {
        return BuildConfigApi.isDebug();
    }
}
