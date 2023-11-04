package cz.msebera.android.httpclient.conn.routing;

import cz.msebera.android.httpclient.HttpHost;
import java.net.InetAddress;

/* loaded from: classes2.dex */
public interface RouteInfo {

    /* loaded from: classes2.dex */
    public enum LayerType {
        PLAIN,
        LAYERED
    }

    /* loaded from: classes2.dex */
    public enum TunnelType {
        PLAIN,
        TUNNELLED
    }

    int getHopCount();

    HttpHost getHopTarget(int i);

    LayerType getLayerType();

    InetAddress getLocalAddress();

    HttpHost getProxyHost();

    HttpHost getTargetHost();

    TunnelType getTunnelType();

    boolean isLayered();

    boolean isSecure();

    boolean isTunnelled();
}
