package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */



public class Person {

    Passport pass;
    Address address;

    public Person(Passport pass, Address address) {
        this.pass = pass;
        this.address = address;
    }
    
    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        
        String fullName;
        if(pass.getFatherName()!= ""){
            fullName = pass.getName() + " " + pass.getSurname() + " " + pass.getFatherName();
        } else {
            if ( pass.getSecondName() != ""){
                fullName = pass.getName() + " " + pass.getSecondName().substring(0, 1) + ". " + pass.getSurname();
            } else {
                fullName = pass.getName() + " " + pass.getSurname();
            }
        }
    return fullName;
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        
        /*  TODO (Проверка №1)
            - Не выполняется условие - Если у человека нет ни Отчества ни
            Второго имени
            - Испраить!
        */
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        
        return address.getCountry() + ", " + address.getCity() + ", " +
                address.getHouseNumber() + ", room " + address.getRoomNumber() + 
                ", " + address.getIndex();
    }
}