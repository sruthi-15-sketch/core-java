class GenericExample {

    <T> T displayType(int x, T param) {
        if (param.getClass().getSimpleName().equals("String")) {
            return (T) "Multiplication is not possible!";
        } else if (param.getClass().getSimpleName().equals("Boolean")) {
            return (T) (Object) false;
        } else {
            Integer res = x * Integer.parseInt(String.valueOf(param));
            return (T) res;
        }

    }

}

class GenericMain {
    public static void main(String[] args) {
        GenericExample g = new GenericExample();
        System.out.println(g.displayType(10, "Sruthi"));
        System.out.println(g.displayType(8, 4));
        System.out.println(g.displayType(7, true));
    }
}

/*
 * public class GenericFunctionExample {
 * static <T> T genericFunction(Integer n, T param) {
 * if (param instanceof Integer || param instanceof Double) {
 * Integer res = n * Integer.parseInt(String.valueOf(param));
 * return (T) res;
 * } else if (param instanceof String) {
 * return (T) "Can't perform multiplication";
 * } else if (param instanceof Boolean)
 * return (T) (Object) false;
 * else
 * return (T) "No output";
 * 
 * }
 * 
 * public static void main(String[] args) {
 * System.out.println(genericFunction(44, 33));
 * }
 * }
 */