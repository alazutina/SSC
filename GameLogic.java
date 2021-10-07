package Game;

import java.util.Scanner;

class GameLogic {

    private final Field field = new Field();




    public void start() {
            boolean end = false; // корректный ввод хода
          do {
              printMenu();
              Scanner sc = new Scanner(System.in);
              String st;

              while (true) {
                  try {
                      st = sc.next();
                      break;
                  } catch (Exception e) {
                      System.out.println("что-то пошло не так с вводом.");
                                     }
              }

              if (st.equals("К")){ field.setF2(1); end=true;}
              if (st.equals("Н")) {field.setF2(2);end = true;}
              if (st.equals("Б")){ field.setF2(3);end = true;}

              if(!end) {System.out.println("Не корректный ввод. Повторите.");}

          }while (!end);

            System.out.println("Ваш ход: "+ field.getF2());
            System.out.println("Ход компьютера: "+field.getF1());

            result();
            }



    void printMenu(){
        System.out.println("Игра \" Камень, ножницы, бумага \"");
        System.out.println("Ваш ход: К - камень,");
        System.out.println("         Н - ножницы,");
        System.out.println("         Б - бумага.");
    }

    void result(){
        System.out.print("Итог игры: ");

        if(field.getF1().equals(field.getF2()) ){System.out.println("ничья");}
        else if(field.getF1().equals("бумага") & field.getF2().equals("камень")) System.out.println("победил компьютер");
        else if(field.getF2().equals("бумага") & field.getF1().equals("камень")) System.out.println("вы победитель");
        else if(field.getF1().equals("камень") & field.getF2().equals("ножницы")) System.out.println("победил компьютер");
        else if(field.getF2().equals("камень") & field.getF1().equals("ножницы")) System.out.println("вы победитель");
        else if(field.getF1().equals("ножницы") & field.getF2().equals("бумага")) System.out.println("победил компьютер");
        else if(field.getF2().equals("ножницы") & field.getF1().equals("бумага")) System.out.println("вы победитель");
    }
}