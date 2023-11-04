package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class RY extends Q9 {
    public static String[] A06 = {"9EcwbXL", "xSjvPMkgWWioBuUjephCpzaMcXmM2sD", "H", "Z0OwbQNEejaaYPjBGD9d9AX", "LifEXsQyKShCOMizwIOXiweZ0", "XJXBCYBKjtegaNwUZmi8zWUKmanAO", "UJgIUi3fLAa", "b39pUeydvHz6vxm1zIrt3qO8a47iYX"};
    public final /* synthetic */ InterfaceC0505Ia A00;
    public final /* synthetic */ LD A01;
    public final /* synthetic */ C0668On A02;
    public final /* synthetic */ RW A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public RY(RW rw, String str, C0668On c0668On, InterfaceC0505Ia interfaceC0505Ia, Map map, LD ld) {
        this.A03 = rw;
        this.A04 = str;
        this.A02 = c0668On;
        this.A00 = interfaceC0505Ia;
        this.A05 = map;
        this.A01 = ld;
    }

    @Override // com.facebook.ads.redexgen.X.Q9
    public final void A02() {
        QA qa;
        SparseBooleanArray sparseBooleanArray;
        QA qa2;
        SparseBooleanArray sparseBooleanArray2;
        qa = this.A03.A01;
        if (qa.A0Z()) {
            return;
        }
        String str = this.A04;
        if (A06[0].length() != 7) {
            throw new RuntimeException();
        }
        A06[7] = "G0eOJNFPtps4qsYKpGpuAXPxSINW56";
        if (!TextUtils.isEmpty(str)) {
            sparseBooleanArray = this.A03.A04;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                InterfaceC0505Ia interfaceC0505Ia = this.A00;
                String str2 = this.A04;
                NA na = new NA(this.A05);
                qa2 = this.A03.A02;
                interfaceC0505Ia.A9H(str2, na.A03(qa2).A02(this.A01).A05());
                sparseBooleanArray2 = this.A03.A04;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
