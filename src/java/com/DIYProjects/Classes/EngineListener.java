package com.DIYProjects.Classes;


public interface EngineListener {
    void onStop();
    int onSpeedDown();
    int onSpeedUp();
    void onBackwards();
    void onForward();
    int onSpeed();

}
