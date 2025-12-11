package ru.netology.statistic.Radio;
import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {
    @Test
    public void checkingChannelUpSwitching() {
        Radio radio = new Radio();
        radio.setChannelNumber(5);
        radio.next();
        int expected = 6;
        Assertions.assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void maximumChannelSwitchingTest() {
        Radio radio = new Radio();
        radio.setChannelNumber(9);
        radio.next();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void checkingForSwitchingTheMinimumChannelDown() {
        Radio radio = new Radio();
        radio.setChannelNumber(0);
        radio.prev();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void channelDownSwitchTest() {
        Radio radio = new Radio();
        radio.setChannelNumber(1);
        radio.prev();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void checkingTheSetVolumeValue() {
        Radio radio = new Radio();
        radio.setVolumeSound(56);
        int expected = 56;
        Assertions.assertEquals(expected, radio.getVolumeSound());
    }

    @Test
    public void settingValueOutsideTheRange() {
        Radio radio = new Radio();
        radio.setVolumeSound(56);
        int expected = 56;
        radio.setVolumeSound(101);
        Assertions.assertEquals(expected, radio.getVolumeSound());
    }

    @Test
    public void settingValueLessThanTheRange() {
        Radio radio = new Radio();
        radio.setVolumeSound(12);
        int expected = 12;
        radio.setVolumeSound(-12);
        Assertions.assertEquals(expected, radio.getVolumeSound());
    }

    @Test
    public void checkingTheVolumeIncreaseByOne() {
        Radio radio = new Radio();
        radio.setVolumeSound(12);
        int expected = 13;
        radio.increaseVolume();
        Assertions.assertEquals(expected, radio.getVolumeSound());
    }

    @Test
    public void checkingTheVolumeReductionByOne() {
        Radio radio = new Radio();
        radio.setVolumeSound(12);
        int expected = 11;
        radio.decreaseVolume();
        Assertions.assertEquals(expected, radio.getVolumeSound());

    }

    @Test
    public void checkingIfTheSoundDecreasesByOneWhenTheSoundIsZero() {
        Radio radio = new Radio();
        radio.setVolumeSound(0);
        int expected = 0;
        radio.decreaseVolume();
        Assertions.assertEquals(expected, radio.getVolumeSound());
    }

    @Test
    public void checkingTheVolumeIncreaseByOneMaximumVolume() {
        Radio radio = new Radio();
        radio.setVolumeSound(100);
        int expected = 100;
        radio.increaseVolume();
        Assertions.assertEquals(expected, radio.getVolumeSound());
    }
    @Test
    public void settingTheChanneToExceedTheMaximumValue()
    {
        Radio radio = new Radio();
        radio.setChannelNumber(1);
        radio.setChannelNumber(100);
        int expected = 1;
        Assertions.assertEquals(expected, radio.getCurrentRadioStationNumber());

    }
    @Test
    public void settingTheChannelBelowTheMinimumValue()
    {
        Radio radio = new Radio();
        radio.setChannelNumber(6);
        radio.setChannelNumber(-12);
        int expected = 6;
        Assertions.assertEquals(expected, radio.getCurrentRadioStationNumber());

    }
@Test
    public void checkingEmptyConstructorInitialization()
    {
        Radio radio = new Radio();
        int expected = 10;
        Assertions.assertEquals(expected, radio.getMaximumRadioStationNumber());
    }

    @Test
    public void oneArgumentConstructorCheck()
    {
        Radio radio = new Radio(5);
        int expected = 5;
        Assertions.assertEquals(expected, radio.getMaximumRadioStationNumber());

    }

    @Test
    public void checkPrevRadioStations(){
        Radio radio = new Radio(5);
        radio.setRadioStations(2);
        radio.prevRadioStations();
        int expected = 1;
        Assertions.assertEquals(expected, radio.getRadioStation());
    }
    @Test
    public void checkPrevRadioStationsMin(){
        Radio radio = new Radio(5);
        radio.setRadioStations(0);
        radio.prevRadioStations();
        int expected = 4;
        Assertions.assertEquals(expected, radio.getRadioStation());
    }

    @Test
    public void checkNextRadioStations(){
        Radio radio = new Radio(5);
        radio.setRadioStations(2);
        radio.nextRadioStations();
        int expected = 3;
        Assertions.assertEquals(expected, radio.getRadioStation());
    }
    @Test
    public void checkNextRadioStationsMin(){
        Radio radio = new Radio(5);
        radio.setRadioStations(4);
        radio.nextRadioStations();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getRadioStation());
    }

}

