package Stepik_tasks;

import java.text.DecimalFormat;
import java.util.*;


public class continuousBag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countThings = scanner.nextInt();
        double volumeThings = scanner.nextInt();
        List<Bag> bagList = new ArrayList<>();
        for (int i = 0; i < countThings; i++) {
            Bag bag = new Bag();
            bag.setPriceThing(scanner.nextInt());
            bag.setVolumeThing(scanner.nextInt());
            bag.setPrice_volume(bag.getPriceThing() / bag.getVolumeThing());
            bagList.add(bag);
        }
        bagList.sort(new Comparator<Bag>() {
            @Override
            public int compare(Bag o1, Bag o2) {
                return Double.compare(o2.getPrice_volume(), o1.getPrice_volume());
            }
        });

        double result = 0;

        for (Bag bag2 : bagList) {
            if (volumeThings == 0) {
                break;
            }
            if (bag2.getVolumeThing() <= volumeThings) {
                result += bag2.getVolumeThing() * bag2.getPrice_volume();

                volumeThings = volumeThings - bag2.getVolumeThing();
            } else {
                result += volumeThings * bag2.getPrice_volume();
                volumeThings = 0;
            }
        }
        String result2 = String.format("%.3f", result);
        System.out.println(result2);
    }
}


class Bag {
    private double priceThing;
    private double volumeThing;
    private double price_volume;

    public double getPrice_volume() {
        return price_volume;
    }

    public void setPrice_volume(double price_volume) {
        this.price_volume = price_volume;
    }

    public double getPriceThing() {
        return priceThing;
    }

    public void setPriceThing(double priceThing) {
        this.priceThing = priceThing;
    }

    public double getVolumeThing() {
        return volumeThing;
    }

    public void setVolumeThing(double volumeThing) {
        this.volumeThing = volumeThing;
    }
}