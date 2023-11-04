package com.fyber.inneractive.sdk.bidder;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.l;

/* loaded from: classes.dex */
public class e extends BroadcastReceiver {
    public final d a;

    public e(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        char c;
        if (intent == null || intent.getAction() == null) {
            return;
        }
        String action = intent.getAction();
        action.getClass();
        action.hashCode();
        boolean z = false;
        switch (action.hashCode()) {
            case -1538406691:
                if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1530327060:
                if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1076576821:
                if (action.equals("android.intent.action.AIRPLANE_MODE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1123270207:
                if (action.equals("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1779291251:
                if (action.equals("android.os.action.POWER_SAVE_MODE_CHANGED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2070024785:
                if (action.equals("android.media.RINGER_MODE_CHANGED")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2106958107:
                if (action.equals("android.app.action.INTERRUPTION_FILTER_CHANGED")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                a aVar = (a) this.a;
                aVar.b.getClass();
                int intExtra = intent.getIntExtra("plugged", -1);
                z = (intExtra == 1 || intExtra == 2 || intExtra == 4) ? true : true;
                Boolean bool = aVar.c.B;
                if (bool == null || bool.booleanValue() != z) {
                    aVar.c.B = Boolean.valueOf(z);
                    aVar.b();
                }
                if (TextUtils.equals(aVar.c.C, aVar.b.a(intent))) {
                    return;
                }
                aVar.c.C = aVar.b.a(intent);
                aVar.b();
                return;
            case 1:
            case 3:
                a aVar2 = (a) this.a;
                aVar2.getClass();
                Boolean bool2 = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", Integer.MIN_VALUE) == 2 ? Boolean.TRUE : null;
                c cVar = aVar2.c;
                if (cVar.t != bool2) {
                    cVar.t = bool2;
                    aVar2.b();
                    return;
                }
                return;
            case 2:
                a aVar3 = (a) this.a;
                aVar3.c.w = Boolean.valueOf(intent.getBooleanExtra("state", false));
                aVar3.b();
                return;
            case 4:
                a aVar4 = (a) this.a;
                aVar4.c.u = com.fyber.inneractive.sdk.serverapi.a.l();
                aVar4.b();
                return;
            case 5:
                a aVar5 = (a) this.a;
                aVar5.getClass();
                int intExtra2 = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", -1);
                z = (intExtra2 == 0 || intExtra2 == 1) ? true : true;
                Boolean bool3 = aVar5.c.y;
                if (bool3 == null || bool3.booleanValue() != z) {
                    aVar5.c.y = Boolean.valueOf(z);
                    aVar5.b();
                    return;
                }
                return;
            case 6:
                a aVar6 = (a) this.a;
                aVar6.getClass();
                int currentInterruptionFilter = ((NotificationManager) l.a.getSystemService("notification")).getCurrentInterruptionFilter();
                if (currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4) {
                    z = true;
                }
                Boolean bool4 = aVar6.c.x;
                if (bool4 == null || bool4.booleanValue() != z) {
                    aVar6.c.x = Boolean.valueOf(z);
                    aVar6.b();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
