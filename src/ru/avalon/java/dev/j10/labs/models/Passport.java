package ru.avalon.java.dev.j10.labs.models;
import java.time.LocalDate;


/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {
    
    private String serial;                      //Серия номер паспорта
    private String name;                        //Имя
    private String surname;                     //Фамилия
    private String fatherName;                  //Отчество
    private String secondName;                  //Второе имя
    private LocalDate birthDate;                //Дата рождения
    private LocalDate passportDate;             //Дата выдачи
    private String department;                  //Место выдачи
    
    public String getSerial(){
        return serial;
    }
    public String getName(){
        return name;
    }   
    public String getSurname(){
        return surname;
    }   
    public String getFatherName(){
        return fatherName;
    }                 
    public String getSecondName(){
        return secondName;
    }                  
    public LocalDate getBirthDate(){
        return birthDate;
    }       
    public LocalDate getPassportDate(){
        return passportDate;
    } 
    public String getDepartment(){
        return department;
    }; 
    
    

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */

    public Passport(String serial, String name, String surname, String fatherName, 
            String secondName, String department) {
        this.serial = serial;
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.secondName = secondName;
        this.department = department;
    }

    /*  TODO (Проверка №1)
        - В конструкторе  не все используются поля класса, негде задать дату рождения,
        дату выдачи
        - Создать конструктор с полным набором полей класса и определить еще
        несколько конструкторов с возможно отсутствующими папараметрами.
        - Не логичные заглушки для конструктора по-умолчанию Passport()
    */
    
    public Passport() {
        this("", "", "", "", "", "");
    }
        

 }
