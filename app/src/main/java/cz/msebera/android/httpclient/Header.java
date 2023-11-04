package cz.msebera.android.httpclient;

/* loaded from: classes2.dex */
public interface Header {
    HeaderElement[] getElements() throws ParseException;

    String getName();

    String getValue();
}
