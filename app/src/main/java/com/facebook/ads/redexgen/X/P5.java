package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.RewardData;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executor;

/* loaded from: assets/audience_network.dex */
public final class P5 {
    public static byte[] A05;
    public static String[] A06 = {"4IoXmskrHF1p6dXqKQn3apqXXvi8", "1tZtBqJSVjxeNtOdqegUYYfHC8", "yIG7nuwjW", "6uVpGgk4XMyp6iT3bnZwHJmMch5uofQt", "GVQj", "RdXauxF0SpMDtL", "yOCZ", "m5Wr6psr3K5zQ"};
    public Executor A00 = LQ.A06;
    public final C0887Xc A01;
    public final InterfaceC0587Lj A02;
    public final MC A03;
    @Nullable
    public final String A04;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        byte[] bArr = {99, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_ENEMYEXIT, 102, airhockey.J_ENEMYLOSE, airhockey.J_DISCONNECT, airhockey.J_DISCONNECT, airhockey.J_GOO, airhockey.J_SAVEDGAME_SAVE, 58, 47, 47, 119, 119, 119, 46, 37, airhockey.J_SAVEDGAME_SAVE, 46, 102, airhockey.J_SDKVER, 99, airhockey.J_GAME_STANDBY, airhockey.J_NATION, 111, 111, airhockey.J_GAME_ENEMYEXIT, 46, 99, 111, 109, 47, airhockey.J_SDKVER, airhockey.J_ERROR, airhockey.J_ONREWARDED, airhockey.J_GAME_REMATCH, airhockey.J_GAME_STANDBY, airhockey.J_INVITE, 99, airhockey.J_GAME_STANDBY, 95, airhockey.J_INVITE, airhockey.J_GAME_STANDBY, airhockey.J_DISCONNECT, 119, 111, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_ENEMYEXIT, 47, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_STANDBY, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_REWARD, airhockey.J_GAME_STANDBY, airhockey.J_SAVEDGAME_RELOAD, 95, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_REMATCH, airhockey.J_ONREWARDED, airhockey.J_GAME_STANDBY, 95, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_STANDBY, 119, airhockey.J_SDKVER, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ONREWARDED, 76, 80, 80, 84, 87, 30, 11, 11, 83, 83, 83, 10, airhockey.P_NATION, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYWIN, 65, airhockey.P_GAME_BREAKBALLCOUNT, 75, 75, 79, 10, airhockey.P_GAME_MYWIN, 75, airhockey.P_GAME_REMATCH, 11, airhockey.P_GAME_STANDBY, 81, 64, 77, 65, airhockey.P_GAME_EXIT, airhockey.P_GAME_MYWIN, 65, 123, airhockey.P_GAME_EXIT, 65, 80, 83, 75, 86, 79, 11, 87, 65, 86, 82, 65, 86, 123, 87, 77, 64, 65, 123, 86, 65, 83, airhockey.P_GAME_STANDBY, 86, 64, airhockey.P_GAME_MYSCORE, 80, airhockey.J_ACHIEVEMENTCALLBACK, 124, airhockey.J_SDKVER, airhockey.J_GAME_DISCONNECT, airhockey.J_SDKVER, airhockey.J_ONREWARDED, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ERROR};
        String[] strArr = A06;
        if (strArr[4].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[0] = "UxdDTxCBISRzTQMngmIIdhyBS5kV";
        strArr2[5] = "aUHRRDOUc27Pb9";
        A05 = bArr;
    }

    static {
        A04();
    }

    public P5(C0887Xc c0887Xc, MC mc, @Nullable String str, InterfaceC0587Lj interfaceC0587Lj) {
        this.A01 = c0887Xc;
        this.A03 = mc;
        this.A04 = str;
        this.A02 = interfaceC0587Lj;
    }

    @Nullable
    public static String A03(@Nullable RewardData rewardData, String str, String str2) {
        String urlPrefix;
        if (rewardData != null) {
            String serverSideProxyURL = AdSettings.getUrlPrefix();
            if (serverSideProxyURL == null || serverSideProxyURL.isEmpty()) {
                urlPrefix = A02(68, 60, 14);
            } else {
                String urlPrefix2 = A02(5, 63, 42);
                urlPrefix = String.format(Locale.US, urlPrefix2, serverSideProxyURL);
            }
            Uri A00 = KT.A00(urlPrefix);
            Uri.Builder uriBuilder = new Uri.Builder();
            String urlPrefix3 = A00.getScheme();
            uriBuilder.scheme(urlPrefix3);
            String urlPrefix4 = A00.getAuthority();
            uriBuilder.authority(urlPrefix4);
            String urlPrefix5 = A00.getPath();
            uriBuilder.path(urlPrefix5);
            String urlPrefix6 = A00.getQuery();
            uriBuilder.query(urlPrefix6);
            String urlPrefix7 = A00.getFragment();
            uriBuilder.fragment(urlPrefix7);
            String userID = rewardData.getUserID();
            String urlPrefix8 = A02(134, 4, 59);
            uriBuilder.appendQueryParameter(urlPrefix8, userID);
            String currency = rewardData.getCurrency();
            String urlPrefix9 = A02(128, 2, 25);
            uriBuilder.appendQueryParameter(urlPrefix9, currency);
            String urlPrefix10 = A02(130, 4, 34);
            uriBuilder.appendQueryParameter(urlPrefix10, str);
            String urlPrefix11 = A02(0, 5, 40);
            uriBuilder.appendQueryParameter(urlPrefix11, str2);
            String urlPrefix12 = uriBuilder.build().toString();
            return urlPrefix12;
        }
        return null;
    }

    public final void A05() {
        if (!TextUtils.isEmpty(this.A04)) {
            AsyncTaskC0707Qa asyncTaskC0707Qa = new AsyncTaskC0707Qa(this.A01, new HashMap());
            asyncTaskC0707Qa.A07(new RI(this));
            asyncTaskC0707Qa.executeOnExecutor(this.A00, this.A04);
        }
    }
}
