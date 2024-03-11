package Core;

public class InputValidator {
    private static final int REQUIRED_FIELDS = 6;

    public void validateInput(String input) throws InvalidInputException {
        String[] inputData = input.split(" ");

        if (inputData.length != REQUIRED_FIELDS) {
            throw new InvalidInputException(
                    "Неверный ввод: должно содержать ровно " + REQUIRED_FIELDS + " полей, разделенных пробелами");
        }

        String lastName = inputData[0];
        String firstName = inputData[1];
        String middleName = inputData[2];
        String birthDate = inputData[3];
        String phoneNumber = inputData[4];
        String gender = inputData[5];

        if (!phoneNumber.matches("\\d+")) {
            throw new InvalidInputException("Неверный формат номера телефона. Номер должен содержать только цифры");
        }
        if (!gender.matches("[fm]")) {
            throw new InvalidInputException("Неверный формат пола. Пол должен быть указан как символ 'f' или 'm'");
        }
    }

    public class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }

}
