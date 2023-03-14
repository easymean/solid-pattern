package o.problem;

public class LoanHandler {
    private PersonalLoanValidator personalLoanValidator;
    private MortgageLoanValidator mortgageLoanValidator;

    public void approvePersonalLoad(User user){
        if(personalLoanValidator.isValidUserForPersonalLoan(user)){

        }
    }

    public void approveMortgage(User user){
        if(mortgageLoanValidator.isValidUserForMortgage(user)){

        }
    }
}
