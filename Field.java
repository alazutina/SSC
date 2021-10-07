package Game;
import  java.util.Random;

enum Figure {
    STONE,
    SCISSOR,
    CLOTH
}

class Field {

    private Figure f1;  // компьютер
    private Figure f2;  // игрок


    Field(){
        // в конструкторе инициализируется только ход компьютера f1
    Random r = new Random();
    int i = r.nextInt(3)+1;

    switch (i){
        case(1):
            f1 = Figure.STONE;
            break;
        case(2):
            f1 = Figure.SCISSOR;
            break;
        case(3):
            f1 = Figure.CLOTH;
            break;    }
    }

    Figure setF2(int i){
        switch (i){
            case(1):
               this.f2 = Figure.STONE;
                break;
            case(2):
                this.f2 = Figure.SCISSOR;
                break;
            case(3):
                this.f2 = Figure.CLOTH;
                break;

        }
        return this.f2;
    }

    String getF1(){
        if(this.f1==Figure.STONE) return "камень";
        if(this.f1==Figure.SCISSOR) return "ножницы";
        if(this.f1==Figure.CLOTH) return "бумага";
        return "";
    }

    String getF2(){
        if(this.f2==Figure.STONE) return "камень";
        if(this.f2==Figure.SCISSOR) return "ножницы";
        if(this.f2==Figure.CLOTH) return "бумага";
        return "";
    }


    }

