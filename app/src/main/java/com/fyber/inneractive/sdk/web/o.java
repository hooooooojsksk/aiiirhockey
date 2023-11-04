package com.fyber.inneractive.sdk.web;

import android.widget.Toast;

/* loaded from: classes.dex */
public class o implements Runnable {
    public final /* synthetic */ String a;

    public o(i iVar, String str) {
        this.a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        Toast.makeText(com.fyber.inneractive.sdk.util.l.a, this.a, 0).show();
    }
}
