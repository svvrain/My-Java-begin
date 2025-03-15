package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MyFile {
   public static void main(String[] args) throws FileNotFoundException {
    //File f = new File("/home/rain/Desktop/Number");     // можно абсолютный путь
    File f = new File("Number");     // а можно относительный путь, положить файл в корень проекта
    Scanner s = new Scanner(f);
    String str = s.nextLine();
    s.close();                                // закрываем поток из файла
    
    String [] sm = str.split(" ");   // разделяет строку в данном случае через пробел
    int [] number = new int[3];            
    int count=0;
    for(String el : sm){
        number[count++] = Integer.parseInt(el);  // преобразование из String в Int
    }
    System.out.println(Arrays.toString(number));
 

   }
   
}
