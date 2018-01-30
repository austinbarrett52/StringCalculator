

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

        /*
//split the previous array by the commas
            String [] strNums = numbers.split(",");

            //create a new integer array
            int [] nums = new int[strNums.length];

            //iterate through integer array and add up sum

            //return sum
            return -1;
        int sum = 0;
        int [] nums = new int[strNums.length];


        for (int i =0; i <nums.length;i++){
            nums[i] = Integer.valueOf(strNums[i]);
            sum += nums[i];
        }

        return sum;
        */

    }
}
