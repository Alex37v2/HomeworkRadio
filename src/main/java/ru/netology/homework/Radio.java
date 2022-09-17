package ru.netology.homework;

public class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation = minRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio(int amountRadioStation) {
        maxRadioStation = minRadioStation + amountRadioStation;
    }

    public Radio() {
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < getMinRadioStation() | newCurrentRadioStation > getMaxRadioStation()) return;
        currentRadioStation = newCurrentRadioStation;
    }

    public void setNextRadioStation() {
        int station = this.getCurrentRadioStation();

        if (station < maxRadioStation) {
            this.currentRadioStation++;
        }
        if (station == maxRadioStation) {
            this.currentRadioStation = getMinRadioStation();
        }
    }

    public void setPrevRadioStation() {
        int station = this.getCurrentRadioStation();

        if (station > minRadioStation) {
            this.currentRadioStation--;
        }
        if (station == minRadioStation) {
            this.currentRadioStation = maxRadioStation;
        }
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < getMinVolume() | newCurrentVolume > getMaxVolume()) return;

        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (getCurrentVolume() < getMaxVolume()) this.currentVolume++;
    }

    public void decreaseVolume() {
        if (getCurrentVolume() > getMinVolume()) this.currentVolume--;
    }
}
