package ru.netology.domain;


public class Radio {
    private int maxNumberRadio;
    private int currentNumberRadio;
    private int currentSoundVolume;
    private int inputNumberRadio;


    public Radio() {
    }

    public Radio(int maxNumberRadio) {
        this.maxNumberRadio = maxNumberRadio;
    }

    public void setMaxNumberRadio(int maxNumberRadio) {
        if (maxNumberRadio < 0) {
            return;
        }
        this.maxNumberRadio = maxNumberRadio;
    }


    public int getCurrentNumberRadio() {
        return currentNumberRadio;
    }


    public int getMaxNumberRadio() {
        return maxNumberRadio;
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


    public int getCurrentSoundVolume() {
        return currentSoundVolume;
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


    public int getInputNumberRadio() {
        return inputNumberRadio;
    }

    public void setInputNumberRadio(int inputNumberRadio) {
        this.inputNumberRadio = inputNumberRadio;
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
