package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Er */
/* loaded from: assets/audience_network.dex */
public final class C0424Er extends AbstractC0934Za {
    public static byte[] A00;
    public static String[] A01 = {"d7tLiGkqyLa7cKOkED7RtvmpIXZH8d0b", "LmA4T64r6T9e", "1EBtOKlPck0twYp3ElEJQmg3d", "uhXcdOUibAChEZNBNQuPqKRIQ2", "Z", "LV0o53GlcsqgEYK9Pr4EwymnJShooL9b", "NLZosIPt4DzrQXhRsvqwWEHVFOTX5bDJ", "MQasnwh7q"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{77, airhockey.P_GAME_MYLOSE, 12, airhockey.P_GAME_STANDBY, 95, 12, airhockey.P_NATION, airhockey.P_GAME_MYSCORE, 88, 12, 94, airhockey.P_GAME_REMATCH, 77, airhockey.P_GAME_MYLOSE, 85, 12, airhockey.P_GAME_MYSCORE, 94, 12, 77, 64, 94, airhockey.P_GAME_REMATCH, 77, airhockey.P_GAME_MYLOSE, 85, 12, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_STANDBY, 95, 92, 64, 77, 85, airhockey.P_GAME_REMATCH, airhockey.P_GAME_MYLOSE, 56, 57, 48, 61, 37};
    }

    static {
        A03();
    }

    public C0424Er(C0887Xc c0887Xc, C01161p c01161p) {
        super(c0887Xc, c01161p);
    }

    public Map<String, String> A01(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(36, 5, 104), String.valueOf(System.currentTimeMillis() - j));
        return hashMap;
    }

    public void A05(List<String> trackingUrls, Map<String, String> extraData) {
        if (trackingUrls == null || trackingUrls.isEmpty()) {
            return;
        }
        Iterator<String> it = trackingUrls.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[0] = "jDIZMq7wlAdnEmkEGDRuOyHBIh8qxobs";
            if (hasNext) {
                new AsyncTaskC0707Qa(this.A0B, extraData).execute(it.next());
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0934Za
    public final void A0L() {
        C0967a7 c0967a7 = (C0967a7) this.A01;
        if (c0967a7.A0T()) {
            if (this.A06 != null) {
                this.A06.A0B(c0967a7);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 24));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0934Za
    public final void A0N(InterfaceC00880n interfaceC00880n, C8A c8a, AnonymousClass88 anonymousClass88, C01171q c01171q) {
        C0967a7 c0967a7 = (C0967a7) interfaceC00880n;
        long currentTimeMillis = System.currentTimeMillis();
        ZX zx = new ZX(this, c01171q, c0967a7, currentTimeMillis, anonymousClass88);
        A0E().postDelayed(zx, c8a.A05().A05());
        c0967a7.A0L(this.A0B, new ZW(this, zx, currentTimeMillis, anonymousClass88), this.A08, c01171q, C0799Tp.A0K());
    }
}
