package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;

/* loaded from: assets/audience_network.dex */
public final class EK extends ZO {
    public static String[] A02 = {"6CKGqR2K2MH05agWbJN3ka4F1ij3xhtD", "25gFyXHUhXKi43K8KJ4chgoS7w07JQQZ", "vjdmG7Wc53PSGoj25veSMfUO8xL7SxfR", "TQa00i6LjIP9KGMZzj8Rx2HUQjG1dRa1", "ap4e45gngLG", "PTi4Abr85pNMPfkRgyZo1NxbOs1aDg0f", "O7pu2EfbMgektne8Y3vUNLOEHbflJ4Uv", "IlEhKaiOmMN"};
    @Nullable
    public ZF A00;
    public final AnonymousClass24 A01;

    public EK(AnonymousClass24 anonymousClass24) {
        super(anonymousClass24.A0B, A00(anonymousClass24));
        this.A01 = anonymousClass24;
    }

    public static AnonymousClass23 A00(AnonymousClass24 anonymousClass24) {
        return new ZA(anonymousClass24);
    }

    @Override // com.facebook.ads.redexgen.X.ZO
    public final void A05() {
        ZF zf = this.A00;
        if (zf != null) {
            zf.A0H();
        }
        super.A00.AEr(EnumC01211u.A04);
    }

    @Nullable
    public final ZF A07() {
        return this.A00;
    }

    public final void A08() {
        this.A00 = new ZF(this.A01, this, this.A02);
        this.A00.A0L(this.A01.A05, this.A01.A02, this.A01.A08);
    }

    public final void A09(com.facebook.ads.Ad ad, @Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z) {
        if (super.A00.A5M()) {
            return;
        }
        this.A01.A01(ad);
        ZF zf = this.A00;
        if (zf != null) {
            zf.A0L(str, adExperienceType, z);
            String[] strArr = A02;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "snzzAybKLkKRz85P4BzzU6VwJ24uwEo8";
            strArr2[1] = "iwkpZYLOXs3iYxZlCgOD0Nxy0vDnSGoK";
            return;
        }
        AnonymousClass24 anonymousClass24 = this.A01;
        anonymousClass24.A05 = str;
        anonymousClass24.A02 = adExperienceType;
        anonymousClass24.A08 = z;
        A08();
    }

    public final void A0A(RewardData rewardData) {
        this.A01.A03 = rewardData;
        ZF zf = this.A00;
        if (zf != null) {
            zf.A0J(rewardData);
        }
    }

    public final boolean A0B() {
        ZF zf = this.A00;
        if (zf != null) {
            return zf.A0M();
        }
        return this.A01.A01 > 0 && LC.A00() > this.A01.A01;
    }

    public final boolean A0C() {
        ZF zf = this.A00;
        if (zf != null) {
            return zf.A0N();
        }
        return super.A00.A5f() == EnumC01211u.A06;
    }

    public final boolean A0D(com.facebook.ads.Ad ad, RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        int A00 = ((C02115j) rewardedVideoShowAdConfig).A00();
        long previousAdViewTime = ((C02115j) rewardedVideoShowAdConfig).A01();
        if (super.A00.A5N()) {
            return false;
        }
        this.A01.A01(ad);
        ZF zf = this.A00;
        if (zf != null) {
            return zf.A0O(A00, previousAdViewTime);
        }
        this.A00 = new ZF(this.A01, this, this.A02);
        this.A00.A0O(A00, previousAdViewTime);
        return false;
    }
}
