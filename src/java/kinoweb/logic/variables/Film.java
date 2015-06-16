/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kinoweb.logic.variables;

import kinoweb.logic.enumpackage.Genre;
/**
 *
 * @author Дмитрий
 */
public class Film {
    private final Genre ganre; //жанр фильма
    Actor actor = new Actor(); //актер
    Director director = new Director(); //режиссер
    FilmTimePeriod timePeriod = new FilmTimePeriod(); //временной период
    
    public Film (){
        ganre = Genre.no_genre;
    }
    
}
