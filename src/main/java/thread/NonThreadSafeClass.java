package thread;

public class NonThreadSafeClass {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < 2; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 50000; j++){
                        stringBuilder.append("1");
                        stringBuffer.append("1");
                    }
                }
            }).start();
        }

        Thread.sleep(1000);
        System.out.println("StringBuilder: " + stringBuilder.length());
        System.out.println("StringBuffer: " + stringBuffer.length());
    }
}
