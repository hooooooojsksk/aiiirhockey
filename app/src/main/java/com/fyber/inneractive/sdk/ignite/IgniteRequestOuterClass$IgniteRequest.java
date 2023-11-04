package com.fyber.inneractive.sdk.ignite;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.p0;
import com.fyber.inneractive.sdk.protobuf.q;
import com.fyber.inneractive.sdk.protobuf.w0;
import com.fyber.inneractive.sdk.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class IgniteRequestOuterClass$IgniteRequest extends GeneratedMessageLite<IgniteRequestOuterClass$IgniteRequest, a> implements p0 {
    public static final int APPID_FIELD_NUMBER = 1;
    public static final int APPSIGNATURE_FIELD_NUMBER = 3;
    public static final int BUNDLE_FIELD_NUMBER = 2;
    private static final IgniteRequestOuterClass$IgniteRequest DEFAULT_INSTANCE;
    public static final int IGNITEPACKAGENAME_FIELD_NUMBER = 4;
    public static final int IGNITEVERSIONNAME_FIELD_NUMBER = 5;
    private static volatile w0<IgniteRequestOuterClass$IgniteRequest> PARSER = null;
    public static final int SDKVERSION_FIELD_NUMBER = 6;
    private int bitField0_;
    private String appId_ = "";
    private String bundle_ = "";
    private String appSignature_ = "";
    private String ignitePackageName_ = "";
    private String igniteVersionName_ = "";
    private String sdkVersion_ = "";

    /* loaded from: classes.dex */
    public static final class a extends GeneratedMessageLite.b<IgniteRequestOuterClass$IgniteRequest, a> implements p0 {
        public a() {
            super(IgniteRequestOuterClass$IgniteRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        IgniteRequestOuterClass$IgniteRequest igniteRequestOuterClass$IgniteRequest = new IgniteRequestOuterClass$IgniteRequest();
        DEFAULT_INSTANCE = igniteRequestOuterClass$IgniteRequest;
        GeneratedMessageLite.registerDefaultInstance(IgniteRequestOuterClass$IgniteRequest.class, igniteRequestOuterClass$IgniteRequest);
    }

    private IgniteRequestOuterClass$IgniteRequest() {
    }

    public void clearAppId() {
        this.bitField0_ &= -2;
        this.appId_ = getDefaultInstance().getAppId();
    }

    public void clearAppSignature() {
        this.bitField0_ &= -5;
        this.appSignature_ = getDefaultInstance().getAppSignature();
    }

    public void clearBundle() {
        this.bitField0_ &= -3;
        this.bundle_ = getDefaultInstance().getBundle();
    }

    public void clearIgnitePackageName() {
        this.bitField0_ &= -9;
        this.ignitePackageName_ = getDefaultInstance().getIgnitePackageName();
    }

    public void clearIgniteVersionName() {
        this.bitField0_ &= -17;
        this.igniteVersionName_ = getDefaultInstance().getIgniteVersionName();
    }

    public void clearSdkVersion() {
        this.bitField0_ &= -33;
        this.sdkVersion_ = getDefaultInstance().getSdkVersion();
    }

    public static IgniteRequestOuterClass$IgniteRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IgniteRequestOuterClass$IgniteRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IgniteRequestOuterClass$IgniteRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(ByteBuffer byteBuffer) throws z {
        return (IgniteRequestOuterClass$IgniteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w0<IgniteRequestOuterClass$IgniteRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAppId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.appId_ = str;
    }

    public void setAppIdBytes(com.fyber.inneractive.sdk.protobuf.i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.appId_ = iVar.i();
        this.bitField0_ |= 1;
    }

    public void setAppSignature(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.appSignature_ = str;
    }

    public void setAppSignatureBytes(com.fyber.inneractive.sdk.protobuf.i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.appSignature_ = iVar.i();
        this.bitField0_ |= 4;
    }

    public void setBundle(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.bundle_ = str;
    }

    public void setBundleBytes(com.fyber.inneractive.sdk.protobuf.i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.bundle_ = iVar.i();
        this.bitField0_ |= 2;
    }

    public void setIgnitePackageName(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.ignitePackageName_ = str;
    }

    public void setIgnitePackageNameBytes(com.fyber.inneractive.sdk.protobuf.i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.ignitePackageName_ = iVar.i();
        this.bitField0_ |= 8;
    }

    public void setIgniteVersionName(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.igniteVersionName_ = str;
    }

    public void setIgniteVersionNameBytes(com.fyber.inneractive.sdk.protobuf.i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.igniteVersionName_ = iVar.i();
        this.bitField0_ |= 16;
    }

    public void setSdkVersion(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.sdkVersion_ = str;
    }

    public void setSdkVersionBytes(com.fyber.inneractive.sdk.protobuf.i iVar) {
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.sdkVersion_ = iVar.i();
        this.bitField0_ |= 32;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (l.a[fVar.ordinal()]) {
            case 1:
                return new IgniteRequestOuterClass$IgniteRequest();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005", new Object[]{"bitField0_", "appId_", "bundle_", "appSignature_", "ignitePackageName_", "igniteVersionName_", "sdkVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                w0<IgniteRequestOuterClass$IgniteRequest> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (IgniteRequestOuterClass$IgniteRequest.class) {
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

    public String getAppId() {
        return this.appId_;
    }

    public com.fyber.inneractive.sdk.protobuf.i getAppIdBytes() {
        return com.fyber.inneractive.sdk.protobuf.i.a(this.appId_);
    }

    public String getAppSignature() {
        return this.appSignature_;
    }

    public com.fyber.inneractive.sdk.protobuf.i getAppSignatureBytes() {
        return com.fyber.inneractive.sdk.protobuf.i.a(this.appSignature_);
    }

    public String getBundle() {
        return this.bundle_;
    }

    public com.fyber.inneractive.sdk.protobuf.i getBundleBytes() {
        return com.fyber.inneractive.sdk.protobuf.i.a(this.bundle_);
    }

    public String getIgnitePackageName() {
        return this.ignitePackageName_;
    }

    public com.fyber.inneractive.sdk.protobuf.i getIgnitePackageNameBytes() {
        return com.fyber.inneractive.sdk.protobuf.i.a(this.ignitePackageName_);
    }

    public String getIgniteVersionName() {
        return this.igniteVersionName_;
    }

    public com.fyber.inneractive.sdk.protobuf.i getIgniteVersionNameBytes() {
        return com.fyber.inneractive.sdk.protobuf.i.a(this.igniteVersionName_);
    }

    public String getSdkVersion() {
        return this.sdkVersion_;
    }

    public com.fyber.inneractive.sdk.protobuf.i getSdkVersionBytes() {
        return com.fyber.inneractive.sdk.protobuf.i.a(this.sdkVersion_);
    }

    public boolean hasAppId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAppSignature() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasBundle() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIgnitePackageName() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIgniteVersionName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSdkVersion() {
        return (this.bitField0_ & 32) != 0;
    }

    public static a newBuilder(IgniteRequestOuterClass$IgniteRequest igniteRequestOuterClass$IgniteRequest) {
        return DEFAULT_INSTANCE.createBuilder(igniteRequestOuterClass$IgniteRequest);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
        return (IgniteRequestOuterClass$IgniteRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(ByteBuffer byteBuffer, q qVar) throws z {
        return (IgniteRequestOuterClass$IgniteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws z {
        return (IgniteRequestOuterClass$IgniteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws z {
        return (IgniteRequestOuterClass$IgniteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(byte[] bArr) throws z {
        return (IgniteRequestOuterClass$IgniteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(byte[] bArr, q qVar) throws z {
        return (IgniteRequestOuterClass$IgniteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(InputStream inputStream) throws IOException {
        return (IgniteRequestOuterClass$IgniteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(InputStream inputStream, q qVar) throws IOException {
        return (IgniteRequestOuterClass$IgniteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
        return (IgniteRequestOuterClass$IgniteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
        return (IgniteRequestOuterClass$IgniteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
    }
}
