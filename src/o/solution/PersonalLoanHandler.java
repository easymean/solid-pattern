package o.solution;

public class PersonalLoanHandler implements LoanHandler{

    Validator validator;
    public PersonalLoanHandler(Validator validator){
        this.validator = validator;
    }
    @Override
    public void approveLoan(User user) {
        if(validator.isValid(user)){
            // process logic
        }
    }
}
