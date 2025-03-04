package Agenda.EntriesFactory;

import Agenda.Agenda;
import Agenda.AgendaEntry;
import Agenda.EntriesFactory.Adresses.FrenchAddress;
import Agenda.EntriesFactory.Adresses.SpanishAddress;

public class AddressFactory extends AgendaEntryFactory {
    @Override
    public AgendaEntry getAgendaEntry(Agenda.Country country) {
        return switch (country) {
            case SPAIN -> new SpanishAddress();
            case FRANCE -> new FrenchAddress();
        };
    }
}
