package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public class n {
    public static boolean a(Context context, h hVar) {
        o0 o0Var;
        PriorityQueue priorityQueue = (PriorityQueue) hVar.a;
        do {
            o0Var = (o0) priorityQueue.poll();
            if (o0Var == null) {
                break;
            }
        } while (!a(context, o0Var.b));
        if (o0Var == null) {
            return false;
        }
        boolean a = x.a(context, new Intent("android.intent.action.VIEW", o0Var.b));
        if (a) {
            for (String str : o0Var.c) {
                if (!TextUtils.isEmpty(str)) {
                    int i = IAlog.a;
                    IAlog.a(1, null, "%s %s", "SMART_LINK", str);
                }
                com.fyber.inneractive.sdk.network.g0.b(str);
            }
        }
        return a;
    }

    public static boolean a(Context context, Uri uri) {
        if (context == null || uri == null) {
            return false;
        }
        try {
            return !context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0).isEmpty();
        } catch (Exception unused) {
            IAlog.a("%sFyberDeepLink: Invalid url ", uri);
            return false;
        }
    }
}
