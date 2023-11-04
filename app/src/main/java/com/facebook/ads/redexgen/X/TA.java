package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class TA implements InterfaceC0557Kd {
    public static String[] A02 = {"loUGRX1wFwfO8pi8DgxPrGsPJe85sO42", "t9Fx4", "3oarn8HbUVUj6u6EULIVhfy23k9jn", "", "MOoTM", "MayuUyWiOMYLrKJeDUJbe9Zh46", "X9niQtR04keYRbnSLMpJZHmvyyUcrdIf", "5gFPyDfRsmHweMwy7A1yA2IFiPZ"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ T9 A01;

    public TA(T9 t9, int i) {
        this.A01 = t9;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0557Kd
    public final void AAa() {
        this.A01.A03 = false;
        this.A01.A0S();
        this.A01.A0E.setToolbarActionMode(this.A01.getCloseButtonStyle());
        if (this.A01.A07) {
            P5 p5 = this.A01.A06;
            if (A02[2].length() == 15) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[7] = "KtnVXPQG8pyake3V1oVxr2XzOzf";
            strArr[3] = "";
            if (p5 != null) {
                this.A01.A06.A05();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0557Kd
    public final void ACC(float f) {
        this.A01.A0E.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}
