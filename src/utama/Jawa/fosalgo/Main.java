package fosalgo;

import java.util.Scanner;

/**
 *
 * @author Sugiarto Cokrowibowo
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        
        //TULISKAN KODEMU DIBAWAH INI
        int[] arrayAngka = {x1,x2,x3,x4};

        for(int i = 0; i < 4;i++){
            for(int j = 0; j < 4; j++){
                if(arrayAngka[i] > arrayAngka[j]){
                    int arrI = arrayAngka[i];
                    int arrJ = arrayAngka[j];
                    arrayAngka[j] = arrI;
                    arrayAngka[i] = arrJ;
                }
            }
        }

        for(int k = 0;k < 4;k++){
            System.out.println(arrayAngka[k]);
        }
    }
    
}
