package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.b0;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.global.features.r;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k0;

/* loaded from: classes.dex */
public class e extends k<u> {
    public boolean C;
    public boolean D;
    public boolean E;

    public e(com.fyber.inneractive.sdk.player.b bVar, com.fyber.inneractive.sdk.player.ui.l lVar, b0 b0Var, com.fyber.inneractive.sdk.config.global.s sVar, boolean z, boolean z2, Skip skip, boolean z3, String str, boolean z4) {
        super(bVar, lVar, b0Var, sVar, z2, skip, str, z4);
        this.D = false;
        this.C = z;
        this.E = z3;
    }

    public static boolean d(int i) {
        return i > -1 && i <= 8;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void A() {
        super.A();
        this.d.b(false);
        if (this.C) {
            this.d.i();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public boolean B() {
        return !this.C;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void D() {
        g gVar;
        super.D();
        com.fyber.inneractive.sdk.player.b bVar = this.a;
        if (bVar == null || (gVar = bVar.b) == null || !gVar.e.equals(com.fyber.inneractive.sdk.player.enums.b.Completed) || !this.C) {
            return;
        }
        this.d.i();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k, com.fyber.inneractive.sdk.player.ui.i
    public void a(boolean z) {
        com.fyber.inneractive.sdk.player.b bVar;
        g gVar;
        if (z && (bVar = this.a) != null && (gVar = bVar.b) != null && !gVar.e.equals(com.fyber.inneractive.sdk.player.enums.b.Completed) && !this.d.f()) {
            i(false);
        }
        super.a(z);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k, com.fyber.inneractive.sdk.player.ui.i
    public void b() {
        if (this.h) {
            v();
        } else {
            k();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k, com.fyber.inneractive.sdk.player.controller.b
    public void d(boolean z) {
        g gVar;
        com.fyber.inneractive.sdk.player.enums.b bVar;
        super.d(z);
        if (this.C) {
            this.d.i();
            this.d.d(false);
            this.f = 0;
        }
        C();
        com.fyber.inneractive.sdk.player.b bVar2 = this.a;
        this.d.b((bVar2 == null || (gVar = bVar2.b) == null || ((bVar = gVar.e) != com.fyber.inneractive.sdk.player.enums.b.Preparing && bVar != com.fyber.inneractive.sdk.player.enums.b.Prepared)) ? false : true);
        this.d.c(false);
        com.fyber.inneractive.sdk.player.ui.l lVar = this.d;
        com.fyber.inneractive.sdk.player.ui.c cVar = new com.fyber.inneractive.sdk.player.ui.c();
        cVar.b = false;
        lVar.d(new com.fyber.inneractive.sdk.player.ui.b(cVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0043  */
    @Override // com.fyber.inneractive.sdk.player.controller.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k() {
        /*
            r7 = this;
            super.k()
            com.fyber.inneractive.sdk.player.b r0 = r7.a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L76
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.b
            if (r0 == 0) goto L76
            boolean r0 = r7.D
            if (r0 == 0) goto L12
            goto L76
        L12:
            r0 = 2
            com.fyber.inneractive.sdk.player.ui.l r3 = r7.d     // Catch: java.lang.Throwable -> L2a
            android.content.Context r3 = r3.getContext()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = "audio"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch: java.lang.Throwable -> L2a
            android.media.AudioManager r3 = (android.media.AudioManager) r3     // Catch: java.lang.Throwable -> L2a
            int r4 = r3.getRingerMode()     // Catch: java.lang.Throwable -> L2a
            int r3 = r3.getStreamVolume(r0)     // Catch: java.lang.Throwable -> L2b
            goto L2c
        L2a:
            r4 = 0
        L2b:
            r3 = 0
        L2c:
            boolean r5 = r7.C
            if (r5 != 0) goto L40
            com.fyber.inneractive.sdk.config.b0 r5 = r7.b
            com.fyber.inneractive.sdk.config.a0 r5 = (com.fyber.inneractive.sdk.config.a0) r5
            com.fyber.inneractive.sdk.config.c0 r5 = r5.f
            java.lang.Boolean r5 = r5.d
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L40
            r5 = 1
            goto L41
        L40:
            r5 = 0
        L41:
            if (r5 != 0) goto L6e
            boolean r5 = r7.E
            if (r5 == 0) goto L55
            com.fyber.inneractive.sdk.config.b0 r5 = r7.b
            com.fyber.inneractive.sdk.config.a0 r5 = (com.fyber.inneractive.sdk.config.a0) r5
            com.fyber.inneractive.sdk.config.c0 r5 = r5.f
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r5 = r5.j
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r6 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r5 == r6) goto L55
            r5 = 1
            goto L56
        L55:
            r5 = 0
        L56:
            if (r5 == 0) goto L59
            goto L6e
        L59:
            if (r3 <= 0) goto L71
            if (r4 != r0) goto L71
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r3 = com.fyber.inneractive.sdk.util.IAlog.a(r7)
            r0[r2] = r3
            java.lang.String r3 = "%s setting default volume. unmuting player"
            com.fyber.inneractive.sdk.util.IAlog.a(r3, r0)
            r7.j(r2)
            goto L71
        L6e:
            r7.g(r2)
        L71:
            r7.E()
            r7.D = r1
        L76:
            r7.i(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.e.k():boolean");
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public int o() {
        return IAConfigManager.M.u.b.a("VideoFullscreenBufferingTimeout", 12, 1) * 1000;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0076  */
    @Override // com.fyber.inneractive.sdk.player.controller.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int s() {
        /*
            r8 = this;
            com.fyber.inneractive.sdk.config.global.features.c r0 = r8.p()
            r1 = -1
            if (r0 == 0) goto Lc
            int r0 = r0.c()
            goto Ld
        Lc:
            r0 = -1
        Ld:
            com.fyber.inneractive.sdk.config.IAConfigManager r2 = com.fyber.inneractive.sdk.config.IAConfigManager.M
            com.fyber.inneractive.sdk.config.j r2 = r2.u
            com.fyber.inneractive.sdk.config.i r2 = r2.b
            com.fyber.inneractive.sdk.config.b0 r3 = r8.b
            com.fyber.inneractive.sdk.config.enums.Skip r4 = r8.A
            boolean r5 = com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()
            java.lang.String r6 = "vast_configuration"
            com.fyber.inneractive.sdk.config.g r2 = r2.a(r6)
            java.lang.String r6 = "skip_d"
            r2.getClass()
            java.util.Map<java.lang.String, java.lang.String> r7 = r2.a     // Catch: java.lang.Exception -> L3b
            boolean r7 = r7.containsKey(r6)     // Catch: java.lang.Exception -> L3b
            if (r7 == 0) goto L3b
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.a     // Catch: java.lang.Exception -> L3b
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.Exception -> L3b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L3b
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L3b
            goto L3c
        L3b:
            r2 = -1
        L3c:
            int r2 = java.lang.Math.max(r2, r1)
            if (r4 != 0) goto L4c
            if (r3 == 0) goto L4c
            com.fyber.inneractive.sdk.config.a0 r3 = (com.fyber.inneractive.sdk.config.a0) r3
            com.fyber.inneractive.sdk.config.c0 r3 = r3.f
            if (r3 == 0) goto L4c
            com.fyber.inneractive.sdk.config.enums.Skip r4 = r3.h
        L4c:
            r3 = 5
            if (r5 == 0) goto L76
            boolean r1 = d(r0)
            if (r1 == 0) goto L56
            goto L8c
        L56:
            boolean r0 = d(r2)
            if (r0 == 0) goto L5d
            goto L7a
        L5d:
            java.lang.Integer r0 = r4.value()
            int r0 = r0.intValue()
            boolean r0 = d(r0)
            if (r0 == 0) goto L74
            java.lang.Integer r0 = r4.value()
            int r0 = r0.intValue()
            goto L8c
        L74:
            r0 = 5
            goto L8c
        L76:
            if (r2 <= r1) goto L7c
            if (r2 > r3) goto L7c
        L7a:
            r0 = r2
            goto L8c
        L7c:
            com.fyber.inneractive.sdk.config.enums.Skip r0 = com.fyber.inneractive.sdk.config.enums.Skip.DEFAULT
            if (r4 != r0) goto L84
            r0 = 99999(0x1869f, float:1.40128E-40)
            goto L8c
        L84:
            java.lang.Integer r0 = r4.value()
            int r0 = r0.intValue()
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.e.s():int");
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void u() {
        this.u = true;
        IAlog.a("%s onBufferingTimeout reached. Skipping to end card", IAlog.a(this));
        c(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void w() {
        ListenerT listenert = this.g;
        if (listenert != 0) {
            listenert.k();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void y() {
        this.d.d(true);
        C();
        n();
        k();
        i(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void a(k0 k0Var) {
        r.b bVar;
        TapAction tapAction = ((a0) this.b).f.i;
        if (tapAction == TapAction.CTR) {
            a(false, VideoClickOrigin.VIDEO, k0Var);
            return;
        }
        boolean z = true;
        if (tapAction != TapAction.FULLSCREEN && tapAction != TapAction.DO_NOTHING) {
            IAlog.a("% sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.a(this), tapAction);
            return;
        }
        com.fyber.inneractive.sdk.config.global.features.r rVar = (com.fyber.inneractive.sdk.config.global.features.r) this.c.a(com.fyber.inneractive.sdk.config.global.features.r.class);
        rVar.getClass();
        String a = rVar.a("click_action", com.fyber.inneractive.sdk.config.global.features.r.e.mKey);
        r.b[] values = r.b.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                bVar = values[i];
                if (a.equalsIgnoreCase(bVar.mKey)) {
                    break;
                }
                i++;
            } else {
                bVar = r.b.NONE;
                break;
            }
        }
        if (!bVar.equals(r.b.OPEN)) {
            if (!((this.w == com.fyber.inneractive.sdk.ignite.k.NONE || !IAConfigManager.M.E.d()) ? false : false)) {
                return;
            }
        }
        a(false, VideoClickOrigin.VIDEO, k0Var);
    }
}
