package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public final class e implements v.c {
    public final int a;
    public final List<com.fyber.inneractive.sdk.player.exoplayer2.i> b;

    public e(int i, List<com.fyber.inneractive.sdk.player.exoplayer2.i> list) {
        this.a = i;
        if (!a(32) && list.isEmpty()) {
            list = Collections.singletonList(com.fyber.inneractive.sdk.player.exoplayer2.i.a((String) null, "application/cea-608", (String) null, -1, 0, (String) null, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null));
        }
        this.b = list;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v.c
    public SparseArray<v> a() {
        return new SparseArray<>();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v.c
    public v a(int i, v.b bVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new o(new m(bVar.a));
            }
            if (i == 15) {
                if (a(2)) {
                    return null;
                }
                return new o(new d(false, bVar.a));
            } else if (i != 21) {
                if (i == 27) {
                    if (a(4)) {
                        return null;
                    }
                    return new o(new j(a(bVar), a(1), a(8)));
                } else if (i != 36) {
                    if (i != 89) {
                        if (i != 138) {
                            if (i != 129) {
                                if (i != 130) {
                                    if (i == 134) {
                                        if (a(16)) {
                                            return null;
                                        }
                                        return new r(new t());
                                    } else if (i != 135) {
                                        return null;
                                    }
                                }
                            }
                            return new o(new b(bVar.a));
                        }
                        return new o(new f(bVar.a));
                    }
                    return new o(new g(bVar.b));
                } else {
                    return new o(new k(a(bVar)));
                }
            } else {
                return new o(new l());
            }
        }
        return new o(new i());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    public final s a(v.b bVar) {
        String str;
        int i;
        if (a(32)) {
            return new s(this.b);
        }
        byte[] bArr = bVar.c;
        int length = bArr.length;
        int i2 = 0;
        ArrayList arrayList = this.b;
        while (length - i2 > 0) {
            int i3 = i2 + 1;
            int i4 = bArr[i2] & UByte.MAX_VALUE;
            int i5 = i3 + 1;
            int i6 = (bArr[i3] & UByte.MAX_VALUE) + i5;
            boolean z = true;
            if (i4 == 134) {
                arrayList = new ArrayList();
                int i7 = i5 + 1;
                int i8 = bArr[i5] & UByte.MAX_VALUE & 31;
                for (int i9 = 0; i9 < i8; i9++) {
                    String str2 = new String(bArr, i7, 3, Charset.defaultCharset());
                    int i10 = i7 + 3;
                    int i11 = i10 + 1;
                    int i12 = bArr[i10] & UByte.MAX_VALUE;
                    if ((i12 & 128) != 0) {
                        i = i12 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    arrayList.add(com.fyber.inneractive.sdk.player.exoplayer2.i.a(null, str, null, -1, 0, str2, i, null, LongCompanionObject.MAX_VALUE, Collections.emptyList()));
                    i7 = i11 + 2;
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(i7 >= 0 && i7 <= length);
                }
            }
            if (i6 < 0 || i6 > length) {
                z = false;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z);
            i2 = i6;
            arrayList = arrayList;
        }
        return new s(arrayList);
    }

    public final boolean a(int i) {
        return (i & this.a) != 0;
    }
}
