package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.util.Log;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class i {
    public final HashMap<String, h> a;
    public final SparseArray<String> b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.b c;
    public final Cipher d;
    public final SecretKeySpec e;
    public boolean f;
    public o g;

    public i(File file, byte[] bArr) {
        if (bArr != null) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(bArr.length == 16);
            try {
                this.d = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                this.e = new SecretKeySpec(bArr, "AES");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            this.d = null;
            this.e = null;
        }
        this.a = new HashMap<>();
        this.b = new SparseArray<>();
        this.c = new com.fyber.inneractive.sdk.player.exoplayer2.util.b(new File(file, "cached_content_index.exi"));
    }

    public h a(String str) {
        return this.a.get(str);
    }

    public void b(String str) {
        h remove = this.a.remove(str);
        if (remove != null) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(remove.c.isEmpty());
            this.b.remove(remove.a);
            this.f = true;
        }
    }

    public void c() throws a.C0047a {
        DataOutputStream dataOutputStream;
        IOException e;
        Throwable th;
        if (this.f) {
            DataOutputStream dataOutputStream2 = null;
            try {
                OutputStream b = this.c.b();
                o oVar = this.g;
                if (oVar == null) {
                    this.g = new o(b);
                } else {
                    oVar.a(b);
                }
                dataOutputStream = new DataOutputStream(this.g);
            } catch (IOException e2) {
                dataOutputStream = dataOutputStream2;
                e = e2;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                dataOutputStream = dataOutputStream2;
                th = th3;
                u.a(dataOutputStream);
                throw th;
            }
            try {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(this.d != null ? 1 : 0);
                if (this.d != null) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.d.init(1, this.e, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.g, this.d));
                    } catch (InvalidAlgorithmParameterException e3) {
                        e = e3;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e4) {
                        e = e4;
                        throw new IllegalStateException(e);
                    }
                } else {
                    dataOutputStream2 = dataOutputStream;
                }
                dataOutputStream2.writeInt(this.a.size());
                int i = 0;
                for (h hVar : this.a.values()) {
                    dataOutputStream2.writeInt(hVar.a);
                    dataOutputStream2.writeUTF(hVar.b);
                    dataOutputStream2.writeLong(hVar.d);
                    i += hVar.a();
                }
                dataOutputStream2.writeInt(i);
                com.fyber.inneractive.sdk.player.exoplayer2.util.b bVar = this.c;
                bVar.getClass();
                dataOutputStream2.close();
                bVar.b.delete();
                int i2 = u.a;
                this.f = false;
            } catch (IOException e5) {
                e = e5;
                try {
                    throw new a.C0047a(e);
                } catch (Throwable th4) {
                    DataOutputStream dataOutputStream3 = dataOutputStream;
                    th = th4;
                    dataOutputStream2 = dataOutputStream3;
                    Throwable th32 = th;
                    dataOutputStream = dataOutputStream2;
                    th = th32;
                    u.a(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                u.a(dataOutputStream);
                throw th;
            }
        }
    }

    public final boolean a() {
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2 = null;
        try {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.c.a());
                dataInputStream = new DataInputStream(bufferedInputStream);
                try {
                    if (dataInputStream.readInt() != 1) {
                        u.a(dataInputStream);
                        return false;
                    }
                    if ((dataInputStream.readInt() & 1) != 0) {
                        if (this.d == null) {
                            u.a(dataInputStream);
                            return false;
                        }
                        byte[] bArr = new byte[16];
                        dataInputStream.readFully(bArr);
                        try {
                            this.d.init(2, this.e, new IvParameterSpec(bArr));
                            dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.d));
                        } catch (InvalidAlgorithmParameterException e) {
                            e = e;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        }
                    } else {
                        if (this.d != null) {
                            this.f = true;
                        }
                        dataInputStream2 = dataInputStream;
                    }
                    int readInt = dataInputStream2.readInt();
                    int i = 0;
                    for (int i2 = 0; i2 < readInt; i2++) {
                        h hVar = new h(dataInputStream2.readInt(), dataInputStream2.readUTF(), dataInputStream2.readLong());
                        a(hVar);
                        i += hVar.a();
                    }
                    if (dataInputStream2.readInt() != i) {
                        u.a(dataInputStream2);
                        return false;
                    }
                    u.a(dataInputStream2);
                    return true;
                } catch (FileNotFoundException unused) {
                    if (dataInputStream != null) {
                        u.a(dataInputStream);
                    }
                    return false;
                } catch (IOException e3) {
                    e = e3;
                    dataInputStream2 = dataInputStream;
                    Log.e("CachedContentIndex", "Error reading cache content index file.", e);
                    if (dataInputStream2 != null) {
                        u.a(dataInputStream2);
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (dataInputStream != null) {
                        u.a(dataInputStream);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused2) {
                dataInputStream = dataInputStream2;
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
            dataInputStream = null;
        }
    }

    public void b() {
        LinkedList linkedList = new LinkedList();
        for (h hVar : this.a.values()) {
            if (hVar.c.isEmpty()) {
                linkedList.add(hVar.b);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            b((String) it.next());
        }
    }

    public final void a(h hVar) {
        this.a.put(hVar.b, hVar);
        this.b.put(hVar.a, hVar.b);
    }

    public final h a(String str, long j) {
        SparseArray<String> sparseArray = this.b;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        h hVar = new h(keyAt, str, j);
        this.a.put(str, hVar);
        this.b.put(keyAt, str);
        this.f = true;
        return hVar;
    }
}
