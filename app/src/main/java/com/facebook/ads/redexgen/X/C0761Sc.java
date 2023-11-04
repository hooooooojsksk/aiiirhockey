package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Arrays;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.Sc */
/* loaded from: assets/audience_network.dex */
public final class C0761Sc implements InterfaceC0557Kd {
    public static byte[] A0C;
    public static String[] A0D = {"yjxjfYdrUuNcQdEaAwocONv5EWPutnE0", "dRlwVer0DvGhJUYrc6Uo0NmXUudA179W", "0RnVmJRwwZudZEhL6bHsgo2zllxyZ4rb", "m0b7Xk04EuyV6HvP3aQ0qivYD5xsobzk", "0t24jhYDd0ZYm7OB5Pi8K72QIL3VEz", "lOzGJRW4wb6yqjR22F", "IF7HB2KmjMtnMILVYc8NomcIB26UEqSU", "4w4SFr7wcyEc7Fy4rwfiYpUJCop0r4V7"};
    public int A00;
    public int A01;
    public int A02;
    @Nullable
    public AbstractC0586Li A03;
    public String A04;
    public String A05;
    public View$OnClickListenerC0759Sa A07;
    public boolean A0B = false;
    public boolean A0A = false;
    public boolean A09 = false;
    @Nullable
    public Integer A08 = null;
    @Nullable
    public InterfaceC0585Lh A06 = null;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-69, -45, -59, -61, -45, -67, -18, 2, 1, -4, -16, -7, -10, -16, -8};
        if (A0D[5].length() == 17) {
            throw new RuntimeException();
        }
        String[] strArr = A0D;
        strArr[7] = "4rqaLE5ZbqFcULNB9c87AdfXRmFVNOuy";
        strArr[0] = "UmGixQziu9kcJVx2wygXDh2bknYXJmsp";
        A0C = bArr;
    }

    static {
        A01();
    }

    public C0761Sc(int i, int i2, int i3, String str, String str2, @Nullable AbstractC0586Li abstractC0586Li, View$OnClickListenerC0759Sa view$OnClickListenerC0759Sa) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = abstractC0586Li;
        this.A07 = view$OnClickListenerC0759Sa;
    }

    public synchronized void A02() {
        if (this.A09) {
            A04();
        }
    }

    public final synchronized void A04() {
        if (this.A0A) {
            return;
        }
        this.A0A = true;
        if (this.A01 == 1 && this.A03 != null) {
            this.A03.setProgressImage(null);
            this.A03.setProgressClickListener(null);
            this.A03.setToolbarActionMessage(A00(0, 0, 115));
            this.A03.setToolbarListener(this.A06);
            if (this.A08 != null) {
                this.A03.setToolbarActionMode(this.A08.intValue());
            }
            if (this.A07.getColorInfo() != null) {
                this.A03.A04(this.A07.getColorInfo(), false);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0557Kd
    public final synchronized void AAa() {
        if (!this.A0A) {
            this.A07.A09(A00(6, 9, 97));
        }
        A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0557Kd
    public final synchronized void ACC(float f) {
        if (!this.A0A && this.A03 != null) {
            if (this.A01 == 1) {
                if (!this.A0B) {
                    this.A08 = Integer.valueOf(this.A03.getToolbarActionMode());
                    this.A03.setProgressClickListener(new NE(this));
                    this.A06 = this.A03.getToolbarListener();
                    this.A03.setToolbarListener(new C0762Sd(this));
                    this.A0B = true;
                    if (this.A08 == null || this.A08.intValue() == 4) {
                        this.A03.setToolbarActionMode(5);
                    } else {
                        this.A03.setToolbarActionMode(6);
                    }
                }
                if (f <= this.A02) {
                    if (!this.A09) {
                        this.A09 = true;
                        if (this.A08 == null || this.A08.intValue() == 4) {
                            this.A03.setToolbarActionMode(7);
                        } else {
                            this.A03.setProgressImage(LT.CROSS);
                            this.A03.setToolbarActionMode(6);
                        }
                    }
                    this.A03.setToolbarActionMessage(this.A04.replace(A00(0, 6, 52), String.valueOf((int) Math.ceil(f))));
                } else {
                    this.A03.setToolbarActionMessage(this.A05);
                }
            }
        }
    }
}
