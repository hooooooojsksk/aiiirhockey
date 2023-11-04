package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.click.l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.x;
import com.google.android.gms.drive.DriveFile;
import cz.msebera.android.httpclient.HttpHost;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class j implements com.fyber.inneractive.sdk.click.a {
    public static final Comparator<ResolveInfo> a = new a();

    /* loaded from: classes.dex */
    public class a implements Comparator<ResolveInfo> {
        @Override // java.util.Comparator
        public int compare(ResolveInfo resolveInfo, ResolveInfo resolveInfo2) {
            ActivityInfo activityInfo;
            String str;
            ResolveInfo resolveInfo3 = resolveInfo2;
            ActivityInfo activityInfo2 = resolveInfo.activityInfo;
            if (activityInfo2 == null || (activityInfo = resolveInfo3.activityInfo) == null || (str = activityInfo2.packageName) == null) {
                return 1;
            }
            return str.compareTo(activityInfo.packageName);
        }
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public b a(Context context, Uri uri, List<i> list) {
        Intent intent;
        ResolveInfo resolveInfo;
        boolean z = true;
        if (Build.VERSION.SDK_INT > 29) {
            String scheme = uri.getScheme();
            if (!(HttpHost.DEFAULT_SCHEME_NAME.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme))) {
                z = false;
            }
        }
        if (z) {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 32);
            if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                return null;
            }
            List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.fyber.com")), 32);
            TreeSet treeSet = new TreeSet(a);
            treeSet.addAll(queryIntentActivities2);
            queryIntentActivities.removeAll(treeSet);
            if (queryIntentActivities.size() <= 0 || (resolveInfo = queryIntentActivities.get(0)) == null) {
                intent = null;
            } else {
                intent = new Intent("android.intent.action.VIEW", uri);
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
                if (!(context instanceof Activity)) {
                    intent.setFlags(DriveFile.MODE_READ_ONLY);
                }
            }
            if (intent != null) {
                return a(context, intent, uri, list);
            }
            return null;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", uri);
        if (!(context instanceof Activity)) {
            intent2.setFlags(DriveFile.MODE_READ_ONLY);
        }
        return a(context, intent2, uri, list);
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public boolean a(Uri uri, l lVar) {
        return true;
    }

    public final b a(Context context, Intent intent, Uri uri, List<i> list) {
        try {
            context.startActivity(intent);
            if (list != null) {
                list.add(new i(uri.toString(), true, a(intent), null));
            }
            return l.a(uri.toString(), a(intent), "Resolver");
        } catch (Exception e) {
            IAlog.a(e.getLocalizedMessage(), new Object[0]);
            if (list != null) {
                list.add(new i(uri.toString(), false, l.d.OPEN_IN_EXTERNAL_APPLICATION, null));
            }
            return l.a(uri.toString(), "Resolver", "failed starting resolved activity - " + e.getMessage());
        }
    }

    public final l.d a(Intent intent) {
        boolean z = false;
        if (intent.getData() != null) {
            String uri = intent.getData().toString();
            int i = x.b;
            if (!TextUtils.isEmpty(uri)) {
                Uri parse = Uri.parse(uri);
                String host = parse.getHost();
                String scheme = parse.getScheme();
                if (((uri.startsWith("http:") || uri.startsWith("https:")) && ("play.google.com".equalsIgnoreCase(host) || "market.android.com".equalsIgnoreCase(host))) || "market".equalsIgnoreCase(scheme)) {
                    z = true;
                }
            }
        }
        return z ? l.d.OPEN_GOOGLE_STORE : l.d.OPEN_IN_EXTERNAL_APPLICATION;
    }
}
