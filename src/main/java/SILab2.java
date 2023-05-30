import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public static boolean function (User user, List<User> allUsers) {
        if (user==null || user.getPassword()==null || user.getEmail()==null){ //a
            throw new RuntimeException("Mandatory information missing!"); //b
        }

        if (user.getUsername()==null){ //c
            user.setUsername(user.getEmail()); //d
        }

        int same = 1; 
        if (user.getEmail().contains("@") && user.getEmail().contains(".")) { //e
            same = 0; //f
            for (int i=0  ;i<allUsers.size() ; i++ ) { //g.1,2,3
                User existingUser = allUsers.get(i); //h
                if (existingUser.getEmail() == user.getEmail()) { //h
                    same += 1; //i
                }
                if (existingUser.getUsername() == user.getUsername()) { //j
                    same += 1; //k
                }
            } //l
        }

        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}"; 
        String password = user.getPassword(); 
        String passwordLower = password.toLowerCase(); 

        if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length()<8) { //m
            return false; //n
        }
        else {
            if (!passwordLower.contains(" ")) { //o
                for (int i = 0; i < specialCharacters.length(); i++) { //p.1,2,3
                    if (password.contains(String.valueOf(specialCharacters.charAt(i)))) { //q
                        return same == 0; //r
                    }
                } //s
            }
        }
        return false; //t
    }
    //u
}
