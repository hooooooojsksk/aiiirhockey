package com.facebook.ads.internal.checkerframework.checker.nullness.qual;

import com.facebook.ads.internal.checkerframework.framework.qual.DefaultFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultInUncheckedCodeFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import com.facebook.ads.internal.checkerframework.framework.qual.QualifierForLiterals;
import com.facebook.ads.internal.checkerframework.framework.qual.SubtypeOf;
import com.facebook.ads.internal.checkerframework.framework.qual.UpperBoundFor;
import com.facebook.ads.redexgen.X.AnonymousClass73;
import com.facebook.ads.redexgen.X.C7H;
import com.facebook.ads.redexgen.X.C7I;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SubtypeOf({MonotonicNonNull.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@UpperBoundFor(typeKinds = {C7H.A0I, C7H.A0C, C7H.A04, C7H.A06, C7H.A08, C7H.A0B, C7H.A0E, C7H.A0J, C7H.A05})
@Retention(RetentionPolicy.RUNTIME)
@QualifierForLiterals({AnonymousClass73.A0B})
@DefaultFor({C7I.A05})
@DefaultQualifierInHierarchy
@DefaultInUncheckedCodeFor({C7I.A0E, C7I.A0C})
@Documented
/* loaded from: assets/audience_network.dex */
public @interface NonNull {
}
