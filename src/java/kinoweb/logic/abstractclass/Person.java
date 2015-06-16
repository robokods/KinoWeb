/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kinoweb.logic.abstractclass;

/**
 *
 * @author Дмитрий
 */
abstract public class Person {
    private final int age;
    private final String name;
    private final String role;
    private final String surname;
    private final int yearBorn;
    private final int yearDied;
    
    
    public Person() {
        age = 0;
        name = "Нет";
        role = "Нет";
        surname = "Нет";
        yearBorn = 0;
        yearDied = 0;
    }
    
    abstract public void SetAge(int age);
    abstract public void SetName(String name);
    abstract public void SetSurname(String surname);
    abstract public void SetYearBorn(int yearBorn);
    abstract public void SetYearDied(int yearDied);
    
    abstract public int GetAge();
    abstract public String GetName();
    abstract public String GetRole();
    abstract public String GetSurname();
    abstract public int GetYearBorn();
    abstract public int GetYearDied();
}
