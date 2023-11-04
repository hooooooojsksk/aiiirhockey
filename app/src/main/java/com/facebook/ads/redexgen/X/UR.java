package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class UR implements H7 {
    public static byte[] A02;
    public static String[] A03 = {"V9uyJ8pLVYRD0ZldKEQ8Fm6zvmqMDXWy", "Hg71UAiYySRbQdhhlwilCiKnXjev2ePA", "dXXMV49sZASER8PJdu1teXvpuaC", "ItxDGkbDnUyb6oqtSMasVXx46j9iOzYk", "dhSjei0RHB98MxffIoNKZhf7ZhQ", "21gtHhMrMv89rh6v8Px22ucxkmd", "UIi9EoWARjlD8E8YBHi4CxflqQKZlpEG", "jZKVHFEUmyWXIM9jvQw89fwKPj"};
    public static final UR A04;
    public int A00;
    public final Map<String, byte[]> A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{20, 51, 43, 60, 49, 52, 57, 125, 43, 60, 49, 40, 56, 125, 46, 52, 39, 56, airhockey.J_ENEMYWIN, 125, 87, airhockey.J_GAME_ENEMYEXIT, 102, 35, airhockey.J_GOO, airhockey.J_GAME_EXIT, airhockey.J_WAIT, 102, 35, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_STANDBY, 35, 38, airhockey.J_GOO, 35, 43, 38, airhockey.J_ENEMYWIN, 42, 35, airhockey.J_GAME_EXIT, airhockey.J_GOO, 35, airhockey.J_ONREWARDED, airhockey.J_BACK, 102, airhockey.J_NATION, 119, 102, airhockey.J_BACK, 35, 119, airhockey.J_GAME_ENEMYEXIT, airhockey.J_NATION, 109, 35, airhockey.J_INVITE, airhockey.J_NATION, 123, airhockey.J_GAME_EXIT, airhockey.J_INVITE, airhockey.J_REWARD, airhockey.J_INVITE, 35, airhockey.J_NATION, 111, 111, airhockey.J_GAME_DISCONNECT, airhockey.J_DISCONNECT, 102, airhockey.J_ENEMYWIN, 57, 35, 38, airhockey.J_ENEMYWIN, 79, 78, 92, 55, 34};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A05(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        for (String str : map.keySet()) {
            byte[] A07 = A07(map.get(str));
            if (A07.length > 10485760) {
                throw new IllegalArgumentException(String.format(A01(20, 55, 92), str, Integer.valueOf(A07.length), 10485760));
            }
            hashMap.put(str, A07);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private boolean A06(Map<String, byte[]> map) {
        if (this.A01.size() != map.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : this.A01.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    static {
        A03();
        A04 = new UR(Collections.emptyMap());
    }

    public UR(Map<String, byte[]> metadata) {
        this.A01 = Collections.unmodifiableMap(metadata);
    }

    public static UR A00(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int valueSize = dataInputStream.readInt();
            if (valueSize >= 0) {
                if (A03[5].length() == 7) {
                    throw new RuntimeException();
                }
                A03[5] = "wIzKKnz4WNrtvGk5MZN9OtyZE";
                if (valueSize <= 10485760) {
                    byte[] bArr = new byte[valueSize];
                    dataInputStream.readFully(bArr);
                    hashMap.put(readUTF, bArr);
                }
            }
            throw new IOException(A01(0, 20, 2) + valueSize);
        }
        return new UR(hashMap);
    }

    public static Map<String, byte[]> A02(Map<String, byte[]> otherMetadata, H9 h9) {
        HashMap hashMap = new HashMap(otherMetadata);
        A04(hashMap, h9.A04());
        A05(hashMap, h9.A05());
        return hashMap;
    }

    /* JADX WARN: Incorrect condition in loop: B:12:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A04(java.util.HashMap<java.lang.String, byte[]> r2, java.util.List<java.lang.String> r3) {
        /*
            r1 = 0
        L1:
            int r0 = r3.size()
            if (r1 >= r0) goto L11
            java.lang.Object r0 = r3.get(r1)
            r2.remove(r0)
            int r1 = r1 + 1
            goto L1
        L11:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UR.A04(java.util.HashMap, java.util.List):void");
    }

    public static byte[] A07(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(Charset.forName(A01(75, 5, 69)));
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public final UR A08(H9 h9) {
        Map<String, byte[]> A022 = A02(this.A01, h9);
        if (A06(A022)) {
            return this;
        }
        return new UR(A022);
    }

    public final void A09(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A01.size());
        for (Map.Entry<String, byte[]> entry : this.A01.entrySet()) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    @Override // com.facebook.ads.redexgen.X.H7
    public final long A5Z(String str, long j) {
        if (this.A01.containsKey(str)) {
            byte[] bytes = this.A01.get(str);
            return ByteBuffer.wrap(bytes).getLong();
        }
        return j;
    }

    @Override // com.facebook.ads.redexgen.X.H7
    public final String A5b(String str, String str2) {
        if (this.A01.containsKey(str)) {
            return new String(this.A01.get(str), Charset.forName(A01(75, 5, 69)));
        }
        return str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return A06(((UR) obj).A01);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i = 0;
            for (Map.Entry<String, byte[]> entry : this.A01.entrySet()) {
                int hashCode = entry.getKey().hashCode();
                int result = Arrays.hashCode(entry.getValue());
                i += hashCode ^ result;
            }
            this.A00 = i;
        }
        int result2 = this.A00;
        return result2;
    }
}
