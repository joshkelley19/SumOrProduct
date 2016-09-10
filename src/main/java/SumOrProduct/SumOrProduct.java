package SumOrProduct;import java.util.Scanner;

public class SumOrProduct {
    public static int product(int n){
        int ans = 1;
        for (int i = 1;i < n+1;i++){
            ans *= i;
        }
        return ans;
    }
    public static int sum(int n){
        int ans = 0;
        for (int i = 0;i < n+1;i++){
            ans += i;
        }
        return ans;
    }
    public static int sumOrProduct(){
        Scanner scanner = new Scanner(System.in);
        String product = "PRODUCT", sum = "SUM";
        System.out.println("Gimme a numba: ");

        Integer clientResponse = new Integer(scanner.nextInt());

        int a = 1;

        do {
            System.out.println("Enter 'sum' for the Sum. Enter 'product' for the Product: ");

            String sumOrProduct = scanner.next();
            if(sumOrProduct.toUpperCase().equals(sum)){
                a = SumOrProduct.sum(clientResponse);
            }else if (sumOrProduct.toUpperCase().equals(product)){
                a = SumOrProduct.product(clientResponse);

            }else System.out.println("wrong character! try again");
        }while (a == 1);

        System.out.println("Ya answer is " + a);
        return a;
    }
    public static void main(String[] args) {
        sumOrProduct();

    }
}
