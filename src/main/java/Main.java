
public class Main {

    public static void main(String[] args) {

        final int numbersTheard = 4;
        ThreadGroup threadGroup = new ThreadGroup("MyGroup");

        System.out.println("Создаю потоки...");

        for (int i = 0; i < numbersTheard; i++) {
            MyThread myThread = new MyThread(threadGroup, "поток " + i);
            myThread.start();
        }

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            System.out.println("error");
        }
        threadGroup.interrupt();
    }

}
