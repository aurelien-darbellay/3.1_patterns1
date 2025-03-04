package Agenda.EntriesFactory;

import Agenda.Agenda;
import Agenda.AgendaEntry;

public abstract class AgendaEntryFactory {
    abstract public AgendaEntry getAgendaEntry(Agenda.Country country);
}
