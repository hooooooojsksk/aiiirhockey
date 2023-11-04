package org.cocos2dx.enginedata;

/* loaded from: classes2.dex */
public interface IEngineDataManager {

    /* loaded from: classes2.dex */
    public interface OnSystemCommandListener {
        void onChangeContinuousFrameLostConfig(int i, int i2);

        void onChangeExpectedFps(int i);

        void onChangeLowFpsConfig(int i, float f);

        void onChangeMuteEnabled(boolean z);

        void onChangeSpecialEffectLevel(int i);

        void onQueryFps(int[] iArr, int[] iArr2);
    }

    void destroy();

    String getVendorInfo();

    boolean init(OnSystemCommandListener onSystemCommandListener);

    void notifyContinuousFrameLost(int i, int i2, int i3);

    void notifyFpsChanged(float f, float f2);

    void notifyGameStatus(GameStatus gameStatus, int i, int i2);

    void notifyLowFps(int i, float f, int i2);

    void pause();

    void resume();

    /* loaded from: classes2.dex */
    public enum GameStatus {
        LAUNCH_BEGIN(0),
        LAUNCH_END(1),
        SCENE_CHANGE_BEGIN(2),
        SCENE_CHANGE_END(3),
        IN_SCENE(4),
        INVALID(5000);
        
        private int status;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static GameStatus[] valuesCustom() {
            GameStatus[] valuesCustom = values();
            int length = valuesCustom.length;
            GameStatus[] gameStatusArr = new GameStatus[length];
            System.arraycopy(valuesCustom, 0, gameStatusArr, 0, length);
            return gameStatusArr;
        }

        GameStatus(int i) {
            this.status = i;
        }
    }
}
