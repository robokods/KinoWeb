/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kinoweb.logic.variables;

import kinoweb.logic.abstractclass.Person;

/**
 *
 * @author Дмитрий
 */
public class Director extends Person {
    private final String role;
    private String name;
    private String surname;
    private int age;
    private int yearBorn;
    private int yearDied;
    
    public Director (){
        role = "Режиссер";
    }
    
    @Override
    public void SetName(String name){
        this.name = name;
    }
    @Override
    public void SetSurname(String surname){
        this.surname = surname;
    }
    @Override
    public void SetAge(int age){
        this.age = age;
    }
    @Override
    public void SetYearBorn(int yearBorn){
        this.yearBorn = yearBorn;
    }
    @Override
    public void SetYearDied(int yearDied){
        this.yearDied = yearDied;
    }
    
    
    @Override
    public String GetRole(){
        return role;
    }
    @Override
    public String GetName(){
        return name;
    }
    @Override
    public String GetSurname(){
        return surname;
    }
    @Override
    public int GetAge(){
        return age;
    }
    @Override
    public int GetYearBorn(){
        return yearBorn;
    }
    @Override
    public int GetYearDied(){
        return yearDied;
    }
}
