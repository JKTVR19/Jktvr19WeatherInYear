/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19weatherinyear;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {
    public void run(){
        //Создайте зубчатый массив, в котором хранится
        //температура воздуха в нашем городе на весь год
        byte n = 0, min = 0, max = 0;
        Random random = new Random();
        int [][] tempInYear = new int[12][]; 
        for (int i=0; i< tempInYear.length; i++){
            switch (i){
                case 0: min=-25; max=0; n=31 ; break;
                case 1: min=-20; max=2;  n=28; break;
                case 2: min=-10; max=10;  n=31; break;
                case 3: min=-5; max=15;  n=30; break;
                case 4: min=0; max=17;  n=31; break;
                case 5: min=5; max=20;  n=30; break;
                case 6: min=10; max=30;  n=31; break;
                case 7: min=10; max=25;  n=31; break;
                case 8: min=5; max=20;  n=30; break;
                case 9: min=0; max=15;  n=31; break;
                case 10: min=-10; max=5;  n=30; break;
                case 11: min=-20; max=0;  n=31; break;
            }
            
            tempInYear[i] = new int[n];
            for(byte j=0; j< tempInYear[i].length; j++ ){
                
                tempInYear[i][j] = random.nextInt(max-min+1) + min;
            }
        }
            {
                //вывод температуры по месяцам
                System.out.print("   ");
                for(int i= 1;i<32;i++){
                    System.out.printf("%4d", i);
                }
                System.out.println();
                System.out.print("   ");
                for(int i= 1;i<32;i++){
                    System.out.printf("%s","----");
                }
                System.out.println();
                int minT = 50;
                int maxT = -50;
                for (byte i=0; i < tempInYear.length; i++){
                    System.out.printf("%2d| ",i+1);
                    for (byte j=0;j < tempInYear[i].length; j++){
                        System.out.printf("%4d", tempInYear[i][j]);
                        if (tempInYear[i][j]<minT )minT = tempInYear[i][j];
                        if (tempInYear[i][j]<maxT )maxT = tempInYear[i][j];
                    }
                    System.out.println("");
                    
                
                }
                System.out.println("Минимальная температура в году " + minT);
                System.out.println("Максимальная температура в году " + maxT);
                System.out.println("Температура в конкретный день года " );
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите месяц; " ); int month = scanner.nextInt();
                System.out.println("Введите день месяца; " ); int day = scanner.nextInt();
                System.out.println("В этот день была температура: " + tempInYear[month-1][day]);
                
                
            }
        
        /*tempInYear[0] = new short[31];
        tempInYear[1] = new short[28];
        tempInYear[2] = new short[31];
        tempInYear[3] = new short[30];
        tempInYear[4] = new short[31];
        tempInYear[5] = new short[30];
        tempInYear[6] = new short[31];
        tempInYear[7] = new short[31];
        tempInYear[8] = new short[30];
        tempInYear[9] = new short[31];
        tempInYear[10] = new short[30];
        tempInYear[11] = new short[31];
        
        tempInYear[0][0] = -7;
                
        System.out.println("");*/
    }
    
}
