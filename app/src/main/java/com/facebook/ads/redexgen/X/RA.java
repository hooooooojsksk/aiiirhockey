package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class RA extends RelativeLayout implements Q8, PD, Q6 {
    public static byte[] A0E;
    public static String[] A0F = {"bTF0mPynjITMPKd7AWnGFE0wjuUHqGk", "NLuteA0O4hImypGMVaagZ7KROvpQko", "vHIsSgA1dNPe0TxNLDw8T5r", "Tu3OEd7", "fTm", "FLX2LFKD3Z9kyRG7iyj3Ajj18EKg1", "ES7oyLysdjBWPeOJZDQ9P8Sn", "e8"};
    public static final P8 A0G;
    public static final NC A0H;
    public static final MK A0I;
    public static final C0602Ly A0J;
    public static final C0601Lx A0K;
    public static final C0570Ks A0L;
    public static final C0556Kc A0M;
    public static final KD A0N;
    public int A00;
    public C0513Ii A01;
    public PH A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final Handler A08;
    public final View.OnTouchListener A09;
    public final C0887Xc A0A;
    public final C8U<C8V, C8T> A0B;
    public final List<PL> A0C;
    public final Q5 A0D;

    public static String A0F(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A0I() {
        byte[] bArr = {4, 87, airhockey.P_GAME_REMATCH, airhockey.P_GAME_MYWIN, 4, 88, 83, 88, airhockey.P_GAME_STANDBY, 80, 4, 91, airhockey.P_GAME_STANDBY, 88, airhockey.P_GAME_MYWIN, 76, 4, 88, 77, 81, airhockey.P_GAME_REMATCH, 38, 88, 85, 85, airhockey.P_GAME_MYLOSE, 81, 87, 79, 92, 3, airhockey.P_GAME_SELECTMAP, 87, 3};
        if (A0F[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[5] = "dnbQEbQJ0095hjHrUlDt4BBpkj0Wp";
        strArr[7] = "GI";
        A0E = bArr;
    }

    static {
        A0I();
        A0I = new MK();
        A0G = new P8();
        A0J = new C0602Ly();
        A0K = new C0601Lx();
        A0H = new NC();
        A0L = new C0570Ks();
        A0N = new KD();
        A0M = new C0556Kc();
    }

    public RA(C0887Xc c0887Xc) {
        super(c0887Xc);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C8U<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new PC(this);
        this.A0A = c0887Xc;
        if (A0S(c0887Xc)) {
            this.A0D = new JG(c0887Xc);
        } else {
            this.A0D = new TextureView$SurfaceTextureListenerC0511Ig(c0887Xc);
        }
        A0G();
    }

    public RA(C0887Xc c0887Xc, AttributeSet attributeSet) {
        super(c0887Xc, attributeSet);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C8U<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new PC(this);
        this.A0A = c0887Xc;
        if (A0S(c0887Xc)) {
            this.A0D = new JG(c0887Xc, attributeSet);
        } else {
            this.A0D = new TextureView$SurfaceTextureListenerC0511Ig(c0887Xc, attributeSet);
        }
        A0G();
    }

    public RA(C0887Xc c0887Xc, AttributeSet attributeSet, int i) {
        super(c0887Xc, attributeSet, i);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C8U<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new PC(this);
        this.A0A = c0887Xc;
        if (A0S(c0887Xc)) {
            this.A0D = new JG(c0887Xc, attributeSet, i);
        } else {
            this.A0D = new TextureView$SurfaceTextureListenerC0511Ig(c0887Xc, attributeSet, i);
        }
        A0G();
    }

    public static /* synthetic */ MK A0C() {
        MK mk = A0I;
        if (A0F[0].length() != 31) {
            throw new RuntimeException();
        }
        A0F[6] = "XnBln0F0zo0j2g49JSScdoR2";
        return mk;
    }

    private void A0G() {
        this.A06 = IK.A0o(this.A0A);
        this.A0A.A0E().A2r();
        this.A0D.setRequestedVolume(1.0f);
        this.A0D.setVideoStateChangeListener(this);
        this.A02 = new PH(this.A0A, this.A0D);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
        setOnTouchListener(this.A09);
    }

    public void A0H() {
        this.A07.postDelayed(new RE(this), this.A00);
    }

    private final void A0J() {
        for (PL plugin : this.A0C) {
            if (plugin instanceof PR) {
                A0Q((PR) plugin);
            }
            plugin.A93(this);
        }
    }

    public void A0K(int i) {
        if (IK.A0s(this.A0A)) {
            C0887Xc c0887Xc = this.A0A;
            Toast.makeText(c0887Xc, A0F(21, 13, 124) + (i / 1000.0f) + A0F(0, 21, 125), 1).show();
        }
    }

    public void A0L(EnumC0512Ih enumC0512Ih) {
        C0513Ii c0513Ii = this.A01;
        if (c0513Ii == null) {
            return;
        }
        c0513Ii.A04(enumC0512Ih, null);
    }

    private void A0P(PL pl) {
        if (pl instanceof PR) {
            A0R((PR) pl);
        }
        pl.AFf(this);
    }

    private void A0Q(PR pr) {
        if (pr.getParent() == null) {
            if (pr instanceof C02316g) {
                this.A02.A00(pr);
            } else {
                addView(pr);
            }
        }
    }

    private void A0R(PR pr) {
        if (pr instanceof C02316g) {
            this.A02.A01(pr);
        } else {
            LL.A0J(pr);
        }
    }

    private boolean A0S(C0887Xc c0887Xc) {
        return IK.A2H(c0887Xc, C0701Pu.A03());
    }

    public final void A0V() {
        this.A0D.setVideoStateChangeListener(null);
        this.A0D.destroy();
    }

    public final void A0W() {
        if (A0i()) {
            return;
        }
        this.A0D.A87();
    }

    public final void A0X() {
        Iterator<PL> it = this.A0C.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0F[0].length() != 31) {
                throw new RuntimeException();
            }
            A0F[0] = "GYUlZXdJo7nruMh2UHaMalRUd7rYm0D";
            if (hasNext) {
                A0P(it.next());
            } else {
                this.A0C.clear();
                String[] strArr = A0F;
                if (strArr[4].length() != strArr[3].length()) {
                    String[] strArr2 = A0F;
                    strArr2[4] = "dBG";
                    strArr2[3] = "pEPub8w";
                    return;
                }
                return;
            }
        }
    }

    public final void A0Y(int i) {
        this.A07.removeCallbacksAndMessages(null);
        this.A0D.seekTo(i);
    }

    public final void A0Z(int i) {
        this.A0D.AFT(i);
    }

    public final void A0a(PF pf) {
        RB rb = new RB(this);
        if (this.A06) {
            LF.A00(rb);
        } else {
            Handler handler = this.A08;
            if (A0F[6].length() != 24) {
                throw new RuntimeException();
            }
            A0F[6] = "kK0l9LoMdPIpLA2D0gOeof4W";
            handler.post(rb);
        }
        this.A0D.AFH(pf.A02());
    }

    public final void A0b(PK pk, int i) {
        if (this.A03 && this.A0D.getState() == Q7.A06) {
            this.A03 = false;
        }
        this.A0D.AFM(pk, i);
    }

    public final void A0c(PL pl) {
        this.A0C.add(pl);
    }

    public final void A0d(PL pl) {
        this.A0C.remove(pl);
        A0P(pl);
    }

    public final void A0e(boolean z, int i) {
        if (A0i()) {
            return;
        }
        this.A0D.ADO(z, i);
    }

    public final void A0f(boolean z, boolean z2, int i) {
        this.A05 = z2;
        A0e(z, i);
    }

    public final boolean A0g() {
        return this.A0D.A8I();
    }

    public final boolean A0h() {
        return getVolume() == 0.0f;
    }

    public final boolean A0i() {
        return getState() == Q7.A05;
    }

    public final boolean A0j() {
        return A0i() && this.A0D.A8q();
    }

    public final boolean A0k() {
        return getState() == Q7.A0A;
    }

    public final boolean A0l() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.PD
    public final boolean A8i() {
        return A0S(this.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.PD
    public final boolean A8l() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.Q8
    public final void AB3(long j, long j2, long j3, float f) {
        if (!IK.A1R(this.A0A)) {
            return;
        }
        this.A0B.A02(new PQ(j, j2, j3, f) { // from class: com.facebook.ads.redexgen.X.71
        });
    }

    @Override // com.facebook.ads.redexgen.X.Q8
    public final void ABe() {
        A0e(true, 4);
    }

    @Override // com.facebook.ads.redexgen.X.Q8
    public final void ABf() {
        A0b(PK.A04, 6);
    }

    @Override // com.facebook.ads.redexgen.X.Q8
    public final void ACV(int i, int i2) {
        RC rc = new RC(this, i, i2);
        if (this.A06) {
            LF.A00(rc);
        } else {
            this.A08.post(rc);
        }
        A0H();
    }

    @Override // com.facebook.ads.redexgen.X.Q8
    public final void ADB(Q7 q7) {
        int currentPositionInMillis = getCurrentPositionInMillis();
        int currentPositionMS = getDuration();
        RD rd = new RD(this, q7, currentPositionInMillis, currentPositionMS);
        if (this.A06) {
            LF.A00(rd);
        } else {
            this.A08.post(rd);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PD
    public int getCurrentPositionInMillis() {
        return this.A0D.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0D.getDuration();
    }

    @NonNull
    public C8U<C8V, C8T> getEventBus() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.PD
    public long getInitialBufferTime() {
        return this.A0D.getInitialBufferTime();
    }

    public Q7 getState() {
        return this.A0D.getState();
    }

    public Handler getStateHandler() {
        return this.A08;
    }

    public TextureView getTextureView() {
        return (TextureView) this.A0D;
    }

    public int getVideoHeight() {
        return this.A0D.getVideoHeight();
    }

    public View getVideoImplView() {
        return this.A0D.getView();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.PD
    public PK getVideoStartReason() {
        return this.A0D.getStartReason();
    }

    public View getVideoView() {
        return this.A02;
    }

    public int getVideoWidth() {
        return this.A0D.getVideoWidth();
    }

    @Override // com.facebook.ads.redexgen.X.PD
    public float getVolume() {
        return this.A0D.getVolume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A0B.A02(A0M);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.A0B.A02(A0N);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        Q5 q5 = this.A0D;
        if (q5 != null) {
            q5.setControlsAnchorView(view);
        }
    }

    public void setFunnelLoggingHandler(C0513Ii c0513Ii) {
        this.A01 = c0513Ii;
    }

    public void setIsFullScreen(boolean z) {
        this.A04 = z;
        this.A0D.setFullScreen(z);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(@Nullable String str) {
        this.A0D.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i) {
        this.A00 = i;
    }

    public void setVideoURI(@Nullable Uri uri) {
        if (uri == null) {
            A0X();
        } else {
            A0J();
            this.A0D.setup(uri);
        }
        this.A03 = false;
    }

    public void setVideoURI(@Nullable String str) {
        this.A0A.A0E().A2y(str);
        setVideoURI(str != null ? KT.A00(str) : null);
    }

    public void setVolume(float f) {
        if (f == 1.0f) {
            A0L(EnumC0512Ih.A0f);
            this.A0A.A0E().A32();
        } else {
            A0L(EnumC0512Ih.A0e);
            this.A0A.A0E().A31();
        }
        this.A0D.setRequestedVolume(f);
        C8U<C8V, C8T> eventBus = getEventBus();
        if (A0F[2].length() == 19) {
            throw new RuntimeException();
        }
        A0F[2] = "etD2zaPMct9y2wbR2YehsJmmTem";
        eventBus.A02(A0L);
    }
}
