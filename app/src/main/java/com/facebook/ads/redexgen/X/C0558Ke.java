package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.facebook.ads.redexgen.X.Ke */
/* loaded from: assets/audience_network.dex */
public final class C0558Ke {
    public static String[] A07 = {"AKWVUs1l0Ice5I6VX", "CXPBWDMo1Zqj2yCW5W30Ut48PEWYgYey", "QYYsUNIn7qky9LY", "uhDWqwwqE26XK4rQkizWNR4dlHqM4UZ3", "ZNpftHLPxc7R9PnANzOwdg7R2ap4pSI6", "3ke", "xa09Mpjas6OdUQMP5Qo7kdS83JfCqy78", "u6CBuCaaqyjpN4LkQhRqLLvzhKEDnG9S"};
    public float A00;
    public float A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05;
    public final InterfaceC0557Kd A06;

    public C0558Ke(int i, float f, long j, Handler handler, InterfaceC0557Kd interfaceC0557Kd) {
        this(i, interfaceC0557Kd, handler);
        this.A02 = j;
        this.A01 = f;
    }

    public C0558Ke(int i, InterfaceC0557Kd interfaceC0557Kd) {
        this(i, interfaceC0557Kd, new Handler());
    }

    @VisibleForTesting
    public C0558Ke(int i, InterfaceC0557Kd interfaceC0557Kd, Handler handler) {
        this.A04 = false;
        this.A00 = i;
        this.A06 = interfaceC0557Kd;
        this.A05 = handler;
        this.A02 = 250L;
        this.A01 = 0.25f;
    }

    public void A02() {
        this.A00 -= this.A01;
        this.A06.ACC(this.A00);
        if (this.A00 <= 0.0f) {
            boolean z = this.A03;
            if (A07[4].charAt(25) == 'L') {
                throw new RuntimeException();
            }
            A07[6] = "KuCOx1ArmKJG2Js90Y8iwcXaowa3uSzZ";
            if (!z) {
                this.A03 = true;
                this.A06.AAa();
                this.A04 = false;
            }
        }
    }

    public final float A04() {
        return this.A00;
    }

    public final boolean A05() {
        return this.A00 <= 0.0f;
    }

    public final boolean A06() {
        return this.A04;
    }

    public final boolean A07() {
        if (A06()) {
            this.A04 = false;
            return true;
        }
        return false;
    }

    public final boolean A08() {
        if (A05() && !this.A03) {
            this.A03 = true;
            this.A06.AAa();
        }
        if (!A05() && !A06()) {
            this.A04 = true;
            this.A06.ACC(this.A00);
            this.A05.postDelayed(new TW(this), this.A02);
            return true;
        } else if (A07[4].charAt(25) != 'L') {
            String[] strArr = A07;
            strArr[3] = "u6tCNg8GXSpiTqjQspDcQdpU9nt4kRaX";
            strArr[7] = "uRN5Zlx2bfjM01c7Y9BPyYrHFfBp2TpI";
            return false;
        } else {
            throw new RuntimeException();
        }
    }
}
