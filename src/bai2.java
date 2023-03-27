import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap do dai cua mang");
        int a=scanner.nextInt();
        int []arr=new int[a];
        Scanner scanner1= new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang");
        int max=arr[0];
        for(int i = 0; i<arr.length;i++){
            arr[i]=scanner1.nextInt();
            total+=arr[i];

            if(arr[i]>max){
                max=arr[i];
            }
        }

       System.out.println(total+":"+max);
    }

}