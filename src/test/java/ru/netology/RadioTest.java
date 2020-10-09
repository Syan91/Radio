package ru.netology;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();


    @Test
    public void shouldNotChangeStationMax() {
        radio.setCurrentStation(30);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotChangeStationMin() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStation() {
        radio.setCurrentStation(2);
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void shouldSetDefaultStation() {
        radio.setCurrentStation(11);
        assertEquals(10, radio.getDefaultStations());
    }

    @Test
    public void shouldSetMax() {
        radio.setCurrentStation(10);
        assertEquals(20, radio.getMaxStation());
    }

    @Test
    public void shouldSetMin() {
        radio.setCurrentStation(10);
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void shouldIncrStation() {
        radio.setCurrentStation(11);
        radio.nextStation();
        assertEquals(12, radio.getCurrentStation());
    }

    @Test
    public void shouldDecrStation() {
        radio.setCurrentStation(20);
        radio.prevStation();
        assertEquals(19, radio.getCurrentStation());
    }

    @Test
    public void shouldNoIncrStation() {
        radio.setCurrentStation(20);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNoDecrStation() {
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(20, radio.getCurrentStation());
    }

    @Test
    public void shouldNotChangeVolumeMax() {
        radio.setCurrentVolume(143);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotChangeVolumeMin() {
        radio.setCurrentVolume(-30);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolume() {
        radio.setCurrentVolume(67);
        assertEquals(67, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetNextVolume() {
        radio.setCurrentVolume(48);
        radio.increaseCurrentVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetNextVolume() {
        radio.setCurrentVolume(100);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        radio.setCurrentVolume(50);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldSetPrevVolume() {
        radio.setCurrentVolume(43);
        radio.decreaseCurrentVolume();
        assertEquals(42, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetPrevVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}