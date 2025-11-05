public class String_Builder_Example_2 {
    public static void main(String args[]){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Ishani");
        stringBuilder.append(" ");
        stringBuilder.append("Nuwanthika");
        stringBuilder.append(" ");
        stringBuilder.append("Nakandala");

        String result = stringBuilder.toString();

        System.out.println("String Builder Result : " +result);
    }
}
