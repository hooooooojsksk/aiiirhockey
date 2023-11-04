package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class TM extends K1 {
    public static String[] A02 = {"r", "tRYI", "7UJuVMqBcP2QEoAe5I9ReZPElv0qEy55", "leQvAr8Bdm", "IrxDcEzjLLQBxw", "x58zC904VQqUCNnuzCjkyAfM", "58DZzAqOGTGaE", "1xO3"};
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ LY A01;

    public TM(LY ly, DialogInterface dialogInterface) {
        this.A01 = ly;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        QG qg;
        QG qg2;
        C0886Xb c0886Xb;
        Map<? extends String, ? extends String> A04;
        qg = this.A01.A01.A02;
        if (qg != null) {
            qg2 = this.A01.A01.A02;
            c0886Xb = this.A01.A01.A00;
            String A03 = C0537Jh.A03(c0886Xb);
            QU qu = new QU();
            A04 = this.A01.A01.A04(this.A01.A00.getText().toString());
            qg2.ADT(A03, qu.A05(A04).A08());
        }
        DialogInterface dialogInterface = this.A00;
        if (A02[6].length() != 13) {
            throw new RuntimeException();
        }
        A02[6] = "1hADnGgCLejuT";
        dialogInterface.cancel();
    }
}
