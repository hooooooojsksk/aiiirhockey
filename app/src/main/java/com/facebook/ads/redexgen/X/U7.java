package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class U7 implements PG {
    public static String[] A01 = {"T9VzL8fHxpfySiwwlXedeY7mX", "guyVlBlOMcVDAIfN1wPFopCO0r0Zk0gq", "ttKJ4peW2WPtu1OROjgTykJGR", "A5J8ePX4fIk14ZpUSfaCkLGHXqqMAYt6", "kQp8myZeu", "7L0NbJj9RoUIRUZ", "UhNplE17b8XX", "zMftdbZDucx4tcPG97oOAYZ8vQU5TBbw"};
    public final /* synthetic */ U1 A00;

    public U7(U1 u1) {
        this.A00 = u1;
    }

    @Override // com.facebook.ads.redexgen.X.PG
    public final void AD2() {
        AtomicBoolean atomicBoolean;
        InterfaceC0522Ir interfaceC0522Ir;
        InterfaceC0522Ir interfaceC0522Ir2;
        AtomicBoolean atomicBoolean2;
        atomicBoolean = this.A00.A0E;
        atomicBoolean.set(true);
        interfaceC0522Ir = this.A00.A02;
        if (interfaceC0522Ir != null) {
            interfaceC0522Ir2 = this.A00.A02;
            atomicBoolean2 = this.A00.A0D;
            boolean z = atomicBoolean2.get();
            if (A01[1].charAt(3) == 'h') {
                throw new RuntimeException();
            }
            A01[3] = "0cRb1Hjpfivo5OpVdykyl3dtou8RqpBl";
            interfaceC0522Ir2.ABx(z);
        }
    }
}
