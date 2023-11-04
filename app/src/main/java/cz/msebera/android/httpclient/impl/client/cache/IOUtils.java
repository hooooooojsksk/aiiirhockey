package cz.msebera.android.httpclient.impl.client.cache;

import cz.msebera.android.httpclient.HttpEntity;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
class IOUtils {
    IOUtils() {
    }

    public static void consume(HttpEntity httpEntity) throws IOException {
        InputStream content;
        if (httpEntity == null || !httpEntity.isStreaming() || (content = httpEntity.getContent()) == null) {
            return;
        }
        content.close();
    }

    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[2048];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    static void closeSilently(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static void copyAndClose(InputStream inputStream, OutputStream outputStream) throws IOException {
        try {
            copy(inputStream, outputStream);
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            closeSilently(inputStream);
            closeSilently(outputStream);
            throw e;
        }
    }

    public static void copyFile(File file, File file2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
        try {
            FileChannel channel = randomAccessFile.getChannel();
            FileChannel channel2 = randomAccessFile2.getChannel();
            try {
                channel.transferTo(0L, randomAccessFile.length(), channel2);
                channel.close();
                channel2.close();
                randomAccessFile.close();
                randomAccessFile2.close();
            } catch (IOException e) {
                closeSilently(channel);
                closeSilently(channel2);
                throw e;
            }
        } catch (IOException e2) {
            closeSilently(randomAccessFile);
            closeSilently(randomAccessFile2);
            throw e2;
        }
    }
}
