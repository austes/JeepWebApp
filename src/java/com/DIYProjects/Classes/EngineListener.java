package com.DIYProjects.Classes;


public interface EngineListener {
    void onStop();
    int onSpeedDown();
    int onSpeedUp();
    void onBackwards();
    void onForward();
    int onSlowSpeed();
    int onMediumSpeed();
    int onFastSpeed();
    int onFullSpeed();
}
