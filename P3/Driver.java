public class Driver {
    public static void main(String[] args) {
        Point p[] = new Point[5];
        p[0] = new Point(2, 3);
        p[1] = new Point(4, 5);
        p[2] = new Point(2, 3);
        p[3] = new Point(6, 7);
        p[4] = new Point(4, 5);
        int distinct = 0;
        for (int i = 0; i < p.length; i++) {
            int flag = 0;
            for (int j = 0; j < i; j++) {

                if (p[i].equals(p[j])) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                distinct++;
        }
        System.out.println("Distinct : " + distinct);
    }
}