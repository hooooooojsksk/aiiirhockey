package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wg */
/* loaded from: assets/audience_network.dex */
public class C0865Wg extends AbstractC0330Ak {
    public static byte[] A04;
    public static String[] A05 = {"WgYXI97W146UztDd2a1JJEY", "PsmwC9oqdyflgYHEgRnESYlgTeL5m", "sr0zZC", "IkxlPpvfN8PqekaVjdRKnPQ5qAHRvCRG", "ReX0ZTUtTZFjxgVLIFehD5WGT1dwWLSU", "UaiZSduPNT4pUzkcj0jxvMNPl1Qynet7", "ONHsqZM0nT", "E3MBww8xLldGzmr6Q6FQJNMbPzNXN"};
    public long A00;
    public ByteBuffer A01;
    public final C0333An A02 = new C0333An();
    public final int A03;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 27);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{airhockey.J_BACK, 109, airhockey.J_BACK, airhockey.J_REWARD, 77, airhockey.J_PURCHASE, airhockey.J_GAME_REMATCH, airhockey.J_GAME_REMATCH, airhockey.J_GAME_EXIT, 125, 47, 123, 96, 96, 47, 124, airhockey.J_NATION, airhockey.J_INVITE, 99, 99, 47, 39};
    }

    static {
        A05();
    }

    public C0865Wg(int i) {
        this.A03 = i;
    }

    public static C0865Wg A02() {
        return new C0865Wg(0);
    }

    private ByteBuffer A04(int i) {
        int i2 = this.A03;
        if (i2 == 1) {
            ByteBuffer allocate = ByteBuffer.allocate(i);
            if (A05[6].length() != 5) {
                A05[4] = "fER9zQpCkdGo4Mwu26bVu9SaUs9Fh1Su";
                return allocate;
            }
            throw new RuntimeException();
        } else if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        } else {
            ByteBuffer byteBuffer = this.A01;
            int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
            throw new IllegalStateException(A03(4, 18, 20) + capacity + A03(0, 3, 74) + i + A03(3, 1, 68));
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0330Ak
    public final void A07() {
        super.A07();
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void A08() {
        this.A01.flip();
    }

    public final void A09(int i) throws IllegalStateException {
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer == null) {
            this.A01 = A04(i);
            return;
        }
        int position = byteBuffer.capacity();
        int position2 = this.A01.position();
        int capacity = position2 + i;
        if (position >= capacity) {
            return;
        }
        ByteBuffer A042 = A04(capacity);
        if (position2 > 0) {
            this.A01.position(0);
            this.A01.limit(position2);
            A042.put(this.A01);
        }
        this.A01 = A042;
        int position3 = A05[6].length();
        if (position3 == 5) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[2] = "FWU9S4";
        strArr[0] = "hmujVtIh5DBUtGb3epSbNIE";
    }

    public final boolean A0A() {
        return A06(1073741824);
    }

    public final boolean A0B() {
        if (this.A01 == null) {
            int i = this.A03;
            if (A05[4].charAt(30) != 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[2] = "8PuFrx";
            strArr[0] = "MogEwKvIx3RF4VQZDhNq5vz";
            if (i == 0) {
                return true;
            }
        }
        return false;
    }
}
