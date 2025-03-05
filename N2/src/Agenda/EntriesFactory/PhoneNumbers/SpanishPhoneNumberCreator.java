package Agenda.EntriesFactory.PhoneNumbers;

import Agenda.Agenda;
import Agenda.AgendaEntry;
import Agenda.AgendaManager;

public class SpanishPhoneNumberCreator {

    public static AgendaEntry createPhoneNumber(String personeName,
                                                String number) {
        SpanishPhoneNumber newNumber = (SpanishPhoneNumber) AgendaManager.MY_NUMBER_FACTORY.getAgendaEntry(Agenda.Country.SPAIN);
        newNumber.setPersoneName(personeName);
        newNumber.setNumber(number);
        return newNumber;
    }
}
