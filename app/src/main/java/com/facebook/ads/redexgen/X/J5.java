package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class J5 implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ C7N A00;
    public final /* synthetic */ J8 A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 121);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{3, 27, 5, 60, 61, 39, 32, 59, 38, 45, 89, 78, 91, airhockey.P_GAME_SELECTMAP, 89, 95, airhockey.P_NATION, airhockey.P_GAME_STANDBY, 76, 54, 33, 53, 49, 33, 55, 48, 27, 45, 32};
    }

    public J5(J8 j8, String str, C7N c7n) {
        this.A01 = j8;
        this.A02 = str;
        this.A00 = c7n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        ArrayList arrayList;
        List list3;
        int i;
        int i2;
        int i3;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            C02637t c02637t = new C02637t(A00(0, 3, 52));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, 45), jSONArray);
            jSONObject.put(A00(19, 10, 61), this.A02);
            list = this.A01.A0D;
            synchronized (list) {
                list2 = this.A01.A0D;
                arrayList = new ArrayList(list2);
                list3 = this.A01.A0D;
                list3.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                J7 r = (J7) it.next();
                StringBuilder sb = new StringBuilder();
                sb.append(A00(0, 0, 60));
                i = r.A00;
                sb.append(i);
                sb.append(';');
                i2 = r.A02;
                sb.append(i2);
                sb.append(';');
                i3 = r.A01;
                sb.append(i3);
                jSONArray.put(sb.toString());
            }
            c02637t.A05(jSONObject);
            c02637t.A03(1);
            this.A00.A07().A9D(A00(10, 9, 82), C02627s.A2Q, c02637t);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
