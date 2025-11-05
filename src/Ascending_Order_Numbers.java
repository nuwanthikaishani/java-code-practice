public class Ascending_Order_Numbers {
    public static void main(String args[]){
        int numbers[] = {34, 87, 76, 90, 35};
        int temp;

        //bubble sort logic
        for(int i =0;i<numbers.length;i++){
            for (int j = i+1; j<numbers.length;j++){
                if(numbers[i] > numbers[j]){
                    // Swap numbers[i] and numbers[j]
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        // Print the sorted array
        System.out.println("Numbers in ascending order:");
        for (int num : numbers){
            System.out.print(num+ ", ");
        }
    }
}
//🔍 How Bubble Sort Works:
//
//Compare two numbers at a time.
//
//If the first number is bigger than the second, swap them.
//
//Repeat this process until the array is sorted.
