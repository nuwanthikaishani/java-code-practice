public class Descending_Order_Numbers {
    public static void main(String args[]){
        int numbers[] = {34, 87, 76, 90, 35};
        int temp;

        for(int i=0;i<numbers.length;i++){
            for (int j= i+1; j<numbers.length;j++){
                if(numbers[i] < numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] =temp;
                }
            }
        }

        for(int num : numbers){
            System.out.print(num+ ", ");
        }
    }
}
