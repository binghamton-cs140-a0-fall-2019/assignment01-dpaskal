package assignment01;
/**
 * SORRY: I did not have time for the javadocs
 * @author CS 140
 *
 */
public class StreetUSAddress {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String stateAbbreviation;
    private String zipCode;
  
    public StreetUSAddress(String address1, String address2, String cty, 
                           String state, String zip) {
        //DONE use the parameters to set the values of 
        //the fields above
        addressLine1 = address1;
        addressLine2 = address2;
        city = cty;
        stateAbbreviation = state;
        zipCode = zip;
    }
    /**
     * 
     * @return
     */
    public String getAddressLine1() {
        // DONE return the appropriate String
    return addressLine1;
    }
    /**
     * 
     * @return
     */
    public String getAddressLine2() {
        // DONE return the appropriate String
    return this.addressLine2;
    }
    /**
     * 
     * @return
     */
    public String getCity() {
        // DONE return the appropriate String
    return this.city;
    }
    /**
     * 
     * @return
     */
    public String getStateAbbreviation() {
        // DONE return the appropriate String
    return this.stateAbbreviation;
    }
    /**
     * 
     * @return
     */	
    public String getZipCode() {
        // DONE return the appropriate String
    return this.zipCode;
    }
    @Override
    public String toString() {
        if(addressLine2.trim().length() > 0) {
            return String.format("%s\n%s\n%s, %s %s", addressLine1, 
                    addressLine2, city, stateAbbreviation, zipCode);
        } else {
            return String.format("%s\n%s, %s %s", addressLine1, 
                    city, stateAbbreviation, zipCode);
        }
    }
}
