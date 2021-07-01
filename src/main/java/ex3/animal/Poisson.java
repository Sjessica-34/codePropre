package ex3.animal;

/**
 * Classe fille d'animal, entité poisson
 *
 */
public class Poisson extends Animal {

    /**
     * Constructor
     *
     * @param nomAnimal
     * @param comportement
     */
    public Poisson(String nomAnimal, Comportement comportement) {
        super(nomAnimal, comportement);
        this.type = AnimalType.POISSON;
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