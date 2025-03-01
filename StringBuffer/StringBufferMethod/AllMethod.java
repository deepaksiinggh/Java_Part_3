package StringBuffer.StringBufferMethod;

public class AllMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Deepak Singh");
        System.out.println(sb);
        sb.append(" From madhyaPradesh");
        System.out.println(sb);

        sb.insert(0, "Mr ");
        System.out.println(sb);

        sb.replace(0, 2, "Dr.");
        System.out.println(sb);

        System.out.println(sb.capacity());

        sb.delete(0, 4);
        System.out.println(sb);

        sb.deleteCharAt(1);
        System.out.println(sb);

        sb.replace(0, 2, "Dee");
        System.out.println(sb);

    }
}
