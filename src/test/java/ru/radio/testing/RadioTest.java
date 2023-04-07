package ru.radio.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testGetCurrentStation() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSetCurrentStationValid() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStationInvalid() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentStation(10);
        expected = 0;
        actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetCurrentVolume() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeValid() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeInvalid() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentVolume(101);
        expected = 0;
        actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationWithinRange() {
        Radio radio = new Radio();
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationOutsideRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationOutsideRange() {
        Radio radio = new Radio();
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeWithinRange() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeOutsideRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeOutsideRange() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioConstructor() {
        int expectedMaxStation = -1;
        int expectedMaxVolume = 100;
        Radio radio = new Radio(10);
        int actualMaxStation = radio.getMaxStation();
        int actualMaxVolume = radio.getMaxVolume();
        Assertions.assertEquals(expectedMaxStation, actualMaxStation);
        Assertions.assertEquals(expectedMaxVolume, actualMaxVolume);
    }

    @Test
    public void testGetSetMaxStation() {
        Radio radio = new Radio(10);
        int expectedMaxStation = 5;
        radio.setMaxStation(5);
        int actualMaxStation = radio.getMaxStation();
        Assertions.assertEquals(expectedMaxStation, actualMaxStation);
    }

    @Test
    public void testGetSetMaxVolume() {
        Radio radio = new Radio(10);
        int expectedMaxVolume = 50;
        radio.setMaxVolume(50);
        int actualMaxVolume = radio.getMaxVolume();
        Assertions.assertEquals(expectedMaxVolume, actualMaxVolume);
    }
}
