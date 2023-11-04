package com.fyber.inneractive.sdk.flow.vast;

import android.view.View;
import java.util.Comparator;

/* loaded from: classes.dex */
public class a {
    public int d;
    public String e;
    public boolean a = false;
    public View b = null;
    public boolean c = false;
    public EnumC0017a f = EnumC0017a.HIGH;

    /* renamed from: com.fyber.inneractive.sdk.flow.vast.a$a */
    /* loaded from: classes.dex */
    public enum EnumC0017a {
        HIGH,
        LOW
    }

    /* loaded from: classes.dex */
    public static class b implements Comparator<a> {
        @Override // java.util.Comparator
        public int compare(a aVar, a aVar2) {
            return aVar.f.ordinal() - aVar2.f.ordinal();
        }
    }

    public void a(View view) {
        this.b = view;
    }

    public void a() {
        this.b = null;
        this.a = false;
    }
}
