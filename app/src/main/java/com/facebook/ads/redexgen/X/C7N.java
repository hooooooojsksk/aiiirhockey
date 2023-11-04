package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7N */
/* loaded from: assets/audience_network.dex */
public class C7N extends ContextWrapper {
    public final C7P A00;
    public final AtomicReference<String> A01;

    public C7N(Context context, C7P c7p) {
        super(context.getApplicationContext());
        this.A01 = new AtomicReference<>();
        this.A00 = c7p;
    }

    public final C6Q A00() {
        return this.A00.A64();
    }

    public final C0886Xb A01() {
        return this.A00.A7Y(this);
    }

    public final C7O A02() {
        return this.A00.A5t(this);
    }

    public final C7Q A03() {
        return this.A00.A6c(this);
    }

    public final C7S A04() {
        return this.A00.A7X(this);
    }

    public final C7T A05() {
        return this.A00.A7p();
    }

    public final InterfaceC02507e A06() {
        return this.A00.A6R(this);
    }

    public final InterfaceC02617r A07() {
        return this.A00.A6S(this);
    }

    public final C8I A08() {
        return this.A00.A7f();
    }

    public final InterfaceC0505Ia A09() {
        return this.A00.A5e(A01());
    }

    public final InterfaceC0517Im A0A() {
        return this.A00.A7Z(A01());
    }

    @Nullable
    public final String A0B() {
        return this.A01.get();
    }

    public final void A0C(@Nullable String str) {
        this.A01.set(str);
    }
}
