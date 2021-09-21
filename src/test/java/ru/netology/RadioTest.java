package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(11);

    @Test
    void NotMaxNextStation() {
        radio.setCurrentStation(3);
        int expected = radio.nextStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void MaxNextStation() {
        radio.setCurrentStation(radio.getMaxStation());
        int expected = radio.nextStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void NotMinPrevStation() {
        radio.setCurrentStation(3);
        int expected = radio.prevStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void MinPrevStation() {
        radio.setCurrentStation(0);
        int expected = radio.prevStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationUnderMin() {
        radio.setCurrentStation(-1);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationOverMax() {
        radio.setCurrentStation(radio.getMaxStation() + 1);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void setCurrentStation() {
        radio.setCurrentStation(9);
        int expected = 9;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void VolumeUpThanNotMax() {
        radio.setSoundVolume(7);
        int expected = radio.volumeUp();
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void VolumeUpThanMax() {
        radio.setSoundVolume(100);
        int expected = radio.volumeUp();
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void VolumeDownThanNotMin() {
        radio.setSoundVolume(10);
        int expected = radio.volumeDown();
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void VolumeDownThanMin() {
        radio.setSoundVolume(0);
        int expected = radio.volumeDown();
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void setSoundVolumeUnderMin() {
        radio.setSoundVolume(-1);
        int expected = 0;
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void setSoundVolumeOverMax() {
        radio.setSoundVolume(101);
        int expected = 0;
        assertEquals(expected, radio.getSoundVolume());
    }


    @Test
    void setSoundVolume() {
        radio.setSoundVolume(9);
        int expected = 9;
        assertEquals(expected, radio.getSoundVolume());
    }
}