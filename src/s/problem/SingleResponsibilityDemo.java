package s.problem;

public class SingleResponsibilityDemo {
    public static void main(String[] args){
        MailboxSettingsService settingsService = new MailboxSettingsService();
        User user = new User();

        // responsibility #1: change settings in mailbox
        settingsService.changeSecondaryEmail(user, "abcd@email.com");

        // responsibility #2: verify access
        if(settingsService.hasAccess(user)){
            user.sendMoney(new User(), 100);
        }
    }
}
