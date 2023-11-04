package org.cocos2dx.lib;

import java.io.File;
import java.io.FileInputStream;

/* loaded from: classes2.dex */
public class GameControllerUtils {
    public static void ensureDirectoryExist(String str) {
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static String readJsonFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                return new String(bArr, "UTF-8");
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
