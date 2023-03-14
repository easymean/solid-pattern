package l.solution;

public class LiskovSubstitutionPrincipleDemo {

    public static void main(String[] args) {
        Bird[] birds = new Bird[]{new Crow(), new Sparrow(), new Ostrich()};
        // Ostrich는 하늘을 날지 못해서 exception이 호출된다.
        //
        for (Bird bird : birds) {
            bird.fly();
        }
    }
}
