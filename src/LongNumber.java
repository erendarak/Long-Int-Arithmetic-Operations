public class LongNumber {

    /**
     * Our long number which we take from the user as a String.
     */
    private String stringData;

    /**
     * This constructor takes the data as a string.
     * @param stringData given string
     */
    public LongNumber(String stringData) {
        this.stringData = stringData;
    }

    /**
     * This will allow us to reach our user's long int from operations class.
     * @return data of the string
     */
    public String getStringData() {
        return stringData;
    }

}