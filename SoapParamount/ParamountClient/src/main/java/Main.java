import generated.ParamountSoap.Film;
import generated.ParamountSoap.ParamountService;
import generated.ParamountSoap.ParamountSoap;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ParamountSoap paramountSoap = new ParamountSoap();

        ParamountService paramountService = paramountSoap.getParamountServicePort();
        boolean continuer = true;
        Scanner in = new Scanner(System.in);

        System.out.println("Client SOAP pour Paramount");
        while(continuer){
            System.out.println("---------------------------------------------");
            System.out.println("Faite un choix : ");
            System.out.print(">");
            String choix = in.nextLine().toUpperCase();


            if ("COMMANDES".equals(choix)) {
                System.out.println("Voici la liste des commandes : ");
                System.out.println("find all : affiche tout les films de CenturyFox ");
                System.out.println("find : affiche un film selon l'id donné");
                System.out.println("delete : supprime un film selon l'id donné");
                System.out.println("add : ajoute un film avec les informations donnés");
                System.out.println("edit : modifie un film selon les informations donnés");
            } else if ("QUITTER".equals(choix)) {
                System.out.println("Au revoir");
                continuer = false;
            } else if ("FIND".equals(choix)) {
                try {
                    System.out.println("Entrer l'id du film");
                    System.out.print(">");
                    String idFind = in.nextLine();
                    Film filmFind = paramountService.getFilm(Integer.parseInt(idFind));
                    System.out.println("---------------------------------------------");
                    System.out.println("Titre : " + filmFind.getTitre());
                    System.out.println("Description : " + filmFind.getDescription());
                    System.out.println("Date Sortie : " + filmFind.getDateSortie());
                    System.out.println("Prix Visionnement : " + filmFind.getPrixVisionnement());
                } catch (Exception e) {
                    System.out.println("Erreur, veuillez essayer un autre id");
                }
            } else if ("FIND ALL".equals(choix)) {
                try {
                    List<Film> listeTemp = paramountService.getFilms();
                    for (Film film : listeTemp) {
                        System.out.println("---------------------------------------------");
                        System.out.println("ID : " + film.getId());
                        System.out.println("Titre : " + film.getTitre());
                        System.out.println("Description : " + film.getDescription());
                        System.out.println("Date Sortie : " + film.getDateSortie());
                        System.out.println("Prix Visionnement : " + film.getPrixVisionnement());
                    }
                } catch (Exception e) {
                    System.out.println("Erreur, veuillez vérifier que votre BD ne soit pas vide.");
                }
            } else if ("DELETE".equals(choix)) {
                try {
                    System.out.println("Entrer l'id du film");
                    System.out.print(">");
                    String idDelete = in.nextLine();
                    boolean repDelete = paramountService.delete(Integer.parseInt(idDelete));
                    System.out.println("Le film avec l'id " + idDelete + " est supprimé");
                } catch (Exception e) {
                    System.out.println("Erreur, veuillez essayer un autre id");
                }
            } else if ("ADD".equals(choix)) {
                try {
                    String titreAdd, descriptionAdd, dateAdd, lienAdd;
                    double prixAdd;

                    System.out.println("Entrer le titre du film");
                    System.out.print(">");
                    titreAdd = in.nextLine();
                    System.out.println("Entrer la description");
                    System.out.print(">");
                    descriptionAdd = in.nextLine();
                    System.out.println("Entrer la date du film (yyyy-MM-dd)");
                    System.out.print(">");
                    dateAdd = in.nextLine();
                    System.out.println("Entrer le lien du film");
                    System.out.print(">");
                    lienAdd = in.nextLine();
                    System.out.println("Entrer le prix de visionnement du film");
                    System.out.print(">");
                    prixAdd = Double.parseDouble(in.nextLine());
                    paramountService.add(titreAdd, dateAdd, descriptionAdd, prixAdd, lienAdd);
                    System.out.println("Film ajouté");
                } catch (Exception e) {
                    System.out.println("Erreur, veuillez vérifier les champs");
                }
            } else if ("EDIT".equals(choix)) {
                try {
                    String titreEdit, descriptionEdit, dateEdit, lienEdit;
                    double prixEdit;
                    int idEdit;

                    System.out.println("Entrer l'id du film");
                    System.out.print(">");
                    idEdit = Integer.parseInt(in.nextLine());
                    System.out.println("Entrer le titre du film");
                    System.out.print(">");
                    titreEdit = in.nextLine();
                    System.out.println("Entrer la description");
                    System.out.print(">");
                    descriptionEdit = in.nextLine();
                    System.out.println("Entrer la date du film (yyyy-MM-dd)");
                    System.out.print(">");
                    dateEdit = in.nextLine();
                    System.out.println("Entrer le lien du film");
                    System.out.print(">");
                    lienEdit = in.nextLine();
                    System.out.println("Entrer le prix de visionnement du film");
                    System.out.print(">");
                    prixEdit = Double.parseDouble(in.nextLine());
                    paramountService.edit(idEdit, titreEdit, dateEdit, descriptionEdit, prixEdit, lienEdit);
                    System.out.println("Film modifié");
                } catch (Exception e) {
                    System.out.println("Erreur, veuillez vérifier les champs");
                }
            } else {
                System.out.println("Commande invalide.");
            }

        }
    }

}