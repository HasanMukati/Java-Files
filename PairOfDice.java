public class PairOfDice {

    private Die dieOne;
    private Die dieTwo;

    public PairOfDice() {
        dieOne = new Die(6);
        dieTwo = new Die(6);

    }

    public void rollBothDice() {
        dieOne.roll();
        dieTwo.roll();
    }

    public Die getDieOne() {
        return dieOne;
    }

    public void setDieOne(Die dieOne) {
        this.dieOne = dieOne;
    }

    public Die getDieTwo() {
        return dieTwo;
    }

    public void setDieTwo(Die dieTwo) {
        this.dieTwo = dieTwo;
    }

    public int currentSum(){
        return dieTwo.getValue()+dieOne.getValue();
    }

}