package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    //проверяем работу кнопки Next, переключение с максим кол-вом радиостанции на 0
    @Test
    void clickNextWithMaxOn0() {
        Radio radio1 = new Radio(10);
        int clickNext = radio1.clickButtonNext();
        assertEquals(1, clickNext);
    }

    //установка макисмального количество радиостанций < 0
    @Test
    void maxNumberRadioLess0() {
        Radio radio1 = new Radio(10);
        radio1.setMaxNumberRadio(-1);
        int maxNumber = radio1.getMaxNumberRadio();
        assertEquals(10, maxNumber);
    }

    //установка макисмального количество радиостанций > 0
    @Test
    void validMaxNumberRadio() {
        Radio radio1 = new Radio(10);
        radio1.setMaxNumberRadio(11);
        int maxNumber = radio1.getMaxNumberRadio();
        assertEquals(11, maxNumber);
    }
//работа кнопки Next, если текущий номер радиостанции равен максимальному номеру радиостанции
    @Test
    void currentNumberRadioEquallyMaxRadio(){
        Radio radio1=new Radio(10);
        radio1.setCurrentNumberRadio(10);
        int clickNext=radio1.clickButtonNext();
        assertEquals(0, clickNext);
    }

    //проверяем работу кнопки Next, валидное переключение с 0 на 1
    @Test
    void clickNextWith0on1() {
        Radio radio1 = new Radio(10);
        radio1.setCurrentNumberRadio(0);
        int clickNext = radio1.clickButtonNext();
        assertEquals(1, clickNext);
    }

    //проверяем неверное значение исходного номера радио, больше максимального
    @Test
    void invalidClickNext10() {
        Radio radio1 = new Radio(10);
        radio1.setCurrentNumberRadio(11);
        int clickNext = radio1.clickButtonNext();
        assertEquals(1, clickNext);
    }

    //проверяем неверное значение исходного номера радио (< 0)
    @Test
    void invalidClickNextNumberLess0() {
        Radio radio1 = new Radio(10);
        radio1.setCurrentNumberRadio(-1);
        int clickNext = radio1.clickButtonNext();
        assertEquals(1, clickNext);
    }

    //проверяем работу кнопки Prev, переключение с 0 на максимальное кол-во радиостанций
    @Test
    void clickPrevWith0onMax() {
        Radio radio1 = new Radio(10);
        radio1.setCurrentNumberRadio(0);
        int clickPrev = radio1.clickButtonPrev();
        assertEquals(10, clickPrev);
    }

    // проверяем работу кнопки Prev, валидное переключение с максим.номера радиостанции на предыдущую
    @Test
    void clickPrevWithMax() {
        Radio radio1 = new Radio(10);
        radio1.setCurrentNumberRadio(10);
        int clickPrev = radio1.clickButtonPrev();
        assertEquals(9, clickPrev);
    }

    // проверяем ввод номера радио, граничное значение max
    @Test
    void validInputNumberRadio9() {
        Radio radio1 = new Radio(10);
        int inputNumber = radio1.inputNumberRadio(10);
        assertEquals(10, inputNumber);
    }

    //проверяем ввод номера радио, граничное значение 0
    @Test
    void validInputNumberRadio0() {
        Radio radio1 = new Radio();
        int inputNumber = radio1.inputNumberRadio(0);
        assertEquals(0, inputNumber);
    }

    // проверяем ввод невалидного номера радио: -1
    @Test
    void invalidInputNumberRadioLess0() {
        Radio radio1 = new Radio(10);
        int inputNumber = radio1.inputNumberRadio(-1);
        assertEquals(0, inputNumber);
    }

    //проверяем ввод невалидного номера радио: больше максимального кол-во радиостанций
    @Test
    void invalidInputNumberRadioMore9() {
        Radio radio1 = new Radio(10);
        int inputNumber = radio1.inputNumberRadio(11);
        assertEquals(0, inputNumber);
    }

    //проверяем увеличение громкости звука при максимальном значение
    @Test
    void clickSoundPlusMore100() {
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
    void clickSoundMinusLess100() {
        Radio radio1 = new Radio();
        radio1.setCurrentSoundVolume(100);
        int clickMinus = radio1.changeVolumeSoundMinus();
        assertEquals(99, clickMinus);
    }

    // проверяем выполнение условия при громкости звука больше 100
    @Test
    void invalidClickSoundPlusMore100() {
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