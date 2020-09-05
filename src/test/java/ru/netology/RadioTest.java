package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldNotChangeStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(30);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldNotChangeStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        assertEquals(2, radio.getCurrentStation());
    }
    @Test
    public void shouldSetDefaultStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        assertEquals(10, radio.getDefaultStation());
    }
    @Test
    public void shouldSetMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        assertEquals(20, radio.getMaxStation());
    }
    @Test
    public void shouldSetMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(0, radio.getMinStation());
    }
    @Test
    public void shouldIncrStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        radio.nextStation();
        assertEquals(12, radio.getCurrentStation());
    }
    @Test
    public void shouldDecrStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(20);
        radio.prevStation();
        assertEquals(19, radio.getCurrentStation());
    }
    @Test
    public void shouldNoIncrStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(20);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldNoDecrStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(20, radio.getCurrentStation());
    }
    @Test
    public void shouldNotChangeVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(143);
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void shouldNotChangeVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-30);
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(67);
        assertEquals(67, radio.getCurrentVolume());
    }
    @Test
    public void shouldSetNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(48);
        radio.increaseCurrentVolume();
        assertEquals(49, radio.getCurrentVolume());
    }
    @Test
    public void shouldNotSetNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        assertEquals(100, radio.getMaxVolume());
    }
    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getMinVolume());
    }
    @Test
    public void shouldSetPrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(43);
        radio.decreaseCurrentVolume();
        assertEquals(42, radio.getCurrentVolume());
    }
    @Test
    public void shouldNotSetPrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}