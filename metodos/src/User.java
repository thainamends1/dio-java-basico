public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Inital volume: " + smartTv.volume);
        smartTv.turnDownVolume();
        smartTv.turnDownVolume();
        smartTv.turnDownVolume();
        smartTv.turnUpVolume();
        System.out.println("Current volume: " + smartTv.volume);
        System.out.println();

        System.out.println("Current channel: " + smartTv.channel);
        smartTv.changeChannel(13);
        System.out.println("Current channel after change: " + smartTv.channel);
        System.out.println();

        System.out.println("TV On? " + smartTv.on);
        System.out.println("Current channel: " + smartTv.channel);
        System.out.println("Current volume: " + smartTv.volume);

        smartTv.turnOn();
        System.out.println("New status -> TV turn on? " + smartTv.on);

        smartTv.turnOff();
        System.out.println("New status -> TV turn off? " + smartTv.on);
        System.out.println("\nEND");
    }
}
