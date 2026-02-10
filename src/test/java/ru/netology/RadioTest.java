package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationByValidNumber() {
        Radio radio = new Radio();
        radio.setStationByNumber(5);
        int expected = 5;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationByNumberMoreThan9() {
        Radio radio = new Radio();
        radio.setStationByNumber(0);
        radio.setStationByNumber(11);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationByNumberLessThan0() {
        Radio radio = new Radio();
        radio.setStationByNumber(0);
        radio.setStationByNumber(-1);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPreviousStationIfIt0() {
        Radio radio = new Radio();
        radio.setStationByNumber(0);
        radio.setPreviousStation();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPreviousStationIfItsInTheMiddle() {
        Radio radio = new Radio();
        radio.setStationByNumber(3);
        radio.setPreviousStation();
        int expected = 2;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationIfIt9() {
        Radio radio = new Radio();
        radio.setStationByNumber(9);
        radio.setNextStation();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationIfItsInTheMiddle() {
        Radio radio = new Radio();
        radio.setStationByNumber(5);
        radio.setNextStation();
        int expected = 6;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldSetVolumeByValidNumber() {
        Radio radio = new Radio();
        radio.setVolumeByNumber(50);
        int expected = 50;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeIfItsLessThan0() {
        Radio radio = new Radio();
        radio.setVolumeByNumber(15);
        radio.setVolumeByNumber(-1);
        int expected = 15;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeIfItsMoreThan100() {
        Radio radio = new Radio();
        radio.setVolumeByNumber(15);
        radio.setVolumeByNumber(101);
        int expected = 15;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolumeByNumber(100);
        radio.increaseVolume();
        int expected = 100;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolumeByNumber(0);
        radio.decreaseVolume();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolumeByNumber(20);
        radio.increaseVolume();
        int expected = 21;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolumeByNumber(21);
        radio.decreaseVolume();
        int expected = 20;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }
}
