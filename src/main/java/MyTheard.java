class MyThread extends Thread {

    MyThread(ThreadGroup tg, String name) {
        super(tg, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Всем привет! Я поток " + getName());
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}