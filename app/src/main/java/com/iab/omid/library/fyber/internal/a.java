package com.iab.omid.library.fyber.internal;

import android.content.Context;
import com.iab.omid.library.fyber.internal.d;
import java.util.Date;

/* loaded from: classes2.dex */
public class a implements d.a {
    private static a f = new a(new d());
    protected com.iab.omid.library.fyber.utils.f a = new com.iab.omid.library.fyber.utils.f();
    private Date b;
    private boolean c;
    private d d;
    private boolean e;

    private a(d dVar) {
        this.d = dVar;
    }

    public static a a() {
        return f;
    }

    private void c() {
        if (!this.c || this.b == null) {
            return;
        }
        for (com.iab.omid.library.fyber.adsession.a aVar : c.c().a()) {
            aVar.getAdSessionStatePublisher().a(b());
        }
    }

    public void a(Context context) {
        if (this.c) {
            return;
        }
        this.d.a(context);
        this.d.a(this);
        this.d.e();
        this.e = this.d.c();
        this.c = true;
    }

    @Override // com.iab.omid.library.fyber.internal.d.a
    public void a(boolean z) {
        if (!this.e && z) {
            d();
        }
        this.e = z;
    }

    public Date b() {
        Date date = this.b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a = this.a.a();
        Date date = this.b;
        if (date == null || a.after(date)) {
            this.b = a;
            c();
        }
    }
}
