package models;

public class EspeceDetail extends Espece {
    private final StatutDeMenace statutDeMenace;
    private final CriteresIdentification criteresIdentification;
    private final Caracteristiques caracteristiques;
    private final Population population;
    private ImageSource imageSource;

    public EspeceDetail(String nomCommun, String nomScientifique, String description, StatutDeMenace statutDeMenace,
            CriteresIdentification criteresIdentification, Caracteristiques caracteristiques, Population population,
            ImageSource imageSource) {
        super(nomCommun, nomScientifique, description);
        this.statutDeMenace = statutDeMenace;
        this.criteresIdentification = criteresIdentification;
        this.caracteristiques = caracteristiques;
        this.population = population;
        this.imageSource = imageSource;
    }

    public StatutDeMenace getStatutDeMenace() {
        return statutDeMenace;
    }

    public CriteresIdentification getCriteresIdentification() {
        return criteresIdentification;
    }

    public Caracteristiques getCaracteristiques() {
        return caracteristiques;
    }

    public Population getPopulation() {
        return population;
    }

    public ImageSource getImageSource() {
        return imageSource;
    }

    public void setImageSource(ImageSource imageSource) {
        this.imageSource = imageSource;
    }

    @Override
    public String toString() {
        return "EspeceDetail [statutDeMenace=" + statutDeMenace + ", criteresIdentification=" + criteresIdentification
                + ", caracteristiques=" + caracteristiques + ", population=" + population + ", imageSource="
                + imageSource + "]";
    }

    @Override
    public int compareTo(Espece espece) {
        // TODO Autoprivate final generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }


    

}
