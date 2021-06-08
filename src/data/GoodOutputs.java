package data;

import java.util.ArrayList;
import java.util.Arrays;

public class GoodOutputs {

    private static GoodOutputs instance;

    private ArrayList<ArrayList<Double>> goodValues;

    public static GoodOutputs getInstance() {
        if (instance == null)
            instance = new GoodOutputs();

        return instance;
    }

    public GoodOutputs() {
        this.goodValues = new ArrayList<>();
        addGoodOutputs();
    }

    private void addGoodOutputs() {
        // 0
        goodValues.add(new ArrayList<>(Arrays.asList(1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)));

        // 1
        goodValues.add(new ArrayList<>(Arrays.asList(0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)));

        // 2
        goodValues.add(new ArrayList<>(Arrays.asList(0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)));

        // 3
        goodValues.add(new ArrayList<>(Arrays.asList(0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)));

        // 4
        goodValues.add(new ArrayList<>(Arrays.asList(0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0)));

        // 5
        goodValues.add(new ArrayList<>(Arrays.asList(0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0)));

        // 6
        goodValues.add(new ArrayList<>(Arrays.asList(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0)));

        // 7
        goodValues.add(new ArrayList<>(Arrays.asList(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0)));

        // 8
        goodValues.add(new ArrayList<>(Arrays.asList(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0)));

        // 9
        goodValues.add(new ArrayList<>(Arrays.asList(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0)));
    }

    public ArrayList<Double> getGoodOutput(String letter) {
        char charLetter = letter.charAt(0);
        int index = ((int) charLetter) - 48;
        if (index > 9 || index < 0) {
            index = 0;
        }
        return goodValues.get(index);
    }

}
