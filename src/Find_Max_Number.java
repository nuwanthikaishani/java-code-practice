public class Find_Max_Number {
    public static void main(String args[]){
        int numbers[] = {34,87,76,90,35};

        //step 1 =
        int max = numbers[0];

        //step 2
        for(int i=0;i<numbers.length;i++){
            //step 3
            if(numbers[i] > max){
                    max = numbers[i];
            }
        }
        System.out.println("Maximum number :" +max);


    }
}
