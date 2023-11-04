package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.s1;
import java.io.IOException;

/* loaded from: classes.dex */
public class m1 extends k1<l1, l1> {
    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public void a(l1 l1Var, int i, int i2) {
        l1Var.a(r1.a(i, 5), Integer.valueOf(i2));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public boolean a(c1 c1Var) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public void b(l1 l1Var, int i, long j) {
        l1Var.a(r1.a(i, 0), Long.valueOf(j));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public int c(l1 l1Var) {
        return l1Var.b();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public int d(l1 l1Var) {
        l1 l1Var2 = l1Var;
        int i = l1Var2.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < l1Var2.a; i3++) {
            int i4 = l1Var2.b[i3];
            int i5 = r1.a;
            i2 += (l.b(1) * 2) + l.f(2, i4 >>> 3) + l.a(3, (i) l1Var2.c[i3]);
        }
        l1Var2.d = i2;
        return i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public void e(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.e = false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public l1 f(l1 l1Var) {
        l1 l1Var2 = l1Var;
        l1Var2.e = false;
        return l1Var2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public void a(l1 l1Var, int i, long j) {
        l1Var.a(r1.a(i, 1), Long.valueOf(j));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public void b(Object obj, l1 l1Var) {
        ((GeneratedMessageLite) obj).unknownFields = l1Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public void c(Object obj, l1 l1Var) {
        ((GeneratedMessageLite) obj).unknownFields = l1Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public void a(l1 l1Var, int i, l1 l1Var2) {
        l1Var.a(r1.a(i, 3), l1Var2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public void b(l1 l1Var, s1 s1Var) throws IOException {
        l1Var.a(s1Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public void a(l1 l1Var, int i, i iVar) {
        l1Var.a(r1.a(i, 2), iVar);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public l1 b(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public l1 a(l1 l1Var, l1 l1Var2) {
        l1 l1Var3 = l1Var;
        l1 l1Var4 = l1Var2;
        return l1Var4.equals(l1.f) ? l1Var3 : l1.a(l1Var3, l1Var4);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public void a(l1 l1Var, s1 s1Var) throws IOException {
        l1 l1Var2 = l1Var;
        l1Var2.getClass();
        m mVar = (m) s1Var;
        mVar.getClass();
        if (s1.a.ASCENDING == s1.a.DESCENDING) {
            for (int i = l1Var2.a - 1; i >= 0; i--) {
                int i2 = l1Var2.b[i];
                int i3 = r1.a;
                mVar.a(i2 >>> 3, l1Var2.c[i]);
            }
            return;
        }
        for (int i4 = 0; i4 < l1Var2.a; i4++) {
            int i5 = l1Var2.b[i4];
            int i6 = r1.a;
            mVar.a(i5 >>> 3, l1Var2.c[i4]);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public l1 a() {
        return l1.c();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public l1 a(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        l1 l1Var = generatedMessageLite.unknownFields;
        if (l1Var == l1.f) {
            l1 c = l1.c();
            generatedMessageLite.unknownFields = c;
            return c;
        }
        return l1Var;
    }
}
