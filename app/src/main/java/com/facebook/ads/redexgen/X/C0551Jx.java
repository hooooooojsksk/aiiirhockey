package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Jx */
/* loaded from: assets/audience_network.dex */
public final class C0551Jx implements PL {
    public static String[] A0C = {"ua4Z1F3Vn1tdURaP0tTj5Z", "VlqKJtfjGqtNso0qX2A6lmnvOZsZ2xTE", "1pb0xsuTqC4ySw1JjiCpjHk6a0KK", "HW9a8amQa56v9usqS4J3KzzxMBRp7oUY", "lzg290ZQq0ECc78zj7A2Pt", "9JBQniCNh78hbF6UnJo6", "DIRAqcjzgSQz4x9q8OrEXdtc6Zce0V5V", "FPN1H6gS7aT4O5CCkRk249I"};
    @Nullable
    public RA A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final NY A07 = new NY() { // from class: com.facebook.ads.redexgen.X.6x
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8V
        /* renamed from: A00 */
        public final void A03(C02466z c02466z) {
            Handler handler;
            boolean A0D;
            handler = C0551Jx.this.A05;
            handler.removeCallbacksAndMessages(null);
            A0D = C0551Jx.this.A0D(EnumC0687Pg.A05);
            if (A0D) {
                C0551Jx.this.A03();
                C0551Jx.this.A06(true, false);
            }
            C0551Jx.this.A03 = true;
        }
    };
    public final PO A06 = new PO() { // from class: com.facebook.ads.redexgen.X.6w
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8V
        /* renamed from: A00 */
        public final void A03(AnonymousClass72 anonymousClass72) {
            C0551Jx.this.A03();
            C0551Jx.this.A06(false, false);
            C0551Jx.this.A03 = true;
        }
    };
    public final AbstractC0623Mt A08 = new C02436v(this);
    public final M8 A09 = new M8() { // from class: com.facebook.ads.redexgen.X.6u
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8V
        /* renamed from: A00 */
        public final void A03(C02456y c02456y) {
            boolean z;
            boolean A0D;
            z = C0551Jx.this.A02;
            if (z) {
                return;
            }
            A0D = C0551Jx.this.A0D(EnumC0687Pg.A05);
            if (!A0D) {
                return;
            }
            C0551Jx.this.A03();
            C0551Jx.this.A06(true, false);
        }
    };
    public final LE A0A = new C02416t(this);
    public final Handler A05 = new Handler();
    public final List<InterfaceC0688Ph> A0B = new ArrayList();
    public int A00 = 2000;

    public C0551Jx(boolean z) {
        this.A02 = z;
    }

    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        Iterator<InterfaceC0688Ph> it = this.A0B.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "SzC94btdcN1119JNHgRanzsWdfoutew0";
            if (hasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    public void A06(boolean z, boolean z2) {
        for (InterfaceC0688Ph interfaceC0688Ph : this.A0B) {
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "qWrr7wKcnD6M25Nm7U3j0NNRElcnIA4d";
            interfaceC0688Ph.A3N(z, z2);
        }
    }

    public boolean A0D(EnumC0687Pg enumC0687Pg) {
        for (InterfaceC0688Ph interfaceC0688Ph : this.A0B) {
            if (interfaceC0688Ph.A7j() != enumC0687Pg) {
                return false;
            }
        }
        return true;
    }

    public final void A0E() {
        this.A0B.clear();
    }

    public final void A0F() {
        if (this.A02) {
            this.A05.removeCallbacksAndMessages(null);
            this.A02 = false;
        }
    }

    public final void A0G() {
        this.A04 = true;
        this.A03 = true;
        A06(false, false);
    }

    public final void A0H(int i) {
        this.A00 = i;
    }

    public final void A0I(InterfaceC0688Ph interfaceC0688Ph) {
        this.A0B.add(interfaceC0688Ph);
    }

    public final boolean A0J() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.PL
    public final void A93(RA ra) {
        this.A01 = ra;
        ra.getEventBus().A03(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.facebook.ads.redexgen.X.PL
    public final void AFf(RA ra) {
        A03();
        ra.getEventBus().A04(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}
