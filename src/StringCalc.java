

public class StringCalc {

    public static int Add (String numbers) {
        //no items
        if (numbers == "") {
            return 0;
        }
        //1 item
        else if (!numbers.contains(",")) {
            return Integer.parseInt(numbers);
        } else {
            int sum = 0;
            String[] output = numbers.split("\\,");

            for (int i = 0; i<output.length;i++){
                sum += Integer.valueOf(output[i]);
            }

            return sum;
        }
    }
}
