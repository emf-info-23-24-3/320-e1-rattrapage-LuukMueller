package services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import models.Observation;

public class ServiceIndexationObservations {
    HashMap<String, ArrayList<Observation>> parNomCommun;
    HashMap<LocalDate, ArrayList<Observation>> parDate;
    HashMap<LocalDate, HashMap<String, ArrayList<Observation>>> parNomCommunEtDate;

    /**
     * Constructeur, initialise les attributs de la classe.
     */
    public ServiceIndexationObservations() {
        parDate = new HashMap<>();
        parNomCommun = new HashMap<>();
        parNomCommunEtDate = new HashMap<>();
    }

    /**
     * Indexe la liste des observations afin que les observations puissent être
     * retrouvées très rapidement, ceci par nom commun, par date, et par nom commun
     * et date.
     * 
     * Cette méthode appelle la méthode indexerObservation pour toutes les
     * observations de la liste passée en paramètre.
     * 
     * @param listObservations la liste des observations à indexer
     */
    public void indexerObservations(ArrayList<Observation> listObservations) {
        for (Observation observation : listObservations) {
            indexerObservation(observation);
        }
    }

    /**
     * Indexe l'observation fournie afin que cette observation puisse être retrouvée
     * très rapidement, ceci par nom commun, par date, et par nom commun et date.
     * 
     * @param observation l'observation à indexer
     */
    public void indexerObservation(Observation observation) {
        if (observation != null) {
            ArrayList<Observation> observationsParNomCommun = new ArrayList<>();
            String cle = observation.getNomCommun();
            if (parNomCommun.containsKey(cle)) {
                parNomCommun.get(cle).add(observation);
            } else {
                observationsParNomCommun.add(observation);
                parNomCommun.put(cle, observationsParNomCommun);
            }
        }

        if (observation != null) {
            ArrayList<Observation> observationsParDate = new ArrayList<>();
            LocalDate dateDeObservation = observation.getDate();
            if (parDate.containsKey(dateDeObservation)) {
                parDate.get(dateDeObservation).add(observation);
            } else {
                observationsParDate.add(observation);
                parDate.put(dateDeObservation, observationsParDate);
            }
        }

        if (observation != null) {
            String cle = observation.getNomCommun();
            LocalDate dateDeObservation = observation.getDate();
            ArrayList<Observation> observationsParDateEtNomCommun = new ArrayList<>();
            HashMap<String, ArrayList<Observation>> mapNomCommuneEtDonnees = new HashMap();
            if (parNomCommunEtDate.containsKey(dateDeObservation)) {
                if (parNomCommunEtDate.get(dateDeObservation).containsKey(cle)) {
                    parNomCommunEtDate.get(dateDeObservation).get(cle).add(observation);
                } else {
                    observationsParDateEtNomCommun.add(observation);
                    mapNomCommuneEtDonnees.put(cle, observationsParDateEtNomCommun);
                    parNomCommunEtDate.put(dateDeObservation, mapNomCommuneEtDonnees);
                }
            }
        }

    }

    /**
     * Retourne très rapidement les observations en lien avec le nom commun fourni,
     * triées par ordre chronologique inverse de la date d'observation.
     * (la date la plus récente est au début de la liste)
     * 
     * @param nomCommun le nom correspondant aux observations à retourner
     * @return la liste des observations
     */
    public ArrayList<Observation> getObservationsParNomCommun(String nomCommun) {
        ArrayList<Observation> resultat = new ArrayList<>();
        if (parNomCommun.containsKey(nomCommun)) {
            resultat = parNomCommun.get(nomCommun);
        }
        return resultat;
    }

    /**
     * Retourne très rapidement les observations de la date passée en paramètre.
     * 
     * @param date la date correspondant aux observations à retourner
     * @return la liste des observations
     */
    public ArrayList<Observation> getObservationsParDate(LocalDate date) {
        ArrayList<Observation> resultat = new ArrayList<>();
        if (parDate.containsKey(date)) {
            resultat = parDate.get(date);
        }
        return resultat;
    }

    /**
     * Retourne très rapidement les observations du nom et de la date passés en
     * paramètre,
     * 
     * @param nomCommun le nom correspondant aux observations à retourner
     * @param date      la date correspondant aux observations à retourner
     * @return la liste des observations
     */
    public ArrayList<Observation> getObservationsParNomCommunEtDate(String nomCommun, LocalDate date) {
        ArrayList<Observation> resultat = new ArrayList<>();
        if (parNomCommunEtDate.containsKey(date)) {
            if (parNomCommunEtDate.get(date).containsKey(nomCommun)) {
                resultat = parNomCommunEtDate.get(date).get(nomCommun);
            }
        }
        return resultat;

    }
}
