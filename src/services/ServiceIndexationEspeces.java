package services;

import java.util.ArrayList;


import models.EspeceDetail;

public class ServiceIndexationEspeces {
     

    /**
     * Constructeur, initialise les attributs de la classe.
     */
    public ServiceIndexationEspeces() {
     
    }

    /**
     * Indexe chacune des espèces reçues de manière à ce qu'ensuite la méthode
     * getlstNomCommun() puisse faire son travail très rapidement.
     * 
     * @param listEspeceDetails la liste des espèces à indexer
     */
    public void indexerLesEspeces(ArrayList<EspeceDetail> listEspeces) {
        
     
    }

    /**
     * Retourne rapidement une nouvelle liste de tous les noms communs des espèces,
     * et ce sans doublons et triée par ordre alphabétique.
     * 
     * @return la liste précitée.
     */
    public ArrayList<String> getlstNomCommun() {
      
    }
}
