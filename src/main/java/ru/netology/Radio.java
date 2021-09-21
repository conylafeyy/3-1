package ru.netology;

public class Radio {
    private int currentStation;
    private int soundVolume;

    private int numberOfStations;

    private int minStation = 0;
    private int maxStation;

    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
        numberOfStations = 10;
        maxStation = 9;
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        maxStation = numberOfStations - 1;
    }

    public int getMaxStation() {
        return maxStation;
    }


    public int nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation = +1;
        }
        return currentStation;
    }

    public int prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation = -1;
        }
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if ((currentStation <= maxStation) && (currentStation >= minStation)) {
            this.currentStation = currentStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int volumeUp() {
        if (soundVolume == maxVolume) {
            soundVolume = maxVolume;
        } else {
            soundVolume = +1;
        }
        return soundVolume;
    }

    public int volumeDown() {
        if (soundVolume == minVolume) {
            soundVolume = minVolume;
        } else {
            soundVolume = -1;
        }
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if ((soundVolume >= minVolume) && (soundVolume <= maxVolume)) {
            this.soundVolume = soundVolume;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }
}
