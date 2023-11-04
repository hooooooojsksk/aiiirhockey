package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class StringValue extends GeneratedMessageLite<StringValue, b> implements p0 {
    private static final StringValue DEFAULT_INSTANCE;
    private static volatile w0<StringValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeneratedMessageLite.f.values().length];
            a = iArr;
            try {
                iArr[GeneratedMessageLite.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[GeneratedMessageLite.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[GeneratedMessageLite.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[GeneratedMessageLite.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[GeneratedMessageLite.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[GeneratedMessageLite.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[GeneratedMessageLite.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.b<StringValue, b> implements p0 {
        public b() {
            super(StringValue.DEFAULT_INSTANCE);
        }
    }

    static {
        StringValue stringValue = new StringValue();
        DEFAULT_INSTANCE = stringValue;
        GeneratedMessageLite.registerDefaultInstance(StringValue.class, stringValue);
    }

    private StringValue() {
    }

    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static StringValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static StringValue of(String str) {
        b newBuilder = newBuilder();
        newBuilder.c();
        ((StringValue) newBuilder.b).setValue(str);
        return newBuilder.a();
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StringValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer) throws z {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w0<StringValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(String str) {
        str.getClass();
        this.value_ = str;
    }

    public void setValueBytes(i iVar) {
        iVar.getClass();
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.value_ = iVar.i();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new StringValue();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                w0<StringValue> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (StringValue.class) {
                        w0Var = PARSER;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.c<>(DEFAULT_INSTANCE);
                            PARSER = w0Var;
                        }
                    }
                }
                return w0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getValue() {
        return this.value_;
    }

    public i getValueBytes() {
        return i.a(this.value_);
    }

    public static b newBuilder(StringValue stringValue) {
        return DEFAULT_INSTANCE.createBuilder(stringValue);
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
        return (StringValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer, q qVar) throws z {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
    }

    public static StringValue parseFrom(i iVar) throws z {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
    }

    public static StringValue parseFrom(i iVar, q qVar) throws z {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
    }

    public static StringValue parseFrom(byte[] bArr) throws z {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StringValue parseFrom(byte[] bArr, q qVar) throws z {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
    }

    public static StringValue parseFrom(InputStream inputStream) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(InputStream inputStream, q qVar) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static StringValue parseFrom(j jVar) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static StringValue parseFrom(j jVar, q qVar) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
    }
}
