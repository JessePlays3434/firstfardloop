public class Fard {
    public void loop(int num, boolean infinite) {
        while(num>0) {
            System.out.println("Fard");
            if(!infinite)
                num--;
        }
    }
}
