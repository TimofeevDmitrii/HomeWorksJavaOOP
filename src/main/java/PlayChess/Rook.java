package PlayChess;

public class Rook extends ChessFigure{

    public Rook(String name, String colour, int numberCoordinate, int letterCoordinate) {
        super(name, colour, numberCoordinate, letterCoordinate);
    }

    @Override
    public boolean checkGoing(int numberCoordinate, int letterCoordinate, ChessFigure[][] fightBoard) {
        return false;
    }
}
