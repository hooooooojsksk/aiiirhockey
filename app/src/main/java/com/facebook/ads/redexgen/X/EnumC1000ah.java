package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/annotation/AnnotationTarget;", "", "(Ljava/lang/String;I)V", "CLASS", "ANNOTATION_CLASS", "TYPE_PARAMETER", "PROPERTY", "FIELD", "LOCAL_VARIABLE", "VALUE_PARAMETER", "CONSTRUCTOR", "FUNCTION", "PROPERTY_GETTER", "PROPERTY_SETTER", "TYPE", "EXPRESSION", "FILE", "TYPEALIAS", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.ah */
/* loaded from: assets/audience_network.dex */
public enum EnumC1000ah {
    A03,
    A02,
    A0F,
    A0A,
    A06,
    A09,
    A0G,
    A04,
    A08,
    A0B,
    A0C,
    A0D,
    A05,
    A07,
    A0E;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-99, -86, -86, -85, -80, -99, -80, -91, -85, -86, -69, -97, -88, -99, -81, -81, -64, -55, -66, -48, -48, -64, -52, -53, -48, -47, -49, -46, -64, -47, -52, -49, 76, 95, 87, 89, 76, 90, 90, 80, 86, 85, airhockey.J_ACHIEVEMENTCALLBACK, 123, 119, 126, airhockey.J_REWARD, -113, -110, -107, -114, -69, -54, -61, -72, -55, -66, -60, -61, airhockey.J_REWARD, airhockey.J_WAIT, 109, airhockey.J_GAME_ENEMYEXIT, airhockey.J_REWARD, -119, ByteCompanionObject.MIN_VALUE, airhockey.J_GAME_ENEMYEXIT, 124, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, airhockey.J_REWARD, 111, -57, -55, -58, -57, -68, -55, -53, -48, 95, airhockey.J_SDKVER, 94, 95, 84, airhockey.J_SDKVER, 99, airhockey.J_ENEMYLOSE, airhockey.J_INVITE, 86, 84, 99, 99, 84, airhockey.J_SDKVER, -80, -78, -81, -80, -91, -78, -76, -71, -65, -77, -91, -76, -76, -91, -78, airhockey.J_DISCONNECT, airhockey.J_WAIT, airhockey.J_GOO, airhockey.J_GAME_STANDBY, airhockey.J_INVITE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_EXIT, 95, 91, 102, 99, 91, 109, -41, -36, -45, -56, -30, -45, -60, -43, -60, -48, -56, -41, -56, -43, -40, -61, -50, -41, -57, -31, -46, -61, -44, -61, -49, -57, -42, -57, -44};
    }

    static {
        A01();
    }
}
