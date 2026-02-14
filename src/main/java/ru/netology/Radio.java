package ru.netology;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int stationsCount;
    private int lastStation;

    public Radio() {
        this.stationsCount = 10;
        lastStation = stationsCount - 1;
    }

    public Radio(int stationsCount) {
        this.stationsCount = stationsCount;
        lastStation = this.stationsCount - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getLastStation() {
        return lastStation;
    }

    public void setStationByNumber(int number) {
        if (number <= lastStation && number >= 0) {
            currentStation = number;
        }
    }

    public void setVolumeByNumber(int number) {
        if (number <= 100 && number >= 0) {
            currentVolume = number;
        }
    }

    public void setPreviousStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = lastStation;
        }
    }

    public void setNextStation() {
        if (currentStation < lastStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}