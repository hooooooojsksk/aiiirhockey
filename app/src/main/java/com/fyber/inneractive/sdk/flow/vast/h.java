package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.n;
import com.fyber.inneractive.sdk.model.vast.p;
import java.util.Comparator;

/* loaded from: classes.dex */
public class h implements Comparator<n> {
    public int a;
    public int b;
    public int c;

    public h(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final Integer a(String str) {
        p a = p.a(str);
        if (a == p.MEDIA_TYPE_MP4) {
            return 3;
        }
        if (a == p.MEDIA_TYPE_3GPP) {
            return 2;
        }
        if (a == p.MEDIA_TYPE_WEBM) {
            return 1;
        }
        return -1;
    }

    @Override // java.util.Comparator
    public int compare(n nVar, n nVar2) {
        n nVar3 = nVar;
        n nVar4 = nVar2;
        if (!TextUtils.equals("VPAID", nVar4.f)) {
            if (!TextUtils.equals("VPAID", nVar3.f)) {
                Integer num = nVar3.e;
                int intValue = num == null ? 0 : num.intValue();
                Integer num2 = nVar4.e;
                int intValue2 = num2 == null ? 0 : num2.intValue();
                int i = this.a;
                if (intValue2 <= i || intValue > i) {
                    if (intValue <= i || intValue2 > i) {
                        int compareTo = a(nVar4.d).compareTo(a(nVar3.d));
                        if (compareTo != 0) {
                            return compareTo;
                        }
                        if (intValue >= intValue2) {
                            if (intValue <= intValue2) {
                                Integer num3 = nVar3.b;
                                int intValue3 = num3 == null ? 0 : num3.intValue();
                                Integer num4 = nVar3.c;
                                int intValue4 = num4 == null ? 0 : num4.intValue();
                                Integer num5 = nVar4.b;
                                int intValue5 = num5 == null ? 0 : num5.intValue();
                                Integer num6 = nVar4.c;
                                int i2 = intValue3 * intValue4;
                                int intValue6 = intValue5 * (num6 == null ? 0 : num6.intValue());
                                int i3 = this.b * this.c;
                                int abs = Math.abs(i2 - i3);
                                int abs2 = Math.abs(intValue6 - i3);
                                if (abs >= abs2) {
                                    if (abs <= abs2) {
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
