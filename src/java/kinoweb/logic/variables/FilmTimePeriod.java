/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kinoweb.logic.variables;

/**
 *
 * @author Дмитрий
 */
public class FilmTimePeriod {
    private int yearStarted;
    private int yearFinished;
    private final int decade;
    
    public FilmTimePeriod (){
        yearStarted = 0;
        yearFinished = 0;
        decade = 0;
    }
    
    public void SetYearStarted(int yearStarted){
        this.yearStarted = yearStarted;
    }
    public void SetYearFinished(int yearFinished){
        this.yearFinished = yearFinished;
    }
    
    public int GetYearStarted(){
        return yearStarted;
    }
    public int GetYearFinished(){
        return yearFinished;
    }
    
    public int GetDecade(){
        //метод для подсчета в каком десятилетии вышел фильм
        return decade;
    }

}
