package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class EC extends YQ {
    public static TimeInterpolator A0B;
    public static String[] A0C = {"K3xavpXOVVnTPS8V8FmisIpuez1NdmFn", "QjoCrUVtXYT15qNhmppxWCsnlOvXMRWn", "HVYav4KnfeU3lAWSFDiSVAYelCZD7hW1", "SKhwmHHGUoQzTLK2kw5WKB1efbL3jYLm", "aZpNXGptJoOcjVlsPlgA0RFw1bcc4fI1", "y8DDj9eTKGlZyxtiH83YwnquX80t2qUq", "Eqht3urb", "PkOCx2w9GPXTa0iGANdHxOJetOGxrMw0"};
    public ArrayList<AbstractC01934r> A0A = new ArrayList<>();
    public ArrayList<AbstractC01934r> A07 = new ArrayList<>();
    public ArrayList<AnonymousClass47> A09 = new ArrayList<>();
    public ArrayList<AnonymousClass46> A08 = new ArrayList<>();
    public ArrayList<ArrayList<AbstractC01934r>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<AnonymousClass47>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<AnonymousClass46>> A03 = new ArrayList<>();
    public ArrayList<AbstractC01934r> A00 = new ArrayList<>();
    public ArrayList<AbstractC01934r> A04 = new ArrayList<>();
    public ArrayList<AbstractC01934r> A06 = new ArrayList<>();
    public ArrayList<AbstractC01934r> A02 = new ArrayList<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.C4V
    public final void A0I() {
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            AnonymousClass47 anonymousClass47 = this.A09.get(size);
            View view = anonymousClass47.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0O(anonymousClass47.A04);
            this.A09.remove(size);
        }
        for (int size2 = this.A0A.size() - 1; size2 >= 0; size2--) {
            A0P(this.A0A.get(size2));
            this.A0A.remove(size2);
        }
        for (int size3 = this.A07.size() - 1; size3 >= 0; size3--) {
            AbstractC01934r abstractC01934r = this.A07.get(size3);
            abstractC01934r.A0H.setAlpha(1.0f);
            A0N(abstractC01934r);
            this.A07.remove(size3);
        }
        for (int size4 = this.A08.size() - 1; size4 >= 0; size4--) {
            A01(this.A08.get(size4));
        }
        this.A08.clear();
        if (A0L()) {
            for (int size5 = this.A05.size() - 1; size5 >= 0; size5--) {
                ArrayList<AnonymousClass47> arrayList = this.A05.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    AnonymousClass47 anonymousClass472 = arrayList.get(size6);
                    View view2 = anonymousClass472.A04.A0H;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    A0O(anonymousClass472.A04);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.A05.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.A01.size() - 1; size7 >= 0; size7--) {
                ArrayList<AbstractC01934r> arrayList2 = this.A01.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    AbstractC01934r abstractC01934r2 = arrayList2.get(size8);
                    abstractC01934r2.A0H.setAlpha(1.0f);
                    A0N(abstractC01934r2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.A01.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.A03.size() - 1; size9 >= 0; size9--) {
                ArrayList<AnonymousClass46> arrayList3 = this.A03.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    A01(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.A03.remove(arrayList3);
                    }
                }
            }
            A05(this.A06);
            A05(this.A04);
            A05(this.A00);
            A05(this.A02);
            A0A();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.YQ
    public final boolean A0T(AbstractC01934r abstractC01934r, int i, int i2, int i3, int i4) {
        View view = abstractC01934r.A0H;
        int translationX = i + ((int) abstractC01934r.A0H.getTranslationX());
        int translationY = i2 + ((int) abstractC01934r.A0H.getTranslationY());
        A04(abstractC01934r);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            A0O(abstractC01934r);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.A09.add(new AnonymousClass47(abstractC01934r, translationX, translationY, i3, i4));
        return true;
    }

    private void A01(AnonymousClass46 anonymousClass46) {
        if (anonymousClass46.A05 != null) {
            A07(anonymousClass46, anonymousClass46.A05);
        }
        if (anonymousClass46.A04 != null) {
            A07(anonymousClass46, anonymousClass46.A04);
        }
    }

    private void A03(final AbstractC01934r abstractC01934r) {
        final View view = abstractC01934r.A0H;
        final ViewPropertyAnimator animate = view.animate();
        this.A06.add(abstractC01934r);
        ViewPropertyAnimator animation = animate.setDuration(A07());
        animation.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.41
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                view.setAlpha(1.0f);
                EC.this.A0P(abstractC01934r);
                EC.this.A06.remove(abstractC01934r);
                EC.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    private void A04(AbstractC01934r abstractC01934r) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        abstractC01934r.A0H.animate().setInterpolator(A0B);
        A0K(abstractC01934r);
    }

    private final void A05(List<AbstractC01934r> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A06(List<AnonymousClass46> list, AbstractC01934r abstractC01934r) {
        for (int size = list.size() - 1; size >= 0; size--) {
            AnonymousClass46 changeInfo = list.get(size);
            if (A07(changeInfo, abstractC01934r) && changeInfo.A05 == null && changeInfo.A04 == null) {
                list.remove(changeInfo);
            }
        }
    }

    private boolean A07(AnonymousClass46 anonymousClass46, AbstractC01934r abstractC01934r) {
        boolean z = false;
        if (anonymousClass46.A04 == abstractC01934r) {
            anonymousClass46.A04 = null;
        } else if (anonymousClass46.A05 == abstractC01934r) {
            anonymousClass46.A05 = null;
            z = true;
        } else {
            return false;
        }
        abstractC01934r.A0H.setAlpha(1.0f);
        abstractC01934r.A0H.setTranslationX(0.0f);
        abstractC01934r.A0H.setTranslationY(0.0f);
        A0Q(abstractC01934r, z);
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:57:0x0033 */
    @Override // com.facebook.ads.redexgen.X.C4V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0J() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.EC.A0J():void");
    }

    @Override // com.facebook.ads.redexgen.X.C4V
    public final void A0K(AbstractC01934r abstractC01934r) {
        View view = abstractC01934r.A0H;
        view.animate().cancel();
        for (int i = this.A09.size() - 1; i >= 0; i--) {
            if (this.A09.get(i).A04 == abstractC01934r) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A0O(abstractC01934r);
                this.A09.remove(i);
            }
        }
        A06(this.A08, abstractC01934r);
        if (this.A0A.remove(abstractC01934r)) {
            view.setAlpha(1.0f);
            A0P(abstractC01934r);
        }
        if (this.A07.remove(abstractC01934r)) {
            view.setAlpha(1.0f);
            A0N(abstractC01934r);
        }
        for (int i2 = this.A03.size() - 1; i2 >= 0; i2--) {
            ArrayList<AnonymousClass46> arrayList = this.A03.get(i2);
            A06(arrayList, abstractC01934r);
            if (arrayList.isEmpty()) {
                this.A03.remove(i2);
            }
        }
        for (int j = this.A05.size() - 1; j >= 0; j--) {
            ArrayList<AnonymousClass47> arrayList2 = this.A05.get(j);
            int size = arrayList2.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                } else if (arrayList2.get(size).A04 == abstractC01934r) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    String[] strArr = A0C;
                    String str = strArr[4];
                    String str2 = strArr[3];
                    int i3 = str.charAt(9);
                    if (i3 != str2.charAt(9)) {
                        throw new RuntimeException();
                    }
                    A0C[1] = "ZnQkkSK02m4qlFQsfXGc8k1uWyp7aRL1";
                    A0O(abstractC01934r);
                    arrayList2.remove(size);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(j);
                    }
                } else {
                    size--;
                }
            }
        }
        int size2 = this.A01.size();
        if (A0C[0].charAt(3) == 'S') {
            throw new RuntimeException();
        }
        A0C[7] = "NHib0yCpDtVNZGbvtAXjIsv6RzrfBwwf";
        for (int i4 = size2 - 1; i4 >= 0; i4--) {
            ArrayList<AbstractC01934r> arrayList3 = this.A01.get(i4);
            if (arrayList3.remove(abstractC01934r)) {
                view.setAlpha(1.0f);
                A0N(abstractC01934r);
                if (arrayList3.isEmpty()) {
                    this.A01.remove(i4);
                }
            }
        }
        this.A06.remove(abstractC01934r);
        this.A00.remove(abstractC01934r);
        this.A02.remove(abstractC01934r);
        this.A04.remove(abstractC01934r);
        A0V();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0071, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0079, code lost:
        if (r4.A02.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0081, code lost:
        if (r4.A05.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0089, code lost:
        if (r4.A01.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008b, code lost:
        r3 = r4.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x009a, code lost:
        if (com.facebook.ads.redexgen.X.EC.A0C[7].charAt(30) == 'w') goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00a1, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ab, code lost:
        com.facebook.ads.redexgen.X.EC.A0C[7] = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00b6, code lost:
        if (r3.isEmpty() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ba, code lost:
        return false;
     */
    @Override // com.facebook.ads.redexgen.X.C4V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0L() {
        /*
            r4 = this;
            java.util.ArrayList<com.facebook.ads.redexgen.X.4r> r0 = r4.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.46> r0 = r4.A08
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.47> r0 = r4.A09
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4r> r0 = r4.A0A
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4r> r0 = r4.A04
            boolean r3 = r0.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.EC.A0C
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La5
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.EC.A0C
            java.lang.String r1 = "HATKbuX1ioRbKjbJza4uRkbMkwnilInw"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "55W5G9gSwoJRpeM2nuMk9rdzPBhIsXI5"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4r> r0 = r4.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4r> r0 = r4.A00
            boolean r3 = r0.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.EC.A0C
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La2
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.EC.A0C
            java.lang.String r1 = "PBqWGImhwZdo7IXQpaNFK9QlBHxMp4wk"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto Lb8
        L73:
            java.util.ArrayList<com.facebook.ads.redexgen.X.4r> r0 = r4.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.47>> r0 = r4.A05
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.4r>> r0 = r4.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.46>> r3 = r4.A03
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.EC.A0C
            r0 = 7
            r1 = r1[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            r0 = 119(0x77, float:1.67E-43)
            if (r1 == r0) goto Lab
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        La2:
            if (r3 == 0) goto Lb8
            goto L73
        La5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Lab:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.EC.A0C
            java.lang.String r1 = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK"
            r0 = 7
            r2[r0] = r1
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lba
        Lb8:
            r0 = 1
        Lb9:
            return r0
        Lba:
            r0 = 0
            goto Lb9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.EC.A0L():boolean");
    }

    @Override // com.facebook.ads.redexgen.X.C4V
    public final boolean A0M(@NonNull AbstractC01934r abstractC01934r, @NonNull List<Object> payloads) {
        return !payloads.isEmpty() || super.A0M(abstractC01934r, payloads);
    }

    @Override // com.facebook.ads.redexgen.X.YQ
    public final boolean A0R(AbstractC01934r abstractC01934r) {
        A04(abstractC01934r);
        abstractC01934r.A0H.setAlpha(0.0f);
        this.A07.add(abstractC01934r);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.YQ
    public final boolean A0S(AbstractC01934r abstractC01934r) {
        A04(abstractC01934r);
        this.A0A.add(abstractC01934r);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.YQ
    public final boolean A0U(AbstractC01934r abstractC01934r, AbstractC01934r abstractC01934r2, int i, int i2, int i3, int i4) {
        if (abstractC01934r == abstractC01934r2) {
            return A0T(abstractC01934r, i, i2, i3, i4);
        }
        float translationX = abstractC01934r.A0H.getTranslationX();
        float translationY = abstractC01934r.A0H.getTranslationY();
        float prevTranslationY = abstractC01934r.A0H.getAlpha();
        A04(abstractC01934r);
        float prevTranslationX = i3 - i;
        int deltaY = (int) (prevTranslationX - translationX);
        float prevTranslationX2 = i4 - i2;
        int deltaX = (int) (prevTranslationX2 - translationY);
        abstractC01934r.A0H.setTranslationX(translationX);
        abstractC01934r.A0H.setTranslationY(translationY);
        abstractC01934r.A0H.setAlpha(prevTranslationY);
        if (abstractC01934r2 != null) {
            A04(abstractC01934r2);
            float prevTranslationX3 = -deltaY;
            abstractC01934r2.A0H.setTranslationX(prevTranslationX3);
            float prevTranslationX4 = -deltaX;
            abstractC01934r2.A0H.setTranslationY(prevTranslationX4);
            abstractC01934r2.A0H.setAlpha(0.0f);
        }
        this.A08.add(new AnonymousClass46(abstractC01934r, abstractC01934r2, i, i2, i3, i4));
        return true;
    }

    public final void A0V() {
        if (!A0L()) {
            A0A();
        }
    }

    public final void A0W(final AnonymousClass46 anonymousClass46) {
        final View view;
        AbstractC01934r holder = anonymousClass46.A05;
        if (holder == null) {
            view = null;
        } else {
            view = holder.A0H;
        }
        AbstractC01934r holder2 = anonymousClass46.A04;
        final View view2 = holder2 != null ? holder2.A0H : null;
        if (view != null) {
            final ViewPropertyAnimator oldViewAnim = view.animate().setDuration(A05());
            this.A02.add(anonymousClass46.A05);
            oldViewAnim.translationX(anonymousClass46.A02 - anonymousClass46.A00);
            oldViewAnim.translationY(anonymousClass46.A03 - anonymousClass46.A01);
            oldViewAnim.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.44
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    oldViewAnim.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    EC.this.A0Q(anonymousClass46.A05, true);
                    EC.this.A02.remove(anonymousClass46.A05);
                    EC.this.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.A02.add(anonymousClass46.A04);
            animate.translationX(0.0f).translationY(0.0f).setDuration(A05()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.45
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    EC.this.A0Q(anonymousClass46.A04, false);
                    EC.this.A02.remove(anonymousClass46.A04);
                    EC.this.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
    }

    public final void A0X(final AbstractC01934r abstractC01934r) {
        final View view = abstractC01934r.A0H;
        final ViewPropertyAnimator animate = view.animate();
        this.A00.add(abstractC01934r);
        ViewPropertyAnimator animation = animate.alpha(1.0f).setDuration(A04());
        animation.setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.42
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                EC.this.A0N(abstractC01934r);
                EC.this.A00.remove(abstractC01934r);
                EC.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    public final void A0Y(final AbstractC01934r abstractC01934r, int i, int i2, int i3, int i4) {
        final View view = abstractC01934r.A0H;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.A04.add(abstractC01934r);
        animate.setDuration(A06()).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.43
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i6 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                EC.this.A0O(abstractC01934r);
                EC.this.A04.remove(abstractC01934r);
                EC.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }
}
