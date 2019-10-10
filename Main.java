import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selectionnez le mode que vous souhaitez : ");
        int i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println("Quelle est la valeur de a ?");
                double a = sc.nextInt();
                System.out.println("Quelle est la valeur de b ?");
                double b = sc.nextInt();
                System.out.println("Quelle est la valeur de c ?");
                double c = sc.nextInt();
                discriminant(a, b, c);
                break;
            case 2:
                System.out.println("Veuillez saisir un nombre : ");
                int a1 = sc.nextInt();
                parite(a1);
                break;
            case 3:
                System.out.println("Veuillez saisir un nombre : ");
                int a2 = sc.nextInt();
                System.out.println("Veuillez saisir le nombre auquel il faut le comparer : ");
                int b2 = sc.nextInt();
                max(a2, b2);
                break;
            case 4:
                System.out.println("Veuillez saisir une phrase : ");
                String a3 = sc.nextLine();
                System.out.println("Veuillez saisir une autre phrase auquelle on va la comparer : ");
                String b3 = sc.nextLine();
                egaliteStr(a3, b3);
                break;
            case 5:
                System.out.println("Saisir un entier positif ou nul : ");
                int n = sc.nextInt();
                main(n);
                break;
            case 6:
                System.out.println("Veuillez saisir un nombre pour le compte à rebours : ");
                int a4 = sc.nextInt();
                countdown(a4);
                break;
            case 7:
                System.out.println("Veuillez saisir le nombre à mettre au carré : ");
                int a5 = sc.nextInt();
                carre(a5);
                break;
            case 8:
                int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
                tableMultiplication(tableau);
                break;
            case 9:
                System.out.println("Veuillez saisir le numérateur : ");
                double a6 = sc.nextInt();
                double b6;
                do {
                    System.out.println("Veuillez saisir le dénominateur : ");
                    b6 = sc.nextInt();
                } while (b6 == 0);
                division(a6, b6);
                break;
            case 10:
                int a7;
                do {
                    System.out.println("Veuillez saisir la longeur de la règle (positive svp): ");
                    a7 = sc.nextInt();
                } while (a7 == 0);
                regle(a7);
                break;
            case 11:
                int a8;
                do {
                    System.out.println("Veuillez saisir un nombre positif : ");
                    a8 = sc.nextInt();
                } while (a8 == 0);
                isPremier(a8);
                break;
            case 12:
                int[] tableau1 = new int[3];
                Scanner scanner = new Scanner(System.in);
                for (int i1 = 0; i1 < tableau1.length; i1++) {
                    System.out.println("Saisissez un entier : ");
                    int entier = scanner.nextInt();
                    tableau1[i] = entier;
                }
                caracteristique(tableau1);
                break;
            case 13:

                break;
        }
    }

    static void discriminant(double a, double b, double c) {
        Scanner sc = new Scanner(System.in);
        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta < 0) {
            double sqrt = Math.sqrt(-delta);
            double x0 = (-b) / (2 * a);
            double x1 = (sqrt) / (2 * a);
            System.out.println("Ce polynome a deux racines racines complexe qui sont" + x0 + " - " + x1 + "i et " + x0 + " + " + x1 + "i.");
        } else if (delta == 0) {
            double x0 = (-b) / (2 * a);
            System.out.println("Ce polynome a une seule racine reelle qui est " + x0 + ".");
        } else if (delta > 0) {
            double sqrt = Math.sqrt(delta);
            double x1 = (-b - sqrt) / (2 * a);
            double x2 = (-b + sqrt) / (2 * a);
            System.out.println("Ce polynome a deux racines reelles qui sont " + x1 + " et " + x2 + ".");
        }
    }

    static void parite(int a) {
        if (a % 2 == 0) {
            System.out.println("Le nombre " + a + " est paire.");
        } else {
            System.out.println("Le nombre " + a + " n'est pas paire.");
        }
    }

    static void max(int a, int b) {
        if (a > b) {
            System.out.println("Le nombre " + a + " est supérieur au nombre " + b + ". Le maximum est donc " + a + ".");
        } else {
            System.out.println("Le nombre " + b + " est supérieur au nombre " + a + ". Le maximum est donc " + b + ".");
        }
    }

    static void egaliteStr(String a, String b) {
        if (a.equals(b)) {
            System.out.println("Les deux phrases sont les mêmes.");
        } else {
            System.out.println("Les deux phrases ne sont pas les mêmes.");
        }
    }

    static void main(int n) {
        int factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }

    static void countdown(int a) {
        System.out.println("Attention !");
        for (a = a; a >= 0; a--) {
            System.out.println(a);
        }
        System.out.println("BOOM !");
    }

    static void carre(int a) {
        System.out.println(a + "	" + a * a);
    }

    static void tableMultiplication(int tableau[]) {
        for (int i = 0; i < tableau.length - 1; i++) {
            for (int j = 1; j < tableau.length; j++) {
                System.out.print(tableau[i] * j);
                System.out.print("	");
            }
            System.out.println("");
        }

    }

    static void division(double a, double b) {
        System.out.println("Le resultat de la division est " + a / b + ".");
    }

    static void regle(int longeur) {
        for (int i = 0; i < longeur; i++) {
            if (i % 10 == 0) {
                System.out.print("|");
            }
            System.out.print("---------");
        }
    }

    static void isPremier(int a) {
        for (int i = 2; i < (a * a); i++) {
            if (a % i == 0) {
                System.out.println("Ce nombre n'est pas premier");
                break;
            }
        }
        System.out.println("Ce nombre est premier");
    }

    static void caracteristique(int a[]) {
        int valeurMax = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > valeurMax) {
                valeurMax = a[i];
            }
        }
        int valeurMin = valeurMax;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < valeurMin) {
                valeurMin = a[i];
            }
        }
        int S = 0;
        for (int i = 0; i < a.length; i++) {
            S += a[i];
        }
        System.out.print("Les valeurs ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println("sont paire.");
        System.out.print("Les valeurs ");
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println("sont d'indice paire.");
        System.out.println("Somme : " + S);
        System.out.println("Valeur maximum : " + valeurMax);
        System.out.println("Valeur minimum : " + valeurMin);
    }
}
