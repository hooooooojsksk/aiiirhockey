package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes.dex */
public class i implements Runnable {
    public final /* synthetic */ h a;

    public i(h hVar) {
        this.a = hVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.fyber.inneractive.sdk.renderers.h.a(com.fyber.inneractive.sdk.renderers.h, boolean):boolean
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
        Caused by: java.lang.NullPointerException
        */
    @Override // java.lang.Runnable
    public void run() {
        /*
            r4 = this;
            com.fyber.inneractive.sdk.renderers.h r0 = r4.a
            java.lang.Runnable r1 = r0.u
            if (r1 == 0) goto L2b
            r1 = 1
            com.fyber.inneractive.sdk.renderers.h.a(r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r2 = 0
            com.fyber.inneractive.sdk.renderers.h r3 = r4.a
            r3.getClass()
            java.lang.String r3 = com.fyber.inneractive.sdk.util.IAlog.a(r3)
            r0[r2] = r3
            java.lang.String r2 = "%sIdle state reached!"
            com.fyber.inneractive.sdk.util.IAlog.a(r2, r0)
            com.fyber.inneractive.sdk.renderers.h r0 = r4.a
            com.fyber.inneractive.sdk.player.controller.r r0 = r0.n
            if (r0 == 0) goto L26
            r0.b(r1)
        L26:
            com.fyber.inneractive.sdk.renderers.h r0 = r4.a
            r1 = 0
            r0.u = r1
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.i.run():void");
    }
}
