package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class t {
    public static Uri a(String str, String str2) {
        String a;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] a2 = a(str2);
        if (a2[0] != -1) {
            sb.append(str2);
            a(sb, a2[1], a2[2]);
            a = sb.toString();
        } else {
            int[] a3 = a(str);
            if (a2[3] == 0) {
                sb.append((CharSequence) str, 0, a3[3]);
                sb.append(str2);
                a = sb.toString();
            } else if (a2[2] == 0) {
                sb.append((CharSequence) str, 0, a3[2]);
                sb.append(str2);
                a = sb.toString();
            } else if (a2[1] != 0) {
                int i = a3[0] + 1;
                sb.append((CharSequence) str, 0, i);
                sb.append(str2);
                a = a(sb, a2[1] + i, i + a2[2]);
            } else if (str2.charAt(a2[1]) == '/') {
                sb.append((CharSequence) str, 0, a3[1]);
                sb.append(str2);
                a = a(sb, a3[1], a3[1] + a2[2]);
            } else if (a3[0] + 2 < a3[1] && a3[1] == a3[2]) {
                sb.append((CharSequence) str, 0, a3[1]);
                sb.append('/');
                sb.append(str2);
                a = a(sb, a3[1], a3[1] + a2[2] + 1);
            } else {
                int lastIndexOf = str.lastIndexOf(47, a3[2] - 1);
                int i2 = lastIndexOf == -1 ? a3[1] : lastIndexOf + 1;
                sb.append((CharSequence) str, 0, i2);
                sb.append(str2);
                a = a(sb, a3[1], i2 + a2[2]);
            }
        }
        return Uri.parse(a);
    }

    public static String a(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i3);
                i2 -= i3 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    i4 = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = i4 > i ? i4 : i;
                    sb.delete(i8, i3);
                    i2 -= i3 - i8;
                } else {
                    i4 = i5 + 1;
                }
                i6 = i4;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    public static int[] a(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }
}
