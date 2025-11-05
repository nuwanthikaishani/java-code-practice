public class Compare_String_Example_1 {
    public static void main(String args[]){
        String name_1 = "Ishani";
        String name_2 = "Ishani";
        String name_3 = "Nuwanthika";

        System.out.println(name_1.compareTo(name_2));
        // Returns 0 because they are equal
        System.out.println(name_1.compareTo(name_3));
    }
}
