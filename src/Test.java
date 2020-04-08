import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice(5,3,6);
        String[] pacageList = new String[]{"телефон, зарядка, коробка"};
        Random random = new Random(20);
        double number = random.nextDouble();
        PostOffice.volumeWeight(postOffice.getParcelWeight(), postOffice.getParcelHeight(), postOffice.getParcelWidth());
        double resoult = postOffice.volumeWeight();
        System.out.println("Обьёмный вес " + resoult);
    }

}
