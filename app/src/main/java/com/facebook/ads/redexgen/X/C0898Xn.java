package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Xn */
/* loaded from: assets/audience_network.dex */
public final class C0898Xn implements InterfaceC02185q {
    public static byte[] A03;
    public static String[] A04 = {"Yyt8Jrp", "FvQHlihhdkZe9tXm7YLHdG4gIBqm", "h7ITXytSbKbsxwMfZDKdUPEvMsTrizAq", "0TuNzKSIMRKA8K3EzRQL94hbriXTa7QT", "ySuQOOQJHVodSpCznPaDLfXVVxuxvbGA", "XYB8XYCfCTfWBGtKG07Wi1HuHmIQx2qC", "71D0xe3tljOi7f3b0iOVOXaXnoSWhNo4", "dwdYeokke3ChTNA3vTF4hdqHGwVronGN"};
    public final InterfaceC0712Qf A01;
    public Set<InterfaceC02215t> A00 = new HashSet();
    public final List<InterfaceC02205s> A02 = new ArrayList();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-72, -72, -67, 11, -46, -72, -67, 11, 41, 59, 59, 45, 60, 59};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public synchronized void A03() {
        if (!this.A01.A8r()) {
            BuildConfigApi.isDebug();
            return;
        }
        Set<InterfaceC02215t> A01 = A01(this.A01.A6P());
        if (!this.A00.equals(A01) && A01 != null) {
            this.A00 = A01;
            for (InterfaceC02205s interfaceC02205s : this.A02) {
                interfaceC02205s.A3T();
            }
        }
        if (BuildConfigApi.isDebug()) {
            for (InterfaceC02215t interfaceC02215t : this.A00) {
                String.format(Locale.US, A00(0, 8, 45), interfaceC02215t.A7v(), interfaceC02215t.getUrl());
            }
        }
    }

    static {
        A02();
    }

    public C0898Xn(InterfaceC0457Ga interfaceC0457Ga) {
        this.A01 = interfaceC0457Ga.A4R(EnumC0713Qg.A0B);
        this.A01.A3G(new C0899Xo(this));
        A03();
    }

    @Nullable
    public static Set<InterfaceC02215t> A01(JSONObject jSONObject) {
        C0897Xm A00;
        HashSet hashSet = new HashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(8, 6, 93));
        if (optJSONArray == null) {
            return null;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null || (A00 = C0897Xm.A00(optJSONObject)) == null) {
                return null;
            }
            hashSet.add(A00);
            if (A04[1].length() == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "2zeGpFgTpOohtr7xv9EhLTO87hKhrQIZ";
            strArr[3] = "Z45Lb0RXWpRaUi2IX7mXCACeVe5qt7dU";
        }
        return hashSet;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02185q
    public final void A3E(InterfaceC02205s interfaceC02205s) {
        this.A02.add(interfaceC02205s);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02185q
    public final synchronized Set<InterfaceC02215t> A5l() {
        return new HashSet(this.A00);
    }
}
