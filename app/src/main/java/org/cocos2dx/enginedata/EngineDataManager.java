package org.cocos2dx.enginedata;

import java.util.ArrayList;
import java.util.List;
import org.cocos2dx.enginedata.IEngineDataManager;
import org.cocos2dx.enginedata.magic.a;

/* loaded from: classes2.dex */
public class EngineDataManager implements IEngineDataManager {
    private static final String a = "EngineDataManager";
    private static final int b = 1000;
    private static final String c = "1.0.0.0";
    private List<IEngineDataManager> d;

    public int getVersionCode() {
        return 1000;
    }

    public String getVersionName() {
        return c;
    }

    public EngineDataManager() {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        arrayList.add(new a());
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager
    public String getVendorInfo() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(this.d.get(i).getVendorInfo());
            if (i < this.d.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager
    public boolean init(IEngineDataManager.OnSystemCommandListener onSystemCommandListener) {
        boolean z = false;
        for (IEngineDataManager iEngineDataManager : this.d) {
            if (iEngineDataManager.init(onSystemCommandListener)) {
                z = true;
            }
        }
        return z;
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager
    public void destroy() {
        for (IEngineDataManager iEngineDataManager : this.d) {
            iEngineDataManager.destroy();
        }
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager
    public void pause() {
        for (IEngineDataManager iEngineDataManager : this.d) {
            iEngineDataManager.pause();
        }
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager
    public void resume() {
        for (IEngineDataManager iEngineDataManager : this.d) {
            iEngineDataManager.resume();
        }
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager
    public void notifyGameStatus(IEngineDataManager.GameStatus gameStatus, int i, int i2) {
        for (IEngineDataManager iEngineDataManager : this.d) {
            iEngineDataManager.notifyGameStatus(gameStatus, i, i2);
        }
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager
    public void notifyContinuousFrameLost(int i, int i2, int i3) {
        for (IEngineDataManager iEngineDataManager : this.d) {
            iEngineDataManager.notifyContinuousFrameLost(i, i2, i3);
        }
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager
    public void notifyLowFps(int i, float f, int i2) {
        for (IEngineDataManager iEngineDataManager : this.d) {
            iEngineDataManager.notifyLowFps(i, f, i2);
        }
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager
    public void notifyFpsChanged(float f, float f2) {
        for (IEngineDataManager iEngineDataManager : this.d) {
            iEngineDataManager.notifyFpsChanged(f, f2);
        }
    }
}
