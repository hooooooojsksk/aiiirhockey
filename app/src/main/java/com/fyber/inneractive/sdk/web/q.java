package com.fyber.inneractive.sdk.web;

import android.content.DialogInterface;

/* loaded from: classes.dex */
public class q implements DialogInterface.OnClickListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ i b;

    public q(i iVar, String str) {
        this.b = iVar;
        this.a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.a(this.a);
    }
}
