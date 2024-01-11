package PlayChess;


import java.util.Objects;

public class Pawn extends ChessFigure{

    protected int endNumCoordinate;
    protected int startNumCoordinate;

    public Pawn(String name, String colour, int numberCoordinate, int letterCoordinate) {
        super(name, colour, numberCoordinate, letterCoordinate);
        if (colour.equals("Белый")){
            endNumCoordinate = 0;
            startNumCoordinate = 6;
        }
        else {
            endNumCoordinate = 7;
            startNumCoordinate = 1;
        }
    }

    @Override
    public boolean checkGoing(int numberCoordinate, int letterCoordinate, ChessFigure[][] fightBoard) {
        if (Math.abs(endNumCoordinate-this.numberCoordinate)>Math.abs(endNumCoordinate-numberCoordinate) && Math.abs(this.numberCoordinate-numberCoordinate)<=2) {
            if (this.numberCoordinate==startNumCoordinate && Math.abs(this.numberCoordinate-numberCoordinate)==2 && this.letterCoordinate==letterCoordinate) {
                if (Objects.isNull(fightBoard[numberCoordinate][letterCoordinate]))
                    return true;
                else {
                    System.out.println("Данный ход невозможен1");
                    return false;
                }
            }
            else if (Math.abs(this.numberCoordinate-numberCoordinate)==1 && this.letterCoordinate==letterCoordinate){
                if (Objects.isNull(fightBoard[numberCoordinate][letterCoordinate]))
                    return true;
                else {
                    System.out.println("Данный ход невозможен2");
                    return false;
                }
            }
            else if (Math.abs(this.numberCoordinate-numberCoordinate)==1 && Math.abs(this.letterCoordinate - letterCoordinate) == 1){
                if (Objects.isNull(fightBoard[numberCoordinate][letterCoordinate])) {
                    System.out.println("Данный ход невозможен3");
                    return false;
                }
                else {
                    if (fightBoard[numberCoordinate][letterCoordinate].getColour().equals(this.colour)) {
                        System.out.println("Данный ход невозможен4");
                        return false;
                    }
                    else
                        return true;
                }
            }
            else {
                System.out.println("Данный ход невозможен5");
                return false;
            }
        }
        else {
            System.out.println("Данный ход невозможен6");
            return false;
        }
    }
}













//    @Override
//    public boolean checkGoing(int numberCoordinate, int letterCoordinate, ChessFigure[][] fightBoard) {
//        if (this.numberCoordinate==numberCoordinate && this.letterCoordinate==letterCoordinate) {
//            System.out.println("Задано то же местоположение фигуры, что было ранее");
//            return false;
//        }
//        else if (this.numberCoordinate==6 && this.numberCoordinate-numberCoordinate==2 && this.letterCoordinate==letterCoordinate){
//            if (Objects.isNull(fightBoard[numberCoordinate][letterCoordinate]))
//                return true;
//            else {
//                System.out.println("Данный ход невозможен");
//                return false;
//            }
//        }
//        else if (this.numberCoordinate-numberCoordinate==1 && this.letterCoordinate==letterCoordinate){
//            if (Objects.isNull(fightBoard[numberCoordinate][letterCoordinate]))
//                return true;
//            else {
//                System.out.println("Данный ход невозможен");
//                return false;
//            }
//        }
//        else if (this.numberCoordinate-numberCoordinate==1 && Math.abs(this.letterCoordinate - letterCoordinate) == 1){
//            if (Objects.isNull(fightBoard[numberCoordinate][letterCoordinate])) {
//                System.out.println("Данный ход невозможен");
//                return false;
//            }
//            else {
//                if (fightBoard[numberCoordinate][letterCoordinate].getColour().equals(this.colour)) {
//                    System.out.println("Данный ход невозможен");
//                    return false;
//                }
//                else
//                    return true;
//            }
//        }
//        else {
//            System.out.println("Данный ход невозможен");
//            return false;
//        }
//    }
