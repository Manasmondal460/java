import java.util.Scanner;

public class average_array {
    public static void main(String[] args) {
        int sum =0;
        double avg;
        int a[]=new int[5];
        System.out.println(" enter your element-------->");
        Scanner r=new Scanner(System.in);
        for (int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println(" your element -------->");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
            sum=a[i]+sum;

        }
        System.out.println(" the some of element is"  +  sum);
        System.out.println(" the avarage of element is------->");
        avg=sum/5.0;
        System.out.println(avg);

    }
}
