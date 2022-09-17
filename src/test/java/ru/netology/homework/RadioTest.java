package ru.netology.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio(9);

        radio.setCurrentRadioStation(10);
        Assertions.assertEquals(0, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(5);
        Assertions.assertEquals(5, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(-1);
        Assertions.assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio(9);

        radio.setCurrentRadioStation(9);
        radio.setNextRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(2);
        radio.setNextRadioStation();
        Assertions.assertEquals(3, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio(9);

        radio.setCurrentRadioStation(9);
        radio.setPrevRadioStation();
        Assertions.assertEquals(8, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(0);
        radio.setPrevRadioStation();
        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(101);
        Assertions.assertEquals(0, volume.getCurrentVolume());

        volume.setCurrentVolume(50);
        Assertions.assertEquals(50, volume.getCurrentVolume());

        volume.setCurrentVolume(-1);
        Assertions.assertEquals(50, volume.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);
        volume.increaseVolume();
        Assertions.assertEquals(100, volume.getCurrentVolume());

        volume.setCurrentVolume(50);
        volume.increaseVolume();
        Assertions.assertEquals(51, volume.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);
        volume.decreaseVolume();
        Assertions.assertEquals(0, volume.getCurrentVolume());

        volume.setCurrentVolume(50);
        volume.decreaseVolume();
        Assertions.assertEquals(49, volume.getCurrentVolume());
    }
}