package com.fyber.inneractive.sdk.bidder;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.f0;
import com.fyber.inneractive.sdk.util.j;

/* loaded from: classes.dex */
public class b extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ a a;

    public b(a aVar) {
        this.a = aVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        f0 f0Var = f0.UNKNOWN;
        if (networkCapabilities.hasTransport(3)) {
            f0Var = f0.ETHERNET;
        } else if (networkCapabilities.hasTransport(0)) {
            f0Var = j.i() == 13 ? f0.MOBILE_4G : f0.MOBILE_3G;
        } else if (networkCapabilities.hasTransport(1)) {
            f0Var = f0.WIFI;
        }
        if (TextUtils.equals(this.a.c.q, f0Var.key)) {
            return;
        }
        a aVar = this.a;
        aVar.c.q = f0Var.key;
        aVar.b();
    }
}
