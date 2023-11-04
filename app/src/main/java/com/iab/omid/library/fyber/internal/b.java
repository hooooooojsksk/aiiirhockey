package com.iab.omid.library.fyber.internal;

import android.view.View;

/* loaded from: classes2.dex */
public class b extends d {
    private static b d = new b();

    private b() {
    }

    public static b g() {
        return d;
    }

    @Override // com.iab.omid.library.fyber.internal.d
    public void b(boolean z) {
        for (com.iab.omid.library.fyber.adsession.a aVar : c.c().b()) {
            aVar.getAdSessionStatePublisher().a(z);
        }
    }

    @Override // com.iab.omid.library.fyber.internal.d
    public boolean d() {
        for (com.iab.omid.library.fyber.adsession.a aVar : c.c().a()) {
            View c = aVar.c();
            if (c != null && c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
