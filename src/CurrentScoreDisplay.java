public class CurrentScoreDisplay implements Observer {
    private int runs, wickets;
    private float overs;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        this.display();
    }

    private void display() {
        System.out.println("\nCurent Score Display: \n"
                + "Runs: " + runs +
                "\nWickets: : " + wickets +
                "\nOvers: " + overs);
    }
}
