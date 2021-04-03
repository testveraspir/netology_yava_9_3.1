package ru.netology.domain;

import lombok.Generated;

public class Radio {
    private int currentNumberRadio;
    private int currentSoundVolume;

    @Generated
    public int getCurrentNumberRadio() {
        return currentNumberRadio;
    }

    @Generated
    public void setCurrentNumberRadio(int currentNumberRadio) {
        if (currentNumberRadio > 9) {
            return;
        }
        if (currentNumberRadio < 0) {
            return;
        }
        this.currentNumberRadio = currentNumberRadio;
    }

    @Generated
    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    @Generated
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

    @Generated
    public int inputNumberRadio() {
        return currentNumberRadio;
    }

    @Generated
    public int changeVolumeSoundPlus() {
        if (currentSoundVolume == 10) {
            return currentSoundVolume;
        }
        currentSoundVolume++;
        return currentSoundVolume;
    }

    @Generated
    public int changeVolumeSoundMinus() {
        if (currentSoundVolume == 0) {
            return currentSoundVolume;
        }
        currentSoundVolume--;
        return currentSoundVolume;
    }
}
