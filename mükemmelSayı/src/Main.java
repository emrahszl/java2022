public class Main {

    public static void main(String[] args) {
	    int number = 2;
        int total = 0;

        if (number<2){
            System.out.println("Hatalı Giriş Yaptınız.");
            return;
        }

        for (int i=1;i<number;i++){
            if (number % i ==0){
                total = total+i;
            }
        }
        if (total == number){
            System.out.println("Mükemmel Sayıdır.");
        }else{
            System.out.println("Mükemmel Sayı Değildir.");
        }
    }
}
