package day05;

import lombok.Data;
@Data
public class MemberDTO {
    private String id;
    private String name;
    private String password;
    private String email;
    private String joinDate;

    @Override
    public String toString() {
        return "MemberDTO [id = " + id + ", name = " + name + ", password = " + password + ", email = " + email + ", joinDate = " + joinDate + "]";
    }
}
