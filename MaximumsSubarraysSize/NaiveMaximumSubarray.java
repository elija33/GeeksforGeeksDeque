package MaximumsSubarraysSize;

public class NaiveMaximumSubarray {
    public void printMax(int number[], int k) {
        for (int i = 0; i < number.length - k + 1; i++) {
            int maxs = number[i];

            for (int j = i + 1; j < i + k; j++) {
                maxs = max(number[j], maxs);
            }
        }
    }

    public static void main(String[] args) {

    }
}
