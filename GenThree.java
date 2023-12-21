/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
	int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int minNumber = Math.min(a , b);
    int maxNumber = Math.max(a , b);
    double r1 = Math.random();
    double r2 = Math.random();
    double r3 = Math.random();
    int random1 = (int)(((maxNumber - minNumber) * r1) + minNumber);
    int random2 = (int)(((maxNumber - minNumber) * r2) + minNumber);
    int random3 = (int)(((maxNumber - minNumber) * r3) + minNumber);
    System.out.println(random1);
    System.out.println(random2);
    System.out.println(random3);
    int minGenNumber = Math.min(random1 , Math.min(random2 , random3));
    System.out.println("The minimal generated number was " + minGenNumber);
	}
}


