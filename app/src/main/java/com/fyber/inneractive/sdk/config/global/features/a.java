package com.fyber.inneractive.sdk.config.global.features;

/* loaded from: classes.dex */
public class a extends h {
    public static final EnumC0009a e = EnumC0009a.NONE;

    /* renamed from: com.fyber.inneractive.sdk.config.global.features.a$a */
    /* loaded from: classes.dex */
    public enum EnumC0009a {
        NONE("none"),
        OPEN("open");
        
        public String mKey;

        EnumC0009a(String str) {
            this.mKey = str;
        }
    }

    public a() {
        super("ad_identifier");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.h
    public h b() {
        a aVar = new a();
        a(aVar);
        return aVar;
    }
}
