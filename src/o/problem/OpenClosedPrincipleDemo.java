package o.problem;

public class OpenClosedPrincipleDemo {
    public static void main(String[] args){
        LoanHandler loanHandler= new LoanHandler();
        User user = new User();

        loanHandler.approvePersonalLoad(user);
        loanHandler.approveMortgage(user);
    }
}
