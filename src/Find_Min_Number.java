public class Find_Min_Number {
    public static void main(String args[]){
        int numbers[] = {34,87,76,90,35};

        int min = numbers[0];

        for(int i =0;i< numbers.length;i++){

            if(numbers[i] < min){

                numbers[i] = min;

            }
        }

        System.out.println("Min Number :" +min);

    }
}
