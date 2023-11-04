package com.fyber.inneractive.sdk.protobuf;

import cz.msebera.android.httpclient.message.TokenParser;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class q0 {
    /* JADX WARN: Code restructure failed: missing block: B:201:0x01d1, code lost:
        if (((java.lang.Integer) r4).intValue() == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x01e2, code lost:
        if (((java.lang.Float) r4).floatValue() == 0.0f) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x01f4, code lost:
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0228, code lost:
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.fyber.inneractive.sdk.protobuf.o0 r13, java.lang.StringBuilder r14, int r15) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.q0.a(com.fyber.inneractive.sdk.protobuf.o0, java.lang.StringBuilder, int):void");
    }

    public static final void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                a(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                a(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(TokenParser.SP);
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(i1.a(i.a((String) obj)));
                sb.append('\"');
            } else if (obj instanceof i) {
                sb.append(": \"");
                sb.append(i1.a((i) obj));
                sb.append('\"');
            } else if (obj instanceof GeneratedMessageLite) {
                sb.append(" {");
                a((GeneratedMessageLite) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(TokenParser.SP);
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                a(sb, i4, "key", entry2.getKey());
                a(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(TokenParser.SP);
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    public static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
