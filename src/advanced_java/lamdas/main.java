package advanced_java.lamdas;

public class main {
    public static void main(String[] args) {
        myLamda myLamdaFunction = () -> System.out.println("I'm a lambda");
        myAdd addFunction = (a, b) -> a + b;
    }
}

interface myLamda {
    public void foo();
}

interface myAdd {
    public int add(int a, int b);
}
