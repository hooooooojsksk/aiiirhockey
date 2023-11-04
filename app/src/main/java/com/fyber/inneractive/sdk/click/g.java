package com.fyber.inneractive.sdk.click;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.click.l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.x;
import java.net.URISyntaxException;
import java.util.List;

/* loaded from: classes.dex */
public class g implements a {
    public final boolean a(Uri uri) {
        return uri != null && "intent".equalsIgnoreCase(uri.getScheme());
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public boolean a(Uri uri, l lVar) {
        return "intent".equalsIgnoreCase(uri.getScheme());
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public b a(Context context, Uri uri, List<i> list) {
        if (a(uri)) {
            try {
                Intent parseUri = Intent.parseUri(uri.toString(), 1);
                if (x.a(context, parseUri)) {
                    int i = IAlog.a;
                    IAlog.a(1, null, "%s %s", "DEEPLINK", uri.toString());
                    if (list != null) {
                        list.add(new i(uri.toString(), true, l.d.OPEN_IN_EXTERNAL_APPLICATION, null));
                    }
                    return l.a(uri.toString(), l.d.OPEN_IN_EXTERNAL_APPLICATION, "IntentScheme");
                }
                String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                if (!TextUtils.isEmpty(stringExtra)) {
                    try {
                        context.startActivity(x.a(context, stringExtra));
                        int i2 = IAlog.a;
                        IAlog.a(1, null, "%s %s", "Intent opened successfully, url:", stringExtra);
                        if (list != null) {
                            list.add(new i(uri.toString(), false, l.d.DEEP_LINK, null));
                            list.add(new i(stringExtra, true, l.d.OPEN_IN_EXTERNAL_APPLICATION, null));
                        }
                        return l.a(uri.toString(), l.d.OPEN_IN_EXTERNAL_APPLICATION, "IntentScheme");
                    } catch (ActivityNotFoundException unused) {
                        int i3 = IAlog.a;
                        IAlog.a(1, null, "%s %s", "Intent failed, url:", stringExtra);
                    }
                } else {
                    if (list != null) {
                        list.add(new i(uri.toString(), false, l.d.OPEN_IN_EXTERNAL_APPLICATION, "tryToOpenExternalApp has failed (intent scheme)"));
                    }
                    return l.a(uri.toString(), "IntentScheme", "tryToOpenExternalApp has failed (intent scheme)");
                }
            } catch (URISyntaxException e) {
                IAlog.a(e.getLocalizedMessage(), new Object[0]);
                if (list != null) {
                    list.add(new i(uri.toString(), false, l.d.OPEN_IN_EXTERNAL_APPLICATION, null));
                }
                return new b(uri.toString(), l.d.FAILED, "IntentScheme", e);
            }
        }
        return null;
    }
}
