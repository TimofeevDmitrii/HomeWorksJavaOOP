package PlayChess;

public abstract class ChessFigure {
    protected String name;
    protected String colour;
    protected int numberCoordinate; // координата строки
    protected int letterCoordinate; // координата столбца


    public ChessFigure(String name, String colour, int numberCoordinate, int letterCoordinate){
        this.name = name;
        this.colour = colour;
        this.numberCoordinate = numberCoordinate;
        this.letterCoordinate = letterCoordinate;
    }

    public int getNumberCoordinate(){
        return this.numberCoordinate;
    }

    public int getLetterCoordinate(){
        return this.letterCoordinate;
    }

    public void setNumberCoordinate(int numberCoordinate){
        this.numberCoordinate = numberCoordinate;
    }

    public void setLetterCoordinate(int letterCoordinate){
        this.letterCoordinate = letterCoordinate;
    }

    public String getColour(){
        return colour;
    }

    @Override
    public String toString(){
        return (name);
    }

    public abstract boolean checkGoing(int numberCoordinate, int letterCoordinate, ChessFigure[][] fightBoard);
}
