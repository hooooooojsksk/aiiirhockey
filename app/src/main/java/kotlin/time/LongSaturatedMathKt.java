package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.Duration;

/* compiled from: longSaturatedMath.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\n\u001a \u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"checkInfiniteSumDefined", "", "longNs", "duration", "Lkotlin/time/Duration;", "durationNs", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "saturatingAdd", "saturatingAdd-pTJri5U", "(JJ)J", "saturatingAddInHalves", "saturatingAddInHalves-pTJri5U", "saturatingDiff", "valueNs", "originNs", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class LongSaturatedMathKt {
    /* renamed from: saturatingAdd-pTJri5U */
    public static final long m1470saturatingAddpTJri5U(long j, long j2) {
        long m1362getInWholeNanosecondsimpl = Duration.m1362getInWholeNanosecondsimpl(j2);
        if (((j - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            return m1469checkInfiniteSumDefinedPjuGub4(j, j2, m1362getInWholeNanosecondsimpl);
        }
        if ((1 | (m1362getInWholeNanosecondsimpl - 1)) == LongCompanionObject.MAX_VALUE) {
            return m1471saturatingAddInHalvespTJri5U(j, j2);
        }
        long j3 = j + m1362getInWholeNanosecondsimpl;
        if (((j ^ j3) & (m1362getInWholeNanosecondsimpl ^ j3)) < 0) {
            if (j < 0) {
                return Long.MIN_VALUE;
            }
            return LongCompanionObject.MAX_VALUE;
        }
        return j3;
    }

    /* renamed from: checkInfiniteSumDefined-PjuGub4 */
    private static final long m1469checkInfiniteSumDefinedPjuGub4(long j, long j2, long j3) {
        if (!Duration.m1374isInfiniteimpl(j2) || (j ^ j3) >= 0) {
            return j;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    /* renamed from: saturatingAddInHalves-pTJri5U */
    private static final long m1471saturatingAddInHalvespTJri5U(long j, long j2) {
        long m1345divUwyO8pc = Duration.m1345divUwyO8pc(j2, 2);
        if (((Duration.m1362getInWholeNanosecondsimpl(m1345divUwyO8pc) - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            double d = j;
            double m1385toDoubleimpl = Duration.m1385toDoubleimpl(j2, DurationUnit.NANOSECONDS);
            Double.isNaN(d);
            return (long) (d + m1385toDoubleimpl);
        }
        return m1470saturatingAddpTJri5U(m1470saturatingAddpTJri5U(j, m1345divUwyO8pc), m1345divUwyO8pc);
    }

    public static final long saturatingDiff(long j, long j2) {
        if ((1 | (j2 - 1)) == LongCompanionObject.MAX_VALUE) {
            return Duration.m1394unaryMinusUwyO8pc(DurationKt.toDuration(j2, DurationUnit.DAYS));
        }
        long j3 = j - j2;
        if (((j3 ^ j) & ((j3 ^ j2) ^ (-1))) < 0) {
            long j4 = (long) DurationKt.NANOS_IN_MILLIS;
            long j5 = (j % j4) - (j2 % j4);
            Duration.Companion companion = Duration.Companion;
            long duration = DurationKt.toDuration((j / j4) - (j2 / j4), DurationUnit.MILLISECONDS);
            Duration.Companion companion2 = Duration.Companion;
            return Duration.m1378plusLRDsOJo(duration, DurationKt.toDuration(j5, DurationUnit.NANOSECONDS));
        }
        Duration.Companion companion3 = Duration.Companion;
        return DurationKt.toDuration(j3, DurationUnit.NANOSECONDS);
    }
}
