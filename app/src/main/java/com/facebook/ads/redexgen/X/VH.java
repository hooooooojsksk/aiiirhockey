package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: assets/audience_network.dex */
public abstract class VH implements ET {
    public static String[] A05 = {"2", "A1R5XmGNdue", "Xf2fF", "2MZr802CwBgh98iwI2LX9r8AFH0stAP", "PWtCslqWMOhLlWMecFeGOSMcL", "Nab9jbcw8W2RSLeSFi8qaY40Uhnm56i", "UlYKNWRAV2IAyBS", "QHLbHyQnMMy3J3Z"};
    public InterfaceC0880Wv A00;
    public AbstractC03149u A01;
    public Object A02;
    public final ArrayList<ES> A04 = new ArrayList<>(1);
    public final C0411Ee A03 = new C0411Ee();

    public abstract void A02();

    public abstract void A03(InterfaceC0880Wv interfaceC0880Wv, boolean z);

    public final C0411Ee A00(@Nullable ER er) {
        return this.A03.A02(0, er, 0L);
    }

    public final void A01(AbstractC03149u abstractC03149u, @Nullable Object obj) {
        this.A01 = abstractC03149u;
        this.A02 = obj;
        Iterator<ES> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().ACb(this, abstractC03149u, obj);
        }
    }

    @Override // com.facebook.ads.redexgen.X.ET
    public final void A3D(Handler handler, InterfaceC0414Eh interfaceC0414Eh) {
        this.A03.A07(handler, interfaceC0414Eh);
    }

    @Override // com.facebook.ads.redexgen.X.ET
    public final void ADb(InterfaceC0880Wv interfaceC0880Wv, boolean z, ES es) {
        InterfaceC0880Wv interfaceC0880Wv2 = this.A00;
        HD.A03(interfaceC0880Wv2 == null || interfaceC0880Wv2 == interfaceC0880Wv);
        this.A04.add(es);
        if (this.A00 == null) {
            this.A00 = interfaceC0880Wv;
            A03(interfaceC0880Wv, z);
            return;
        }
        AbstractC03149u abstractC03149u = this.A01;
        if (abstractC03149u == null) {
            return;
        }
        es.ACb(this, abstractC03149u, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.ET
    public final void AEB(ES es) {
        this.A04.remove(es);
        if (this.A04.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            if (A05[2].length() == 23) {
                throw new RuntimeException();
            }
            A05[2] = "TEgrTEJPhaeJK53iaQZF";
            this.A02 = null;
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.ET
    public final void AED(InterfaceC0414Eh interfaceC0414Eh) {
        this.A03.A0D(interfaceC0414Eh);
    }
}
