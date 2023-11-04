package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.f;
import com.fyber.inneractive.sdk.network.o;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class InneractiveInfrastructureError extends InneractiveError {
    public final InneractiveErrorCode a;
    public final f b;
    public Throwable c;
    public Exception d;
    public final List<o> e;

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, f fVar) {
        this(inneractiveErrorCode, fVar, null);
    }

    public void addReportedError(o oVar) {
        this.e.add(oVar);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        if (this.c != null) {
            sb.append(" : ");
            sb.append(this.c);
        }
        return sb.toString();
    }

    public Throwable getCause() {
        Exception exc = this.d;
        return exc == null ? this.c : exc;
    }

    public InneractiveErrorCode getErrorCode() {
        return this.a;
    }

    public f getFyberMarketplaceAdLoadFailureReason() {
        return this.b;
    }

    public boolean isErrorAlreadyReported(o oVar) {
        return this.e.contains(oVar);
    }

    public void setCause(Exception exc) {
        this.d = exc;
    }

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, f fVar, Throwable th) {
        this.e = new ArrayList();
        this.a = inneractiveErrorCode;
        this.b = fVar;
        this.c = th;
    }
}
