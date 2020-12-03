package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        for (String users : records) {
            String[] userData = users.split(":");
            if (userData.length == 2 && userData[0].equals(email)) {
                return Integer.parseInt(userData[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
