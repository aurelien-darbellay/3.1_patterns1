package Agenda.EntriesFactory;

import Agenda.Agenda;

public class FactoryProducer {
    public static AgendaEntryFactory getFactory(Agenda.EntryType entryType) {
        return switch (entryType) {
            case ADDRESS -> new AddressFactory();
            case PHONE_NUMBER -> new PhoneNumberFactory();
        };
    }
}
