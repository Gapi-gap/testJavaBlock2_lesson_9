package ru.netology.statistic.Radio;

public class Radio {
    private int currentRadioStationNumber;
    private int volumeSound;
    private int maximumRadioStationNumber = 10;
    private int RadioStations;
    public  Radio()
    {

    }
    public  Radio(int numberRadioStation){
        this.maximumRadioStationNumber = numberRadioStation;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setChannelNumber(int channelNumber) {
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

    public int getVolumeSound() {
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

    public int getRadioStation()
    {
        return RadioStations;
    }

    public void setRadioStations(int numberRadioStation)
    {
        RadioStations = numberRadioStation;
    }

    public void nextRadioStations() {
        if (RadioStations == maximumRadioStationNumber - 1)
            RadioStations = 0;
        else
            RadioStations++;
    }

    public void prevRadioStations() {
        if (RadioStations == 0)
            RadioStations = maximumRadioStationNumber-1;
        else
            RadioStations--;
    }

    public int getMaximumRadioStationNumber(){
        return maximumRadioStationNumber;
    }
}