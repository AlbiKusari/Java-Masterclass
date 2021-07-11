public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static String getDurationString(long minutes , long seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) return INVALID_VALUE_MESSAGE; // return "Invalid Value";

        System.out.println(minutes/60 +"h " +minutes%60 + "m " +seconds + "s");

        long hours = minutes/60;
        minutes = minutes%60;

        String result = "";

        if (hours < 10)
            result += "0" +hours + "h ";
        else result += hours + "h ";

        if (minutes < 10)
            result += "0" +minutes + "m ";
        else result += "" +minutes + "m ";

        if (seconds < 10)
            result += "0" +seconds + "s";
        else result += "" +seconds + "s";

        return result;

//        return minutes/60 +"h " +minutes%60 + "m " +seconds + "s";

    }

    public static String getDurationString(long seconds) {

        if (seconds < 0) return INVALID_VALUE_MESSAGE; // return "Invalid Value";

        long minutes = seconds/60;
        seconds = seconds % 60;

       return getDurationString(minutes , seconds);

    }

}
