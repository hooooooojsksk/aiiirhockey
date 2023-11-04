package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import java.util.EnumSet;

/* loaded from: assets/audience_network.dex */
public final class EQ extends ZO {
    public static String[] A02 = {"Wdifh5HSN4RyvogFUrIVqQJQULlKdEei", "S34yOHPbjBOZXrhEKXqsFwPvtnd1qciy", "vu9eRI", "x0OqZ", "VYF0eZRg0jpnLcLhIoRoBnoO3djZf6SI", "33GTCt01Ki3rQT8tpwoWMPFpMqFvVQrj", "pa13jV0ykdfTm6Oo414mEZE7qu5xzGka", "tj8XsVszyFe6dIsjKXzcwTwgC3z6jHVp"};
    @VisibleForTesting
    public static final AnonymousClass21 A03 = new ZD();
    @Nullable
    public ZI A00;
    public final AnonymousClass20 A01;

    public EQ(AnonymousClass20 anonymousClass20) {
        super(anonymousClass20.A05(), A03.A4Q(anonymousClass20));
        this.A01 = anonymousClass20;
    }

    @Override // com.facebook.ads.redexgen.X.ZO
    public final void A05() {
        ZI zi = this.A00;
        if (zi != null) {
            zi.A0F();
        }
        InterfaceC01221v interfaceC01221v = super.A00;
        EnumC01211u enumC01211u = EnumC01211u.A04;
        if (A02[1].charAt(8) == 'f') {
            throw new RuntimeException();
        }
        A02[4] = "bjBCaQy28rNQq0pISHtZZouKJ3cbndZJ";
        interfaceC01221v.AEr(enumC01211u);
    }

    public final ZI A07() {
        return this.A00;
    }

    public final void A08() {
        this.A00 = new ZI(this.A01, this, this.A02);
        this.A00.A0I(this.A01.A0A(), this.A01.A06());
    }

    public final void A09(InterstitialAd interstitialAd, EnumSet<CacheFlag> cacheFlags, @Nullable String str) {
        if (super.A00.A5M()) {
            return;
        }
        this.A01.A0C(interstitialAd);
        ZI zi = this.A00;
        if (zi != null) {
            zi.A0I(cacheFlags, str);
            return;
        }
        this.A01.A0J(cacheFlags);
        this.A01.A0G(str);
        A08();
    }

    public final boolean A0A() {
        ZI zi = this.A00;
        if (zi != null) {
            return zi.A0J();
        }
        if (this.A01.A00() > 0) {
            int i = (LC.A00() > this.A01.A00() ? 1 : (LC.A00() == this.A01.A00() ? 0 : -1));
            if (A02[0].charAt(6) == 'y') {
                throw new RuntimeException();
            }
            A02[4] = "spPOKGUnJm6foAMMjUQWH3rPbfiGZlB3";
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0B() {
        ZI zi = this.A00;
        if (zi != null) {
            return zi.A0K();
        }
        return super.A00.A5f() == EnumC01211u.A06;
    }

    public final boolean A0C(InterstitialAd interstitialAd, InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        if (super.A00.A5N()) {
            return false;
        }
        this.A01.A0C(interstitialAd);
        ZI zi = this.A00;
        if (zi != null) {
            return zi.A0L();
        }
        this.A00 = new ZI(this.A01, this, this.A02);
        this.A00.A0L();
        return false;
    }
}
