package ru.netology.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class Radio {
    private int maxNumberRadio;
    private int currentNumberRadio;
    private int currentSoundVolume;
    private int inputNumberRadio;


    public Radio(int maxNumberRadio) {
        this.maxNumberRadio = maxNumberRadio;
    }

    public void setMaxNumberRadio(int maxNumberRadio) {
        if (maxNumberRadio < 0) {
            return;
        }
        this.maxNumberRadio = maxNumberRadio;
    }


    public void setCurrentNumberRadio(int currentNumberRadio) {
        if (currentNumberRadio > maxNumberRadio) {
            return;
        }
        if (currentNumberRadio < 0) {
            return;
        }
        this.currentNumberRadio = currentNumberRadio;
    }


    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < 0) {
            return;
        }
        if (currentSoundVolume > 100) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }


    public int clickButtonNext() {
        if (currentNumberRadio == maxNumberRadio) {
            return 0;
        }
        currentNumberRadio++;
        return currentNumberRadio;
    }

    public int clickButtonPrev() {
        if (currentNumberRadio == 0) {
            return maxNumberRadio;
        }
        currentNumberRadio--;
        return currentNumberRadio;
    }


    public int inputNumberRadio(int inputNumberRadio) {
        if (inputNumberRadio > maxNumberRadio || inputNumberRadio < 0) {
            return currentNumberRadio;
        }
        currentNumberRadio = inputNumberRadio;
        return currentNumberRadio;
    }


    public int changeVolumeSoundPlus() {
        if (currentSoundVolume == 100) {
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
