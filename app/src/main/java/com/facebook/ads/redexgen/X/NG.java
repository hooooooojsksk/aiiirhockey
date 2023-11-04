package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class NG implements DialogInterface.OnClickListener {
    public final /* synthetic */ NI A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public NG(NI ni, String str, Map map) {
        this.A00 = ni;
        this.A01 = str;
        this.A02 = map;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        InterfaceC0505Ia interfaceC0505Ia;
        interfaceC0505Ia = this.A00.A04;
        interfaceC0505Ia.A9Z(this.A01, this.A02);
    }
}
