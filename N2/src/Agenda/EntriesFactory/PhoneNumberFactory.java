package Agenda.EntriesFactory;

import Agenda.Agenda;
import Agenda.AgendaEntry;
import Agenda.EntriesFactory.PhoneNumbers.FrenchPhoneNumber;
import Agenda.EntriesFactory.PhoneNumbers.SpanishPhoneNumber;

public class PhoneNumberFactory extends AgendaEntryFactory {
    @Override
    public AgendaEntry getAgendaEntry(Agenda.Country country) {
        return switch (country) {
            case SPAIN -> new SpanishPhoneNumber();
            case FRANCE -> new FrenchPhoneNumber();
        };
    }
}
