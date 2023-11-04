package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Tr */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0801Tr implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, C7L {
    public static byte[] A02;
    public final C0887Xc A00;
    public final /* synthetic */ C0799Tp A01;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{43, 14, airhockey.P_GAME_EXIT, 9, 11, 4, 4, 5, 30, airhockey.P_GAME_EXIT, 8, 15, airhockey.P_GAME_EXIT, 9, 6, 3, 9, 1, 15, 14, airhockey.P_GAME_EXIT, 8, 15, 12, 5, 24, 15, airhockey.P_GAME_EXIT, 3, 30, airhockey.P_GAME_EXIT, 3, 25, airhockey.P_GAME_EXIT, 28, 3, 15, 29, 15, 14, airhockey.P_GAME_SELECTMAP, airhockey.P_NATION, 109, airhockey.J_ENEMYLOSE, airhockey.J_NATION, airhockey.J_GAME_EXIT, airhockey.J_SAVEDGAME_RELOAD, 33, airhockey.J_GAME_REMATCH, 96, airhockey.J_BACK, airhockey.J_BACK, airhockey.J_ONREWARDED, 111, airhockey.J_ONREWARDED, airhockey.J_GAME_STANDBY, 33, airhockey.J_ERROR, airhockey.J_INVITE, airhockey.J_INVITE, 33, airhockey.J_ENEMYWIN, 96, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ERROR, 47, 20, 16, 19, 39, 54, 59, 55, 60, 49, 55, 28, 55, 38, 37, 61, 32, 57, 56, 25, 86, 2, 25, 3, 21, 30, 86, 18, 23, 2, 23, 86, 4, 19, 21, 25, 4, 18, 19, 18, 90, 86, 6, 26, 19, 23, 5, 19, 86, 19, 24, 5, 3, 4, 19, 86, 2, 25, 3, 21, 30, 86, 19, 0, 19, 24, 2, 5, 86, 4, 19, 23, 21, 30, 86, 2, 30, 19, 86, 23, 18, 86, 32, 31, 19, 1, 86, 20, 15, 86, 4, 19, 2, 3, 4, 24, 31, 24, 17, 86, 16, 23, 26, 5, 19, 86, 31, 16, 86, 15, 25, 3, 86, 31, 24, 2, 19, 4, 21, 19, 6, 2, 86, 2, 30, 19, 86, 19, 0, 19, 24, 2, 88, 33, 39, 60, 94, airhockey.P_GAME_SELECTMAP, 89};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LD ld;
        C0887Xc c0887Xc;
        LD ld2;
        C0887Xc c0887Xc2;
        C0887Xc c0887Xc3;
        LD ld3;
        LD ld4;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            ld = this.A01.A0f;
            boolean A08 = ld.A08();
            String A00 = A00(66, 17, 105);
            if (!A08) {
                Log.e(A00, A00(83, 115, 77));
            }
            c0887Xc = this.A01.A0c;
            int A0F = IK.A0F(c0887Xc);
            if (A0F >= 0) {
                ld3 = this.A01.A0f;
                if (ld3.A03() < A0F) {
                    ld4 = this.A01.A0f;
                    if (ld4.A07()) {
                        Log.e(A00, A00(41, 25, 58));
                        return;
                    } else {
                        Log.e(A00, A00(0, 41, 81));
                        return;
                    }
                }
            }
            ld2 = this.A01.A0f;
            c0887Xc2 = this.A01.A0c;
            if (ld2.A09(c0887Xc2)) {
                if (this.A01.A0a != null) {
                    this.A01.A0a.A0N(A01());
                    return;
                }
                return;
            }
            c0887Xc3 = this.A01.A0c;
            if (!IK.A1B(c0887Xc3)) {
                A05(A01());
                return;
            }
            if (this.A01.A0a != null) {
                this.A01.A0a.A0Q(A01());
            }
            Kj.A00(new DialogInterface$OnClickListenerC0525Iu(this), new DialogInterface$OnClickListenerC0526Iv(this), ActivityUtils.A00());
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    public View$OnClickListenerC0801Tr(C0799Tp c0799Tp, C0887Xc c0887Xc) {
        this.A01 = c0799Tp;
        this.A00 = c0887Xc;
    }

    public /* synthetic */ View$OnClickListenerC0801Tr(C0799Tp c0799Tp, C0887Xc c0887Xc, U0 u0) {
        this(c0799Tp, c0887Xc);
    }

    public Map<String, String> A01() {
        QA qa;
        LD ld;
        J1 j1;
        boolean z;
        boolean z2;
        J1 j12;
        NA na = new NA();
        qa = this.A01.A0R;
        NA A03 = na.A03(qa);
        ld = this.A01.A0f;
        Map<String, String> A05 = A03.A02(ld).A05();
        j1 = this.A01.A0I;
        if (j1 != null) {
            j12 = this.A01.A0I;
            A05.put(A00(HttpStatus.SC_CREATED, 3, 11), String.valueOf(j12.A04()));
        }
        z = this.A01.A0W;
        if (z) {
            z2 = this.A01.A0W;
            A05.put(A00(198, 3, 116), String.valueOf(z2));
        }
        return A05;
    }

    public void A05(Map<String, String> extraData) {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0M(extraData);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C7L
    public final C0887Xc A5d() {
        return this.A00;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        N8 n8;
        N8 n82;
        View view3;
        View view4;
        N8 n83;
        N8 n84;
        view2 = this.A01.A04;
        if (view2 != null) {
            n8 = this.A01.A0L;
            if (n8 != null) {
                n82 = this.A01.A0L;
                view3 = this.A01.A04;
                int width = view3.getWidth();
                view4 = this.A01.A04;
                n82.setBounds(0, 0, width, view4.getHeight());
                n83 = this.A01.A0L;
                n84 = this.A01.A0L;
                n83.A0D(!n84.A0E());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        LD ld;
        C0887Xc c0887Xc;
        View view2;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        ld = this.A01.A0f;
        c0887Xc = this.A01.A0c;
        view2 = this.A01.A04;
        ld.A06(c0887Xc, motionEvent, view2, view);
        onTouchListener = this.A01.A02;
        if (onTouchListener != null) {
            onTouchListener2 = this.A01.A02;
            if (onTouchListener2.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
