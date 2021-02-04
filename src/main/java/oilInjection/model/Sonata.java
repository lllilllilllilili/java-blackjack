package oilInjection.model;

public class Sonata extends Car {
    public Sonata(Distance tripDistance) {
        this.tripDistance = tripDistance;
        this.distancePerLiter = 10;
        this.name = "Sonata";
    }

    @Override
    double getDistancePerLiter() {
        return this.distancePerLiter;
    }

    @Override
    Distance getTripDistance() {
        return this.tripDistance;
    }

    @Override
    String getName() {
        return this.name;
    }

    @Override
    void registerTripDistance(Distance tripDistance) {
        this.tripDistance = tripDistance;
    }

    public static Sonata of(final double distance) {
        return new Sonata(new Distance(distance));
    }
}
