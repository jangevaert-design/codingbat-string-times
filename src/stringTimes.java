public class stringTimes {
  public String stringTimes(String str, int n) {
    String outcome = "";
    for (int i = 0; i < n; i++) {
      outcome = outcome += str;
    }
    return outcome;
  }

}
