package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.google.android.gms.drive.DriveFile;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import java.util.UUID;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class AB extends RA {
    public static byte[] A0F;
    public static final String A0G;
    @Nullable
    public Uri A00;
    @Nullable
    public NativeAd A01;
    public InterfaceC0505Ia A02;
    @Nullable
    public InterfaceC0596Ls A03;
    @Nullable
    public PB A04;
    @Nullable
    public AnonymousClass75 A05;
    @Nullable
    public String A06;
    @Nullable
    public String A07;
    @Nullable
    public String A08;
    public final AnonymousClass16 A09;
    public final C0887Xc A0A;
    public final PO A0B;
    public final NY A0C;
    public final AbstractC0623Mt A0D;
    public final String A0E;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{airhockey.J_PURCHASE, -104, -91, 94, -85, 87, -86, -85, -104, -87, -85, 87, airhockey.J_ACHIEVEMENTCALLBACK, -84, -101, -96, -100, -91, -102, -100, -123, -100, -85, -82, -90, -87, -94, airhockey.J_ACHIEVEMENTCALLBACK, -102, -85, -96, -83, -96, -85, -80, airhockey.J_GAME_STANDBY, 87, -124, -104, -94, -100, 87, -86, -84, -87, -100, 87, -85, -97, -104, -85, 87, -96, -85, 94, -86, 87, -96, -91, 87, -80, -90, -84, -87, 87, airhockey.J_ACHIEVEMENTCALLBACK, -91, -101, -87, -90, -96, -101, -124, -104, -91, -96, -99, -100, -86, -85, airhockey.J_GAME_STANDBY, -81, -92, -93, 87, -99, -96, -93, -100, airhockey.J_GAME_STANDBY, -77, -32, -32, -35, -32, -88, -114, 109, airhockey.J_GAME_REMATCH, airhockey.J_ENEMYLOSE, -100, -117, -112, -116, -107, -118, -116, airhockey.J_ERROR, -116, -101, -98, -106, -103, -110, airhockey.J_BACK, -103, -105, -104, airhockey.P_GAME_SELECTMAP, -105, -119, -104, airhockey.J_ENEMYWIN, -112, -115, -119, -110, -104, airhockey.J_ACHIEVEMENTCALLBACK, -109, -113, -119, -110, airhockey.P_GAME_SELECTMAP, -118, -115, -106, -105, -104, airhockey.J_BACK, -103, -105, -104, airhockey.P_GAME_SELECTMAP, -105, -119, -104, airhockey.J_PURCHASE, -115, -120, -119, -109, airhockey.J_WAIT, airhockey.J_REWARD, 109, airhockey.P_GAME_SELECTMAP, -109, -106, airhockey.P_GAME_SELECTMAP, -105, -119, -104, airhockey.J_PURCHASE, -115, -120, -119, -109, airhockey.J_BACK, airhockey.J_DISCONNECT, airhockey.J_ENEMYLOSE, airhockey.P_GAME_SELECTMAP, -118, -115, -106, -105, -104, -16, -3, -18, -16, -14, 3, -8, 5, -8, 3, 8, -80, -71, -74, -78, -69, -63, -95, -68, -72, -78, -69, -7, -22, -5, -4, -14, -9, -16, -107, -105, -118, -119, -118, -117, -114, -109, -118, -119, airhockey.J_DISCONNECT, -105, -114, -118, -109, -103, -122, -103, -114, -108, -109, airhockey.J_GOO, -118, -98, -48, -55, -60, -52, -48, -64, -92, -65, -39, -41, -55, -78, -59, -40, -51, -38, -55, -89, -40, -59, -90, -39, -40, -40, -45, -46, -41, -54, -59, -58, -48, -83, -48, -56, -56, -58, -45, -22, -35, -40, -39, -29, -63, -60, -72, -120, 123, airhockey.J_REWARD, 119, -127, airhockey.J_GAME_STANDBY, 119, 119, 125, 102, 123, ByteCompanionObject.MAX_VALUE, 119, -40, -53, -58, -57, -47, -73, -76, -82, -3, -16, -21, -20, -10, -26, -5, -16, -12, -20, -26, -9, -10, -13, -13, -16, -11, -18, -26, -16, -11, -5, -20, -7, -3, -24, -13, -87, -100, -104, -86, -121, -84, -93, -104};
    }

    static {
        A03();
        A0G = AB.class.getSimpleName();
    }

    public AB(C0887Xc c0887Xc) {
        super(c0887Xc);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new AW(this);
        this.A0C = new AT(this);
        this.A0B = new AC(this);
        this.A09 = new AnonymousClass16(this, c0887Xc);
        this.A0A = c0887Xc;
        A02();
    }

    public AB(C0887Xc c0887Xc, AttributeSet attributeSet) {
        super(c0887Xc, attributeSet);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new AW(this);
        this.A0C = new AT(this);
        this.A0B = new AC(this);
        this.A09 = new AnonymousClass16(this, c0887Xc);
        this.A0A = c0887Xc;
        A02();
    }

    public AB(C0887Xc c0887Xc, AttributeSet attributeSet, int i) {
        super(c0887Xc, attributeSet, i);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new AW(this);
        this.A0C = new AT(this);
        this.A0B = new AC(this);
        this.A09 = new AnonymousClass16(this, c0887Xc);
        this.A0A = c0887Xc;
        A02();
    }

    private void A02() {
        getEventBus().A03(this.A0D, this.A0C, this.A0B);
    }

    private void A04(Intent intent) {
        if (this.A05 == null) {
            A05(A01(114, 25, 19));
        } else if (this.A00 == null && this.A08 == null) {
            A05(A01(139, 37, 19));
        } else {
            intent.putExtra(A01(237, 18, 83), this.A07);
            intent.putExtra(A01(322, 8, 34), EnumC0539Jj.A07);
            intent.putExtra(A01(287, 8, 81), this.A00.toString());
            String str = this.A06;
            if (str == null) {
                str = A01(0, 0, 39);
            }
            intent.putExtra(A01(187, 11, 60), str);
            intent.putExtra(A01(266, 8, 99), this.A08);
            intent.putExtra(A01(HttpStatus.SC_RESET_CONTENT, 24, 20), Kk.A00(this.A0A));
            intent.putExtra(A01(274, 13, 1), getCurrentPositionInMillis());
            intent.putExtra(A01(229, 8, 74), this.A0E);
            intent.putExtra(A01(255, 11, 80), this.A05.A0W());
            intent.putExtra(A01(295, 27, 118), getVideoProgressReportIntervalMs());
            intent.addFlags(DriveFile.MODE_READ_ONLY);
        }
    }

    private void A05(String str) {
        InterfaceC02617r A07 = this.A0A.A07();
        int i = C02627s.A27;
        String defaultErrorMessage = AdErrorType.PARSER_FAILURE.getDefaultErrorMessage();
        A07.A9C(A01(198, 7, 120), i, new C02637t(defaultErrorMessage, A01(90, 7, 93) + str));
        if (AdInternalSettings.isDebugBuild()) {
            Log.w(A0G, str);
        }
    }

    public final void A0m() {
        NativeAd nativeAd = this.A01;
        if (nativeAd != null) {
            nativeAd.onCtaBroadcast();
        }
    }

    public final void A0n() {
        AdActivityIntent A04 = KG.A04(this.A0A);
        A04(A04);
        try {
            A0e(false, 6);
            setVisibility(8);
            KG.A09(this.A0A, A04);
        } catch (Exception e) {
            this.A0A.A07().A9C(A01(176, 11, 126), C02627s.A0D, new C02637t(e));
            Log.e(A01(97, 17, 22), A01(0, 90, 38), e);
        }
    }

    @Nullable
    public InterfaceC0596Ls getListener() {
        return this.A03;
    }

    public String getUniqueId() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.X.RA, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09.A02();
    }

    @Override // com.facebook.ads.redexgen.X.RA, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.A09.A03();
        super.onDetachedFromWindow();
    }

    public void setAdEventManager(InterfaceC0505Ia interfaceC0505Ia) {
        this.A02 = interfaceC0505Ia;
    }

    public void setClientToken(@Nullable String str) {
        AnonymousClass75 anonymousClass75;
        PB pb = this.A04;
        if (pb != null) {
            pb.A0A();
        }
        AnonymousClass75 anonymousClass752 = this.A05;
        if (anonymousClass752 != null) {
            anonymousClass752.A0g();
        }
        this.A06 = str;
        PB pb2 = null;
        if (str != null) {
            anonymousClass75 = new AnonymousClass75(this.A0A, this.A02, this, str);
        } else {
            anonymousClass75 = null;
        }
        this.A05 = anonymousClass75;
        if (IK.A1R(this.A0A)) {
            if (str != null) {
                pb2 = new PB(this.A0A, this.A02, this, str, null);
            }
            this.A04 = pb2;
            return;
        }
        this.A04 = null;
    }

    public void setEnableBackgroundVideo(boolean z) {
        super.A0D.setBackgroundPlaybackEnabled(z);
    }

    public void setListener(@Nullable InterfaceC0596Ls interfaceC0596Ls) {
        this.A03 = interfaceC0596Ls;
    }

    public void setNativeAd(@Nullable NativeAd nativeAd) {
        this.A01 = nativeAd;
    }

    public void setVideoCTA(@Nullable String str) {
        this.A07 = str;
    }

    @Override // com.facebook.ads.redexgen.X.RA
    public void setVideoMPD(@Nullable String str) {
        if (str != null && this.A05 == null) {
            A05(A01(114, 25, 19));
            return;
        }
        this.A08 = str;
        super.setVideoMPD(str);
    }

    @Override // com.facebook.ads.redexgen.X.RA
    public void setVideoURI(@Nullable Uri uri) {
        if (uri != null && this.A05 == null) {
            A05(A01(114, 25, 19));
            return;
        }
        this.A00 = uri;
        super.setVideoURI(uri);
    }
}
