package br.com.mar10rocha.entities;

public interface Controller {
    public abstract void ligarDesligar();
    public abstract void muteAndUnmute();
    public abstract boolean isMute();
    public abstract boolean isPowerOn();
}
