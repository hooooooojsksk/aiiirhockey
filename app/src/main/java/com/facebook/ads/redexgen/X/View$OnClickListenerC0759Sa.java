package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Sa */
/* loaded from: assets/audience_network.dex */
public final class View$OnClickListenerC0759Sa extends NM implements View.OnClickListener {
    public static byte[] A0D;
    public static String[] A0E = {"idQnrwKrPQs0c3zYYHT6WTvW1aXoRMqQ", "Gekt1WHQiHnIJqxdwB9j8FzDtIJy1cfJ", "sF2V", "CdtBVDHmuEaNC9R8", "jtmNaJ8NDkAfiILRFeCM3WK", "aXO2Ks7stxeTyHMnCxwSATKtkmhK3bmt", "xmLEl9t0StR", ""};
    public static final int A0F;
    public int A00;
    public int A01;
    @Nullable
    public Bitmap A02;
    @Nullable
    public Paint A03;
    @Nullable
    public Rect A04;
    public C0887Xc A05;
    @Nullable
    public C0558Ke A06;
    @Nullable
    public C0761Sc A07;
    @Nullable
    public String A08;
    @Nullable
    public String A09;
    public boolean A0A;
    public final NI A0B;
    public final Map<String, String> A0C;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            if (A0E[2].length() != 4) {
                throw new RuntimeException();
            }
            A0E[3] = "DG";
            copyOfRange[i4] = (byte) (i5 ^ 83);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{3, 12, 9, 3, 11, 63, 19, 15, 21, 18, 3, 5, 8, 12, airhockey.P_GAME_MYSCORE, 3, 11, 29, 29, 11, 0, 9, 11, 28, ByteCompanionObject.MAX_VALUE, airhockey.J_WAIT, 111, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_REMATCH, 102, 99, airhockey.J_GAME_REMATCH, airhockey.J_SDKVER};
    }

    static {
        A07();
        A0F = (int) (Kk.A02 * 24.0f);
    }

    public View$OnClickListenerC0759Sa(C0887Xc c0887Xc, String str, C1L c1l, InterfaceC0505Ia interfaceC0505Ia, InterfaceC0587Lj interfaceC0587Lj, QA qa, LD ld) {
        this(c0887Xc, str, c1l, false, interfaceC0505Ia, interfaceC0587Lj, qa, ld);
    }

    public View$OnClickListenerC0759Sa(C0887Xc c0887Xc, String str, C1L c1l, boolean z, InterfaceC0505Ia interfaceC0505Ia, InterfaceC0587Lj interfaceC0587Lj, QA qa, LD ld) {
        super(c0887Xc, c1l);
        this.A0C = new HashMap();
        this.A05 = c0887Xc;
        this.A0A = z;
        this.A0B = new NI(c0887Xc, str, qa, ld, interfaceC0505Ia, interfaceC0587Lj);
        setOnClickListener(this);
        LL.A0G(1001, this);
    }

    @Nullable
    public static Bitmap A03(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private void A05() {
        String str;
        if (this.A0A && (str = this.A09) != null) {
            this.A02 = A03(LU.A03(this.A05, str.contains(A04(12, 12, 61)) ? LT.MESSENGER : LT.WHATSAPP));
            this.A03 = new Paint();
            int i = A0F;
            setPadding(i, 0, i, 0);
        }
    }

    private void A06() {
        C0558Ke c0558Ke = this.A06;
        if (c0558Ke != null) {
            c0558Ke.A07();
        }
        C0761Sc c0761Sc = this.A07;
        if (c0761Sc != null) {
            c0761Sc.A04();
        }
    }

    public static boolean A08(AbstractC0952Zs abstractC0952Zs) {
        return ((long) abstractC0952Zs.A0e()) > 0 && abstractC0952Zs.A0c() >= 0;
    }

    public final void A09(String str) {
        if (TextUtils.isEmpty(this.A08) || TextUtils.isEmpty(this.A09)) {
            return;
        }
        A06();
        this.A0C.put(A04(0, 12, 51), str);
        this.A0B.A08(this.A08, this.A09, this.A0C);
    }

    public final boolean A0A(AbstractC0952Zs abstractC0952Zs, @Nullable AbstractC0586Li abstractC0586Li) {
        if (this.A06 != null || !A08(abstractC0952Zs) || abstractC0952Zs.A0l().A01() == null || abstractC0952Zs.A0l().A00() == null) {
            return false;
        }
        this.A07 = new C0761Sc(abstractC0952Zs.A0c(), abstractC0952Zs.A0e(), abstractC0952Zs.A0d(), abstractC0952Zs.A0l().A01(), abstractC0952Zs.A0l().A00(), abstractC0586Li, this);
        this.A06 = new C0558Ke(abstractC0952Zs.A0e(), this.A07);
        this.A06.A08();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            A09(A04(24, 9, 89));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A06();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.A02;
        if (bitmap != null) {
            this.A04 = new Rect(0, 0, bitmap.getWidth(), this.A02.getHeight());
            this.A01 = this.A02.getWidth();
            this.A00 = 12;
            int shift = (this.A01 + this.A00) / 2;
            canvas.save();
            canvas.translate(shift, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float textWidth = this.A01;
            float width = ((getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f)) - textWidth;
            float textWidth2 = this.A00;
            int i = (int) (width - textWidth2);
            int left = this.A01;
            int top = (getHeight() / 2) - (left / 2);
            Rect destRect = new Rect(i, top, i + left, left + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            A06();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            A06();
        }
    }

    public void setCta(C1M c1m, String str, Map<String, String> extraData) {
        setCta(c1m, str, extraData, null);
    }

    public void setCta(C1M c1m, String str, Map<String, String> extraData, @Nullable NH nh) {
        this.A08 = str;
        this.A09 = c1m.A05();
        this.A0C.putAll(extraData);
        this.A0B.A07(nh);
        String A04 = c1m.A04();
        if (!TextUtils.isEmpty(A04)) {
            String buttonText = this.A09;
            if (!TextUtils.isEmpty(buttonText)) {
                setText(A04);
                A05();
                return;
            }
        }
        setVisibility(8);
    }

    public void setIsInAppBrowser(boolean z) {
        this.A0B.A09(z);
    }
}
