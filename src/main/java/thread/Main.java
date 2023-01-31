package thread;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        ThreadSafeClass threadSafeClass1 = new ThreadSafeClass();
        ThreadSafeClass threadSafeClass2 = new ThreadSafeClass();

        threadSafeClass1.start();
        threadSafeClass2.start();
    }
}
