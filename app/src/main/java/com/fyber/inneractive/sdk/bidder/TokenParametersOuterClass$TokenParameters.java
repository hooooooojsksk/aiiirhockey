package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.p0;
import com.fyber.inneractive.sdk.protobuf.q;
import com.fyber.inneractive.sdk.protobuf.w0;
import com.fyber.inneractive.sdk.protobuf.x;
import com.fyber.inneractive.sdk.protobuf.y;
import com.fyber.inneractive.sdk.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class TokenParametersOuterClass$TokenParameters extends GeneratedMessageLite<TokenParametersOuterClass$TokenParameters, b> implements p0 {
    public static final int AAID_FIELD_NUMBER = 54;
    public static final int ABEXPERIMENTS_FIELD_NUMBER = 63;
    public static final int AIRPLANEMODE_FIELD_NUMBER = 50;
    public static final int AMAZONID_FIELD_NUMBER = 53;
    public static final int APPBUILDVERSION_FIELD_NUMBER = 55;
    public static final int APPVERSION_FIELD_NUMBER = 6;
    public static final int BATTERYCHARGING_FIELD_NUMBER = 43;
    public static final int BATTERYLEVEL_FIELD_NUMBER = 44;
    public static final int BLUETOOTHPLUGGED_FIELD_NUMBER = 46;
    public static final int BUNDLEID_FIELD_NUMBER = 4;
    public static final int CARRIERNAME_FIELD_NUMBER = 18;
    public static final int CCPASTRING_FIELD_NUMBER = 27;
    public static final int CHILDMODE_FIELD_NUMBER = 69;
    public static final int COPPAAPPLIES_FIELD_NUMBER = 70;
    public static final int COUNTRYCODE_FIELD_NUMBER = 17;
    public static final int DARKMODE_FIELD_NUMBER = 49;
    private static final TokenParametersOuterClass$TokenParameters DEFAULT_INSTANCE;
    public static final int DEVICEAPI_FIELD_NUMBER = 8;
    public static final int DEVICEHEIGHT_FIELD_NUMBER = 13;
    public static final int DEVICELANGUAGE_FIELD_NUMBER = 10;
    public static final int DEVICEMODEL_FIELD_NUMBER = 5;
    public static final int DEVICEOS_FIELD_NUMBER = 7;
    public static final int DEVICEWIDTH_FIELD_NUMBER = 12;
    public static final int DNDMODE_FIELD_NUMBER = 51;
    public static final int DNT_FIELD_NUMBER = 24;
    public static final int FRAMEWORKNAME_FIELD_NUMBER = 15;
    public static final int FREESPACE_FIELD_NUMBER = 47;
    public static final int GDPRCONSENT_FIELD_NUMBER = 25;
    public static final int GDPRSTRING_FIELD_NUMBER = 26;
    public static final int HEADSETPLUGGED_FIELD_NUMBER = 45;
    public static final int HORACCURACY_FIELD_NUMBER = 39;
    public static final int IDFA_FIELD_NUMBER = 22;
    public static final int IDFV_FIELD_NUMBER = 23;
    public static final int IGNITEPACKAGENAME_FIELD_NUMBER = 68;
    public static final int IGNITEVERSION_FIELD_NUMBER = 67;
    public static final int INPUTLANGUAGES_FIELD_NUMBER = 21;
    public static final int ISRINGMUTED_FIELD_NUMBER = 52;
    public static final int KEYWORDS_FIELD_NUMBER = 36;
    public static final int LASTADOMAINS_FIELD_NUMBER = 57;
    public static final int LASTADVERTISEDBUNDLES_FIELD_NUMBER = 58;
    public static final int LATITUDE_FIELD_NUMBER = 37;
    public static final int LGPDCONSENT_FIELD_NUMBER = 66;
    public static final int LONGITUDE_FIELD_NUMBER = 38;
    public static final int LOWPOWERMODE_FIELD_NUMBER = 48;
    public static final int MEDIATIONTYPE_FIELD_NUMBER = 14;
    public static final int MOBILECOUNTRYCODE_FIELD_NUMBER = 19;
    public static final int MOBILENETWORKCODE_FIELD_NUMBER = 20;
    public static final int MOCKRESPONSEID_FIELD_NUMBER = 65;
    public static final int MUTEAUDIO_FIELD_NUMBER = 32;
    public static final int NETWORK_FIELD_NUMBER = 31;
    public static final int OFFSETFROMGMT_FIELD_NUMBER = 28;
    public static final int OSVERSION_FIELD_NUMBER = 9;
    private static volatile w0<TokenParametersOuterClass$TokenParameters> PARSER = null;
    public static final int PORTAL_FIELD_NUMBER = 64;
    public static final int PRIORCLICKS_FIELD_NUMBER = 59;
    public static final int PRIORCLICKTYPES_FIELD_NUMBER = 61;
    public static final int PRIORSKIP_FIELD_NUMBER = 60;
    public static final int PXRATIO_FIELD_NUMBER = 11;
    public static final int SDKVERSION_FIELD_NUMBER = 3;
    public static final int SECURECONTENT_FIELD_NUMBER = 42;
    public static final int SESSIONDURATION_FIELD_NUMBER = 56;
    public static final int TIMEACCURACY_FIELD_NUMBER = 41;
    public static final int TOTALSPACE_FIELD_NUMBER = 16;
    public static final int TRACKINGSTATUS_FIELD_NUMBER = 29;
    public static final int USERAGENT_FIELD_NUMBER = 2;
    public static final int USERAGE_FIELD_NUMBER = 33;
    public static final int USERGENDER_FIELD_NUMBER = 34;
    public static final int USERID_FIELD_NUMBER = 30;
    public static final int USERSESSIONS_FIELD_NUMBER = 62;
    public static final int VERACCURACY_FIELD_NUMBER = 40;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int ZIPCODE_FIELD_NUMBER = 35;
    private static final y.h.a<Integer, k> priorClicks_converter_ = new a();
    private NullableString aaid_;
    private NullableBool airplaneMode_;
    private NullableString amazonId_;
    private NullableString appBuildVersion_;
    private NullableString appVersion_;
    private NullableBool batteryCharging_;
    private NullableUInt32 batteryLevel_;
    private int bitField0_;
    private NullableBool bluetoothPlugged_;
    private NullableString bundleID_;
    private NullableString carrierName_;
    private NullableString ccpaString_;
    private NullableBool childMode_;
    private NullableBool coppaApplies_;
    private NullableString countryCode_;
    private boolean darkMode_;
    private NullableUInt32 deviceApi_;
    private NullableUInt32 deviceHeight_;
    private NullableString deviceLanguage_;
    private NullableString deviceModel_;
    private NullableString deviceOS_;
    private NullableUInt32 deviceWidth_;
    private NullableBool dndMode_;
    private boolean dnt_;
    private int frameworkName_;
    private NullableUInt32 freeSpace_;
    private NullableBool gdprConsent_;
    private NullableString gdprString_;
    private NullableBool headsetPlugged_;
    private NullableFloat horAccuracy_;
    private NullableString idfa_;
    private NullableString idfv_;
    private NullableString ignitePackageName_;
    private NullableString igniteVersion_;
    private NullableString inputLanguages_;
    private NullableBool isRingMuted_;
    private NullableString keywords_;
    private NullableFloat latitude_;
    private NullableBool lgpdConsent_;
    private NullableFloat longitude_;
    private NullableBool lowPowerMode_;
    private NullableString mediationType_;
    private NullableString mobileCountryCode_;
    private NullableString mobileNetworkCode_;
    private NullableString mockResponseId_;
    private boolean muteAudio_;
    private NullableString network_;
    private NullableSInt32 offsetFromGMT_;
    private NullableString osVersion_;
    private NullableUInt32 portal_;
    private int priorClicksMemoizedSerializedSize;
    private NullableBool priorSkip_;
    private NullableFloat pxRatio_;
    private NullableString sdkVersion_;
    private int secureContent_;
    private NullableUInt32 sessionDuration_;
    private NullableFloat timeAccuracy_;
    private NullableUInt32 totalSpace_;
    private NullableUInt32 trackingStatus_;
    private NullableUInt32 userAge_;
    private NullableString userAgent_;
    private int userGender_;
    private NullableString userID_;
    private NullableFloat verAccuracy_;
    private NullableString version_;
    private NullableString zipCode_;
    private y.j<LastAdomain> lastAdomains_ = GeneratedMessageLite.emptyProtobufList();
    private y.j<LastAdvertisedBundle> lastAdvertisedBundles_ = GeneratedMessageLite.emptyProtobufList();
    private y.g priorClicks_ = GeneratedMessageLite.emptyIntList();
    private y.j<PriorVideoClickType> priorClickTypes_ = GeneratedMessageLite.emptyProtobufList();
    private y.j<UserSession> userSessions_ = GeneratedMessageLite.emptyProtobufList();
    private y.j<Experiment> abExperiments_ = GeneratedMessageLite.emptyProtobufList();

    /* loaded from: classes.dex */
    public static final class Experiment extends GeneratedMessageLite<Experiment, a> implements c {
        private static final Experiment DEFAULT_INSTANCE;
        public static final int IDENTIFIER_FIELD_NUMBER = 1;
        private static volatile w0<Experiment> PARSER = null;
        public static final int VARIANT_FIELD_NUMBER = 2;
        private int bitField0_;
        private String identifier_ = "";
        private String variant_ = "";

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.b<Experiment, a> implements c {
            public a() {
                super(Experiment.DEFAULT_INSTANCE);
            }
        }

        static {
            Experiment experiment = new Experiment();
            DEFAULT_INSTANCE = experiment;
            GeneratedMessageLite.registerDefaultInstance(Experiment.class, experiment);
        }

        private Experiment() {
        }

        public void clearIdentifier() {
            this.bitField0_ &= -2;
            this.identifier_ = getDefaultInstance().getIdentifier();
        }

        public void clearVariant() {
            this.bitField0_ &= -3;
            this.variant_ = getDefaultInstance().getVariant();
        }

        public static Experiment getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Experiment parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Experiment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Experiment parseFrom(ByteBuffer byteBuffer) throws z {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w0<Experiment> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void setIdentifier(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.identifier_ = str;
        }

        public void setIdentifierBytes(com.fyber.inneractive.sdk.protobuf.i iVar) {
            com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
            this.identifier_ = iVar.i();
            this.bitField0_ |= 1;
        }

        public void setVariant(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.variant_ = str;
        }

        public void setVariantBytes(com.fyber.inneractive.sdk.protobuf.i iVar) {
            com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
            this.variant_ = iVar.i();
            this.bitField0_ |= 2;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.g.a[fVar.ordinal()]) {
                case 1:
                    return new Experiment();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "identifier_", "variant_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    w0<Experiment> w0Var = PARSER;
                    if (w0Var == null) {
                        synchronized (Experiment.class) {
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

        public String getIdentifier() {
            return this.identifier_;
        }

        public com.fyber.inneractive.sdk.protobuf.i getIdentifierBytes() {
            return com.fyber.inneractive.sdk.protobuf.i.a(this.identifier_);
        }

        public String getVariant() {
            return this.variant_;
        }

        public com.fyber.inneractive.sdk.protobuf.i getVariantBytes() {
            return com.fyber.inneractive.sdk.protobuf.i.a(this.variant_);
        }

        public boolean hasIdentifier() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasVariant() {
            return (this.bitField0_ & 2) != 0;
        }

        public static a newBuilder(Experiment experiment) {
            return DEFAULT_INSTANCE.createBuilder(experiment);
        }

        public static Experiment parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (Experiment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Experiment parseFrom(ByteBuffer byteBuffer, q qVar) throws z {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws z {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws z {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static Experiment parseFrom(byte[] bArr) throws z {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Experiment parseFrom(byte[] bArr, q qVar) throws z {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static Experiment parseFrom(InputStream inputStream) throws IOException {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Experiment parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (Experiment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class LastAdomain extends GeneratedMessageLite<LastAdomain, a> implements e {
        public static final int ADOMAIN_FIELD_NUMBER = 2;
        private static final LastAdomain DEFAULT_INSTANCE;
        private static volatile w0<LastAdomain> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private String adomain_ = "";
        private int bitField0_;
        private int type_;

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.b<LastAdomain, a> implements e {
            public a() {
                super(LastAdomain.DEFAULT_INSTANCE);
            }
        }

        static {
            LastAdomain lastAdomain = new LastAdomain();
            DEFAULT_INSTANCE = lastAdomain;
            GeneratedMessageLite.registerDefaultInstance(LastAdomain.class, lastAdomain);
        }

        private LastAdomain() {
        }

        public void clearAdomain() {
            this.bitField0_ &= -3;
            this.adomain_ = getDefaultInstance().getAdomain();
        }

        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static LastAdomain getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static LastAdomain parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LastAdomain) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LastAdomain parseFrom(ByteBuffer byteBuffer) throws z {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w0<LastAdomain> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void setAdomain(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.adomain_ = str;
        }

        public void setAdomainBytes(com.fyber.inneractive.sdk.protobuf.i iVar) {
            com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
            this.adomain_ = iVar.i();
            this.bitField0_ |= 2;
        }

        public void setType(k kVar) {
            this.type_ = kVar.a();
            this.bitField0_ |= 1;
        }

        public void setTypeValue(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.g.a[fVar.ordinal()]) {
                case 1:
                    return new LastAdomain();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "type_", "adomain_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    w0<LastAdomain> w0Var = PARSER;
                    if (w0Var == null) {
                        synchronized (LastAdomain.class) {
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

        public String getAdomain() {
            return this.adomain_;
        }

        public com.fyber.inneractive.sdk.protobuf.i getAdomainBytes() {
            return com.fyber.inneractive.sdk.protobuf.i.a(this.adomain_);
        }

        public k getType() {
            k a2 = k.a(this.type_);
            return a2 == null ? k.UNRECOGNIZED : a2;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasAdomain() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(LastAdomain lastAdomain) {
            return DEFAULT_INSTANCE.createBuilder(lastAdomain);
        }

        public static LastAdomain parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (LastAdomain) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static LastAdomain parseFrom(ByteBuffer byteBuffer, q qVar) throws z {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static LastAdomain parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws z {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static LastAdomain parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws z {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static LastAdomain parseFrom(byte[] bArr) throws z {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LastAdomain parseFrom(byte[] bArr, q qVar) throws z {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static LastAdomain parseFrom(InputStream inputStream) throws IOException {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LastAdomain parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static LastAdomain parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static LastAdomain parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (LastAdomain) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class LastAdvertisedBundle extends GeneratedMessageLite<LastAdvertisedBundle, a> implements f {
        private static final LastAdvertisedBundle DEFAULT_INSTANCE;
        public static final int LASTBUNDLE_FIELD_NUMBER = 2;
        private static volatile w0<LastAdvertisedBundle> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private String lastBundle_ = "";
        private int type_;

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.b<LastAdvertisedBundle, a> implements f {
            public a() {
                super(LastAdvertisedBundle.DEFAULT_INSTANCE);
            }
        }

        static {
            LastAdvertisedBundle lastAdvertisedBundle = new LastAdvertisedBundle();
            DEFAULT_INSTANCE = lastAdvertisedBundle;
            GeneratedMessageLite.registerDefaultInstance(LastAdvertisedBundle.class, lastAdvertisedBundle);
        }

        private LastAdvertisedBundle() {
        }

        public void clearLastBundle() {
            this.bitField0_ &= -3;
            this.lastBundle_ = getDefaultInstance().getLastBundle();
        }

        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static LastAdvertisedBundle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static LastAdvertisedBundle parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LastAdvertisedBundle parseFrom(ByteBuffer byteBuffer) throws z {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w0<LastAdvertisedBundle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void setLastBundle(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.lastBundle_ = str;
        }

        public void setLastBundleBytes(com.fyber.inneractive.sdk.protobuf.i iVar) {
            com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
            this.lastBundle_ = iVar.i();
            this.bitField0_ |= 2;
        }

        public void setType(k kVar) {
            this.type_ = kVar.a();
            this.bitField0_ |= 1;
        }

        public void setTypeValue(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.g.a[fVar.ordinal()]) {
                case 1:
                    return new LastAdvertisedBundle();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "type_", "lastBundle_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    w0<LastAdvertisedBundle> w0Var = PARSER;
                    if (w0Var == null) {
                        synchronized (LastAdvertisedBundle.class) {
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

        public String getLastBundle() {
            return this.lastBundle_;
        }

        public com.fyber.inneractive.sdk.protobuf.i getLastBundleBytes() {
            return com.fyber.inneractive.sdk.protobuf.i.a(this.lastBundle_);
        }

        public k getType() {
            k a2 = k.a(this.type_);
            return a2 == null ? k.UNRECOGNIZED : a2;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasLastBundle() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(LastAdvertisedBundle lastAdvertisedBundle) {
            return DEFAULT_INSTANCE.createBuilder(lastAdvertisedBundle);
        }

        public static LastAdvertisedBundle parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static LastAdvertisedBundle parseFrom(ByteBuffer byteBuffer, q qVar) throws z {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static LastAdvertisedBundle parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws z {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static LastAdvertisedBundle parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws z {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static LastAdvertisedBundle parseFrom(byte[] bArr) throws z {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LastAdvertisedBundle parseFrom(byte[] bArr, q qVar) throws z {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static LastAdvertisedBundle parseFrom(InputStream inputStream) throws IOException {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LastAdvertisedBundle parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static LastAdvertisedBundle parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static LastAdvertisedBundle parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (LastAdvertisedBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class NullableBool extends GeneratedMessageLite<NullableBool, a> implements p0 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final NullableBool DEFAULT_INSTANCE;
        private static volatile w0<NullableBool> PARSER;
        private int bitField0_;
        private boolean data_;

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.b<NullableBool, a> implements p0 {
            public a() {
                super(NullableBool.DEFAULT_INSTANCE);
            }
        }

        static {
            NullableBool nullableBool = new NullableBool();
            DEFAULT_INSTANCE = nullableBool;
            GeneratedMessageLite.registerDefaultInstance(NullableBool.class, nullableBool);
        }

        private NullableBool() {
        }

        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = false;
        }

        public static NullableBool getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableBool parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableBool) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableBool parseFrom(ByteBuffer byteBuffer) throws z {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w0<NullableBool> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void setData(boolean z) {
            this.bitField0_ |= 1;
            this.data_ = z;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.g.a[fVar.ordinal()]) {
                case 1:
                    return new NullableBool();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    w0<NullableBool> w0Var = PARSER;
                    if (w0Var == null) {
                        synchronized (NullableBool.class) {
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

        public boolean getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(NullableBool nullableBool) {
            return DEFAULT_INSTANCE.createBuilder(nullableBool);
        }

        public static NullableBool parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableBool) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableBool parseFrom(ByteBuffer byteBuffer, q qVar) throws z {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static NullableBool parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws z {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static NullableBool parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws z {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static NullableBool parseFrom(byte[] bArr) throws z {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableBool parseFrom(byte[] bArr, q qVar) throws z {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static NullableBool parseFrom(InputStream inputStream) throws IOException {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableBool parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableBool parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NullableBool parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (NullableBool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class NullableFloat extends GeneratedMessageLite<NullableFloat, a> implements p0 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final NullableFloat DEFAULT_INSTANCE;
        private static volatile w0<NullableFloat> PARSER;
        private int bitField0_;
        private float data_;

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.b<NullableFloat, a> implements p0 {
            public a() {
                super(NullableFloat.DEFAULT_INSTANCE);
            }
        }

        static {
            NullableFloat nullableFloat = new NullableFloat();
            DEFAULT_INSTANCE = nullableFloat;
            GeneratedMessageLite.registerDefaultInstance(NullableFloat.class, nullableFloat);
        }

        private NullableFloat() {
        }

        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = 0.0f;
        }

        public static NullableFloat getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableFloat parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableFloat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableFloat parseFrom(ByteBuffer byteBuffer) throws z {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w0<NullableFloat> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void setData(float f) {
            this.bitField0_ |= 1;
            this.data_ = f;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.g.a[fVar.ordinal()]) {
                case 1:
                    return new NullableFloat();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"bitField0_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    w0<NullableFloat> w0Var = PARSER;
                    if (w0Var == null) {
                        synchronized (NullableFloat.class) {
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

        public float getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(NullableFloat nullableFloat) {
            return DEFAULT_INSTANCE.createBuilder(nullableFloat);
        }

        public static NullableFloat parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableFloat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableFloat parseFrom(ByteBuffer byteBuffer, q qVar) throws z {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static NullableFloat parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws z {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static NullableFloat parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws z {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static NullableFloat parseFrom(byte[] bArr) throws z {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableFloat parseFrom(byte[] bArr, q qVar) throws z {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static NullableFloat parseFrom(InputStream inputStream) throws IOException {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableFloat parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableFloat parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NullableFloat parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (NullableFloat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class NullableSInt32 extends GeneratedMessageLite<NullableSInt32, a> implements p0 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final NullableSInt32 DEFAULT_INSTANCE;
        private static volatile w0<NullableSInt32> PARSER;
        private int bitField0_;
        private int data_;

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.b<NullableSInt32, a> implements p0 {
            public a() {
                super(NullableSInt32.DEFAULT_INSTANCE);
            }
        }

        static {
            NullableSInt32 nullableSInt32 = new NullableSInt32();
            DEFAULT_INSTANCE = nullableSInt32;
            GeneratedMessageLite.registerDefaultInstance(NullableSInt32.class, nullableSInt32);
        }

        private NullableSInt32() {
        }

        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = 0;
        }

        public static NullableSInt32 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableSInt32 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableSInt32) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableSInt32 parseFrom(ByteBuffer byteBuffer) throws z {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w0<NullableSInt32> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void setData(int i) {
            this.bitField0_ |= 1;
            this.data_ = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.g.a[fVar.ordinal()]) {
                case 1:
                    return new NullableSInt32();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဏ\u0000", new Object[]{"bitField0_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    w0<NullableSInt32> w0Var = PARSER;
                    if (w0Var == null) {
                        synchronized (NullableSInt32.class) {
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

        public int getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(NullableSInt32 nullableSInt32) {
            return DEFAULT_INSTANCE.createBuilder(nullableSInt32);
        }

        public static NullableSInt32 parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableSInt32) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableSInt32 parseFrom(ByteBuffer byteBuffer, q qVar) throws z {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static NullableSInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws z {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static NullableSInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws z {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static NullableSInt32 parseFrom(byte[] bArr) throws z {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableSInt32 parseFrom(byte[] bArr, q qVar) throws z {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static NullableSInt32 parseFrom(InputStream inputStream) throws IOException {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableSInt32 parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableSInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NullableSInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (NullableSInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class NullableString extends GeneratedMessageLite<NullableString, a> implements p0 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final NullableString DEFAULT_INSTANCE;
        private static volatile w0<NullableString> PARSER;
        private int bitField0_;
        private String data_ = "";

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.b<NullableString, a> implements p0 {
            public a() {
                super(NullableString.DEFAULT_INSTANCE);
            }
        }

        static {
            NullableString nullableString = new NullableString();
            DEFAULT_INSTANCE = nullableString;
            GeneratedMessageLite.registerDefaultInstance(NullableString.class, nullableString);
        }

        private NullableString() {
        }

        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = getDefaultInstance().getData();
        }

        public static NullableString getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableString parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableString) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableString parseFrom(ByteBuffer byteBuffer) throws z {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w0<NullableString> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void setData(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.data_ = str;
        }

        public void setDataBytes(com.fyber.inneractive.sdk.protobuf.i iVar) {
            com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
            this.data_ = iVar.i();
            this.bitField0_ |= 1;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.g.a[fVar.ordinal()]) {
                case 1:
                    return new NullableString();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    w0<NullableString> w0Var = PARSER;
                    if (w0Var == null) {
                        synchronized (NullableString.class) {
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

        public String getData() {
            return this.data_;
        }

        public com.fyber.inneractive.sdk.protobuf.i getDataBytes() {
            return com.fyber.inneractive.sdk.protobuf.i.a(this.data_);
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(NullableString nullableString) {
            return DEFAULT_INSTANCE.createBuilder(nullableString);
        }

        public static NullableString parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableString) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableString parseFrom(ByteBuffer byteBuffer, q qVar) throws z {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static NullableString parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws z {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static NullableString parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws z {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static NullableString parseFrom(byte[] bArr) throws z {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableString parseFrom(byte[] bArr, q qVar) throws z {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static NullableString parseFrom(InputStream inputStream) throws IOException {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableString parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableString parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NullableString parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (NullableString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class NullableUInt32 extends GeneratedMessageLite<NullableUInt32, a> implements p0 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final NullableUInt32 DEFAULT_INSTANCE;
        private static volatile w0<NullableUInt32> PARSER;
        private int bitField0_;
        private int data_;

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.b<NullableUInt32, a> implements p0 {
            public a() {
                super(NullableUInt32.DEFAULT_INSTANCE);
            }
        }

        static {
            NullableUInt32 nullableUInt32 = new NullableUInt32();
            DEFAULT_INSTANCE = nullableUInt32;
            GeneratedMessageLite.registerDefaultInstance(NullableUInt32.class, nullableUInt32);
        }

        private NullableUInt32() {
        }

        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = 0;
        }

        public static NullableUInt32 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableUInt32 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableUInt32) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableUInt32 parseFrom(ByteBuffer byteBuffer) throws z {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w0<NullableUInt32> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void setData(int i) {
            this.bitField0_ |= 1;
            this.data_ = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.g.a[fVar.ordinal()]) {
                case 1:
                    return new NullableUInt32();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"bitField0_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    w0<NullableUInt32> w0Var = PARSER;
                    if (w0Var == null) {
                        synchronized (NullableUInt32.class) {
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

        public int getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(NullableUInt32 nullableUInt32) {
            return DEFAULT_INSTANCE.createBuilder(nullableUInt32);
        }

        public static NullableUInt32 parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableUInt32) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableUInt32 parseFrom(ByteBuffer byteBuffer, q qVar) throws z {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static NullableUInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws z {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static NullableUInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws z {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static NullableUInt32 parseFrom(byte[] bArr) throws z {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableUInt32 parseFrom(byte[] bArr, q qVar) throws z {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static NullableUInt32 parseFrom(InputStream inputStream) throws IOException {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableUInt32 parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static NullableUInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NullableUInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (NullableUInt32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class PriorVideoClickType extends GeneratedMessageLite<PriorVideoClickType, a> implements g {
        public static final int CLICKTYPE_FIELD_NUMBER = 2;
        private static final PriorVideoClickType DEFAULT_INSTANCE;
        private static volatile w0<PriorVideoClickType> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private int clickType_;
        private int type_;

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.b<PriorVideoClickType, a> implements g {
            public a() {
                super(PriorVideoClickType.DEFAULT_INSTANCE);
            }
        }

        static {
            PriorVideoClickType priorVideoClickType = new PriorVideoClickType();
            DEFAULT_INSTANCE = priorVideoClickType;
            GeneratedMessageLite.registerDefaultInstance(PriorVideoClickType.class, priorVideoClickType);
        }

        private PriorVideoClickType() {
        }

        public void clearClickType() {
            this.bitField0_ &= -3;
            this.clickType_ = 0;
        }

        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static PriorVideoClickType getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PriorVideoClickType parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PriorVideoClickType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PriorVideoClickType parseFrom(ByteBuffer byteBuffer) throws z {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w0<PriorVideoClickType> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void setClickType(n nVar) {
            this.clickType_ = nVar.a();
            this.bitField0_ |= 2;
        }

        public void setClickTypeValue(int i) {
            this.bitField0_ |= 2;
            this.clickType_ = i;
        }

        public void setType(k kVar) {
            this.type_ = kVar.a();
            this.bitField0_ |= 1;
        }

        public void setTypeValue(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.g.a[fVar.ordinal()]) {
                case 1:
                    return new PriorVideoClickType();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "type_", "clickType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    w0<PriorVideoClickType> w0Var = PARSER;
                    if (w0Var == null) {
                        synchronized (PriorVideoClickType.class) {
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

        public n getClickType() {
            n a2 = n.a(this.clickType_);
            return a2 == null ? n.UNRECOGNIZED : a2;
        }

        public int getClickTypeValue() {
            return this.clickType_;
        }

        public k getType() {
            k a2 = k.a(this.type_);
            return a2 == null ? k.UNRECOGNIZED : a2;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasClickType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(PriorVideoClickType priorVideoClickType) {
            return DEFAULT_INSTANCE.createBuilder(priorVideoClickType);
        }

        public static PriorVideoClickType parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (PriorVideoClickType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PriorVideoClickType parseFrom(ByteBuffer byteBuffer, q qVar) throws z {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static PriorVideoClickType parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws z {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static PriorVideoClickType parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws z {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static PriorVideoClickType parseFrom(byte[] bArr) throws z {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PriorVideoClickType parseFrom(byte[] bArr, q qVar) throws z {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static PriorVideoClickType parseFrom(InputStream inputStream) throws IOException {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PriorVideoClickType parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PriorVideoClickType parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PriorVideoClickType parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (PriorVideoClickType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class SessionData extends GeneratedMessageLite<SessionData, a> implements i {
        public static final int CLICKS_FIELD_NUMBER = 2;
        public static final int COMPLETIONS_FIELD_NUMBER = 3;
        private static final SessionData DEFAULT_INSTANCE;
        public static final int IMPRESSIONS_FIELD_NUMBER = 1;
        private static volatile w0<SessionData> PARSER;
        private int bitField0_;
        private int clicks_;
        private int completions_;
        private int impressions_;

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.b<SessionData, a> implements i {
            public a() {
                super(SessionData.DEFAULT_INSTANCE);
            }
        }

        static {
            SessionData sessionData = new SessionData();
            DEFAULT_INSTANCE = sessionData;
            GeneratedMessageLite.registerDefaultInstance(SessionData.class, sessionData);
        }

        private SessionData() {
        }

        public void clearClicks() {
            this.bitField0_ &= -3;
            this.clicks_ = 0;
        }

        public void clearCompletions() {
            this.bitField0_ &= -5;
            this.completions_ = 0;
        }

        public void clearImpressions() {
            this.bitField0_ &= -2;
            this.impressions_ = 0;
        }

        public static SessionData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SessionData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SessionData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionData parseFrom(ByteBuffer byteBuffer) throws z {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w0<SessionData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void setClicks(int i) {
            this.bitField0_ |= 2;
            this.clicks_ = i;
        }

        public void setCompletions(int i) {
            this.bitField0_ |= 4;
            this.completions_ = i;
        }

        public void setImpressions(int i) {
            this.bitField0_ |= 1;
            this.impressions_ = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.g.a[fVar.ordinal()]) {
                case 1:
                    return new SessionData();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "impressions_", "clicks_", "completions_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    w0<SessionData> w0Var = PARSER;
                    if (w0Var == null) {
                        synchronized (SessionData.class) {
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

        public int getClicks() {
            return this.clicks_;
        }

        public int getCompletions() {
            return this.completions_;
        }

        public int getImpressions() {
            return this.impressions_;
        }

        public boolean hasClicks() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasCompletions() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasImpressions() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(SessionData sessionData) {
            return DEFAULT_INSTANCE.createBuilder(sessionData);
        }

        public static SessionData parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (SessionData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static SessionData parseFrom(ByteBuffer byteBuffer, q qVar) throws z {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static SessionData parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws z {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static SessionData parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws z {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static SessionData parseFrom(byte[] bArr) throws z {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SessionData parseFrom(byte[] bArr, q qVar) throws z {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static SessionData parseFrom(InputStream inputStream) throws IOException {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionData parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static SessionData parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static SessionData parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (SessionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class UserSession extends GeneratedMessageLite<UserSession, a> implements m {
        private static final UserSession DEFAULT_INSTANCE;
        private static volatile w0<UserSession> PARSER = null;
        public static final int SESSIONDATAITEMS_FIELD_NUMBER = 3;
        public static final int SUBTYPE_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private y.j<SessionData> sessionDataItems_ = GeneratedMessageLite.emptyProtobufList();
        private int subType_;
        private int type_;

        /* loaded from: classes.dex */
        public static final class a extends GeneratedMessageLite.b<UserSession, a> implements m {
            public a() {
                super(UserSession.DEFAULT_INSTANCE);
            }
        }

        static {
            UserSession userSession = new UserSession();
            DEFAULT_INSTANCE = userSession;
            GeneratedMessageLite.registerDefaultInstance(UserSession.class, userSession);
        }

        private UserSession() {
        }

        public void addAllSessionDataItems(Iterable<? extends SessionData> iterable) {
            ensureSessionDataItemsIsMutable();
            com.fyber.inneractive.sdk.protobuf.a.addAll((Iterable) iterable, (List) this.sessionDataItems_);
        }

        public void addSessionDataItems(SessionData sessionData) {
            sessionData.getClass();
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.add(sessionData);
        }

        public void clearSessionDataItems() {
            this.sessionDataItems_ = GeneratedMessageLite.emptyProtobufList();
        }

        public void clearSubType() {
            this.bitField0_ &= -3;
            this.subType_ = 0;
        }

        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        private void ensureSessionDataItemsIsMutable() {
            y.j<SessionData> jVar = this.sessionDataItems_;
            if (jVar.d()) {
                return;
            }
            this.sessionDataItems_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static UserSession getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UserSession parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserSession parseFrom(ByteBuffer byteBuffer) throws z {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w0<UserSession> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void removeSessionDataItems(int i) {
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.remove(i);
        }

        public void setSessionDataItems(int i, SessionData sessionData) {
            sessionData.getClass();
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.set(i, sessionData);
        }

        public void setSubType(j jVar) {
            this.subType_ = jVar.a();
            this.bitField0_ |= 2;
        }

        public void setSubTypeValue(int i) {
            this.bitField0_ |= 2;
            this.subType_ = i;
        }

        public void setType(k kVar) {
            this.type_ = kVar.a();
            this.bitField0_ |= 1;
        }

        public void setTypeValue(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (com.fyber.inneractive.sdk.bidder.g.a[fVar.ordinal()]) {
                case 1:
                    return new UserSession();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b", new Object[]{"bitField0_", "type_", "subType_", "sessionDataItems_", SessionData.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    w0<UserSession> w0Var = PARSER;
                    if (w0Var == null) {
                        synchronized (UserSession.class) {
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

        public SessionData getSessionDataItems(int i) {
            return this.sessionDataItems_.get(i);
        }

        public int getSessionDataItemsCount() {
            return this.sessionDataItems_.size();
        }

        public List<SessionData> getSessionDataItemsList() {
            return this.sessionDataItems_;
        }

        public i getSessionDataItemsOrBuilder(int i) {
            return this.sessionDataItems_.get(i);
        }

        public List<? extends i> getSessionDataItemsOrBuilderList() {
            return this.sessionDataItems_;
        }

        public j getSubType() {
            j a2 = j.a(this.subType_);
            return a2 == null ? j.UNRECOGNIZED : a2;
        }

        public int getSubTypeValue() {
            return this.subType_;
        }

        public k getType() {
            k a2 = k.a(this.type_);
            return a2 == null ? k.UNRECOGNIZED : a2;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasSubType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(UserSession userSession) {
            return DEFAULT_INSTANCE.createBuilder(userSession);
        }

        public static UserSession parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
            return (UserSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static UserSession parseFrom(ByteBuffer byteBuffer, q qVar) throws z {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static UserSession parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws z {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public void addSessionDataItems(int i, SessionData sessionData) {
            sessionData.getClass();
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.add(i, sessionData);
        }

        public static UserSession parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws z {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static UserSession parseFrom(byte[] bArr) throws z {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserSession parseFrom(byte[] bArr, q qVar) throws z {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static UserSession parseFrom(InputStream inputStream) throws IOException {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserSession parseFrom(InputStream inputStream, q qVar) throws IOException {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static UserSession parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static UserSession parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
            return (UserSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public class a implements y.h.a<Integer, k> {
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.b<TokenParametersOuterClass$TokenParameters, b> implements p0 {
        public b() {
            super(TokenParametersOuterClass$TokenParameters.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes.dex */
    public interface c extends p0 {
    }

    /* loaded from: classes.dex */
    public enum d implements y.c {
        NATIVE(0),
        UNITY3D(1),
        UNRECOGNIZED(-1);
        
        public static final int NATIVE_VALUE = 0;
        public static final int UNITY3D_VALUE = 1;
        private static final y.d<d> internalValueMap = new a();
        private final int value;

        /* loaded from: classes.dex */
        public class a implements y.d<d> {
            @Override // com.fyber.inneractive.sdk.protobuf.y.d
            public d a(int i) {
                if (i != 0) {
                    if (i != 1) {
                        return null;
                    }
                    return d.UNITY3D;
                }
                return d.NATIVE;
            }
        }

        d(int i) {
            this.value = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.y.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* loaded from: classes.dex */
    public interface e extends p0 {
    }

    /* loaded from: classes.dex */
    public interface f extends p0 {
    }

    /* loaded from: classes.dex */
    public interface g extends p0 {
    }

    /* loaded from: classes.dex */
    public interface i extends p0 {
    }

    /* loaded from: classes.dex */
    public interface m extends p0 {
    }

    static {
        TokenParametersOuterClass$TokenParameters tokenParametersOuterClass$TokenParameters = new TokenParametersOuterClass$TokenParameters();
        DEFAULT_INSTANCE = tokenParametersOuterClass$TokenParameters;
        GeneratedMessageLite.registerDefaultInstance(TokenParametersOuterClass$TokenParameters.class, tokenParametersOuterClass$TokenParameters);
    }

    private TokenParametersOuterClass$TokenParameters() {
    }

    public void addAbExperiments(Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.add(experiment);
    }

    public void addAllAbExperiments(Iterable<? extends Experiment> iterable) {
        ensureAbExperimentsIsMutable();
        com.fyber.inneractive.sdk.protobuf.a.addAll((Iterable) iterable, (List) this.abExperiments_);
    }

    public void addAllLastAdomains(Iterable<? extends LastAdomain> iterable) {
        ensureLastAdomainsIsMutable();
        com.fyber.inneractive.sdk.protobuf.a.addAll((Iterable) iterable, (List) this.lastAdomains_);
    }

    public void addAllLastAdvertisedBundles(Iterable<? extends LastAdvertisedBundle> iterable) {
        ensureLastAdvertisedBundlesIsMutable();
        com.fyber.inneractive.sdk.protobuf.a.addAll((Iterable) iterable, (List) this.lastAdvertisedBundles_);
    }

    public void addAllPriorClickTypes(Iterable<? extends PriorVideoClickType> iterable) {
        ensurePriorClickTypesIsMutable();
        com.fyber.inneractive.sdk.protobuf.a.addAll((Iterable) iterable, (List) this.priorClickTypes_);
    }

    public void addAllPriorClicks(Iterable<? extends k> iterable) {
        ensurePriorClicksIsMutable();
        for (k kVar : iterable) {
            ((x) this.priorClicks_).c(kVar.a());
        }
    }

    public void addAllPriorClicksValue(Iterable<Integer> iterable) {
        ensurePriorClicksIsMutable();
        for (Integer num : iterable) {
            ((x) this.priorClicks_).c(num.intValue());
        }
    }

    public void addAllUserSessions(Iterable<? extends UserSession> iterable) {
        ensureUserSessionsIsMutable();
        com.fyber.inneractive.sdk.protobuf.a.addAll((Iterable) iterable, (List) this.userSessions_);
    }

    public void addLastAdomains(LastAdomain lastAdomain) {
        lastAdomain.getClass();
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.add(lastAdomain);
    }

    public void addLastAdvertisedBundles(LastAdvertisedBundle lastAdvertisedBundle) {
        lastAdvertisedBundle.getClass();
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.add(lastAdvertisedBundle);
    }

    public void addPriorClickTypes(PriorVideoClickType priorVideoClickType) {
        priorVideoClickType.getClass();
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.add(priorVideoClickType);
    }

    public void addPriorClicks(k kVar) {
        kVar.getClass();
        ensurePriorClicksIsMutable();
        ((x) this.priorClicks_).c(kVar.a());
    }

    public void addPriorClicksValue(int i2) {
        ensurePriorClicksIsMutable();
        ((x) this.priorClicks_).c(i2);
    }

    public void addUserSessions(UserSession userSession) {
        userSession.getClass();
        ensureUserSessionsIsMutable();
        this.userSessions_.add(userSession);
    }

    public void clearAaid() {
        this.aaid_ = null;
        this.bitField0_ &= -8193;
    }

    public void clearAbExperiments() {
        this.abExperiments_ = GeneratedMessageLite.emptyProtobufList();
    }

    public void clearAirplaneMode() {
        this.airplaneMode_ = null;
        this.bitField0_ &= -513;
    }

    public void clearAmazonId() {
        this.amazonId_ = null;
        this.bitField0_ &= -4097;
    }

    public void clearAppBuildVersion() {
        this.appBuildVersion_ = null;
        this.bitField0_ &= -16385;
    }

    public void clearAppVersion() {
        this.appVersion_ = null;
    }

    public void clearBatteryCharging() {
        this.batteryCharging_ = null;
    }

    public void clearBatteryLevel() {
        this.batteryLevel_ = null;
    }

    public void clearBluetoothPlugged() {
        this.bluetoothPlugged_ = null;
        this.bitField0_ &= -129;
    }

    public void clearBundleID() {
        this.bundleID_ = null;
    }

    public void clearCarrierName() {
        this.carrierName_ = null;
    }

    public void clearCcpaString() {
        this.ccpaString_ = null;
    }

    public void clearChildMode() {
        this.childMode_ = null;
        this.bitField0_ &= -524289;
    }

    public void clearCoppaApplies() {
        this.coppaApplies_ = null;
        this.bitField0_ &= -1048577;
    }

    public void clearCountryCode() {
        this.countryCode_ = null;
    }

    public void clearDarkMode() {
        this.darkMode_ = false;
    }

    public void clearDeviceApi() {
        this.deviceApi_ = null;
        this.bitField0_ &= -2;
    }

    public void clearDeviceHeight() {
        this.deviceHeight_ = null;
    }

    public void clearDeviceLanguage() {
        this.deviceLanguage_ = null;
    }

    public void clearDeviceModel() {
        this.deviceModel_ = null;
    }

    public void clearDeviceOS() {
        this.deviceOS_ = null;
    }

    public void clearDeviceWidth() {
        this.deviceWidth_ = null;
    }

    public void clearDndMode() {
        this.dndMode_ = null;
        this.bitField0_ &= -1025;
    }

    public void clearDnt() {
        this.bitField0_ &= -17;
        this.dnt_ = false;
    }

    public void clearFrameworkName() {
        this.frameworkName_ = 0;
    }

    public void clearFreeSpace() {
        this.freeSpace_ = null;
    }

    public void clearGdprConsent() {
        this.gdprConsent_ = null;
    }

    public void clearGdprString() {
        this.gdprString_ = null;
    }

    public void clearHeadsetPlugged() {
        this.headsetPlugged_ = null;
        this.bitField0_ &= -65;
    }

    public void clearHorAccuracy() {
        this.horAccuracy_ = null;
    }

    public void clearIdfa() {
        this.idfa_ = null;
        this.bitField0_ &= -5;
    }

    public void clearIdfv() {
        this.idfv_ = null;
        this.bitField0_ &= -9;
    }

    public void clearIgnitePackageName() {
        this.ignitePackageName_ = null;
        this.bitField0_ &= -262145;
    }

    public void clearIgniteVersion() {
        this.igniteVersion_ = null;
        this.bitField0_ &= -131073;
    }

    public void clearInputLanguages() {
        this.inputLanguages_ = null;
    }

    public void clearIsRingMuted() {
        this.isRingMuted_ = null;
        this.bitField0_ &= -2049;
    }

    public void clearKeywords() {
        this.keywords_ = null;
    }

    public void clearLastAdomains() {
        this.lastAdomains_ = GeneratedMessageLite.emptyProtobufList();
    }

    public void clearLastAdvertisedBundles() {
        this.lastAdvertisedBundles_ = GeneratedMessageLite.emptyProtobufList();
    }

    public void clearLatitude() {
        this.latitude_ = null;
    }

    public void clearLgpdConsent() {
        this.lgpdConsent_ = null;
    }

    public void clearLongitude() {
        this.longitude_ = null;
    }

    public void clearLowPowerMode() {
        this.lowPowerMode_ = null;
        this.bitField0_ &= -257;
    }

    public void clearMediationType() {
        this.mediationType_ = null;
    }

    public void clearMobileCountryCode() {
        this.mobileCountryCode_ = null;
    }

    public void clearMobileNetworkCode() {
        this.mobileNetworkCode_ = null;
    }

    public void clearMockResponseId() {
        this.mockResponseId_ = null;
        this.bitField0_ &= -65537;
    }

    public void clearMuteAudio() {
        this.muteAudio_ = false;
    }

    public void clearNetwork() {
        this.network_ = null;
    }

    public void clearOffsetFromGMT() {
        this.offsetFromGMT_ = null;
    }

    public void clearOsVersion() {
        this.osVersion_ = null;
    }

    public void clearPortal() {
        this.portal_ = null;
        this.bitField0_ &= -32769;
    }

    public void clearPriorClickTypes() {
        this.priorClickTypes_ = GeneratedMessageLite.emptyProtobufList();
    }

    public void clearPriorClicks() {
        this.priorClicks_ = GeneratedMessageLite.emptyIntList();
    }

    public void clearPriorSkip() {
        this.priorSkip_ = null;
    }

    public void clearPxRatio() {
        this.pxRatio_ = null;
        this.bitField0_ &= -3;
    }

    public void clearSdkVersion() {
        this.sdkVersion_ = null;
    }

    public void clearSecureContent() {
        this.secureContent_ = 0;
    }

    public void clearSessionDuration() {
        this.sessionDuration_ = null;
    }

    public void clearTimeAccuracy() {
        this.timeAccuracy_ = null;
    }

    public void clearTotalSpace() {
        this.totalSpace_ = null;
    }

    public void clearTrackingStatus() {
        this.trackingStatus_ = null;
        this.bitField0_ &= -33;
    }

    public void clearUserAge() {
        this.userAge_ = null;
    }

    public void clearUserAgent() {
        this.userAgent_ = null;
    }

    public void clearUserGender() {
        this.userGender_ = 0;
    }

    public void clearUserID() {
        this.userID_ = null;
    }

    public void clearUserSessions() {
        this.userSessions_ = GeneratedMessageLite.emptyProtobufList();
    }

    public void clearVerAccuracy() {
        this.verAccuracy_ = null;
    }

    public void clearVersion() {
        this.version_ = null;
    }

    public void clearZipCode() {
        this.zipCode_ = null;
    }

    private void ensureAbExperimentsIsMutable() {
        y.j<Experiment> jVar = this.abExperiments_;
        if (jVar.d()) {
            return;
        }
        this.abExperiments_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureLastAdomainsIsMutable() {
        y.j<LastAdomain> jVar = this.lastAdomains_;
        if (jVar.d()) {
            return;
        }
        this.lastAdomains_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureLastAdvertisedBundlesIsMutable() {
        y.j<LastAdvertisedBundle> jVar = this.lastAdvertisedBundles_;
        if (jVar.d()) {
            return;
        }
        this.lastAdvertisedBundles_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensurePriorClickTypesIsMutable() {
        y.j<PriorVideoClickType> jVar = this.priorClickTypes_;
        if (jVar.d()) {
            return;
        }
        this.priorClickTypes_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensurePriorClicksIsMutable() {
        y.g gVar = this.priorClicks_;
        if (((com.fyber.inneractive.sdk.protobuf.c) gVar).a) {
            return;
        }
        this.priorClicks_ = GeneratedMessageLite.mutableCopy(gVar);
    }

    private void ensureUserSessionsIsMutable() {
        y.j<UserSession> jVar = this.userSessions_;
        if (jVar.d()) {
            return;
        }
        this.userSessions_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static TokenParametersOuterClass$TokenParameters getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeAaid(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.aaid_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.aaid_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.aaid_ = newBuilder.b();
        } else {
            this.aaid_ = nullableString;
        }
        this.bitField0_ |= 8192;
    }

    public void mergeAirplaneMode(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.airplaneMode_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.airplaneMode_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableBool);
            this.airplaneMode_ = newBuilder.b();
        } else {
            this.airplaneMode_ = nullableBool;
        }
        this.bitField0_ |= 512;
    }

    public void mergeAmazonId(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.amazonId_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.amazonId_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.amazonId_ = newBuilder.b();
        } else {
            this.amazonId_ = nullableString;
        }
        this.bitField0_ |= 4096;
    }

    public void mergeAppBuildVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.appBuildVersion_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.appBuildVersion_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.appBuildVersion_ = newBuilder.b();
        } else {
            this.appBuildVersion_ = nullableString;
        }
        this.bitField0_ |= 16384;
    }

    public void mergeAppVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.appVersion_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.appVersion_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.appVersion_ = newBuilder.b();
            return;
        }
        this.appVersion_ = nullableString;
    }

    public void mergeBatteryCharging(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.batteryCharging_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.batteryCharging_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableBool);
            this.batteryCharging_ = newBuilder.b();
            return;
        }
        this.batteryCharging_ = nullableBool;
    }

    public void mergeBatteryLevel(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.batteryLevel_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.batteryLevel_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableUInt32);
            this.batteryLevel_ = newBuilder.b();
            return;
        }
        this.batteryLevel_ = nullableUInt32;
    }

    public void mergeBluetoothPlugged(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.bluetoothPlugged_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.bluetoothPlugged_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableBool);
            this.bluetoothPlugged_ = newBuilder.b();
        } else {
            this.bluetoothPlugged_ = nullableBool;
        }
        this.bitField0_ |= 128;
    }

    public void mergeBundleID(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.bundleID_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.bundleID_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.bundleID_ = newBuilder.b();
            return;
        }
        this.bundleID_ = nullableString;
    }

    public void mergeCarrierName(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.carrierName_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.carrierName_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.carrierName_ = newBuilder.b();
            return;
        }
        this.carrierName_ = nullableString;
    }

    public void mergeCcpaString(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.ccpaString_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.ccpaString_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.ccpaString_ = newBuilder.b();
            return;
        }
        this.ccpaString_ = nullableString;
    }

    public void mergeChildMode(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.childMode_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.childMode_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableBool);
            this.childMode_ = newBuilder.b();
        } else {
            this.childMode_ = nullableBool;
        }
        this.bitField0_ |= 524288;
    }

    public void mergeCoppaApplies(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.coppaApplies_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.coppaApplies_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableBool);
            this.coppaApplies_ = newBuilder.b();
        } else {
            this.coppaApplies_ = nullableBool;
        }
        this.bitField0_ |= 1048576;
    }

    public void mergeCountryCode(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.countryCode_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.countryCode_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.countryCode_ = newBuilder.b();
            return;
        }
        this.countryCode_ = nullableString;
    }

    public void mergeDeviceApi(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.deviceApi_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.deviceApi_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableUInt32);
            this.deviceApi_ = newBuilder.b();
        } else {
            this.deviceApi_ = nullableUInt32;
        }
        this.bitField0_ |= 1;
    }

    public void mergeDeviceHeight(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.deviceHeight_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.deviceHeight_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableUInt32);
            this.deviceHeight_ = newBuilder.b();
            return;
        }
        this.deviceHeight_ = nullableUInt32;
    }

    public void mergeDeviceLanguage(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.deviceLanguage_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.deviceLanguage_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.deviceLanguage_ = newBuilder.b();
            return;
        }
        this.deviceLanguage_ = nullableString;
    }

    public void mergeDeviceModel(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.deviceModel_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.deviceModel_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.deviceModel_ = newBuilder.b();
            return;
        }
        this.deviceModel_ = nullableString;
    }

    public void mergeDeviceOS(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.deviceOS_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.deviceOS_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.deviceOS_ = newBuilder.b();
            return;
        }
        this.deviceOS_ = nullableString;
    }

    public void mergeDeviceWidth(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.deviceWidth_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.deviceWidth_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableUInt32);
            this.deviceWidth_ = newBuilder.b();
            return;
        }
        this.deviceWidth_ = nullableUInt32;
    }

    public void mergeDndMode(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.dndMode_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.dndMode_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableBool);
            this.dndMode_ = newBuilder.b();
        } else {
            this.dndMode_ = nullableBool;
        }
        this.bitField0_ |= 1024;
    }

    public void mergeFreeSpace(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.freeSpace_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.freeSpace_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableUInt32);
            this.freeSpace_ = newBuilder.b();
            return;
        }
        this.freeSpace_ = nullableUInt32;
    }

    public void mergeGdprConsent(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.gdprConsent_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.gdprConsent_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableBool);
            this.gdprConsent_ = newBuilder.b();
            return;
        }
        this.gdprConsent_ = nullableBool;
    }

    public void mergeGdprString(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.gdprString_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.gdprString_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.gdprString_ = newBuilder.b();
            return;
        }
        this.gdprString_ = nullableString;
    }

    public void mergeHeadsetPlugged(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.headsetPlugged_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.headsetPlugged_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableBool);
            this.headsetPlugged_ = newBuilder.b();
        } else {
            this.headsetPlugged_ = nullableBool;
        }
        this.bitField0_ |= 64;
    }

    public void mergeHorAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.horAccuracy_;
        if (nullableFloat2 != null && nullableFloat2 != NullableFloat.getDefaultInstance()) {
            NullableFloat.a newBuilder = NullableFloat.newBuilder(this.horAccuracy_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableFloat);
            this.horAccuracy_ = newBuilder.b();
            return;
        }
        this.horAccuracy_ = nullableFloat;
    }

    public void mergeIdfa(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.idfa_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.idfa_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.idfa_ = newBuilder.b();
        } else {
            this.idfa_ = nullableString;
        }
        this.bitField0_ |= 4;
    }

    public void mergeIdfv(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.idfv_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.idfv_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.idfv_ = newBuilder.b();
        } else {
            this.idfv_ = nullableString;
        }
        this.bitField0_ |= 8;
    }

    public void mergeIgnitePackageName(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.ignitePackageName_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.ignitePackageName_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.ignitePackageName_ = newBuilder.b();
        } else {
            this.ignitePackageName_ = nullableString;
        }
        this.bitField0_ |= 262144;
    }

    public void mergeIgniteVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.igniteVersion_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.igniteVersion_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.igniteVersion_ = newBuilder.b();
        } else {
            this.igniteVersion_ = nullableString;
        }
        this.bitField0_ |= 131072;
    }

    public void mergeInputLanguages(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.inputLanguages_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.inputLanguages_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.inputLanguages_ = newBuilder.b();
            return;
        }
        this.inputLanguages_ = nullableString;
    }

    public void mergeIsRingMuted(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.isRingMuted_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.isRingMuted_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableBool);
            this.isRingMuted_ = newBuilder.b();
        } else {
            this.isRingMuted_ = nullableBool;
        }
        this.bitField0_ |= 2048;
    }

    public void mergeKeywords(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.keywords_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.keywords_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.keywords_ = newBuilder.b();
            return;
        }
        this.keywords_ = nullableString;
    }

    public void mergeLatitude(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.latitude_;
        if (nullableFloat2 != null && nullableFloat2 != NullableFloat.getDefaultInstance()) {
            NullableFloat.a newBuilder = NullableFloat.newBuilder(this.latitude_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableFloat);
            this.latitude_ = newBuilder.b();
            return;
        }
        this.latitude_ = nullableFloat;
    }

    public void mergeLgpdConsent(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.lgpdConsent_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.lgpdConsent_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableBool);
            this.lgpdConsent_ = newBuilder.b();
            return;
        }
        this.lgpdConsent_ = nullableBool;
    }

    public void mergeLongitude(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.longitude_;
        if (nullableFloat2 != null && nullableFloat2 != NullableFloat.getDefaultInstance()) {
            NullableFloat.a newBuilder = NullableFloat.newBuilder(this.longitude_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableFloat);
            this.longitude_ = newBuilder.b();
            return;
        }
        this.longitude_ = nullableFloat;
    }

    public void mergeLowPowerMode(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.lowPowerMode_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.lowPowerMode_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableBool);
            this.lowPowerMode_ = newBuilder.b();
        } else {
            this.lowPowerMode_ = nullableBool;
        }
        this.bitField0_ |= 256;
    }

    public void mergeMediationType(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.mediationType_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.mediationType_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.mediationType_ = newBuilder.b();
            return;
        }
        this.mediationType_ = nullableString;
    }

    public void mergeMobileCountryCode(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.mobileCountryCode_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.mobileCountryCode_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.mobileCountryCode_ = newBuilder.b();
            return;
        }
        this.mobileCountryCode_ = nullableString;
    }

    public void mergeMobileNetworkCode(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.mobileNetworkCode_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.mobileNetworkCode_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.mobileNetworkCode_ = newBuilder.b();
            return;
        }
        this.mobileNetworkCode_ = nullableString;
    }

    public void mergeMockResponseId(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.mockResponseId_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.mockResponseId_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.mockResponseId_ = newBuilder.b();
        } else {
            this.mockResponseId_ = nullableString;
        }
        this.bitField0_ |= 65536;
    }

    public void mergeNetwork(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.network_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.network_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.network_ = newBuilder.b();
            return;
        }
        this.network_ = nullableString;
    }

    public void mergeOffsetFromGMT(NullableSInt32 nullableSInt32) {
        nullableSInt32.getClass();
        NullableSInt32 nullableSInt322 = this.offsetFromGMT_;
        if (nullableSInt322 != null && nullableSInt322 != NullableSInt32.getDefaultInstance()) {
            NullableSInt32.a newBuilder = NullableSInt32.newBuilder(this.offsetFromGMT_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableSInt32);
            this.offsetFromGMT_ = newBuilder.b();
            return;
        }
        this.offsetFromGMT_ = nullableSInt32;
    }

    public void mergeOsVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.osVersion_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.osVersion_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.osVersion_ = newBuilder.b();
            return;
        }
        this.osVersion_ = nullableString;
    }

    public void mergePortal(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.portal_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.portal_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableUInt32);
            this.portal_ = newBuilder.b();
        } else {
            this.portal_ = nullableUInt32;
        }
        this.bitField0_ |= 32768;
    }

    public void mergePriorSkip(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.priorSkip_;
        if (nullableBool2 != null && nullableBool2 != NullableBool.getDefaultInstance()) {
            NullableBool.a newBuilder = NullableBool.newBuilder(this.priorSkip_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableBool);
            this.priorSkip_ = newBuilder.b();
            return;
        }
        this.priorSkip_ = nullableBool;
    }

    public void mergePxRatio(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.pxRatio_;
        if (nullableFloat2 != null && nullableFloat2 != NullableFloat.getDefaultInstance()) {
            NullableFloat.a newBuilder = NullableFloat.newBuilder(this.pxRatio_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableFloat);
            this.pxRatio_ = newBuilder.b();
        } else {
            this.pxRatio_ = nullableFloat;
        }
        this.bitField0_ |= 2;
    }

    public void mergeSdkVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.sdkVersion_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.sdkVersion_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.sdkVersion_ = newBuilder.b();
            return;
        }
        this.sdkVersion_ = nullableString;
    }

    public void mergeSessionDuration(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.sessionDuration_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.sessionDuration_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableUInt32);
            this.sessionDuration_ = newBuilder.b();
            return;
        }
        this.sessionDuration_ = nullableUInt32;
    }

    public void mergeTimeAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.timeAccuracy_;
        if (nullableFloat2 != null && nullableFloat2 != NullableFloat.getDefaultInstance()) {
            NullableFloat.a newBuilder = NullableFloat.newBuilder(this.timeAccuracy_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableFloat);
            this.timeAccuracy_ = newBuilder.b();
            return;
        }
        this.timeAccuracy_ = nullableFloat;
    }

    public void mergeTotalSpace(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.totalSpace_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.totalSpace_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableUInt32);
            this.totalSpace_ = newBuilder.b();
            return;
        }
        this.totalSpace_ = nullableUInt32;
    }

    public void mergeTrackingStatus(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.trackingStatus_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.trackingStatus_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableUInt32);
            this.trackingStatus_ = newBuilder.b();
        } else {
            this.trackingStatus_ = nullableUInt32;
        }
        this.bitField0_ |= 32;
    }

    public void mergeUserAge(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.userAge_;
        if (nullableUInt322 != null && nullableUInt322 != NullableUInt32.getDefaultInstance()) {
            NullableUInt32.a newBuilder = NullableUInt32.newBuilder(this.userAge_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableUInt32);
            this.userAge_ = newBuilder.b();
            return;
        }
        this.userAge_ = nullableUInt32;
    }

    public void mergeUserAgent(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.userAgent_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.userAgent_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.userAgent_ = newBuilder.b();
            return;
        }
        this.userAgent_ = nullableString;
    }

    public void mergeUserID(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.userID_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.userID_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.userID_ = newBuilder.b();
            return;
        }
        this.userID_ = nullableString;
    }

    public void mergeVerAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.verAccuracy_;
        if (nullableFloat2 != null && nullableFloat2 != NullableFloat.getDefaultInstance()) {
            NullableFloat.a newBuilder = NullableFloat.newBuilder(this.verAccuracy_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableFloat);
            this.verAccuracy_ = newBuilder.b();
            return;
        }
        this.verAccuracy_ = nullableFloat;
    }

    public void mergeVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.version_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.version_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.version_ = newBuilder.b();
            return;
        }
        this.version_ = nullableString;
    }

    public void mergeZipCode(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.zipCode_;
        if (nullableString2 != null && nullableString2 != NullableString.getDefaultInstance()) {
            NullableString.a newBuilder = NullableString.newBuilder(this.zipCode_);
            newBuilder.c();
            newBuilder.a(newBuilder.b, nullableString);
            this.zipCode_ = newBuilder.b();
            return;
        }
        this.zipCode_ = nullableString;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TokenParametersOuterClass$TokenParameters parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(ByteBuffer byteBuffer) throws z {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w0<TokenParametersOuterClass$TokenParameters> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeAbExperiments(int i2) {
        ensureAbExperimentsIsMutable();
        this.abExperiments_.remove(i2);
    }

    public void removeLastAdomains(int i2) {
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.remove(i2);
    }

    public void removeLastAdvertisedBundles(int i2) {
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.remove(i2);
    }

    public void removePriorClickTypes(int i2) {
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.remove(i2);
    }

    public void removeUserSessions(int i2) {
        ensureUserSessionsIsMutable();
        this.userSessions_.remove(i2);
    }

    public void setAaid(NullableString nullableString) {
        nullableString.getClass();
        this.aaid_ = nullableString;
        this.bitField0_ |= 8192;
    }

    public void setAbExperiments(int i2, Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.set(i2, experiment);
    }

    public void setAirplaneMode(NullableBool nullableBool) {
        nullableBool.getClass();
        this.airplaneMode_ = nullableBool;
        this.bitField0_ |= 512;
    }

    public void setAmazonId(NullableString nullableString) {
        nullableString.getClass();
        this.amazonId_ = nullableString;
        this.bitField0_ |= 4096;
    }

    public void setAppBuildVersion(NullableString nullableString) {
        nullableString.getClass();
        this.appBuildVersion_ = nullableString;
        this.bitField0_ |= 16384;
    }

    public void setAppVersion(NullableString nullableString) {
        nullableString.getClass();
        this.appVersion_ = nullableString;
    }

    public void setBatteryCharging(NullableBool nullableBool) {
        nullableBool.getClass();
        this.batteryCharging_ = nullableBool;
    }

    public void setBatteryLevel(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.batteryLevel_ = nullableUInt32;
    }

    public void setBluetoothPlugged(NullableBool nullableBool) {
        nullableBool.getClass();
        this.bluetoothPlugged_ = nullableBool;
        this.bitField0_ |= 128;
    }

    public void setBundleID(NullableString nullableString) {
        nullableString.getClass();
        this.bundleID_ = nullableString;
    }

    public void setCarrierName(NullableString nullableString) {
        nullableString.getClass();
        this.carrierName_ = nullableString;
    }

    public void setCcpaString(NullableString nullableString) {
        nullableString.getClass();
        this.ccpaString_ = nullableString;
    }

    public void setChildMode(NullableBool nullableBool) {
        nullableBool.getClass();
        this.childMode_ = nullableBool;
        this.bitField0_ |= 524288;
    }

    public void setCoppaApplies(NullableBool nullableBool) {
        nullableBool.getClass();
        this.coppaApplies_ = nullableBool;
        this.bitField0_ |= 1048576;
    }

    public void setCountryCode(NullableString nullableString) {
        nullableString.getClass();
        this.countryCode_ = nullableString;
    }

    public void setDarkMode(boolean z) {
        this.darkMode_ = z;
    }

    public void setDeviceApi(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.deviceApi_ = nullableUInt32;
        this.bitField0_ |= 1;
    }

    public void setDeviceHeight(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.deviceHeight_ = nullableUInt32;
    }

    public void setDeviceLanguage(NullableString nullableString) {
        nullableString.getClass();
        this.deviceLanguage_ = nullableString;
    }

    public void setDeviceModel(NullableString nullableString) {
        nullableString.getClass();
        this.deviceModel_ = nullableString;
    }

    public void setDeviceOS(NullableString nullableString) {
        nullableString.getClass();
        this.deviceOS_ = nullableString;
    }

    public void setDeviceWidth(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.deviceWidth_ = nullableUInt32;
    }

    public void setDndMode(NullableBool nullableBool) {
        nullableBool.getClass();
        this.dndMode_ = nullableBool;
        this.bitField0_ |= 1024;
    }

    public void setDnt(boolean z) {
        this.bitField0_ |= 16;
        this.dnt_ = z;
    }

    public void setFrameworkName(d dVar) {
        this.frameworkName_ = dVar.a();
    }

    public void setFrameworkNameValue(int i2) {
        this.frameworkName_ = i2;
    }

    public void setFreeSpace(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.freeSpace_ = nullableUInt32;
    }

    public void setGdprConsent(NullableBool nullableBool) {
        nullableBool.getClass();
        this.gdprConsent_ = nullableBool;
    }

    public void setGdprString(NullableString nullableString) {
        nullableString.getClass();
        this.gdprString_ = nullableString;
    }

    public void setHeadsetPlugged(NullableBool nullableBool) {
        nullableBool.getClass();
        this.headsetPlugged_ = nullableBool;
        this.bitField0_ |= 64;
    }

    public void setHorAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.horAccuracy_ = nullableFloat;
    }

    public void setIdfa(NullableString nullableString) {
        nullableString.getClass();
        this.idfa_ = nullableString;
        this.bitField0_ |= 4;
    }

    public void setIdfv(NullableString nullableString) {
        nullableString.getClass();
        this.idfv_ = nullableString;
        this.bitField0_ |= 8;
    }

    public void setIgnitePackageName(NullableString nullableString) {
        nullableString.getClass();
        this.ignitePackageName_ = nullableString;
        this.bitField0_ |= 262144;
    }

    public void setIgniteVersion(NullableString nullableString) {
        nullableString.getClass();
        this.igniteVersion_ = nullableString;
        this.bitField0_ |= 131072;
    }

    public void setInputLanguages(NullableString nullableString) {
        nullableString.getClass();
        this.inputLanguages_ = nullableString;
    }

    public void setIsRingMuted(NullableBool nullableBool) {
        nullableBool.getClass();
        this.isRingMuted_ = nullableBool;
        this.bitField0_ |= 2048;
    }

    public void setKeywords(NullableString nullableString) {
        nullableString.getClass();
        this.keywords_ = nullableString;
    }

    public void setLastAdomains(int i2, LastAdomain lastAdomain) {
        lastAdomain.getClass();
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.set(i2, lastAdomain);
    }

    public void setLastAdvertisedBundles(int i2, LastAdvertisedBundle lastAdvertisedBundle) {
        lastAdvertisedBundle.getClass();
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.set(i2, lastAdvertisedBundle);
    }

    public void setLatitude(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.latitude_ = nullableFloat;
    }

    public void setLgpdConsent(NullableBool nullableBool) {
        nullableBool.getClass();
        this.lgpdConsent_ = nullableBool;
    }

    public void setLongitude(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.longitude_ = nullableFloat;
    }

    public void setLowPowerMode(NullableBool nullableBool) {
        nullableBool.getClass();
        this.lowPowerMode_ = nullableBool;
        this.bitField0_ |= 256;
    }

    public void setMediationType(NullableString nullableString) {
        nullableString.getClass();
        this.mediationType_ = nullableString;
    }

    public void setMobileCountryCode(NullableString nullableString) {
        nullableString.getClass();
        this.mobileCountryCode_ = nullableString;
    }

    public void setMobileNetworkCode(NullableString nullableString) {
        nullableString.getClass();
        this.mobileNetworkCode_ = nullableString;
    }

    public void setMockResponseId(NullableString nullableString) {
        nullableString.getClass();
        this.mockResponseId_ = nullableString;
        this.bitField0_ |= 65536;
    }

    public void setMuteAudio(boolean z) {
        this.muteAudio_ = z;
    }

    public void setNetwork(NullableString nullableString) {
        nullableString.getClass();
        this.network_ = nullableString;
    }

    public void setOffsetFromGMT(NullableSInt32 nullableSInt32) {
        nullableSInt32.getClass();
        this.offsetFromGMT_ = nullableSInt32;
    }

    public void setOsVersion(NullableString nullableString) {
        nullableString.getClass();
        this.osVersion_ = nullableString;
    }

    public void setPortal(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.portal_ = nullableUInt32;
        this.bitField0_ |= 32768;
    }

    public void setPriorClickTypes(int i2, PriorVideoClickType priorVideoClickType) {
        priorVideoClickType.getClass();
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.set(i2, priorVideoClickType);
    }

    public void setPriorClicks(int i2, k kVar) {
        kVar.getClass();
        ensurePriorClicksIsMutable();
        y.g gVar = this.priorClicks_;
        int a2 = kVar.a();
        x xVar = (x) gVar;
        xVar.e();
        xVar.d(i2);
        int[] iArr = xVar.b;
        int i3 = iArr[i2];
        iArr[i2] = a2;
    }

    public void setPriorClicksValue(int i2, int i3) {
        ensurePriorClicksIsMutable();
        x xVar = (x) this.priorClicks_;
        xVar.e();
        xVar.d(i2);
        int[] iArr = xVar.b;
        int i4 = iArr[i2];
        iArr[i2] = i3;
    }

    public void setPriorSkip(NullableBool nullableBool) {
        nullableBool.getClass();
        this.priorSkip_ = nullableBool;
    }

    public void setPxRatio(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.pxRatio_ = nullableFloat;
        this.bitField0_ |= 2;
    }

    public void setSdkVersion(NullableString nullableString) {
        nullableString.getClass();
        this.sdkVersion_ = nullableString;
    }

    public void setSecureContent(h hVar) {
        this.secureContent_ = hVar.a();
    }

    public void setSecureContentValue(int i2) {
        this.secureContent_ = i2;
    }

    public void setSessionDuration(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.sessionDuration_ = nullableUInt32;
    }

    public void setTimeAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.timeAccuracy_ = nullableFloat;
    }

    public void setTotalSpace(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.totalSpace_ = nullableUInt32;
    }

    public void setTrackingStatus(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.trackingStatus_ = nullableUInt32;
        this.bitField0_ |= 32;
    }

    public void setUserAge(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.userAge_ = nullableUInt32;
    }

    public void setUserAgent(NullableString nullableString) {
        nullableString.getClass();
        this.userAgent_ = nullableString;
    }

    public void setUserGender(l lVar) {
        this.userGender_ = lVar.a();
    }

    public void setUserGenderValue(int i2) {
        this.userGender_ = i2;
    }

    public void setUserID(NullableString nullableString) {
        nullableString.getClass();
        this.userID_ = nullableString;
    }

    public void setUserSessions(int i2, UserSession userSession) {
        userSession.getClass();
        ensureUserSessionsIsMutable();
        this.userSessions_.set(i2, userSession);
    }

    public void setVerAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.verAccuracy_ = nullableFloat;
    }

    public void setVersion(NullableString nullableString) {
        nullableString.getClass();
        this.version_ = nullableString;
    }

    public void setZipCode(NullableString nullableString) {
        nullableString.getClass();
        this.zipCode_ = nullableString;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (com.fyber.inneractive.sdk.bidder.g.a[fVar.ordinal()]) {
            case 1:
                return new TokenParametersOuterClass$TokenParameters();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000F\u0000\u0001\u0001FF\u0000\u0006\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\bဉ\u0000\t\t\n\t\u000bဉ\u0001\f\t\r\t\u000e\t\u000f\f\u0010\t\u0011\t\u0012\t\u0013\t\u0014\t\u0015\t\u0016ဉ\u0002\u0017ဉ\u0003\u0018ဇ\u0004\u0019\t\u001a\t\u001b\t\u001c\t\u001dဉ\u0005\u001e\t\u001f\t \u0007!\t\"\f#\t$\t%\t&\t'\t(\t)\t*\f+\t,\t-ဉ\u0006.ဉ\u0007/\t0ဉ\b1\u00072ဉ\t3ဉ\n4ဉ\u000b5ဉ\f6ဉ\r7ဉ\u000e8\t9\u001b:\u001b;,<\t=\u001b>\u001b?\u001b@ဉ\u000fAဉ\u0010B\tCဉ\u0011Dဉ\u0012Eဉ\u0013Fဉ\u0014", new Object[]{"bitField0_", "version_", "userAgent_", "sdkVersion_", "bundleID_", "deviceModel_", "appVersion_", "deviceOS_", "deviceApi_", "osVersion_", "deviceLanguage_", "pxRatio_", "deviceWidth_", "deviceHeight_", "mediationType_", "frameworkName_", "totalSpace_", "countryCode_", "carrierName_", "mobileCountryCode_", "mobileNetworkCode_", "inputLanguages_", "idfa_", "idfv_", "dnt_", "gdprConsent_", "gdprString_", "ccpaString_", "offsetFromGMT_", "trackingStatus_", "userID_", "network_", "muteAudio_", "userAge_", "userGender_", "zipCode_", "keywords_", "latitude_", "longitude_", "horAccuracy_", "verAccuracy_", "timeAccuracy_", "secureContent_", "batteryCharging_", "batteryLevel_", "headsetPlugged_", "bluetoothPlugged_", "freeSpace_", "lowPowerMode_", "darkMode_", "airplaneMode_", "dndMode_", "isRingMuted_", "amazonId_", "aaid_", "appBuildVersion_", "sessionDuration_", "lastAdomains_", LastAdomain.class, "lastAdvertisedBundles_", LastAdvertisedBundle.class, "priorClicks_", "priorSkip_", "priorClickTypes_", PriorVideoClickType.class, "userSessions_", UserSession.class, "abExperiments_", Experiment.class, "portal_", "mockResponseId_", "lgpdConsent_", "igniteVersion_", "ignitePackageName_", "childMode_", "coppaApplies_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                w0<TokenParametersOuterClass$TokenParameters> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (TokenParametersOuterClass$TokenParameters.class) {
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

    public NullableString getAaid() {
        NullableString nullableString = this.aaid_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public Experiment getAbExperiments(int i2) {
        return this.abExperiments_.get(i2);
    }

    public int getAbExperimentsCount() {
        return this.abExperiments_.size();
    }

    public List<Experiment> getAbExperimentsList() {
        return this.abExperiments_;
    }

    public c getAbExperimentsOrBuilder(int i2) {
        return this.abExperiments_.get(i2);
    }

    public List<? extends c> getAbExperimentsOrBuilderList() {
        return this.abExperiments_;
    }

    public NullableBool getAirplaneMode() {
        NullableBool nullableBool = this.airplaneMode_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getAmazonId() {
        NullableString nullableString = this.amazonId_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getAppBuildVersion() {
        NullableString nullableString = this.appBuildVersion_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getAppVersion() {
        NullableString nullableString = this.appVersion_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableBool getBatteryCharging() {
        NullableBool nullableBool = this.batteryCharging_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableUInt32 getBatteryLevel() {
        NullableUInt32 nullableUInt32 = this.batteryLevel_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableBool getBluetoothPlugged() {
        NullableBool nullableBool = this.bluetoothPlugged_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getBundleID() {
        NullableString nullableString = this.bundleID_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getCarrierName() {
        NullableString nullableString = this.carrierName_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getCcpaString() {
        NullableString nullableString = this.ccpaString_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableBool getChildMode() {
        NullableBool nullableBool = this.childMode_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableBool getCoppaApplies() {
        NullableBool nullableBool = this.coppaApplies_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getCountryCode() {
        NullableString nullableString = this.countryCode_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public boolean getDarkMode() {
        return this.darkMode_;
    }

    public NullableUInt32 getDeviceApi() {
        NullableUInt32 nullableUInt32 = this.deviceApi_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableUInt32 getDeviceHeight() {
        NullableUInt32 nullableUInt32 = this.deviceHeight_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableString getDeviceLanguage() {
        NullableString nullableString = this.deviceLanguage_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getDeviceModel() {
        NullableString nullableString = this.deviceModel_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getDeviceOS() {
        NullableString nullableString = this.deviceOS_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableUInt32 getDeviceWidth() {
        NullableUInt32 nullableUInt32 = this.deviceWidth_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableBool getDndMode() {
        NullableBool nullableBool = this.dndMode_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public boolean getDnt() {
        return this.dnt_;
    }

    public d getFrameworkName() {
        d dVar;
        int i2 = this.frameworkName_;
        if (i2 != 0) {
            dVar = i2 != 1 ? null : d.UNITY3D;
        } else {
            dVar = d.NATIVE;
        }
        return dVar == null ? d.UNRECOGNIZED : dVar;
    }

    public int getFrameworkNameValue() {
        return this.frameworkName_;
    }

    public NullableUInt32 getFreeSpace() {
        NullableUInt32 nullableUInt32 = this.freeSpace_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableBool getGdprConsent() {
        NullableBool nullableBool = this.gdprConsent_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getGdprString() {
        NullableString nullableString = this.gdprString_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableBool getHeadsetPlugged() {
        NullableBool nullableBool = this.headsetPlugged_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableFloat getHorAccuracy() {
        NullableFloat nullableFloat = this.horAccuracy_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableString getIdfa() {
        NullableString nullableString = this.idfa_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getIdfv() {
        NullableString nullableString = this.idfv_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getIgnitePackageName() {
        NullableString nullableString = this.ignitePackageName_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getIgniteVersion() {
        NullableString nullableString = this.igniteVersion_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getInputLanguages() {
        NullableString nullableString = this.inputLanguages_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableBool getIsRingMuted() {
        NullableBool nullableBool = this.isRingMuted_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getKeywords() {
        NullableString nullableString = this.keywords_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public LastAdomain getLastAdomains(int i2) {
        return this.lastAdomains_.get(i2);
    }

    public int getLastAdomainsCount() {
        return this.lastAdomains_.size();
    }

    public List<LastAdomain> getLastAdomainsList() {
        return this.lastAdomains_;
    }

    public e getLastAdomainsOrBuilder(int i2) {
        return this.lastAdomains_.get(i2);
    }

    public List<? extends e> getLastAdomainsOrBuilderList() {
        return this.lastAdomains_;
    }

    public LastAdvertisedBundle getLastAdvertisedBundles(int i2) {
        return this.lastAdvertisedBundles_.get(i2);
    }

    public int getLastAdvertisedBundlesCount() {
        return this.lastAdvertisedBundles_.size();
    }

    public List<LastAdvertisedBundle> getLastAdvertisedBundlesList() {
        return this.lastAdvertisedBundles_;
    }

    public f getLastAdvertisedBundlesOrBuilder(int i2) {
        return this.lastAdvertisedBundles_.get(i2);
    }

    public List<? extends f> getLastAdvertisedBundlesOrBuilderList() {
        return this.lastAdvertisedBundles_;
    }

    public NullableFloat getLatitude() {
        NullableFloat nullableFloat = this.latitude_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableBool getLgpdConsent() {
        NullableBool nullableBool = this.lgpdConsent_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableFloat getLongitude() {
        NullableFloat nullableFloat = this.longitude_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableBool getLowPowerMode() {
        NullableBool nullableBool = this.lowPowerMode_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getMediationType() {
        NullableString nullableString = this.mediationType_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getMobileCountryCode() {
        NullableString nullableString = this.mobileCountryCode_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getMobileNetworkCode() {
        NullableString nullableString = this.mobileNetworkCode_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getMockResponseId() {
        NullableString nullableString = this.mockResponseId_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public boolean getMuteAudio() {
        return this.muteAudio_;
    }

    public NullableString getNetwork() {
        NullableString nullableString = this.network_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableSInt32 getOffsetFromGMT() {
        NullableSInt32 nullableSInt32 = this.offsetFromGMT_;
        return nullableSInt32 == null ? NullableSInt32.getDefaultInstance() : nullableSInt32;
    }

    public NullableString getOsVersion() {
        NullableString nullableString = this.osVersion_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableUInt32 getPortal() {
        NullableUInt32 nullableUInt32 = this.portal_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public PriorVideoClickType getPriorClickTypes(int i2) {
        return this.priorClickTypes_.get(i2);
    }

    public int getPriorClickTypesCount() {
        return this.priorClickTypes_.size();
    }

    public List<PriorVideoClickType> getPriorClickTypesList() {
        return this.priorClickTypes_;
    }

    public g getPriorClickTypesOrBuilder(int i2) {
        return this.priorClickTypes_.get(i2);
    }

    public List<? extends g> getPriorClickTypesOrBuilderList() {
        return this.priorClickTypes_;
    }

    public k getPriorClicks(int i2) {
        y.h.a<Integer, k> aVar = priorClicks_converter_;
        x xVar = (x) this.priorClicks_;
        xVar.d(i2);
        Integer valueOf = Integer.valueOf(xVar.b[i2]);
        ((a) aVar).getClass();
        k a2 = k.a(valueOf.intValue());
        return a2 == null ? k.UNRECOGNIZED : a2;
    }

    public int getPriorClicksCount() {
        return ((x) this.priorClicks_).size();
    }

    public List<k> getPriorClicksList() {
        return new y.h(this.priorClicks_, priorClicks_converter_);
    }

    public int getPriorClicksValue(int i2) {
        x xVar = (x) this.priorClicks_;
        xVar.d(i2);
        return xVar.b[i2];
    }

    public List<Integer> getPriorClicksValueList() {
        return this.priorClicks_;
    }

    public NullableBool getPriorSkip() {
        NullableBool nullableBool = this.priorSkip_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableFloat getPxRatio() {
        NullableFloat nullableFloat = this.pxRatio_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableString getSdkVersion() {
        NullableString nullableString = this.sdkVersion_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public h getSecureContent() {
        h a2 = h.a(this.secureContent_);
        return a2 == null ? h.UNRECOGNIZED : a2;
    }

    public int getSecureContentValue() {
        return this.secureContent_;
    }

    public NullableUInt32 getSessionDuration() {
        NullableUInt32 nullableUInt32 = this.sessionDuration_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableFloat getTimeAccuracy() {
        NullableFloat nullableFloat = this.timeAccuracy_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableUInt32 getTotalSpace() {
        NullableUInt32 nullableUInt32 = this.totalSpace_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableUInt32 getTrackingStatus() {
        NullableUInt32 nullableUInt32 = this.trackingStatus_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableUInt32 getUserAge() {
        NullableUInt32 nullableUInt32 = this.userAge_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableString getUserAgent() {
        NullableString nullableString = this.userAgent_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public l getUserGender() {
        l a2 = l.a(this.userGender_);
        return a2 == null ? l.UNRECOGNIZED : a2;
    }

    public int getUserGenderValue() {
        return this.userGender_;
    }

    public NullableString getUserID() {
        NullableString nullableString = this.userID_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public UserSession getUserSessions(int i2) {
        return this.userSessions_.get(i2);
    }

    public int getUserSessionsCount() {
        return this.userSessions_.size();
    }

    public List<UserSession> getUserSessionsList() {
        return this.userSessions_;
    }

    public m getUserSessionsOrBuilder(int i2) {
        return this.userSessions_.get(i2);
    }

    public List<? extends m> getUserSessionsOrBuilderList() {
        return this.userSessions_;
    }

    public NullableFloat getVerAccuracy() {
        NullableFloat nullableFloat = this.verAccuracy_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableString getVersion() {
        NullableString nullableString = this.version_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getZipCode() {
        NullableString nullableString = this.zipCode_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public boolean hasAaid() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasAirplaneMode() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasAmazonId() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasAppBuildVersion() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasAppVersion() {
        return this.appVersion_ != null;
    }

    public boolean hasBatteryCharging() {
        return this.batteryCharging_ != null;
    }

    public boolean hasBatteryLevel() {
        return this.batteryLevel_ != null;
    }

    public boolean hasBluetoothPlugged() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasBundleID() {
        return this.bundleID_ != null;
    }

    public boolean hasCarrierName() {
        return this.carrierName_ != null;
    }

    public boolean hasCcpaString() {
        return this.ccpaString_ != null;
    }

    public boolean hasChildMode() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasCoppaApplies() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasCountryCode() {
        return this.countryCode_ != null;
    }

    public boolean hasDeviceApi() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDeviceHeight() {
        return this.deviceHeight_ != null;
    }

    public boolean hasDeviceLanguage() {
        return this.deviceLanguage_ != null;
    }

    public boolean hasDeviceModel() {
        return this.deviceModel_ != null;
    }

    public boolean hasDeviceOS() {
        return this.deviceOS_ != null;
    }

    public boolean hasDeviceWidth() {
        return this.deviceWidth_ != null;
    }

    public boolean hasDndMode() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasDnt() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasFreeSpace() {
        return this.freeSpace_ != null;
    }

    public boolean hasGdprConsent() {
        return this.gdprConsent_ != null;
    }

    public boolean hasGdprString() {
        return this.gdprString_ != null;
    }

    public boolean hasHeadsetPlugged() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasHorAccuracy() {
        return this.horAccuracy_ != null;
    }

    public boolean hasIdfa() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIdfv() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIgnitePackageName() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasIgniteVersion() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasInputLanguages() {
        return this.inputLanguages_ != null;
    }

    public boolean hasIsRingMuted() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasKeywords() {
        return this.keywords_ != null;
    }

    public boolean hasLatitude() {
        return this.latitude_ != null;
    }

    public boolean hasLgpdConsent() {
        return this.lgpdConsent_ != null;
    }

    public boolean hasLongitude() {
        return this.longitude_ != null;
    }

    public boolean hasLowPowerMode() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasMediationType() {
        return this.mediationType_ != null;
    }

    public boolean hasMobileCountryCode() {
        return this.mobileCountryCode_ != null;
    }

    public boolean hasMobileNetworkCode() {
        return this.mobileNetworkCode_ != null;
    }

    public boolean hasMockResponseId() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasNetwork() {
        return this.network_ != null;
    }

    public boolean hasOffsetFromGMT() {
        return this.offsetFromGMT_ != null;
    }

    public boolean hasOsVersion() {
        return this.osVersion_ != null;
    }

    public boolean hasPortal() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasPriorSkip() {
        return this.priorSkip_ != null;
    }

    public boolean hasPxRatio() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSdkVersion() {
        return this.sdkVersion_ != null;
    }

    public boolean hasSessionDuration() {
        return this.sessionDuration_ != null;
    }

    public boolean hasTimeAccuracy() {
        return this.timeAccuracy_ != null;
    }

    public boolean hasTotalSpace() {
        return this.totalSpace_ != null;
    }

    public boolean hasTrackingStatus() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasUserAge() {
        return this.userAge_ != null;
    }

    public boolean hasUserAgent() {
        return this.userAgent_ != null;
    }

    public boolean hasUserID() {
        return this.userID_ != null;
    }

    public boolean hasVerAccuracy() {
        return this.verAccuracy_ != null;
    }

    public boolean hasVersion() {
        return this.version_ != null;
    }

    public boolean hasZipCode() {
        return this.zipCode_ != null;
    }

    public static b newBuilder(TokenParametersOuterClass$TokenParameters tokenParametersOuterClass$TokenParameters) {
        return DEFAULT_INSTANCE.createBuilder(tokenParametersOuterClass$TokenParameters);
    }

    public static TokenParametersOuterClass$TokenParameters parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(ByteBuffer byteBuffer, q qVar) throws z {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar) throws z {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
    }

    public void addAbExperiments(int i2, Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.add(i2, experiment);
    }

    public void addLastAdomains(int i2, LastAdomain lastAdomain) {
        lastAdomain.getClass();
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.add(i2, lastAdomain);
    }

    public void addLastAdvertisedBundles(int i2, LastAdvertisedBundle lastAdvertisedBundle) {
        lastAdvertisedBundle.getClass();
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.add(i2, lastAdvertisedBundle);
    }

    public void addPriorClickTypes(int i2, PriorVideoClickType priorVideoClickType) {
        priorVideoClickType.getClass();
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.add(i2, priorVideoClickType);
    }

    public void addUserSessions(int i2, UserSession userSession) {
        userSession.getClass();
        ensureUserSessionsIsMutable();
        this.userSessions_.add(i2, userSession);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(com.fyber.inneractive.sdk.protobuf.i iVar, q qVar) throws z {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(byte[] bArr) throws z {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* loaded from: classes.dex */
    public enum h implements y.c {
        UNSECURE(0),
        SECURE(1),
        PARTIALLYSECURE(2),
        UNRECOGNIZED(-1);
        
        public static final int PARTIALLYSECURE_VALUE = 2;
        public static final int SECURE_VALUE = 1;
        public static final int UNSECURE_VALUE = 0;
        private static final y.d<h> internalValueMap = new a();
        private final int value;

        /* loaded from: classes.dex */
        public class a implements y.d<h> {
            @Override // com.fyber.inneractive.sdk.protobuf.y.d
            public h a(int i) {
                return h.a(i);
            }
        }

        h(int i) {
            this.value = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.y.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static h a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return PARTIALLYSECURE;
                }
                return SECURE;
            }
            return UNSECURE;
        }
    }

    /* loaded from: classes.dex */
    public enum j implements y.c {
        UNITCONTENTTYPEUNKNOWN(0),
        DISPLAY(1),
        VIDEO(2),
        UNRECOGNIZED(-1);
        
        public static final int DISPLAY_VALUE = 1;
        public static final int UNITCONTENTTYPEUNKNOWN_VALUE = 0;
        public static final int VIDEO_VALUE = 2;
        private static final y.d<j> internalValueMap = new a();
        private final int value;

        /* loaded from: classes.dex */
        public class a implements y.d<j> {
            @Override // com.fyber.inneractive.sdk.protobuf.y.d
            public j a(int i) {
                return j.a(i);
            }
        }

        j(int i) {
            this.value = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.y.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static j a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return VIDEO;
                }
                return DISPLAY;
            }
            return UNITCONTENTTYPEUNKNOWN;
        }
    }

    /* loaded from: classes.dex */
    public enum k implements y.c {
        UNITDISPLAYTYPEUNKNOWN(0),
        BANNER(1),
        INTERSTITIAL(2),
        REWARDED(3),
        MRECT(4),
        UNRECOGNIZED(-1);
        
        public static final int BANNER_VALUE = 1;
        public static final int INTERSTITIAL_VALUE = 2;
        public static final int MRECT_VALUE = 4;
        public static final int REWARDED_VALUE = 3;
        public static final int UNITDISPLAYTYPEUNKNOWN_VALUE = 0;
        private static final y.d<k> internalValueMap = new a();
        private final int value;

        /* loaded from: classes.dex */
        public class a implements y.d<k> {
            @Override // com.fyber.inneractive.sdk.protobuf.y.d
            public k a(int i) {
                return k.a(i);
            }
        }

        k(int i) {
            this.value = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.y.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static k a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return null;
                            }
                            return MRECT;
                        }
                        return REWARDED;
                    }
                    return INTERSTITIAL;
                }
                return BANNER;
            }
            return UNITDISPLAYTYPEUNKNOWN;
        }
    }

    /* loaded from: classes.dex */
    public enum l implements y.c {
        UNKNOWN(0),
        MALE(1),
        FEMALE(2),
        OTHER(3),
        UNRECOGNIZED(-1);
        
        public static final int FEMALE_VALUE = 2;
        public static final int MALE_VALUE = 1;
        public static final int OTHER_VALUE = 3;
        public static final int UNKNOWN_VALUE = 0;
        private static final y.d<l> internalValueMap = new a();
        private final int value;

        /* loaded from: classes.dex */
        public class a implements y.d<l> {
            @Override // com.fyber.inneractive.sdk.protobuf.y.d
            public l a(int i) {
                return l.a(i);
            }
        }

        l(int i) {
            this.value = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.y.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static l a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return OTHER;
                    }
                    return FEMALE;
                }
                return MALE;
            }
            return UNKNOWN;
        }
    }

    /* loaded from: classes.dex */
    public enum n implements y.c {
        NOCLICK(0),
        CTABUTTON(1),
        COMPANION(2),
        VIDEOVIEW(3),
        UNRECOGNIZED(-1);
        
        public static final int COMPANION_VALUE = 2;
        public static final int CTABUTTON_VALUE = 1;
        public static final int NOCLICK_VALUE = 0;
        public static final int VIDEOVIEW_VALUE = 3;
        private static final y.d<n> internalValueMap = new a();
        private final int value;

        /* loaded from: classes.dex */
        public class a implements y.d<n> {
            @Override // com.fyber.inneractive.sdk.protobuf.y.d
            public n a(int i) {
                return n.a(i);
            }
        }

        n(int i) {
            this.value = i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.y.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static n a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return VIDEOVIEW;
                    }
                    return COMPANION;
                }
                return CTABUTTON;
            }
            return NOCLICK;
        }
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(byte[] bArr, q qVar) throws z {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(InputStream inputStream) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(InputStream inputStream, q qVar) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(com.fyber.inneractive.sdk.protobuf.j jVar, q qVar) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
    }
}
