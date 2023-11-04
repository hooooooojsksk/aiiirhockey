package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mw */
/* loaded from: assets/audience_network.dex */
public class C0626Mw extends WebChromeClient {
    public static byte[] A03;
    public static String[] A04 = {"YcV2lPdb1GD", "n5DgX5QSw4FQX59vcvxBmCs4C4mD4", "EksZFw55Ld98qazTViJtw6pSuONG6", "FQxvmp8vruM", "8OOSEuFQ7OrFhHkYKSo1UtYVyasxVGnA", "3ltH6wFp1GB97FT9l8RHOrWs4kHkX0iG", "Qgk2ZsNAH7VHvpqjGWkwA7olVBMIpezg", "lYuGhUBeP576iz9ihjd4qaMvDoX6gejl"};
    public final WeakReference<C0887Xc> A00;
    public final WeakReference<InterfaceC0624Mu> A01;
    public final WeakReference<C0621Mr> A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 79;
            if (A04[5].charAt(31) != 'G') {
                throw new RuntimeException();
            }
            A04[4] = "SJN5rebrF3WLAsOm1fkdotQMSgQRMUzH";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-108, -103, -108, 5, 40, 43, 36, -33, 2, 39, 46, 46, 50, 36, 49, -21, -8, -18, -4, -7, -13, -18, -72, -13, -8, -2, -17, -8, -2, -72, -21, -19, -2, -13, -7, -8, -72, -47, -49, -34, -23, -51, -39, -40, -34, -49, -40, -34, -53, -40, -50, -36, -39, -45, -50, -104, -45, -40, -34, -49, -40, -34, -104, -51, -53, -34, -49, -47, -39, -36, -29, -104, -71, -70, -81, -72, -85, -84, -74, -81, 12, -6, -9, -12, 11, -2, -6, 12};
    }

    static {
        A01();
    }

    public C0626Mw(WeakReference<C0887Xc> weakReference, WeakReference<InterfaceC0624Mu> weakReference2, WeakReference<C0621Mr> weakReference3) {
        this.A00 = weakReference;
        this.A01 = weakReference2;
        this.A02 = weakReference3;
    }

    @SuppressLint({"CatchGeneralException"})
    private boolean A02(ValueCallback valueCallback) {
        boolean z;
        ValueCallback valueCallback2;
        ValueCallback valueCallback3;
        C0887Xc c0887Xc = this.A00.get();
        if (c0887Xc != null && c0887Xc.A0D() != null) {
            z = C0775Sq.A09;
            if (z) {
                valueCallback2 = C0775Sq.A08;
                if (valueCallback2 != null) {
                    valueCallback3 = C0775Sq.A08;
                    valueCallback3.onReceiveValue(null);
                    ValueCallback unused = C0775Sq.A08 = null;
                }
                ValueCallback unused2 = C0775Sq.A08 = valueCallback;
                try {
                    Intent intent = new Intent(A00(15, 33, 59));
                    intent.addCategory(A00(48, 32, 27));
                    intent.setType(A00(0, 3, 27));
                    c0887Xc.A0D().startActivityForResult(Intent.createChooser(intent, A00(3, 12, 112)), 1001);
                    return true;
                } catch (Exception e) {
                    c0887Xc.A07().A9D(A00(80, 8, 70), C02627s.A2a, new C02637t(e));
                    ValueCallback unused3 = C0775Sq.A08 = null;
                    return false;
                }
            }
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        C0621Mr c0621Mr = this.A02.get();
        if (!TextUtils.isEmpty(message) && consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.LOG && c0621Mr != null) {
            c0621Mr.A04(message);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        C0621Mr timingLogger = this.A02.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC0624Mu interfaceC0624Mu = this.A01.get();
        if (interfaceC0624Mu != null) {
            interfaceC0624Mu.ACD(i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        InterfaceC0624Mu listener = this.A01.get();
        if (listener != null) {
            listener.ACI(str);
        }
    }

    @Override // android.webkit.WebChromeClient
    @RequiresApi(api = 21)
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return A02(filePathCallback);
    }
}
