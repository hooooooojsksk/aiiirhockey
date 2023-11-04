package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.r;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class InneractiveAdSpotManager {
    public Map<String, InneractiveAdSpot> a = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public static class a {
        public static InneractiveAdSpotManager a = new InneractiveAdSpotManager();
    }

    public static void destroy() {
        Map<String, InneractiveAdSpot> map = get().a;
        for (String str : map.keySet()) {
            InneractiveAdSpot inneractiveAdSpot = map.get(str);
            if (inneractiveAdSpot != null) {
                inneractiveAdSpot.destroy();
            }
        }
        map.clear();
    }

    public static InneractiveAdSpotManager get() {
        return a.a;
    }

    public void bindSpot(InneractiveAdSpot inneractiveAdSpot) {
        this.a.put(inneractiveAdSpot.getLocalUniqueId(), inneractiveAdSpot);
    }

    public InneractiveAdSpot createSpot() {
        r rVar = new r();
        this.a.put(rVar.a, rVar);
        return rVar;
    }

    public InneractiveAdSpot getSpot(String str) {
        return this.a.get(str);
    }

    public void removeSpot(InneractiveAdSpot inneractiveAdSpot) {
        Map<String, InneractiveAdSpot> map = this.a;
        if (map != null) {
            map.remove(inneractiveAdSpot.getLocalUniqueId());
        }
    }
}
