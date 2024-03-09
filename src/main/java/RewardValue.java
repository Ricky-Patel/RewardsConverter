public class RewardValue {

    double userCash;
    double userMiles;

    //cash constructor
    public RewardValue(double cashValue) {
        userCash = cashValue;
    }

    public RewardValue(float milesValue) {
        userMiles = milesValue;
    }

    //returns the cash value of the reward value
    public double getCashValue() {
        return userCash;
    }

    //returns how many miles the reward value is worth
    public double getMilesValue() {
        userMiles = userCash * 0.0035;
        return userMiles;
    }
}
