package ru.avalon.java.dev.j10.labs;
import java.time.LocalDate;     

import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.commons.Address;

public class Main {

    public static void main(String[] args) {
        /*
         * FIXME(Студент): Измените определение етода так, чтобы он стал точкой входа в приложение.
         */
        Person ivanov = null;
        Person smith = null;                                                      
        
        /*  TODO (Проверка №1)
            - Ты 2 раза объявляешь переменные - Person ivanov и Person smit.
            Объявление переменных происходит один раз, потом просто пишешь без
            объявление класса, smit = ...  (Person перед переменной не надо ставить) 
            - Убрать лишние строковые переменные
        */
        
        ivanov = new Person(new Passport("404 404", "Иван", "Иванов", "Иванович", "", "17 о.м."),
            new Address());
        smith = new Person(new Passport("301 kk 99", "John", "Smith", "", "Edvard", "USA NPD"),
            new Address("USA", "NY", "4th ave, 75", 141, 192168 ));
        
        System.out.println(ivanov.getFullName());
        System.out.println(ivanov.getAddress());
        System.out.println(smith.getFullName());        
        System.out.println(smith.getAddress());
        
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
