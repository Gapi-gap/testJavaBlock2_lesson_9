package ru.netology.statistic.Radio;
import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {
    @Test
    public void checkingChannelUpSwitching() {
        Radio radio = new Radio();
        radio.SetChannelNumber(5);
        radio.next();
        int expected = 6;
        Assertions.assertEquals(expected, radio.GetCurrentRadioStationNumber());
    }

    @Test
    public void maximumChannelSwitchingTest() {
        Radio radio = new Radio();
        radio.SetChannelNumber(9);
        radio.next();
        int expected = 0;
        Assertions.assertEquals(expected, radio.GetCurrentRadioStationNumber());
    }

    @Test
    public void checkingForSwitchingTheMinimumChannelDown() {
        Radio radio = new Radio();
        radio.SetChannelNumber(0);
        radio.prev();
        int expected = 9;
        Assertions.assertEquals(expected, radio.GetCurrentRadioStationNumber());
    }

    @Test
    public void channelDownSwitchTest() {
        Radio radio = new Radio();
        radio.SetChannelNumber(1);
        radio.prev();
        int expected = 0;
        Assertions.assertEquals(expected, radio.GetCurrentRadioStationNumber());
    }

    @Test
    public void checkingTheSetVolumeValue() {
        Radio radio = new Radio();
        radio.setVolumeSound(56);
        int expected = 56;
        Assertions.assertEquals(expected, radio.GetVolumeSound());
    }

    @Test
    public void settingValueOutsideTheRange() {
        Radio radio = new Radio();
        radio.setVolumeSound(56);
        int expected = 56;
        radio.setVolumeSound(101);
        Assertions.assertEquals(expected, radio.GetVolumeSound());
    }

    @Test
    public void settingValueLessThanTheRange() {
        Radio radio = new Radio();
        radio.setVolumeSound(12);
        int expected = 12;
        radio.setVolumeSound(-12);
        Assertions.assertEquals(expected, radio.GetVolumeSound());
    }

    @Test
    public void checkingTheVolumeIncreaseByOne() {
        Radio radio = new Radio();
        radio.setVolumeSound(12);
        int expected = 13;
        radio.increaseVolume();
        Assertions.assertEquals(expected, radio.GetVolumeSound());
    }

    @Test
    public void checkingTheVolumeReductionByOne() {
        Radio radio = new Radio();
        radio.setVolumeSound(12);
        int expected = 11;
        radio.decreaseVolume();
        Assertions.assertEquals(expected, radio.GetVolumeSound());

    }

    @Test
    public void checkingIfTheSoundDecreasesByOneWhenTheSoundIsZero() {
        Radio radio = new Radio();
        radio.setVolumeSound(0);
        int expected = 0;
        radio.decreaseVolume();
        Assertions.assertEquals(expected, radio.GetVolumeSound());
    }

    @Test
    public void checkingTheVolumeIncreaseByOneMaximumVolume() {
        Radio radio = new Radio();
        radio.setVolumeSound(100);
        int expected = 100;
        radio.increaseVolume();
        Assertions.assertEquals(expected, radio.GetVolumeSound());
    }
    @Test
    public void settingTheChanneToExceedTheMaximumValue()
    {
        Radio radio = new Radio();
        radio.SetChannelNumber(1);
        radio.SetChannelNumber(100);
        int expected = 1;
        Assertions.assertEquals(expected, radio.GetCurrentRadioStationNumber());

    }
    @Test
    public void settingTheChannelBelowTheMinimumValue()
    {
        Radio radio = new Radio();
        radio.SetChannelNumber(6);
        radio.SetChannelNumber(-12);
        int expected = 6;
        Assertions.assertEquals(expected, radio.GetCurrentRadioStationNumber());

    }
}
