package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class t implements Comparable<t> {
    public Integer[] a = new Integer[0];
    public final String b;

    /* loaded from: classes.dex */
    public static class a extends Exception {
    }

    public t(String str) throws a {
        b(str);
        a(str);
        this.b = str;
    }

    public final void a(String str) throws a {
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split("\\.")) {
            arrayList.add(Integer.valueOf(com.fyber.inneractive.sdk.util.q.a(str2, 0)));
        }
        this.a = (Integer[]) arrayList.toArray(new Integer[arrayList.size()]);
    }

    public final void b(String str) throws a {
        if (TextUtils.isEmpty(str) || !str.matches("^[0-9.]+$")) {
            throw new a();
        }
    }

    public String toString() {
        return this.b;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(t tVar) {
        if (tVar == null) {
            return 1;
        }
        int max = Math.max(this.a.length, tVar.a.length);
        int i = 0;
        while (i < max) {
            Integer[] numArr = this.a;
            int intValue = numArr.length > i ? numArr[i].intValue() : 0;
            Integer[] numArr2 = tVar.a;
            int intValue2 = numArr2.length > i ? numArr2[i].intValue() : 0;
            if (intValue > intValue2) {
                return 1;
            }
            if (intValue2 > intValue) {
                return -1;
            }
            i++;
        }
        return 0;
    }
}
