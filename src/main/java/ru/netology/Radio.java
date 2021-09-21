package ru.netology;

public class Radio {
    private int currentStation;
    private int soundVolume;

    int minStation = 0;
    int maxStation = 9;

    int minVolume = 0;
    int maxVolume = 10;


    public int nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        }
        else {
            currentStation =+ 1;
        }
        return currentStation;
    }

    public int prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        }
        else {
            currentStation =- 1;
        }
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if ((currentStation <= maxStation) && (currentStation >= minStation)) {
            this.currentStation = currentStation;
        }
        else {
            return;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int volumeUp() {
        if (soundVolume == maxVolume) {
            soundVolume = maxVolume;
        }
        else {
            soundVolume =+ 1;
        }
        return soundVolume;
    }

    public int volumeDown() {
        if (soundVolume == minVolume) {
            soundVolume = minVolume;
        }
        else {
            soundVolume =- 1;
        }
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if ((soundVolume >= minVolume) && (soundVolume <= maxVolume)) {
            this.soundVolume = soundVolume;
        }
        else {
            return;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }
    }
