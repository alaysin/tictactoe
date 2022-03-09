package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grid = "_________";
        gridMaker(grid);
        String [][] newGrid = arrayMaker(grid);

        boolean gameEnd = false;
        boolean isFull = false;
        while (!gameEnd && !isFull) {
            addNew(newGrid, "X");
            gameEnd = winCheckerBool(newGrid);
            isFull = isFull(newGrid);
            if (!gameEnd && !isFull) {
                addNew(newGrid, "O");
                gameEnd = winCheckerBool(newGrid);
                isFull = isFull(newGrid);
            }
        }

    }

    public static void gridMaker(String grid) {
        System.out.println("---------");
        System.out.println("| " + grid.charAt(0) + " " + grid.charAt(1) + " " + grid.charAt(2) + " |");
        System.out.println("| " + grid.charAt(3) + " " + grid.charAt(4) + " " + grid.charAt(5) + " |");
        System.out.println("| " + grid.charAt(6) + " " + grid.charAt(7) + " " + grid.charAt(8) + " |");
        System.out.println("---------");
    }

    public static void winChecker(String[][] array) {

        boolean rowsX = rowsArray(array, "X");
        boolean rowsY = rowsArray(array, "O");
        boolean columnX = columnArray(array, "X");
        boolean columnY = columnArray(array, "O");
        boolean isFull = isFull(array);
        boolean diagonalX = diagonal(array, "X");
        boolean diagonalY = diagonal(array, "Y");
        boolean draw = draw(array);
        boolean impossible = impossible(array);

        if (draw) {
            System.out.println("Draw");
        } else {
            if (rowsX && !rowsY ||
                    columnX && !columnY ||
                    diagonalX && !diagonalY) {
                System.out.println("X wins");
            } else if (!rowsX && rowsY ||
                    !columnX && columnY ||
                    !diagonalX && diagonalY) {
                System.out.println("O wins");

            } else if (rowsX && rowsY ||
                    columnX && columnY
                    || impossible) {
                System.out.println("Impossible");
            } else if (!isFull) {
                System.out.println("Game not finished");
            } else {
                System.out.println("Draw");
            }
        }
    }

    public static boolean winCheckerBool(String[][] array) {

        boolean rowsX = rowsArray(array, "X");
        boolean rowsO = rowsArray(array, "O");
        boolean columnX = columnArray(array, "X");
        boolean columnO = columnArray(array, "O");
        boolean isFull = isFull(array);
        boolean diagonalX = diagonal(array, "X");
        boolean diagonalO = diagonal(array, "O");
        boolean draw = draw(array);
        boolean impossible = impossible(array);
        boolean winChecker = false;

        if (draw) {
            System.out.println("Draw");
        } else {
            if (rowsX && !rowsO ||
                    columnX && !columnO ||
                    diagonalX && !diagonalO) {
                winChecker = true;
                System.out.println("X wins");
            } else if (!rowsX && rowsO ||
                    !columnX && columnO ||
                    !diagonalX && diagonalO) {
                System.out.println("O wins");
                winChecker = true;

            } else if (rowsX && rowsO ||
                    columnX && columnO
                    || impossible) {
                System.out.println("Impossible");
            }else if(isFull){
                System.out.println("Draw");
            }
        }
        return winChecker;
    }

    public static boolean impossible(String[][] array) {
        boolean impossible = false;
        int counterX = 0;
        int counterY = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equals("X")) {
                    counterX++;
                } else if (array[i][j].equals("O")) {
                    counterY++;
                }
            }
        }
        if (counterX - counterY >= 2 ||
                counterY - counterX >= 2) {

            impossible = true;
        }
        return impossible;
    }

    public static boolean draw(String[][] array) {

        boolean drawCol = false;
        boolean drawRow = false;
        int counterCol = 3;
        int counterRow = 3;
        for (int i = 0; i < 3; i++) {
            if (array[0][i].isEmpty()) {
                counterRow--;
            }
            if (array[1][i].isEmpty()) {
                counterRow--;
            }
            if (array[2][i].isEmpty()) {
                counterRow--;
            }
            if (counterRow < 3) {
                drawRow = true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (array[i][0].isEmpty()) {
                counterCol--;
            }
            if (array[i][1].isEmpty()) {
                counterCol--;
            }
            if (array[i][2].isEmpty()) {
                counterCol--;
            }
            if (counterCol < 3) {
                drawCol = true;
            }
        }

        return drawCol && drawRow;
    }

    public static boolean isFull(String[][] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equals("X") || array[i][j].equals("O")) {
                    counter++;
                }
            }

        }
        return counter == 9;
    }

    public static boolean rowsArray(String[][] array, String xo) {
        boolean rows = false;
        int counter = 0;

        for (int i = 0; i < 3; i++) {
            if (!rows) {
                for (int j = 0; j < 3; j++) {
                    if (array[i][j].equals(xo)) {
                        counter++;
                    }
                    if (counter == 3) {
                        rows = true;
                    }

                }
            }
            counter = 0;
        }
        return rows;
    }

    public static boolean columnArray(String[][] array, String xo) {
        boolean column = false;
        for (int i = 0; i < 3; i++) {
            if (array[0][i].equals(xo)
                    && array[1][i].equals(xo)
                    && array[2][i].equals(xo)
            ) {
                column = true;
            }
        }
        return column;
    }

    public static boolean diagonal(String[][] array, String xo) {
        boolean diagonal = false;
        if (array[0][0].equals(xo)
                && array[1][1].equals(xo)
                && array[2][2].equals(xo) ||
                array[2][0].equals(xo)
                        && array[1][1].equals(xo)
                        && array[0][2].equals(xo)
        ) {
            diagonal = true;
        }

        return diagonal;
    }

    public static String[][] arrayMaker(String grid) {
        int number = 0;
        String[][] gridArray = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gridArray[i][j] = String.valueOf(grid.charAt(number));
                number++;
            }
        }
        return gridArray;
    }

    public static void arrayPrint(String[][] array) {
        System.out.println("---------");
        for (int i = 0; i < array.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");
    }

    public static void addNew(String[][] array, String xo) {
        System.out.println("Enter the coordinates: ");
        Scanner scanner = new Scanner(System.in);


        boolean validResponce = false;
        int first = 0;
        int second = 0;
        while (!validResponce) {
            try {
                String[] input = scanner.nextLine().split("\\s+");
                first = Integer.parseInt(input[0]);
                second = Integer.parseInt(input[1]);
                validResponce = true;
            } catch (Exception ex) {
                System.out.println("You should enter numbers!");
            }
        }

        if (first > 3 || first < 0 || second > 3 || second < 0) {
            System.out.println("Coordinates should be from 1 to 3!");
            addNew(array, xo);
        } else {
            boolean filled = isFilled(array, first, second);
            if (!filled) {
                add(array, first, second, xo);
                arrayPrint(array);
            } else {
                System.out.println("This cell is occupied! Choose another one!");
                addNew(array, xo);
            }
        }

    }


    public static void add(String[][] array, int a, int b, String xo) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (a - 1 == i && b - 1 == j) {
                    array[i][j] = xo;
                }
            }
        }
    }

    public static boolean isFilled(String[][] array, int a, int b) {
        boolean filled = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == a - 1 && j == b - 1) {
                    if (array[i][j].equals("X")
                            || array[i][j].equals("O")) {
                        filled = true;
                    }
                }
            }
        }
        return filled;
    }

}
