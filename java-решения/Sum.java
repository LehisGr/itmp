public class SumLong {
    public static void main(String[] args) {
        StringBuilder pred = new StringBuilder("");
        StringBuilder temp = new StringBuilder("");
        long sum = 0, count = 0, buf = 0;

        for (int i = 0; i < args.length; i++) {
            temp = new StringBuilder(args[i]);

            for (int j = 0; j < temp.length(); j++) {
                count++;

                if (!Character.isWhitespace(args[i].charAt(j))) {
                    pred.append(temp.charAt(j));
                } else if (pred.length() != 0) {
                    sum += Long.parseLong(pred.toString());
                    pred.setLength(0);
                }
            }

            if (pred.length() != 0) {
                sum += Long.parseLong(pred.toString());
                pred.setLength(0);
            }
        }
        System.out.println(sum);
    }
}
