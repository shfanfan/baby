public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Baby yoda = new Baby("yoda");
        yoda.setData(1, 51, 3.8);
        yoda.setData(2, 53, 3.9);
        yoda.setData(3, 57, 4);
        yoda.setData(4, 59, 4.1);
        yoda.setData(5, 59, 4.3);
        yoda.setData(6, 59, 4.1);
        yoda.setData(7, 63, 4.5);
        yoda.setData(8, 64, 4.7);
        yoda.setData(10, 66, 4.8);
        yoda.setData(11, 68, 4.5);
        yoda.setData(12, 72, 5.0);

        System.out.println("baby " + yoda.getName() + "'s average height is " + yoda.getAvgHeight() );
    }
}
