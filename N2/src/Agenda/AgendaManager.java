package Agenda;

import Agenda.EntriesFactory.AgendaEntryFactory;
import Agenda.EntriesFactory.FactoryProducer;

public class AgendaManager {

    private static Agenda MY_AGENDA;

    public static final AgendaEntryFactory MY_ADDRESS_FACTORY = FactoryProducer.getFactory(Agenda.EntryType.ADDRESS);
    public static final AgendaEntryFactory MY_NUMBER_FACTORY = FactoryProducer.getFactory(Agenda.EntryType.PHONE_NUMBER);

    public static void start() {
        MY_AGENDA = new Agenda();
    }
}
