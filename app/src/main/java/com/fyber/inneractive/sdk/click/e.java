package com.fyber.inneractive.sdk.click;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.click.l;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.u;
import java.util.List;

/* loaded from: classes.dex */
public class e implements u<c> {
    public final /* synthetic */ List a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ f c;

    public e(f fVar, List list, Uri uri) {
        this.c = fVar;
        this.a = list;
        this.b = uri;
    }

    @Override // com.fyber.inneractive.sdk.network.u
    public void a(c cVar, Exception exc, boolean z) {
        c cVar2 = cVar;
        if (exc == null && cVar2 != null) {
            if (cVar2.a.size() > 0) {
                List<String> list = cVar2.a;
                String str = list.get(list.size() - 1);
                if (this.a != null) {
                    for (String str2 : cVar2.a) {
                        if (!TextUtils.equals(str2, str)) {
                            this.a.add(new i(str2, true, l.d.INTERNAL_REDIRECT, null));
                        }
                    }
                    List list2 = this.a;
                    l.d dVar = l.d.OPEN_INTERNAL_STORE;
                    list2.add(new i(str, true, dVar, null));
                    this.c.getClass();
                    b a = l.a(str, dVar, "IgniteGooglePlay");
                    a.f = this.a;
                    f fVar = this.c;
                    fVar.c.a(a, fVar.d, fVar.e);
                }
                if (str.startsWith("market")) {
                    IAConfigManager.a(str.replace("market://details?id=", "https://play.google.com/store/apps/details?id="), null);
                    return;
                } else {
                    IAConfigManager.a(str, cVar2.b);
                    return;
                }
            }
            return;
        }
        IAConfigManager.a(this.b.toString(), null);
        Uri uri = this.b;
        this.c.getClass();
        b a2 = l.a(uri.toString(), "IgniteGooglePlay", "failed getting redirects");
        List list3 = this.a;
        if (list3 != null) {
            list3.add(new i(this.b.toString(), false, l.d.INTERNAL_REDIRECT, "failed getting redirects. ignite click handler"));
            a2.f = this.a;
        }
        f fVar2 = this.c;
        fVar2.c.a(a2, fVar2.d, fVar2.e);
    }
}
