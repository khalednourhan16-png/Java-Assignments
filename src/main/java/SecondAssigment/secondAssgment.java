package SecondAssigment;

public class secondAssgment {
public static void main(String[] args) {
    int a = 20, b = 10;
    int sum = a + b;
    int diff = a - b;
    int p = a * b;
    int m = a % b;
    System.out.println(sum);
    System.out.println(diff);
    System.out.println(p);
    System.out.println(m);

    System.out.println(a > b);
    System.out.println(a < b);
    System.out.println(a != b);
    System.out.println(a == b);
    if
    (a > 0 && b > 0)
        System.out.println("Both numbers are positive");
    else if
    ((a > 0 && b <= 0) || (a <= 0 && b > 0))

        System.out.println("one is positive");
    else
        System.out.println("No positives");

    System.out.println(a>b ? "a is greater than b" : "b is greater than a");
    System.out.println(a%2==0 ? "a is even number" : "a is odd number");
    System.out.println(b%2==0 ? "b is even number" : " b is odd number");

}
}