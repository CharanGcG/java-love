/*
public class PublicStaticVoidMain {
    static void main(String[] args) {
        System.out.println("Without public");
    }
}


public class PublicStaticVoidMain {
    public void main(String[] args) {
        System.out.println("Without static");
    }
}


public class PublicStaticVoidMain {
    public static main(String[] args) {
        System.out.println("Without void");
    }
}

public class PublicStaticVoidMain {
    public static int main(String[] args) {
        System.out.println("Without void, int instead");
        return 1;
    }
}


public class PublicStaticVoidMain {
    public static void someMethod(String[] args) {
        System.out.println("Without main - someMethod instead");
    }
}
*/


public class PublicStaticVoidMain {
    public static void main(String[] arguments) {
        System.out.println("Without String[] args - String[] arguments instead");
    }
}