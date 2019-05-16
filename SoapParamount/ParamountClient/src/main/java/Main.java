
import generated.CenturyClient.CenturySoap;
import generated.CenturyClient.CenturyFoxService;
import generated.CenturyClient.Film;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        CenturySoap centurySoap = new CenturySoap();
        CenturyFoxService serviceCentury = centurySoap.getCenturyFoxServicePort();


        boolean continuer = true;
        Scanner in = new Scanner(System.in);

        System.out.println("Client SOAP pour CenturyFox");
        while(continuer){
            System.out.println("---------------------------------------------");
            System.out.println("Faite un choix : ");
            System.out.print(">");
            String choix = in.nextLine();

            switch (choix.toUpperCase()){
                case "COMMANDES":
                    System.out.println("Voici la liste des commandes : ");
                    System.out.println("find all : affiche tout les films de CenturyFox ");
                    System.out.println("find : affiche un film selon l'id donné");
                    System.out.println("delete : supprime un film selon l'id donné");
                    System.out.println("add : ajoute un film avec les informations donnés");
                    System.out.println("edit : modifie un film selon les informations donnés");
                    break;
                case "QUITTER":
                    System.out.println("Au revoir");
                    continuer = false;
                    break;
                case "FIND":
                    try {
                        System.out.println("Entrer l'id du film");
                        System.out.print(">");
                        String idFind = in.nextLine();
                        Film filmFind = serviceCentury.getFilm(Integer.parseInt(idFind));
                        System.out.println("---------------------------------------------");
                        System.out.println("Titre : " + filmFind.getTitre());
                        System.out.println("Description : " + filmFind.getDescription());
                        System.out.println("Date Sortie : " + filmFind.getDateSortie());
                        System.out.println("Prix Visionnement : " + filmFind.getPrixVisionnement());
                    }catch (Exception e){
                        System.out.println("Erreur, veuillez essayer un autre id");
                    }
                    break;
                case "FIND ALL":
                    try {
                        List<Film> listeTemp = serviceCentury.getFilms();
                        for (Film film : listeTemp) {
                            System.out.println("---------------------------------------------");
                            System.out.println("ID : " + film.getId());
                            System.out.println("Titre : " + film.getTitre());
                            System.out.println("Description : " + film.getDescription());
                            System.out.println("Date Sortie : " + film.getDateSortie());
                            System.out.println("Prix Visionnement : " + film.getPrixVisionnement());
                        }
                    }catch (Exception e){
                        System.out.println("Erreur, veuillez vérifier que votre BD ne soit pas vide.");
                    }
                    break;
                case "DELETE":
                    try {
                        System.out.println("Entrer l'id du film");
                        System.out.print(">");
                        String idDelete = in.nextLine();
                        boolean repDelete = serviceCentury.delete(Integer.parseInt(idDelete));
                        System.out.println("Le film avec l'id " + idDelete + " est supprimé");
                    }catch (Exception e){
                        System.out.println("Erreur, veuillez essayer un autre id");
                    }
                    break;
                case "ADD":
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
                        serviceCentury.add(titreAdd, dateAdd, descriptionAdd, prixAdd, lienAdd);
                        System.out.println("Film ajouté");
                    }catch (Exception e){
                        System.out.println("Erreur, veuillez vérifier les champs");
                    }
                    break;
                case "EDIT":
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
                        serviceCentury.edit(idEdit, titreEdit, dateEdit, descriptionEdit, prixEdit, lienEdit);
                        System.out.println("Film modifié");
                    }catch (Exception e){
                        System.out.println("Erreur, veuillez vérifier les champs");
                    }
                    break;
                default:
                    System.out.println("Commande invalide.");
                    break;
            }

        }
    }
}