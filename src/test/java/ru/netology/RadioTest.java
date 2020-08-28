package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldNotChangeStationMax() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldNotChangeStationMin() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(2);
        assertEquals(2, radio.getCurrentStation());
    }
    @Test
    public void shouldSetMax() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(0);
        assertEquals(9, radio.getMaxStation());
    }
    @Test
    public void shouldSetMin() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(9);
        assertEquals(0, radio.getMinStation());
    }
    @Test
    public void shouldIncrStation() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(4);
        radio.nextStation();
        assertEquals(5, radio.getCurrentStation());
    }
    @Test
    public void shouldDecrStation() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(8);
        radio.prevStation();
        assertEquals(7, radio.getCurrentStation());
    }
    @Test
    public void shouldNoIncrStation() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldNoDecrStation() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    public void shouldNotChangeVolumeMax() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(30);
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void shouldNotChangeVolumeMin() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(-30);
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }
    @Test
    public void shouldSetNextVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(4);
        radio.increaseCurrentVolume();
        assertEquals(5, radio.getCurrentVolume());
    }
    @Test
    public void shouldNotSetNextVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(10);
        radio.increaseCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(0);
        assertEquals(10, radio.getMaxVolume());
    }
    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(10);
        assertEquals(0, radio.getMinVolume());
    }
    @Test
    public void shouldSetPrevVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(10);
        radio.decreaseCurrentVolume();
        assertEquals(9, radio.getCurrentVolume());
    }
    @Test
    public void shouldNotSetPrevVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}