package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.aN */
/* loaded from: assets/audience_network.dex */
public class C0983aN implements InterfaceC00840i {
    public final /* synthetic */ C0887Xc A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C0983aN(JSONObject jSONObject, C0887Xc c0887Xc, String str) {
        this.A02 = jSONObject;
        this.A00 = c0887Xc;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00840i
    public final String A6B() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00840i
    @Nullable
    public final Collection<String> A6U() {
        return C00850j.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00840i
    @Nullable
    public final EnumC00830h A6w() {
        return C00850j.A00(this.A02);
    }
}
