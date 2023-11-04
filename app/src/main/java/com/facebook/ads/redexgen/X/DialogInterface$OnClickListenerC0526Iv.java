package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Iv */
/* loaded from: assets/audience_network.dex */
public class DialogInterface$OnClickListenerC0526Iv implements DialogInterface.OnClickListener {
    public final /* synthetic */ View$OnClickListenerC0801Tr A00;

    public DialogInterface$OnClickListenerC0526Iv(View$OnClickListenerC0801Tr view$OnClickListenerC0801Tr) {
        this.A00 = view$OnClickListenerC0801Tr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Map<String, String> A01;
        if (this.A00.A01.A0a != null) {
            C0967a7 c0967a7 = this.A00.A01.A0a;
            A01 = this.A00.A01();
            c0967a7.A0P(A01);
        }
    }
}
