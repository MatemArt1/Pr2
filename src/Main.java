public class Main {
    /*My grandfather always predicted how old people would get, and right before he passed away he revealed his secret!

    In honor of my grandfather's memory we will write a function using his formula!

    Take a list of ages when each of your great-grandparent died.
    Multiply each number by itself.
    Add them all together.
    Take the square root of the result.
    Divide by two.
     */
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        // your code goes here
        int a = (int)Math.sqrt(age1*age1 + age2*age2 + age3*age3 + age4*age4 + age5*age5 + age6*age6 + age7*age7 + age8*age8)/2;
        return a;
    }
    public static void main(String[] args) {

    }
}