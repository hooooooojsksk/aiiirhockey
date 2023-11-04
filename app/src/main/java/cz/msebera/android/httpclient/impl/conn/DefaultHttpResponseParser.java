package cz.msebera.android.httpclient.impl.conn;

import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.HttpResponseFactory;
import cz.msebera.android.httpclient.config.MessageConstraints;
import cz.msebera.android.httpclient.extras.HttpClientAndroidLog;
import cz.msebera.android.httpclient.impl.DefaultHttpResponseFactory;
import cz.msebera.android.httpclient.impl.io.AbstractMessageParser;
import cz.msebera.android.httpclient.io.SessionInputBuffer;
import cz.msebera.android.httpclient.message.LineParser;
import cz.msebera.android.httpclient.params.HttpParams;
import cz.msebera.android.httpclient.util.Args;
import cz.msebera.android.httpclient.util.CharArrayBuffer;

/* loaded from: classes2.dex */
public class DefaultHttpResponseParser extends AbstractMessageParser<HttpResponse> {
    private final CharArrayBuffer lineBuf;
    public HttpClientAndroidLog log;
    private final HttpResponseFactory responseFactory;

    protected boolean reject(CharArrayBuffer charArrayBuffer, int i) {
        return false;
    }

    @Deprecated
    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        this.log = new HttpClientAndroidLog(getClass());
        Args.notNull(httpResponseFactory, "Response factory");
        this.responseFactory = httpResponseFactory;
        this.lineBuf = new CharArrayBuffer(128);
    }

    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, MessageConstraints messageConstraints) {
        super(sessionInputBuffer, lineParser, messageConstraints);
        this.log = new HttpClientAndroidLog(getClass());
        this.responseFactory = httpResponseFactory == null ? DefaultHttpResponseFactory.INSTANCE : httpResponseFactory;
        this.lineBuf = new CharArrayBuffer(128);
    }

    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints) {
        this(sessionInputBuffer, (LineParser) null, (HttpResponseFactory) null, messageConstraints);
    }

    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer) {
        this(sessionInputBuffer, (LineParser) null, (HttpResponseFactory) null, MessageConstraints.DEFAULT);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0079, code lost:
        throw new cz.msebera.android.httpclient.ProtocolException("The server failed to respond with a valid HTTP response");
     */
    @Override // cz.msebera.android.httpclient.impl.io.AbstractMessageParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cz.msebera.android.httpclient.HttpResponse parseHead(cz.msebera.android.httpclient.io.SessionInputBuffer r8) throws java.io.IOException, cz.msebera.android.httpclient.HttpException {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            cz.msebera.android.httpclient.util.CharArrayBuffer r2 = r7.lineBuf
            r2.clear()
            cz.msebera.android.httpclient.util.CharArrayBuffer r2 = r7.lineBuf
            int r2 = r8.readLine(r2)
            r3 = -1
            if (r2 != r3) goto L1b
            if (r1 == 0) goto L13
            goto L1b
        L13:
            cz.msebera.android.httpclient.NoHttpResponseException r8 = new cz.msebera.android.httpclient.NoHttpResponseException
            java.lang.String r0 = "The target server failed to respond"
            r8.<init>(r0)
            throw r8
        L1b:
            cz.msebera.android.httpclient.message.ParserCursor r4 = new cz.msebera.android.httpclient.message.ParserCursor
            cz.msebera.android.httpclient.util.CharArrayBuffer r5 = r7.lineBuf
            int r5 = r5.length()
            r4.<init>(r0, r5)
            cz.msebera.android.httpclient.message.LineParser r5 = r7.lineParser
            cz.msebera.android.httpclient.util.CharArrayBuffer r6 = r7.lineBuf
            boolean r5 = r5.hasProtocolVersion(r6, r4)
            if (r5 == 0) goto L40
            cz.msebera.android.httpclient.message.LineParser r8 = r7.lineParser
            cz.msebera.android.httpclient.util.CharArrayBuffer r0 = r7.lineBuf
            cz.msebera.android.httpclient.StatusLine r8 = r8.parseStatusLine(r0, r4)
            cz.msebera.android.httpclient.HttpResponseFactory r0 = r7.responseFactory
            r1 = 0
            cz.msebera.android.httpclient.HttpResponse r8 = r0.newHttpResponse(r8, r1)
            return r8
        L40:
            if (r2 == r3) goto L71
            cz.msebera.android.httpclient.util.CharArrayBuffer r2 = r7.lineBuf
            boolean r2 = r7.reject(r2, r1)
            if (r2 != 0) goto L71
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r2 = r7.log
            boolean r2 = r2.isDebugEnabled()
            if (r2 == 0) goto L6e
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r2 = r7.log
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Garbage in response: "
            r3.append(r4)
            cz.msebera.android.httpclient.util.CharArrayBuffer r4 = r7.lineBuf
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.debug(r3)
        L6e:
            int r1 = r1 + 1
            goto L2
        L71:
            cz.msebera.android.httpclient.ProtocolException r8 = new cz.msebera.android.httpclient.ProtocolException
            java.lang.String r0 = "The server failed to respond with a valid HTTP response"
            r8.<init>(r0)
            goto L7a
        L79:
            throw r8
        L7a:
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: cz.msebera.android.httpclient.impl.conn.DefaultHttpResponseParser.parseHead(cz.msebera.android.httpclient.io.SessionInputBuffer):cz.msebera.android.httpclient.HttpResponse");
    }
}
