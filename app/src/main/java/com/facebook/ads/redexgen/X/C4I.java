package com.facebook.ads.redexgen.X;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4I */
/* loaded from: assets/audience_network.dex */
public final class C4I {
    public static String[] A01 = {"1CU3iw4Trc3qggngkxP7P26jEGLrLZaR", "qcH7HKgKdAybLTWn0rmK7JyCE0S9C8rn", "oNJ0dA1Zpt4CixMfeWT18n5RxX88Y0E3", "FZ8N3xW3PfzdZjJWrErZ2QIuE13XuJtD", "DvPOKoiXqOiYMgjx6IqCziqOSBLzEcJY", "MpMZeZ7xc490HXAXJonG5r1KTyiIoUHH", "NGMd8PbmdSzgSLgNcWdVjgLa", "jY1Ixh6DMe9BpV8yAbg842YJP45AQ2Eb"};
    public final C4H A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private int A00(List<C01713u> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).A00 != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A05(List<C01713u> list) {
        while (true) {
            int A00 = A00(list);
            if (A00 == -1) {
                return;
            }
            A01(list, A00, A00 + 1);
        }
    }

    public C4I(C4H c4h) {
        this.A00 = c4h;
    }

    private void A01(List<C01713u> list, int i, int i2) {
        C01713u c01713u = list.get(i);
        C01713u nextOp = list.get(i2);
        int i3 = nextOp.A00;
        if (i3 != 1) {
            if (i3 == 2) {
                A03(list, i, c01713u, i2, nextOp);
                return;
            } else if (i3 == 4) {
                A04(list, i, c01713u, i2, nextOp);
                return;
            } else {
                return;
            }
        }
        String[] strArr = A01;
        if (strArr[1].charAt(7) == strArr[5].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "aUQhN9RPINWHdtDS2haQB24BMlUHbr4B";
        strArr2[7] = "XOFwSchhjWWz78nEYYkf12AsjhBhdKRi";
        A02(list, i, c01713u, i2, nextOp);
    }

    private void A02(List<C01713u> list, int i, C01713u c01713u, int i2, C01713u c01713u2) {
        int i3 = 0;
        int i4 = c01713u.A01;
        int offset = c01713u2.A02;
        if (i4 < offset) {
            i3 = 0 - 1;
        }
        int i5 = c01713u.A02;
        int offset2 = c01713u2.A02;
        if (i5 < offset2) {
            i3++;
        }
        int i6 = c01713u2.A02;
        int offset3 = c01713u.A02;
        if (i6 <= offset3) {
            int i7 = c01713u.A02;
            int offset4 = c01713u2.A01;
            c01713u.A02 = i7 + offset4;
        }
        int i8 = c01713u2.A02;
        int offset5 = c01713u.A01;
        if (i8 <= offset5) {
            int i9 = c01713u.A01;
            int offset6 = c01713u2.A01;
            c01713u.A01 = i9 + offset6;
        }
        int offset7 = c01713u2.A02;
        c01713u2.A02 = offset7 + i3;
        list.set(i, c01713u2);
        list.set(i2, c01713u);
    }

    private final void A03(List<C01713u> list, int i, C01713u c01713u, int i2, C01713u c01713u2) {
        boolean z;
        C01713u c01713u3 = null;
        boolean z2 = false;
        if (c01713u.A02 < c01713u.A01) {
            z = false;
            if (c01713u2.A02 == c01713u.A02 && c01713u2.A01 == c01713u.A01 - c01713u.A02) {
                z2 = true;
            }
        } else {
            z = true;
            if (c01713u2.A02 == c01713u.A01 + 1) {
                int remaining = c01713u2.A01;
                if (remaining == c01713u.A02 - c01713u.A01) {
                    z2 = true;
                }
            }
        }
        if (c01713u.A01 < c01713u2.A02) {
            c01713u2.A02--;
        } else {
            int remaining2 = c01713u.A01;
            if (remaining2 < c01713u2.A02 + c01713u2.A01) {
                c01713u2.A01--;
                c01713u.A00 = 2;
                c01713u.A01 = 1;
                int remaining3 = c01713u2.A01;
                if (A01[6].length() == 11) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[2] = "8AUTweiK2qHuqKAjuAP9RAHRjtqC9cI5";
                strArr[3] = "fxjAamJyQJjVOLb9u9QxKoC9co41mLuZ";
                if (remaining3 == 0) {
                    list.remove(i2);
                    this.A00.ADz(c01713u2);
                    return;
                }
                return;
            }
        }
        if (c01713u.A02 <= c01713u2.A02) {
            c01713u2.A02++;
        } else if (c01713u.A02 < c01713u2.A02 + c01713u2.A01) {
            int remaining4 = (c01713u2.A02 + c01713u2.A01) - c01713u.A02;
            c01713u3 = this.A00.A9z(2, c01713u.A02 + 1, remaining4, null);
            c01713u2.A01 = c01713u.A02 - c01713u2.A02;
        }
        if (z2) {
            list.set(i, c01713u2);
            list.remove(i2);
            this.A00.ADz(c01713u);
            return;
        }
        if (z) {
            if (c01713u3 != null) {
                if (c01713u.A02 > c01713u3.A02) {
                    c01713u.A02 -= c01713u3.A01;
                }
                if (c01713u.A01 > c01713u3.A02) {
                    c01713u.A01 -= c01713u3.A01;
                }
            }
            if (c01713u.A02 > c01713u2.A02) {
                c01713u.A02 -= c01713u2.A01;
            }
            if (c01713u.A01 > c01713u2.A02) {
                c01713u.A01 -= c01713u2.A01;
            }
        } else {
            if (c01713u3 != null) {
                if (c01713u.A02 >= c01713u3.A02) {
                    c01713u.A02 -= c01713u3.A01;
                }
                if (c01713u.A01 >= c01713u3.A02) {
                    c01713u.A01 -= c01713u3.A01;
                }
            }
            if (c01713u.A02 >= c01713u2.A02) {
                c01713u.A02 -= c01713u2.A01;
            }
            if (c01713u.A01 >= c01713u2.A02) {
                c01713u.A01 -= c01713u2.A01;
            }
        }
        list.set(i, c01713u2);
        String[] strArr2 = A01;
        if (strArr2[1].charAt(7) == strArr2[5].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A01;
        strArr3[1] = "R1vl9Esi4EQuoIO0IEs3BYKA9Bp2yfIo";
        strArr3[5] = "ll7MLLjNdpT1F8Cd0W3dCYnGe1w6KT9M";
        if (c01713u.A02 != c01713u.A01) {
            list.set(i2, c01713u);
        } else {
            list.remove(i2);
        }
        if (c01713u3 != null) {
            list.add(i, c01713u3);
        }
    }

    private final void A04(List<C01713u> list, int i, C01713u c01713u, int i2, C01713u c01713u2) {
        C01713u c01713u3 = null;
        C01713u c01713u4 = null;
        if (c01713u.A01 < c01713u2.A02) {
            c01713u2.A02--;
        } else {
            int remaining = c01713u.A01;
            if (remaining < c01713u2.A02 + c01713u2.A01) {
                c01713u2.A01--;
                c01713u3 = this.A00.A9z(4, c01713u.A02, 1, c01713u2.A03);
            }
        }
        if (c01713u.A02 <= c01713u2.A02) {
            c01713u2.A02++;
        } else if (c01713u.A02 < c01713u2.A02 + c01713u2.A01) {
            int i3 = (c01713u2.A02 + c01713u2.A01) - c01713u.A02;
            c01713u4 = this.A00.A9z(4, c01713u.A02 + 1, i3, c01713u2.A03);
            c01713u2.A01 -= i3;
        }
        list.set(i2, c01713u);
        if (c01713u2.A01 > 0) {
            list.set(i, c01713u2);
        } else {
            list.remove(i);
            this.A00.ADz(c01713u2);
        }
        if (c01713u3 != null) {
            list.add(i, c01713u3);
        }
        if (c01713u4 != null) {
            list.add(i, c01713u4);
        }
    }
}
