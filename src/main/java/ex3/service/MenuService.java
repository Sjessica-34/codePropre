package ex3.service;

/**
 * Classe qui affiche le menu
 *
 */
public class MenuService {

    /**
     * Fonction d'affichage du menu
     */
    public void afficherMenu() {
        System.out.println("Veuillez choisir une action :");
        System.out.println("1 - Consulter la liste des animaux");
        System.out.println("2 - Ajouter un animal");
        System.out.println("3 - Calculer ration moyenne");
        System.out.println("4 - Quitter");
    }

}