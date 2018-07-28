/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whenyoueatyoursmarties;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class WhenYouEatYourSmarties {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        String s;
        int number[] = new int [8];
	for(int j = 0; j < 10; j++){
            do{
                s = reader.nextLine();
                if (s.equalsIgnoreCase("orange"))
                    number[0]++;
                else if (s.equalsIgnoreCase("blue"))
                    number[1]++;
                else if (s.equalsIgnoreCase("green"))
                    number[2]++;
                else if (s.equalsIgnoreCase("yellow"))
                    number[3]++;
                else if (s.equalsIgnoreCase("pink"))
                    number[4]++;
                else if (s.equalsIgnoreCase("violet"))
                    number[5]++;
                else if (s.equalsIgnoreCase("brown"))
                    number[6]++;
                else if (s.equalsIgnoreCase("red"))
                    number[7]++;
            }while(!s.equalsIgnoreCase("end of box"));
            int second = 0;
            for(int i = 0; i < 7; i++){
                if((number[i]%7)!= 0)
                    second = second + ((number[i]/7)+1)*13;
                else
                    second = second + (number[i]/7)*13;
                }
            second = second + number[7]*16;
            System.out.print(second);
        }
    }
}
