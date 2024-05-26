package br.com.mar10rocha.entities;

public class RemoteController implements Controller{
    private boolean ligado;
    private boolean mute;
    public void ligarDesligar(){
        this.ligado = !ligado;
    }
    public void muteAndUnmute(){
        this.mute = !mute;
    }
    public boolean isPowerOn(){
        return this.ligado;
    }
    public boolean isMute(){
        return this.mute;
    }
    public RemoteController(){
        this.ligado = false;
        this.mute = false;
    }
}
