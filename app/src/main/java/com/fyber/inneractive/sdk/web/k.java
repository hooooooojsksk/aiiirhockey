package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.IntentFilter;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.i;

/* loaded from: classes.dex */
public class k implements Runnable {
    public final /* synthetic */ i a;

    public k(i iVar) {
        this.a = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        i iVar = this.a;
        if (iVar.Y == null) {
            try {
                IAlog.a("%sregistering orientation broadcast receiver", IAlog.a(iVar));
                this.a.Y = new i.C0058i();
                if (this.a.m() != null) {
                    i iVar2 = this.a;
                    i<T>.C0058i c0058i = iVar2.Y;
                    Context m = iVar2.m();
                    i iVar3 = i.this;
                    iVar3.getClass();
                    IAlog.a("%sregister screen broadcast receiver", IAlog.a(iVar3));
                    c0058i.a = m;
                    m.registerReceiver(c0058i, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
                }
            } catch (Exception e) {
                i iVar4 = this.a;
                iVar4.getClass();
                IAlog.e("%sfailed registering orientation broadcast recevier", IAlog.a(iVar4));
                if (IAlog.a >= 3) {
                    e.printStackTrace();
                }
            }
        }
    }
}
