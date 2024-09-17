public class Looping {
    public static void main(String[] args) {
        String[] buah = {"Apel", "Pisang", "Mangga", "Jeruk"};

        //Pengulangan For
        System.out.println("For: ");
        for (int i = 0; i < buah.length; i++) {
            System.out.println(buah[i]);
        }

        //Pengulangan For-each
        System.out.println("\nFor-each:");
        for (String b : buah) {
            System.out.println(b);
        }

        //Pengulangan While
        System.out.println("\nWhile:");
        int i = 0;
        while (i<buah.length){
            System.out.println(buah[i]);
            i++;
        }

        //Pengulangan Do-while
        System.out.println("\nDo-while:");
        i = 0;
        do {
            System.out.println(buah[i]);
            i++;
        }while (i < buah.length);
    }
}
