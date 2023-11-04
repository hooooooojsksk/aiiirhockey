package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.fyber.inneractive.sdk.click.l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.x;
import com.google.android.gms.drive.DriveFile;
import java.util.List;

/* loaded from: classes.dex */
public class h implements a {
    public final String a;
    public boolean b;

    public h(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public boolean a(Uri uri, l lVar) {
        return "fybernativebrowser".equalsIgnoreCase(uri.getScheme()) || "fybernativebrowser".equalsIgnoreCase(this.a) || this.b;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public b a(Context context, Uri uri, List<i> list) {
        String str;
        x.a aVar;
        String uri2 = uri.toString();
        x.c cVar = x.c.OPEN_EVERYTHING;
        try {
            str = context.getClass().getName();
        } catch (Throwable unused) {
            str = "failed";
        }
        try {
            IAlog.a("IAJavaUtil - valid url found: '%s' opening browser", uri2);
            try {
                context.startActivity(x.a(context, uri2));
                aVar = new x.a(x.d.OPEN_IN_EXTERNAL_BROWSER, null, str);
            } catch (ActivityNotFoundException unused2) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("googlechrome://navigate?url=%s", uri2)));
                if (!(context instanceof Activity)) {
                    intent.addFlags(DriveFile.MODE_READ_ONLY);
                }
                context.startActivity(intent);
                if (1 != 0) {
                    aVar = new x.a(x.d.OPENED_USING_CHROME_NAVIGATE, null, str);
                } else {
                    aVar = new x.a(x.d.FAILED, new x.b("tryOpeningChromeGracefully has failed and couldn't open the url"), str);
                }
            }
        } catch (Throwable th) {
            IAlog.a("IAJavaUtil - could not open a browser for url: %s", uri2);
            aVar = new x.a(x.d.FAILED, th, str);
        }
        if (list != null) {
            Throwable th2 = aVar.b;
            if (th2 != null) {
                list.add(new i(uri2, false, null, th2.toString()));
            } else {
                list.add(new i(uri2, true, l.d.OPENED_IN_EXTERNAL_BROWSER, null));
            }
        }
        return l.a(uri.toString(), l.d.OPENED_IN_EXTERNAL_BROWSER, "FyberNativeBrowser");
    }
}
