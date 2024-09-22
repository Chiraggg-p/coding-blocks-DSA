public class strBld {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(10);
        sb.append("hola");
        sb.append("amigo");
        sb.replace(2, 4, "replaced");
        
        // System.out.println(sb.substring(5 , 6));
        // System.out.println(sb.insert(4," "));
        // sb.reverse();
        System.out.println(sb);
        // sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        // System.out.println(sb.length());

       

    }

}
