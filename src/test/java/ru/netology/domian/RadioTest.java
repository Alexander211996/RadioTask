package ru.netology.domian;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldName() {
        Radio radio = new Radio();
        radio.setName("Soviet");
        String expected = "Soviet";
        assertEquals(expected, radio.getName());
    }

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setEndRadioStation(9);
        radio.setCurrentRadioStation(9);
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationBegin() {
        Radio radio = new Radio();
        radio.setBeginRadioStation(0);
        radio.setCurrentRadioStation(-7);
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldBeginRadioStation() {
        Radio radio = new Radio();
        radio.setBeginRadioStation(0);
        int expected = 0;
        assertEquals(expected, radio.getBeginRadioStation());
    }

    @Test
    public void shouldNegativeBeginRadioStation() {
        Radio radio = new Radio();
        radio.setBeginRadioStation(-7);
        int expected = 0;
        assertEquals(expected, radio.getBeginRadioStation());
    }

    @Test
    public void shouldEndRadioStation() {
        Radio radio = new Radio();
        radio.setEndRadioStation(9);
        int expected = 9;
        assertEquals(expected, radio.getEndRadioStation());
    }

    @Test
    public void shouldNegativeEndRadioStation() {
        Radio radio = new Radio();
        radio.setEndRadioStation(11);
        int expected = 0;
        assertEquals(expected, radio.getEndRadioStation());
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setVolume(5);
        int expected = 5;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void shouldMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        int expected = 0;
        assertEquals(expected, radio.getMinVolume());
    }

    @Test
    public void shouldNegativeMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(-1);
        int expected = 0;
        assertEquals(expected, radio.getMinVolume());
    }

    @Test
    public void shouldMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        int expected = 10;
        assertEquals(expected, radio.getMaxVolume());
    }

    @Test
    public void shouldNegativeMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(11);
        int expected = 0;
        assertEquals(expected, radio.getMaxVolume());
    }

    @Test
    public void shouldIncreaseRadioStation(){
        Radio radio = new Radio();
        radio.setBeginRadioStation(0);
        radio.setEndRadioStation(9);
        radio.setCurrentRadioStation(7);

        assertEquals(8, radio.increaseRadioStation());
    }

    @Test
    public void shouldNotIncreaseRadioStationOverMax(){
        Radio radio = new Radio();
        radio.setBeginRadioStation(0);
        radio.setEndRadioStation(9);
        radio.setCurrentRadioStation(9);

        assertEquals(radio.getBeginRadioStation(), radio.increaseRadioStation());
    }

    @Test
    public void shouldDecreaseRadioStation(){
        Radio radio = new Radio();
        radio.setBeginRadioStation(0);
        radio.setEndRadioStation(9);
        radio.setCurrentRadioStation(3);

        assertEquals(2, radio.decreaseRadioStation());
    }

    @Test
    public void shouldNotDecreaseRadioStationOverMin() {
        Radio radio = new Radio();
        radio.setBeginRadioStation(0);
        radio.setEndRadioStation(9);
        radio.setCurrentRadioStation(0);

        assertEquals(9, radio.decreaseRadioStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(7);

        assertEquals(8, radio.increaseVolume());
    }

    @Test
    public void shouldNotIncreaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(10);

        assertEquals(10, radio.increaseVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setVolume(8);

        assertEquals(7, radio.decreaseVolume());
    }

    @Test
    public void shouldNotDecreaseVolumeLessMin() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setVolume(0);

        assertEquals(0, radio.decreaseVolume());
    }


}