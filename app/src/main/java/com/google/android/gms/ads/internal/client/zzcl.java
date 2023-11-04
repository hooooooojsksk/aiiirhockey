package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbnf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public interface zzcl extends IInterface {
    zzbnf getAdapterCreator() throws RemoteException;

    zzen getLiteSdkVersion() throws RemoteException;
}
