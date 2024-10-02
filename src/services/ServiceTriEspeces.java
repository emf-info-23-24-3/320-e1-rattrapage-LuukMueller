package services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import models.EspeceDetail;

public class ServiceTriEspeces {

    /**
     * Trie la listeDesEpspece par ordre alphabétiquer du nom commun, sans modifier
     * l'ordre de la liste passée en paramètre
     * 
     * @param lstEspeceDetails la liste des espèces à trier.
     * 
     * @return une nouvelle liste des espèces triées
     */
    public ArrayList<EspeceDetail> getEspecesTrieesParNomCommun(ArrayList<EspeceDetail> lstEspeceDetails) {
        ArrayList<EspeceDetail> resultat = new ArrayList<>();
        resultat.addAll(lstEspeceDetails);
        Collections.sort(resultat);

        return resultat;
    }

    /**
     * Trie la listeDesEpspece par ordre alphabétiquer du nom scientifique, sans
     * modifier l'ordre de la liste
     * passée en paramètre
     * 
     * @param lstEspeceDetails la liste des espèces à trier.
     * 
     * @return une nouvelle liste des espèces triées
     */
    public ArrayList<EspeceDetail> getEspecesTrieesParNomScientifique(ArrayList<EspeceDetail> lstEspeceDetails) {
        ArrayList<EspeceDetail> resultat = new ArrayList<>();
        resultat.addAll(lstEspeceDetails);
        Collections.sort(resultat);

        return resultat;
    }

    /**
     * Trie la listeDesEpspece par le nombre de ponte. Si le nombre de ponte est
     * égale entre deux espèces, trie alors par la durée de séjour au nid.
     * 
     * @param lstEspeceDetails la liste des espèces à trier.
     * 
     * @return une nouvelle liste des espèces triées
     */
    public ArrayList<EspeceDetail> getEspecesTrieesParPonte(ArrayList<EspeceDetail> lstEspeceDetails) {
        ArrayList<EspeceDetail> resultat = new ArrayList<>();
        resultat.addAll(lstEspeceDetails);
        Collections.sort(resultat);

        return resultat;
    }
}
