package com.fyber.inneractive.sdk.external;

import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.util.q;
import java.lang.Thread;

/* loaded from: classes.dex */
public class a implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ SharedPreferences a;
    public final /* synthetic */ Thread.UncaughtExceptionHandler b;

    public a(SharedPreferences sharedPreferences, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = sharedPreferences;
        this.b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        SharedPreferences sharedPreferences = this.a;
        String a = q.a(th);
        if (a.contains("com.fyber.inneractive")) {
            sharedPreferences.edit().putString("FyberExceptionKey", a).putString("FyberVersionKey", InneractiveAdManager.getVersion()).putString("FyberNameKey", th.getClass().getName()).putString("FyberDescriptionKey", th.getLocalizedMessage()).commit();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
