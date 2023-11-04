package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.a7 */
/* loaded from: assets/audience_network.dex */
public class C0967a7 implements InterfaceC00840i, InterfaceC00880n {
    public static byte[] A0A;
    public static String[] A0B = {"OTBhn", "woE0GsYsDC", "jJJsRhZ6eh", "RbmDZKGZyk", "MbYnCV2deeCvNEpfUSPgn7RvJuamywdV", "va4Mi1JJiq4w08mNkhVxy34L1bzftr4W", "QQZqW8pW387BdDH3gcXSwYVoWAeaIxNz", "E72k8"};
    public static final String A0C;
    public int A00;
    public AnonymousClass11 A01;
    @Nullable
    public AnonymousClass12 A02;
    @Nullable
    public InterfaceC0528Ix A03;
    @Nullable
    public List<C0799Tp> A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C0887Xc A09;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 106);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0A = new byte[]{124, 89, 92, 77, airhockey.P_GAME_REMATCH, 88, 79, 29, 92, 81, 79, 88, 92, 89, airhockey.P_GAME_SELECTMAP, 29, 81, 82, 92, 89, 88, 89, 29, 89, 92, airhockey.P_GAME_REMATCH, 92, 93, airhockey.J_SAVEDGAME_RELOAD, 119, 125, airhockey.J_ERROR, 62, airhockey.J_REWARD, ByteCompanionObject.MAX_VALUE, airhockey.J_INVITE, airhockey.J_INVITE, 123, airhockey.J_GOO, 123, airhockey.J_PURCHASE, 62, airhockey.J_BACK, airhockey.J_GOO, 62, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_BACK, 125, airhockey.J_ERROR, 109, 125, airhockey.J_GAME_DISCONNECT, 123, 123, airhockey.J_GOO, 62, ByteCompanionObject.MAX_VALUE, airhockey.J_PURCHASE, airhockey.J_ENEMYLOSE, airhockey.P_GAME_MYWIN, airhockey.P_NATION, airhockey.P_GAME_MYLOSE, 64, 11, airhockey.P_GAME_MYWIN, airhockey.P_GAME_SELECTMAP, 76, 76, 78, 79, 45, 26, 26, 7, 26, airhockey.P_GAME_MYLOSE, 13, 16, 13, 11, 29, 28, 1, 6, 15, airhockey.P_GAME_MYLOSE, 9, 11, 28, 1, 7, 6, 64, airhockey.P_NATION, 81, airhockey.P_GAME_MYWIN, 64, 77, 87, 54, 52, 39, 49, 60, 59, 49, 92, 75, 48, 45, 34, 51, 48, 43, 44, 55, airhockey.P_NATION, 93, 81, airhockey.P_GAME_MYSCORE};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A06(Map<String, String> map, Map<String, String> map2) {
        try {
            new Handler().postDelayed(new C0968a8(this, map2, A03(map)), this.A01.A07() * 1000);
        } catch (Exception unused) {
        }
    }

    static {
        A04();
        A0C = C0967a7.class.getSimpleName();
    }

    public C0967a7(C0887Xc c0887Xc) {
        this(c0887Xc, new AnonymousClass11());
    }

    public C0967a7(C0887Xc c0887Xc, AnonymousClass11 anonymousClass11) {
        this.A00 = 200;
        this.A01 = anonymousClass11;
        this.A09 = c0887Xc;
    }

    private Map<String, String> A03(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        String A02 = A02(116, 4, 94);
        if (map.containsKey(A02)) {
            hashMap.put(A02, map.get(A02));
        }
        String A022 = A02(108, 8, 41);
        if (map.containsKey(A022)) {
            hashMap.put(A022, map.get(A022));
        }
        return hashMap;
    }

    private void A05(AnonymousClass11 anonymousClass11) {
        if (!this.A05) {
            this.A01 = anonymousClass11;
            List<AnonymousClass11> A0f = this.A01.A0f();
            if (A0f != null && A0f.size() > 0) {
                int size = A0f.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    C0967a7 adapter = new C0967a7(this.A09);
                    adapter.A05(A0f.get(i));
                    arrayList.add(new C0799Tp(this.A09, adapter, (C8B) null, this.A03));
                }
                this.A04 = arrayList;
            }
            this.A05 = true;
            this.A06 = A07();
            return;
        }
        throw new IllegalStateException(A02(0, 27, 87));
    }

    private boolean A07() {
        if (((!this.A01.A0h() && !TextUtils.isEmpty(this.A01.A0W())) || (!TextUtils.isEmpty(this.A01.A0T()) && this.A01.A0h())) && (this.A01.A0G() != null || this.A01.A0h())) {
            C0529Iy A0F = this.A01.A0F();
            if (A0B[2].length() != 10) {
                throw new RuntimeException();
            }
            A0B[6] = "coz4LHwVNN2LSDndRSBnj9WvwXuRM5HO";
            if (A0F != null || A7L() == AdPlacementType.NATIVE_BANNER) {
                return true;
            }
        }
        return false;
    }

    public final int A08() {
        return this.A01.A02();
    }

    public final int A09() {
        return this.A01.A05();
    }

    public final int A0A() {
        int A06 = this.A01.A06();
        if (A06 < 0 || A06 > 100) {
            return 0;
        }
        return A06;
    }

    public final int A0B() {
        return this.A00;
    }

    public final int A0C() {
        return this.A01.A08();
    }

    public final int A0D() {
        return this.A01.A09();
    }

    public final AnonymousClass11 A0E() {
        return this.A01;
    }

    @Nullable
    public final AnonymousClass12 A0F() {
        return this.A02;
    }

    public final String A0G() {
        return this.A01.A0a();
    }

    @Nullable
    public final List<C0799Tp> A0H() {
        if (!A0T()) {
            return null;
        }
        return this.A04;
    }

    public final void A0I() {
        if (!this.A08) {
            String A0b = A0E().A0b();
            if (A0B[2].length() != 10) {
                throw new RuntimeException();
            }
            A0B[5] = "8ArINtb0xmmgo9NmELWQk3NiIhKYvaDc";
            if (A0b != null) {
                this.A09.A09().ADV(A0b);
            }
            this.A08 = true;
        }
    }

    public final void A0J() {
        Iterator<C0799Tp> it;
        List<C0799Tp> list = this.A04;
        if (list == null) {
            return;
        }
        boolean isEmpty = list.isEmpty();
        if (A0B[6].charAt(13) != 'D') {
            throw new RuntimeException();
        }
        A0B[6] = "kj4WnsmCok25qDrlf1kxSYggARLvW33C";
        if (!isEmpty) {
            List<C0799Tp> list2 = this.A04;
            if (A0B[2].length() != 10) {
                it = list2.iterator();
            } else {
                A0B[2] = "wGXHpE1nya";
                it = list2.iterator();
            }
            while (true) {
                boolean hasNext = it.hasNext();
                if (A0B[2].length() != 10) {
                    A0B[6] = "0lb5BUzW8n1EJDWyWAqaA7d0lZJNpkzV";
                    if (!hasNext) {
                        return;
                    }
                } else {
                    A0B[5] = "QJQdkpg5cmGOeaue26HVF3aLtsB2qwfM";
                    if (!hasNext) {
                        return;
                    }
                }
                it.next().unregisterView();
            }
        }
    }

    public final void A0K(AnonymousClass12 anonymousClass12) {
        this.A02 = anonymousClass12;
    }

    public final void A0L(C0887Xc c0887Xc, AnonymousClass12 anonymousClass12, InterfaceC0505Ia interfaceC0505Ia, C01171q c01171q, InterfaceC0528Ix interfaceC0528Ix) {
        int i;
        this.A02 = anonymousClass12;
        this.A03 = interfaceC0528Ix;
        JSONObject A03 = c01171q.A03();
        C8B A01 = c01171q.A01();
        if (A01 != null) {
            i = A01.A06();
        } else {
            i = 200;
        }
        this.A00 = i;
        A05(AnonymousClass13.A00(c0887Xc, A03, C0568Kq.A02(A03, A02(106, 2, 85))));
        if (C00850j.A06(c0887Xc, this, interfaceC0505Ia)) {
            c0887Xc.A0E().A44();
            anonymousClass12.ABr(this, JA.A00(AdErrorType.NO_FILL));
        } else if (anonymousClass12 != null) {
            anonymousClass12.ABo(this);
        }
    }

    public final void A0M(Map<String, String> map) {
        if (!A0T()) {
            return;
        }
        boolean shouldBlockLockscreenClicks = IK.A1V(this.A09);
        if (shouldBlockLockscreenClicks) {
            boolean shouldBlockLockscreenClicks2 = LM.A03(map);
            if (shouldBlockLockscreenClicks2) {
                String str = A0C;
                if (A0B[4].charAt(15) != 'f') {
                    throw new RuntimeException();
                }
                A0B[6] = "D3JUlaax70Z19DqZX7Vx94n8SobUQcIP";
                Log.e(str, A02(27, 31, 116));
                return;
            }
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        KZ.A02(this.A09, A02(58, 12, 65));
        AnonymousClass12 anonymousClass12 = this.A02;
        if (anonymousClass12 != null) {
            anonymousClass12.ABn(this);
        }
        boolean shouldBlockLockscreenClicks3 = this.A01.A0h();
        if (shouldBlockLockscreenClicks3) {
            hashMap.put(A02(99, 7, 63), String.valueOf(A0E().A04()));
            hashMap.put(A02(92, 7, 73), String.valueOf(A0E().A03()));
        }
        C0887Xc c0887Xc = this.A09;
        AbstractC00810f A00 = C00820g.A00(c0887Xc, c0887Xc.A09(), this.A01.A0Y(), this.A01.A0B(), hashMap);
        if (A00 != null) {
            try {
                A00.A0C();
            } catch (Exception e) {
                Log.e(A0C, A02(70, 22, 2), e);
            }
        }
    }

    public final void A0N(Map<String, String> extraData) {
        this.A09.A09().A98(this.A01.A0Y(), extraData);
    }

    public final void A0O(Map<String, String> map) {
        if (A0T() && !this.A07) {
            AnonymousClass12 anonymousClass12 = this.A02;
            if (anonymousClass12 != null) {
                anonymousClass12.ABp(this);
            }
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (this.A01.A0h()) {
                hashMap.put(A02(99, 7, 63), String.valueOf(A0E().A04()));
                hashMap.put(A02(92, 7, 73), String.valueOf(A0E().A03()));
            }
            if (!TextUtils.isEmpty(A6B())) {
                if (!this.A01.A0h()) {
                    this.A09.A0E().A2Z();
                    AnonymousClass29.A00(this.A01.A0Z());
                }
                this.A09.A09().A9H(A6B(), hashMap);
            }
            if (A0V() || A0W()) {
                A06(map, hashMap);
            }
            this.A07 = true;
        }
    }

    public final void A0P(Map<String, String> extraData) {
        this.A09.A09().A9Z(this.A01.A0Y(), extraData);
    }

    public final void A0Q(Map<String, String> extraData) {
        this.A09.A09().A9a(this.A01.A0Y(), extraData);
    }

    public final boolean A0R() {
        return true;
    }

    public final boolean A0S() {
        return A0T() && this.A01.A0B() != null;
    }

    public final boolean A0T() {
        return this.A05 && this.A06;
    }

    public final boolean A0U() {
        return this.A01.A0g();
    }

    public final boolean A0V() {
        if (IK.A16(this.A09) && A0T()) {
            boolean A0i = this.A01.A0i();
            if (A0B[4].charAt(15) != 'f') {
                throw new RuntimeException();
            }
            A0B[6] = "hsrOxssvGH6abDOIeI9T6FJFSNjQSl4a";
            if (A0i) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0W() {
        if (IK.A16(this.A09) && A0T()) {
            boolean A0j = this.A01.A0j();
            String[] strArr = A0B;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0B[2] = "qputmJyOXU";
            if (A0j) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00840i
    public final String A6B() {
        return this.A01.A0Y();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00840i
    @Nullable
    public final Collection<String> A6U() {
        return A0E().A0e();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00840i
    @Nullable
    public final EnumC00830h A6w() {
        return A0E().A0C();
    }

    public AdPlacementType A7L() {
        return AdPlacementType.NATIVE;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00880n
    public final boolean AFX() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00880n
    public final void onDestroy() {
    }
}
