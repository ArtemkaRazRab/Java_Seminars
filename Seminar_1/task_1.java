//Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
//Пример 1: а = 3, b = 2, ответ: 9 
//Пример 2: а = 2, b = -2, ответ: 0.25
//Пример 3: а = 3, b = 0, ответ: 1
//Пример 4: а = 0, b = 0, ответ: не определено
//Пример 5
//входные данные находятся в файле input.txt в виде
//b 3
//a 10
//Результат нужно сохранить в файле output.txt
//1000

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;


public class task_1 {
    public static  double pow (int value,  int powvalue) {
        return (double) Math.pow(value, powvalue);
    }
    public static void main(String [] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new FileReader("input.txt")); // чтение данных из файла
        String str;
        int [] arr = new int[2]; // создаем массив из двух элементов
      
        while ((str = br.readLine()) != null) {
            System.out.printf("%s\n", str);
            char c = str.charAt(0); // это первый сивол в строке
            if ( c == 'a') {
                String substr1 = str.substring(2); // из строки извлекаем подстроку с числом
                System.out.println(substr1);
                arr[0] = Integer.parseInt(substr1); // записываем число в нулевой элемент массива
            } else {
                String substr1 = str.substring(2);
                System.out.println(substr1);
                arr[1] = Integer.parseInt(substr1); // записываем число в первый элемент массива, преобразование строки в число
            }
            }    
           
        br.close();
        
        String res;
        if (arr[0] == 0 && arr[1] == 0) { // условия при а = 0 и/или b = 0
            res = "не определено";
        } else {
            double result = pow(arr[0], arr[1]); // условия для дробных чисел
            res = Double.toString(result); // переводим результат из дробного числа в строку
        }
        System.out.println(res);

        try (FileWriter fw = new FileWriter("output.txt", false)) {  // запись результатов в файл
            fw.write(res);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        }
    }
    
