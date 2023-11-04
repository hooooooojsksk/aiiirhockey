package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class l implements Runnable {
    public final /* synthetic */ i a;

    public l(i iVar) {
        this.a = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            i iVar = this.a;
            if (iVar.Y != null) {
                IAlog.a("%sunregistering orientation broadcast receiver", IAlog.a(iVar));
                this.a.Y.a();
            }
        } catch (IllegalArgumentException e) {
            if (e.getMessage() != null && !e.getMessage().contains("Receiver not registered")) {
                throw e;
            }
        }
        this.a.Y = null;
    }
}
