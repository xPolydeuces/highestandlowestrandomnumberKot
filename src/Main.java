public class Main {

    public static void main(String[] args) {
	    // This app checks which number out of the random ones are highest and lowest
        int i = 1;
        int maxRandomNumber = 0;
        int minRandomNumber = 101;
        while(i < 10)
        {
            i++;
            int secondRandomNumber = (int)(Math.random() * (100-1));
            System.out.println(secondRandomNumber);
            if (maxRandomNumber < secondRandomNumber)
            {
                maxRandomNumber = secondRandomNumber;
            }
            if (minRandomNumber > secondRandomNumber)
            {
                minRandomNumber = secondRandomNumber;
            }

        }
        System.out.println("Min number: " + minRandomNumber);
        System.out.println("Max number: " + maxRandomNumber);
    }
}
