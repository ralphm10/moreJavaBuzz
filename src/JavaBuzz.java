public class JavaBuzz {
    public String checkNumber(int num) {
        if (num % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(num);
        }
    }
}
