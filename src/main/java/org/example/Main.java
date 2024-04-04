package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        int[] myNums = {5, 2, 7};
//        int winningScore = 3;
//        int scoreUser = 0;
//        int positionNumber = 0;
//        boolean numberIsInArray = false;
//
//        System.out.println("Essayez de deviner les trois nombres présents dans le tableau");
//
//        do {
//            System.out.println("Entrez un nombre entre 1 et 10");
//            int choiceUser = scanner.nextInt();
//
//            for (int i = 0; i < myNums.length; i++) {
//                if (choiceUser == myNums[i]) {
//                    numberIsInArray = true;
//                    positionNumber = i + 1;
//                }
//
//            }
//            if (choiceUser < 1 || choiceUser > 10) {
//                System.out.println("Sasie incorrecte ! Entrer un nombre entre 1 et 10");
//            } else if (numberIsInArray) {
//                System.out.println("Bravo ! le numéro " + choiceUser + " est présent à la position " + positionNumber);
//                scoreUser++;
//            } else {
//                System.out.println("Perdu ! le numéro " + choiceUser + " n'est pas présent dans le tableau");
//            }
//
//            numberIsInArray = false;
//
//            if (scoreUser == winningScore) {
//                System.out.println("Vous avez gagné ! vous avez trouvé l'ensemble des numéros");
//                break;
//            }
//
//        } while(true);

//        int[] numbersArray = {5, 8, 4, 10, 10, 4, 8, 5};
//        int firstChoiceUser = 0;
//        int secondChoiceUser = 0;
//        boolean[] matchNumbers = new boolean[numbersArray.length];
//        boolean rightChoice = false;
//        int positionFirstNumber = 0;
//        int positionSecondNumber = 0;
//
//        System.out.println("Trouvez les positions des numéros identiques");
//
//        do {
//            boolean allMatch = true;
//            System.out.println("Entrez un nombre entre 1 et 8 pour la position du premier élément");
//            firstChoiceUser = scanner.nextInt() - 1;
//            System.out.println("Entrez un nombre entre 1 et 8 pour la position du second élément");
//            secondChoiceUser = scanner.nextInt() - 1;
//
//            if (!matchNumbers[firstChoiceUser] && !matchNumbers[secondChoiceUser]) {
//
//                for (int i = 0; i < numbersArray.length; i++) {
//                    if (numbersArray[i] == numbersArray[firstChoiceUser]) {
//                        positionFirstNumber = i + 1;
//                    } else if (numbersArray[i] == numbersArray[secondChoiceUser]) {
//                        positionSecondNumber = i + 1;
//                    }
//                }
//                if (numbersArray[firstChoiceUser] == numbersArray[secondChoiceUser]) {
//                    rightChoice = true;
//                    matchNumbers[firstChoiceUser] = true;
//                    matchNumbers[secondChoiceUser] = true;
//                    System.out.println("bravo ! le chiffre " + numbersArray[firstChoiceUser] + " est présent à la position " + positionFirstNumber + " et " + positionSecondNumber);
//                } else {
//                    System.out.println("Non ! Réessaye");
//                }
//
//            } else {
//                System.out.println("Élément déjà trouvé ou saisie invalide");
//            }
//
//            for (boolean element : matchNumbers) {
//                if (!element) {
//                    allMatch = false;
//                }
//            }
//
//            if (allMatch) {
//                System.out.println("Bravo ! Vous avez trouvé l'ensemble des éléments");
//                break;
//            }
//
//
//        } while (true);


//                String[][] grille = new String[5][5];
//
//                for (int i = 0; i < 5; i++) {
//                    for (int j = 0; j < 5; j++) {
//                        grille[i][j] = "-";
//                    }
//                }
//
//                int xPorteAvionUser = (int) (Math.random() * 4);
//                int yPorteAvionUser = (int) (Math.random() * 4);
//                grille[xPorteAvionUser][yPorteAvionUser] = "PU";
//
//                int xCroiseurUser = (int) (Math.random() * 3);
//                int yCroiseurUser = (int) (Math.random() * 3);
//                grille[xCroiseurUser][yCroiseurUser] = "CU";
//
//                int xTorpilleurUser = (int) (Math.random() * 2);
//                int yTorpilleurUser = (int) (Math.random() * 2);
//                grille[xTorpilleurUser][yTorpilleurUser] = "TU";
//
//                int xPorteAvionComputer = (int) (Math.random() * 4);
//                int yPorteAvionComputer = (int) (Math.random() * 4);
//                grille[xPorteAvionComputer][yPorteAvionComputer] = "PC";
//
//                int xCroiseurComputer = (int) (Math.random() * 3);
//                int yCroiseurComputer = (int) (Math.random() * 3);
//                grille[xCroiseurComputer][yCroiseurComputer] = "CC";
//
//                int xTorpilleurComputer = (int) (Math.random() * 2);
//                int yTorpilleurComputer = (int) (Math.random() * 2);
//                grille[xTorpilleurComputer][yTorpilleurComputer] = "TC";
//
//
//                while (true) {
//                    System.out.println("  1 2 3 4 5");
//                    for (int i = 0; i < 5; i++) {
//                        System.out.print((char) ('A' + i) + " ");
//                        for (int j = 0; j < 5; j++) {
//                            System.out.print(grille[i][j] + " ");
//                        }
//                        System.out.println();
//                    }
//                    System.out.print("Entrez la coordonnée x (1 à 5) : ");
//                    int x = scanner.nextInt() - 1;
//                    System.out.print("Entrez la coordonnée y (1 à 5) : ");
//                    int y = scanner.nextInt() - 1;
//
//                    if (x >= 0 && x < 5 && y >= 0 && y < 5) {
//                        if (grille[x][y].equals("PC")) {
//                            System.out.println("Porte avion de l'ordinateur touché !");
//                            grille[x][y] = "*";
//                        } else if (grille[x][y].equals("CC")) {
//                            System.out.println("Croiseur de l'ordinateur touché !");
//                            grille[x][y] = "*";
//                        } else if (grille[x][y].equals("TC")) {
//                            System.out.println("Torpilleur de l'ordinateur touché !");
//                            grille[x][y] = "*";
//                        } else {
//                            System.out.println("À l'eau !");
//                        }
//                    } else {
//                        System.out.println("Coordonnées invalides. Veuillez entrer des nombres entre 1 et 5.");
//                    }
//                }
//            }
//        }

        int gridSize = 5;
        char[][] playerGrid = new char[gridSize][gridSize];
        char[][] computerGrid = new char[gridSize][gridSize];


        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                playerGrid[i][j] = '~';
                computerGrid[i][j] = '~';
            }
        }

        int numShips = 5;

        for (int i = 0; i < numShips; i++) {
            int row = (int) (Math.random() * playerGrid.length);
            int col = (int) (Math.random() * playerGrid[0].length);

            if (playerGrid[row][col] == '~') {
                playerGrid[row][col] = 'S';
            }
        }

        while (true) {

            System.out.println("Votre tour !");
            for (char[] row : playerGrid) {
                for (char cell : row) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }


            System.out.print("Entrez la ligne (0-" + (computerGrid.length - 1) + ") : ");
            int rowComputerGrid = scanner.nextInt();
            System.out.print("Entrez la colonne (0-" + (computerGrid[0].length - 1) + ") : ");
            int colComputerGrid = scanner.nextInt();

            System.out.println("Tour de l'ordinateur !");
            System.out.print("Entrez la ligne (0-5) ");
            int rowPlayerGrid = scanner.nextInt();
            System.out.print("Entrez la colonne (0-5)");
            int colPlayGrid = scanner.nextInt();
        }
    }
}

















