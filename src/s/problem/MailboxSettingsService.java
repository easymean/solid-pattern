package s.problem;

public class MailboxSettingsService {

    public void changeSecondaryEmail(User user, String newSecondaryEmail){
        if(hasAccess(user)){
            user.setSecondaryEmail(newSecondaryEmail);
        }
    }

    // 차후에 메일 서비스에서 접근 권한 확인이 빠질 수 있다.
    // 혹은 role이 아닌 폰번호로 확인할 수도
    // anyway 이 함수는 변경될 여지가 조금이라도 있다.
    public boolean hasAccess(User user){
        if(user.getRole() == Role.ADMIN){
            return true;
        }else
            return false;
    }
}
