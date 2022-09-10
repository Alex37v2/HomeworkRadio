package ru.netology.homework;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0 | newCurrentRadioStation > 9) return;
        currentRadioStation = newCurrentRadioStation;
    }

    public void setNextRadioStation() {
        int station = this.getCurrentRadioStation();

        if (station < 9) {
            this.currentRadioStation++;
        }
        if (station == 9) {
            this.currentRadioStation = 0;
        }
    }

    public void setPrevRadioStation() {
        int station = this.getCurrentRadioStation();

        if (station > 0) {
            this.currentRadioStation--;
        }
        if (station == 0) {
            this.currentRadioStation = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0 | newCurrentVolume > 10) return;

        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (this.getCurrentVolume() < 10) this.currentVolume++;
    }

    public void decreaseVolume() {
        if (this.getCurrentVolume() > 0) this.currentVolume--;
    }
}
