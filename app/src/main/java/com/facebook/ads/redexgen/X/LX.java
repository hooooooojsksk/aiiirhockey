package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;

/* loaded from: assets/audience_network.dex */
public class LX implements DialogInterface.OnClickListener {
    public final /* synthetic */ TL A00;

    public LX(TL tl) {
        this.A00 = tl;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
