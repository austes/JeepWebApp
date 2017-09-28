package com.DIYProjects.Classes;


public class Engine {
    private EngineListener listener = null;
    
    public Engine()
    {

    }
    
    public Engine(EngineListener engineListener)
    {
        this.listener = engineListener;
    }
    
    public void Stop()
    {
        if (listener != null)
            listener.onStop();
    }
    
    public int SpeedDown() throws Exception
    {
        if (listener != null) {
            int speed = listener.onSpeedDown();
            return speed;
        }
        else
            throw new Exception("EngineListener error");
    }
    
    public int SpeedUp() throws Exception
    {
        if (listener != null) {
            int speed = listener.onSpeedUp();
            return speed;
        }
        else
            throw new Exception("EngineListener error");
    }
    
    public int OnSpeed() throws Exception
    {
        if (listener != null) {
            int speed = listener.onSpeed();
            return speed;
        }
        else
            throw new Exception("EngineListener error");
    }

    
    public void Backward()
    {
        if (listener != null)
            listener.onBackwards();
    }
    
    public void Forward()
    {
        if (listener != null)
            listener.onForward();
    }
}

