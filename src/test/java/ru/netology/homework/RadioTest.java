package ru.netology.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

        radio.setCurrentRadioStation(5);

        expected = 5;
        actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

        radio.setCurrentRadioStation(-1);

        expected = 5;
        actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.setNextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

        radio.setCurrentRadioStation(2);
        radio.setNextRadioStation();

        expected = 3;
        actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.setPrevRadioStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

        radio.setCurrentRadioStation(0);
        radio.setPrevRadioStation();

        expected = 9;
        actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(11);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

        volume.setCurrentVolume(5);

        expected = 5;
        actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

        volume.setCurrentVolume(-1);

        expected = 5;
        actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

        volume.setCurrentVolume(5);
        volume.increaseVolume();

        expected = 6;
        actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

        volume.setCurrentVolume(5);
        volume.decreaseVolume();

        expected = 4;
        actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}