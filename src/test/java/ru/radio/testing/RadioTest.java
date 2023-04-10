package ru.radio.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @BeforeEach
    void setUp() {
        Radio radio = new Radio(20,100);
    }

    @Test
    void testDefaultConstructor() {
        Radio radio = new Radio();
        int expectedMaxStation = 19;
        int expectedMaxVolume = 100;
        int expectedCurrentStation = 0;
        int expectedCurrentVolume = 0;
        assertEquals(expectedMaxStation, radio.getMaxStation());
        assertEquals(expectedMaxVolume, radio.getMaxVolume());
        assertEquals(expectedCurrentStation, radio.getCurrentStation());
        assertEquals(expectedCurrentVolume, radio.getCurrentVolume());
    }

    @Test
    void testConstructorWithStationsCount() {
        int stationsCount = 15;
        Radio radio = new Radio(stationsCount);
        int expectedMaxStation = 14;
        int expectedMaxVolume = 100;
        int expectedCurrentStation = 0;
        int expectedCurrentVolume = 0;
        assertEquals(expectedMaxStation, radio.getMaxStation());
        assertEquals(expectedMaxVolume, radio.getMaxVolume());
        assertEquals(expectedCurrentStation, radio.getCurrentStation());
        assertEquals(expectedCurrentVolume, radio.getCurrentVolume());
    }

    @Test
    void getMaxStation() {
        Radio radio = new Radio(20,100);
        int expected = 19;
        int actual = radio.getMaxStation();
        assertEquals(expected, actual);
    }

    @Test
    void setMaxStation() {
        Radio radio = new Radio(20,100);
        radio.setMaxStation(15);
        int expected = 15;
        int actual = radio.getMaxStation();
        assertEquals(expected, actual);
    }

    @Test
    void getMaxVolume() {
        Radio radio = new Radio(20,100);
        int expected = 100;
        int actual = radio.getMaxVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setMaxVolume() {
        Radio radio = new Radio(20,100);
        radio.setMaxVolume(50);
        int expected = 50;
        int actual = radio.getMaxVolume();
        assertEquals(expected, actual);
    }

    @Test
    void nextStation() {
        Radio radio = new Radio(20,100);
        radio.setCurrentStation(5);
        radio.nextStation();
        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

        radio.setCurrentStation(19);
        radio.nextStation();
        expected = 0;
        actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void prevStation() {
        Radio radio = new Radio(20,100);
        radio.setCurrentStation(5);
        radio.prevStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

        radio.setCurrentStation(0);
        radio.prevStation();
        expected = 19;
        actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio(20,100);
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        expected = 100;
        actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio(20,100);
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        int expected = 49;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        expected = 0;
        actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentStation() {
        Radio radio = new Radio(20,100);
        radio.setCurrentStation(10);
        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation() {
        Radio radio = new Radio(20,100);
        radio.setCurrentStation(10);
        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

        radio.setCurrentStation(30);
        expected = 10;
        actual = radio.getCurrentStation();
        assertEquals(expected, actual);

        radio.setCurrentStation(-5);
        expected = 10;
        actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentVolume() {
        Radio radio = new Radio(20,100);
        radio.setCurrentVolume(75);
        int expected = 75;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio(20,100);
        radio.setCurrentVolume(75);
        int expected = 75;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

        radio.setCurrentVolume(150);
        expected = 75;
        actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

        radio.setCurrentVolume(-20);
        expected = 75;
        actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}