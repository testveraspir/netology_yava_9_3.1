package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    //проверяем работу кнопки Next, переключение с максим кол-вом радиостанции на 0
    @Test
    void clickNextWith9on0() {
        Radio radio1 = new Radio();
        radio1.setCurrentNumberRadio(10);
        int clickNext = radio1.clickButtonNext();
        assertEquals(0, clickNext);
    }

    //проверяем работу кнопки Next, валидное переключение с 0 на 1
    @Test
    void clickNextWith0on1() {
        Radio radio1 = new Radio();
        radio1.setCurrentNumberRadio(0);
        int clickNext = radio1.clickButtonNext();
        assertEquals(1, clickNext);
    }

    //проверяем неверное значение исходного номера радио, больше максимального
    @Test
    void invalidClickNext10() {
        Radio radio1 = new Radio();
        radio1.setCurrentNumberRadio(11);
        int clickNext = radio1.clickButtonNext();
        assertEquals(1, clickNext);
    }

    //проверяем неверное значение исходного номера радио (< 0)
    @Test
    void invalidClickNextNumberLess0() {
        Radio radio1 = new Radio();
        radio1.setCurrentNumberRadio(-1);
        int clickNext = radio1.clickButtonNext();
        assertEquals(1, clickNext);
    }

    //проверяем работу кнопки Prev, переключение с 0 на максимальное кол-во радиостанций
    @Test
    void clickPrevWith0on9() {
        Radio radio1 = new Radio();
        radio1.setCurrentNumberRadio(0);
        int clickPrev = radio1.clickButtonPrev();
        assertEquals(10, clickPrev);
    }

    // проверяем работу кнопки Prev, валидное переключение с максим.номера радиостанции на предыдущую
    @Test
    void clickPrevWith9on8() {
        Radio radio1 = new Radio();
        radio1.setCurrentNumberRadio(10);
        int clickPrev = radio1.clickButtonPrev();
        assertEquals(9, clickPrev);
    }

    // проверяем ввод номера радио, граничное значение 10
    @Test
    void validInputNumberRadio9() {
        Radio radio1 = new Radio();
        radio1.setCurrentNumberRadio(10);
        int inputNumber = radio1.inputNumberRadio();
        assertEquals(10, inputNumber);
    }

    //проверяем ввод номера радио, граничное значение 0
    @Test
    void validInputNumberRadio0() {
        Radio radio1 = new Radio();
        radio1.setCurrentNumberRadio(0);
        int inputNumber = radio1.inputNumberRadio();
        assertEquals(0, inputNumber);
    }

    // проверяем ввод невалидного номера радио: -1
    @Test
    void invalidInputNumberRadioLess0() {
        Radio radio1 = new Radio();
        radio1.setCurrentNumberRadio(-1);
        int inputNumber = radio1.inputNumberRadio();
        assertEquals(0, inputNumber);
    }

    //проверяем ввод невалидного номера радио: 11
    @Test
    void invalidInputNumberRadioMore9() {
        Radio radio1 = new Radio();
        radio1.setCurrentNumberRadio(11);
        int inputNumber = radio1.inputNumberRadio();
        assertEquals(0, inputNumber);
    }

    //проверяем увеличение громкости звука при максимальном значение
    @Test
    void clickSoundPlusMore10() {
        Radio radio1 = new Radio();
        radio1.setCurrentSoundVolume(100);
        int clickPlus = radio1.changeVolumeSoundPlus();
        assertEquals(100, clickPlus);
    }

    //проверяем верное увеличение громкости звука
    @Test
    void clickSoundPlusMore0() {
        Radio radio1 = new Radio();
        radio1.setCurrentSoundVolume(0);
        int clickPlus = radio1.changeVolumeSoundPlus();
        assertEquals(1, clickPlus);
    }

    // проверяем уменьшение громкости звука на минимальном значение
    @Test
    void clickSoundMinusLess0() {
        Radio radio1 = new Radio();
        radio1.setCurrentSoundVolume(0);
        int clickMinus = radio1.changeVolumeSoundMinus();
        assertEquals(0, clickMinus);
    }

    // проверяем верное умешьшение громкости звука
    @Test
    void clickSoundMinusLess10() {
        Radio radio1 = new Radio();
        radio1.setCurrentSoundVolume(100);
        int clickMinus = radio1.changeVolumeSoundMinus();
        assertEquals(99, clickMinus);
    }

    // проверяем выполнение условия при громкости звука больше 100
    @Test
    void invalidClickSoundPlusMore10() {
        Radio radio1 = new Radio();
        radio1.setCurrentSoundVolume(101);
        int clickPlus = radio1.changeVolumeSoundPlus();
        assertEquals(1, clickPlus);
    }

    // проверяем выполнение условия при громксти звука меньше 0
    @Test
    void invalidClickSoundMinusLess0() {
        Radio radio1 = new Radio();
        radio1.setCurrentSoundVolume(-1);
        int clickMinus = radio1.changeVolumeSoundMinus();
        assertEquals(0, clickMinus);
    }

}