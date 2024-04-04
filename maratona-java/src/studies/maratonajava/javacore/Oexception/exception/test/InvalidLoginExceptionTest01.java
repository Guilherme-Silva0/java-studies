package studies.maratonajava.javacore.Oexception.exception.test;

import studies.maratonajava.javacore.Oexception.exception.model.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (InvalidLoginException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void login() throws InvalidLoginException {
        Scanner input = new Scanner(System.in);

        String userNameDB = "Joe";
        String userPassDB = "1234";

        System.out.print("User name: ");
        String userName = input.nextLine();
        System.out.print("Passoword: ");
        String userPass = input.nextLine();

        if (!userName.equals(userNameDB) || !userPass.equals(userPassDB)) {
            throw new InvalidLoginException();
        }

        System.out.println("Logged!");
    }
}
