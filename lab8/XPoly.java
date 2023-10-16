package lab8;

public class XPoly {
    // Bài 1: Tính tổng params truyền vào
    public static final double sum(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Bài 2: Tìm min, max
    public static final double min(double... numbers) {
        double min = numbers[0];
        for (double number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static final double max(double... numbers) {
        double max = numbers[0];
        for (double number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    // Bài 3: chuyển đổi các ký tự đầu tiên của mỗi từ sang ký tự hoa
    public static String toUpperFirstChar(String text) {
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                char firstChar = words[i].charAt(0);
                words[i] = Character.toUpperCase(firstChar) + words[i].substring(1);
            }
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        double result = XPoly.sum(5, 4, 2, 1);
        System.out.println("Tổng các số là: " + result);

        double minValue = XPoly.min(5, 4, 2, 1);
        System.out.println("Số nhỏ nhất là: " + minValue);

        double maxValue = XPoly.max(5, 4, 2, 1);
        System.out.println("Số lớn nhất là: " + maxValue);

        String input = "nguyen van teo";
        String textUpperFirstChar = XPoly.toUpperFirstChar(input);
        System.out.println("Kết quả: " + textUpperFirstChar);
    }
}
