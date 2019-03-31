package ru.avalon.java.dev.j10.labs.commons;
/**
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
public class Address{
    
    private String  country;
    private String  city;
    private String  houseNumber;
    private int     roomNumber;
    private int     index;
    
    /*  TODO (Проверка №1)
        - Можно добавить поля - Область, корпус.
        - Добавить коментарии к полям и методам класса
        - Сделать несколько конструкторов с разным количеством входящих параметров
        Пример: один с полным набором параметров, второй без № квартиры, третий -
        без № корпуса, четвертый - без № корпуса и № квартиры.
    */
    
     /*  TODO (Проверка №2)
        - Добавить коментарии к полям и методам класса
        - Сделать несколько конструкторов с разным количеством входящих параметров
        Пример: один с полным набором параметров, второй без № квартиры, третий -
        без № корпуса, четвертый - без № корпуса и № квартиры.
    */

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
 
    public String getHouseNumber() {
        return houseNumber;
    }

    public int getIndex() {
        return index;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Address(String country, String city, String houseNumber, int roomNumber, int index) {
        this.country        = country;
        this.city           = city;
        this.houseNumber    = houseNumber;
        this.roomNumber     = roomNumber;
        this.index          = index;
    }

    public Address() {
        this("Default", "Default", "Default", 0, 0);        
    }
    
       
    
    
}