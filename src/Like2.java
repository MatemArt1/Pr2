public class Like2 {
    public static int predictAge(int...integers) {
        int result = 0;
        for (int i : integers)
        {
            result += i*i;
        }
        return (int)Math.sqrt(result)/2;
    }
}
