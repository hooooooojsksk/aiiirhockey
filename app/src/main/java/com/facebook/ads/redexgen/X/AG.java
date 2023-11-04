package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class AG implements Runnable {
    public static String[] A04 = {"FXI4YPweIufH3Pt2An4AzMiMJMICZW4T", "uwvDtUMtk5NfKP9ISDY7iI5dkoZYElca", "3X9Yz5oufkrzgSJKyyhGKrZukSdK4yin", "Yyt42t4P0aykOIe72Ke5sVEmhn6MxEuH", "iz4LAshm3lVaCmxiMFM9N835TW", "enfPo4zUqzsZuoLany8d1dcV5BB2cq5H", "laUDRm8UQKJHJcnNtldnOXq4xoZsd", "Oq3t3KRhK9K1doVwJCKt6wwkK0YNCaoI"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AL A02;
    public final /* synthetic */ String A03;

    public AG(AL al, String str, long j, long j2) {
        this.A02 = al;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AM am;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            am = this.A02.A01;
            am.AAG(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
            String[] strArr = A04;
            if (strArr[4].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A04[2] = "joW0YYt26OTJgtzaB2B3ZwKbOgOTkTMY";
        }
    }
}
