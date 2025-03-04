package Agenda.EntriesFactory.PhoneNumbers;

import java.util.InputMismatchException;

public class SpanishPhoneNumber extends PhoneNumber {
    {
        setCountryCode("+34");
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
