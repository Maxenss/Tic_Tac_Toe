import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Игровое поле
        char field[][] = new char[3][3];
// ' ', 'o', 'x'
        // 'x' - первый игрок
        // 'o' - второй игрок
        Scanner scanner = new Scanner(System.in);

        // Флаг хода текущего игрока
        int playerFlag = 0;
        playerFlag = 1;

        // Строка для хода
        int row = 0;
        // Столбец для хода
        int column = 0;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = ' ';
            }
        }

        while (true) {
            // Вывод игрового поля на экран
            System.out.println(field[0][0] + "|" +
                    field[0][1] + "|" + field[0][2]);
            System.out.println("_____");
            System.out.println(field[1][0] + "|" +
                    field[1][1] + "|" + field[1][2]);
            System.out.println("_____");
            System.out.println(field[2][0] + "|" +
                    field[2][1] + "|" + field[2][2]);

            System.out.println("Игрок номер " +
                    playerFlag + " делает ход : ");

            // Ввод строки
            do {
                System.out.println("Укажите строку для хода (1-3) : ");
                row = scanner.nextInt();
            } while (row <= 0 || row > 3);

            // Ввод столбца
            do {
                System.out.println("Укажите столбец для хода (1-3) : ");
                column = scanner.nextInt();
            } while (column <= 0 || column > 3);

            --row;
            --column;

            // Заполнения клетки поля
            if (field[row][column] == ' ') {
                if (playerFlag == 1) {
                    field[row][column] = 'x';
                } else {
                    field[row][column] = 'o';
                }
            }

            // Проверка на победу
            // Добавить проверки

            if (field[0][0] == field[0][1] &&
                    field[0][1] == field[0][2] &&
                    field[0][2] != ' ') {
                if (field[0][0] == 'x') {
                    System.out.println("Победил первый игрок");
                } else {
                    System.out.println("Победил второй игрок");
                }
                break;
            }
            if (field[1][0] == field[1][1] &&
                    field[1][2] == field[1][1] &&
                    field[1][1] != ' ') {
                if (field[1][0] == 'x') {
                    System.out.println("Победил первый игрок");
                } else {
                    System.out.println("Победил второй игрок");
                }
                break;
            }
            if (field[2][0] == field[2][1] &&
                    field[2][2] == field[2][1] &&
                    field[2][1] != ' ') {
                if (field[2][0] == 'x') {
                    System.out.println("Победил первый игрок");
                } else {
                    System.out.println("Победил второй игрок");
                }
                break;
            }
            if (field[0][0] == field[1][0] &&
                    field[1][0] == field[2][0] &&
                    field[2][0] != ' ') {
                if (field[0][0] == 'x') {
                    System.out.println("Победил первый игрок");
                } else {
                    System.out.println("Победил второй игрок");
                }
                break;
            }
            if (field[0][1] == field[1][1] &&
                    field[2][1] == field[1][1] &&
                    field[1][1] != ' ') {
                if (field[0][1] == 'x') {
                    System.out.println("Победил первый игрок");
                } else {
                    System.out.println("Победил второй игрок");
                }
                break;
            }
            if (field[0][2] == field[1][2] &&
                    field[2][2] == field[1][2] &&
                    field[1][2] != ' ') {
                if (field[0][2] == 'x') {
                    System.out.println("Победил первый игрок");
                } else {
                    System.out.println("Победил второй игрок");
                }
                break;
            }
            if (field[0][0] == field[1][1] &&
                    field[1][1] == field[2][2] &&
                    field[2][2] != ' ') {
                if (field[0][0] == 'x') {
                    System.out.println("Победил первый игрок");
                } else {
                    System.out.println("Победил второй игрок");
                }

                break;
            }
            if (field[0][2] == field[1][1] &&
                    field[1][1] == field[2][0] &&
                    field[2][0] != ' ') {
                if (field[0][2] == 'x') {
                    System.out.println("Победил первый игрок");
                } else {
                    System.out.println("Победил второй игрок");
                }

                break;
            }

            if (playerFlag == 1) {
                playerFlag = 2;
            } else {
                playerFlag = 1;
            }
        }


    }
}
