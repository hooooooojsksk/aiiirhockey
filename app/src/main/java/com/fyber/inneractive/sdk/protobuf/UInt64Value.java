package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class UInt64Value extends GeneratedMessageLite<UInt64Value, b> implements p0 {
    private static final UInt64Value DEFAULT_INSTANCE;
    private static volatile w0<UInt64Value> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

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
    public static final class b extends GeneratedMessageLite.b<UInt64Value, b> implements p0 {
        public b() {
            super(UInt64Value.DEFAULT_INSTANCE);
        }
    }

    static {
        UInt64Value uInt64Value = new UInt64Value();
        DEFAULT_INSTANCE = uInt64Value;
        GeneratedMessageLite.registerDefaultInstance(UInt64Value.class, uInt64Value);
    }

    private UInt64Value() {
    }

    public void clearValue() {
        this.value_ = 0L;
    }

    public static UInt64Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UInt64Value of(long j) {
        b newBuilder = newBuilder();
        newBuilder.c();
        ((UInt64Value) newBuilder.b).setValue(j);
        return newBuilder.a();
    }

    public static UInt64Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UInt64Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt64Value parseFrom(ByteBuffer byteBuffer) throws z {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w0<UInt64Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(long j) {
        this.value_ = j;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new UInt64Value();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                w0<UInt64Value> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (UInt64Value.class) {
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

    public long getValue() {
        return this.value_;
    }

    public static b newBuilder(UInt64Value uInt64Value) {
        return DEFAULT_INSTANCE.createBuilder(uInt64Value);
    }

    public static UInt64Value parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
        return (UInt64Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static UInt64Value parseFrom(ByteBuffer byteBuffer, q qVar) throws z {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
    }

    public static UInt64Value parseFrom(i iVar) throws z {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
    }

    public static UInt64Value parseFrom(i iVar, q qVar) throws z {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
    }

    public static UInt64Value parseFrom(byte[] bArr) throws z {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UInt64Value parseFrom(byte[] bArr, q qVar) throws z {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
    }

    public static UInt64Value parseFrom(InputStream inputStream) throws IOException {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt64Value parseFrom(InputStream inputStream, q qVar) throws IOException {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static UInt64Value parseFrom(j jVar) throws IOException {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static UInt64Value parseFrom(j jVar, q qVar) throws IOException {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
    }
}
