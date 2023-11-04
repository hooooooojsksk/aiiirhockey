package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Queue;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d implements y.a<c> {
    public static final Pattern a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern b = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern c = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern d = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern e = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern f = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern g = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern h = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern i = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern j = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern k = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern l = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern m = Pattern.compile("METHOD=(NONE|AES-128)");
    public static final Pattern n = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern o = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern p = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern q = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern r = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern s = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern t = a("AUTOSELECT");
    public static final Pattern u = a("DEFAULT");
    public static final Pattern v = a("FORCED");

    /* loaded from: classes.dex */
    public static class a {
        public final BufferedReader a;
        public final Queue<String> b;
        public String c;

        public a(Queue<String> queue, BufferedReader bufferedReader) {
            this.b = queue;
            this.a = bufferedReader;
        }

        public boolean a() throws IOException {
            String trim;
            if (this.c != null) {
                return true;
            }
            if (!this.b.isEmpty()) {
                this.c = this.b.poll();
                return true;
            }
            do {
                String readLine = this.a.readLine();
                this.c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() throws IOException {
            if (a()) {
                String str = this.c;
                this.c = null;
                return str;
            }
            return null;
        }
    }

    public static b b(a aVar, String str) throws IOException {
        int i2;
        String hexString;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = 2;
        char c2 = 0;
        int i4 = 1;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1;
        boolean z2 = false;
        b.a aVar2 = null;
        int i10 = 0;
        long j8 = -1;
        boolean z3 = false;
        while (true) {
            String str2 = null;
            String str3 = null;
            while (aVar.a()) {
                String b2 = aVar.b();
                if (b2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                    String b3 = b(b2, g);
                    if ("VOD".equals(b3)) {
                        i5 = 1;
                    } else if ("EVENT".equals(b3)) {
                        i5 = 2;
                    }
                } else if (b2.startsWith("#EXT-X-START")) {
                    j2 = (long) (Double.parseDouble(b(b2, j)) * 1000000.0d);
                } else if (b2.startsWith("#EXT-X-MAP")) {
                    String b4 = b(b2, n);
                    String a2 = a(b2, l);
                    if (a2 != null) {
                        String[] split = a2.split("@");
                        j8 = Long.parseLong(split[c2]);
                        if (split.length > i4) {
                            j5 = Long.parseLong(split[i4]);
                        }
                    }
                    aVar2 = new b.a(b4, 0L, -1, -9223372036854775807L, false, null, null, j5, j8);
                    j5 = 0;
                    j8 = -1;
                } else if (b2.startsWith("#EXT-X-TARGETDURATION")) {
                    j3 = 1000000 * Integer.parseInt(b(b2, e));
                } else if (b2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                    i10 = Integer.parseInt(b(b2, h));
                    i8 = i10;
                } else if (b2.startsWith("#EXT-X-VERSION")) {
                    i9 = Integer.parseInt(b(b2, f));
                } else if (b2.startsWith("#EXTINF")) {
                    j7 = (long) (Double.parseDouble(b(b2, i)) * 1000000.0d);
                } else if (b2.startsWith("#EXT-X-KEY")) {
                    z3 = "AES-128".equals(b(b2, m));
                    if (z3) {
                        str3 = b(b2, n);
                        str2 = a(b2, o);
                    }
                } else if (b2.startsWith("#EXT-X-BYTERANGE")) {
                    String[] split2 = b(b2, k).split("@");
                    j8 = Long.parseLong(split2[c2]);
                    if (split2.length > i4) {
                        j5 = Long.parseLong(split2[i4]);
                    }
                } else if (b2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                    i7 = Integer.parseInt(b2.substring(b2.indexOf(58) + i4));
                    z = true;
                } else if (b2.equals("#EXT-X-DISCONTINUITY")) {
                    i6++;
                } else if (b2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                    if (j4 == 0) {
                        String substring = b2.substring(b2.indexOf(58) + i4);
                        Matcher matcher = u.f.matcher(substring);
                        if (matcher.matches()) {
                            if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                                i2 = 0;
                            } else {
                                i2 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                                if (matcher.group(11).equals("-")) {
                                    i2 *= -1;
                                }
                            }
                            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                            gregorianCalendar.clear();
                            gregorianCalendar.set(Integer.parseInt(matcher.group(i4)), Integer.parseInt(matcher.group(i3)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                            if (!TextUtils.isEmpty(matcher.group(8))) {
                                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                            }
                            long timeInMillis = gregorianCalendar.getTimeInMillis();
                            if (i2 != 0) {
                                timeInMillis -= i2 * 60000;
                            }
                            j4 = com.fyber.inneractive.sdk.player.exoplayer2.b.a(timeInMillis) - j6;
                        } else {
                            throw new l("Invalid date/time format: " + substring);
                        }
                    }
                } else if (b2.startsWith("#EXT-X-DATERANGE")) {
                    arrayList2.add(b2);
                } else if (!b2.startsWith("#")) {
                    if (z3) {
                        hexString = str2 != null ? str2 : Integer.toHexString(i10);
                    } else {
                        hexString = null;
                    }
                    int i11 = i10 + 1;
                    int i12 = (j8 > (-1L) ? 1 : (j8 == (-1L) ? 0 : -1));
                    if (i12 == 0) {
                        j5 = 0;
                    }
                    arrayList.add(new b.a(b2, j7, i6, j6, z3, str3, hexString, j5, j8));
                    j6 += j7;
                    if (i12 != 0) {
                        j5 += j8;
                    }
                    i10 = i11;
                    j8 = -1;
                    j7 = 0;
                } else if (b2.equals("#EXT-X-ENDLIST")) {
                    i3 = 2;
                    c2 = 0;
                    i4 = 1;
                    z2 = true;
                }
                i3 = 2;
                c2 = 0;
                i4 = 1;
            }
            return new b(i5, str, j2, j4, z, i7, i8, i9, j3, z2, j4 != 0, aVar2, arrayList, arrayList2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0068, code lost:
        r1 = r0.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x006c, code lost:
        if (r1 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x006e, code lost:
        r1 = r1.trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0076, code lost:
        if (r1.isEmpty() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x007f, code lost:
        if (r1.startsWith("#EXT-X-STREAM-INF") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0081, code lost:
        r9.add(r1);
        r8 = a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d.a(r9, r0), r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0098, code lost:
        if (r1.startsWith("#EXT-X-TARGETDURATION") != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00a0, code lost:
        if (r1.startsWith("#EXT-X-MEDIA-SEQUENCE") != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00a8, code lost:
        if (r1.startsWith("#EXTINF") != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00b0, code lost:
        if (r1.startsWith("#EXT-X-KEY") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00b8, code lost:
        if (r1.startsWith("#EXT-X-BYTERANGE") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00c0, code lost:
        if (r1.equals("#EXT-X-DISCONTINUITY") != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00c8, code lost:
        if (r1.equals("#EXT-X-DISCONTINUITY-SEQUENCE") != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x00d0, code lost:
        if (r1.equals("#EXT-X-ENDLIST") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00d3, code lost:
        r9.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00d7, code lost:
        r9.add(r1);
        r8 = b(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d.a(r9, r0), r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00ea, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00eb, code lost:
        com.fyber.inneractive.sdk.player.exoplayer2.util.u.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x00f5, code lost:
        throw new com.fyber.inneractive.sdk.player.exoplayer2.l("Failed to parse the playlist, could not identify any tags.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(android.net.Uri r8, java.io.InputStream r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d.a(android.net.Uri, java.io.InputStream):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0082, code lost:
        if (r14.equals("CLOSED-CAPTIONS") == false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x019b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d.a r45, java.lang.String r46) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d$a, java.lang.String):com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a");
    }

    public static String b(String str, Pattern pattern) throws l {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new l("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String a(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static boolean a(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals("YES") : z;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }
}
