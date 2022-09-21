public class Main {

    public static void main(String[] args) {
        char harf = 'K';
        char[] sesliHarfler = {'A', 'a', 'I', 'ı', 'O', 'o', 'U', 'u','E', 'e', 'İ', 'i', 'Ö', 'ö', 'Ü', 'ü'};

        for (int i=0;i<sesliHarfler.length;i++){
            switch (harf){
                case'A':
                case'a':
                case'I':
                case'ı':
                case'O':
                case'o':
                case'U':
                case'u':
                    System.out.println("Kalın Sesli Harf Girdiniz.");
                    return;
            }
            switch (harf){
                case'E':
                case'e':
                case'İ':
                case'i':
                case'Ö':
                case'ö':
                case'Ü':
                case'ü':
                    System.out.println("İnce Sesli Harf Girdiniz.");
                    return;
                default:
                    System.out.println("Sessiz Harf Girdiniz.");
                    return;
            }
        }


    }
}
