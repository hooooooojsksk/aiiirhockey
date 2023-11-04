package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.AdSDKNotificationManager;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.29 */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass29 {
    public static void A00(@Nullable final String str) {
        final ArrayList<AdSDKNotificationListener> listeners;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (AdSDKNotificationManager.getNotificationListeners()) {
            listeners = new ArrayList<>(AdSDKNotificationManager.getNotificationListeners());
        }
        LF.A00(new Runnable() { // from class: com.facebook.ads.redexgen.X.28
            public static byte[] A02;
            public static String[] A03 = {"", "R2h4cPa", "8K6r33o48istIkLwCuAfGDqRYcEBFJta", "JrgImPTdAC8EkycOMZgSjkdVNJJcyT0z", "UmabyHZVDvNoGZWIzd7OnW5h8PImv1dX", "9OHeUl2dxQ9y3g7sK1669", "ejdw", "orFgTMj4gc7nxjDrulE2T1NaHiTuAbhe"};

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    byte b = (byte) ((copyOfRange[i4] - i3) - 19);
                    String[] strArr = A03;
                    if (strArr[1].length() == strArr[0].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A03;
                    strArr2[2] = "PBcjmF449O2ALurV1e1gxRld5UP64De9";
                    strArr2[7] = "bFbD54V4FV2Kx5Uvd678uCerr9Gu9fe1";
                    copyOfRange[i4] = b;
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{ByteCompanionObject.MIN_VALUE, -119, 126, -115, -108, -117, -113, ByteCompanionObject.MIN_VALUE, ByteCompanionObject.MAX_VALUE, airhockey.J_PURCHASE, 126, -117, -120, -113, -109, -106, -104, -117, -103, -103, -113, -107, -108};
            }

            static {
                A01();
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (C0548Jt.A02(this)) {
                    return;
                }
                try {
                    Iterator it = listeners.iterator();
                    while (it.hasNext()) {
                        Bundle data = new Bundle();
                        data.putString(A00(0, 13, 8), str);
                        ((AdSDKNotificationListener) it.next()).onAdEvent(A00(13, 10, 19), data);
                    }
                } catch (Throwable th) {
                    C0548Jt.A00(th, this);
                }
            }
        });
    }
}
