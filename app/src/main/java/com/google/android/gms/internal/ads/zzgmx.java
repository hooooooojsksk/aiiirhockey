package com.google.android.gms.internal.ads;

import com.mobirix.airhockey.airhockey;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgmx {
    static final byte[][] zza = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, airhockey.J_PURCHASE, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, airhockey.J_GAME_EXIT, -38, 9, -115, -21, -100, 50, -79, -3, -122, airhockey.J_NATION, 5, 22, 95, airhockey.P_GAME_REMATCH, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, airhockey.P_GAME_SELECTMAP, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, ByteCompanionObject.MAX_VALUE}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, ByteCompanionObject.MAX_VALUE}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, ByteCompanionObject.MAX_VALUE}};
    public static final /* synthetic */ int zzb = 0;

    public static void zza(long[] jArr, long[] jArr2, int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            int i3 = (int) jArr[i2];
            int i4 = (-i) & (((int) jArr2[i2]) ^ i3);
            jArr[i2] = i3 ^ i4;
            jArr2[i2] = i4 ^ ((int) jArr2[i2]);
        }
    }
}
