package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import android.widget.EditText;
import java.util.concurrent.Executor;

/* loaded from: assets/audience_network.dex */
public class LY implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ TL A01;

    public LY(TL tl, EditText editText) {
        this.A01 = tl;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Executor executor;
        executor = this.A01.A03;
        executor.execute(new TM(this, dialogInterface));
    }
}
