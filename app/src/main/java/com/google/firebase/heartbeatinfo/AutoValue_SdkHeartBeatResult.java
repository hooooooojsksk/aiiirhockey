package com.google.firebase.heartbeatinfo;

import java.util.Objects;

/* loaded from: classes2.dex */
final class AutoValue_SdkHeartBeatResult extends SdkHeartBeatResult {
    private final long millis;
    private final String sdkName;

    public AutoValue_SdkHeartBeatResult(String str, long j) {
        Objects.requireNonNull(str, "Null sdkName");
        this.sdkName = str;
        this.millis = j;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public String getSdkName() {
        return this.sdkName;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public long getMillis() {
        return this.millis;
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.sdkName + ", millis=" + this.millis + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SdkHeartBeatResult) {
            SdkHeartBeatResult sdkHeartBeatResult = (SdkHeartBeatResult) obj;
            return this.sdkName.equals(sdkHeartBeatResult.getSdkName()) && this.millis == sdkHeartBeatResult.getMillis();
        }
        return false;
    }

    public int hashCode() {
        long j = this.millis;
        return ((this.sdkName.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }
}
