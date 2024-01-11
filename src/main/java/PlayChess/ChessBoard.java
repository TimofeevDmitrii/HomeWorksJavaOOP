package PlayChess;

import java.util.*;

public class ChessBoard {
    protected ChessFigure[][] board = new ChessFigure[8][8];

    protected int currFigNumCoord;
    protected int currFigLettCoord;
    protected String currPlayerColour = "Белый";

    protected Map<Character, Integer> lettersCoordinates = new HashMap();

    public void startPlay(){
        fillLetterMap();
        fillFightField();
    }

    public void fillFightField(){
        int pawnQuantity = 8;
        for (int i=0; i<pawnQuantity; i++){
            board[6][i] = new Pawn("pawn"+i,"Белый",6, i);
        }
        for (int i=0; i<pawnQuantity; i++){
            board[1][i] = new Pawn("pawn"+i,"Черный",1, i);
        }
    }

    private void fillLetterMap(){
        lettersCoordinates.put('A',0);
        lettersCoordinates.put('B',1);
        lettersCoordinates.put('C',2);
        lettersCoordinates.put('D',3);
        lettersCoordinates.put('E',4);
        lettersCoordinates.put('F',5);
        lettersCoordinates.put('G',6);
        lettersCoordinates.put('H',7);
    }

    private int[] getChessCoordinates(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            char[] charCoordinates = sc.next().toCharArray();
//            System.out.println(Arrays.toString(charCoordinates));
//            System.out.println(charCoordinates[0]);
//            System.out.println(charCoordinates[1]);
            if (charCoordinates.length==2){
                if (lettersCoordinates.containsKey(charCoordinates[0]) && Character.isDigit(charCoordinates[1])) {
                    if (Character.getNumericValue(charCoordinates[1])!=9 && Character.getNumericValue(charCoordinates[1])!=0) {
                        int[] coordinates = new int[2];
                        coordinates[0] = lettersCoordinates.get(charCoordinates[0]);
                        coordinates[1] = 8-Character.getNumericValue(charCoordinates[1]);
                        return coordinates;
                    }
                    else
                        System.out.println(String.format("Введенные координаты некорректны: %c - нет такой цифровой координаты", charCoordinates[1]));
                }
                else
                    System.out.println("Введенные координаты некорректны");
            }
            else
                System.out.println("Введенные координаты некорректны: формат ввода - 2 символа, например, \"A2\"");
        }
    }


    private String prompt(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    private void chooseFigure(){
        while (true) {
            if (currPlayerColour.equals("Белый"))
                System.out.println("Ход белых. Выберете фигуру по координатам. ");
            else
                System.out.println("Ход черных. Выберете фигуру по координатам. ");
            int[] coordinates = getChessCoordinates();
//            System.out.println("Введите буквенную координату: ");
//            int letCord = lettersCoordinates.get(prompt());
//            System.out.println("Введите цифровую координату: ");
//            int numCord = Integer.parseInt(prompt())-1;
            int letCord = coordinates[0];
            int numCord = coordinates[1];
            if (!Objects.isNull(board[numCord][letCord]) && board[numCord][letCord].getColour().equals(currPlayerColour)) {
                currFigLettCoord = letCord;
                currFigNumCoord = numCord;
                System.out.println("Выбрана фигура "+ board[currFigNumCoord][currFigLettCoord]);
                return;
            }
            else
                System.out.println("Неверный выбор!");
        }
    }

    private boolean chessMove(){
        System.out.println("Введите координаты для перемещения выбранной фигуры.");
        int[] coordinates = getChessCoordinates();
//        System.out.println("Введите буквенную координату: ");
//        int letCord = lettersCoordinates.get(prompt());
//        System.out.println("Введите цифровую координату: ");
//        int numCord = Integer.parseInt(prompt())-1;
        int letCord = coordinates[0];
        int numCord = coordinates[1];
        if(board[currFigNumCoord][currFigLettCoord].checkGoing(numCord,letCord,board)) {
            board[numCord][letCord] = board[currFigNumCoord][currFigLettCoord];
            board[currFigNumCoord][currFigLettCoord]=null;
            board[numCord][letCord].setNumberCoordinate(numCord);
            board[numCord][letCord].setLetterCoordinate(letCord);
            return true;
        }
        else{
            return false;
        }
    }

    private void changePlayerColour(){
        if (currPlayerColour.equals("Белый"))
            currPlayerColour="Черный";
        else
            currPlayerColour="Белый";
    }

    public void playersFight(){
        printChessBoard();
        while(true) {
            chooseFigure();
            if(chessMove()) {
                changePlayerColour();
                printChessBoard();
            }
        }
    }

    public void printChessBoard(){
        for (int i = 0; i < board.length; i++) {
            System.out.print(board.length-i+"\t");
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("\t");
        for (Character key: lettersCoordinates.keySet())
            System.out.print(key+"\t\t");
        System.out.println();
    }


}
