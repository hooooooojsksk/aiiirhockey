package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: TimeSources.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\b\u0010\r\u001a\u00020\u0004H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "()V", "reading", "", "overflow", "", "duration", "Lkotlin/time/Duration;", "overflow-LRDsOJo", "(J)V", "plusAssign", "plusAssign-LRDsOJo", "read", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
    }

    @Override // kotlin.time.AbstractLongTimeSource
    protected long read() {
        return this.reading;
    }

    /* renamed from: plusAssign-LRDsOJo */
    public final void m1476plusAssignLRDsOJo(long j) {
        long j2;
        long m1388toLongimpl = Duration.m1388toLongimpl(j, getUnit());
        if (m1388toLongimpl != Long.MIN_VALUE && m1388toLongimpl != LongCompanionObject.MAX_VALUE) {
            long j3 = this.reading;
            j2 = j3 + m1388toLongimpl;
            if ((m1388toLongimpl ^ j3) >= 0 && (j3 ^ j2) < 0) {
                m1475overflowLRDsOJo(j);
            }
        } else {
            double m1385toDoubleimpl = Duration.m1385toDoubleimpl(j, getUnit());
            double d = this.reading;
            Double.isNaN(d);
            double d2 = d + m1385toDoubleimpl;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                m1475overflowLRDsOJo(j);
            }
            j2 = (long) d2;
        }
        this.reading = j2;
    }

    /* renamed from: overflow-LRDsOJo */
    private final void m1475overflowLRDsOJo(long j) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + "ns is advanced by " + ((Object) Duration.m1391toStringimpl(j)) + '.');
    }
}
