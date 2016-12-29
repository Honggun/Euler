import askView.AskNumber;

/**
 * Created by seonghohong on 2016. 12. 29..
 */
public class SolveOrder {


    private AskNumber askInputNumber;
    private AskNumber askMultipleNumber;

    private Multiple multiple;
    private DeleteSameMultiple deleteSameMultiple;
    private SumNumber sumNumber;

    public void solve(){
        int inputNumber = askInputNumber.getNumber();
        int multipleNumber = askMultipleNumber.getNumber();

        multiple.getMultiple();

        deleteSameMultiple.deleteSameNumber();

        sumNumber.getresult();
    }
}
