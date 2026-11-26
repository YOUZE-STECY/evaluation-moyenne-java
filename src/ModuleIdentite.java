import java.util.Scanner;

public class ModuleIdentite {

    public static void saisirIdentite() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom de l'etudiant : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez le prenom de l'etudiant : ");
        String prenom = scanner.nextLine();

        System.out.print("Entrez le matricule : ");
        String matricule = scanner.nextLine();

        System.out.print("Entrez le niveau (ex: L1, L2) : ");
        String niveau = scanner.nextLine();

        System.out.print("Entrez la filiere : ");
        String filiere = scanner.nextLine();

        System.out.println("\n--- Identite enregistree ---");
        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("Matricule : " + matricule);
        System.out.println("Niveau : " + niveau);
        System.out.println("Filiere : " + filiere);
    }

    public static void main(String[] args) {
        saisirIdentite();
    }
}