package ForEeach;

public class While {

    public static void main(String[] args) {
        int n = 10;
        int k = 10;
        int i = 0;

        System.out.print("Show while:");
        while(n> 0){
            i++;
            n--;
            System.out.print(i + " ");
            break;
        }

        System.out.print("\nShow do-while: ");
        do {
            i++;
            k--;
            System.out.print(i + " ");
            break;
        } while (k>0);
    }
}
