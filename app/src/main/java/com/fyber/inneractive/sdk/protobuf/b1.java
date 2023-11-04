package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes.dex */
public final class b1 implements m0 {
    public final o0 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public b1(o0 o0Var, String str, Object[] objArr) {
        char charAt;
        this.a = o0Var;
        this.b = str;
        this.c = objArr;
        int i = 1;
        try {
            charAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str2 = new String(charArray);
            try {
                try {
                    charAt = str2.charAt(0);
                    str = str2;
                } catch (ArrayIndexOutOfBoundsException e) {
                    e = e;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                } catch (StringIndexOutOfBoundsException e2) {
                    e = e2;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                }
            } catch (StringIndexOutOfBoundsException unused2) {
                char[] cArr = new char[str2.length()];
                str2.getChars(0, str2.length(), cArr, 0);
                String str3 = new String(cArr);
                try {
                    charAt = str3.charAt(0);
                    str = str3;
                } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e3) {
                    e = e3;
                    str2 = str3;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                }
            }
        }
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        while (true) {
            int i4 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 < 55296) {
                this.d = (charAt2 << i3) | i2;
                return;
            }
            i2 |= (charAt2 & 8191) << i3;
            i3 += 13;
            i = i4;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m0
    public y0 a() {
        return (this.d & 1) == 1 ? y0.PROTO2 : y0.PROTO3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m0
    public o0 b() {
        return this.a;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m0
    public boolean c() {
        return (this.d & 2) == 2;
    }
}
