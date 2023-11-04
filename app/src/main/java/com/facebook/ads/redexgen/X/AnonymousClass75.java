package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.75 */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass75 extends PT {
    public int A00;
    public boolean A01;
    public final C8V<AnonymousClass72> A02;
    public final C8V<C02466z> A03;
    public final C8V<NC> A04;
    public final C8V<C02456y> A05;
    public final C8V<M0> A06;
    public final C8V<C0602Ly> A07;
    public final C8V<C0601Lx> A08;
    public final C8V<C0556Kc> A09;
    public final C8V<KD> A0A;
    public final RA A0B;
    public final M9 A0C;
    public final AbstractC0569Kr A0D;

    public AnonymousClass75(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, RA ra, String str) {
        this(c0887Xc, interfaceC0505Ia, ra, new ArrayList(), str);
    }

    public AnonymousClass75(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, RA ra, String str, @Nullable Bundle bundle) {
        this(c0887Xc, interfaceC0505Ia, ra, new ArrayList(), str, bundle, null);
    }

    public AnonymousClass75(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, RA ra, String str, @Nullable Map<String, String> extraParams) {
        this(c0887Xc, interfaceC0505Ia, ra, new ArrayList(), str, null, extraParams);
    }

    public AnonymousClass75(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, RA ra, List<C2A> list, String str) {
        super(c0887Xc, interfaceC0505Ia, ra, list, str, !ra.A0h(), new PS(c0887Xc, ra));
        this.A0D = new AbstractC0569Kr() { // from class: com.facebook.ads.redexgen.X.76
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(C0570Ks c0570Ks) {
                AnonymousClass75.this.A0Z();
            }
        };
        this.A07 = new R7(this);
        this.A03 = new R6(this);
        this.A04 = new R5(this);
        this.A05 = new R4(this);
        this.A02 = new R3(this);
        this.A06 = new C0732Qz(this);
        this.A09 = new QD(this);
        this.A0A = new C0682Pb(this);
        this.A08 = new R9(this);
        this.A0C = new M9() { // from class: com.facebook.ads.redexgen.X.78
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(MK mk) {
                RA ra2;
                AnonymousClass75 anonymousClass75 = AnonymousClass75.this;
                ra2 = anonymousClass75.A0B;
                anonymousClass75.A00 = ra2.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = ra;
        this.A0B.getEventBus().A03(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A0C, this.A08);
    }

    public AnonymousClass75(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, RA ra, List<C2A> list, String str, @Nullable Bundle bundle, @Nullable Map<String, String> map) {
        super(c0887Xc, interfaceC0505Ia, ra, list, str, !ra.A0h(), bundle, map, new PS(c0887Xc, ra));
        this.A0D = new AbstractC0569Kr() { // from class: com.facebook.ads.redexgen.X.76
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(C0570Ks c0570Ks) {
                AnonymousClass75.this.A0Z();
            }
        };
        this.A07 = new R7(this);
        this.A03 = new R6(this);
        this.A04 = new R5(this);
        this.A05 = new R4(this);
        this.A02 = new R3(this);
        this.A06 = new C0732Qz(this);
        this.A09 = new QD(this);
        this.A0A = new C0682Pb(this);
        this.A08 = new R9(this);
        this.A0C = new M9() { // from class: com.facebook.ads.redexgen.X.78
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(MK mk) {
                RA ra2;
                AnonymousClass75 anonymousClass75 = AnonymousClass75.this;
                ra2 = anonymousClass75.A0B;
                anonymousClass75.A00 = ra2.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = ra;
        this.A0B.getEventBus().A03(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A08);
    }

    public final void A0g() {
        R8 r8 = new R8(this);
        if (this.A0B.A0l()) {
            LF.A00(r8);
        } else {
            this.A0B.getStateHandler().post(r8);
        }
    }
}
