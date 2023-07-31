public class BmiService {
    public int calculate(int kg, double metre) {

        int index  = (int) (kg / (metre * metre));


        return index;
    }


}
