package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Jn */
/* loaded from: assets/audience_network.dex */
public final class C0542Jn extends ImageView implements PL {
    public static byte[] A05;
    public static String[] A06 = {"CZ6R6baQKTb1E5sAmpDqVkfMXF7zVnG4", "nQZGX73N3q5NRRZlZyP90gUTrDeeLYBu", "LfCM6PYFJNbwOvLH4thVDQon3h1Zk2zk", "bpUakkTElIOqaP65ISNG9oh", "gJtMODfbj2e7z8MJG7ZRKfD", "8rYwk9o7IGDDsMQbyUTj4ra1LUt9E6qX", "3WiLQHXTUUJ8WctEatoRQ", "Xo7nIXQ5hsw2R0tzDjIU8fyfjH4jtFIR"};
    public static final int A07;
    @Nullable
    public RA A00;
    public final Paint A01;
    public final C0887Xc A02;
    public final C0513Ii A03;
    public final AbstractC0569Kr A04;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{airhockey.J_GAME_STANDBY, 93, 92, 77, 8, airhockey.J_GAME_REMATCH, 76};
    }

    static {
        A06();
        A07 = (int) (Kk.A02 * 4.0f);
    }

    public C0542Jn(C0887Xc c0887Xc, C0513Ii c0513Ii) {
        super(c0887Xc);
        this.A04 = new AbstractC0569Kr() { // from class: com.facebook.ads.redexgen.X.6h
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(C0570Ks c0570Ks) {
                C0542Jn.this.A09();
            }
        };
        this.A03 = c0513Ii;
        this.A02 = c0887Xc;
        this.A01 = new Paint();
        this.A01.setColor(-1728053248);
        setColorFilter(-1);
        int i = A07;
        setPadding(i, i, i, i);
        setContentDescription(A03(0, 7, 59));
        A05();
        setOnClickListener(new PZ(this));
    }

    private void A04() {
        setImageBitmap(LU.A01(LT.SOUND_OFF));
    }

    private void A05() {
        setImageBitmap(LU.A01(LT.SOUND_ON));
    }

    public boolean A07() {
        RA ra = this.A00;
        if (ra != null) {
            float volume = ra.getVolume();
            String[] strArr = A06;
            if (strArr[5].charAt(12) == strArr[1].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[3] = "7LwdJMyLjSlNEKSwxkcw7Q3";
            strArr2[6] = "d5nTRpYYugpReKnwSxkEX";
            if (volume == 0.0f) {
                return true;
            }
        }
        return false;
    }

    public final void A09() {
        if (this.A00 == null) {
            return;
        }
        if (A07()) {
            A04();
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.X.PL
    public final void A93(RA ra) {
        this.A00 = ra;
        RA ra2 = this.A00;
        if (ra2 != null) {
            ra2.getEventBus().A05(this.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PL
    public final void AFf(RA ra) {
        RA ra2 = this.A00;
        if (ra2 != null) {
            ra2.getEventBus().A06(this.A04);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int y = getWidth() / 2;
        int x = getHeight() / 2;
        canvas.drawCircle(y, x, Math.min(y, x), this.A01);
        super.onDraw(canvas);
    }
}
