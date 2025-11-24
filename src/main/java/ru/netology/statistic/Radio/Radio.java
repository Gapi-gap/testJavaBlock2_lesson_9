package ru.netology.statistic.Radio;

public class Radio {
    private int currentRadioStationNumber;
    private int volumeSound;

    public int GetCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void SetChannelNumber(int channelNumber) {
        if (channelNumber < 0)
            return;
        if (channelNumber > 9)
            return;
        currentRadioStationNumber = channelNumber;
    }

    public void next() {
        if (currentRadioStationNumber == 9)
            currentRadioStationNumber = 0;
        else
            currentRadioStationNumber++;
    }

    public void prev() {
        if (currentRadioStationNumber == 0)
            currentRadioStationNumber = 9;
        else
            currentRadioStationNumber--;
    }

    public int GetVolumeSound() {
        return volumeSound;
    }

    public void setVolumeSound(int sound) {
        if (sound < 0)
            return;
        if (sound > 100)
            return;
        volumeSound = sound;
    }

    public void increaseVolume() {
        if (volumeSound < 100) {
            volumeSound = volumeSound + 1;
        }
    }

    public void decreaseVolume() {
        if (volumeSound > 0) {
            volumeSound--;
        }
    }


}