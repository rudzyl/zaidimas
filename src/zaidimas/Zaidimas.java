
package zaidimas;

import java.util.Scanner;

public class Zaidimas {

    public static void main(String[] args) {
    //skaiciuokle
    int suzaistaPartiju = 0;
    int zmogusLaimejo = 0;
    int kompasLaimejo = 0;
    int lygiosios = 0;
    
    while(true) {
        //meniu pasirinkimai
        System.out.println("1. Akmuo");
        System.out.println("2. Zirkles");
        System.out.println("3. Popierius");
        System.out.println("0. Pabaiga");
        
        System.out.println("Zaidejo pasirinkimas");
        Scanner sc = new Scanner(System.in);
        int zp = sc.nextInt();
        int zmogausEjimas = 0;
        int kompoEjimas = 0;
        //galimi zaidejo pasirinkimai
        if(zp == 1) {
            zmogausEjimas = 1;
            System.out.println("Akmuo");
        } else if (zp == 2) {
            zmogausEjimas = 2;
            System.out.println("Zirkles");
        } else if (zp == 3) {
            zmogausEjimas = 3;
            System.out.println("Popierius");
        } else if (zp == 0) {
            zmogausEjimas = 0;
            System.out.println("Pabaiga");
            break;
        }
        //ar validus zaidejo pasirinkimas
        if(zp != 1 && zp != 2 && zp != 3 && zp != 0) {
            System.out.println("1. Akmuo");
            System.out.println("2. Zirkles");
            System.out.println("3. Popierius");
            System.out.println("0. Pabaiga");
            break;
        }
       System.out.println();
       //kompiuterio pasirinkimai
       System.out.println("Kompiuterio pasirinkimas");
       double kp =(int)(Math.random()* 3) + 1;
       if(kp == 1) {
          kompoEjimas = 1;
           System.out.println("Akmuo");
       } else if (kp == 2) {
           kompoEjimas = 2;
           System.out.println("Zirkles");
       } else if (kp == 3) {
           kompoEjimas = 3;
           System.out.println("Popierius");
       }
        System.out.println();
    
        System.out.println("Laimejo");
        //Galimos baigtys
        if(zmogausEjimas == kompoEjimas) {
            System.out.println("LYGIOSIOS");
            lygiosios++;
            suzaistaPartiju++;
        } else if(zmogausEjimas == 1 && kompoEjimas == 2) {
            System.out.println("LAIMEJO ZAIDEJAS");
            zmogusLaimejo++;
            suzaistaPartiju++;
        } else if(zmogausEjimas == 2 && kompoEjimas == 3) {
            System.out.println("LAIMEJO ZAIDEJAS");
            zmogusLaimejo++;
            suzaistaPartiju++;
        } else if(zmogausEjimas == 3 && kompoEjimas == 1) {
            System.out.println("LAIMEJO ZAIDEJAS");
            zmogusLaimejo++;
            suzaistaPartiju++;
        } else if(kompoEjimas == 1 && zmogausEjimas == 2) {
            System.out.println("LAIMEJO KOMPIUTERIS");
            kompasLaimejo++;
            suzaistaPartiju++;
        } else if(kompoEjimas == 2 && zmogausEjimas == 3) {
            System.out.println("LAIMEJO KOMPIUTERIS");
            kompasLaimejo++;
            suzaistaPartiju++;
        } else if(kompoEjimas == 3 && zmogausEjimas == 1) {
            System.out.println("LAIMEJO KOMPIUTERIS");
            kompasLaimejo++;
            suzaistaPartiju++;
        }
        //issausdinama skaiciuokle
        System.out.println();
        System.out.println("Zaidejo laimejimai:" + zmogusLaimejo);
        System.out.println("Kompiuterio laimejimai:" + kompasLaimejo);
        System.out.println("Lygiuju skaicius:" + lygiosios);
        System.out.println("Suzaista partiju:" + suzaistaPartiju);
        System.out.println();
        }
    }
}
