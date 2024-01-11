package PlayChess;

public class Main {

    public static void main(String[] args) {
        ChessBoard chessBoard1 = new ChessBoard();
//        Pawn pawn1 = new Pawn("pawn1", "Белый",6,0);
//        Pawn pawn2 =  new Pawn("pawn2", "Белый",6,1);
//        Pawn pawn3 =  new Pawn("pawn3", "Белый",6,2);
//        Pawn pawn4 = new Pawn("pawn4", "Черный", 5,0);
//        chessBoard1.board[pawn1.numberCoordinate][pawn1.getLetterCoordinate()] = pawn1;
//        chessBoard1.board[pawn2.numberCoordinate][pawn2.getLetterCoordinate()] = pawn2;
//        chessBoard1.board[pawn3.numberCoordinate][pawn3.getLetterCoordinate()] = pawn3;
//        chessBoard1.board[pawn4.numberCoordinate][pawn4.getLetterCoordinate()] = pawn4;
        chessBoard1.startPlay();
        chessBoard1.playersFight();
    }
}
