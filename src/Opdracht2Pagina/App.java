package Opdracht2Pagina;

public class App {

    public static void main(String[] args) {
        MyThread run1 = new MyThread('#',100);
        MyThread run2 = new MyThread('*',100);

        Thread thread = new Thread(run1);
        Thread thread1=new Thread(run2);

        thread.start();
        thread1.start();
    }
}
