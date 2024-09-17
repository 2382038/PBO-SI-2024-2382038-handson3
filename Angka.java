public class Angka {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20){
            if ( i % 3 == 0){
                i++;
                continue;
            }

            if (i == 16){
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
