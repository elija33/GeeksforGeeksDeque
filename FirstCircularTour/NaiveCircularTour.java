package FirstCircularTour;

public class NaiveCircularTour {
    public static int CircularTour(int number[], int dirt[]) {
        for (int start = 0; start < number.length - 1; start++) {
            int curr = 0;
            int end = start;
            while (true) {
                curr += (number[end] - dirt[end]);
                if (curr < 0) {
                    break;
                }
                end = (end + 1) % number.length;
                if (end == start) {
                    return (start + 1);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
