package Agenda.EntriesFactory.PhoneNumbers;

import java.util.InputMismatchException;

public class FrenchPhoneNumber extends PhoneNumber {
    {
        setCountryCode("+33");
        setCountryName("");
    }

    @Override
    public String getNumber() {
        return "0" + super.getNumber();
    }

    @Override
    public void setNumber(String number) {
        if (number.length() == 9) super.setNumber(number);
        else {
            throw new InputMismatchException("Incorrect number format");
        }

    }

    @Override
    public String getCountry() {
        return super.getCountryName();
    }
}
