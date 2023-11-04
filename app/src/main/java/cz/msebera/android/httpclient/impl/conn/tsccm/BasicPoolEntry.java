package cz.msebera.android.httpclient.impl.conn.tsccm;

import cz.msebera.android.httpclient.conn.ClientConnectionOperator;
import cz.msebera.android.httpclient.conn.OperatedClientConnection;
import cz.msebera.android.httpclient.conn.routing.HttpRoute;
import cz.msebera.android.httpclient.impl.conn.AbstractPoolEntry;
import cz.msebera.android.httpclient.util.Args;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;

@Deprecated
/* loaded from: classes2.dex */
public class BasicPoolEntry extends AbstractPoolEntry {
    private final long created;
    private long expiry;
    private long updated;
    private final long validUntil;

    protected final BasicPoolEntryRef getWeakRef() {
        return null;
    }

    public BasicPoolEntry(ClientConnectionOperator clientConnectionOperator, HttpRoute httpRoute, ReferenceQueue<Object> referenceQueue) {
        super(clientConnectionOperator, httpRoute);
        Args.notNull(httpRoute, "HTTP route");
        this.created = System.currentTimeMillis();
        this.validUntil = LongCompanionObject.MAX_VALUE;
        this.expiry = LongCompanionObject.MAX_VALUE;
    }

    public BasicPoolEntry(ClientConnectionOperator clientConnectionOperator, HttpRoute httpRoute) {
        this(clientConnectionOperator, httpRoute, -1L, TimeUnit.MILLISECONDS);
    }

    public BasicPoolEntry(ClientConnectionOperator clientConnectionOperator, HttpRoute httpRoute, long j, TimeUnit timeUnit) {
        super(clientConnectionOperator, httpRoute);
        Args.notNull(httpRoute, "HTTP route");
        long currentTimeMillis = System.currentTimeMillis();
        this.created = currentTimeMillis;
        if (j > 0) {
            this.validUntil = currentTimeMillis + timeUnit.toMillis(j);
        } else {
            this.validUntil = LongCompanionObject.MAX_VALUE;
        }
        this.expiry = this.validUntil;
    }

    public final OperatedClientConnection getConnection() {
        return this.connection;
    }

    public final HttpRoute getPlannedRoute() {
        return this.route;
    }

    @Override // cz.msebera.android.httpclient.impl.conn.AbstractPoolEntry
    public void shutdownEntry() {
        super.shutdownEntry();
    }

    public long getCreated() {
        return this.created;
    }

    public long getUpdated() {
        return this.updated;
    }

    public long getExpiry() {
        return this.expiry;
    }

    public long getValidUntil() {
        return this.validUntil;
    }

    public void updateExpiry(long j, TimeUnit timeUnit) {
        long currentTimeMillis = System.currentTimeMillis();
        this.updated = currentTimeMillis;
        this.expiry = Math.min(this.validUntil, j > 0 ? currentTimeMillis + timeUnit.toMillis(j) : LongCompanionObject.MAX_VALUE);
    }

    public boolean isExpired(long j) {
        return j >= this.expiry;
    }
}
