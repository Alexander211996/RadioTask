package ru.netology.domian;

public class Radio {
    private String name;
    private int currentRadioStation;
    private int beginRadioStation;
    private int endRadioStation;
    private int volume;
    private int minVolume;
    private int maxVolume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation >= 0 && currentRadioStation <= 9) {
                this.currentRadioStation = currentRadioStation;
            }
    }

    public int getBeginRadioStation() {
        return beginRadioStation;
    }

    public void setBeginRadioStation(int beginRadioStation) {
        if (beginRadioStation < 0) {
            return;
        }
        this.beginRadioStation = beginRadioStation;
    }

    public int getEndRadioStation() {
        return endRadioStation;
    }

    public void setEndRadioStation(int endRadioStation) {
        if (endRadioStation > 9) {
            return;
        }
        this.endRadioStation = endRadioStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        if (minVolume < 0) {
            return;
        }
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        if (maxVolume > 10) {
            return;
        }
        this.maxVolume = maxVolume;
    }

    public int increaseRadioStation() {
        if (currentRadioStation < endRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = beginRadioStation;
        }
        return currentRadioStation;
    }

    public int decreaseRadioStation() {
        if (currentRadioStation > beginRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = endRadioStation;
        }
        return currentRadioStation;
    }

    public int increaseVolume() {
        if (volume < maxVolume) {
            volume += 1;
        } else {
            volume = maxVolume;
        }
        return volume;
    }

    public int decreaseVolume() {
        if (volume > minVolume) {
            volume = volume - 1;
        } else {
            volume = minVolume;
        }
        return volume;
    }

}


