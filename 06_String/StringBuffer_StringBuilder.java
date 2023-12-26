public class StringBuffer_StringBuilder {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer();
        StringBuffer sb = new StringBuffer("Kushal");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" Vaghela");

        sb.deleteCharAt(2);

        // sb.insert(0, "Java ");
        sb.insert(6, "Java ");

        sb.setLength(30); // increase a length of string and it max.

        System.out.println(sb);

        // String str = sb.toString(); // to canvar StringBuffer to String
    }
}
