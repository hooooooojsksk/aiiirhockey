package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.drive.DriveFile;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mk */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0614Mk implements View.OnClickListener {
    public static byte[] A02;
    public final /* synthetic */ C0887Xc A00;
    public final /* synthetic */ C0616Mm A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-58, -57, -44, -38, -39, -97, -57, -47, -58, -45, -48, 20, 33, 18, 20, 22, 39, 28, 41, 28, 39, 44, -60, -47, -57, -43, -46, -52, -57, -111, -52, -47, -41, -56, -47, -41, -111, -60, -58, -41, -52, -46, -47, -111, -71, -84, -88, -70};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            str = this.A01.A06;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String A00 = A00(0, 11, 35);
            str2 = this.A01.A06;
            if (A00.equals(str2)) {
                return;
            }
            String A002 = A00(22, 26, 33);
            str3 = this.A01.A06;
            Intent intent = new Intent(A002, KT.A00(str3));
            intent.addFlags(DriveFile.MODE_READ_ONLY);
            this.A00.A0E().A8N();
            try {
                KG.A0B(this.A00, intent);
            } catch (KE e) {
                Throwable cause = e.getCause();
                Throwable th = e;
                if (cause != null) {
                    th = e.getCause();
                }
                this.A00.A07().A9C(A00(11, 11, 113), C02627s.A00, new C02637t(th));
            }
        } catch (Throwable th2) {
            C0548Jt.A00(th2, this);
        }
    }

    public View$OnClickListenerC0614Mk(C0616Mm c0616Mm, C0887Xc c0887Xc) {
        this.A01 = c0616Mm;
        this.A00 = c0887Xc;
    }
}
