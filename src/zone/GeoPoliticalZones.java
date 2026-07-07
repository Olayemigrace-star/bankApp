package zone;

public class GeoPoliticalZones {

    public Zones getStateName(String state){

        switch(state.trim().toLowerCase()) {
            case "benue", "f.c.t",  "kogi", "kwara", "nasarawa", "niger", "plateau":
                return Zones.NORTH_CENTRAL;

            case "adamawa", "bauchi", "borno", "gombe", "taraba", "yobe":
                return Zones.NORTH_EAST;

            case "jigawa", "kaduna", "kano", "katsina", "kebbi", "sokoto", "zamfara":
                return Zones.NORTH_WEST;

            case "abia", "anambra", "ebonyi", "enugu", "imo":
                return Zones.SOUTH_EAST;

            case "akwa ibom", "bayelsa", "cross river", "delta", "edo", "rivers":
                return Zones.SOUTH_SOUTH;

            case "ekiti", "lagos", "ogun", "ondo", "osun", "oyo":
                return Zones.SOUTH_WEST;

            default:
                return Zones.UNKNOWN;
        }
    }
}
