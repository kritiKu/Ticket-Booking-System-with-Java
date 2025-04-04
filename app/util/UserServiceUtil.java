package ticket.booking.util;

import org.mindrot.jbcrypt.BCrypt;

public class UserServiceUtil {
    public static String hashPassward(String plainPassward){
        return BCrypt.hashpw(plainPassward, BCrypt.gensalt());
    }

    public static boolean checkPassward(String plainPassward, String hashedPassward){
        return BCrypt.checkpw(plainPassward, hashedPassward);
    }
}
