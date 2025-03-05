package Agenda.EntriesFactory.PhoneNumbers;

import Agenda.Agenda;
import Agenda.AgendaEntry;
import Agenda.AgendaManager;

public class FrenchPhoneNumberCreator {

    public static AgendaEntry createPhoneNumber(String personeName,
                                            String number) {
        FrenchPhoneNumber newNumber = (FrenchPhoneNumber) AgendaManager.MY_NUMBER_FACTORY.getAgendaEntry(Agenda.Country.FRANCE);
        newNumber.setPersoneName(personeName);
        newNumber.setNumber(number);
        return newNumber;
    }
}
