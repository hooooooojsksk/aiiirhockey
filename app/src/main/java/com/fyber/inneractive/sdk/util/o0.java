package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public class o0 implements Comparable<o0> {
    public a a;
    public Uri b;
    public List<String> c;

    /* loaded from: classes.dex */
    public enum a {
        Primary(1),
        FallBack(2);
        
        public Integer mPriority;

        a(Integer num) {
            this.mPriority = num;
        }
    }

    public o0(a aVar, Uri uri, List<String> list) {
        this.a = aVar;
        this.b = uri;
        this.c = list;
    }

    @Override // java.lang.Comparable
    public int compareTo(o0 o0Var) {
        return this.a.mPriority.compareTo(o0Var.a.mPriority);
    }
}
