import java.io.File;
import java.util.Scanner;

import Core.FileHandler;
import Core.InputValidator;
import Core.InputValidator.InvalidInputException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные, разделенные пробелами (Фамилия Имя Отчество Дата рождения Телефон Пол):");
        String input = scanner.nextLine();

        InputValidator validator = new InputValidator();
        try {
            validator.validateInput(input);

            String[] inputData = input.split(" ");
            String filename = inputData[0] + ".txt";
            String outputData = String.join(" ", inputData);

            File file = new File("C:\\Users\\ALFA\\Desktop\\GeekBrains\\GB_JAVA_EXCEPTION\\txt\\");

            FileHandler fileHandler = new FileHandler();
            fileHandler.writeToOutputFile(file, outputData);

            System.out.println("Данные были записаны в файл " + filename);
        } catch (InvalidInputException e) {
            System.out.println("Неверный ввод: " + e.getMessage());
        }
    }
}
