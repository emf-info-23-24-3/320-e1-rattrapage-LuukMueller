package models;

public abstract class Espece implements IEspeceInfo, Comparable {
    private final String nomCommun;
    private final String nomScientifique;
    private final String description;

    public Espece(String nomCommun, String nomScientifique, String description) {
        this.nomCommun = nomCommun;
        this.nomScientifique = nomScientifique;
        this.description = description;
    }

    public String getNomCommun() {
        return nomCommun;
    }

    public String getNomScientifique() {
        return nomScientifique;
    }

    public String getDescription() {
        return description;
    }

    public abstract int compareTo(Espece espece);

}
