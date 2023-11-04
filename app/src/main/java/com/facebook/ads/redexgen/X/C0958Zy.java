package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Zy */
/* loaded from: assets/audience_network.dex */
public final class C0958Zy extends AbstractC00900p {
    public static String[] A05 = {"RwkPFHsv9wotgH8PCqYhpIij5lIi", "drIC7gYxypHASOm9CvVJaHIQeep0", "f0dvIXyq27iv5zRXvkJTu2cqkG", "fzusVvXWPget8SSdASQ7tAMFHi8p37he", "Ar6p", "jDkSEm6Ik6fEWWn08WKTicIvFe3Dtksc", "J7vaKr0jTjoObEFZmlhET1S0K8S4ujA7", "2rimL2d5m8eNJCurq2ysJBza56R6EvG7"};
    public static final String A06 = C0958Zy.class.getSimpleName();
    public C0960a0 A00;
    public boolean A01;
    public final C0887Xc A02;
    public final InterfaceC0505Ia A03;
    public final N0 A04;

    public C0958Zy(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, N0 n0, QA qa, AbstractC00910q abstractC00910q) {
        super(c0887Xc, abstractC00910q, qa);
        this.A03 = interfaceC0505Ia;
        this.A04 = n0;
        this.A02 = c0887Xc;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00900p
    public final void A06(Map<String, String> map) {
        C0960a0 c0960a0 = this.A00;
        if (c0960a0 != null && !TextUtils.isEmpty(c0960a0.A6B())) {
            this.A02.A0E().A2Z();
            AnonymousClass29.A00(this.A00.A05());
            InterfaceC0505Ia interfaceC0505Ia = this.A03;
            String A6B = this.A00.A6B();
            String[] strArr = A05;
            if (strArr[7].charAt(31) != strArr[6].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "Tkg0tGhzpCvpbpNuTPjRHtf4b45H";
            strArr2[1] = "dBPpzaB1YNfwJk5banXGE19c57tB";
            interfaceC0505Ia.A9H(A6B, map);
        }
    }

    public final synchronized void A07() {
        if (!this.A01 && this.A00 != null) {
            this.A01 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                LF.A00(new C0959Zz(this));
            }
        }
    }

    public final void A08(C0960a0 c0960a0) {
        this.A00 = c0960a0;
    }
}
