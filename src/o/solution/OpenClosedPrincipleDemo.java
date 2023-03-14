package o.solution;

public class OpenClosedPrincipleDemo {
    public static void main(String[] args){

        User user = new User();

        // 인터페이스를 사용하여 확장한다.
        LoanHandler loanHandler = new PersonalLoanHandler(new PersonalLoanValidator());
        loanHandler.approveLoan(user);

        LoanHandler loanHandler1 = new MortgageLoanHandler(new MortgageLoanValidator());
        loanHandler1.approveLoan(user);

    }
}
