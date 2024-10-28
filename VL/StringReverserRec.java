public class StringReverserRec {
    

    String rev(String s) {
        if (s.length() == 0) {
            return s;
        }
        return rev(s.substring(1, s.length())) + s.substring(0, 0);
    }

    public static void main(String[] args) {
        StringReverserRec sr = new StringReverserRec();
        System.out.println(sr.rev("Hello"));
    }
}
