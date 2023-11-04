package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzalp extends zzalc {
    public zzalp() {
    }

    public zzalp(zzalo zzaloVar, SSLSocketFactory sSLSocketFactory) {
    }

    public static List zza(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : (List) entry.getValue()) {
                    arrayList.add(new zzakg((String) entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }
}
