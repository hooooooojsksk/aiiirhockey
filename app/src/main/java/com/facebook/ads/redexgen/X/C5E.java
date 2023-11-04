package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.5E */
/* loaded from: assets/audience_network.dex */
public class C5E implements View.OnLongClickListener {
    public final /* synthetic */ C5F A00;

    public C5E(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        N8 n8;
        RelativeLayout relativeLayout;
        N8 n82;
        RelativeLayout relativeLayout2;
        RelativeLayout relativeLayout3;
        N8 n83;
        N8 n84;
        n8 = this.A00.A0A;
        if (n8 != null) {
            relativeLayout = this.A00.A06;
            if (relativeLayout != null) {
                n82 = this.A00.A0A;
                relativeLayout2 = this.A00.A06;
                int width = relativeLayout2.getWidth();
                relativeLayout3 = this.A00.A06;
                n82.setBounds(0, 0, width, relativeLayout3.getHeight());
                n83 = this.A00.A0A;
                n84 = this.A00.A0A;
                n83.A0D(!n84.A0E());
            }
        }
        return true;
    }
}
