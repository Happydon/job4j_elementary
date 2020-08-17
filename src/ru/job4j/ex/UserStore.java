package ru.job4j.ex;

import static java.lang.String.valueOf;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (int i = 0; i < users.length; i++) {
            if ((users[i].getUsername()).equals(login)) {
                rsl = users[i];
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("There is no such user");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if ((valueOf(user.getUsername()).length() < 3) || (!user.isValid())) {
            throw new UserInvalidException("User Is Invalid");
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Petr Arsentev", true)
                };
            User user = findUser(users, "Petr Arsentev");
                if (validate(user)) {
                    System.out.println("This user has an access");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}