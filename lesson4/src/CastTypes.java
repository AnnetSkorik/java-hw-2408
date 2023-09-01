public class CastTypes {
    public static void main(String[] args) {
        int myInt = 56;
        long myLong = myInt;
        System.out.println("myInt = "+myInt);
        System.out.println("myLong = "+myLong);

        int copyInt = (int) myLong;
        System.out.println("copyInt = "+copyInt);

        int myInt2 = 300;
        byte myByte = (byte)myInt2;
        System.out.println("myByte = "+myByte);

    }
}
