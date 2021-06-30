public class Exercise2 {
    public static void main(String[] args) {

        char c = 'z';
        int i = 250;
        double d = 301.067;
        int i2 = 100;
        int i3 = 737;
        double d2 = 298.638;

        System.out.println((int) c);

        long itol = i;
        System.out.println(itol);

        short ltos = (short) itol;
        System.out.println(ltos);

        long dtol = (long)d;
        System.out.println(dtol);

        float result = i2 + 5000.66f;
        System.out.println(result);

        int multiplyResult = i3 * 100;
        var bytes = (byte) multiplyResult;
        System.out.println(bytes);

        long dtol2 = (long) d2/25;
        System.out.println(dtol2);



    }
}