/*Ханойская башня — это математическая головоломка, в которой три стержня и 
n дисков. Цель головоломки состоит в том, чтобы переместить весь стек 
к другому стержню, следуя следующим простым правилам:
1) Одновременно можно перемещать только один диск.
2) Каждый ход состоит в том, чтобы извлечь верхний диск из одного из 
стеков и поместить его поверх другого стека, т.е. диск можно перемещать 
только в том случае, если это самый верхний диск в стеке.
3) Запрещается размещать диск поверх меньшего диска.
*/
public class hanoi {
    public static void main(String[] args) {
       int nDisks = 3;
       doTowers(nDisks, 'A', 'B', 'C');
    }
    public static void doTowers(int topN, char from,
    char inter, char to) {
       if (topN == 1){
          System.out.println("Disk 1 from "
          + from + " to " + to);
       }else {
          doTowers(topN - 1, from, to, inter);
          System.out.println("Disk "
          + topN + " from " + from + " to " + to);
          doTowers(topN - 1, inter, from, to);
       }
    }
 }