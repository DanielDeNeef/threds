package Opdracht1Pagina418;

public class NamethousendTime {
    public static void main(String[] args) {
        String name= "daniel";
        String loop="x";

        loop = loop.replaceAll("x","x x x x x x x x x x");
        loop = loop.replaceAll("x","x x x x x x x x x x");
        loop = loop.replaceAll("x","x x x x x x x x x x");
        loop = loop.replaceAll("x",name);
        System.out.println(loop);

    }

}
