package services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ServiceFormatageDate {

   /**
     * Formate une date selon avec le style FULL de la locale par défaut. 
     * Pour la Suisse romande, le résultat sera par exemple jeudi 5 septembre 2024 
     * 
     * @param date la date de type LocalDate
     * 
     * @return la date formatée
     */
    public String formaterDate(LocalDate date) {
    DateTimeFormatter formatteur = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    String dateFormatee = date.format(formatteur);
    return dateFormatee;
    }
}
