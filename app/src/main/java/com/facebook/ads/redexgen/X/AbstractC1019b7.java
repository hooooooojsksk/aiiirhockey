package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.b7 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1019b7 {
    @Nullable
    public InterfaceC1020b8 A00;

    public final void A00() {
        InterfaceC1020b8 interfaceC1020b8 = this.A00;
        if (interfaceC1020b8 != null) {
            interfaceC1020b8.onStart();
        }
    }

    public final void A01() {
        InterfaceC1020b8 interfaceC1020b8 = this.A00;
        if (interfaceC1020b8 != null) {
            interfaceC1020b8.onStop();
        }
    }

    public final void A02(InterfaceC1020b8 interfaceC1020b8) {
        this.A00 = interfaceC1020b8;
    }
}
