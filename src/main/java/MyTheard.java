class MyThread extends Thread {

    MyThread(ThreadGroup tg, String name) {
        super(tg, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("���� ������! � ����� " + getName());
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("%s ��������\n", getName());
        }
    }
}