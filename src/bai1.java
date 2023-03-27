import java.util.Scanner;

public class minites {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap thang n");
        n=scanner.nextInt();
        for(int i = 2; i<n; i++){
            if(check_number(i)==true)
            System.out.println(i+"la snt");
        }

    }
    public static boolean check_number(int number){
        boolean check=true;
        for(int i =2; i<number; i++){
            if(number % i ==0){
                check=false;
                break;
            }
        }
        return check;
    }
}
