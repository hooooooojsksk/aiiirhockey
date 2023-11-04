package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.util.c0;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b0 {
    public static final String[][] b;
    public static final String[][] c;
    public static final String[][] d;
    public static final String[][] e = {new String[]{"fnof", "402"}, new String[]{"Alpha", "913"}, new String[]{"Beta", "914"}, new String[]{"Gamma", "915"}, new String[]{"Delta", "916"}, new String[]{"Epsilon", "917"}, new String[]{"Zeta", "918"}, new String[]{"Eta", "919"}, new String[]{"Theta", "920"}, new String[]{"Iota", "921"}, new String[]{"Kappa", "922"}, new String[]{"Lambda", "923"}, new String[]{"Mu", "924"}, new String[]{"Nu", "925"}, new String[]{"Xi", "926"}, new String[]{"Omicron", "927"}, new String[]{"Pi", "928"}, new String[]{"Rho", "929"}, new String[]{"Sigma", "931"}, new String[]{"Tau", "932"}, new String[]{"Upsilon", "933"}, new String[]{"Phi", "934"}, new String[]{"Chi", "935"}, new String[]{"Psi", "936"}, new String[]{"Omega", "937"}, new String[]{"alpha", "945"}, new String[]{"beta", "946"}, new String[]{"gamma", "947"}, new String[]{"delta", "948"}, new String[]{"epsilon", "949"}, new String[]{"zeta", "950"}, new String[]{"eta", "951"}, new String[]{"theta", "952"}, new String[]{"iota", "953"}, new String[]{"kappa", "954"}, new String[]{"lambda", "955"}, new String[]{"mu", "956"}, new String[]{"nu", "957"}, new String[]{"xi", "958"}, new String[]{"omicron", "959"}, new String[]{"pi", "960"}, new String[]{"rho", "961"}, new String[]{"sigmaf", "962"}, new String[]{"sigma", "963"}, new String[]{"tau", "964"}, new String[]{"upsilon", "965"}, new String[]{"phi", "966"}, new String[]{"chi", "967"}, new String[]{"psi", "968"}, new String[]{"omega", "969"}, new String[]{"thetasym", "977"}, new String[]{"upsih", "978"}, new String[]{"piv", "982"}, new String[]{"bull", "8226"}, new String[]{"hellip", "8230"}, new String[]{"prime", "8242"}, new String[]{"Prime", "8243"}, new String[]{"oline", "8254"}, new String[]{"frasl", "8260"}, new String[]{"weierp", "8472"}, new String[]{"image", "8465"}, new String[]{"real", "8476"}, new String[]{"trade", "8482"}, new String[]{"alefsym", "8501"}, new String[]{"larr", "8592"}, new String[]{"uarr", "8593"}, new String[]{"rarr", "8594"}, new String[]{"darr", "8595"}, new String[]{"harr", "8596"}, new String[]{"crarr", "8629"}, new String[]{"lArr", "8656"}, new String[]{"uArr", "8657"}, new String[]{"rArr", "8658"}, new String[]{"dArr", "8659"}, new String[]{"hArr", "8660"}, new String[]{"forall", "8704"}, new String[]{"part", "8706"}, new String[]{"exist", "8707"}, new String[]{"empty", "8709"}, new String[]{"nabla", "8711"}, new String[]{"isin", "8712"}, new String[]{"notin", "8713"}, new String[]{"ni", "8715"}, new String[]{"prod", "8719"}, new String[]{"sum", "8721"}, new String[]{"minus", "8722"}, new String[]{"lowast", "8727"}, new String[]{"radic", "8730"}, new String[]{"prop", "8733"}, new String[]{"infin", "8734"}, new String[]{"ang", "8736"}, new String[]{"and", "8743"}, new String[]{"or", "8744"}, new String[]{"cap", "8745"}, new String[]{"cup", "8746"}, new String[]{"int", "8747"}, new String[]{"there4", "8756"}, new String[]{"sim", "8764"}, new String[]{"cong", "8773"}, new String[]{"asymp", "8776"}, new String[]{"ne", "8800"}, new String[]{"equiv", "8801"}, new String[]{"le", "8804"}, new String[]{"ge", "8805"}, new String[]{"sub", "8834"}, new String[]{"sup", "8835"}, new String[]{"sube", "8838"}, new String[]{"supe", "8839"}, new String[]{"oplus", "8853"}, new String[]{"otimes", "8855"}, new String[]{"perp", "8869"}, new String[]{"sdot", "8901"}, new String[]{"lceil", "8968"}, new String[]{"rceil", "8969"}, new String[]{"lfloor", "8970"}, new String[]{"rfloor", "8971"}, new String[]{"lang", "9001"}, new String[]{"rang", "9002"}, new String[]{"loz", "9674"}, new String[]{"spades", "9824"}, new String[]{"clubs", "9827"}, new String[]{"hearts", "9829"}, new String[]{"diams", "9830"}, new String[]{"OElig", "338"}, new String[]{"oelig", "339"}, new String[]{"Scaron", "352"}, new String[]{"scaron", "353"}, new String[]{"Yuml", "376"}, new String[]{"circ", "710"}, new String[]{"tilde", "732"}, new String[]{"ensp", "8194"}, new String[]{"emsp", "8195"}, new String[]{"thinsp", "8201"}, new String[]{"zwnj", "8204"}, new String[]{"zwj", "8205"}, new String[]{"lrm", "8206"}, new String[]{"rlm", "8207"}, new String[]{"ndash", "8211"}, new String[]{"mdash", "8212"}, new String[]{"lsquo", "8216"}, new String[]{"rsquo", "8217"}, new String[]{"sbquo", "8218"}, new String[]{"ldquo", "8220"}, new String[]{"rdquo", "8221"}, new String[]{"bdquo", "8222"}, new String[]{"dagger", "8224"}, new String[]{"Dagger", "8225"}, new String[]{"permil", "8240"}, new String[]{"lsaquo", "8249"}, new String[]{"rsaquo", "8250"}, new String[]{"euro", "8364"}};
    public static final b0 f;
    public static final b0 g;
    public a a = new b();

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public static class b extends c {
    }

    /* loaded from: classes.dex */
    public static class c implements a {
        public Map a = new HashMap();
        public c0 b = new c0();
    }

    static {
        String[][] strArr = {new String[]{"quot", "34"}, new String[]{"amp", "38"}, new String[]{"lt", "60"}, new String[]{"gt", "62"}};
        b = strArr;
        String[][] strArr2 = {new String[]{"apos", "39"}};
        c = strArr2;
        String[][] strArr3 = {new String[]{"nbsp", "160"}, new String[]{"iexcl", "161"}, new String[]{"cent", "162"}, new String[]{"pound", "163"}, new String[]{"curren", "164"}, new String[]{"yen", "165"}, new String[]{"brvbar", "166"}, new String[]{"sect", "167"}, new String[]{"uml", "168"}, new String[]{"copy", "169"}, new String[]{"ordf", "170"}, new String[]{"laquo", "171"}, new String[]{"not", "172"}, new String[]{"shy", "173"}, new String[]{"reg", "174"}, new String[]{"macr", "175"}, new String[]{"deg", "176"}, new String[]{"plusmn", "177"}, new String[]{"sup2", "178"}, new String[]{"sup3", "179"}, new String[]{"acute", "180"}, new String[]{"micro", "181"}, new String[]{"para", "182"}, new String[]{"middot", "183"}, new String[]{"cedil", "184"}, new String[]{"sup1", "185"}, new String[]{"ordm", "186"}, new String[]{"raquo", "187"}, new String[]{"frac14", "188"}, new String[]{"frac12", "189"}, new String[]{"frac34", "190"}, new String[]{"iquest", "191"}, new String[]{"Agrave", "192"}, new String[]{"Aacute", "193"}, new String[]{"Acirc", "194"}, new String[]{"Atilde", "195"}, new String[]{"Auml", "196"}, new String[]{"Aring", "197"}, new String[]{"AElig", "198"}, new String[]{"Ccedil", "199"}, new String[]{"Egrave", "200"}, new String[]{"Eacute", "201"}, new String[]{"Ecirc", "202"}, new String[]{"Euml", "203"}, new String[]{"Igrave", "204"}, new String[]{"Iacute", "205"}, new String[]{"Icirc", "206"}, new String[]{"Iuml", "207"}, new String[]{"ETH", "208"}, new String[]{"Ntilde", "209"}, new String[]{"Ograve", "210"}, new String[]{"Oacute", "211"}, new String[]{"Ocirc", "212"}, new String[]{"Otilde", "213"}, new String[]{"Ouml", "214"}, new String[]{"times", "215"}, new String[]{"Oslash", "216"}, new String[]{"Ugrave", "217"}, new String[]{"Uacute", "218"}, new String[]{"Ucirc", "219"}, new String[]{"Uuml", "220"}, new String[]{"Yacute", "221"}, new String[]{"THORN", "222"}, new String[]{"szlig", "223"}, new String[]{"agrave", "224"}, new String[]{"aacute", "225"}, new String[]{"acirc", "226"}, new String[]{"atilde", "227"}, new String[]{"auml", "228"}, new String[]{"aring", "229"}, new String[]{"aelig", "230"}, new String[]{"ccedil", "231"}, new String[]{"egrave", "232"}, new String[]{"eacute", "233"}, new String[]{"ecirc", "234"}, new String[]{"euml", "235"}, new String[]{"igrave", "236"}, new String[]{"iacute", "237"}, new String[]{"icirc", "238"}, new String[]{"iuml", "239"}, new String[]{"eth", "240"}, new String[]{"ntilde", "241"}, new String[]{"ograve", "242"}, new String[]{"oacute", "243"}, new String[]{"ocirc", "244"}, new String[]{"otilde", "245"}, new String[]{"ouml", "246"}, new String[]{"divide", "247"}, new String[]{"oslash", "248"}, new String[]{"ugrave", "249"}, new String[]{"uacute", "250"}, new String[]{"ucirc", "251"}, new String[]{"uuml", "252"}, new String[]{"yacute", "253"}, new String[]{"thorn", "254"}, new String[]{"yuml", "255"}};
        d = strArr3;
        b0 b0Var = new b0();
        f = b0Var;
        b0Var.a(strArr);
        b0Var.a(strArr2);
        b0 b0Var2 = new b0();
        b0Var2.a(strArr);
        b0Var2.a(strArr3);
        b0 b0Var3 = new b0();
        g = b0Var3;
        a(b0Var3);
    }

    public static void a(b0 b0Var) {
        b0Var.a(b);
        b0Var.a(d);
        b0Var.a(e);
        b0Var.a(c);
    }

    public void a(String[][] strArr) {
        char c2 = 0;
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i][c2];
            int parseInt = Integer.parseInt(strArr[i][1]);
            c cVar = (c) this.a;
            cVar.a.put(str, Integer.valueOf(parseInt));
            c0 c0Var = cVar.b;
            c0.a[] aVarArr = c0Var.a;
            int i2 = Integer.MAX_VALUE;
            int i3 = parseInt & Integer.MAX_VALUE;
            int length = i3 % aVarArr.length;
            c0.a aVar = aVarArr[length];
            while (true) {
                if (aVar != null) {
                    if (aVar.a == parseInt) {
                        aVar.b = str;
                        break;
                    }
                    aVar = aVar.c;
                } else {
                    if (c0Var.b >= c0Var.c) {
                        c0.a[] aVarArr2 = c0Var.a;
                        int length2 = aVarArr2.length;
                        int i4 = (length2 * 2) + 1;
                        c0.a[] aVarArr3 = new c0.a[i4];
                        c0Var.c = (int) (i4 * 0.75f);
                        c0Var.a = aVarArr3;
                        while (true) {
                            int i5 = length2 - 1;
                            if (length2 <= 0) {
                                break;
                            }
                            c0.a aVar2 = aVarArr2[i5];
                            while (aVar2 != null) {
                                c0.a aVar3 = aVar2.c;
                                int i6 = (aVar2.a & i2) % i4;
                                aVar2.c = aVarArr3[i6];
                                aVarArr3[i6] = aVar2;
                                aVar2 = aVar3;
                                i2 = Integer.MAX_VALUE;
                            }
                            length2 = i5;
                        }
                        aVarArr = c0Var.a;
                        length = i3 % aVarArr.length;
                    }
                    aVarArr[length] = new c0.a(parseInt, parseInt, str, aVarArr[length]);
                    c0Var.b++;
                }
            }
            i++;
            c2 = 0;
        }
    }

    public String a(String str) {
        int indexOf = str.indexOf(38);
        if (indexOf < 0) {
            return str;
        }
        double length = str.length();
        double length2 = str.length();
        Double.isNaN(length2);
        Double.isNaN(length);
        StringWriter stringWriter = new StringWriter((int) (length + (length2 * 0.1d)));
        try {
            a(stringWriter, str, indexOf);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0068, code lost:
        if (r2 > 65535) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.io.Writer r11, java.lang.String r12, int r13) throws java.io.IOException {
        /*
            r10 = this;
            r0 = 0
            r11.write(r12, r0, r13)
            int r1 = r12.length()
        L8:
            if (r13 >= r1) goto L97
            char r2 = r12.charAt(r13)
            r3 = 38
            r4 = 1
            if (r2 != r3) goto L91
            int r5 = r13 + 1
            r6 = 59
            int r7 = r12.indexOf(r6, r5)
            r8 = -1
            if (r7 != r8) goto L23
            r11.write(r2)
            goto L94
        L23:
            int r9 = r12.indexOf(r3, r5)
            if (r9 == r8) goto L2f
            if (r9 >= r7) goto L2f
            r11.write(r2)
            goto L94
        L2f:
            java.lang.String r13 = r12.substring(r5, r7)
            int r2 = r13.length()
            if (r2 <= 0) goto L7f
            char r5 = r13.charAt(r0)
            r9 = 35
            if (r5 != r9) goto L6b
            if (r2 <= r4) goto L7f
            char r2 = r13.charAt(r4)
            r5 = 88
            if (r2 == r5) goto L5a
            r5 = 120(0x78, float:1.68E-43)
            if (r2 == r5) goto L5a
            java.lang.String r2 = r13.substring(r4)     // Catch: java.lang.NumberFormatException -> L77
            r5 = 10
            int r2 = java.lang.Integer.parseInt(r2, r5)     // Catch: java.lang.NumberFormatException -> L77
            goto L65
        L5a:
            r2 = 2
            java.lang.String r2 = r13.substring(r2)     // Catch: java.lang.NumberFormatException -> L77
            r5 = 16
            int r2 = java.lang.Integer.parseInt(r2, r5)     // Catch: java.lang.NumberFormatException -> L77
        L65:
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r2 <= r5) goto L80
            goto L77
        L6b:
            com.fyber.inneractive.sdk.util.b0$a r2 = r10.a
            com.fyber.inneractive.sdk.util.b0$c r2 = (com.fyber.inneractive.sdk.util.b0.c) r2
            java.util.Map r2 = r2.a
            java.lang.Object r2 = r2.get(r13)
            if (r2 != 0) goto L78
        L77:
            goto L7f
        L78:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L80
        L7f:
            r2 = -1
        L80:
            if (r2 != r8) goto L8c
            r11.write(r3)
            r11.write(r13)
            r11.write(r6)
            goto L8f
        L8c:
            r11.write(r2)
        L8f:
            r13 = r7
            goto L94
        L91:
            r11.write(r2)
        L94:
            int r13 = r13 + r4
            goto L8
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.b0.a(java.io.Writer, java.lang.String, int):void");
    }
}
