package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;

/* loaded from: assets/audience_network.dex */
public class SM implements InterfaceC0624Mu {
    public static String[] A01 = {"kBW4xLQ0UagetoFfZBciP8yG8j8W9VjJ", "CuM3P9amPTPJ5VHvR15Uue2Gct3r32Ot", "lbGRsJ8fypW9S7UDq3wjuqDAeCT4ZPX8", "CX6eEzMwkcIPtUXHSQR62noGC5y", "Dd2JYkt6fB7OqeIXSHoD4gCnoZc1iMAP", "m18x0ngOflO", "jU1O956PNCfHvoVw6Wvh6mauWMk", "8DHuyV3l5L6zPCdvs"};
    public final /* synthetic */ SG A00;

    public SM(SG sg) {
        this.A00 = sg;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0624Mu
    public final void ABt(String str) {
        C0617Mn c0617Mn;
        C0617Mn c0617Mn2;
        this.A00.A0I = false;
        c0617Mn = this.A00.A0C;
        c0617Mn.setProgress(100);
        c0617Mn2 = this.A00.A0C;
        LL.A0N(c0617Mn2, 8);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0624Mu
    public final void ABv(String str) {
        C0617Mn c0617Mn;
        C0616Mm c0616Mm;
        this.A00.A0I = true;
        c0617Mn = this.A00.A0C;
        LL.A0N(c0617Mn, 0);
        c0616Mm = this.A00.A0B;
        c0616Mm.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0624Mu
    public final void ACD(int i) {
        boolean z;
        C0617Mn c0617Mn;
        z = this.A00.A0I;
        if (z) {
            c0617Mn = this.A00.A0C;
            String[] strArr = A01;
            if (strArr[3].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "lMw90bHodMLjKU6qsq03ZDigEQG";
            strArr2[6] = "W3A1xCHgBxfgFje8Ug40eYh6nHu";
            c0617Mn.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0624Mu
    public final void ACI(String str) {
        C0616Mm c0616Mm;
        c0616Mm = this.A00.A0B;
        c0616Mm.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0624Mu
    @RequiresApi(api = 26)
    public final void ACK() {
        C0642Nm c0642Nm;
        c0642Nm = this.A00.A0E;
        c0642Nm.A09().AAR(14);
    }
}
