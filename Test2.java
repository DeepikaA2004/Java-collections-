class Test2 {
    private static int x;

    public static void main(String[] args) {
        System.out.println(fun());
    }

    int fun() {
        return ++x;
    }
}