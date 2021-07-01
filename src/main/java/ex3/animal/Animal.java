package ex3.animal;

/**
 * Classe mère des Animaux
 *
 *
 */
public abstract class Animal {

    protected String nomAnimal;
    protected Comportement comportement;
    protected AnimalType type;

    /**
     * Constructor
     *
     * @param nomAnimal
     * @param animalType
     * @param comportement
     */
    public Animal(String nomAnimal, Comportement comportement) {
        super();
        this.nomAnimal = nomAnimal;
        this.comportement = comportement;

    }

    /**
     * Getter
     *
     * @return the nomAnimal
     */
    public String getNomAnimal() {
        return nomAnimal;
    }

    /**
     * Setter
     *
     * @param nomAnimal the nomAnimal to set
     */
    public void setNomAnimal(String nomAnimal) {
        this.nomAnimal = nomAnimal;
    }

    /**
     * Getter
     *
     * @return the comportement
     */
    public Comportement getComportement() {
        return comportement;
    }

    /**
     * Setter
     *
     * @param comportement the comportement to set
     */
    public void setComportement(Comportement comportement) {
        this.comportement = comportement;
    }

    /**
     * Getter
     *
     * @return the type
     */
    public AnimalType getType() {
        return type;
    }

    /**
     * Setter
     *
     * @param type the type to set
     */
    public void setType(AnimalType type) {
        this.type = type;
    }

}
