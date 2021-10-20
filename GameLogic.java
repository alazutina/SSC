package Game;

import java.util.Random;
import java.util.Scanner;

class GameLogic {

    private final Field field = new Field();
    final Scanner sc = new Scanner(System.in);
    final Random r = new Random();

    final String ERROR_MESS = "что-то пошло не так с вводом. ";
    final String REPEAT = "Повторите.";
    final String YOUR_STEP = "Ваш ход: ";
    final String COMPUTER_STEP = "Ход компьютера: ";
    final String RESULT = "Итог игры: ";
    final String GAME = "Игра \" Камень, ножницы, бумага \"";
    final String STONE = "1 - камень,";
    final String SCISSOR= "2 - ножницы,";
    final String CLOTH = "3 - бумага.";
    final String NO_WIN= "ничья";
    final String YOU_WIN = "вы победитель";
    final String COMPUTER_WIN = "победил компьютер";
    private Field ;
    private Figure ;

    public void start() {
            boolean end = false; // корректный ввод хода
            int num; //  ход
            do {
              printMenu();

              while (true) {
                  try {
                      num = sc.nextInt();
                      break;
                  } catch (Exception e) {
                      System.out.println(ERROR_MESS);
                      }
              }

              if (num==1){
                  field.setSecondPlayer(convertInputToFigure(1));   //();
                  end = true;
              }
              if (num==2){
                  field.setSecondPlayer(convertInputToFigure(2));     //(num);
                  end = true;
              }
              if (num==3){
                  field.setSecondPlayer(convertInputToFigure(3));    //(//num);
                  end = true;
              }

              if(!end) {System.out.println(ERROR_MESS+REPEAT);}

          }while (!end);




            field.setFirstPlayer(convertInputToFigure(r.nextInt(3)+1));   //((r.nextInt(3)+1));
            System.out.println(YOUR_STEP+ field.getSecondPlayer());
            System.out.println(COMPUTER_STEP+field.getFirstPlayer());

            System.out.println(RESULT+result());
            }

    void printMenu(){
        System.out.println(GAME);
        System.out.println(YOUR_STEP);
        System.out.println(STONE);
        System.out.println(SCISSOR);
        System.out.println(CLOTH);
    }

    String result(){
        if((field.getFirstPlayer().equals(convertInputToFigure("бумага")) & field.getSecondPlayer().equals(convertInputToFigure("камень")))|
                (field.setFirstPlayer().equals(convertInputToFigure("камень")) & field.getSecondPlayer().equals(convertInputToFigure("ножницы"))) |
                (field.getFirstPlayer().equals(convertInputToFigure("ножницы")) & field.getSecondPlayer().equals(convertInputToFigure("бумага")))
                        ) return COMPUTER_WIN;
        if((field.getSecondPlayer().equals(convertInputToFigure("бумага") )& field.getFirstPlayer().equals(convertInputToFigure("камень"))) |
                (field.getSecondPlayer().equals(convertInputToFigure("камень")) & field.setFirstPlayer().equals(convertInputToFigure("ножницы")))|
                (field.getSecondPlayer().equals(convertInputToFigure("ножницы")) & field.setFirstPlayer().equals(convertInputToFigure("бумага")))
                        ) return YOU_WIN;
        return NO_WIN;
    }


    private Figure convertInputToFigure(int input) {
        if(input==1) return Figure.STONE;
        if(input==2) return Figure.SCISSOR;
        return Figure.CLOTH;



    }

    private Figure convertInputToFigure(String input) {
        if(input.equals("камень")) return Figure.STONE;
        if(input.equals("ножницы")) return Figure.SCISSOR;
        return Figure.CLOTH;
    }
}