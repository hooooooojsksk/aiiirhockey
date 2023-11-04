package com.fyber.inneractive.sdk.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public class w {
    public static String a(long j, long j2) {
        return new SimpleDateFormat("ss:S", Locale.getDefault()).format(new Date((System.currentTimeMillis() - j) - j2));
    }
}
