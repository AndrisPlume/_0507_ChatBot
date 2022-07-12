import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        //Nodefinē atbildi Jā un x vērtību, tas kas nebūs Jā šoreiz būs Nē.

        String yes = "Jā";

        int x=0;

                                                            //Lietotāja datu ievades jautājumi

        System.out.println("Sveiki, lūdzu ievadied savu vārdu");
        String name = scan.nextLine();
        System.out.println("Priecājos iepazīties "+name);   //Atpakaļsaite
        System.out.println(" ");
        do{                                                 //Izveidojam vienkāŗšu loop, lai ļautu izlabot datus un ierobežotu nepareizas informācijas ievades mēģinājumu skaitu
            x++;
            System.out.println("Lūdzu Ievadiet Dzimšanas datumu");
            String date = scan.nextLine();
            System.out.println("Lūdzu Ievadiet Dzimšanas mēnesi");
            String month = scan.nextLine();
            System.out.println("Lūdzu Ievadiet Dzimšanas gadu");
            String year = scan.nextLine();
            System.out.println("Vai Tavi dzimšanas dati ir pareizi? (Jā/Nē)");
            System.out.println(year + ".gada " + month + "." + date + ".");
            String datevalid = scan.nextLine();
            if (x>2) {
                System.out.println("Man liekas Tu mani čakarē!!! Lai Tev veicas! ");
                System.exit(0);                         //system.exit pārtrauc Java programmas izpildi
            }
            else{
                System.out.println(" ");
            if (datevalid.equals(yes)) {
                System.out.println(" ");
                break ;                                     // break pārtrauc do-while loop
            }
            else {
                System.out.println("dīvaini, mēģinam vēlreiz.");
            }
            }
        } while (x<3); {
            }
                                                            //papildus jautājumi, tiem kam saruna ar botu interesē :-)
        System.out.println("Kāds ir tavs mīļākais ēdiens?");
        String food = scan.nextLine();
        System.out.println("Ļoti intersanti ka tev garšo "+food);
        System.out.println(name+ " Tev ir hobiji? ");
        String answhob = scan.nextLine();
        if (answhob.equals(yes)){
            System.out.println(" Ar ko Tu nodarbojies ?");
        }
        else {
            System.out.println("žēl, cerams, ka kautko sev atradīsi, Lai Tev veicas!" +name);
            System.exit(0);
        }
        String hobbyexpl = scan.nextLine();                 //sitēma izmeta warning, ka String hobbyexpl nav lietots, pagaidām nemāku savādāk likt ievadīt textu lietotājam
        System.out.println("Ooo, pastāsti kautko vairāk!" );
        String hobbyexplmore = scan.nextLine();             //sitēma izmeta warning, ka String hobbyexpl nav lietots, pagaidām nemāku savādāk likt ievadīt textu lietotājam
        System.out.println("izklausās, ka esi aizrāvies ar šo! Man jau laiks skriet, Lai Tev veicas "+name );
        System.out.println("Ceru ka drīz tiksimies");

    }
}  /* Bija iespēja patestēt tādu basic Java koda rakstīšanu
    no sākuma gāja grūti, nezinu komandas, tās karjagas nav saprotamas :-), lēnām, sāk veidoties
    smadzenēs formāts */
