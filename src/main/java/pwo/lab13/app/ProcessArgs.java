package pwo.lab13.app;

import java.util.List;
import java.util.ArrayList;
import pwo.lab13.app.ProcessData.Action;

public class ProcessArgs {

    public static Action getAction(String[] args) {

        for (String str : args) {
            try {
                Action actionType = Action.valueOf(str.toUpperCase());
                return actionType;
            } catch (Exception e) {
            }
        }

        return Action.UNDEFINE;
    }

    public static double[] getNumbers(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();

        for (String str : args) {
            try {
                numbers.add(Double.parseDouble(str));
            } catch (Exception e) {
            }
        }
        double[] arrNumbers = new double[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            arrNumbers[i] = numbers.get(i).doubleValue();
        }
        return arrNumbers;
    }
}