package Agenda.EntriesFactory.PhoneNumbers;

import Agenda.AgendaEntry;

import java.util.InputMismatchException;

public abstract class PhoneNumber implements AgendaEntry {
    private String personeName;
    private String countryName;
    private String countryCode;
    private String number;

    public String getPersoneName() {
        return personeName;
    }

    public void setPersoneName(String personeName) {
        this.personeName = personeName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        if (countryCode.length() == 3) this.countryCode = countryCode;
        else {
            throw new InputMismatchException("Incorrect country code format");
        }

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getInternationalNumber() {
        return getCountryCode() + number;
    }
}
