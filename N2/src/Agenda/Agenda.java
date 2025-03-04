package Agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    public enum EntryType {
        ADDRESS,
        PHONE_NUMBER
    }

    public enum Country {
        FRANCE,
        SPAIN
    }

    private List<AgendaEntry> entries = new ArrayList<>();

    public List<AgendaEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<AgendaEntry> entries) {
        this.entries = entries;
    }

    public void addEntry(AgendaEntry entry) {
        entries.add(entry);
    }

    public void removeEntry(AgendaEntry entry) {
        entries.remove(entry);
    }
}
