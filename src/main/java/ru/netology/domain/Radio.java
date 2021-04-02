package ru.netology.domain;

public class Radio {
    private int currentNumberRadio;
    private int currentSoundVolume;

    public int getCurrentNumberRadio() {
        return currentNumberRadio;
    }

    public void setCurrentNumberRadio(int currentNumberRadio) {
        if (currentNumberRadio > 9) {
            return;
        }
        if (currentNumberRadio < 0) {
            return;
        }
        this.currentNumberRadio = currentNumberRadio;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < 0) {
            return;
        }
        if (currentSoundVolume > 10) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public int clickButtonNext() {
        if (currentNumberRadio == 9) {
            return 0;
        }
        currentNumberRadio++;
        return currentNumberRadio;
    }

    public int clickButtonPrev() {
        if (currentNumberRadio == 0) {
            return 9;
        }
        currentNumberRadio--;
        return currentNumberRadio;
    }

    public int inputNumberRadio() {
        return currentNumberRadio;
    }

    public int changeVolumeSoundPlus() {
        if (currentSoundVolume == 10) {
            return currentSoundVolume;
        }
        currentSoundVolume++;
        return currentSoundVolume;
    }

    public int changeVolumeSoundMinus() {
        if (currentSoundVolume == 0) {
            return currentSoundVolume;
        }
        currentSoundVolume--;
        return currentSoundVolume;
    }
}
