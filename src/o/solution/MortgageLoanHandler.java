package o.solution;

public class MortgageLoanHandler implements LoanHandler{

    Validator validator;

    public MortgageLoanHandler(Validator validator){
        this.validator = validator;
    }

    @Override
    public void approveLoan(User user) {
        if(validator.isValid(user)){
            // process
        }
    }
}
