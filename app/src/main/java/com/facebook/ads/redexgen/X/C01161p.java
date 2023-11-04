package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.AdSettings;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.1p */
/* loaded from: assets/audience_network.dex */
public final class C01161p {
    public static String[] A0D = {"erlsxJKV5RGKo0fyhsjft4C8myFkBTFD", "xxCOSS58nTJL4g358MAx2boWparhVsnt", "50HA7KO7TX73z1", "kwTSvTyvqMkAeNvnsZNufhK8xoNKpC5A", "CvvJJ5wn5WoPjh", "PJeUG8MSArG13FCqdbuWaTyquTMQa3YW", "KbVXHt7uQSAfPtAdYM2eE220TAgmiqZ3", "QWgxf2msfb1fWKXeTjGnwNJbVHOPLzwf"};
    public int A00;
    public long A01;
    @Nullable
    public RewardData A02;
    @Nullable
    public EnumC0523Is A03;
    @Nullable
    public String A04;
    @Nullable
    public String A05;
    public boolean A06;
    public final JD A07;
    public final JF A08;
    public final String A09;
    @Nullable
    public final EnumSet<CacheFlag> A0A;
    public final int A0B;
    public final AdPlacementType A0C;

    public C01161p(String str, JF jf, AdPlacementType adPlacementType, JD jd, int i) {
        this(str, jf, adPlacementType, jd, i, EnumSet.of(CacheFlag.NONE));
    }

    public C01161p(String str, JF jf, AdPlacementType adPlacementType, JD jd, int i, @Nullable EnumSet<CacheFlag> cacheFlags) {
        this.A09 = str;
        this.A0C = adPlacementType;
        this.A07 = jd;
        this.A0B = i;
        this.A0A = cacheFlags;
        this.A08 = jf;
        this.A00 = -1;
    }

    public final AdPlacementType A00() {
        AdPlacementType adPlacementType = this.A0C;
        if (adPlacementType != null) {
            return adPlacementType;
        }
        JD jd = this.A07;
        if (jd == null) {
            return AdPlacementType.NATIVE;
        }
        if (jd == JD.A07) {
            return AdPlacementType.INTERSTITIAL;
        }
        return AdPlacementType.BANNER;
    }

    public final C0531Ja A01(C0887Xc c0887Xc, JK jk, @Nullable AdExperienceType adExperienceType) {
        C0575Kx c0575Kx;
        String str;
        String str2 = this.A09;
        JD jd = this.A07;
        if (jd != null) {
            c0575Kx = new C0575Kx(jd.A03(), this.A07.A02());
        } else {
            c0575Kx = null;
        }
        JF jf = this.A08;
        if (AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT) {
            str = AdSettings.getTestAdType().getAdTypeString();
        } else {
            str = null;
        }
        C0531Ja c0531Ja = new C0531Ja(c0887Xc, str2, c0575Kx, jf, str, this.A0B, AdSettings.isTestMode(c0887Xc), AdSettings.isMixedAudience(), jk, L3.A01(IK.A0I(c0887Xc)), this.A04, adExperienceType != null ? adExperienceType.getAdExperienceType() : null);
        String[] strArr = A0D;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[0] = "1YKhexqCB6oyofjWexJTrFb8PReFz0lW";
        strArr2[3] = "PDYLpd11u8hpbIrKg4rw9QV8MRNrtAlX";
        return c0531Ja;
    }

    public final void A02(int i) {
        this.A00 = i;
    }

    public final void A03(long j) {
        this.A01 = j;
    }

    public final void A04(@Nullable RewardData rewardData) {
        this.A02 = rewardData;
    }

    public final void A05(@Nullable EnumC0523Is enumC0523Is) {
        this.A03 = enumC0523Is;
    }

    public final void A06(@Nullable String str) {
        this.A04 = str;
    }

    public final void A07(@Nullable String str) {
        this.A05 = str;
    }

    public final void A08(boolean z) {
        this.A06 = z;
    }
}
